package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import com.fasterxml.jackson.databind.util.TokenBuffer.Segment;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.core.Version;
import java.util.TreeMap;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.util.TokenBuffer.Parser;
import com.fasterxml.jackson.databind.node.ShortNode;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.Base64Variant;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_util_TokenBufferTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeObjectIds = true;
        TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _first._tokenTypes = 0L;
        tokenBuffer._first = _first;
        
        String actual = tokenBuffer.toString();
        
        String expected = "[TokenBuffer: ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        String actual = tokenBuffer.toString();
        
        String expected = "[TokenBuffer: ]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): False}
 * @utbot.executesCondition {@code (!_hasNativeObjectIds): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteObjectId()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Not_hasNativeObjectIds() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer1);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertTrue(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertTrue(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        boolean finalTokenBuffer_mayHaveNativeIds = tokenBuffer._mayHaveNativeIds;
        
        assertTrue(finalTokenBuffer_mayHaveNativeIds);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): True}
 * @utbot.executesCondition {@code (!_hasNativeObjectIds): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteTypeId()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend__hasNativeObjectIds() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeObjectIds = true;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer1);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertTrue(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertTrue(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        boolean finalTokenBuffer_mayHaveNativeIds = tokenBuffer._mayHaveNativeIds;
        
        assertTrue(finalTokenBuffer_mayHaveNativeIds);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(com.fasterxml.jackson.databind.util.TokenBuffer)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteTypeId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _hasNativeTypeIds = other.canWriteTypeId();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:257) */
        tokenBuffer.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): False}
 * @utbot.executesCondition {@code (!_hasNativeObjectIds): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _hasNativeObjectIds = other.canWriteObjectId();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:260) */
        tokenBuffer.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): False}
 * @utbot.executesCondition {@code (!_hasNativeObjectIds): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonParser jp = other.asParser();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        tokenBuffer._hasNativeObjectIds = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:264) */
        tokenBuffer.append(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void testAppend1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        tokenBuffer._hasNativeObjectIds = true;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(tokenBuffer1, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
        TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _first._tokenTypes = 0L;
        tokenBuffer1._first = _first;
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer1);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertTrue(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertTrue(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertTrue(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        boolean finalTokenBuffer_mayHaveNativeIds = tokenBuffer._mayHaveNativeIds;
        
        assertTrue(finalTokenBuffer_mayHaveNativeIds);
    }
    
    @Test
    public void testAppend2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _first._tokenTypes = 0L;
        tokenBuffer1._first = _first;
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer1);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertTrue(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertTrue(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        boolean finalTokenBuffer_mayHaveNativeIds = tokenBuffer._mayHaveNativeIds;
        
        assertTrue(finalTokenBuffer_mayHaveNativeIds);
    }
    
    @Test
    public void testAppend3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeObjectIds = true;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _first._tokenTypes = 0L;
        tokenBuffer1._first = _first;
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer1);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertTrue(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertTrue(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        boolean finalTokenBuffer_mayHaveNativeIds = tokenBuffer._mayHaveNativeIds;
        
        assertTrue(finalTokenBuffer_mayHaveNativeIds);
    }
    
    @Test
    public void testAppend4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer actual = tokenBuffer.append(tokenBuffer);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.version
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method version()
    
    @Test
    public void testVersion1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        Version actual = tokenBuffer.version();
        
        Version expected = ((Version) createInstance("com.fasterxml.jackson.core.Version"));
        setField(expected, "com.fasterxml.jackson.core.Version", "_majorVersion", 2);
        setField(expected, "com.fasterxml.jackson.core.Version", "_minorVersion", 4);
        String _groupId = "com.fasterxml.jackson.core";
        setField(expected, "com.fasterxml.jackson.core.Version", "_groupId", _groupId);
        String _artifactId = "jackson-databind";
        setField(expected, "com.fasterxml.jackson.core.Version", "_artifactId", _artifactId);
        String _snapshotInfo = "rc4";
        setField(expected, "com.fasterxml.jackson.core.Version", "_snapshotInfo", _snapshotInfo);
        
        // com.fasterxml.jackson.core.Version has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.flush
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flush()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#flush()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testFlush_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.flush();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeObject(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, value);
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:783) */
        tokenBuffer.writeObject(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeObject(java.lang.Object)
    
    @Test
    public void testWriteObject1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeObject(object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeObject(java.lang.Object)
    
    @Test
    public void testWriteObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:783) */
        tokenBuffer.writeObject(object);
    }
    
    @Test
    public void testWriteObject11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:783) */
        tokenBuffer.writeObject(object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.close();
        
        boolean finalTokenBuffer_closed = tokenBuffer._closed;
        
        assertTrue(finalTokenBuffer_closed);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:633) */
        tokenBuffer.writeString(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString(java.lang.String)
    
    @Test
    public void testWriteString1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        String string = "";
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(string);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(string);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeString(java.lang.String)
    
    @Test
    public void testWriteString11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:633) */
        tokenBuffer.writeString(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:647) */
        tokenBuffer.writeString(serializedString);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteString12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(serializedString);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(serializedString);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeString(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteString22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:647) */
        tokenBuffer.writeString(serializedString);
    }
    
    @Test
    public void testWriteString23() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:994)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:771)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:645) */
        tokenBuffer.writeString(((SerializableString) null));
    }
    
    @Test
    public void testWriteString24() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:647) */
        tokenBuffer.writeString(serializedString);
    }
    
    @Test
    public void testWriteString25() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:647) */
        tokenBuffer.writeString(serializedString);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeString([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(char[],int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: writeString(new String(text, offset, len));
 *  */
    @Test
    public void testWriteString_ThrowStringIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        char[] charArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.StringIndexOutOfBoundsException: offset 1, count 0, length 0]
            java.base/java.lang.String.checkBoundsOffCount(String.java:4593)
            java.base/java.lang.String.rangeCheck(String.java:304)
            java.base/java.lang.String.<init>(String.java:300)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:639) */
        tokenBuffer.writeString(charArray, 1, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString([C, int, int)
    
    @Test
    public void testWriteString26() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        char[] charArray = new char[33];
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(charArray, 6, 14);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString27() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        char[] charArray = new char[32];
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString28() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        char[] charArray = new char[32];
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString29() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 268435456;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[33];
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(charArray, 1, 30);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString30() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[32];
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[32];
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString32() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[40];
        
        tokenBuffer.writeString(charArray, 3, 6);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString33() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[40];
        
        tokenBuffer.writeString(charArray, 3, 6);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeString([C, int, int)
    
    @Test
    public void testWriteString34() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        char[] charArray = new char[33];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:633)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:639) */
        tokenBuffer.writeString(charArray, 6, 14);
    }
    
    @Test
    public void testWriteString35() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[33];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:633)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:639) */
        tokenBuffer.writeString(charArray, 1, 30);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBoolean(boolean)}
 * @utbot.executesCondition {@code (state): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void testWriteBoolean_NotState() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(11L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeBoolean(boolean)
    
    @Test
    public void testWriteBoolean1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(160L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(176L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBoolean(false);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(160L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(11L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(176L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(11L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(176L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBoolean(false);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.isEnabled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.returnsFrom {@code return (_generatorFeatures & f.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled__generatorFeaturesBitwiseAndFGetMaskEqualsZero() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = 1;
        JsonGenerator.Feature feature = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        
        boolean actual = tokenBuffer.isEnabled(feature);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.returnsFrom {@code return (_generatorFeatures & f.getMask()) != 0;}
 *  */
    @Test
    public void testIsEnabled__generatorFeaturesBitwiseAndFGetMaskNotEqualsZero() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -1;
        JsonGenerator.Feature feature = JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM;
        
        boolean actual = tokenBuffer.isEnabled(feature);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_generatorFeatures & f.getMask()) != 0;
 *  */
    @Test
    public void testIsEnabled_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.isEnabled] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.isEnabled(TokenBuffer.java:497) */
        tokenBuffer.isEnabled(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.enable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEnable_JsonGeneratorGetMask() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        JsonGenerator.Feature feature = JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        
        TokenBuffer actual = ((TokenBuffer) tokenBuffer.enable(feature));
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
        int finalTokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        
        assertEquals(-247, finalTokenBuffer_generatorFeatures);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#enable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _generatorFeatures |= f.getMask();
 *  */
    @Test
    public void testEnable_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.enable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.enable(TokenBuffer.java:483) */
        tokenBuffer.enable(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._reportUnsupportedOperation
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _reportUnsupportedOperation()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void test_reportUnsupportedOperation_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer._reportUnsupportedOperation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void testCopyCurrentStructure_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:937) */
        tokenBuffer.copyCurrentStructure(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void testCopyCurrentStructure1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 10;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:953) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:994)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:771)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:924)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:969) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1230)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 536870912;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.canWriteBinaryNatively
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canWriteBinaryNatively()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteBinaryNatively()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCanWriteBinaryNatively_ReturnTrue() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        boolean actual = tokenBuffer.canWriteBinaryNatively();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.useDefaultPrettyPrinter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method useDefaultPrettyPrinter()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#useDefaultPrettyPrinter()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testUseDefaultPrettyPrinter_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer actual = ((TokenBuffer) tokenBuffer.useDefaultPrettyPrinter());
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.disable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method disable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testDisable_JsonGeneratorGetMask() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        JsonGenerator.Feature feature = JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS;
        
        TokenBuffer actual = ((TokenBuffer) tokenBuffer.disable(feature));
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method disable(com.fasterxml.jackson.core.JsonGenerator$Feature)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _generatorFeatures &= ~f.getMask();
 *  */
    @Test
    public void testDisable_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.disable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.disable(TokenBuffer.java:489) */
        tokenBuffer.disable(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeTree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void testWriteTree_TokenBuffer_append() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-249L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:795) */
        tokenBuffer.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:795) */
        tokenBuffer.writeTree(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:795) */
        tokenBuffer.writeTree(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    @Test
    public void testWriteTree1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        ShortNode shortNode = new ShortNode((short) 0);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class shortNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", shortNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = shortNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        JsonToken _typeId = JsonToken.FIELD_NAME;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        JsonToken _typeId = JsonToken.FIELD_NAME;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        MissingNode missingNode = ((MissingNode) createInstance("com.fasterxml.jackson.databind.node.MissingNode"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class missingNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", missingNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = missingNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        ShortNode shortNode = new ShortNode((short) 0);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class shortNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", shortNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = shortNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    @Test
    public void testWriteTree10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:795) */
        tokenBuffer.writeTree(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.getCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodec()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#getCodec()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetCodec_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        ObjectCodec actual = tokenBuffer.getCodec();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.setCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCodec(com.fasterxml.jackson.core.ObjectCodec)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#setCodec(com.fasterxml.jackson.core.ObjectCodec)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetCodec_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer actual = ((TokenBuffer) tokenBuffer.setCodec(null));
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.asParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asParser(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.returnsFrom {@code return p;}
 *  */
    @Test
    public void testAsParser_ReturnP_1() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            
            TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(treeTraversingParser));
            
            TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
            expected._segmentPtr = -1;
            JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
            setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
            setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
            expected._parsingContext = _parsingContext;
            JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_lineNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_columnNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_sourceRef", string);
            expected._location = _location;
            
            ObjectCodec actual_codec = actual._codec;
            assertNull(actual_codec);
            
            boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
            assertFalse(actual_hasNativeTypeIds);
            
            boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
            assertFalse(actual_hasNativeObjectIds);
            
            boolean actual_hasNativeIds = actual._hasNativeIds;
            assertFalse(actual_hasNativeIds);
            
            TokenBuffer.Segment actual_segment = actual._segment;
            assertNull(actual_segment);
            
            int expected_segmentPtr = expected._segmentPtr;
            int actual_segmentPtr = actual._segmentPtr;
            assertEquals(expected_segmentPtr, actual_segmentPtr);
            
            JsonReadContext expected_parsingContext = expected._parsingContext;
            JsonReadContext actual_parsingContext = actual._parsingContext;
            JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
            assertNull(actual_parsingContext_parent);
            
            DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
            assertNull(actual_parsingContext_dups);
            
            int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
            
            int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
            
            String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
            assertNull(actual_parsingContext_currentName);
            
            JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
            assertNull(actual_parsingContext_child);
            
            int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(expected_parsingContext_type, actual_parsingContext_type);
            
            int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(expected_parsingContext_index, actual_parsingContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
            assertNull(actual_byteBuilder);
            
            JsonLocation expected_location = expected._location;
            JsonLocation actual_location = actual._location;
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(expected_location, actual_location);
            
            JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
            assertNull(actual_currToken);
            
            JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
            assertNull(actual_lastClearedToken);
            
            int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
            assertEquals(expected_features, actual_features);
            
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.returnsFrom {@code return p;}
 *  */
    @Test
    public void testAsParser_ReturnP() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(jsonParserSequence));
            
            TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
            expected._segmentPtr = -1;
            JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
            setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
            setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
            expected._parsingContext = _parsingContext;
            JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_lineNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_columnNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_sourceRef", string);
            expected._location = _location;
            
            ObjectCodec actual_codec = actual._codec;
            assertNull(actual_codec);
            
            boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
            assertFalse(actual_hasNativeTypeIds);
            
            boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
            assertFalse(actual_hasNativeObjectIds);
            
            boolean actual_hasNativeIds = actual._hasNativeIds;
            assertFalse(actual_hasNativeIds);
            
            TokenBuffer.Segment actual_segment = actual._segment;
            assertNull(actual_segment);
            
            int expected_segmentPtr = expected._segmentPtr;
            int actual_segmentPtr = actual._segmentPtr;
            assertEquals(expected_segmentPtr, actual_segmentPtr);
            
            JsonReadContext expected_parsingContext = expected._parsingContext;
            JsonReadContext actual_parsingContext = actual._parsingContext;
            JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
            assertNull(actual_parsingContext_parent);
            
            DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
            assertNull(actual_parsingContext_dups);
            
            int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
            
            int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
            
            String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
            assertNull(actual_parsingContext_currentName);
            
            JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
            assertNull(actual_parsingContext_child);
            
            int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(expected_parsingContext_type, actual_parsingContext_type);
            
            int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(expected_parsingContext_index, actual_parsingContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
            assertNull(actual_byteBuilder);
            
            JsonLocation expected_location = expected._location;
            JsonLocation actual_location = actual._location;
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(expected_location, actual_location);
            
            JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
            assertNull(actual_currToken);
            
            JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
            assertNull(actual_lastClearedToken);
            
            int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
            assertEquals(expected_features, actual_features);
            
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.returnsFrom {@code return p;}
 *  */
    @Test
    public void testAsParser_ReturnP_2() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(jsonParserSequence));
            
            TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
            expected._segmentPtr = -1;
            JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
            setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
            setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
            expected._parsingContext = _parsingContext;
            JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_lineNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_columnNr", -1);
            setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_sourceRef", string);
            expected._location = _location;
            
            ObjectCodec actual_codec = actual._codec;
            assertNull(actual_codec);
            
            boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
            assertFalse(actual_hasNativeTypeIds);
            
            boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
            assertFalse(actual_hasNativeObjectIds);
            
            boolean actual_hasNativeIds = actual._hasNativeIds;
            assertFalse(actual_hasNativeIds);
            
            TokenBuffer.Segment actual_segment = actual._segment;
            assertNull(actual_segment);
            
            int expected_segmentPtr = expected._segmentPtr;
            int actual_segmentPtr = actual._segmentPtr;
            assertEquals(expected_segmentPtr, actual_segmentPtr);
            
            JsonReadContext expected_parsingContext = expected._parsingContext;
            JsonReadContext actual_parsingContext = actual._parsingContext;
            JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
            assertNull(actual_parsingContext_parent);
            
            DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
            assertNull(actual_parsingContext_dups);
            
            int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
            assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
            
            int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
            assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
            
            String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
            assertNull(actual_parsingContext_currentName);
            
            JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
            assertNull(actual_parsingContext_child);
            
            int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
            assertEquals(expected_parsingContext_type, actual_parsingContext_type);
            
            int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
            assertEquals(expected_parsingContext_index, actual_parsingContext_index);
            
            boolean actual_closed = actual._closed;
            assertFalse(actual_closed);
            
            ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
            assertNull(actual_byteBuilder);
            
            JsonLocation expected_location = expected._location;
            JsonLocation actual_location = actual._location;
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(expected_location, actual_location);
            
            JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
            assertNull(actual_currToken);
            
            JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
            assertNull(actual_lastClearedToken);
            
            int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
            int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
            assertEquals(expected_features, actual_features);
            
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asParser(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCodec()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Parser p = new Parser(_first, src.getCodec(), _hasNativeTypeIds, _hasNativeObjectIds);
 *  */
    @Test
    public void testAsParser_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.asParser] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:220) */
        tokenBuffer.asParser(((JsonParser) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asParser(com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void testAsParser1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate3 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(jsonParserDelegate));
        
        TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        expected._segmentPtr = -1;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        expected._parsingContext = _parsingContext;
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalBytes", -1L);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_totalChars", -1L);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_lineNr", -1);
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_columnNr", -1);
        String _sourceRef = "N/A";
        setField(_location, "com.fasterxml.jackson.core.JsonLocation", "_sourceRef", _sourceRef);
        expected._location = _location;
        
        ObjectCodec actual_codec = actual._codec;
        assertNull(actual_codec);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_hasNativeIds = actual._hasNativeIds;
        assertFalse(actual_hasNativeIds);
        
        TokenBuffer.Segment actual_segment = actual._segment;
        assertNull(actual_segment);
        
        int expected_segmentPtr = expected._segmentPtr;
        int actual_segmentPtr = actual._segmentPtr;
        assertEquals(expected_segmentPtr, actual_segmentPtr);
        
        JsonReadContext expected_parsingContext = expected._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parsingContext_type, actual_parsingContext_type);
        
        int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parsingContext_index, actual_parsingContext_index);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
        assertNull(actual_byteBuilder);
        
        JsonLocation expected_location = expected._location;
        JsonLocation actual_location = actual._location;
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected_location, actual_location);
        
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method asParser(com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = StackOverflowError.class)
    public void testAsParser2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        tokenBuffer.asParser(jsonParserDelegate);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.asParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asParser(com.fasterxml.jackson.core.ObjectCodec)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.ObjectCodec)}
 * @utbot.returnsFrom {@code return new Parser(_first, codec, _hasNativeTypeIds, _hasNativeObjectIds);}
 *  */
    @Test
    public void testAsParser_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(((ObjectCodec) null)));
        
        TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        expected._segmentPtr = -1;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        expected._parsingContext = _parsingContext;
        
        ObjectCodec actual_codec = actual._codec;
        assertNull(actual_codec);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_hasNativeIds = actual._hasNativeIds;
        assertFalse(actual_hasNativeIds);
        
        TokenBuffer.Segment actual_segment = actual._segment;
        assertNull(actual_segment);
        
        int expected_segmentPtr = expected._segmentPtr;
        int actual_segmentPtr = actual._segmentPtr;
        assertEquals(expected_segmentPtr, actual_segmentPtr);
        
        JsonReadContext expected_parsingContext = expected._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parsingContext_type, actual_parsingContext_type);
        
        int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parsingContext_index, actual_parsingContext_index);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
        assertNull(actual_byteBuilder);
        
        JsonLocation actual_location = actual._location;
        assertNull(actual_location);
        
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.asParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asParser()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#asParser(com.fasterxml.jackson.core.ObjectCodec)}
 * @utbot.returnsFrom {@code return asParser(_objectCodec);}
 *  */
    @Test
    public void testAsParser_TokenBufferAsParser() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser());
        
        TokenBuffer.Parser expected = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        expected._segmentPtr = -1;
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr", 1);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        expected._parsingContext = _parsingContext;
        
        ObjectCodec actual_codec = actual._codec;
        assertNull(actual_codec);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_hasNativeIds = actual._hasNativeIds;
        assertFalse(actual_hasNativeIds);
        
        TokenBuffer.Segment actual_segment = actual._segment;
        assertNull(actual_segment);
        
        int expected_segmentPtr = expected._segmentPtr;
        int actual_segmentPtr = actual._segmentPtr;
        assertEquals(expected_segmentPtr, actual_segmentPtr);
        
        JsonReadContext expected_parsingContext = expected._parsingContext;
        JsonReadContext actual_parsingContext = actual._parsingContext;
        JsonReadContext actual_parsingContext_parent = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_parent"));
        assertNull(actual_parsingContext_parent);
        
        DupDetector actual_parsingContext_dups = ((DupDetector) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_dups"));
        assertNull(actual_parsingContext_dups);
        
        int expected_parsingContext_lineNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        int actual_parsingContext_lineNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_lineNr"));
        assertEquals(expected_parsingContext_lineNr, actual_parsingContext_lineNr);
        
        int expected_parsingContext_columnNr = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        int actual_parsingContext_columnNr = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_columnNr"));
        assertEquals(expected_parsingContext_columnNr, actual_parsingContext_columnNr);
        
        String actual_parsingContext_currentName = ((String) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_currentName"));
        assertNull(actual_parsingContext_currentName);
        
        JsonReadContext actual_parsingContext_child = ((JsonReadContext) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.json.JsonReadContext", "_child"));
        assertNull(actual_parsingContext_child);
        
        int expected_parsingContext_type = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parsingContext_type = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parsingContext_type, actual_parsingContext_type);
        
        int expected_parsingContext_index = ((Integer) getFieldValue(expected_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parsingContext_index = ((Integer) getFieldValue(actual_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parsingContext_index, actual_parsingContext_index);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        ByteArrayBuilder actual_byteBuilder = actual._byteBuilder;
        assertNull(actual_byteBuilder);
        
        JsonLocation actual_location = actual._location;
        assertNull(actual_location);
        
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int expected_features = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(expected_features, actual_features);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.deserialize
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testDeserialize1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1230)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(parser, impl);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:994)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:771)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:924)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:969)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, null);
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1230)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, null);
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1230)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:944)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:406) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#isClosed()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsClosed_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        boolean actual = tokenBuffer.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.getFeatureMask
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeatureMask()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#getFeatureMask()}
 * @utbot.returnsFrom {@code return _generatorFeatures;}
 *  */
    @Test
    public void testGetFeatureMask_Return_generatorFeatures() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        
        int actual = tokenBuffer.getFeatureMask();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.setFeatureMask
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFeatureMask(int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#setFeatureMask(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetFeatureMask_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._generatorFeatures = -255;
        
        TokenBuffer actual = ((TokenBuffer) tokenBuffer.setFeatureMask(-255));
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        int tokenBuffer_generatorFeatures = tokenBuffer._generatorFeatures;
        int actual_generatorFeatures = actual._generatorFeatures;
        assertEquals(tokenBuffer_generatorFeatures, actual_generatorFeatures);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        boolean actual_hasNativeTypeIds = actual._hasNativeTypeIds;
        assertFalse(actual_hasNativeTypeIds);
        
        boolean actual_hasNativeObjectIds = actual._hasNativeObjectIds;
        assertFalse(actual_hasNativeObjectIds);
        
        boolean actual_mayHaveNativeIds = actual._mayHaveNativeIds;
        assertFalse(actual_mayHaveNativeIds);
        
        TokenBuffer.Segment actual_first = actual._first;
        assertNull(actual_first);
        
        TokenBuffer.Segment actual_last = actual._last;
        assertNull(actual_last);
        
        int tokenBuffer_appendAt = tokenBuffer._appendAt;
        int actual_appendAt = actual._appendAt;
        assertEquals(tokenBuffer_appendAt, actual_appendAt);
        
        Object actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        Object actual_objectId = actual._objectId;
        assertNull(actual_objectId);
        
        boolean actual_hasNativeId = actual._hasNativeId;
        assertFalse(actual_hasNativeId);
        
        JsonWriteContext actual_writeContext = actual._writeContext;
        assertNull(actual_writeContext);
        
        PrettyPrinter actual_cfgPrettyPrinter = ((PrettyPrinter) getFieldValue(actual, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter"));
        assertNull(actual_cfgPrettyPrinter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNull()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNull()}
 *  */
    @Test
    public void testWriteNull() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNull()}
 *  */
    @Test
    public void testWriteNull_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-243L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNull()}
 *  */
    @Test
    public void testWriteNull_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNull()
    
    @Test
    public void testWriteNull1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNull();
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNull();
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRawUTF8String
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRawUTF8String([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRawUTF8String(byte[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawUTF8String_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawUTF8String(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data, offset, copy, 0, len);
 *  */
    @Test
    public void testWriteBinary_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:815) */
        tokenBuffer.writeBinary(null, byteArray, -1, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: byte[] copy = new byte[len];
 *  */
    @Test
    public void testWriteBinary_ThrowNegativeArraySizeException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:814) */
        tokenBuffer.writeBinary(null, null, -255, -256);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeObject(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeObject(copy);
 *  */
    @Test
    public void testWriteBinary_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:783)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:816) */
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data, offset, copy, 0, len);
 *  */
    @Test
    public void testWriteBinary_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:815) */
        tokenBuffer.writeBinary(null, null, -255, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    @Test
    public void testWriteBinary1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 8, 1);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBinary2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 8, 1);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBinary3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 2, 5);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBinary4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 9, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBinary5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 9, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeBinary(com.fasterxml.jackson.core.Base64Variant, java.io.InputStream, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinary_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeBinary(((Base64Variant) null), ((InputStream) null), -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.firstToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method firstToken()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#firstToken()}
 * @utbot.executesCondition {@code (_first != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFirstToken__firstEqualsNull() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        JsonToken actual = tokenBuffer.firstToken();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#firstToken()}
 * @utbot.executesCondition {@code (_first != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#type(int)}
 * @utbot.returnsFrom {@code return _first.type(0);}
 *  */
    @Test
    public void testFirstToken__firstNotEqualsNull() throws Exception  {
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
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = -242L;
            tokenBuffer._first = _first;
            
            JsonToken actual = tokenBuffer.firstToken();
            
            assertNull(actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.getOutputContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOutputContext()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#getOutputContext()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetOutputContext_Return() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        JsonWriteContext actual = tokenBuffer.getOutputContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _appendNativeIds(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendNativeIds(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#findObjectId(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#findTypeId(int)}
 *  */
    @Test
    public void test_appendNativeIds_TokenBufferFindTypeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -255;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method _appendNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_appendNativeIds", stringBuilderType);
        _appendNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _appendNativeIdsMethodArguments = new java.lang.Object[1];
        _appendNativeIdsMethodArguments[0] = ((Object) null);
        _appendNativeIdsMethod.invoke(tokenBuffer, _appendNativeIdsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _appendNativeIds(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendNativeIds(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_appendNativeIds_ThrowClassCastException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class sun.security.x509.AVA (java.lang.Integer and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1745)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:465) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method _appendNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_appendNativeIds", stringBuilderType);
        _appendNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _appendNativeIdsMethodArguments = new java.lang.Object[1];
        _appendNativeIdsMethodArguments[0] = ((Object) null);
        try {
            _appendNativeIdsMethod.invoke(tokenBuffer, _appendNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendNativeIds(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_appendNativeIds_ThrowClassCastException_1() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1745)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:465) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method _appendNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_appendNativeIds", stringBuilderType);
        _appendNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _appendNativeIdsMethodArguments = new java.lang.Object[1];
        _appendNativeIdsMethodArguments[0] = ((Object) null);
        try {
            _appendNativeIdsMethod.invoke(tokenBuffer, _appendNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendNativeIds(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_appendNativeIds_ThrowClassCastException_2() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.ProcessEnvironment$NameComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1745)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:465) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method _appendNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_appendNativeIds", stringBuilderType);
        _appendNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _appendNativeIdsMethodArguments = new java.lang.Object[1];
        _appendNativeIdsMethodArguments[0] = ((Object) null);
        try {
            _appendNativeIdsMethod.invoke(tokenBuffer, _appendNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendNativeIds(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#findObjectId(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object objectId = _last.findObjectId(_appendAt - 1);
 *  */
    @Test
    public void test_appendNativeIds_ThrowNullPointerException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:465) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method _appendNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_appendNativeIds", stringBuilderType);
        _appendNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _appendNativeIdsMethodArguments = new java.lang.Object[1];
        _appendNativeIdsMethodArguments[0] = ((Object) null);
        try {
            _appendNativeIdsMethod.invoke(tokenBuffer, _appendNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _appendNativeIds
    
    public void test_appendNativeIds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeStartObject()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildObjectContext()}
 *  */
    @Test
    public void testWriteStartObject_JsonWriteContextCreateChildObjectContext() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeStartObject();
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext1 = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertEquals(2, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStartObject()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildObjectContext();
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildObjectContext();
 *  */
    @Test
    public void testWriteStartObject_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeStartObject()
    
    @Test
    public void testWriteStartObject1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        Object _source = createInstance("java.lang.Object");
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_source", _source);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(1L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartObject2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(1L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartObject3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(16L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartObject4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(16L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext1 = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
        
        assertEquals(2, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    
    @Test
    public void testWriteStartObject6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeStartObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext1 = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(16L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
        
        assertEquals(2, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeStartObject()
    
    @Test
    public void testWriteStartObject7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:591) */
        tokenBuffer.writeStartObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRaw
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw(char)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(' ');
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRaw
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((SerializableString) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRaw
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(java.lang.String,int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((String) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRaw
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRaw
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((char[]) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(double)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:730) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:730) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:730) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:743) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:743) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:752) */
        tokenBuffer.writeNumber(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:752) */
        tokenBuffer.writeNumber(bigInteger);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void testWriteNumber_TokenBuffer_append() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-247L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:761) */
        tokenBuffer.writeNumber(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:761) */
        tokenBuffer.writeNumber(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(float)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:735) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:735) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(float)
    
    @Test
    public void testWriteNumber1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:720) */
        tokenBuffer.writeNumber(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:720) */
        tokenBuffer.writeNumber(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(int)
    
    @Test
    public void testWriteNumber6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 536870912;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(int)
    
    @Test
    public void testWriteNumber17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = new java.lang.Object[14];
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 14;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:720) */
        tokenBuffer.writeNumber(0);
    }
    
    @Test
    public void testWriteNumber18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:720) */
        tokenBuffer.writeNumber(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(long)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:725) */
        tokenBuffer.writeNumber(-255L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(long)
    
    @Test
    public void testWriteNumber19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber23() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber24() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber25() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(long)
    
    @Test
    public void testWriteNumber26() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 5;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:725) */
        tokenBuffer.writeNumber(0L);
    }
    
    @Test
    public void testWriteNumber27() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:725) */
        tokenBuffer.writeNumber(0L);
    }
    
    @Test
    public void testWriteNumber28() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:725) */
        tokenBuffer.writeNumber(0L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(short)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:715) */
        tokenBuffer.writeNumber((short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:715) */
        tokenBuffer.writeNumber((short) -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(short)
    
    @Test
    public void testWriteNumber29() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 536870912;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber((short) 0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber30() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber32() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber((short) 0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber33() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber34() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber35() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber36() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber37() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber38() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(short)
    
    @Test
    public void testWriteNumber39() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = new java.lang.Object[14];
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 14;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:715) */
        tokenBuffer.writeNumber((short) 0);
    }
    
    @Test
    public void testWriteNumber40() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:715) */
        tokenBuffer.writeNumber((short) 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:618) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteFieldName1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:618) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:618) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:619) */
        tokenBuffer.writeFieldName(serializedString);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFieldName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610) */
        tokenBuffer.writeFieldName(((String) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFieldName(java.lang.String)
    
    @Test
    public void testWriteFieldName11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610) */
        tokenBuffer.writeFieldName(string);
    }
    
    @Test
    public void testWriteFieldName12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:610) */
        tokenBuffer.writeFieldName(string);
    }
    
    @Test
    public void testWriteFieldName19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(string);
    }
    
    @Test
    public void testWriteFieldName20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:611) */
        tokenBuffer.writeFieldName(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEndObject()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 *  */
    @Test
    public void testWriteEndObject_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(32L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 *  */
    @Test
    public void testWriteEndObject() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(32L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEndObject()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeEndObject()
    
    @Test
    public void testWriteEndObject1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndObject();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(2L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeEndObject()
    
    @Test
    public void testWriteEndObject2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:600) */
        tokenBuffer.writeEndObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeUTF8String
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeUTF8String([B, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeUTF8String(byte[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteUTF8String_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeUTF8String(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeEndArray()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 *  */
    @Test
    public void testWriteEndArray_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(64L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 *  */
    @Test
    public void testWriteEndArray() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(64L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeEndArray()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeEndArray()
    
    @Test
    public void testWriteEndArray1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeEndArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(4L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeEndArray()
    
    @Test
    public void testWriteEndArray2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:580) */
        tokenBuffer.writeEndArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRawValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRawValue([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRawValue(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawValue(((char[]) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRawValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRawValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRawValue(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_ThrowUnsupportedOperationException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeRawValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRawValue(java.lang.String, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRawValue(java.lang.String,int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_ThrowUnsupportedOperationException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawValue(((String) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeStartArray()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildArrayContext();
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildArrayContext();
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeStartArray()
    
    @Test
    public void testWriteStartArray1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext1 = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(3L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    
    @Test
    public void testWriteStartArray2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(3L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartArray3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(3L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartArray4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(48L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartArray5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(48L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteStartArray6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_child, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        tokenBuffer._writeContext = _writeContext;
        
        JsonWriteContext initialTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext finalTokenBuffer_writeContext = tokenBuffer._writeContext;
        
        assertFalse(initialTokenBuffer_writeContext == finalTokenBuffer_writeContext);
        
        assertEquals(48L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeStartArray()
    
    @Test
    public void testWriteStartArray7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    
    @Test
    public void testWriteStartArray14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:571) */
        tokenBuffer.writeStartArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _appendRaw(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 *  */
    @Test
    public void test_appendRaw_Not_hasNativeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer._appendRaw(-255, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-255L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 *  */
    @Test
    public void test_appendRaw_Not_hasNativeId_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer._appendRaw(-255, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-4080L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#appendRaw(int,int,java.lang.Object,java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void test_appendRaw__hasNativeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer._appendRaw(-255, null);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _appendRaw(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#appendRaw(int,int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _last.appendRaw(_appendAt, rawType, value)
 *  */
    @Test
    public void test_appendRaw_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1709)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1020) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#appendRaw(int,int,java.lang.Object,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _last.appendRaw(_appendAt, rawType, value, _objectId, _typeId)
 *  */
    @Test
    public void test_appendRaw_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1719)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1019) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.appendRaw(_appendAt, rawType, value)
 *  */
    @Test
    public void test_appendRaw_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1020) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.appendRaw(_appendAt, rawType, value, _objectId, _typeId)
 *  */
    @Test
    public void test_appendRaw_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1019) */
        tokenBuffer._appendRaw(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _appendRaw(int, java.lang.Object)
    
    @Test
    public void test_appendRaw1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object object = new Object();
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._appendRaw(0, object);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _tokens);
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._appendRaw(0, object);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_appendRaw8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer._appendRaw(0, object);
        
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _appendRaw(int, java.lang.Object)
    
    @Test
    public void test_appendRaw9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1709)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1020) */
        tokenBuffer._appendRaw(0, object);
    }
    
    @Test
    public void test_appendRaw10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1719)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1019) */
        tokenBuffer._appendRaw(0, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._append
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006) */
        tokenBuffer._append(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    
    @Test
    public void test_append1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer._append(jsonToken, object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer._append(jsonToken, object);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(51539607552L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        Object object = new Object();
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer._append(jsonToken, object);
        
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    
    @Test
    public void test_append4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1688)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007) */
        tokenBuffer._append(null, object);
    }
    
    @Test
    public void test_append5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1687)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1007) */
        tokenBuffer._append(jsonToken, object);
    }
    
    @Test
    public void test_append6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1699)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1635)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006) */
        tokenBuffer._append(null, object);
    }
    
    @Test
    public void test_append7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1698)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006) */
        tokenBuffer._append(jsonToken, object);
    }
    
    @Test
    public void test_append8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1699)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1006) */
        tokenBuffer._append(null, object);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _append(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_Not_hasNativeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        tokenBuffer._append(jsonToken);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(32L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type)
 *  */
    @Test
    public void test_append_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:994) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1677)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1608)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:993) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:993) */
        tokenBuffer._append(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _append(com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_append9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._append(jsonToken);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.VALUE_TRUE;
        
        tokenBuffer._append(jsonToken);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_append17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1667)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1596)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:994) */
        tokenBuffer._append(null);
    }
    
    @Test
    public void test_append18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1677)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1612)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:993) */
        tokenBuffer._append(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.canWriteObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canWriteObjectId()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteObjectId()}
 * @utbot.returnsFrom {@code return _hasNativeObjectIds;}
 *  */
    @Test
    public void testCanWriteObjectId_Return_hasNativeObjectIds() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        boolean actual = tokenBuffer.canWriteObjectId();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeTypeId(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTypeId(java.lang.Object)}
 *  */
    @Test
    public void testWriteTypeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeTypeId(null);
        
        boolean finalTokenBuffer_hasNativeId = tokenBuffer._hasNativeId;
        
        assertTrue(finalTokenBuffer_hasNativeId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTypeId()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_checkNativeIds_ThrowClassCastException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds] produces [java.lang.ClassCastException: class [S cannot be cast to class java.lang.Integer ([S and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1752)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1476)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:976) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", parserType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = parser;
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTypeId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (_typeId = jp.getTypeId()) != null
 *  */
    @Test
    public void test_checkNativeIds_ThrowNullPointerException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:976) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = ((Object) null);
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void test_checkNativeIds1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", parserType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = parser;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate1 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _segment._nativeIds = _nativeIds;
        delegate1._segment = _segment;
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegateType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegateType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegateType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegate1Type = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegate1Type);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate1;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void test_checkNativeIds6() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1752)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1476)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:976) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegateType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate;
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    @Test(timeout = 1000L)
    public void test_checkNativeIds7() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", parserType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = parser;
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _checkNativeIds
    
    public void test_checkNativeIds_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeObjectId(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeObjectId(java.lang.Object)}
 *  */
    @Test
    public void testWriteObjectId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeObjectId(null);
        
        boolean finalTokenBuffer_hasNativeId = tokenBuffer._hasNativeId;
        
        assertTrue(finalTokenBuffer_hasNativeId);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (_mayHaveNativeIds): True}
 * @utbot.invokes com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _checkNativeIds(jp);
 *  */
    @Test
    public void testCopyCurrentEvent_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:976)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:868) */
        tokenBuffer.copyCurrentEvent(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)
    
    @Test
    public void testCopyCurrentEvent1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:870) */
        tokenBuffer.copyCurrentEvent(parser);
    }
    
    @Test
    public void testCopyCurrentEvent2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate2 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 2;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        delegate2._segment = _segment;
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:870) */
        tokenBuffer.copyCurrentEvent(jsonParserSequence);
    }
    
    @Test
    public void testCopyCurrentEvent3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate2 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        delegate2._segment = _segment;
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:870) */
        tokenBuffer.copyCurrentEvent(jsonParserSequence);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)
    
    @Test(timeout = 1000L)
    public void testCopyCurrentEvent4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "left", root);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenBuffer.copyCurrentEvent(parser);
    }
    ///endregion
    
    ///region Errors report for copyCurrentEvent
    
    public void testCopyCurrentEvent_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.canWriteTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canWriteTypeId()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#canWriteTypeId()}
 * @utbot.returnsFrom {@code return _hasNativeTypeIds;}
 *  */
    @Test
    public void testCanWriteTypeId_Return_hasNativeTypeIds() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        boolean actual = tokenBuffer.canWriteTypeId();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.serialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serialize(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#serialize(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testSerialize_TEqualsNull() throws Exception  {
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
            TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = -243L;
            tokenBuffer._first = _first;
            
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#serialize(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#hasIds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasIds = checkIds && (segment.hasIds());
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:288) */
        tokenBuffer.serialize(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#serialize(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = segment.type(ptr);
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:297) */
        tokenBuffer.serialize(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serialize(com.fasterxml.jackson.core.JsonGenerator)
    
    @Test
    public void testSerialize1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _first._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _first._nativeIds = _nativeIds;
        tokenBuffer._first = _first;
        TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.serialize(tokenBuffer1);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1062263060251100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1062263060251100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1062263060265600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062263060251100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062263060265600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1062263060678800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1062263060678800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1062263060682599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062263060678800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062263060682599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1062263061298999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1062263061298999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1062263061302500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062263061298999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062263061302500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1062263062546599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1062263062546599.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1062263062550900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1062263062546599.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1062263062550900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

