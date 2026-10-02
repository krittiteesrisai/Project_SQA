package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BooleanDeserializer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.DoubleDeser;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ByteDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.TimestampDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.ObjectInputStream;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ShortDeser;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.NumberDeserializer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import java.io.IOException;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.IntegerDeserializer;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.CharDeser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.CharacterDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.BeanProperty.Bogus;
import com.fasterxml.jackson.databind.BeanProperty;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.node.NullNode;
import java.util.concurrent.atomic.AtomicReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.node.FloatNode;
import java.math.BigInteger;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.NodeDeserializer;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_std_StdDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#parseDouble(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.Double#parseDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.parseDouble(numStr);
 *  */
    @Test
    public void testParseDouble_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(StdDeserializer.java:540) */
        StdDeserializer.parseDouble(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseDouble(java.lang.String)
    
    @Test
    public void testParseDouble1() {
        String string = "2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        double actual = StdDeserializer.parseDouble(string);
        
        assertEquals(2.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseDouble(java.lang.String)
    
    @Test
    public void testParseDouble2() {
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble] produces [java.lang.NumberFormatException: For input string: "!                  !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(StdDeserializer.java:540) */
        StdDeserializer.parseDouble(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseBytePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseBytePrimitive1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        byte actual = jsonNodeDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
        
        org.junit.Assert.assertEquals((byte) 0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseBytePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseBytePrimitive2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        throwableDeserializer._parseBytePrimitive(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_parseBytePrimitive3() throws Exception  {
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        floatDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive4() throws Exception  {
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 131072);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:839)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:237)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        floatDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive5() throws Exception  {
        UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        uUIDDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:249)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        mapDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive7() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        booleanDeserializer._parseBytePrimitive(jsonParserSequence, null);
    }
    
    @Test
    public void test_parseBytePrimitive8() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        doubleDeser._parseBytePrimitive(filteringParserDelegate, null);
    }
    
    @Test
    public void test_parseBytePrimitive9() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        booleanDeserializer._parseBytePrimitive(jsonParserSequence, null);
    }
    
    @Test
    public void test_parseBytePrimitive10() throws Exception  {
        NumberDeserializers.ByteDeserializer byteDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        byteDeserializer._parseBytePrimitive(jsonParserSequence, impl);
    }
    
    @Test
    public void test_parseBytePrimitive11() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        doubleDeser._parseBytePrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive12() throws Exception  {
        NumberDeserializers.ByteDeserializer byteDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        byteDeserializer._parseBytePrimitive(jsonParserSequence, impl);
    }
    
    @Test
    public void test_parseBytePrimitive13() throws Exception  {
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = new DateDeserializers.SqlDateDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        sqlDateDeserializer._parseBytePrimitive(jsonParserDelegate1, null);
    }
    
    @Test
    public void test_parseBytePrimitive14() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        doubleDeser._parseBytePrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseBytePrimitive15() throws Exception  {
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = new DateDeserializers.SqlDateDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBytePrimitive(StdDeserializer.java:206) */
        sqlDateDeserializer._parseBytePrimitive(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseBytePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseBytePrimitive16() throws Exception  {
        DateDeserializers.TimestampDeserializer timestampDeserializer = new DateDeserializers.TimestampDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        timestampDeserializer._parseBytePrimitive(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyEndArrayForSingle(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyEndArrayForSingle(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.nextToken();
 *  */
    @Test
    public void test_verifyEndArrayForSingle_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        throwableDeserializer._verifyEndArrayForSingle(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyEndArrayForSingle(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_verifyEndArrayForSingle1() throws Exception  {
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipString(UTF8DataInputJsonParser.java:1959)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:576)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        floatDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle2() throws Exception  {
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        floatDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        mapDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle4() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        jsonNodeDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        throwableDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle6() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 10);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        longDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle7() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", -2147483647);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "this$0", _inputData);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(_inputData, "java.io.ObjectInputStream", "defaultDataEnd", true);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:483)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:497)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2242)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        vanilla._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle8() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1165)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        documentDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle9() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:730)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        stringCollectionDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle10() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        stringCollectionDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle11() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:732)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        vanilla._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle12() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:3084)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3170)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        vanilla._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle13() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        objectArrayDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle14() throws Exception  {
        PrimitiveArrayDeserializers.ShortDeser shortDeser = new PrimitiveArrayDeserializers.ShortDeser();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$PeekInputStream.read(ObjectInputStream.java:2897)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3246)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        shortDeser._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle15() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 93);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2837)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:590)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        jsonNodeDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle16() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 125);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._closeScope(UTF8DataInputJsonParser.java:2844)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:590)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        jsonNodeDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle17() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 134217728);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        throwableDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle18() throws Exception  {
        StringArrayDeserializer stringArrayDeserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups", _dups);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        stringArrayDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle19() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        objectArrayDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle20() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 65536);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3244)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        vanilla._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle21() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        objectDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test
    public void test_verifyEndArrayForSingle22() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectInputStream _inputData = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "unread", 1);
        setField(_inputData, "java.io.ObjectInputStream", "bin", bin);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 13);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:3161)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.read(ObjectInputStream.java:3242)
            java.base/java.io.ObjectInputStream$BlockDataInputStream.readUnsignedByte(ObjectInputStream.java:3399)
            java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1174) */
        numberDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, impl);
    }
    
    @Test
    public void test_verifyEndArrayForSingle23() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        JsonReadContext _child = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child", _child);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _nextToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1167)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyEndArrayForSingle(StdDeserializer.java:1176) */
        objectDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyEndArrayForSingle(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonParseException.class)
    public void test_verifyEndArrayForSingle24() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 47);
        
        mapDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_verifyEndArrayForSingle25() throws Exception  {
        DateDeserializers.CalendarDeserializer calendarDeserializer = new DateDeserializers.CalendarDeserializer();
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 33);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        calendarDeserializer._verifyEndArrayForSingle(uTF8DataInputJsonParser, null);
    }
    ///endregion
    
    ///region Errors report for _verifyEndArrayForSingle
    
    public void test_verifyEndArrayForSingle_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 *  */
    @Test
    public void test_verifyNumberForScalarCoercion_DeserializationContextIsEnabled() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stdDelegatingDeserializer._verifyNumberForScalarCoercion(impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(feat)
 *  */
    @Test
    public void test_verifyNumberForScalarCoercion_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:854) */
        throwableDeserializer._verifyNumberForScalarCoercion(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String valueDesc = p.getText();
 *  */
    @Test
    public void test_verifyNumberForScalarCoercion_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._verifyNumberForScalarCoercion(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String valueDesc = p.getText();
 *  */
    @Test
    public void test_verifyNumberForScalarCoercion_ThrowNullPointerException_2() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1857)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        failingDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void test_verifyNumberForScalarCoercion1() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:859) */
        longDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:859) */
        mapDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion3() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:859) */
        objectDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion4() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 32);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:403)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        objectDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion5() throws Exception  {
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 2097152);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:392)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        floatDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion6() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        char[] _resultArray = new char[12];
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:298)
            com.fasterxml.jackson.core.util.TextBuffer.emptyAndGetCurrentSegment(TextBuffer.java:673)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1857)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        longDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion7() throws Exception  {
        PrimitiveArrayDeserializers.ShortDeser shortDeser = new PrimitiveArrayDeserializers.ShortDeser();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1862)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        shortDeser._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion8() throws Exception  {
        PrimitiveArrayDeserializers.ShortDeser shortDeser = new PrimitiveArrayDeserializers.ShortDeser();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        char[] _resultArray = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1862)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        shortDeser._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test
    public void test_verifyNumberForScalarCoercion9() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNumberForScalarCoercion(StdDeserializer.java:857) */
        failingDeserializer._verifyNumberForScalarCoercion(impl, jsonParserDelegate2);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNumberForScalarCoercion10() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        stackTraceElementDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNumberForScalarCoercion11() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        numberDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNumberForScalarCoercion12() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        numberDeserializer._verifyNumberForScalarCoercion(impl, uTF8DataInputJsonParser);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.isDefaultKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultKeyDeserializer(com.fasterxml.jackson.databind.KeyDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#isDefaultKeyDeserializer(com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Object)}
 * @utbot.returnsFrom {@code return ClassUtil.isJacksonStdImpl(keyDeser);}
 *  */
    @Test
    public void testIsDefaultKeyDeserializer_ClassUtilIsJacksonStdImpl() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        boolean actual = throwableDeserializer.isDefaultKeyDeserializer(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseLongPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NUMBER_INT)
 *  */
    @Test
    public void test_parseLongPrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:292) */
        throwableDeserializer._parseLongPrimitive(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).longValue();
 *  */
    @Test
    public void test_parseLongPrimitive_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:320) */
        stdDelegatingDeserializer._parseLongPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_START_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void test_parseLongPrimitive_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._parseLongPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseLongPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseLongPrimitive1() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        long actual = stackTraceElementDeserializer._parseLongPrimitive(filteringParserDelegate, impl);
        
        org.junit.Assert.assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseLongPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseLongPrimitive2() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectDeserializer._parseLongPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseLongPrimitive3() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:898)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:714)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:305) */
        numberDeserializer._parseLongPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseLongPrimitive4() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:320) */
        stdDelegatingDeserializer._parseLongPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseLongPrimitive5() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:876)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:293) */
        objectDeserializer._parseLongPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseLongPrimitive6() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:876)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:293) */
        objectArrayDeserializer._parseLongPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseLongPrimitive7() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:320) */
        objectArrayDeserializer._parseLongPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseLong(text);}
 *  */
    @Test
    public void test_parseLongPrimitive_ReturnNumberInputParseLong() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "2";
        
        long actual = failingDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(2L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseLong(text);}
 *  */
    @Test
    public void test_parseLongPrimitive_ReturnNumberInputParseLong_1() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-2";
        
        long actual = failingDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(-2L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseLong(text);}
 *  */
    @Test
    public void test_parseLongPrimitive_ReturnNumberInputParseLong_2() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "22";
        
        long actual = failingDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(22L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseLong(text);}
 *  */
    @Test
    public void test_parseLongPrimitive_ReturnNumberInputParseLong_3() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "222";
        
        long actual = failingDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(222L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.NumberInput#parseLong(java.lang.String)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return NumberInput.parseLong(text);
 *  */
    @Test
    public void test_parseLongPrimitive_ThrowStringIndexOutOfBoundsException() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:68)
            com.fasterxml.jackson.core.io.NumberInput.parseLong(NumberInput.java:130)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:329) */
        failingDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseLongPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_parseLongPrimitive8() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-2:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive9() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive10() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive11() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive12() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive13() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-22\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive14() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "22:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive15() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = ":\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive16() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "22\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive17() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "2:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive18() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive19() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "+\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive20() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "222\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseLongPrimitive21() throws IOException  {
        StringDeserializer stringDeserializer = new StringDeserializer();
        String string = "-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseLongPrimitive(StdDeserializer.java:332) */
        stringDeserializer._parseLongPrimitive(((DeserializationContext) null), string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_verifyNullForPrimitiveCoercion_DeserializationContextIsEnabled() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        throwableDeserializer._verifyNullForPrimitiveCoercion(impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)
 *  */
    @Test
    public void test_verifyNullForPrimitiveCoercion_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:817) */
        throwableDeserializer._verifyNullForPrimitiveCoercion(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.isEmpty()
 *  */
    @Test
    public void test_verifyNullForPrimitiveCoercion_ThrowNullPointerException_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:826) */
        failingDeserializer._verifyNullForPrimitiveCoercion(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.isEmpty()
 *  */
    @Test
    public void test_verifyNullForPrimitiveCoercion_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 34);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._verifyNullForPrimitiveCoercion(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_verifyNullForPrimitiveCoercion1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:827) */
        mapDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForPrimitiveCoercion2() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:827) */
        objectArrayDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForPrimitiveCoercion3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:890)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:827) */
        throwableDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForPrimitiveCoercion4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:827) */
        mapDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForPrimitiveCoercion5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitiveCoercion(StdDeserializer.java:827) */
        mapDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyNullForPrimitiveCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForPrimitiveCoercion6() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        stackTraceElementDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForPrimitiveCoercion7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        mapDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForPrimitiveCoercion8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Class _valueClass = Object.class;
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        mapDeserializer._verifyNullForPrimitiveCoercion(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 *  */
    @Test
    public void test_verifyNullForPrimitive_DeserializationContextIsEnabled() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        stdDelegatingDeserializer._verifyNullForPrimitive(impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)
 *  */
    @Test
    public void test_verifyNullForPrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:803) */
        throwableDeserializer._verifyNullForPrimitive(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_verifyNullForPrimitive1() throws Exception  {
        NumberDeserializers.IntegerDeserializer integerDeserializer = ((NumberDeserializers.IntegerDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806) */
        integerDeserializer._verifyNullForPrimitive(impl);
    }
    
    @Test
    public void test_verifyNullForPrimitive2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806) */
        mapDeserializer._verifyNullForPrimitive(impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForPrimitive3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _containerType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._verifyNullForPrimitive(impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForPrimitive4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Class _valueClass = Object.class;
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._verifyNullForPrimitive(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findFormatOverrides(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findFormatOverrides(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class)}
 * @utbot.executesCondition {@code (prop != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getDefaultPropertyFormat(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.getDefaultPropertyFormat(typeForDefaults);
 *  */
    @Test
    public void testFindFormatOverrides_ThrowNullPointerException() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides(StdDeserializer.java:1005) */
        failingDeserializer.findFormatOverrides(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findFormatOverrides(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return prop.findPropertyFormat(ctxt.getConfig(), typeForDefaults);
 *  */
    @Test
    public void testFindFormatOverrides_ThrowNullPointerException_1() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        InnerClassProperty innerClassProperty = new InnerClassProperty(((SettableBeanProperty) null), ((Constructor) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides] produces [java.lang.NullPointerException] */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class innerClassPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class classType = Class.forName("java.lang.Class");
        Method findFormatOverridesMethod = stdDeserializerClazz.getDeclaredMethod("findFormatOverrides", deserializationContextType, innerClassPropertyType, classType);
        findFormatOverridesMethod.setAccessible(true);
        java.lang.Object[] findFormatOverridesMethodArguments = new java.lang.Object[3];
        findFormatOverridesMethodArguments[0] = ((Object) null);
        findFormatOverridesMethodArguments[1] = innerClassProperty;
        findFormatOverridesMethodArguments[2] = ((Object) null);
        try {
            findFormatOverridesMethod.invoke(throwableDeserializer, findFormatOverridesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findFormatOverrides(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class)
    
    @Test
    public void testFindFormatOverrides1() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonFormat.Value actual = untypedObjectDeserializer.findFormatOverrides(impl, null, null);
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testFindFormatOverrides2() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        Class class1 = Object.class;
        MutableConfigOverride mutableConfigOverride = ((MutableConfigOverride) createInstance("com.fasterxml.jackson.databind.cfg.MutableConfigOverride"));
        _overrides.put(class1, mutableConfigOverride);
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonFormat.Value actual = atomicReferenceDeserializer.findFormatOverrides(impl, null, class1);
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testFindFormatOverrides3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        Class class1 = Object.class;
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class class1Type = Class.forName("java.lang.Class");
        Method findFormatOverridesMethod = stdDeserializerClazz.getDeclaredMethod("findFormatOverrides", implType, valueInjectorType, class1Type);
        findFormatOverridesMethod.setAccessible(true);
        java.lang.Object[] findFormatOverridesMethodArguments = new java.lang.Object[3];
        findFormatOverridesMethodArguments[0] = impl;
        findFormatOverridesMethodArguments[1] = valueInjector;
        findFormatOverridesMethodArguments[2] = class1;
        JsonFormat.Value actual = ((JsonFormat.Value) findFormatOverridesMethod.invoke(mapDeserializer, findFormatOverridesMethodArguments));
        
        JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        String _pattern = "";
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
        JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
        JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
        setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
        
        // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testFindFormatOverrides4() throws Exception  {
        Class valueClazz = Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value");
        com.fasterxml.jackson.annotation.JsonInclude.Value prevEMPTY = ((com.fasterxml.jackson.annotation.JsonInclude.Value) getStaticFieldValue(valueClazz, "EMPTY"));
        try {
            com.fasterxml.jackson.annotation.JsonInclude.Value empty = ((com.fasterxml.jackson.annotation.JsonInclude.Value) createInstance("com.fasterxml.jackson.annotation.JsonInclude$Value"));
            JsonInclude.Include _valueInclusion = JsonInclude.Include.USE_DEFAULTS;
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_valueInclusion", _valueInclusion);
            setField(empty, "com.fasterxml.jackson.annotation.JsonInclude$Value", "_contentInclusion", _valueInclusion);
            setStaticField(valueClazz, "EMPTY", empty);
            DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            JsonFormat.Value actual = documentDeserializer.findFormatOverrides(impl, null, null);
            
            JsonFormat.Value expected = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String _pattern = "";
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_pattern", _pattern);
            JsonFormat.Shape _shape = JsonFormat.Shape.ANY;
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_shape", _shape);
            JsonFormat.Features _features = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setField(expected, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_features", _features);
            
            // com.fasterxml.jackson.annotation.JsonFormat.Value has overridden equals method
            org.junit.Assert.assertEquals(expected, actual);
            
            DeserializationConfig impl_config = ((DeserializationConfig) getFieldValue(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config"));
            ConfigOverrides impl_config_config_configOverrides = ((ConfigOverrides) getFieldValue(impl_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
            Map finalImpl_config_configOverrides_overrides = ((Map) getFieldValue(impl_config_config_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides"));
            
            assertNull(finalImpl_config_configOverrides_overrides);
        } finally {
            setStaticField(com.fasterxml.jackson.annotation.JsonInclude.Value.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findFormatOverrides(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class)
    
    @Test
    public void testFindFormatOverrides5() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.findPropertyFormat(ConcreteBeanPropertyBase.java:85)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatOverrides(StdDeserializer.java:1002) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class classType = Class.forName("java.lang.Class");
        Method findFormatOverridesMethod = stdDeserializerClazz.getDeclaredMethod("findFormatOverrides", implType, singleViewType, classType);
        findFormatOverridesMethod.setAccessible(true);
        java.lang.Object[] findFormatOverridesMethodArguments = new java.lang.Object[3];
        findFormatOverridesMethodArguments[0] = impl;
        findFormatOverridesMethodArguments[1] = singleView;
        findFormatOverridesMethodArguments[2] = ((Object) null);
        try {
            findFormatOverridesMethod.invoke(mapDeserializer, findFormatOverridesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeDeserializer#deserializeTypedFromAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromAny(p, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
        beanDeserializer.deserializeWithType(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test
    public void testDeserializeWithType1() throws Throwable  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:2056)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.access$100(TokenBuffer.java:1816)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1778)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:86)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:67)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType(StdDeserializer.java:136) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stdDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(failingDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType2() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:67)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType(StdDeserializer.java:136) */
        failingDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType3() throws Throwable  {
        DateDeserializers.DateDeserializer dateDeserializer = new DateDeserializers.DateDeserializer();
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 2;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stdDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(dateDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType4() throws Throwable  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
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
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:88)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromAny(AsWrapperTypeDeserializer.java:67)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.deserializeWithType(StdDeserializer.java:136) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stdDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(failingDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(timeout = 1000L)
    public void testDeserializeWithType5() throws Throwable  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = stdDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(failingDeserializer, deserializeWithTypeMethodArguments);
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
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 *  */
    @Test
    public void test_verifyNullForScalarCoercion_DeserializationContextIsEnabled() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        failingDeserializer._verifyNullForScalarCoercion(impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)
 *  */
    @Test
    public void test_verifyNullForScalarCoercion_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:834) */
        throwableDeserializer._verifyNullForScalarCoercion(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: str.isEmpty()
 *  */
    @Test
    public void test_verifyNullForScalarCoercion_ThrowNullPointerException_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:835) */
        failingDeserializer._verifyNullForScalarCoercion(impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_verifyNullForScalarCoercion1() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:836) */
        objectArrayDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForScalarCoercion2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:836) */
        mapDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForScalarCoercion3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:836) */
        mapDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    
    @Test
    public void test_verifyNullForScalarCoercion4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForScalarCoercion(StdDeserializer.java:836) */
        mapDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyNullForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForScalarCoercion5() throws Exception  {
        NioPathDeserializer nioPathDeserializer = new NioPathDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "\u0000";
        
        nioPathDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyNullForScalarCoercion6() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        stackTraceElementDeserializer._verifyNullForScalarCoercion(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeFromEmpty_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:583) */
        throwableDeserializer._deserializeFromEmpty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
 *  */
    @Test
    public void test_deserializeFromEmpty_ThrowNullPointerException_3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:585) */
        throwableDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_STRING): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
 *  */
    @Test
    public void test_deserializeFromEmpty_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._deserializeFromEmpty(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)
 *  */
    @Test
    public void test_deserializeFromEmpty_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._deserializeFromEmpty(jsonParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_STRING): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handledType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (T) ctxt.handleUnexpectedToken(handledType(), p);
 *  */
    @Test
    public void test_deserializeFromEmpty_ThrowNullPointerException_4() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        failingDeserializer._deserializeFromEmpty(jsonParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeFromEmpty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeFromEmpty1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        stdDelegatingDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeFromEmpty2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        stdDelegatingDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeFromEmpty3() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        numberDeserializer._deserializeFromEmpty(jsonParserDelegate, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeFromEmpty4() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        stdDelegatingDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeFromEmpty5() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        objectDeserializer._deserializeFromEmpty(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeFromEmpty6() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:586) */
        objectArrayDeserializer._deserializeFromEmpty(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeFromEmpty7() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        numberDeserializer._deserializeFromEmpty(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeFromEmpty8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        mapDeserializer._deserializeFromEmpty(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeFromEmpty9() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        longDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeFromEmpty10() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        stdDelegatingDeserializer._deserializeFromEmpty(jsonParserSequence, impl);
    }
    
    @Test
    public void test_deserializeFromEmpty11() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        stdDelegatingDeserializer._deserializeFromEmpty(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeFromEmpty12() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.handledType(TypeWrappedDeserializer.java:37)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.handledType(StdDelegatingDeserializer.java:152)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        stdDelegatingDeserializer._deserializeFromEmpty(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeFromEmpty13() throws Exception  {
        NumberDeserializers.DoubleDeserializer doubleDeserializer = ((NumberDeserializers.DoubleDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromEmpty(StdDeserializer.java:600) */
        doubleDeserializer._deserializeFromEmpty(jsonParserDelegate2, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseShortPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseShortPrimitive1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        short actual = jsonNodeDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
        
        org.junit.Assert.assertEquals((short) 0, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseShortPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseShortPrimitive2() throws Exception  {
        DateDeserializers.TimestampDeserializer timestampDeserializer = new DateDeserializers.TimestampDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        timestampDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseShortPrimitive3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ArrayType _containerType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseShortPrimitive4() throws Exception  {
        DOMDeserializer.DocumentDeserializer documentDeserializer = new DOMDeserializer.DocumentDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        documentDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseShortPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseShortPrimitive5() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        throwableDeserializer._parseShortPrimitive(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_parseShortPrimitive6() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2097152);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        booleanDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseShortPrimitive7() throws Exception  {
        NumberDeserializers.IntegerDeserializer integerDeserializer = ((NumberDeserializers.IntegerDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        integerDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseShortPrimitive8() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        booleanDeserializer._parseShortPrimitive(jsonParserSequence, null);
    }
    
    @Test
    public void test_parseShortPrimitive9() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        doubleDeser._parseShortPrimitive(filteringParserDelegate, null);
    }
    
    @Test
    public void test_parseShortPrimitive10() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        booleanDeserializer._parseShortPrimitive(jsonParserSequence, null);
    }
    
    @Test
    public void test_parseShortPrimitive11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:249)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        mapDeserializer._parseShortPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseShortPrimitive12() throws Exception  {
        NumberDeserializers.ByteDeserializer byteDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate3, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        byteDeserializer._parseShortPrimitive(jsonParserSequence, impl);
    }
    
    @Test
    public void test_parseShortPrimitive13() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        doubleDeser._parseShortPrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseShortPrimitive14() throws Exception  {
        NumberDeserializers.ByteDeserializer byteDeserializer = ((NumberDeserializers.ByteDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        byteDeserializer._parseShortPrimitive(jsonParserSequence, impl);
    }
    
    @Test
    public void test_parseShortPrimitive15() throws Exception  {
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = new DateDeserializers.SqlDateDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        sqlDateDeserializer._parseShortPrimitive(jsonParserDelegate1, null);
    }
    
    @Test
    public void test_parseShortPrimitive16() throws Exception  {
        PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        doubleDeser._parseShortPrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseShortPrimitive17() throws Exception  {
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = new DateDeserializers.SqlDateDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseShortPrimitive(StdDeserializer.java:219) */
        sqlDateDeserializer._parseShortPrimitive(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NULL}
 *  */
    @Test
    public void test_parseDoublePrimitive_StdDeserializer_verifyNullForPrimitive() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonToken initialFilteringParserDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        double actual = stdDelegatingDeserializer._parseDoublePrimitive(filteringParserDelegate, impl);
        
        assertEquals(0.0, actual, 1.0E-6);
        
        JsonToken finalFilteringParserDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)
 *  */
    @Test
    public void test_parseDoublePrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:402) */
        throwableDeserializer._parseDoublePrimitive(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).doubleValue();
 *  */
    @Test
    public void test_parseDoublePrimitive_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:428) */
        stdDelegatingDeserializer._parseDoublePrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_START_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void test_parseDoublePrimitive_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._parseDoublePrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseDoublePrimitive1() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectDeserializer._parseDoublePrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDoublePrimitive2() throws Exception  {
        UntypedObjectDeserializer untypedObjectDeserializer = new UntypedObjectDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:867)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:414) */
        untypedObjectDeserializer._parseDoublePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseDoublePrimitive3() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:867)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:403) */
        objectDeserializer._parseDoublePrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDoublePrimitive4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:416) */
        mapDeserializer._parseDoublePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseDoublePrimitive5() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla(false);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:428) */
        vanilla._parseDoublePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseDoublePrimitive6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:839)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:407) */
        mapDeserializer._parseDoublePrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseDoublePrimitive7() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:867)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:403) */
        objectArrayDeserializer._parseDoublePrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDoublePrimitive8() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:428) */
        objectArrayDeserializer._parseDoublePrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDoublePrimitive9() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getDoubleValue(FilteringParserDelegate.java:867)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getDoubleValue(JsonParserDelegate.java:172)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:403) */
        booleanDeserializer._parseDoublePrimitive(jsonParserDelegate3, impl);
    }
    
    @Test
    public void test_parseDoublePrimitive10() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:428) */
        booleanDeserializer._parseDoublePrimitive(jsonParserDelegate3, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseDoublePrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseDoublePrimitive11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._parseDoublePrimitive(filteringParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDoublePrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: switch(text.charAt(0))
 *  */
    @Test
    public void test_parseDoublePrimitive_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:437) */
        throwableDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDoublePrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(text.charAt(0))
 *  */
    @Test
    public void test_parseDoublePrimitive_ThrowNullPointerException1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:437) */
        throwableDeserializer._parseDoublePrimitive(((DeserializationContext) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseDoublePrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_parseDoublePrimitive12() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "NaN";
        
        double actual = failingDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDoublePrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_parseDoublePrimitive13() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        String string = "\u0001!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:457) */
        beanDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseDoublePrimitive14() throws Exception  {
        PrimitiveArrayDeserializers.CharDeser charDeser = new PrimitiveArrayDeserializers.CharDeser();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "!";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:896)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:457) */
        charDeser._parseDoublePrimitive(impl, string);
    }
    
    @Test
    public void test_parseDoublePrimitive15() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        String string = "N\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:457) */
        longDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseDoublePrimitive16() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:457) */
        failingDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseDoublePrimitive17() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "I\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDoublePrimitive(StdDeserializer.java:457) */
        failingDeserializer._parseDoublePrimitive(((DeserializationContext) null), string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleMissingEndArrayForSingle(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleMissingEndArrayForSingle(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handledType()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handledType().getName()
 *  */
    @Test
    public void testHandleMissingEndArrayForSingle_ThrowNullPointerException() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1165) */
        failingDeserializer.handleMissingEndArrayForSingle(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handleMissingEndArrayForSingle(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, impl);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle3() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, impl);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle4() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle5() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(readerBasedJsonParser, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle6() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, impl);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle7() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer2 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer2, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, impl);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHandleMissingEndArrayForSingle8() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        StdDelegatingDeserializer _delegateDeserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer2 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer1 = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer2, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer2);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        stdDelegatingDeserializer.handleMissingEndArrayForSingle(null, null);
    }
    
    @Test
    public void testHandleMissingEndArrayForSingle9() throws Exception  {
        NumberDeserializers.CharacterDeserializer characterDeserializer = ((NumberDeserializers.CharacterDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer"));
        Class _valueClass = Object.class;
        setField(characterDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.wrongTokenException(DeserializationContext.java:1506)
            com.fasterxml.jackson.databind.DeserializationContext.reportWrongTokenException(DeserializationContext.java:1256)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleMissingEndArrayForSingle(StdDeserializer.java:1165) */
        characterDeserializer.handleMissingEndArrayForSingle(null, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.isDefaultDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#isDefaultDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Object)}
 * @utbot.returnsFrom {@code return ClassUtil.isJacksonStdImpl(deserializer);}
 *  */
    @Test
    public void testIsDefaultDeserializer_ClassUtilIsJacksonStdImpl() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        boolean actual = throwableDeserializer.isDefaultDeserializer(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): True}
 *  */
    @Test
    public void test_parseBooleanPrimitive_TEqualsJsonTokenVALUE_TRUE() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        boolean actual = stdDelegatingDeserializer._parseBooleanPrimitive(filteringParserDelegate, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_FALSE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)}
 *  */
    @Test
    public void test_parseBooleanPrimitive_TEqualsJsonTokenVALUE_NULL() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        boolean actual = failingDeserializer._parseBooleanPrimitive(jsonParserSequence, impl);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): True}
 *  */
    @Test
    public void test_parseBooleanPrimitive_TEqualsJsonTokenVALUE_TRUE_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        boolean actual = stdDelegatingDeserializer._parseBooleanPrimitive(jsonParserDelegate, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_FALSE): True}
 *  */
    @Test
    public void test_parseBooleanPrimitive_TEqualsJsonTokenVALUE_FALSE() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        boolean actual = stdDelegatingDeserializer._parseBooleanPrimitive(jsonParserDelegate, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_parseBooleanPrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:149) */
        throwableDeserializer._parseBooleanPrimitive(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_FALSE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void test_parseBooleanPrimitive_ThrowNullPointerException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:180) */
        throwableDeserializer._parseBooleanPrimitive(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_TRUE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_FALSE): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NUMBER_INT): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (t == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Boolean) ctxt.handleUnexpectedToken(_valueClass, p)).booleanValue();
 *  */
    @Test
    public void test_parseBooleanPrimitive_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        stdDelegatingDeserializer._parseBooleanPrimitive(jsonParserSequence, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseBooleanPrimitive1() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        numberDeserializer._parseBooleanPrimitive(jsonParserDelegate, null);
    }
    
    @Test
    public void test_parseBooleanPrimitive2() throws Exception  {
        NioPathDeserializer nioPathDeserializer = new NioPathDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        nioPathDeserializer._parseBooleanPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBooleanPrimitive3() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        nullifyingDeserializer._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseBooleanPrimitive4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        mapDeserializer._parseBooleanPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseBooleanPrimitive5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:153) */
        mapDeserializer._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseBooleanPrimitive6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:153) */
        mapDeserializer._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_parseBooleanPrimitive7() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        objectDeserializer._parseBooleanPrimitive(jsonParserDelegate1, null);
    }
    
    @Test
    public void test_parseBooleanPrimitive8() throws Exception  {
        NumberDeserializers.DoubleDeserializer doubleDeserializer = ((NumberDeserializers.DoubleDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanPrimitive(StdDeserializer.java:187) */
        doubleDeserializer._parseBooleanPrimitive(jsonParserDelegate2, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseBooleanPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseBooleanPrimitive9() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        vanilla._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseBooleanPrimitive10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseBooleanPrimitive11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._parseBooleanPrimitive(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()} twice,
    ///     {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_neitherNull(java.lang.Object,java.lang.Object)} twice
    /// return from: {@code return existingDeserializer;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return existingDeserializer;}
 *  */
    @Test
    public void testFindConvertingContentDeserializer_ReturnExistingDeserializer_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = throwableDeserializer.findConvertingContentDeserializer(impl, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return existingDeserializer;}
 *  */
    @Test
    public void testFindConvertingContentDeserializer_ReturnExistingDeserializer_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            JsonDeserializer actual = failingDeserializer.findConvertingContentDeserializer(impl, null, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return existingDeserializer;}
 *  */
    @Test
    public void testFindConvertingContentDeserializer_ReturnExistingDeserializer() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = stdDelegatingDeserializer.findConvertingContentDeserializer(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_neitherNull(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanProperty#getMember()}
 * @utbot.returnsFrom {@code return existingDeserializer;}
 *  */
    @Test
    public void testFindConvertingContentDeserializer_BeanPropertyGetMember() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, objectIdValuePropertyType, jsonDeserializerType);
        findConvertingContentDeserializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
        findConvertingContentDeserializerMethodArguments[0] = impl;
        findConvertingContentDeserializerMethodArguments[1] = objectIdValueProperty;
        findConvertingContentDeserializerMethodArguments[2] = ((Object) null);
        JsonDeserializer actual = ((JsonDeserializer) findConvertingContentDeserializerMethod.invoke(failingDeserializer, findConvertingContentDeserializerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingContentDeserializer_ThrowNullPointerException() throws JsonMappingException  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer.findConvertingContentDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test
    public void testFindConvertingContentDeserializer1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DateDeserializers.DateDeserializer dateDeserializer = new DateDeserializers.DateDeserializer();
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
            setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
            Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, attributePropertyWriterType, jsonDeserializerType);
            findConvertingContentDeserializerMethod.setAccessible(true);
            java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
            findConvertingContentDeserializerMethodArguments[0] = impl;
            findConvertingContentDeserializerMethodArguments[1] = attributePropertyWriter;
            findConvertingContentDeserializerMethodArguments[2] = ((Object) null);
            JsonDeserializer actual = ((JsonDeserializer) findConvertingContentDeserializerMethod.invoke(dateDeserializer, findConvertingContentDeserializerMethodArguments));
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testFindConvertingContentDeserializer2() throws Exception  {
        ByteBufferDeserializer byteBufferDeserializer = new ByteBufferDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, beanPropertyWriterType, jsonDeserializerType);
        findConvertingContentDeserializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
        findConvertingContentDeserializerMethodArguments[0] = impl;
        findConvertingContentDeserializerMethodArguments[1] = beanPropertyWriter;
        findConvertingContentDeserializerMethodArguments[2] = ((Object) null);
        JsonDeserializer actual = ((JsonDeserializer) findConvertingContentDeserializerMethod.invoke(byteBufferDeserializer, findConvertingContentDeserializerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingContentDeserializer3() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
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
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, beanPropertyWriterType, jsonDeserializerType);
        findConvertingContentDeserializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
        findConvertingContentDeserializerMethodArguments[0] = impl;
        findConvertingContentDeserializerMethodArguments[1] = beanPropertyWriter;
        findConvertingContentDeserializerMethodArguments[2] = ((Object) null);
        try {
            findConvertingContentDeserializerMethod.invoke(collectionDeserializer, findConvertingContentDeserializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConvertingContentDeserializer4() throws Throwable  {
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, beanPropertyWriterType, jsonDeserializerType);
        findConvertingContentDeserializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
        findConvertingContentDeserializerMethodArguments[0] = impl;
        findConvertingContentDeserializerMethodArguments[1] = beanPropertyWriter;
        findConvertingContentDeserializerMethodArguments[2] = ((Object) null);
        try {
            findConvertingContentDeserializerMethod.invoke(collectionDeserializer, findConvertingContentDeserializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testFindConvertingContentDeserializer5() throws Throwable  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary5 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:686)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:685)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:685)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:685)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:685)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationContentConverter(AnnotationIntrospectorPair.java:686)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer(StdDeserializer.java:969) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class typeWrappedDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findConvertingContentDeserializerMethod = stdDeserializerClazz.getDeclaredMethod("findConvertingContentDeserializer", implType, beanPropertyWriterType, typeWrappedDeserializerType);
        findConvertingContentDeserializerMethod.setAccessible(true);
        java.lang.Object[] findConvertingContentDeserializerMethodArguments = new java.lang.Object[3];
        findConvertingContentDeserializerMethodArguments[0] = impl;
        findConvertingContentDeserializerMethodArguments[1] = beanPropertyWriter;
        findConvertingContentDeserializerMethodArguments[2] = typeWrappedDeserializer;
        try {
            findConvertingContentDeserializerMethod.invoke(longDeserializer, findConvertingContentDeserializerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 *  */
    @Test
    public void test_verifyStringForScalarCoercion_DeserializationContextIsEnabled() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        failingDeserializer._verifyStringForScalarCoercion(impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(feat)
 *  */
    @Test
    public void test_verifyStringForScalarCoercion_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion(StdDeserializer.java:844) */
        throwableDeserializer._verifyStringForScalarCoercion(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_verifyStringForScalarCoercion1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion(StdDeserializer.java:846) */
        mapDeserializer._verifyStringForScalarCoercion(impl, string);
    }
    
    @Test
    public void test_verifyStringForScalarCoercion2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion(StdDeserializer.java:846) */
        mapDeserializer._verifyStringForScalarCoercion(impl, null);
    }
    
    @Test
    public void test_verifyStringForScalarCoercion3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyStringForScalarCoercion(StdDeserializer.java:846) */
        mapDeserializer._verifyStringForScalarCoercion(impl, string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _verifyStringForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyStringForScalarCoercion4() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        stackTraceElementDeserializer._verifyStringForScalarCoercion(impl, null);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_verifyStringForScalarCoercion5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapType _containerType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        mapDeserializer._verifyStringForScalarCoercion(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeWrappedValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeWrappedValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.START_ARRAY)
 *  */
    @Test
    public void test_deserializeWrappedValue_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue(StdDeserializer.java:691) */
        throwableDeserializer._deserializeWrappedValue(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWrappedValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeWrappedValue1() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectDeserializer._deserializeWrappedValue(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWrappedValue2() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla(false);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue(StdDeserializer.java:697) */
        vanilla._deserializeWrappedValue(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWrappedValue3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.requiresCustomCodec(JsonParserDelegate.java:94)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:550)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue(StdDeserializer.java:700) */
        throwableDeserializer._deserializeWrappedValue(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWrappedValue4() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        Class _valueClass = Object.class;
        setField(objectArrayDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeWrappedValue(StdDeserializer.java:697) */
        objectArrayDeserializer._deserializeWrappedValue(filteringParserDelegate, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = p.nextToken();
 *  */
    @Test
    public void test_deserializeFromArray_ThrowNullPointerException_1() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException] */
            stdDelegatingDeserializer._deserializeFromArray(null, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = p.getCurrentToken();
 *  */
    @Test
    public void test_deserializeFromArray_ThrowNullPointerException_2() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:672) */
            failingDeserializer._deserializeFromArray(null, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)
 *  */
    @Test
    public void test_deserializeFromArray_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, IOException  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:657) */
            failingDeserializer._deserializeFromArray(null, null);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_deserializeFromArray1() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            NumberDeserializers.IntegerDeserializer integerDeserializer = ((NumberDeserializers.IntegerDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer"));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            Object _inputData = createInstance("javax.crypto.extObjectInputStream");
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
            JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1179648);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:658) */
            integerDeserializer._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_deserializeFromArray2() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            StringArrayDeserializer stringArrayDeserializer = ((StringArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1179648);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:658) */
            stringArrayDeserializer._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_deserializeFromArray3() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            JsonToken _nextToken = JsonToken.VALUE_TRUE;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
            JsonToken _currToken = JsonToken.FIELD_NAME;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 131072);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:666) */
            vanilla._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_deserializeFromArray4() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
            JsonToken _currToken = JsonToken.NOT_AVAILABLE;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:658) */
            doubleDeser._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_deserializeFromArray5() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
            JsonToken _nextToken = JsonToken.START_ARRAY;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
            JsonToken _currToken = JsonToken.FIELD_NAME;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1179648);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla.deserialize(UntypedObjectDeserializer.java:657)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:665) */
            vanilla._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_deserializeFromArray6() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UUIDDeserializer uUIDDeserializer = new UUIDDeserializer();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            JsonToken _nextToken = JsonToken.START_ARRAY;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
            JsonToken _currToken = JsonToken.FIELD_NAME;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._nextAfterName(UTF8DataInputJsonParser.java:730)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:570)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(StdDeserializer.java:658) */
            uUIDDeserializer._deserializeFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testHandleUnknownProperty_Return() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        byte[] byteArray = {};
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        stdDelegatingDeserializer.handleUnknownProperty(treeTraversingParser, impl, byteArray, null);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testHandleUnknownProperty_Return_2() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -256);
        short[] shortArray = {};
        
        failingDeserializer.handleUnknownProperty(treeTraversingParser, impl, shortArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testHandleUnknownProperty_Return_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        Object object = new Object();
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        failingDeserializer.handleUnknownProperty(treeTraversingParser, impl, object, null);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnknownProperty(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (instanceOrClass == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.handleUnknownProperty(p, this, instanceOrClass, propName)
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException() throws IOException  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer.handleUnknownProperty(null, null, intArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handleUnknownProperty(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (instanceOrClass == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.handleUnknownProperty(p, this, instanceOrClass, propName)
 *  */
    @Test
    public void testHandleUnknownProperty_ThrowNullPointerException_1() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.handleUnknownProperty(StdDeserializer.java:1153) */
        failingDeserializer.handleUnknownProperty(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findValueNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.PropertyMetadata)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindValueNullProvider_PropEqualsNull() throws JsonMappingException  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        
        NullValueProvider actual = stdDelegatingDeserializer.findValueNullProvider(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return _findNullProvider(ctxt, prop, propMetadata.getValueNulls(), prop.getValueDeserializer());}
 *  */
    @Test
    public void testFindValueNullProvider_PropNotEqualsNull_2() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            PropertyMetadata propertyMetadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Nulls _valueNulls = Nulls.AS_EMPTY;
            setField(propertyMetadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls", _valueNulls);
            
            NullValueProvider actual = throwableDeserializer.findValueNullProvider(null, fieldProperty, propertyMetadata);
            
            assertNull(actual);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return _findNullProvider(ctxt, prop, propMetadata.getValueNulls(), prop.getValueDeserializer());}
 *  */
    @Test
    public void testFindValueNullProvider_PropNotEqualsNull() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            PropertyMetadata propertyMetadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Nulls _valueNulls = Nulls.AS_EMPTY;
            setField(propertyMetadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls", _valueNulls);
            
            NullValueProvider actual = stdDelegatingDeserializer.findValueNullProvider(null, objectIdReferenceProperty, propertyMetadata);
            
            assertNull(actual);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.NullsFailProvider#constructForProperty(com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return _findNullProvider(ctxt, prop, propMetadata.getValueNulls(), prop.getValueDeserializer());}
 *  */
    @Test
    public void testFindValueNullProvider_PropNotEqualsNull_1() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "No _valueDeserializer assigned";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
            FieldProperty fieldProperty = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
            SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(fieldProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_type", _type);
            PropertyMetadata propertyMetadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Nulls _valueNulls = Nulls.FAIL;
            setField(propertyMetadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls", _valueNulls);
            
            NullsFailProvider actual = ((NullsFailProvider) stdDelegatingDeserializer.findValueNullProvider(null, fieldProperty, propertyMetadata));
            
            NullsFailProvider expected = ((NullsFailProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider"));
            setField(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type", _type);
            
            PropertyName actual_name = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
            assertNull(actual_name);
            
            JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            org.junit.Assert.assertEquals(expected_type, actual_type);
            
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return _findNullProvider(ctxt, prop, propMetadata.getValueNulls(), prop.getValueDeserializer());}
 *  */
    @Test
    public void testFindValueNullProvider_PropNotEqualsNull_3() throws Exception  {
        Class settableBeanPropertyClazz = Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty");
        JsonDeserializer prevMISSING_VALUE_DESERIALIZER = ((JsonDeserializer) getStaticFieldValue(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER"));
        try {
            String string = "";
            FailingDeserializer missingValueDeserializer = new FailingDeserializer(string);
            setStaticField(settableBeanPropertyClazz, "MISSING_VALUE_DESERIALIZER", missingValueDeserializer);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            ObjectIdReferenceProperty objectIdReferenceProperty = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
            FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message", string);
            Class _valueClass = Object.class;
            setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
            setField(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
            PropertyMetadata propertyMetadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Nulls _valueNulls = Nulls.FAIL;
            setField(propertyMetadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_valueNulls", _valueNulls);
            
            JsonDeserializer objectIdReferenceProperty_valueDeserializer = ((JsonDeserializer) getFieldValue(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            Class initialObjectIdReferenceProperty_valueDeserializer_valueClass = ((Class) getFieldValue(objectIdReferenceProperty_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            NullsFailProvider actual = ((NullsFailProvider) failingDeserializer.findValueNullProvider(null, objectIdReferenceProperty, propertyMetadata));
            
            NullsFailProvider expected = ((NullsFailProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider"));
            
            PropertyName actual_name = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
            assertNull(actual_name);
            
            JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
            assertNull(actual_type);
            
            JsonDeserializer objectIdReferenceProperty_valueDeserializer1 = ((JsonDeserializer) getFieldValue(objectIdReferenceProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer"));
            Class finalObjectIdReferenceProperty_valueDeserializer_valueClass = ((Class) getFieldValue(objectIdReferenceProperty_valueDeserializer1, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            
            assertFalse(initialObjectIdReferenceProperty_valueDeserializer_valueClass == finalObjectIdReferenceProperty_valueDeserializer_valueClass);
        } finally {
            setStaticField(SettableBeanProperty.class, "MISSING_VALUE_DESERIALIZER", prevMISSING_VALUE_DESERIALIZER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.PropertyMetadata)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findValueNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyMetadata#getValueNulls()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _findNullProvider(ctxt, prop, propMetadata.getValueNulls(), prop.getValueDeserializer());
 *  */
    @Test
    public void testFindValueNullProvider_ThrowNullPointerException() throws JsonMappingException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        ManagedReferenceProperty managedReferenceProperty = new ManagedReferenceProperty(null, null, null, false);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findValueNullProvider] produces [java.lang.NullPointerException] */
        failingDeserializer.findValueNullProvider(null, managedReferenceProperty, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNullForPrimitive(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_NULL}
 *  */
    @Test
    public void test_parseFloatPrimitive_NotPHasToken() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        JsonToken initialFilteringParserDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        float actual = stdDelegatingDeserializer._parseFloatPrimitive(filteringParserDelegate, impl);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
        
        JsonToken finalFilteringParserDelegate_currToken = ((JsonToken) getFieldValue(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken"));
        
        assertFalse(initialFilteringParserDelegate_currToken == finalFilteringParserDelegate_currToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#hasToken(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:341) */
        throwableDeserializer._parseFloatPrimitive(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)): False}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).floatValue();
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:367) */
        throwableDeserializer._parseFloatPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)): False}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).floatValue();
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:367) */
        stdDelegatingDeserializer._parseFloatPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)): False}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).floatValue();
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException_3() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:803)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:355) */
        failingDeserializer._parseFloatPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (p.hasToken(JsonToken.VALUE_NUMBER_FLOAT)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_START_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException_4() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._parseFloatPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseFloatPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: switch(text.charAt(0))
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:376) */
        throwableDeserializer._parseFloatPrimitive(((DeserializationContext) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseFloatPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(text.charAt(0))
 *  */
    @Test
    public void test_parseFloatPrimitive_ThrowNullPointerException1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseFloatPrimitive(StdDeserializer.java:376) */
        throwableDeserializer._parseFloatPrimitive(((DeserializationContext) null), ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.getValueAsString()
 *  */
    @Test
    public void test_failDoubleToIntCoercion_ThrowNullPointerException() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:714) */
        failingDeserializer._failDoubleToIntCoercion(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", p.getValueAsString(), type);
 *  */
    @Test
    public void test_failDoubleToIntCoercion_ThrowNullPointerException_2() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:712) */
        failingDeserializer._failDoubleToIntCoercion(uTF8DataInputJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", p.getValueAsString(), type);
 *  */
    @Test
    public void test_failDoubleToIntCoercion_ThrowNullPointerException_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:712) */
        failingDeserializer._failDoubleToIntCoercion(uTF8DataInputJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: p.getValueAsString()
 *  */
    @Test
    public void test_failDoubleToIntCoercion_ThrowNullPointerException_3() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1857)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getValueAsString(UTF8DataInputJsonParser.java:221)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:714) */
        failingDeserializer._failDoubleToIntCoercion(uTF8DataInputJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_failDoubleToIntCoercion(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", p.getValueAsString(), type);
 *  */
    @Test
    public void test_failDoubleToIntCoercion_ThrowNullPointerException_4() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._failDoubleToIntCoercion(StdDeserializer.java:712) */
        failingDeserializer._failDoubleToIntCoercion(uTF8DataInputJsonParser, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._isEmptyOrTextualNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isEmptyOrTextualNull(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isEmptyOrTextualNull(java.lang.String)}
 * @utbot.returnsFrom {@code return value.isEmpty() || "null".equals(value);}
 *  */
    @Test
    public void test_isEmptyOrTextualNull_ValueIsEmptyOrNullEquals() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "";
        
        boolean actual = throwableDeserializer._isEmptyOrTextualNull(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isEmptyOrTextualNull(java.lang.String)}
 * @utbot.returnsFrom {@code return value.isEmpty() || "null".equals(value);}
 *  */
    @Test
    public void test_isEmptyOrTextualNull_ValueIsEmptyOrNullEquals_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = " ";
        
        boolean actual = throwableDeserializer._isEmptyOrTextualNull(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isEmptyOrTextualNull(java.lang.String)}
 * @utbot.returnsFrom {@code return value.isEmpty() || "null".equals(value);}
 *  */
    @Test
    public void test_isEmptyOrTextualNull_ValueIsEmptyOrNullEquals_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "null";
        
        boolean actual = throwableDeserializer._isEmptyOrTextualNull(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _isEmptyOrTextualNull(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isEmptyOrTextualNull(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return value.isEmpty() || "null".equals(value);
 *  */
    @Test
    public void test_isEmptyOrTextualNull_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._isEmptyOrTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._isEmptyOrTextualNull(StdDeserializer.java:618) */
        throwableDeserializer._isEmptyOrTextualNull(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanFromInt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseBooleanFromInt(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseBooleanFromInt(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_verifyNumberForScalarCoercion(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !"0".equals(p.getText());
 *  */
    @Test
    public void test_parseBooleanFromInt_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanFromInt] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseBooleanFromInt(StdDeserializer.java:200) */
        throwableDeserializer._parseBooleanFromInt(null, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDateFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDateFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = p.nextToken();
 *  */
    @Test
    public void test_parseDateFromArray_ThrowNullPointerException_1() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException] */
            stdDelegatingDeserializer._parseDateFromArray(null, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDateFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t = p.getCurrentToken();
 *  */
    @Test
    public void test_parseDateFromArray_ThrowNullPointerException_2() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:506) */
            failingDeserializer._parseDateFromArray(null, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDateFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)
 *  */
    @Test
    public void test_parseDateFromArray_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, IOException  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:493) */
            failingDeserializer._parseDateFromArray(null, null);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDateFromArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseDateFromArray1() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1179648);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:494) */
            vanilla._parseDateFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_parseDateFromArray2() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", 80);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:595)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:494) */
            vanilla._parseDateFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_parseDateFromArray3() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            JsonToken _currToken = JsonToken.FIELD_NAME;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:508) */
            doubleDeser._parseDateFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_parseDateFromArray4() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            PrimitiveArrayDeserializers.DoubleDeser doubleDeser = new PrimitiveArrayDeserializers.DoubleDeser();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
            JsonToken _nextToken = JsonToken.START_ARRAY;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_nextToken", _nextToken);
            JsonToken _currToken = JsonToken.FIELD_NAME;
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 131072);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2240)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:494)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:483)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:501) */
            doubleDeser._parseDateFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    
    @Test
    public void test_parseDateFromArray5() throws Exception  {
        int prevF_MASK_ACCEPT_ARRAYS = StdDeserializer.F_MASK_ACCEPT_ARRAYS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_ACCEPT_ARRAYS", 1179648);
            UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            Object _inputData = createInstance("javax.crypto.extObjectInputStream");
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_inputData", _inputData);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_nextByte", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1048576);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray] produces [java.lang.NullPointerException]
                java.base/java.io.ObjectInputStream.readUnsignedByte(ObjectInputStream.java:1089)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipWSOrEnd(UTF8DataInputJsonParser.java:2219)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextToken(UTF8DataInputJsonParser.java:578)
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDateFromArray(StdDeserializer.java:494) */
            vanilla._parseDateFromArray(uTF8DataInputJsonParser, impl);
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_ACCEPT_ARRAYS", prevF_MASK_ACCEPT_ARRAYS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findContentNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return valueDeser;}
 *  */
    @Test
    public void testFindContentNullProvider_ReturnValueDeser() throws JsonMappingException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        NullValueProvider actual = failingDeserializer.findContentNullProvider(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return prov;}
 *  */
    @Test
    public void testFindContentNullProvider_ReturnProv() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        StringDeserializer stringDeserializer = new StringDeserializer();
        
        PropertyMetadata initialValueInjector_metadata = ((PropertyMetadata) getFieldValue(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_metadata"));
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stringDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findContentNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("findContentNullProvider", deserializationContextType, valueInjectorType, stringDeserializerType);
        findContentNullProviderMethod.setAccessible(true);
        java.lang.Object[] findContentNullProviderMethodArguments = new java.lang.Object[3];
        findContentNullProviderMethodArguments[0] = ((Object) null);
        findContentNullProviderMethodArguments[1] = valueInjector;
        findContentNullProviderMethodArguments[2] = stringDeserializer;
        StringDeserializer actual = ((StringDeserializer) findContentNullProviderMethod.invoke(throwableDeserializer, findContentNullProviderMethodArguments));
        
        Class stringDeserializer_valueClass = stringDeserializer._valueClass;
        Class actual_valueClass = actual._valueClass;
        org.junit.Assert.assertEquals(Class.class, actual_valueClass.getClass());
        
        PropertyMetadata finalValueInjector_metadata = ((PropertyMetadata) getFieldValue(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_metadata"));
        
        assertFalse(initialValueInjector_metadata == finalValueInjector_metadata);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return valueDeser;}
 *  */
    @Test
    public void testFindContentNullProvider_ReturnValueDeser_1() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED_OR_OPTIONAL = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        try {
            PropertyMetadata stdRequiredOrOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED_OR_OPTIONAL", stdRequiredOrOptional);
            FailingDeserializer failingDeserializer = new FailingDeserializer(null);
            BeanProperty.Bogus bogus = new BeanProperty.Bogus();
            
            NullValueProvider actual = failingDeserializer.findContentNullProvider(null, bogus, null);
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED_OR_OPTIONAL", prevSTD_REQUIRED_OR_OPTIONAL);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return prov;}
 *  */
    @Test
    public void testFindContentNullProvider_ReturnProv_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, JsonMappingException, NoSuchFieldException  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        StdDelegatingDeserializer stdDelegatingDeserializer1 = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class stdDelegatingDeserializer1Type = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findContentNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("findContentNullProvider", deserializationContextType, valueInjectorType, stdDelegatingDeserializer1Type);
        findContentNullProviderMethod.setAccessible(true);
        java.lang.Object[] findContentNullProviderMethodArguments = new java.lang.Object[3];
        findContentNullProviderMethodArguments[0] = ((Object) null);
        findContentNullProviderMethodArguments[1] = valueInjector;
        findContentNullProviderMethodArguments[2] = stdDelegatingDeserializer1;
        NullsAsEmptyProvider actual = ((NullsAsEmptyProvider) findContentNullProviderMethod.invoke(stdDelegatingDeserializer, findContentNullProviderMethodArguments));
        
        NullsAsEmptyProvider expected = new NullsAsEmptyProvider(stdDelegatingDeserializer1);
        
        JsonDeserializer expected_deserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", "_deserializer"));
        JsonDeserializer actual_deserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", "_deserializer"));
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findContentNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test
    public void testFindContentNullProvider1() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MergingSettableBeanProperty mergingSettableBeanProperty = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(mergingSettableBeanProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mergingSettableBeanPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method findContentNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("findContentNullProvider", implType, mergingSettableBeanPropertyType, jsonDeserializerType);
        findContentNullProviderMethod.setAccessible(true);
        java.lang.Object[] findContentNullProviderMethodArguments = new java.lang.Object[3];
        findContentNullProviderMethodArguments[0] = impl;
        findContentNullProviderMethodArguments[1] = mergingSettableBeanProperty;
        findContentNullProviderMethodArguments[2] = ((Object) null);
        NullValueProvider actual = ((NullValueProvider) findContentNullProviderMethod.invoke(longDeserializer, findContentNullProviderMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findContentNullStyle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (prop != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindContentNullStyle_PropEqualsNull() throws JsonMappingException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        Nulls actual = failingDeserializer.findContentNullStyle(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (prop != null): True}
 *  */
    @Test
    public void testFindContentNullStyle_PropNotEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ValueInjector valueInjector = new ValueInjector(null, null, null, null, null);
        
        PropertyMetadata initialValueInjector_metadata = ((PropertyMetadata) getFieldValue(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_metadata"));
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method findContentNullStyleMethod = stdDeserializerClazz.getDeclaredMethod("findContentNullStyle", deserializationContextType, valueInjectorType);
        findContentNullStyleMethod.setAccessible(true);
        java.lang.Object[] findContentNullStyleMethodArguments = new java.lang.Object[2];
        findContentNullStyleMethodArguments[0] = ((Object) null);
        findContentNullStyleMethodArguments[1] = valueInjector;
        Nulls actual = ((Nulls) findContentNullStyleMethod.invoke(throwableDeserializer, findContentNullStyleMethodArguments));
        
        assertNull(actual);
        
        PropertyMetadata finalValueInjector_metadata = ((PropertyMetadata) getFieldValue(valueInjector, "com.fasterxml.jackson.databind.BeanProperty$Std", "_metadata"));
        
        assertFalse(initialValueInjector_metadata == finalValueInjector_metadata);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyMetadata#getContentNulls()}
 * @utbot.returnsFrom {@code return prop.getMetadata().getContentNulls();}
 *  */
    @Test
    public void testFindContentNullStyle_PropertyMetadataGetContentNulls() throws Exception  {
        PropertyMetadata prevSTD_REQUIRED_OR_OPTIONAL = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        try {
            PropertyMetadata stdRequiredOrOptional = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
            Class propertyMetadataClazz = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
            setStaticField(propertyMetadataClazz, "STD_REQUIRED_OR_OPTIONAL", stdRequiredOrOptional);
            ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
            BeanProperty.Bogus bogus = new BeanProperty.Bogus();
            
            Nulls actual = throwableDeserializer.findContentNullStyle(null, bogus);
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyMetadata.class, "STD_REQUIRED_OR_OPTIONAL", prevSTD_REQUIRED_OR_OPTIONAL);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findContentNullStyle(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (prop != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanProperty#getMetadata()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return prop.getMetadata().getContentNulls();
 *  */
    @Test
    public void testFindContentNullStyle_ThrowNullPointerException() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findContentNullStyle] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findContentNullStyle(StdDeserializer.java:1073) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method findContentNullStyleMethod = stdDeserializerClazz.getDeclaredMethod("findContentNullStyle", deserializationContextType, managedReferencePropertyType);
        findContentNullStyleMethod.setAccessible(true);
        java.lang.Object[] findContentNullStyleMethodArguments = new java.lang.Object[2];
        findContentNullStyleMethodArguments[0] = ((Object) null);
        findContentNullStyleMethodArguments[1] = managedReferenceProperty;
        try {
            findContentNullStyleMethod.invoke(throwableDeserializer, findContentNullStyleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.handledType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handledType()
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handledType()}
 * @utbot.returnsFrom {@code public }
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testHandledType_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.handledType] produces [java.lang.NullPointerException] */
        throwableDeserializer.handledType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.getValueType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueType()
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#getValueType()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetValueType_ReturnNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        JavaType actual = throwableDeserializer.getValueType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.getValueClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueClass()
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#getValueClass()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetValueClass_Return() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        
        Class actual = stdDelegatingDeserializer.getValueClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseInt(text);}
 *  */
    @Test
    public void test_parseIntPrimitive_ReturnNumberInputParseInt() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "2";
        
        int actual = throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseInt(text);}
 *  */
    @Test
    public void test_parseIntPrimitive_ReturnNumberInputParseInt_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "22";
        
        int actual = throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(22, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseInt(text);}
 *  */
    @Test
    public void test_parseIntPrimitive_ReturnNumberInputParseInt_2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "-2";
        
        int actual = throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseInt(text);}
 *  */
    @Test
    public void test_parseIntPrimitive_ReturnNumberInputParseInt_3() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "222";
        
        int actual = throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(222, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.returnsFrom {@code return NumberInput.parseInt(text);}
 *  */
    @Test
    public void test_parseIntPrimitive_ReturnNumberInputParseInt_4() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "2222";
        
        int actual = throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
        
        org.junit.Assert.assertEquals(2222, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.executesCondition {@code (text.length() > 9): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: return NumberInput.parseInt(text);
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowStringIndexOutOfBoundsException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.core.io.NumberInput.parseInt(NumberInput.java:68)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:281) */
        throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: text.length() > 9
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:271) */
        throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.executesCondition {@code (text.length() > 9): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Number v = (Number) ctxt.handleWeirdStringValue(_valueClass, text, "not a valid int value");
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowNullPointerException_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "-";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        throwableDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_parseIntPrimitive1() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        objectArrayDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive2() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        String string = "222:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        atomicReferenceDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive3() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-2:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive4() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive5() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive6() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive7() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-22\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive8() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "2222\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive9() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = ":\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive10() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "22:";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive11() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "2\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    
    @Test
    public void test_parseIntPrimitive12() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "22\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:283) */
        failingDeserializer._parseIntPrimitive(((DeserializationContext) null), string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseIntPrimitive(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test(expected = InvalidFormatException.class)
    public void test_parseIntPrimitive13() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "-";
        
        failingDeserializer._parseIntPrimitive(impl, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseIntPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: p.hasToken(JsonToken.VALUE_NUMBER_INT)
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowNullPointerException1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:232) */
        throwableDeserializer._parseIntPrimitive(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Number) ctxt.handleUnexpectedToken(_valueClass, p)).intValue();
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowNullPointerException_11() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262) */
        stdDelegatingDeserializer._parseIntPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseIntPrimitive(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: JsonTokenId.ID_START_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)
 *  */
    @Test
    public void test_parseIntPrimitive_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._parseIntPrimitive(filteringParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseIntPrimitive(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseIntPrimitive14() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        objectDeserializer._parseIntPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseIntPrimitive15() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:839)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:237) */
        stringCollectionDeserializer._parseIntPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseIntPrimitive16() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233) */
        numberDeserializer._parseIntPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseIntPrimitive17() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla(false);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262) */
        vanilla._parseIntPrimitive(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_parseIntPrimitive18() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getIntValue(FilteringParserDelegate.java:873)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getIntValue(JsonParserDelegate.java:178)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:233) */
        objectArrayDeserializer._parseIntPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseIntPrimitive19() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseIntPrimitive(StdDeserializer.java:262) */
        objectArrayDeserializer._parseIntPrimitive(jsonParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceNullToken
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _coerceNullToken(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceNullToken1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        NullNode actual = ((NullNode) jsonNodeDeserializer._coerceNullToken(impl, true));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_coerceNullToken2() throws Exception  {
        StringCollectionDeserializer stringCollectionDeserializer = ((StringCollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = stringCollectionDeserializer._coerceNullToken(impl, true);
        
        assertNull(actual);
    }
    
    @Test
    public void test_coerceNullToken3() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        
        AtomicReference actual = ((AtomicReference) atomicReferenceDeserializer._coerceNullToken(null, false));
        
        AtomicReference expected = new AtomicReference();
        
    }
    
    @Test
    public void test_coerceNullToken4() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = numberDeserializer._coerceNullToken(impl, false);
        
        assertNull(actual);
    }
    
    @Test
    public void test_coerceNullToken5() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            
            NullNode actual = ((NullNode) jsonNodeDeserializer._coerceNullToken(null, false));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            org.junit.Assert.assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _coerceNullToken(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceNullToken6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _containerType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._coerceNullToken(impl, true);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceNullToken7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Class _valueClass = Object.class;
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        mapDeserializer._coerceNullToken(impl, true);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _coerceNullToken(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceNullToken8() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceNullToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceNullToken(StdDeserializer.java:749) */
        objectArrayDeserializer._coerceNullToken(impl, true);
    }
    
    @Test
    public void test_coerceNullToken9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceNullToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._verifyNullForPrimitive(StdDeserializer.java:806)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceNullToken(StdDeserializer.java:749) */
        mapDeserializer._coerceNullToken(impl, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDate(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getCurrentTokenId())
 *  */
    @Test
    public void test_parseDate_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:465) */
        throwableDeserializer._parseDate(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentTokenId()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnexpectedToken(java.lang.Class,com.fasterxml.jackson.core.JsonParser)}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId())}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (java.util.Date) ctxt.handleUnexpectedToken(_valueClass, p);
 *  */
    @Test
    public void test_parseDate_ThrowNullPointerException_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        failingDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDate(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseDate1() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        numberDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDate2() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        objectDeserializer._parseDate(filteringParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDate3() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getLongValue(FilteringParserDelegate.java:876)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:472) */
        objectArrayDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDate4() throws Exception  {
        NullifyingDeserializer nullifyingDeserializer = new NullifyingDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        nullifyingDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate5() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        failingDeserializer._parseDate(filteringParserDelegate, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate6() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla(false);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        vanilla._parseDate(jsonParserDelegate, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate7() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        jsonNodeDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDate8() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        failingDeserializer._parseDate(filteringParserDelegate, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate9() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        objectDeserializer._parseDate(jsonParserDelegate1, ((DeserializationContext) null));
    }
    
    @Test
    public void test_parseDate10() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:485) */
        objectDeserializer._parseDate(jsonParserDelegate1, ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _parseDate(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseDate11() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Class _valueClass = Object.class;
        setField(throwableDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _valueClass);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        throwableDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) impl));
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_parseDate12() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        objectDeserializer._parseDate(jsonParserDelegate, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseDate(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (java.util.Date) getNullValue(ctxt);
 *  */
    @Test
    public void test_parseDate_ThrowClassCastException() throws Exception  {
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.ClassCastException: class java.util.concurrent.atomic.AtomicReference cannot be cast to class java.util.Date (java.util.concurrent.atomic.AtomicReference and java.util.Date are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:520) */
        atomicReferenceDeserializer._parseDate(string, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (java.util.Date) getNullValue(ctxt);
 *  */
    @Test
    public void test_parseDate_ThrowClassCastException_1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.NullNode cannot be cast to class java.util.Date (com.fasterxml.jackson.databind.node.NullNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @694af959; java.util.Date is in module java.base of loader 'bootstrap')]
                com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:520) */
            jsonNodeDeserializer._parseDate(string, ((DeserializationContext) null));
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.parseDate(value);
 *  */
    @Test
    public void test_parseDate_ThrowNullPointerException1() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = " ";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        failingDeserializer._parseDate(string, ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseDate(java.lang.String,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#parseDate(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.parseDate(value);
 *  */
    @Test
    public void test_parseDate_ThrowNullPointerException_11() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = " ";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        SimpleDateFormat _dateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1774)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:709)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        failingDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _parseDate(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseDate13() throws IOException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "";
        
        Date actual = failingDeserializer._parseDate(string, ((DeserializationContext) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseDate(java.lang.String, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_parseDate14() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:407)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:710)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        failingDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate15() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "\u0001\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 0]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:407)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:710)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        failingDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate16() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:732)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:717)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:710)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        beanDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate17() throws Exception  {
        MapEntryDeserializer mapEntryDeserializer = ((MapEntryDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        String string = "!\u0000\u0000!";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:732)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:717)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:710)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        mapEntryDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate18() throws Exception  {
        JsonNodeDeserializer.ArrayDeserializer arrayDeserializer = ((JsonNodeDeserializer.ArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        String string = "\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:896)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:524) */
        arrayDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate19() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ISO8601DateFormat _dateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_dateFormat", _dateFormat);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleWeirdStringValue(DeserializationContext.java:896)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:524) */
        failingDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate20() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "\u0000\u0000\u0000\u0000";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getDateFormat(DeserializationContext.java:1774)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:709)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        failingDeserializer._parseDate(string, ((DeserializationContext) impl));
    }
    
    @Test
    public void test_parseDate21() throws Exception  {
        UntypedObjectDeserializer.Vanilla vanilla = new UntypedObjectDeserializer.Vanilla();
        String string = "!\u0001";
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        StdDateFormat _dateFormat = ((StdDateFormat) createInstance("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_dateFormat", _dateFormat);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.StdDateFormat._cloneFormat(StdDateFormat.java:732)
            com.fasterxml.jackson.databind.util.StdDateFormat.parseAsRFC1123(StdDateFormat.java:717)
            com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(StdDateFormat.java:411)
            com.fasterxml.jackson.databind.util.StdDateFormat.parse(StdDateFormat.java:358)
            com.fasterxml.jackson.databind.DeserializationContext.parseDate(DeserializationContext.java:710)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDate(StdDeserializer.java:522) */
        vanilla._parseDate(string, ((DeserializationContext) impl));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _coerceTextualNull(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceTextualNull(com.fasterxml.jackson.databind.DeserializationContext,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)
 *  */
    @Test
    public void test_coerceTextualNull_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull(StdDeserializer.java:764) */
        throwableDeserializer._coerceTextualNull(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _coerceTextualNull(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceTextualNull1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        NullNode actual = ((NullNode) jsonNodeDeserializer._coerceTextualNull(impl, false));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_coerceTextualNull2() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        NullNode actual = ((NullNode) jsonNodeDeserializer._coerceTextualNull(impl, true));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_coerceTextualNull3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Object actual = mapDeserializer._coerceTextualNull(impl, false);
        
        assertNull(actual);
    }
    
    @Test
    public void test_coerceTextualNull4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Object actual = mapDeserializer._coerceTextualNull(impl, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _coerceTextualNull(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceTextualNull5() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull(StdDeserializer.java:773) */
        objectDeserializer._coerceTextualNull(impl, true);
    }
    
    @Test
    public void test_coerceTextualNull6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull(StdDeserializer.java:773) */
        mapDeserializer._coerceTextualNull(impl, false);
    }
    
    @Test
    public void test_coerceTextualNull7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull(StdDeserializer.java:773) */
        mapDeserializer._coerceTextualNull(impl, true);
    }
    
    @Test
    public void test_coerceTextualNull8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceTextualNull(StdDeserializer.java:773) */
        mapDeserializer._coerceTextualNull(impl, false);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _coerceTextualNull(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceTextualNull9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        mapDeserializer._coerceTextualNull(impl, false);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceTextualNull10() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        failingDeserializer._coerceTextualNull(impl, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._isPosInf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isPosInf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isPosInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "Infinity".equals(text) || "INF".equals(text);}
 *  */
    @Test
    public void test_isPosInf_InfinityEqualsOrINFEquals() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._isPosInf(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isPosInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "Infinity".equals(text) || "INF".equals(text);}
 *  */
    @Test
    public void test_isPosInf_InfinityEqualsOrINFEquals_1() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "INF";
        
        boolean actual = failingDeserializer._isPosInf(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isPosInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "Infinity".equals(text) || "INF".equals(text);}
 *  */
    @Test
    public void test_isPosInf_InfinityEqualsOrINFEquals_2() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "Infinity";
        
        boolean actual = failingDeserializer._isPosInf(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _coerceIntegral(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceIntegral(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int feats = ctxt.getDeserializationFeatures();
 *  */
    @Test
    public void test_coerceIntegral_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:730) */
        throwableDeserializer._coerceIntegral(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceIntegral(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getBigIntegerValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return p.getBigIntegerValue();
 *  */
    @Test
    public void test_coerceIntegral_ThrowNullPointerException_1() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -254);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:732) */
        failingDeserializer._coerceIntegral(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceIntegral(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getLongValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return p.getLongValue();
 *  */
    @Test
    public void test_coerceIntegral_ThrowNullPointerException_2() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -251);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:735) */
        failingDeserializer._coerceIntegral(null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceIntegral(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getBigIntegerValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return p.getBigIntegerValue();
 *  */
    @Test
    public void test_coerceIntegral_ThrowNullPointerException_3() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:737) */
        failingDeserializer._coerceIntegral(null, impl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _coerceIntegral(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_coerceIntegral1() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        FloatNode _currentNode = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        BigInteger actual = ((BigInteger) longDeserializer._coerceIntegral(jsonParserDelegate1, impl));
        
        BigInteger expected = ((BigInteger) createInstance("java.math.BigInteger"));
        
        // java.math.BigInteger has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _coerceIntegral(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_coerceIntegral2() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getLongValue(JsonParserDelegate.java:181)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:735) */
        numberDeserializer._coerceIntegral(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_coerceIntegral3() throws Exception  {
        FromStringDeserializer.Std std = new FromStringDeserializer.Std(null, 0);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getBigIntegerValue(JsonParserDelegate.java:157)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceIntegral(StdDeserializer.java:732) */
        std._coerceIntegral(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _coerceIntegral(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral4() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        beanDeserializer._coerceIntegral(jsonParserDelegate, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        mapDeserializer._coerceIntegral(jsonParserSequence, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral6() throws Exception  {
        BeanDeserializer beanDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        beanDeserializer._coerceIntegral(jsonParserDelegate2, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral7() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        failingDeserializer._coerceIntegral(jsonParserDelegate, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral8() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
        
        stackTraceElementDeserializer._coerceIntegral(jsonParserDelegate1, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        mapDeserializer._coerceIntegral(jsonParserDelegate2, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral10() throws Exception  {
        NumberDeserializers.LongDeserializer longDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        longDeserializer._coerceIntegral(jsonParserDelegate2, impl);
    }
    
    @Test(expected = JsonParseException.class)
    public void test_coerceIntegral11() throws Exception  {
        StackTraceElementDeserializer stackTraceElementDeserializer = new StackTraceElementDeserializer();
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
        
        stackTraceElementDeserializer._coerceIntegral(jsonParserDelegate2, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _coercedTypeDesc()
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coercedTypeDesc()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#getValueType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isPrimitive()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#handledType()}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 *  */
    @Test
    public void test_coercedTypeDesc_ClassIsArray() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        
        JavaType javaType = mapDeserializer._containerType;
        Class initialMapDeserializer_containerType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapDeserializer._coercedTypeDesc();
        
        String expected = "for type '[recursive type; UNRESOLVED'";
        
        org.junit.Assert.assertEquals(expected, actual);
        
        JavaType javaType1 = mapDeserializer._containerType;
        Class finalMapDeserializer_containerType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapDeserializer_containerType_class == finalMapDeserializer_containerType_class);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _coercedTypeDesc()
    
    @Test
    public void test_coercedTypeDesc1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _containerType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        JavaType javaType = mapDeserializer._containerType;
        Class initialMapDeserializer_containerType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapDeserializer_valueClass = mapDeserializer._valueClass;
        
        String actual = mapDeserializer._coercedTypeDesc();
        
        String expected = "as content of type '[map-like type; class java.lang.Object, null -> null]'";
        
        org.junit.Assert.assertEquals(expected, actual);
        
        JavaType javaType1 = mapDeserializer._containerType;
        Class finalMapDeserializer_containerType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapDeserializer_valueClass = mapDeserializer._valueClass;
        
        assertFalse(initialMapDeserializer_containerType_class == finalMapDeserializer_containerType_class);
        
        assertFalse(initialMapDeserializer_valueClass == finalMapDeserializer_valueClass);
    }
    
    @Test
    public void test_coercedTypeDesc2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapType _containerType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        JavaType javaType = mapDeserializer._containerType;
        Class initialMapDeserializer_containerType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapDeserializer_valueClass = mapDeserializer._valueClass;
        
        String actual = mapDeserializer._coercedTypeDesc();
        
        String expected = "as content of type '[map type; class java.lang.Object, null -> null]'";
        
        org.junit.Assert.assertEquals(expected, actual);
        
        JavaType javaType1 = mapDeserializer._containerType;
        Class finalMapDeserializer_containerType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapDeserializer_valueClass = mapDeserializer._valueClass;
        
        assertFalse(initialMapDeserializer_containerType_class == finalMapDeserializer_containerType_class);
        
        assertFalse(initialMapDeserializer_valueClass == finalMapDeserializer_valueClass);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _coercedTypeDesc()
    
    @Test
    public void test_coercedTypeDesc3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888) */
        mapDeserializer._coercedTypeDesc();
    }
    
    @Test
    public void test_coercedTypeDesc4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891) */
        mapDeserializer._coercedTypeDesc();
    }
    
    @Test
    public void test_coercedTypeDesc5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _containerType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888) */
        mapDeserializer._coercedTypeDesc();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _parseString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_parseString(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = p.getCurrentToken();
 *  */
    @Test
    public void test_parseString_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString(StdDeserializer.java:551) */
        throwableDeserializer._parseString(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _parseString(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_parseString1() throws Exception  {
        NumberDeserializers.NumberDeserializer numberDeserializer = new NumberDeserializers.NumberDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        numberDeserializer._parseString(jsonParserDelegate, null);
    }
    
    @Test
    public void test_parseString2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate6 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getValueAsString(FilteringParserDelegate.java:898)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getValueAsString(JsonParserDelegate.java:203)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString(StdDeserializer.java:566) */
        throwableDeserializer._parseString(jsonParserDelegate, null);
    }
    
    @Test
    public void test_parseString3() throws Exception  {
        NumberDeserializers.BooleanDeserializer booleanDeserializer = ((NumberDeserializers.BooleanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:839)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:143)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseString(StdDeserializer.java:553) */
        booleanDeserializer._parseString(jsonParserDelegate4, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._isNegInf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isNegInf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isNegInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "-Infinity".equals(text) || "-INF".equals(text);}
 *  */
    @Test
    public void test_isNegInf_InfinityEqualsOrINFEquals() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._isNegInf(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isNegInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "-Infinity".equals(text) || "-INF".equals(text);}
 *  */
    @Test
    public void test_isNegInf_InfinityEqualsOrINFEquals_1() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-INF";
        
        boolean actual = failingDeserializer._isNegInf(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isNegInf(java.lang.String)}
 * @utbot.returnsFrom {@code return "-Infinity".equals(text) || "-INF".equals(text);}
 *  */
    @Test
    public void test_isNegInf_InfinityEqualsOrINFEquals_2() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-Infinity";
        
        boolean actual = failingDeserializer._isNegInf(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._hasTextualNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _hasTextualNull(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_hasTextualNull(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return "null".equals(value);}
 *  */
    @Test
    public void test_hasTextualNull_StringEquals() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._hasTextualNull(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isNaN(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isNaN(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return "NaN".equals(text);}
 *  */
    @Test
    public void test_isNaN_StringEquals() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._isNaN(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)
 *  */
    @Test
    public void test_coerceEmptyString_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString(StdDeserializer.java:787) */
        throwableDeserializer._coerceEmptyString(null, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceEmptyString1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        NullNode actual = ((NullNode) jsonNodeDeserializer._coerceEmptyString(impl, true));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_coerceEmptyString2() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        NullNode actual = ((NullNode) jsonNodeDeserializer._coerceEmptyString(impl, false));
        
        NullNode expected = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test_coerceEmptyString3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Object actual = mapDeserializer._coerceEmptyString(impl, false);
        
        assertNull(actual);
    }
    
    @Test
    public void test_coerceEmptyString4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Object actual = mapDeserializer._coerceEmptyString(impl, true);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test
    public void test_coerceEmptyString5() throws Exception  {
        JsonNodeDeserializer.ObjectDeserializer objectDeserializer = ((JsonNodeDeserializer.ObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 8388608);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 32);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString(StdDeserializer.java:796) */
        objectDeserializer._coerceEmptyString(impl, true);
    }
    
    @Test
    public void test_coerceEmptyString6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ReferenceType _containerType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:888)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString(StdDeserializer.java:796) */
        mapDeserializer._coerceEmptyString(impl, false);
    }
    
    @Test
    public void test_coerceEmptyString7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coercedTypeDesc(StdDeserializer.java:891)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._reportFailedNullCoerce(StdDeserializer.java:868)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._coerceEmptyString(StdDeserializer.java:796) */
        mapDeserializer._coerceEmptyString(impl, false);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _coerceEmptyString(com.fasterxml.jackson.databind.DeserializationContext, boolean)
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceEmptyString8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ResolvedRecursiveType _containerType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_containerType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", "_containerType", _containerType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        mapDeserializer._coerceEmptyString(impl, false);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void test_coerceEmptyString9() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        failingDeserializer._coerceEmptyString(impl, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.annotation.Nulls, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): False}
 * @utbot.executesCondition {@code (nulls == Nulls.AS_EMPTY): True}
 * @utbot.executesCondition {@code (valueDeser == null): True}
 *  */
    @Test
    public void test_findNullProvider_ValueDeserEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Nulls nulls = Nulls.AS_EMPTY;
        
        NullValueProvider actual = throwableDeserializer._findNullProvider(null, null, nulls, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): False}
 * @utbot.executesCondition {@code (nulls == Nulls.AS_EMPTY): False}
 * @utbot.executesCondition {@code (nulls == Nulls.SKIP): False}
 *  */
    @Test
    public void test_findNullProvider_NullsNotEqualsNullsSKIP() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        NullValueProvider actual = throwableDeserializer._findNullProvider(null, null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): False}
 * @utbot.executesCondition {@code (nulls == Nulls.AS_EMPTY): True}
 * @utbot.executesCondition {@code (valueDeser == null): False}
 * @utbot.executesCondition {@code (valueDeser instanceof BeanDeserializerBase): False}
 * @utbot.executesCondition {@code (access == AccessPattern.ALWAYS_NULL): False}
 * @utbot.executesCondition {@code (access == AccessPattern.CONSTANT): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#getEmptyAccessPattern()}
 * @utbot.returnsFrom {@code return new NullsAsEmptyProvider(valueDeser);}
 *  */
    @Test
    public void test_findNullProvider_AccessNotEqualsAccessPatternCONSTANT() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Nulls nulls = Nulls.AS_EMPTY;
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        NullsAsEmptyProvider actual = ((NullsAsEmptyProvider) throwableDeserializer._findNullProvider(null, null, nulls, failingDeserializer));
        
        NullsAsEmptyProvider expected = new NullsAsEmptyProvider(failingDeserializer);
        
        JsonDeserializer expected_deserializer = ((JsonDeserializer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", "_deserializer"));
        JsonDeserializer actual_deserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", "_deserializer"));
        String actual_deserializer_message = ((String) getFieldValue(actual_deserializer, "com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", "_message"));
        assertNull(actual_deserializer_message);
        
        Class expected_deserializer_valueClass = ((Class) getFieldValue(expected_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        Class actual_deserializer_valueClass = ((Class) getFieldValue(actual_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        org.junit.Assert.assertEquals(Class.class, actual_deserializer_valueClass.getClass());
        
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): True}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.NullsFailProvider#constructForProperty(com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.returnsFrom {@code return NullsFailProvider.constructForProperty(prop);}
 *  */
    @Test
    public void test_findNullProvider_PropNotEqualsNull() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        ResolvedRecursiveType _declaredType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        Nulls nulls = Nulls.FAIL;
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class nullsType = Class.forName("com.fasterxml.jackson.annotation.Nulls");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method _findNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("_findNullProvider", deserializationContextType, singleViewType, nullsType, jsonDeserializerType);
        _findNullProviderMethod.setAccessible(true);
        java.lang.Object[] _findNullProviderMethodArguments = new java.lang.Object[4];
        _findNullProviderMethodArguments[0] = ((Object) null);
        _findNullProviderMethodArguments[1] = singleView;
        _findNullProviderMethodArguments[2] = nulls;
        _findNullProviderMethodArguments[3] = ((Object) null);
        NullsFailProvider actual = ((NullsFailProvider) _findNullProviderMethod.invoke(throwableDeserializer, _findNullProviderMethodArguments));
        
        NullsFailProvider expected = ((NullsFailProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider"));
        PropertyName _name1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_name1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _value);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name", _name1);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type", _declaredType);
        
        PropertyName expected_name = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
        PropertyName actual_name = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        org.junit.Assert.assertEquals(expected_name, actual_name);
        
        JavaType expected_type = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        org.junit.Assert.assertEquals(expected_type, actual_type);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.annotation.Nulls, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): True}
 * @utbot.executesCondition {@code (prop == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#handledType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NullsFailProvider.constructForRootValue(ctxt.constructType(valueDeser.handledType()));
 *  */
    @Test
    public void test_findNullProvider_ThrowNullPointerException() throws JsonMappingException  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        Nulls nulls = Nulls.FAIL;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider(StdDeserializer.java:1085) */
        failingDeserializer._findNullProvider(null, null, nulls, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_findNullProvider(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.executesCondition {@code (nulls == Nulls.FAIL): False}
 * @utbot.executesCondition {@code (nulls == Nulls.AS_EMPTY): True}
 * @utbot.executesCondition {@code (valueDeser == null): False}
 * @utbot.executesCondition {@code (valueDeser instanceof BeanDeserializerBase): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.BeanDeserializerBase#getValueInstantiator()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.ValueInstantiator#canCreateUsingDefault()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !vi.canCreateUsingDefault()
 *  */
    @Test
    public void test_findNullProvider_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        Nulls nulls = Nulls.AS_EMPTY;
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider] produces [java.lang.NullPointerException] */
        stdDelegatingDeserializer._findNullProvider(null, null, nulls, beanAsArrayBuilderDeserializer);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _findNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.annotation.Nulls, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test
    public void test_findNullProvider1() throws Exception  {
        ObjectArrayDeserializer objectArrayDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Nulls nulls = Nulls.FAIL;
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class nullsType = Class.forName("com.fasterxml.jackson.annotation.Nulls");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method _findNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("_findNullProvider", implType, multiViewType, nullsType, jsonDeserializerType);
        _findNullProviderMethod.setAccessible(true);
        java.lang.Object[] _findNullProviderMethodArguments = new java.lang.Object[4];
        _findNullProviderMethodArguments[0] = impl;
        _findNullProviderMethodArguments[1] = multiView;
        _findNullProviderMethodArguments[2] = nulls;
        _findNullProviderMethodArguments[3] = ((Object) null);
        NullsFailProvider actual = ((NullsFailProvider) _findNullProviderMethod.invoke(objectArrayDeserializer, _findNullProviderMethodArguments));
        
        NullsFailProvider expected = ((NullsFailProvider) createInstance("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider"));
        PropertyName _name1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_name1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name", _name1);
        
        PropertyName expected_name = ((PropertyName) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
        PropertyName actual_name = ((PropertyName) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_name"));
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        org.junit.Assert.assertEquals(expected_name, actual_name);
        
        JavaType actual_type = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", "_type"));
        assertNull(actual_type);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findNullProvider(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.annotation.Nulls, com.fasterxml.jackson.databind.JsonDeserializer)
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider2() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        throwableDeserializer._findNullProvider(impl, null, nulls, stdDelegatingDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider3() throws Exception  {
        DOMDeserializer.NodeDeserializer nodeDeserializer = new DOMDeserializer.NodeDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        nodeDeserializer._findNullProvider(impl, null, nulls, stdDelegatingDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider4() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        failingDeserializer._findNullProvider(impl, null, nulls, stdDelegatingDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider5() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer1 = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer1, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _deserializer1);
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer1);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        failingDeserializer._findNullProvider(impl, null, nulls, stdDelegatingDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider6() throws Exception  {
        DateDeserializers.DateDeserializer dateDeserializer = new DateDeserializers.DateDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        
        dateDeserializer._findNullProvider(impl, null, nulls, typeWrappedDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider7() throws Exception  {
        DateDeserializers.DateDeserializer dateDeserializer = new DateDeserializers.DateDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        
        dateDeserializer._findNullProvider(impl, null, nulls, typeWrappedDeserializer);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider8() throws Exception  {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(typeWrappedDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer2 = new TypeWrappedDeserializer(null, typeWrappedDeserializer1);
        
        failingDeserializer._findNullProvider(impl, null, nulls, typeWrappedDeserializer2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_findNullProvider9() throws Exception  {
        com.fasterxml.jackson.databind.ext.CoreXMLDeserializers.Std std = new com.fasterxml.jackson.databind.ext.CoreXMLDeserializers.Std(null, 0);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Nulls nulls = Nulls.FAIL;
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", stdDelegatingDeserializer);
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer = new TypeWrappedDeserializer(null, stdDelegatingDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer1 = new TypeWrappedDeserializer(null, typeWrappedDeserializer);
        TypeWrappedDeserializer typeWrappedDeserializer2 = new TypeWrappedDeserializer(null, typeWrappedDeserializer1);
        TypeWrappedDeserializer typeWrappedDeserializer3 = new TypeWrappedDeserializer(null, typeWrappedDeserializer2);
        
        std._findNullProvider(impl, null, nulls, typeWrappedDeserializer3);
    }
    
    @Test
    public void test_findNullProvider10() throws Throwable  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        String _key = "";
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_key", _key);
        Nulls nulls = Nulls.FAIL;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.MapProperty.getType(MapProperty.java:163)
            com.fasterxml.jackson.databind.deser.impl.NullsFailProvider.constructForProperty(NullsFailProvider.java:26)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._findNullProvider(StdDeserializer.java:1087) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class nullsType = Class.forName("com.fasterxml.jackson.annotation.Nulls");
        Class jsonDeserializerType = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Method _findNullProviderMethod = stdDeserializerClazz.getDeclaredMethod("_findNullProvider", implType, mapPropertyType, nullsType, jsonDeserializerType);
        _findNullProviderMethod.setAccessible(true);
        java.lang.Object[] _findNullProviderMethodArguments = new java.lang.Object[4];
        _findNullProviderMethodArguments[0] = impl;
        _findNullProviderMethodArguments[1] = mapProperty;
        _findNullProviderMethodArguments[2] = nulls;
        _findNullProviderMethodArguments[3] = ((Object) null);
        try {
            _findNullProviderMethod.invoke(throwableDeserializer, _findNullProviderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._byteOverflow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _byteOverflow(int)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_byteOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Byte.MIN_VALUE || value > 255);}
 *  */
    @Test
    public void test_byteOverflow_ValueGreaterOrEqualByteMIN_VALUEOrValueLessOrEqual255() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        boolean actual = throwableDeserializer._byteOverflow(-128);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_byteOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Byte.MIN_VALUE || value > 255);}
 *  */
    @Test
    public void test_byteOverflow_ValueLessThanByteMIN_VALUEOrValueLessOrEqual255() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._byteOverflow(-129);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_byteOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Byte.MIN_VALUE || value > 255);}
 *  */
    @Test
    public void test_byteOverflow_ValueLessThanByteMIN_VALUEOrValueGreaterThan255() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._byteOverflow(256);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._isIntNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isIntNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): False}
 *  */
    @Test
    public void test_isIntNumber_LenLessOrEqualZero() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "";
        
        boolean actual = throwableDeserializer._isIntNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isIntNumber_CEqualsCharOrCEqualsChar() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "+";
        
        boolean actual = throwableDeserializer._isIntNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isIntNumber_CEqualsCharOrCEqualsChar_1() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "-";
        
        boolean actual = throwableDeserializer._isIntNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): False}
 * @utbot.iterates iterate the loop {@code for(; i < len; ++i)} once
 *  */
    @Test
    public void test_isIntNumber_ChLessThan0() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "- ";
        
        boolean actual = throwableDeserializer._isIntNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): True}
 * @utbot.iterates iterate the loop {@code for(; i < len; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isIntNumber_ChGreaterOrEqual0() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        String string = "+2";
        
        boolean actual = throwableDeserializer._isIntNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): False}
 * @utbot.iterates iterate the loop {@code for(; i < len; ++i)} once
 *  */
    @Test
    public void test_isIntNumber_ChGreaterThan9() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = "-:";
        
        boolean actual = failingDeserializer._isIntNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): True}
 * @utbot.executesCondition {@code ((c == '-' || c == '+')): False}
 * @utbot.iterates iterate the loop {@code for(; i < len; ++i)} once
 *  */
    @Test
    public void test_isIntNumber_CNotEqualsCharOrCNotEqualsChar() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        String string = ":";
        
        boolean actual = failingDeserializer._isIntNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _isIntNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_isIntNumber(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = text.length();
 *  */
    @Test
    public void test_isIntNumber_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer._isIntNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._isIntNumber(StdDeserializer.java:929) */
        throwableDeserializer._isIntNumber(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatFeature
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findFormatFeature(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)
    
    @Test
    public void testFindFormatFeature1() throws Exception  {
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = new DateDeserializers.SqlDateDeserializer();
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        Class class1 = Object.class;
        JsonFormat.Feature feature = JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
        
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class class1Type = Class.forName("java.lang.Class");
        Class featureType = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Feature");
        Method findFormatFeatureMethod = stdDeserializerClazz.getDeclaredMethod("findFormatFeature", implType, valueInjectorType, class1Type, featureType);
        findFormatFeatureMethod.setAccessible(true);
        java.lang.Object[] findFormatFeatureMethodArguments = new java.lang.Object[4];
        findFormatFeatureMethodArguments[0] = impl;
        findFormatFeatureMethodArguments[1] = valueInjector;
        findFormatFeatureMethodArguments[2] = class1;
        findFormatFeatureMethodArguments[3] = feature;
        Boolean actual = ((Boolean) findFormatFeatureMethod.invoke(sqlDateDeserializer, findFormatFeatureMethodArguments));
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findFormatFeature(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty, java.lang.Class, com.fasterxml.jackson.annotation.JsonFormat$Feature)
    
    @Test
    public void testFindFormatFeature2() throws Throwable  {
        MapEntryDeserializer mapEntryDeserializer = ((MapEntryDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        ConfigOverrides _configOverrides = ((ConfigOverrides) createInstance("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        LinkedHashMap _overrides = new LinkedHashMap();
        setField(_configOverrides, "com.fasterxml.jackson.databind.cfg.ConfigOverrides", "_overrides", _overrides);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides", _configOverrides);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatFeature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.annotation.JsonFormat$Features.get(JsonFormat.java:378)
            com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(JsonFormat.java:773)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findFormatFeature(StdDeserializer.java:1023) */
        Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class classType = Class.forName("java.lang.Class");
        Class featureType = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Feature");
        Method findFormatFeatureMethod = stdDeserializerClazz.getDeclaredMethod("findFormatFeature", implType, valueInjectorType, classType, featureType);
        findFormatFeatureMethod.setAccessible(true);
        java.lang.Object[] findFormatFeatureMethodArguments = new java.lang.Object[4];
        findFormatFeatureMethodArguments[0] = impl;
        findFormatFeatureMethodArguments[1] = valueInjector;
        findFormatFeatureMethodArguments[2] = ((Object) null);
        findFormatFeatureMethodArguments[3] = ((Object) null);
        try {
            findFormatFeatureMethod.invoke(mapEntryDeserializer, findFormatFeatureMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._neitherNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _neitherNull(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_neitherNull(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (a != null) && (b != null);}
 *  */
    @Test
    public void test_neitherNull_ANotEqualsNullAndBNotEqualsNull() {
        byte[] byteArray = {};
        
        boolean actual = StdDeserializer._neitherNull(byteArray, byteArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_neitherNull(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (a != null) && (b != null);}
 *  */
    @Test
    public void test_neitherNull_AEqualsNullAndBEqualsNull_1() {
        byte[] byteArray = {};
        
        boolean actual = StdDeserializer._neitherNull(byteArray, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_neitherNull(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return (a != null) && (b != null);}
 *  */
    @Test
    public void test_neitherNull_AEqualsNullAndBEqualsNull() {
        boolean actual = StdDeserializer._neitherNull(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.findContextualValueDeserializer(type, property);
 *  */
    @Test
    public void testFindDeserializer_ThrowNullPointerException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findDeserializer(StdDeserializer.java:920) */
        throwableDeserializer.findDeserializer(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ctxt.findContextualValueDeserializer(type, property);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindDeserializer_ThrowIllegalArgumentException() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        throwableDeserializer.findDeserializer(impl, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._shortOverflow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _shortOverflow(int)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_shortOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Short.MIN_VALUE || value > Short.MAX_VALUE);}
 *  */
    @Test
    public void test_shortOverflow_ValueGreaterOrEqualShortMIN_VALUEOrValueLessOrEqualShortMAX_VALUE() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        boolean actual = throwableDeserializer._shortOverflow(-255);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_shortOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Short.MIN_VALUE || value > Short.MAX_VALUE);}
 *  */
    @Test
    public void test_shortOverflow_ValueLessThanShortMIN_VALUEOrValueLessOrEqualShortMAX_VALUE() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._shortOverflow(-32769);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_shortOverflow(int)}
 * @utbot.returnsFrom {@code return (value < Short.MIN_VALUE || value > Short.MAX_VALUE);}
 *  */
    @Test
    public void test_shortOverflow_ValueLessThanShortMIN_VALUEOrValueGreaterThanShortMAX_VALUE() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._shortOverflow(32768);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._intOverflow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _intOverflow(long)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_intOverflow(long)}
 * @utbot.returnsFrom {@code return (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE);}
 *  */
    @Test
    public void test_intOverflow_ValueGreaterOrEqualIntegerMIN_VALUEOrValueLessOrEqualIntegerMAX_VALUE() throws Exception  {
        ThrowableDeserializer throwableDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        
        boolean actual = throwableDeserializer._intOverflow(-2147483648L);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_intOverflow(long)}
 * @utbot.returnsFrom {@code return (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE);}
 *  */
    @Test
    public void test_intOverflow_ValueLessThanIntegerMIN_VALUEOrValueLessOrEqualIntegerMAX_VALUE() {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        
        boolean actual = stdDelegatingDeserializer._intOverflow(-6917529029788563455L);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_intOverflow(long)}
 * @utbot.returnsFrom {@code return (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE);}
 *  */
    @Test
    public void test_intOverflow_ValueLessThanIntegerMIN_VALUEOrValueGreaterThanIntegerMAX_VALUE() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        boolean actual = failingDeserializer._intOverflow(35182224605186L);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.StdDeserializer._nonNullNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _nonNullNumber(java.lang.Number)
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_nonNullNumber(java.lang.Number)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void test_nonNullNumber_NNotEqualsNull() {
        StdDelegatingDeserializer stdDelegatingDeserializer = new StdDelegatingDeserializer(((StdDelegatingDeserializer) null));
        Long long1 = 0L;
        
        Long actual = ((Long) stdDelegatingDeserializer._nonNullNumber(long1));
        
        org.junit.Assert.assertEquals(long1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.StdDeserializer#_nonNullNumber(java.lang.Number)}
 * @utbot.executesCondition {@code (n == null): True}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void test_nonNullNumber_NEqualsNull() {
        FailingDeserializer failingDeserializer = new FailingDeserializer(null);
        
        Integer actual = ((Integer) failingDeserializer._nonNullNumber(null));
        
        Integer expected = 0;
        
        org.junit.Assert.assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1091487914551900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1091487914551900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1091487914559700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091487914551900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091487914559700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1091487915063700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091487915063700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091487915068600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091487915063700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091487915068600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091487916256400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091487916256400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091487916270900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091487916256400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091487916270900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1091487917594800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1091487917594800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1091487917601000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1091487917594800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1091487917601000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

