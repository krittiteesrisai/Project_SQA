package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.HashMap;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector.Vanilla;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.util.BitSet;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues.Std;
import com.fasterxml.jackson.databind.InjectableValues;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        ExternalTypeHandler actual = externalTypeHandler.start();
        
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        java.lang.Object[] externalTypeHandlerConstructorArguments1 = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments1[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments1[1] = ((Object) null);
        externalTypeHandlerConstructorArguments1[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments1[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler expected = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments1));
        
        Object expected_properties = getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object actual_properties = getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        int expected_propertiesSize = getArrayLength(expected_properties);
        assertEquals(expected_propertiesSize, getArrayLength(actual_properties));
        assertTrue(deepEquals(expected_properties, actual_properties));
        
        HashMap actual_nameToPropertyIndex = ((HashMap) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_nameToPropertyIndex"));
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
        
        assertNull(finalExternalTypeHandler_properties0);
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:193) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:204) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:188) */
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
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:160)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:173)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:755)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
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
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:762)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:165)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -255;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:160)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
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
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:173)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:198) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Missing external type id property '%s'", extProp.getTypePropertyName());
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:199) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = extProp.getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_7() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:205) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getName()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_9() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:207) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Missing property '%s' for external type id '%s'", prop.getName(), _properties[i].getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_10() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        InnerClassProperty _property = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:206) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:193) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_8() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:204) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:188) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:185) */
        externalTypeHandler.complete(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)
    
    @Test
    public void testComplete1() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        Object object1 = createInstance("java.lang.Object");
        _creatorParameters[2] = object1;
        _creatorParameters[3] = object1;
        _creatorParameters[4] = object1;
        _creatorParameters[5] = object1;
        _creatorParameters[6] = object1;
        _creatorParameters[7] = object1;
        _creatorParameters[8] = object1;
        _creatorParameters[9] = object1;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = -2147483647;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._long(JsonLocationInstantiator.java:53)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, deserializationContextType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = ((Object) null);
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        Object object1 = createInstance("java.lang.Object");
        _creatorParameters[4] = object1;
        _creatorParameters[5] = object1;
        _creatorParameters[6] = object1;
        _creatorParameters[7] = object1;
        _creatorParameters[8] = object1;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = -2147483640;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._int(JsonLocationInstantiator.java:57)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(treeTraversingParser, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[9];
        Integer integer = 0;
        _creatorParameters[3] = ((Object) integer);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        _creatorParameters[4] = ((Object) propertyBasedCreator);
        _creatorParameters[5] = ((Object) propertyBasedCreator);
        _creatorParameters[6] = ((Object) propertyBasedCreator);
        _creatorParameters[7] = ((Object) propertyBasedCreator);
        _creatorParameters[8] = ((Object) propertyBasedCreator);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = -2147483647;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator cannot be cast to class java.lang.Number (com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9a4a674; java.lang.Number is in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._int(JsonLocationInstantiator.java:57)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(jsonParserSequence, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete4() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_typeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typeDeserializer", _typeDeserializer);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty.getDefaultTypeId(ExternalTypeHandler.java:362)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:202) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, implType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = impl;
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = ((Object) null);
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[17];
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", -2147483647);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:196)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete6() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        stringArray[2] = string;
        stringArray[3] = string;
        stringArray[4] = string;
        stringArray[5] = string;
        stringArray[6] = string;
        stringArray[7] = string;
        stringArray[8] = string;
        stringArray[9] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[17];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
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
        tokenBufferArray[12] = tokenBuffer;
        tokenBufferArray[13] = tokenBuffer;
        tokenBufferArray[14] = tokenBuffer;
        tokenBufferArray[15] = tokenBuffer;
        tokenBufferArray[16] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[32];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 2;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = new long[16];
        words[0] = 4294967295L;
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:228) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, implType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = impl;
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete7() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:995)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:198)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, implType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = impl;
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {6148838458430324735L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:171)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(jsonParserSequence, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete9() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = new java.lang.Object[31];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372035781033985L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[31];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _allProperties[30] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase.isRequired(ConcreteBeanPropertyBase.java:45)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:192)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(uTF8DataInputJsonParser, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete10() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = new java.lang.Object[40];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 4;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            549755813887L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[40];
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:186)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(readerBasedJsonParser, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete11() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[18];
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:193)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:160)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete12() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:321)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:194)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:160)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete13() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = new java.lang.Object[35];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            93819265613823L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[35];
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(managedReferenceProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[34] = ((SettableBeanProperty) managedReferenceProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:196)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete14() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -1L, 18031990695526399L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L, 0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:171)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete15() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[24];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 2;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9187343239835811841L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null, null, null, null, null, null, null, null, null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:198)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(uTF8DataInputJsonParser, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete16() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[21];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 2;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372036586340353L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:995)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:198)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:271)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(readerBasedJsonParser, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete17() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[15];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 2;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372035781033985L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 2);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null, null, null, null, null, null, null, null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:175)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, deserializationContextType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = ((Object) null);
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete18() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[40];
        DeserializationFeature deserializationFeature = DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE;
        _creatorParameters[1] = ((Object) deserializationFeature);
        _creatorParameters[2] = ((Object) deserializationFeature);
        _creatorParameters[3] = ((Object) deserializationFeature);
        _creatorParameters[4] = ((Object) deserializationFeature);
        _creatorParameters[5] = ((Object) deserializationFeature);
        _creatorParameters[6] = ((Object) deserializationFeature);
        _creatorParameters[7] = ((Object) deserializationFeature);
        _creatorParameters[8] = ((Object) deserializationFeature);
        _creatorParameters[9] = ((Object) deserializationFeature);
        _creatorParameters[10] = ((Object) deserializationFeature);
        _creatorParameters[11] = ((Object) deserializationFeature);
        _creatorParameters[12] = ((Object) deserializationFeature);
        _creatorParameters[13] = ((Object) deserializationFeature);
        _creatorParameters[14] = ((Object) deserializationFeature);
        _creatorParameters[15] = ((Object) deserializationFeature);
        _creatorParameters[16] = ((Object) deserializationFeature);
        _creatorParameters[17] = ((Object) deserializationFeature);
        _creatorParameters[18] = ((Object) deserializationFeature);
        _creatorParameters[19] = ((Object) deserializationFeature);
        _creatorParameters[20] = ((Object) deserializationFeature);
        _creatorParameters[21] = ((Object) deserializationFeature);
        _creatorParameters[22] = ((Object) deserializationFeature);
        _creatorParameters[23] = ((Object) deserializationFeature);
        _creatorParameters[24] = ((Object) deserializationFeature);
        _creatorParameters[25] = ((Object) deserializationFeature);
        _creatorParameters[26] = ((Object) deserializationFeature);
        _creatorParameters[27] = ((Object) deserializationFeature);
        _creatorParameters[28] = ((Object) deserializationFeature);
        _creatorParameters[29] = ((Object) deserializationFeature);
        _creatorParameters[30] = ((Object) deserializationFeature);
        _creatorParameters[31] = ((Object) deserializationFeature);
        _creatorParameters[32] = ((Object) deserializationFeature);
        _creatorParameters[33] = ((Object) deserializationFeature);
        _creatorParameters[34] = ((Object) deserializationFeature);
        _creatorParameters[35] = ((Object) deserializationFeature);
        _creatorParameters[36] = ((Object) deserializationFeature);
        _creatorParameters[37] = ((Object) deserializationFeature);
        _creatorParameters[38] = ((Object) deserializationFeature);
        _creatorParameters[39] = ((Object) deserializationFeature);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 2;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = new long[12];
        words[0] = -8935000923214708737L;
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[18];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:321)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:175)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, deserializationContextType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = ((Object) null);
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testComplete19() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4096);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 4;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(creatorProperty, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _allProperties[1] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[2] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[3] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[4] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[5] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[6] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[7] = ((SettableBeanProperty) objectIdValueProperty);
        _allProperties[8] = ((SettableBeanProperty) objectIdValueProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:321)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:198)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:160)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete20() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[12];
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            -9223372032559808513L, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:172)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete21() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", -2147483647);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[17];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:321)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:75)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:380)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:188)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(readerBasedJsonParser, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete22() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {
            java.lang.Long.MIN_VALUE, 0L, 0L, 0L, 0L, 0L, 0L, 0L,
            0L
        };
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer._findMissing(PropertyValueBuffer.java:188)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:166)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test
    public void testComplete23() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        propertyValueBuffer._paramsNeeded = -2147483646;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:198)
            com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.createFromObjectWith(StdValueInstantiator.java:271)
            com.fasterxml.jackson.databind.deser.ValueInstantiator.createFromObjectWith(ValueInstantiator.java:224)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:225) */
        externalTypeHandler.complete(jsonParserDelegate, null, propertyValueBuffer, propertyBasedCreator);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)
    
    @Test(expected = IllegalArgumentException.class)
    public void testComplete24() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _creatorParameters);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testComplete25() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        InjectableValues.Std _injectableValues = ((InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        CreatorCollector.Vanilla _valueInstantiator = ((CreatorCollector.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _creatorParameters);
        _allProperties[0] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        externalTypeHandler.complete(null, impl, propertyValueBuffer, propertyBasedCreator);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)
    
    @Test(expected = JsonMappingException.class)
    public void testComplete26() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_typeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typeDeserializer", _typeDeserializer);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        
        externalTypeHandler.complete(readerBasedJsonParser, impl, propertyValueBuffer, null);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testComplete27() throws Throwable  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        PropertyValueBuffer propertyValueBuffer = ((PropertyValueBuffer) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(_context, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 8192);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_context", _context);
        java.lang.Object[] _creatorParameters = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[0] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = -2147483646;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        ValueInstantiator.Base _valueInstantiator = ((ValueInstantiator.Base) createInstance("com.fasterxml.jackson.databind.deser.ValueInstantiator$Base"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        _allProperties[1] = ((SettableBeanProperty) creatorProperty);
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class propertyValueBufferType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Class propertyBasedCreatorType = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator");
        Method completeMethod = externalTypeHandlerClazz.getDeclaredMethod("complete", parserType, deserializationContextType, propertyValueBufferType, propertyBasedCreatorType);
        completeMethod.setAccessible(true);
        java.lang.Object[] completeMethodArguments = new java.lang.Object[4];
        completeMethodArguments[0] = parser;
        completeMethodArguments[1] = ((Object) null);
        completeMethodArguments[2] = propertyValueBuffer;
        completeMethodArguments[3] = propertyBasedCreator;
        try {
            completeMethod.invoke(externalTypeHandler, completeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for complete
    
    public void testComplete_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testComplete_TokensEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException, NoSuchFieldException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = {null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
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
 * @utbot.returnsFrom {@code return bean;}
 *  */
    @Test
    public void testComplete_ReturnBean() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
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
    public void testComplete_ThrowArrayIndexOutOfBoundsException_12() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:140) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:138) */
        externalTypeHandler.complete(null, null, null);
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:167) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getName()
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:169) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Missing property '%s' for external type id '%s'", prop.getName(), _properties[i].getTypePropertyName());
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_61() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        InnerClassProperty _property = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:168) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:140) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_11() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:138) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:137) */
        externalTypeHandler.complete(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testComplete28() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object object = new Object();
        
        Object actual = externalTypeHandler.complete(filteringParserDelegate, null, object);
        
        Object externalTypeHandler_properties = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties0 = get(externalTypeHandler_properties, 0);
        Object externalTypeHandler_properties1 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties1 = get(externalTypeHandler_properties1, 1);
        Object externalTypeHandler_properties2 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties2 = get(externalTypeHandler_properties2, 2);
        Object externalTypeHandler_properties3 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties3 = get(externalTypeHandler_properties3, 3);
        Object externalTypeHandler_properties4 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties4 = get(externalTypeHandler_properties4, 4);
        Object externalTypeHandler_properties5 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties5 = get(externalTypeHandler_properties5, 5);
        Object externalTypeHandler_properties6 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties6 = get(externalTypeHandler_properties6, 6);
        Object externalTypeHandler_properties7 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties7 = get(externalTypeHandler_properties7, 7);
        Object externalTypeHandler_properties8 = getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_properties");
        Object finalExternalTypeHandler_properties8 = get(externalTypeHandler_properties8, 8);
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
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens1 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens1 = ((TokenBuffer) get(externalTypeHandler_tokens1, 1));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens2 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens2 = ((TokenBuffer) get(externalTypeHandler_tokens2, 2));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens3 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens3 = ((TokenBuffer) get(externalTypeHandler_tokens3, 3));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens4 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens4 = ((TokenBuffer) get(externalTypeHandler_tokens4, 4));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens5 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens5 = ((TokenBuffer) get(externalTypeHandler_tokens5, 5));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens6 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens6 = ((TokenBuffer) get(externalTypeHandler_tokens6, 6));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens7 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens7 = ((TokenBuffer) get(externalTypeHandler_tokens7, 7));
        com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens8 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
        TokenBuffer finalExternalTypeHandler_tokens8 = ((TokenBuffer) get(externalTypeHandler_tokens8, 8));
        
        assertNull(finalExternalTypeHandler_properties0);
        
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
        
        assertNull(finalExternalTypeHandler_tokens1);
        
        assertNull(finalExternalTypeHandler_tokens2);
        
        assertNull(finalExternalTypeHandler_tokens3);
        
        assertNull(finalExternalTypeHandler_tokens4);
        
        assertNull(finalExternalTypeHandler_tokens5);
        
        assertNull(finalExternalTypeHandler_tokens6);
        
        assertNull(finalExternalTypeHandler_tokens7);
        
        assertNull(finalExternalTypeHandler_tokens8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testComplete29() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 11);
        java.lang.String[] stringArray = new java.lang.String[11];
        String string = "";
        stringArray[2] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[11];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[2] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(jsonParserDelegate, impl, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testComplete30() throws Exception  {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        Object object = new Object();
        
        externalTypeHandler.complete(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testComplete31() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 16);
        java.lang.String[] stringArray = new java.lang.String[11];
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[3];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
        tokenBufferArray[2] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:245)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(null, impl, object);
    }
    
    @Test
    public void testComplete32() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ManagedReferenceProperty _property = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[1] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        stringArray[2] = string;
        stringArray[3] = string;
        stringArray[4] = string;
        stringArray[5] = string;
        stringArray[6] = string;
        stringArray[7] = string;
        stringArray[8] = string;
        stringArray[9] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:168) */
        externalTypeHandler.complete(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testComplete33() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2778)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(uTF8DataInputJsonParser, null, object);
    }
    
    @Test
    public void testComplete34() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        com.fasterxml.jackson.core.json.UTF8DataInputJsonParser[] uTF8DataInputJsonParserArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2778)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:881)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(filteringParserDelegate, null, uTF8DataInputJsonParserArray);
    }
    
    @Test
    public void testComplete35() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException] */
            externalTypeHandler.complete(jsonParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete36() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 8L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:46)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:245)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:150) */
            externalTypeHandler.complete(jsonParserDelegate, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete37() throws Exception  {
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 22);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 14L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[1] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTokenLocation(ReaderBasedJsonParser.java:2770)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
            externalTypeHandler.complete(jsonParserSequence, null, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete38() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(uTF8DataInputJsonParser, null, object);
    }
    
    @Test
    public void testComplete39() throws Exception  {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate2 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2778)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testComplete40() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(jsonParserDelegate, null, object);
    }
    
    @Test
    public void testComplete41() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[1] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[1] = tokenBuffer;
        tokenBufferArray[2] = tokenBuffer;
        tokenBufferArray[3] = tokenBuffer;
        tokenBufferArray[4] = tokenBuffer;
        tokenBufferArray[5] = tokenBuffer;
        tokenBufferArray[6] = tokenBuffer;
        tokenBufferArray[7] = tokenBuffer;
        tokenBufferArray[8] = tokenBuffer;
        tokenBufferArray[9] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:171) */
        externalTypeHandler.complete(jsonParserDelegate, null, object);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = JsonMappingException.class)
    public void testComplete42() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ManagedReferenceProperty _property = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {null, null, null, null, null, null, null, null, null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(uTF8StreamJsonParser, impl, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): True}
 *  */
    @Test
    public void testHandleTypePropertyValue_IEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        HashMap hashMap = new HashMap();
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        String string = "";
        
        boolean actual = externalTypeHandler.handleTypePropertyValue(null, null, string, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): True}
 *  */
    @Test
    public void testHandleTypePropertyValue_NotPropHasTypePropertyName() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = 0;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        boolean actual = externalTypeHandler.handleTypePropertyValue(null, null, string, null);
        
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
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHandleTypePropertyValue_NotCanDeserialize() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = new java.lang.String[12];
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        boolean actual = externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, null);
        
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
        String finalExternalTypeHandler_typeIds1 = ((String) get(externalTypeHandler_typeIds, 1));
        java.lang.String[] externalTypeHandler_typeIds1 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds2 = ((String) get(externalTypeHandler_typeIds1, 2));
        java.lang.String[] externalTypeHandler_typeIds2 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds3 = ((String) get(externalTypeHandler_typeIds2, 3));
        java.lang.String[] externalTypeHandler_typeIds3 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds4 = ((String) get(externalTypeHandler_typeIds3, 4));
        java.lang.String[] externalTypeHandler_typeIds4 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds5 = ((String) get(externalTypeHandler_typeIds4, 5));
        java.lang.String[] externalTypeHandler_typeIds5 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds6 = ((String) get(externalTypeHandler_typeIds5, 6));
        java.lang.String[] externalTypeHandler_typeIds6 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds7 = ((String) get(externalTypeHandler_typeIds6, 7));
        java.lang.String[] externalTypeHandler_typeIds7 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds8 = ((String) get(externalTypeHandler_typeIds7, 8));
        java.lang.String[] externalTypeHandler_typeIds8 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds9 = ((String) get(externalTypeHandler_typeIds8, 9));
        java.lang.String[] externalTypeHandler_typeIds9 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds10 = ((String) get(externalTypeHandler_typeIds9, 10));
        java.lang.String[] externalTypeHandler_typeIds10 = ((java.lang.String[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_typeIds"));
        String finalExternalTypeHandler_typeIds11 = ((String) get(externalTypeHandler_typeIds10, 11));
        
        assertNull(finalExternalTypeHandler_properties1);
        
        assertNull(finalExternalTypeHandler_properties2);
        
        assertNull(finalExternalTypeHandler_properties3);
        
        assertNull(finalExternalTypeHandler_properties4);
        
        assertNull(finalExternalTypeHandler_properties5);
        
        assertNull(finalExternalTypeHandler_properties6);
        
        assertNull(finalExternalTypeHandler_properties7);
        
        assertNull(finalExternalTypeHandler_properties8);
        
        assertNull(finalExternalTypeHandler_typeIds1);
        
        assertNull(finalExternalTypeHandler_typeIds2);
        
        assertNull(finalExternalTypeHandler_typeIds3);
        
        assertNull(finalExternalTypeHandler_typeIds4);
        
        assertNull(finalExternalTypeHandler_typeIds5);
        
        assertNull(finalExternalTypeHandler_typeIds6);
        
        assertNull(finalExternalTypeHandler_typeIds7);
        
        assertNull(finalExternalTypeHandler_typeIds8);
        
        assertNull(finalExternalTypeHandler_typeIds9);
        
        assertNull(finalExternalTypeHandler_typeIds10);
        
        assertNull(finalExternalTypeHandler_typeIds11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = Integer.MIN_VALUE;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:69) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:75) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:82) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer I = _nameToPropertyIndex.get(propName);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:64) */
        externalTypeHandler.handleTypePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.ExtTypedProperty#hasTypePropertyName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prop.hasTypePropertyName(propName)
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = 0;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:70) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = p.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        Object extTypedProperty1 = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[1] = extTypedProperty1;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:73) */
        externalTypeHandler.handleTypePropertyValue(null, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = 0;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:69) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = p.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:73) */
        externalTypeHandler.handleTypePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        short[] shortArray = {(short) 0};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:82) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        String _currentName = "";
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName", _currentName);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:75) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (!prop.hasTypePropertyName(propName)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:75) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): True}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHandlePropertyValue_IEqualsNull() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        HashMap hashMap = new HashMap();
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
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
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = Integer.MIN_VALUE;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:103) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowStringIndexOutOfBoundsException() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:142)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:142)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate1, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer I = _nameToPropertyIndex.get(propName);
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:98) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(null, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prop.hasTypePropertyName(propName)
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = 0;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:105) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ExtTypedProperty prop = _properties[index];
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
        HashMap hashMap = new HashMap();
        String string = "";
        Integer integer = 0;
        hashMap.put(string, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:103) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(uTF8DataInputJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null};
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_tokenIncomplete", true);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._finishAndReturnString(UTF8DataInputJsonParser.java:1851)
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getText(UTF8DataInputJsonParser.java:180)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:142)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:142)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate1, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = p.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:106) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate1, null, _typePropertyName, null);
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265) */
        externalTypeHandler._deserializeAndSet(null, null, null, -256, null);
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[4];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[1] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[4];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate1 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate1, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserSequence, null, null, 0, null);
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[1];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1732)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1645)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1321)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:266) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            tokenBufferArray[1] = tokenBuffer1;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void test_deserializeAndSet_ThrowUnsupportedOperationException_1() throws Exception  {
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
            ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
            setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
            setField(_property, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
            setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
            extTypedPropertyArray[0] = extTypedProperty;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            externalTypeHandler._deserializeAndSet(jsonParserSequence, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _properties[index].getProperty().set(bean, null);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void test_deserializeAndSet_ThrowUnsupportedOperationException() throws Exception  {
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
            ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            setField(_property, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
            setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
            extTypedPropertyArray[0] = extTypedProperty;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeAndSet(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object, int, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeAndSet1() throws Exception  {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        externalTypeHandler._deserializeAndSet(jsonParserDelegate, null, object, 0, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeAndSet2() throws Exception  {
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 33);
            Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            extTypedPropertyArray[0] = extTypedProperty;
            extTypedPropertyArray[1] = extTypedProperty;
            extTypedPropertyArray[2] = extTypedProperty;
            extTypedPropertyArray[3] = extTypedProperty;
            extTypedPropertyArray[4] = extTypedProperty;
            extTypedPropertyArray[5] = extTypedProperty;
            extTypedPropertyArray[6] = extTypedProperty;
            extTypedPropertyArray[7] = extTypedProperty;
            extTypedPropertyArray[8] = extTypedProperty;
            extTypedPropertyArray[9] = extTypedProperty;
            extTypedPropertyArray[10] = extTypedProperty;
            extTypedPropertyArray[11] = extTypedProperty;
            extTypedPropertyArray[12] = extTypedProperty;
            extTypedPropertyArray[13] = extTypedProperty;
            extTypedPropertyArray[14] = extTypedProperty;
            extTypedPropertyArray[15] = extTypedProperty;
            extTypedPropertyArray[16] = extTypedProperty;
            extTypedPropertyArray[17] = extTypedProperty;
            extTypedPropertyArray[18] = extTypedProperty;
            extTypedPropertyArray[19] = extTypedProperty;
            extTypedPropertyArray[20] = extTypedProperty;
            extTypedPropertyArray[21] = extTypedProperty;
            extTypedPropertyArray[22] = extTypedProperty;
            extTypedPropertyArray[23] = extTypedProperty;
            extTypedPropertyArray[24] = extTypedProperty;
            extTypedPropertyArray[25] = extTypedProperty;
            extTypedPropertyArray[26] = extTypedProperty;
            extTypedPropertyArray[27] = extTypedProperty;
            extTypedPropertyArray[28] = extTypedProperty;
            extTypedPropertyArray[29] = extTypedProperty;
            extTypedPropertyArray[30] = extTypedProperty;
            extTypedPropertyArray[31] = extTypedProperty;
            Object extTypedProperty1 = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            ManagedReferenceProperty idProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
            setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty", "_managedProperty", _property);
            setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
            setField(_property, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
            setField(extTypedProperty1, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
            extTypedPropertyArray[32] = extTypedProperty1;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[34];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[32] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            com.fasterxml.jackson.core.io.IOContext[][] iOContextArray = {};
            
            externalTypeHandler._deserializeAndSet(jsonParserSequence, impl, iOContextArray, 32, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet3() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
        externalTypeHandler._deserializeAndSet(uTF8DataInputJsonParser, impl, object, 0, string);
    }
    
    @Test
    public void test_deserializeAndSet4() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
        externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, string);
    }
    
    @Test
    public void test_deserializeAndSet5() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = 1006653457;
            _tokens[0] = ((Object) integer);
            Object object = createInstance("java.lang.Object");
            _tokens[1] = object;
            _tokens[2] = object;
            _tokens[3] = object;
            _tokens[4] = object;
            _tokens[5] = object;
            _tokens[6] = object;
            _tokens[7] = object;
            _tokens[8] = object;
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", integer);
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object1 = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserSequence, impl, object1, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet6() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            String string = "";
            _tokens[0] = ((Object) string);
            Object object = createInstance("java.lang.Object");
            _tokens[1] = object;
            _tokens[2] = object;
            _tokens[3] = object;
            _tokens[4] = object;
            _tokens[5] = object;
            _tokens[6] = object;
            _tokens[7] = object;
            _tokens[8] = object;
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object1 = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserSequence, impl, object1, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet7() throws Exception  {
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 33);
            Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            ObjectIdValueProperty idProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            ObjectIdReader _objectIdReader1 = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
            InnerClassProperty idProperty1 = ((InnerClassProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.InnerClassProperty"));
            setField(_objectIdReader1, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty1);
            setField(idProperty, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader1);
            setField(_objectIdReader, "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "idProperty", idProperty);
            setField(_property, "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_objectIdReader", _objectIdReader);
            setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
            extTypedPropertyArray[32] = extTypedProperty;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[33];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[32] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.InnerClassProperty.setAndReturn(InnerClassProperty.java:139)
                com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
                com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.setAndReturn(ObjectIdValueProperty.java:112)
                com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty.set(ObjectIdValueProperty.java:101)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 32, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet8() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate3 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2778)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:881)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:265) */
        externalTypeHandler._deserializeAndSet(filteringParserDelegate, null, object, 0, null);
    }
    
    @Test
    public void test_deserializeAndSet9() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[17];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 4L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:281) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet10() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1064)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet11() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 2L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:281) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet12() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            String string = "";
            _tokens[0] = ((Object) string);
            JsonToken jsonToken12 = JsonToken.NOT_AVAILABLE;
            _tokens[1] = ((Object) jsonToken12);
            _tokens[2] = ((Object) jsonToken12);
            _tokens[3] = ((Object) jsonToken12);
            _tokens[4] = ((Object) jsonToken12);
            _tokens[5] = ((Object) jsonToken12);
            _tokens[6] = ((Object) jsonToken12);
            _tokens[7] = ((Object) jsonToken12);
            _tokens[8] = ((Object) jsonToken12);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            String string1 = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, string1);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet13() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = 0;
            _tokens[0] = ((Object) integer);
            JsonToken jsonToken12 = JsonToken.VALUE_NUMBER_INT;
            _tokens[1] = ((Object) jsonToken12);
            _tokens[2] = ((Object) jsonToken12);
            _tokens[3] = ((Object) jsonToken12);
            _tokens[4] = ((Object) jsonToken12);
            _tokens[5] = ((Object) jsonToken12);
            _tokens[6] = ((Object) jsonToken12);
            _tokens[7] = ((Object) jsonToken12);
            _tokens[8] = ((Object) jsonToken12);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet14() throws Exception  {
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 33);
            Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            extTypedPropertyArray[32] = extTypedProperty;
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[33];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[32] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate1, impl, object, 32, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet15() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 4L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:281) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate1, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet16() throws Exception  {
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
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1064)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate1, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet17() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 3L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1057)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate1, null, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet18() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:269) */
            externalTypeHandler._deserializeAndSet(jsonParserDelegate1, impl, object, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet19() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:276) */
        externalTypeHandler._deserializeAndSet(jsonParserDelegate2, null, object, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_deserialize_ReturnNull() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[8];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            byte[] _sourceRef = {};
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            Object actual = externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
            
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
            
            assertNull(finalExternalTypeHandler_tokens1);
            
            assertNull(finalExternalTypeHandler_tokens2);
            
            assertNull(finalExternalTypeHandler_tokens3);
            
            assertNull(finalExternalTypeHandler_tokens4);
            
            assertNull(finalExternalTypeHandler_tokens5);
            
            assertNull(finalExternalTypeHandler_tokens6);
            
            assertNull(finalExternalTypeHandler_tokens7);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_deserialize_ReturnNull_1() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[17];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 12L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens11 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens12 = ((TokenBuffer) get(externalTypeHandler_tokens11, 12));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens12 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens13 = ((TokenBuffer) get(externalTypeHandler_tokens12, 13));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens13 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens14 = ((TokenBuffer) get(externalTypeHandler_tokens13, 14));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens14 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens15 = ((TokenBuffer) get(externalTypeHandler_tokens14, 15));
            com.fasterxml.jackson.databind.util.TokenBuffer[] externalTypeHandler_tokens15 = ((com.fasterxml.jackson.databind.util.TokenBuffer[]) getFieldValue(externalTypeHandler, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_tokens"));
            TokenBuffer finalExternalTypeHandler_tokens16 = ((TokenBuffer) get(externalTypeHandler_tokens15, 16));
            
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
            
            assertNull(finalExternalTypeHandler_tokens12);
            
            assertNull(finalExternalTypeHandler_tokens13);
            
            assertNull(finalExternalTypeHandler_tokens14);
            
            assertNull(finalExternalTypeHandler_tokens15);
            
            assertNull(finalExternalTypeHandler_tokens16);
        } finally {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:240) */
        externalTypeHandler._deserialize(null, null, 129, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = p2.nextToken();
 *  */
    @Test
    public void test_deserialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(delegate, "com.fasterxml.jackson.core.json.UTF8DataInputJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1732)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1645)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1321)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:241) */
            externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
        } finally {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:240) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) null);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:240) */
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        externalTypeHandler._deserialize(filteringParserDelegate, null, 0, null);
    }
    
    @Test
    public void test_deserialize2() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
        externalTypeHandler._deserialize(uTF8DataInputJsonParser, impl, 0, null);
    }
    
    @Test
    public void test_deserialize3() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 3L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1057)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, impl, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize4() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1064)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, impl, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = 1;
            _tokens[0] = ((Object) integer);
            char[] charArray = {'\u0000'};
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
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(jsonParserSequence, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize6() throws Exception  {
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
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8DataInputJsonParser delegate4 = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTokenLocation(UTF8DataInputJsonParser.java:2778)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:214)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:881)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:246)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:240) */
        externalTypeHandler._deserialize(filteringParserDelegate, impl, 0, string);
    }
    
    @Test
    public void test_deserialize7() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = Integer.MIN_VALUE;
            _tokens[0] = ((Object) integer);
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            _tokens[1] = ((Object) uTF8DataInputJsonParser);
            _tokens[2] = ((Object) uTF8DataInputJsonParser);
            _tokens[3] = ((Object) uTF8DataInputJsonParser);
            _tokens[4] = ((Object) uTF8DataInputJsonParser);
            _tokens[5] = ((Object) uTF8DataInputJsonParser);
            _tokens[6] = ((Object) uTF8DataInputJsonParser);
            _tokens[7] = ((Object) uTF8DataInputJsonParser);
            _tokens[8] = ((Object) uTF8DataInputJsonParser);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(uTF8DataInputJsonParser, null, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize8() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 1L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1064)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize9() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 3L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1057)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize10() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 2L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize11() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 4L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize12() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
        externalTypeHandler._deserialize(jsonParserDelegate, null, 0, string);
    }
    
    @Test
    public void test_deserialize13() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            String string = "";
            _tokens[0] = ((Object) string);
            char[] charArray = {'\u0000'};
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
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize14() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
        Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
        externalTypeHandlerConstructor.setAccessible(true);
        java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
        externalTypeHandlerConstructorArguments[0] = ((Object) null);
        externalTypeHandlerConstructorArguments[1] = ((Object) null);
        externalTypeHandlerConstructorArguments[2] = ((Object) null);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8DataInputJsonParser delegate = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
        externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
    }
    
    @Test
    public void test_deserialize15() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
            setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_first", _first);
            tokenBufferArray[0] = tokenBuffer;
            Class externalTypeHandlerClazz = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
            Class extTypedPropertyArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty;");
            Class hashMapType = Class.forName("java.util.HashMap");
            Class stringArrayType = Class.forName("[Ljava.lang.String;");
            Class tokenBufferArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.util.TokenBuffer;");
            Constructor externalTypeHandlerConstructor = externalTypeHandlerClazz.getDeclaredConstructor(extTypedPropertyArrayType, hashMapType, stringArrayType, tokenBufferArrayType);
            externalTypeHandlerConstructor.setAccessible(true);
            java.lang.Object[] externalTypeHandlerConstructorArguments = new java.lang.Object[4];
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8DataInputJsonParser uTF8DataInputJsonParser = ((UTF8DataInputJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8DataInputJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8DataInputJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8DataInputJsonParser);
            JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:1053)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserialize(jsonParserDelegate1, impl, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076713028275300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076713028275300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076713028280900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076713028275300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076713028280900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1076713030952400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1076713030952400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1076713030954300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076713030952400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076713030954300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1076713031496000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076713031496000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076713031497699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076713031496000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076713031497699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076713031931300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076713031931300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076713031932500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076713031931300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076713031932500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

