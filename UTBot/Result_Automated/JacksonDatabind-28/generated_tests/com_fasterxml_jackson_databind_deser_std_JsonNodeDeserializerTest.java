package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_std_JsonNodeDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getNullValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullValue(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#getNullValue(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NullNode#getInstance()}
 * @utbot.returnsFrom {@code return NullNode.getInstance();}
 *  */
    @Test
    public void testGetNullValue_NullNodeGetInstance() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            
            NullNode actual = ((NullNode) jsonNodeDeserializer.getNullValue(((DeserializationContext) null)));
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getNullValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNullValue()
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#getNullValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NullNode#getInstance()}
 * @utbot.returnsFrom {@code return NullNode.getInstance();}
 *  */
    @Test
    public void testGetNullValue_NullNodeGetInstance1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            
            NullNode actual = ((NullNode) jsonNodeDeserializer.getNullValue());
            
            // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
            assertEquals(instance, actual);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(p.getCurrentTokenId())
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws IOException  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:67) */
        jsonNodeDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeAny(p, ctxt, ctxt.getNodeFactory());
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getNodeFactory()}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeArray(p, ctxt, ctxt.getNodeFactory());
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeAny(p, ctxt, ctxt.getNodeFactory());
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getNodeFactory()}
 * @utbot.activatesSwitch {@code switch(p.getCurrentTokenId()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return deserializeObject(p, ctxt, ctxt.getNodeFactory());
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize1() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        BooleanNode actual = ((BooleanNode) jsonNodeDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl)));
        
        BooleanNode expected = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(expected, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        
        // com.fasterxml.jackson.databind.node.BooleanNode has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Class initialJsonNodeDeserializer_valueClass = jsonNodeDeserializer._valueClass;
        
        BooleanNode actual = ((BooleanNode) jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl)));
        
        BooleanNode expected = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(expected, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        
        // com.fasterxml.jackson.databind.node.BooleanNode has overridden equals method
        assertEquals(expected, actual);
        
        Class finalJsonNodeDeserializer_valueClass = jsonNodeDeserializer._valueClass;
        
        assertFalse(initialJsonNodeDeserializer_valueClass == finalJsonNodeDeserializer_valueClass);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        BooleanNode actual = ((BooleanNode) jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) impl)));
        
        BooleanNode expected = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(expected, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        
        // com.fasterxml.jackson.databind.node.BooleanNode has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        ObjectNode actual = ((ObjectNode) jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl)));
        
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ObjectNode expected = new ObjectNode(jsonNodeFactory, linkedHashMap);
        
        // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize5() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null));
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:209)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:69) */
        jsonNodeDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:209)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:69) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getCurrentName(FilteringParserDelegate.java:186)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:103)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:218)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:312)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize11() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:835)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:165)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._fromFloat(JsonNodeDeserializer.java:366)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:320)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:209)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:69) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize13() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize14() throws Exception  {
        int prevF_MASK_INT_COERCIONS = StdDeserializer.F_MASK_INT_COERCIONS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_INT_COERCIONS", 6);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.START_ARRAY;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 4);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeArray(JsonNodeDeserializer.java:263)
                com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:71) */
            jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_INT_COERCIONS", prevF_MASK_INT_COERCIONS);
        }
    }
    
    @Test
    public void testDeserialize15() throws Exception  {
        int prevF_MASK_INT_COERCIONS = StdDeserializer.F_MASK_INT_COERCIONS;
        try {
            Class stdDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.StdDeserializer");
            setStaticField(stdDeserializerClazz, "F_MASK_INT_COERCIONS", 6);
            JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonToken _currToken = JsonToken.VALUE_FALSE;
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
            JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:324)
                com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
            jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
        } finally {
            setStaticField(StdDeserializer.class, "F_MASK_INT_COERCIONS", prevF_MASK_INT_COERCIONS);
        }
    }
    
    @Test
    public void testDeserialize16() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.JsonParser.nextFieldName(JsonParser.java:651)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:209)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:69) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize17() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate4 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate4, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    @Test
    public void testDeserialize18() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) filteringParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize19() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        FilteringParserDelegate _parser = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:854)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize20() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:854)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize21() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTokenLocation(UTF8StreamJsonParser.java:652)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:854)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize22() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        FilteringParserDelegate _parser = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getNumberType(FilteringParserDelegate.java:835)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getNumberType(JsonParserDelegate.java:165)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._fromInt(JsonNodeDeserializer.java:352)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:318)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize23() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        FilteringParserDelegate _parser = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(JsonNodeDeserializer.java:206)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:308)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize24() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        JsonNodeFactory _nodeFactory = ((JsonNodeFactory) createInstance("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        setField(_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory", _nodeFactory);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate2), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize25() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize26() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getText(FilteringParserDelegate.java:795)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getText(JsonParserDelegate.java:125)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:316)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize27() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:854)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize28() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getTokenLocation(FilteringParserDelegate.java:866)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:196)
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:148)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:854)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize29() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_TRUE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:322)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize30() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize31() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate2), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize32() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate3 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:97)
            com.fasterxml.jackson.databind.DeserializationContext.mappingException(DeserializationContext.java:850)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:334)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize33() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate3 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.getEmbeddedObject(FilteringParserDelegate.java:863)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getEmbeddedObject(JsonParserDelegate.java:193)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._fromEmbedded(JsonNodeDeserializer.java:378)
            com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(JsonNodeDeserializer.java:314)
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) impl));
    }
    
    @Test
    public void testDeserialize34() throws Exception  {
        JsonNodeDeserializer jsonNodeDeserializer = new JsonNodeDeserializer();
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        JsonParserDelegate jsonParserDelegate6 = new JsonParserDelegate(jsonParserDelegate5);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.deserialize(JsonNodeDeserializer.java:73) */
        jsonNodeDeserializer.deserialize(((JsonParser) jsonParserDelegate6), ((DeserializationContext) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.getDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeserializer(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JsonNodeDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer#getDeserializer(java.lang.Class)}
 * @utbot.executesCondition {@code (nodeClass): False}
 * @utbot.executesCondition {@code (nodeClass): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer#getInstance()}
 * @utbot.returnsFrom {@code return ArrayDeserializer.getInstance();}
 *  */
    @Test
    public void testGetDeserializer_NodeClass() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonNodeDeserializer.ArrayDeserializer prev_instance = JsonNodeDeserializer.ArrayDeserializer._instance;
        try {
            JsonNodeDeserializer.ArrayDeserializer _instance = new JsonNodeDeserializer.ArrayDeserializer();
            Class arrayDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer");
            setStaticField(arrayDeserializerClazz, "_instance", _instance);
            Class class1 = Object.class;
            
            JsonNodeDeserializer actual = ((JsonNodeDeserializer) JsonNodeDeserializer.getDeserializer(class1));
            
            JsonNodeDeserializer expected = new JsonNodeDeserializer();
            
            Class expected_valueClass = expected._valueClass;
            Class actual_valueClass = actual._valueClass;
            assertEquals(Class.class, actual_valueClass.getClass());
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(JsonNodeDeserializer.ArrayDeserializer.class, "_instance", prev_instance);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1070157287077700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1070157287077700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1070157287086600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070157287077700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070157287086600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1070157288559200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1070157288559200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1070157288562600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1070157288559200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1070157288562600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

