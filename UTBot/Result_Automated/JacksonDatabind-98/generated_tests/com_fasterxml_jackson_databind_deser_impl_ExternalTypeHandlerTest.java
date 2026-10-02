package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.util.BitSet;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.util.TokenBufferReadContext;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_impl_ExternalTypeHandlerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.start
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method start()
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#start()}
 * @utbot.returnsFrom {@code return new ExternalTypeHandler(this);}
 *  */
    @Test
    public void testStart_Return() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        ExternalTypeHandler actual = externalTypeHandler.start();
        
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        java.lang.Object[] externalTypeHandlerConstructorArguments1 = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments1[0] = ((Object) null);
        externalTypeHandlerConstructorArguments1[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments1[2] = ((Object) null);
        externalTypeHandlerConstructorArguments1[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments1[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler expected = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments1));
        
        JavaType actual_beanType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_beanType"));
        assertNull(actual_beanType);
        
        Object expected_properties = getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object actual_properties = getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        int expected_propertiesSize = getArrayLength(expected_properties);
        assertEquals(expected_propertiesSize, getArrayLength(actual_properties));
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        Map actual_nameToPropertyIndex = ((Map) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        assertNull(actual_nameToPropertyIndex);
        
        java.lang.String[] expected_typeIds = ((java.lang.String[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        java.lang.String[] actual_typeIds = ((java.lang.String[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        int expected_typeIdsSize = expected_typeIds.length;
        assertEquals(expected_typeIdsSize, actual_typeIds.length);
        assertTrue(deepEquals(expected_typeIds, actual_typeIds));
        
        com.fasterxml.jackson.databind.util.TokenBuffer[] expected_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        com.fasterxml.jackson.databind.util.TokenBuffer[] actual_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        int expected_tokensSize = expected_tokens.length;
        assertEquals(expected_tokensSize, actual_tokens.length);
        assertTrue(deepEquals(expected_tokens, actual_tokens));
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties0 = get(externalTypeHandler_properties, 0);
        Map finalExternalTypeHandler_nameToPropertyIndex = ((Map) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
        
        assertNull(finalExternalTypeHandler_properties0);
        
        assertNull(finalExternalTypeHandler_nameToPropertyIndex);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.builder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method builder(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#builder(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new Builder(beanType);}
 *  */
    @Test
    public void testBuilder_Return() throws Exception  {
        ExternalTypeHandler.Builder actual = ExternalTypeHandler.builder(null);
        
        ExternalTypeHandler.Builder expected = ((ExternalTypeHandler.Builder) createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder"));
        ArrayList _properties = new ArrayList();
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_properties", _properties);
        HashMap _nameToPropertyIndex = new HashMap();
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_nameToPropertyIndex", _nameToPropertyIndex);
        
        JavaType actual_beanType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_beanType"));
        assertNull(actual_beanType);
        
        List expected_properties = ((List) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_properties"));
        List actual_properties = ((List) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_properties"));
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        Map expected_nameToPropertyIndex = ((Map) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_nameToPropertyIndex"));
        Map actual_nameToPropertyIndex = ((Map) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", "_nameToPropertyIndex"));
        assertTrue(deepEquals(expected_nameToPropertyIndex, actual_nameToPropertyIndex));
        
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method builder(com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#builder(com.fasterxml.jackson.databind.JavaType)}
     */
    @Test(timeout = 1000L)
    public void testBuilder() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        ExternalTypeHandler.builder(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:267) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:279) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:263) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:195)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -254;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:159)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:195)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-1L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:762)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:164)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:195)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -255;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ConstantValueInstantiator _valueInstantiator = ((ConstantValueInstantiator) createInstance("com.fasterxml.jackson.databind.util.ConstantValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:195)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -255;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:229)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:195)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getName()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_10() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(collectionLikeTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = collectionLikeType;
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:283) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(_beanType, "Missing property '%s' for external type id '%s'", prop.getName(), _properties[i].getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_11() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        MergingSettableBeanProperty _property = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = _typePropertyName;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class collectionTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(collectionTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = collectionType;
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:281) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !extProp.hasDefaultType()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:272) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_5() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(_beanType, "Missing external type id property '%s'", extProp.getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typeDeserializer", _typeDeserializer);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:273) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(_beanType, "Missing external type id property '%s'", extProp.getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_typeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typeDeserializer", _typeDeserializer);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:273) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = extProp.getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:280) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:267) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:279) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:302) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:263) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = _properties.length;
 *  */
    @Test
    public void testComplete_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:260) */
        externalTypeHandler.complete(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 *  */
    @Test
    public void testComplete_IOf_tokensEqualsNull() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ManagedReferenceProperty _property = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        Object actual = externalTypeHandler.complete(null, impl, null);
        
        assertNull(actual);
        
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler_tokens, 0));
        
        assertNull(finalExternalTypeHandler_tokens0);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 *  */
    @Test
    public void testComplete_TokensEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException, NoSuchFieldException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        Object actual = externalTypeHandler.complete(null, null, null);
        
        assertNull(actual);
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties0 = get(externalTypeHandler_properties, 0);
        java.lang.String[] externalTypeHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds0 = ((String) get(externalTypeHandler_typeIds, 0));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler_tokens, 0));
        
        assertNull(finalExternalTypeHandler_properties0);
        
        assertNull(finalExternalTypeHandler_typeIds0);
        
        assertNull(finalExternalTypeHandler_tokens0);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 *  */
    @Test
    public void testComplete_ReturnBean() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        Object actual = externalTypeHandler.complete(null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: typeId == null
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_11() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:235) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: TokenBuffer tokens = _tokens[i];
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_21() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:208) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:206) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(bean.getClass(), "Missing property '%s' for external type id '%s'", prop.getName(), _properties[i].getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_61() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        MergingSettableBeanProperty _property = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:240) */
        externalTypeHandler.complete(null, impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportInputMismatch(bean.getClass(), "Missing property '%s' for external type id '%s'", prop.getName(), _properties[i].getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_81() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        MergingSettableBeanProperty _property = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:240) */
        externalTypeHandler.complete(null, null, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = _properties[i].getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_41() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:236) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.isRequired() || ctxt.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_51() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:238) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_71() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ManagedReferenceProperty _property = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:239) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: typeId == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_21() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:235) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenBuffer tokens = _tokens[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_31() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:208) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isScalarValue()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_91() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
            java.lang.String[] stringArray = {null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:217) */
            externalTypeHandler.complete(null, null, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_12() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:206) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = _properties.length; i < len; ++i)
 *  */
    @Test
    public void testComplete_ThrowNullPointerException1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:205) */
        externalTypeHandler.complete(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testComplete1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        MergingSettableBeanProperty _property = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[1] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:240) */
        externalTypeHandler.complete(jsonParserSequence, null, object);
    }
    
    @Test
    public void testComplete2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[3] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[3] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
        externalTypeHandler.complete(treeTraversingParser, null, object);
    }
    
    @Test
    public void testComplete3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        stringArray[1] = string;
        stringArray[2] = string;
        stringArray[3] = string;
        stringArray[4] = string;
        stringArray[5] = string;
        stringArray[6] = string;
        stringArray[7] = string;
        stringArray[8] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        tokenBufferArray[1] = tokenBuffer;
        tokenBufferArray[2] = tokenBuffer;
        tokenBufferArray[3] = tokenBuffer;
        tokenBufferArray[4] = tokenBuffer;
        tokenBufferArray[5] = tokenBuffer;
        tokenBufferArray[6] = tokenBuffer;
        tokenBufferArray[7] = tokenBuffer;
        tokenBufferArray[8] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
        externalTypeHandler.complete(readerBasedJsonParser, null, object);
    }
    
    @Test
    public void testComplete4() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBufferReadContext _parentContext = ((TokenBufferReadContext) createInstance("com.fasterxml.jackson.databind.util.TokenBufferReadContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[1] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1107)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(uTF8DataInputJsonParser, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete5() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 8L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:220) */
            externalTypeHandler.complete(filteringParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[1] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._getSourceReference(ParserBase.java:1098)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2815)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:286)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:342)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
        externalTypeHandler.complete(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testComplete7() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 2);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _parentContext = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor");
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[1] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[2] = tokenBuffer1;
            tokenBufferArray[3] = tokenBuffer1;
            tokenBufferArray[4] = tokenBuffer1;
            tokenBufferArray[5] = tokenBuffer1;
            tokenBufferArray[6] = tokenBuffer1;
            tokenBufferArray[7] = tokenBuffer1;
            tokenBufferArray[8] = tokenBuffer1;
            tokenBufferArray[9] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1107)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(filteringParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[1] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
        externalTypeHandler.complete(jsonParserSequence, impl, object);
    }
    
    @Test
    public void testComplete9() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonReadContext _parentContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
        externalTypeHandler.complete(jsonParserSequence, null, object);
    }
    
    @Test
    public void testComplete10() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[13];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 4L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:358)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(filteringParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete11() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 2);
            java.lang.String[] stringArray = new java.lang.String[10];
            String string = "";
            stringArray[2] = string;
            stringArray[3] = string;
            stringArray[4] = string;
            stringArray[5] = string;
            stringArray[6] = string;
            stringArray[7] = string;
            stringArray[8] = string;
            stringArray[9] = string;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[1] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[2] = tokenBuffer1;
            tokenBufferArray[3] = tokenBuffer1;
            tokenBufferArray[4] = tokenBuffer1;
            tokenBufferArray[5] = tokenBuffer1;
            tokenBufferArray[6] = tokenBuffer1;
            tokenBufferArray[7] = tokenBuffer1;
            tokenBufferArray[8] = tokenBuffer1;
            tokenBufferArray[9] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1107)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(jsonParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete12() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            java.lang.String[] stringArray = new java.lang.String[9];
            String string = "";
            stringArray[0] = string;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.ParserBase._getSourceReference(ParserBase.java:1098)
                com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2815)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:286)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:342)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(uTF8DataInputJsonParser, null, object);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    @Test
    public void testComplete13() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            java.lang.String[] stringArray = new java.lang.String[9];
            String string = "";
            stringArray[0] = string;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:353)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:246) */
            externalTypeHandler.complete(uTF8DataInputJsonParser, null, object);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = MismatchedInputException.class)
    public void testComplete14() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 2);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[32];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        Object object = new Object();
        
        externalTypeHandler.complete(nonBlockingJsonParser, impl, object);
    }
    
    @Test(expected = MismatchedInputException.class)
    public void testComplete15() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        MergingSettableBeanProperty _property = ((MergingSettableBeanProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(_property, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(treeTraversingParser, impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:342) */
        externalTypeHandler._deserializeAndSet(null, null, null, -256, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[2];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            byte[] _currentValue = {};
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue", _currentValue);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:346) */
            externalTypeHandler._deserializeAndSet(uTF8DataInputJsonParser, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = p2.nextToken();
 *  */
    @Test
    public void test_deserializeAndSet_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1880)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1793)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1374)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:343) */
            externalTypeHandler._deserializeAndSet(uTF8DataInputJsonParser, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[2];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[1] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:346) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:342) */
        externalTypeHandler._deserializeAndSet(null, null, null, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:342) */
        externalTypeHandler._deserializeAndSet(null, null, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowNullPointerException_2() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:346) */
            externalTypeHandler._deserializeAndSet(jsonParserSequence, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowNullPointerException_3() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[1] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:346) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.ExtTypedProperty#getProperty()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.SettableBeanProperty#set(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test
    public void test_deserializeAndSet_ThrowNullPointerException_4() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            extTypedPropertyArray[0] = extTypedProperty;
            Object extTypedProperty1 = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            extTypedPropertyArray[1] = extTypedProperty1;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            tokenBufferArray[1] = ((TokenBuffer) extTypedProperty1);
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException] */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_NULL): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTokenLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Parser#setLocation(com.fasterxml.jackson.core.JsonLocation)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#type(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_deserialize_TEqualsJsonTokenVALUE_NULL() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            
            Object actual = externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, null);
            
            assertNull(actual);
            
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens1 = ((TokenBuffer) get(externalTypeHandler_tokens, 1));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens1 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens2 = ((TokenBuffer) get(externalTypeHandler_tokens1, 2));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens2 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens3 = ((TokenBuffer) get(externalTypeHandler_tokens2, 3));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens3 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens4 = ((TokenBuffer) get(externalTypeHandler_tokens3, 4));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens4 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens5 = ((TokenBuffer) get(externalTypeHandler_tokens4, 5));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens5 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens6 = ((TokenBuffer) get(externalTypeHandler_tokens5, 6));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens6 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens7 = ((TokenBuffer) get(externalTypeHandler_tokens6, 7));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens7 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens8 = ((TokenBuffer) get(externalTypeHandler_tokens7, 8));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens8 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens9 = ((TokenBuffer) get(externalTypeHandler_tokens8, 9));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens9 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens10 = ((TokenBuffer) get(externalTypeHandler_tokens9, 10));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens10 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens11 = ((TokenBuffer) get(externalTypeHandler_tokens10, 11));
            
            assertNull(finalExternalTypeHandler_tokens1);
            
            assertNull(finalExternalTypeHandler_tokens2);
            
            assertNull(finalExternalTypeHandler_tokens3);
            
            assertNull(finalExternalTypeHandler_tokens4);
            
            assertNull(finalExternalTypeHandler_tokens5);
            
            assertNull(finalExternalTypeHandler_tokens6);
            
            assertNull(finalExternalTypeHandler_tokens7);
            
            assertNull(finalExternalTypeHandler_tokens8);
            
            assertNull(finalExternalTypeHandler_tokens9);
            
            assertNull(finalExternalTypeHandler_tokens10);
            
            assertNull(finalExternalTypeHandler_tokens11);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserialize_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:317) */
        externalTypeHandler._deserialize(null, null, 129, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTokenLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Parser#setLocation(com.fasterxml.jackson.core.JsonLocation)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#type(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Parser#_currentObject()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = p2.nextToken();
 *  */
    @Test
    public void test_deserialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1880)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1793)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1374)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:318) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, null);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:317) */
        externalTypeHandler._deserialize(null, null, 1, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonParser p2 = _tokens[index].asParser(p);
 *  */
    @Test
    public void test_deserialize_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:317) */
        externalTypeHandler._deserialize(null, null, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, int, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserialize1() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        tokenBufferArray[1] = tokenBuffer;
        tokenBufferArray[2] = tokenBuffer;
        tokenBufferArray[3] = tokenBuffer;
        tokenBufferArray[4] = tokenBuffer;
        tokenBufferArray[5] = tokenBuffer;
        tokenBufferArray[6] = tokenBuffer;
        tokenBufferArray[7] = tokenBuffer;
        tokenBufferArray[8] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
    }
    
    @Test
    public void test_deserialize2() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, null);
    }
    
    @Test
    public void test_deserialize3() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _parentContext = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 12);
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", 12);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[1] = tokenBuffer1;
        tokenBufferArray[2] = tokenBuffer1;
        tokenBufferArray[3] = tokenBuffer1;
        tokenBufferArray[4] = tokenBuffer1;
        tokenBufferArray[5] = tokenBuffer1;
        tokenBufferArray[6] = tokenBuffer1;
        tokenBufferArray[7] = tokenBuffer1;
        tokenBufferArray[8] = tokenBuffer1;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, null);
    }
    
    @Test
    public void test_deserialize4() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue", _currentValue);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(jsonParserSequence, impl, 0, null);
    }
    
    @Test
    public void test_deserialize5() throws Exception  {
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[2];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            JsonWriteContext _parent = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _parent);
            String _currentName = "";
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
            Object _currentValue = createInstance("java.lang.Object");
            setField(_parentContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentValue", _currentValue);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(jsonParserSequence, impl, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize6() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _parentContext = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor");
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 16777216);
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", 16777216);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        tokenBufferArray[1] = tokenBuffer;
        tokenBufferArray[2] = tokenBuffer;
        tokenBufferArray[3] = tokenBuffer;
        tokenBufferArray[4] = tokenBuffer;
        tokenBufferArray[5] = tokenBuffer;
        tokenBufferArray[6] = tokenBuffer;
        tokenBufferArray[7] = tokenBuffer;
        tokenBufferArray[8] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
    }
    
    @Test
    public void test_deserialize7() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonWriteContext _parentContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(jsonParserDelegate, null, 0, string);
    }
    
    @Test
    public void test_deserialize8() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonReadContext _parentContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string);
    }
    
    @Test
    public void test_deserialize9() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonReadContext _parentContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(filteringParserDelegate, impl, 0, null);
    }
    
    @Test
    public void test_deserialize10() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBufferReadContext _parentContext = ((TokenBufferReadContext) createInstance("com.fasterxml.jackson.databind.util.TokenBufferReadContext"));
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -2147481598);
        setField(_parentContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -2147481598);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(jsonParserSequence, impl, 0, null);
    }
    
    @Test
    public void test_deserialize11() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = 1006638097;
            _tokens[0] = ((Object) integer);
            char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
            _tokens[1] = ((Object) charArray);
            _tokens[2] = ((Object) charArray);
            _tokens[3] = ((Object) charArray);
            _tokens[4] = ((Object) charArray);
            _tokens[5] = ((Object) charArray);
            _tokens[6] = ((Object) charArray);
            _tokens[7] = ((Object) charArray);
            _tokens[8] = ((Object) charArray);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize12() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 4L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:332) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, impl, 0, null);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize13() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            String string = "";
            _tokens[0] = ((Object) string);
            byte[] byteArray = {(byte) 0};
            _tokens[1] = ((Object) byteArray);
            _tokens[2] = ((Object) byteArray);
            _tokens[3] = ((Object) byteArray);
            _tokens[4] = ((Object) byteArray);
            _tokens[5] = ((Object) byteArray);
            _tokens[6] = ((Object) byteArray);
            _tokens[7] = ((Object) byteArray);
            _tokens[8] = ((Object) byteArray);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            String string1 = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string1);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize14() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 3L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            tokenBufferArray[1] = tokenBuffer;
            tokenBufferArray[2] = tokenBuffer;
            tokenBufferArray[3] = tokenBuffer;
            tokenBufferArray[4] = tokenBuffer;
            tokenBufferArray[5] = tokenBuffer;
            tokenBufferArray[6] = tokenBuffer;
            tokenBufferArray[7] = tokenBuffer;
            tokenBufferArray[8] = tokenBuffer;
            tokenBufferArray[9] = tokenBuffer;
            tokenBufferArray[10] = tokenBuffer;
            tokenBufferArray[11] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1100)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, impl, 0, string);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize15() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonReadContext _parentContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parentContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        Object _currentValue = createInstance("java.lang.Object");
        setField(_parentContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentValue", _currentValue);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_parentContext", _parentContext);
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
        externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
    }
    
    @Test
    public void test_deserialize16() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1107)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize17() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 2L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:332) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize18() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    @Test
    public void test_deserialize19() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        Class segmentClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        com.fasterxml.jackson.core.JsonToken[] prevTOKEN_TYPES_BY_INDEX = ((com.fasterxml.jackson.core.JsonToken[]) getStaticFieldValue(segmentClazz, "TOKEN_TYPES_BY_INDEX"));
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.core.JsonToken[] tokenTypesByIndex = new com.fasterxml.jackson.core.JsonToken[16];
            JsonToken jsonToken = JsonToken.START_OBJECT;
            tokenTypesByIndex[1] = jsonToken;
            JsonToken jsonToken1 = JsonToken.END_OBJECT;
            tokenTypesByIndex[2] = jsonToken1;
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            tokenTypesByIndex[3] = jsonToken2;
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            tokenTypesByIndex[4] = jsonToken3;
            JsonToken jsonToken4 = JsonToken.FIELD_NAME;
            tokenTypesByIndex[5] = jsonToken4;
            JsonToken jsonToken5 = JsonToken.VALUE_EMBEDDED_OBJECT;
            tokenTypesByIndex[6] = jsonToken5;
            JsonToken jsonToken6 = JsonToken.VALUE_STRING;
            tokenTypesByIndex[7] = jsonToken6;
            JsonToken jsonToken7 = JsonToken.VALUE_NUMBER_INT;
            tokenTypesByIndex[8] = jsonToken7;
            JsonToken jsonToken8 = JsonToken.VALUE_NUMBER_FLOAT;
            tokenTypesByIndex[9] = jsonToken8;
            JsonToken jsonToken9 = JsonToken.VALUE_TRUE;
            tokenTypesByIndex[10] = jsonToken9;
            JsonToken jsonToken10 = JsonToken.VALUE_FALSE;
            tokenTypesByIndex[11] = jsonToken10;
            JsonToken jsonToken11 = JsonToken.VALUE_NULL;
            tokenTypesByIndex[12] = jsonToken11;
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", tokenTypesByIndex);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[17];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1880)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1793)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1374)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:318) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, null);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize20() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class mapType = Class.forName("java.util.Map");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) null);
            externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(delegate, "com.fasterxml.jackson.core.JsonParser", "_features", 8192);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1096)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:326) */
            externalTypeHandler._deserialize(jsonParserDelegate, null, 0, string);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHandleTypePropertyValue_MapGet() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        String string = "";
        
        boolean actual = externalTypeHandler.handleTypePropertyValue(null, null, string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: typeId
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowClassCastException_1() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = new Object();
        linkedHashMap.put(null, object);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return _handleTypePropertyValue(p, ctxt, propName, bean, typeId, ((Integer) ob).intValue());
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = Integer.MIN_VALUE;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:109)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: typeId
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowClassCastException() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = new Object();
        linkedHashMap.put(null, object);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object ob = _nameToPropertyIndex.get(propName);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:85) */
        externalTypeHandler.handleTypePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String typeId = p.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = new Object();
        linkedHashMap.put(null, object);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:89) */
        externalTypeHandler.handleTypePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _handleTypePropertyValue(p, ctxt, propName, bean, typeId, ((Integer) ob).intValue());
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:110)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String typeId = p.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_4() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = new Object();
        linkedHashMap.put(null, object);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1854)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:89) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _handleTypePropertyValue(p, ctxt, propName, bean, typeId, ((Integer) ob).intValue());
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_2() throws Exception  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:109)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_handleTypePropertyValue_BooleanCanDeserializeInitializedByBeanEqualsNullAndIndexOf_tokensEqualsNull_1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        byte[] byteArray = {};
        
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class _typePropertyNameType = Class.forName("java.lang.String");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, _typePropertyNameType, byteArrayType, _typePropertyNameType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = _typePropertyName;
        _handleTypePropertyValueMethodArguments[3] = ((Object) byteArray);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        boolean actual = ((Boolean) _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments));
        
        assertTrue(actual);
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties1 = get(externalTypeHandler_properties, 1);
        Object externalTypeHandler_properties1 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties2 = get(externalTypeHandler_properties1, 2);
        Object externalTypeHandler_properties2 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties3 = get(externalTypeHandler_properties2, 3);
        Object externalTypeHandler_properties3 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties4 = get(externalTypeHandler_properties3, 4);
        Object externalTypeHandler_properties4 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties5 = get(externalTypeHandler_properties4, 5);
        Object externalTypeHandler_properties5 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties6 = get(externalTypeHandler_properties5, 6);
        Object externalTypeHandler_properties6 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties7 = get(externalTypeHandler_properties6, 7);
        Object externalTypeHandler_properties7 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties8 = get(externalTypeHandler_properties7, 8);
        java.lang.String[] externalTypeHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds0 = ((String) get(externalTypeHandler_typeIds, 0));
        java.lang.String[] externalTypeHandler_typeIds1 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds1 = ((String) get(externalTypeHandler_typeIds1, 1));
        java.lang.String[] externalTypeHandler_typeIds2 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds2 = ((String) get(externalTypeHandler_typeIds2, 2));
        java.lang.String[] externalTypeHandler_typeIds3 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds3 = ((String) get(externalTypeHandler_typeIds3, 3));
        java.lang.String[] externalTypeHandler_typeIds4 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds4 = ((String) get(externalTypeHandler_typeIds4, 4));
        java.lang.String[] externalTypeHandler_typeIds5 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds5 = ((String) get(externalTypeHandler_typeIds5, 5));
        java.lang.String[] externalTypeHandler_typeIds6 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds6 = ((String) get(externalTypeHandler_typeIds6, 6));
        java.lang.String[] externalTypeHandler_typeIds7 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds7 = ((String) get(externalTypeHandler_typeIds7, 7));
        java.lang.String[] externalTypeHandler_typeIds8 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds8 = ((String) get(externalTypeHandler_typeIds8, 8));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens0 = ((TokenBuffer) get(externalTypeHandler_tokens, 0));
        
        assertNull(finalExternalTypeHandler_properties1);
        
        assertNull(finalExternalTypeHandler_properties2);
        
        assertNull(finalExternalTypeHandler_properties3);
        
        assertNull(finalExternalTypeHandler_properties4);
        
        assertNull(finalExternalTypeHandler_properties5);
        
        assertNull(finalExternalTypeHandler_properties6);
        
        assertNull(finalExternalTypeHandler_properties7);
        
        assertNull(finalExternalTypeHandler_properties8);
        
        assertNull(finalExternalTypeHandler_typeIds0);
        
        assertNull(finalExternalTypeHandler_typeIds1);
        
        assertNull(finalExternalTypeHandler_typeIds2);
        
        assertNull(finalExternalTypeHandler_typeIds3);
        
        assertNull(finalExternalTypeHandler_typeIds4);
        
        assertNull(finalExternalTypeHandler_typeIds5);
        
        assertNull(finalExternalTypeHandler_typeIds6);
        
        assertNull(finalExternalTypeHandler_typeIds7);
        
        assertNull(finalExternalTypeHandler_typeIds8);
        
        assertNull(finalExternalTypeHandler_tokens0);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_handleTypePropertyValue_BooleanCanDeserializeInitializedByBeanEqualsNullAndIndexOf_tokensEqualsNull() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class _typePropertyNameType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, _typePropertyNameType, objectType, _typePropertyNameType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = _typePropertyName;
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        boolean actual = ((Boolean) _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments));
        
        assertTrue(actual);
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties1 = get(externalTypeHandler_properties, 1);
        Object externalTypeHandler_properties1 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties2 = get(externalTypeHandler_properties1, 2);
        Object externalTypeHandler_properties2 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties3 = get(externalTypeHandler_properties2, 3);
        Object externalTypeHandler_properties3 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties4 = get(externalTypeHandler_properties3, 4);
        Object externalTypeHandler_properties4 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties5 = get(externalTypeHandler_properties4, 5);
        Object externalTypeHandler_properties5 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties6 = get(externalTypeHandler_properties5, 6);
        Object externalTypeHandler_properties6 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties7 = get(externalTypeHandler_properties6, 7);
        Object externalTypeHandler_properties7 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties8 = get(externalTypeHandler_properties7, 8);
        java.lang.String[] externalTypeHandler_typeIds = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds0 = ((String) get(externalTypeHandler_typeIds, 0));
        java.lang.String[] externalTypeHandler_typeIds1 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds1 = ((String) get(externalTypeHandler_typeIds1, 1));
        java.lang.String[] externalTypeHandler_typeIds2 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds2 = ((String) get(externalTypeHandler_typeIds2, 2));
        java.lang.String[] externalTypeHandler_typeIds3 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds3 = ((String) get(externalTypeHandler_typeIds3, 3));
        java.lang.String[] externalTypeHandler_typeIds4 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds4 = ((String) get(externalTypeHandler_typeIds4, 4));
        java.lang.String[] externalTypeHandler_typeIds5 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds5 = ((String) get(externalTypeHandler_typeIds5, 5));
        java.lang.String[] externalTypeHandler_typeIds6 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds6 = ((String) get(externalTypeHandler_typeIds6, 6));
        java.lang.String[] externalTypeHandler_typeIds7 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds7 = ((String) get(externalTypeHandler_typeIds7, 7));
        java.lang.String[] externalTypeHandler_typeIds8 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds8 = ((String) get(externalTypeHandler_typeIds8, 8));
        
        assertNull(finalExternalTypeHandler_properties1);
        
        assertNull(finalExternalTypeHandler_properties2);
        
        assertNull(finalExternalTypeHandler_properties3);
        
        assertNull(finalExternalTypeHandler_properties4);
        
        assertNull(finalExternalTypeHandler_properties5);
        
        assertNull(finalExternalTypeHandler_properties6);
        
        assertNull(finalExternalTypeHandler_properties7);
        
        assertNull(finalExternalTypeHandler_properties8);
        
        assertNull(finalExternalTypeHandler_typeIds0);
        
        assertNull(finalExternalTypeHandler_typeIds1);
        
        assertNull(finalExternalTypeHandler_typeIds2);
        
        assertNull(finalExternalTypeHandler_typeIds3);
        
        assertNull(finalExternalTypeHandler_typeIds4);
        
        assertNull(finalExternalTypeHandler_typeIds5);
        
        assertNull(finalExternalTypeHandler_typeIds6);
        
        assertNull(finalExternalTypeHandler_typeIds7);
        
        assertNull(finalExternalTypeHandler_typeIds8);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_handleTypePropertyValue_ReturnFalse() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        String string = " ";
        
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, stringType, objectType, stringType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = string;
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        boolean actual = ((Boolean) _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments));
        
        assertFalse(actual);
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties1 = get(externalTypeHandler_properties, 1);
        Object externalTypeHandler_properties1 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties2 = get(externalTypeHandler_properties1, 2);
        Object externalTypeHandler_properties2 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties3 = get(externalTypeHandler_properties2, 3);
        Object externalTypeHandler_properties3 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties4 = get(externalTypeHandler_properties3, 4);
        Object externalTypeHandler_properties4 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties5 = get(externalTypeHandler_properties4, 5);
        Object externalTypeHandler_properties5 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties6 = get(externalTypeHandler_properties5, 6);
        Object externalTypeHandler_properties6 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties7 = get(externalTypeHandler_properties6, 7);
        Object externalTypeHandler_properties7 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties8 = get(externalTypeHandler_properties7, 8);
        
        assertNull(finalExternalTypeHandler_properties1);
        
        assertNull(finalExternalTypeHandler_properties2);
        
        assertNull(finalExternalTypeHandler_properties3);
        
        assertNull(finalExternalTypeHandler_properties4);
        
        assertNull(finalExternalTypeHandler_properties5);
        
        assertNull(finalExternalTypeHandler_properties6);
        
        assertNull(finalExternalTypeHandler_properties7);
        
        assertNull(finalExternalTypeHandler_properties8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 12);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:114) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class _typePropertyNameType = Class.forName("java.lang.String");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, _typePropertyNameType, byteArrayType, _typePropertyNameType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = _typePropertyName;
        _handleTypePropertyValueMethodArguments[3] = ((Object) byteArray);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:121) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class _typePropertyNameType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, _typePropertyNameType, objectType, _typePropertyNameType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = _typePropertyName;
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:109) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, stringType, objectType, stringType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = ((Object) null);
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = -256;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowNullPointerException_3() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        String string = " ";
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:114) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, stringType, byteArrayType, stringType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = string;
        _handleTypePropertyValueMethodArguments[3] = ((Object) byteArray);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prop.hasTypePropertyName(propName)
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowNullPointerException_1() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 2);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:110) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, stringType, objectType, stringType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = ((Object) null);
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 1;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowNullPointerException_2() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = " ";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:121) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class _typePropertyNameType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, _typePropertyNameType, objectType, _typePropertyNameType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = _typePropertyName;
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = 0;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object,java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void test_handleTypePropertyValue_ThrowNullPointerException() throws Throwable  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._handleTypePropertyValue(ExternalTypeHandler.java:109) */
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class objectType = Class.forName("java.lang.Object");
        Class intType = int.class;
        Method _handleTypePropertyValueMethod = externalTypeHandlerClazz.getDeclaredMethod("_handleTypePropertyValue", jsonParserType, deserializationContextType, stringType, objectType, stringType, intType);
        _handleTypePropertyValueMethod.setAccessible(true);
        java.lang.Object[] _handleTypePropertyValueMethodArguments = new java.lang.Object[6];
        _handleTypePropertyValueMethodArguments[0] = ((Object) null);
        _handleTypePropertyValueMethodArguments[1] = ((Object) null);
        _handleTypePropertyValueMethodArguments[2] = ((Object) null);
        _handleTypePropertyValueMethodArguments[3] = ((Object) null);
        _handleTypePropertyValueMethodArguments[4] = ((Object) null);
        _handleTypePropertyValueMethodArguments[5] = -255;
        try {
            _handleTypePropertyValueMethod.invoke(externalTypeHandler, _handleTypePropertyValueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHandlePropertyValue_ObEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        String string = "";
        
        boolean actual = externalTypeHandler.handlePropertyValue(null, null, string, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 1073741824;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:172) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: int index = ((Integer) ob).intValue();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object object = new Object();
        linkedHashMap.put(null, object);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:171) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: Integer index = it.next();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNoSuchElementException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(null, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:145) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        ArrayList arrayList = new ArrayList();
        Integer integer = 1073741824;
        arrayList.add(integer);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        linkedHashMap.put(string, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:147) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Integer index = it.next();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowClassCastException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        linkedHashMap.put(string, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:145) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object ob = _nameToPropertyIndex.get(propName);
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class mapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, mapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:138) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(null, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.ExtTypedProperty#hasTypePropertyName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.hasTypePropertyName(propName)
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:174) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(null, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:172) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1854)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): False}
 * @utbot.executesCondition {@code (prop.hasTypePropertyName(propName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer integer = 0;
        linkedHashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:175) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        linkedHashMap.put(string, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:147) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.ExtTypedProperty#hasTypePropertyName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.hasTypePropertyName(propName)
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_9() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        ArrayList arrayList = new ArrayList();
        Integer integer = 0;
        arrayList.add(integer);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        linkedHashMap.put(string, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:150) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (ob == null): False}
 * @utbot.executesCondition {@code (ob instanceof List<?>): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        ArrayList arrayList = new ArrayList();
        Integer integer = 0;
        arrayList.add(integer);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        linkedHashMap.put(string, arrayList);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(javaTypeType, extTypedPropertyArrayType, linkedHashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[5];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = linkedHashMap;
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        externalTypeHandlerConstructorArguments[4] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:147) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1088851666361999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1088851666361999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1088851666374499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088851666361999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088851666374499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1088851669656600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1088851669656600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1088851669659100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088851669656600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088851669659100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1088851669942900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1088851669942900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1088851669944500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088851669942900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088851669944500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1088851670380899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1088851670380899.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1088851670382400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1088851670380899.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1088851670382400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

