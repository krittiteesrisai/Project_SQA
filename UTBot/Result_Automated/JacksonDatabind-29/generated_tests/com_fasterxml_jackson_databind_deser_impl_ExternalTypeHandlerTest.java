package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.databind.ObjectReader;
import java.lang.reflect.MalformedParameterizedTypeException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import java.util.BitSet;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_impl_ExternalTypeHandlerTest {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:99) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 8);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowStringIndexOutOfBoundsException() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 17);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count 1, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 12);
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _inputBuffer = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputLen", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:94) */
        externalTypeHandler.handlePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000";
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:101) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_5() throws Exception  {
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:99) */
        externalTypeHandler.handlePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = jp.getText();
 *  */
    @Test
    public void testHandlePropertyValue_ThrowNullPointerException_4() throws Exception  {
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = jp.getText();
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handlePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = jp.getText();
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    @Test
    public void testHandlePropertyValue1() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000', '\u0000'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 11);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483634);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 11 out of bounds for char[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:448)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:104) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate1 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:108) */
        externalTypeHandler.handlePropertyValue(filteringParserDelegate, impl, string, object);
    }
    
    @Test
    public void testHandlePropertyValue4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:281)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:237)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, impl, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue5() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _currentSegment = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:448)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(readerBasedJsonParser, null, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue6() throws Exception  {
        Class bufferRecyclerClazz = Class.forName("com.fasterxml.jackson.core.util.BufferRecycler");
        int[] prevCHAR_BUFFER_LENGTHS = ((int[]) getStaticFieldValue(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS"));
        try {
            int[] charBufferLengths = {4000, 4000, 200, 200};
            setStaticField(bufferRecyclerClazz, "CHAR_BUFFER_LENGTHS", charBufferLengths);
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
            Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
            String _typePropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
            extTypedPropertyArray[0] = extTypedProperty;
            HashMap hashMap = new HashMap();
            Integer integer = 0;
            hashMap.put(_typePropertyName, integer);
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
            ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
            setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
            setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
            TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
            BufferRecycler _allocator = ((BufferRecycler) createInstance("com.fasterxml.jackson.core.util.BufferRecycler"));
            setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_allocator", _allocator);
            setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
            JsonToken _currToken = JsonToken.VALUE_STRING;
            setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.BufferRecycler.allocCharBuffer(BufferRecycler.java:122)
                com.fasterxml.jackson.core.util.TextBuffer.buf(TextBuffer.java:235)
                com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:206)
                com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
                com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
            externalTypeHandler.handlePropertyValue(readerBasedJsonParser, impl, _typePropertyName, object);
        } finally {
            setStaticField(BufferRecycler.class, "CHAR_BUFFER_LENGTHS", prevCHAR_BUFFER_LENGTHS);
        }
    }
    
    @Test
    public void testHandlePropertyValue7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        ArrayList _segments = new ArrayList();
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:287)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:237)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate2, null, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", Integer.MIN_VALUE);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segmentSize", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:739)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:233)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:355)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._getText2(ReaderBasedJsonParser.java:287)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:237)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate2, null, _typePropertyName, object);
    }
    
    @Test
    public void testHandlePropertyValue9() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        Object extTypedProperty1 = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[1] = extTypedProperty1;
        extTypedPropertyArray[2] = extTypedProperty1;
        extTypedPropertyArray[3] = extTypedProperty1;
        extTypedPropertyArray[4] = extTypedProperty1;
        extTypedPropertyArray[5] = extTypedProperty1;
        extTypedPropertyArray[6] = extTypedProperty1;
        extTypedPropertyArray[7] = extTypedProperty1;
        extTypedPropertyArray[8] = extTypedProperty1;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -1610612736);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        ArrayList _segments = new ArrayList();
        _segments.add(null);
        _segments.add(null);
        _segments.add(null);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_segments", _segments);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.append(TextBuffer.java:445)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:209)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(ExternalTypeHandler.java:102) */
        externalTypeHandler.handlePropertyValue(jsonParserDelegate2, impl, _typePropertyName, extTypedProperty1);
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
 *  */
    @Test
    public void testHandleTypePropertyValue_ReturnFalse() throws Exception  {
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
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        boolean actual = externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, null);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 12);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        String _typePropertyName = "";
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_typePropertyName", _typePropertyName);
        extTypedPropertyArray[0] = extTypedProperty;
        HashMap hashMap = new HashMap();
        Integer integer = 0;
        hashMap.put(_typePropertyName, integer);
        java.lang.String[] stringArray = {};
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
        externalTypeHandlerConstructorArguments[1] = hashMap;
        externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
        externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
        ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:78) */
        externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:71) */
        externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, byteArray);
    }
    
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:65) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:78) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String typeId = jp.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowStringIndexOutOfBoundsException() throws Exception  {
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        char[] _currentSegment = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSegment", _currentSegment);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_currentSize", -1);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.StringIndexOutOfBoundsException: offset 0, count -1, length 1]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.core.util.TextBuffer.contentsAsString(TextBuffer.java:344)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:235)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:69) */
        externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:60) */
        externalTypeHandler.handleTypePropertyValue(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:66) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = jp.getText();
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_3() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:69) */
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:65) */
        externalTypeHandler.handleTypePropertyValue(null, null, string, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        int[][] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:71) */
        externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean canDeserialize = (bean != null) && (_tokens[index] != null);
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_8() throws Exception  {
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:71) */
        externalTypeHandler.handleTypePropertyValue(readerBasedJsonParser, null, _typePropertyName, object);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        char[] _resultArray = {'\u0000'};
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _resultArray);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:71) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, intArray);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.executesCondition {@code (canDeserialize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeIds[index] = typeId;
 *  */
    @Test
    public void testHandleTypePropertyValue_ThrowNullPointerException_4() throws Exception  {
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputStart", -1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:78) */
        externalTypeHandler.handleTypePropertyValue(jsonParserDelegate, null, _typePropertyName, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#handleTypePropertyValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (I == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        TextBuffer _textBuffer = ((TextBuffer) createInstance("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_inputBuffer", _inputBuffer);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_hasSegments", true);
        String _resultString = "";
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultString", _resultString);
        setField(_textBuffer, "com.fasterxml.jackson.core.util.TextBuffer", "_resultArray", _inputBuffer);
        setField(delegate, "com.fasterxml.jackson.core.base.ParserBase", "_textBuffer", _textBuffer);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.TextBuffer.clearSegments(TextBuffer.java:250)
            com.fasterxml.jackson.core.util.TextBuffer.resetWithCopy(TextBuffer.java:204)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._finishString(ReaderBasedJsonParser.java:1745)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getText(ReaderBasedJsonParser.java:233)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handleTypePropertyValue(ExternalTypeHandler.java:69) */
        externalTypeHandler.handleTypePropertyValue(jsonParserSequence, null, _typePropertyName, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize
    
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", -1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1629)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1542)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1217)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:226) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, null, 0, null);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
        externalTypeHandler._deserialize(filteringParserDelegate, null, 0, null);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:999)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, impl, 0, string);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, impl, 0, string);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:238) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, impl, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize6() throws Exception  {
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
            Integer integer = 1006653457;
            _tokens[0] = ((Object) integer);
            _tokens[1] = ((Object) tokenBufferArray);
            _tokens[2] = ((Object) tokenBufferArray);
            _tokens[3] = ((Object) tokenBufferArray);
            _tokens[4] = ((Object) tokenBufferArray);
            _tokens[5] = ((Object) tokenBufferArray);
            _tokens[6] = ((Object) tokenBufferArray);
            _tokens[7] = ((Object) tokenBufferArray);
            _tokens[8] = ((Object) tokenBufferArray);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, impl, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
            String string = "";
            _tokens[0] = ((Object) string);
            byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            java.lang.Object[] _sourceRef = createArray("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", 0);
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            String string1 = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, null, 0, string1);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize8() throws Exception  {
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MAX_VALUE);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
        externalTypeHandler._deserialize(uTF8StreamJsonParser, null, 0, null);
    }
    
    @Test
    public void test_deserialize9() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
        externalTypeHandler._deserialize(jsonParserDelegate, impl, 0, null);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:238) */
            externalTypeHandler._deserialize(uTF8StreamJsonParser, null, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserialize11() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate2 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate5 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        ReaderBasedJsonParser delegate8 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:225) */
        externalTypeHandler._deserialize(filteringParserDelegate, impl, 0, null);
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate7 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MAX_VALUE);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
        externalTypeHandler._deserialize(jsonParserSequence, null, 0, null);
    }
    
    @Test
    public void test_deserialize13() throws Exception  {
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate5 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate7 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        setField(delegate7, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserialize(ExternalTypeHandler.java:232) */
        externalTypeHandler._deserialize(jsonParserSequence, null, 0, string);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248) */
        externalTypeHandler._deserializeAndSet(null, null, null, -256, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#_deserializeAndSet(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonToken t = p2.nextToken();
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[12];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
            externalTypeHandlerConstructorArguments[0] = ((Object) null);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) null);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.json.UTF8StreamJsonParser", "_objectCodec", _objectCodec);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1629)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1542)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1217)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, null, null, 0, null);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248) */
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248) */
        externalTypeHandler._deserializeAndSet(null, null, null, -255, null);
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
    
    @Test
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet3() throws Exception  {
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:260) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, string);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet4() throws Exception  {
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MAX_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[9];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 5L);
            java.lang.Object[] _tokens = new java.lang.Object[9];
            Integer integer = 177;
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            Object _sourceRef = createInstance("java.lang.Object");
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MAX_VALUE);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, null, object, 0, null);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", 2147418111);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            String string = "";
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:260) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, string);
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:999)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:255) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet8() throws Exception  {
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
            UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
            setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MIN_VALUE);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1629)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1542)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1217)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:249) */
            externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, impl, object, 0, null);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void test_deserializeAndSet9() throws Exception  {
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
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputCol", Integer.MAX_VALUE);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:988)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:255) */
        externalTypeHandler._deserializeAndSet(uTF8StreamJsonParser, null, object, 0, null);
    }
    
    @Test
    public void test_deserializeAndSet10() throws Exception  {
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate7 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        MalformedParameterizedTypeException malformedParameterizedTypeException = ((MalformedParameterizedTypeException) createInstance("java.lang.reflect.MalformedParameterizedTypeException"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248) */
        externalTypeHandler._deserializeAndSet(filteringParserDelegate, impl, malformedParameterizedTypeException, 0, string);
    }
    
    @Test
    public void test_deserializeAndSet11() throws Exception  {
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[2];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBufferArray[0] = tokenBuffer;
        tokenBufferArray[1] = tokenBuffer;
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
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate7 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate8 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate11 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate12 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248) */
        externalTypeHandler._deserializeAndSet(jsonParserSequence, impl, object, 0, null);
    }
    ///endregion
    
    ///endregion
    
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
    public void testComplete_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:161) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: TokenBuffer tokens = _tokens[i];
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:136) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:134) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = _properties[i].getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_4() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:162) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getName()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_5() throws Exception  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:164) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_6() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ObjectIdReferenceProperty _property = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:163) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: typeId == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:161) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TokenBuffer tokens = _tokens[i];
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:136) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _properties.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:134) */
        externalTypeHandler.complete(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = _properties.length; i < len; ++i)
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:133) */
        externalTypeHandler.complete(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void testComplete1() throws Exception  {
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
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object object = new Object();
        
        Object actual = externalTypeHandler.complete(jsonParserSequence, null, object);
        
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
    public void testComplete2() throws Exception  {
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
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        Object object = new Object();
        
        externalTypeHandler.complete(jsonParserDelegate, null, object);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testComplete3() throws Exception  {
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
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(jsonParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(jsonParserDelegate2, impl, object);
    }
    
    @Test
    public void testComplete4() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 11);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        CreatorProperty _property = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[2] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[11];
        String string = "";
        stringArray[2] = string;
        stringArray[3] = string;
        stringArray[4] = string;
        stringArray[5] = string;
        stringArray[6] = string;
        stringArray[7] = string;
        stringArray[8] = string;
        stringArray[9] = string;
        stringArray[10] = string;
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[11];
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
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:163) */
        externalTypeHandler.complete(readerBasedJsonParser, null, object);
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
            java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
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
            externalTypeHandlerConstructorArguments[0] = ((Object) extTypedPropertyArray);
            externalTypeHandlerConstructorArguments[1] = ((Object) null);
            externalTypeHandlerConstructorArguments[2] = ((Object) stringArray);
            externalTypeHandlerConstructorArguments[3] = ((Object) tokenBufferArray);
            ExternalTypeHandler externalTypeHandler = ((ExternalTypeHandler) externalTypeHandlerConstructor.newInstance(externalTypeHandlerConstructorArguments));
            ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
            externalTypeHandler.complete(readerBasedJsonParser, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete6() throws Exception  {
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
            java.lang.String[] stringArray = {null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[13];
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
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:45)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:45)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getCodec(JsonParserDelegate.java:45)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:220)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
            externalTypeHandler.complete(filteringParserDelegate, null, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
            java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
            java.lang.String[] stringArray = {null, null};
            com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            Object _first = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 6L);
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
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            Object object = new Object();
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:652)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
                com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
                com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
                com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:146) */
            externalTypeHandler.complete(jsonParserSequence, impl, object);
        } finally {
            setStaticField(segmentClazz, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testComplete8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null, null};
        com.fasterxml.jackson.databind.util.TokenBuffer[] tokenBufferArray = new com.fasterxml.jackson.databind.util.TokenBuffer[10];
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
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
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate2 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
        externalTypeHandler.complete(filteringParserDelegate, null, object);
    }
    
    @Test
    public void testComplete9() throws Exception  {
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
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:404)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler._deserializeAndSet(ExternalTypeHandler.java:248)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:166) */
        externalTypeHandler.complete(jsonParserDelegate2, null, object);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = JsonMappingException.class)
    public void testComplete10() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 10);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        CreatorProperty _property = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[1] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[8];
        String string = "";
        stringArray[1] = string;
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
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(treeTraversingParser, impl, object);
    }
    
    @Test(expected = JsonMappingException.class)
    public void testComplete11() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 9);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        CreatorProperty _property = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
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
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object object = new Object();
        
        externalTypeHandler.complete(treeTraversingParser, impl, object);
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
    public void testComplete_ThrowArrayIndexOutOfBoundsException_11() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:186) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_21() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:196) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:183) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowClassCastException() throws Exception  {
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
        java.lang.Object[] _creatorParameters = new java.lang.Object[2];
        Object object = createInstance("java.lang.Object");
        _creatorParameters[1] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._long(JsonLocationInstantiator.java:53)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
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
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = new java.lang.Object[3];
        Integer integer = 0;
        _creatorParameters[2] = ((Object) integer);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowClassCastException_1() throws Exception  {
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
        java.lang.Object[] _creatorParameters = new java.lang.Object[13];
        Integer integer = 0;
        _creatorParameters[1] = ((Object) integer);
        Object object = createInstance("java.lang.Object");
        _creatorParameters[4] = object;
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator._int(JsonLocationInstantiator.java:57)
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowArrayIndexOutOfBoundsException_111() throws Exception  {
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
        java.lang.Object[] _creatorParameters = new java.lang.Object[4];
        Integer integer = 0;
        _creatorParameters[1] = ((Object) integer);
        _creatorParameters[3] = ((Object) integer);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:49)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -254;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:118)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:136)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:755)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:123)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:136)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = {null, null, null, null, null, null, null, null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-129L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null, null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 2]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:124)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:136)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = {null};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        propertyValueBuffer._paramsSeen = -255;
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        java.lang.Object[] _creatorParameters = {};
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_creatorParameters", _creatorParameters);
        propertyValueBuffer._paramsNeeded = 1;
        BitSet _paramsSeenBig = ((BitSet) createInstance("java.util.BitSet"));
        long[] words = {-9223372036720558081L};
        setField(_paramsSeenBig, "java.util.BitSet", "words", words);
        setField(_paramsSeenBig, "java.util.BitSet", "wordsInUse", 1);
        setField(propertyValueBuffer, "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "_paramsSeenBig", _paramsSeenBig);
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator.createFromObjectWith(JsonLocationInstantiator.java:48)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:135)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
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
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            java.base/java.util.BitSet.nextClearBit(BitSet.java:762)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.getParameters(PropertyValueBuffer.java:123)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.build(PropertyBasedCreator.java:136)
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_properties[i].hasDefaultType()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_31() throws Exception  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:191) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = _properties[i].getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_41() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:205) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creator.findCreatorProperty(prop.getName()) != null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_51() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:206) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_properties[i].hasDefaultType()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_61() throws Exception  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:192) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creator.findCreatorProperty(prop.getName()) != null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_7() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ObjectIdReferenceProperty _property = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
        PropertyName _propName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_propName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(_property, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_propName", _propName);
        setField(extTypedProperty, "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", "_property", _property);
        extTypedPropertyArray[0] = extTypedProperty;
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:206) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_properties[i].hasDefaultType()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_8() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_typeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:192) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty prop = _properties[i].getProperty();
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_10() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:197) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prop.getName()
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_11() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        extTypedPropertyArray[0] = extTypedProperty;
        java.lang.String[] stringArray = new java.lang.String[2];
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:199) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_12() throws Exception  {
        java.lang.Object[] extTypedPropertyArray = createArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 1);
        Object extTypedProperty = createInstance("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        ObjectIdReferenceProperty _property = ((ObjectIdReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty"));
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:198) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _tokens[i] == null
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_21() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:186) */
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:196) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String typeId = _typeIds[i];
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_13() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:183) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test
    public void testComplete_ThrowNullPointerException_131() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException  {
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:210) */
        externalTypeHandler.complete(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = _properties.length;
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
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(ExternalTypeHandler.java:180) */
        externalTypeHandler.complete(null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)
    
    /**
    @utbot.classUnderTest {@link ExternalTypeHandler}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler#complete(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#build(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Object bean = creator.build(ctxt, buffer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testComplete_ThrowIllegalStateException() throws Exception  {
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
        PropertyBasedCreator propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _allProperties = {null};
        setField(propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_allProperties", _allProperties);
        
        externalTypeHandler.complete(null, null, propertyValueBuffer, propertyBasedCreator);
    }
    ///endregion
    
    ///region Errors report for complete
    
    public void testComplete_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1070380866108899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1070380866108899.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1070380866114500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070380866108899.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070380866114500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1070380866934200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070380866934200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070380866936200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070380866934200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070380866936200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1070380868428200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070380868428200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070380868431200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070380868428200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070380868431200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1070380868847200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070380868847200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070380868848900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070380868847200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070380868848900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

