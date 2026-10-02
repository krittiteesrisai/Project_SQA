package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import com.fasterxml.jackson.databind.util.TokenBuffer.Segment;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.TreeMap;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.SerializableString;
import sun.security.util.ByteArrayLexOrder;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.node.NullNode;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.util.TokenBuffer.Parser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.Base64Variant;
import java.io.InputStream;
import java.text.RuleBasedCollator;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Comparator;
import com.fasterxml.jackson.core.JsonGenerationException;
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
            _first._tokenTypes = 1L;
            tokenBuffer._first = _first;
            
            String actual = tokenBuffer.toString();
            
            String expected = "[TokenBuffer: START_OBJECT]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString3() throws Exception  {
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
            _first._tokenTypes = 3L;
            tokenBuffer._first = _first;
            
            String actual = tokenBuffer.toString();
            
            String expected = "[TokenBuffer: START_ARRAY]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString4() throws Exception  {
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
            _first._tokenTypes = 4L;
            tokenBuffer._first = _first;
            
            String actual = tokenBuffer.toString();
            
            String expected = "[TokenBuffer: END_ARRAY]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString5() throws Exception  {
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
            _first._tokenTypes = 2L;
            tokenBuffer._first = _first;
            
            String actual = tokenBuffer.toString();
            
            String expected = "[TokenBuffer: END_OBJECT]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        String actual = tokenBuffer.toString();
        
        String expected = "[TokenBuffer: ]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString7() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 0L;
            tokenBuffer._first = _first;
            
            String actual = tokenBuffer.toString();
            
            String expected = "[TokenBuffer: ]";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._hasNativeTypeIds = true;
        
        String actual = tokenBuffer.toString();
        
        String expected = "[TokenBuffer: ]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString9() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:439) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString10() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 4L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:439) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString11() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 2L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:439) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString12() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 3L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:439) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString13() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 5L;
            java.lang.Object[] _tokens = new java.lang.Object[9];
            _tokens[1] = ((Object) jsonToken10);
            _tokens[2] = ((Object) jsonToken10);
            _tokens[3] = ((Object) jsonToken10);
            _tokens[4] = ((Object) jsonToken10);
            _tokens[5] = ((Object) jsonToken10);
            _tokens[6] = ((Object) jsonToken10);
            _tokens[7] = ((Object) jsonToken10);
            _tokens[8] = ((Object) jsonToken10);
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1214)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:435) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testToString14() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 8L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.toString] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468)
                com.fasterxml.jackson.databind.util.TokenBuffer.toString(TokenBuffer.java:439) */
            tokenBuffer.toString();
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#append(com.fasterxml.jackson.databind.util.TokenBuffer)}
 * @utbot.executesCondition {@code (!_hasNativeTypeIds): False}
 * @utbot.executesCondition {@code (!_hasNativeObjectIds): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppend_Not_hasNativeObjectIds_1() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = -243L;
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
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testAppend2() throws Exception  {
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
    
    ///region OTHER: ERROR SUITE for method append(com.fasterxml.jackson.databind.util.TokenBuffer)
    
    @Test
    public void testAppend3() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
            setField(tokenBuffer1, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 5L;
            java.lang.Object[] _tokens = {};
            setField(_first, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
            tokenBuffer1._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1601)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1514)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1213)
                com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:265) */
            tokenBuffer.append(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testAppend4() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(tokenBuffer1, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            tokenBuffer1._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:985)
                com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:266) */
            tokenBuffer.append(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testAppend5() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
            setField(tokenBuffer1, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 4L;
            tokenBuffer1._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:581)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:904)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992)
                com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:266) */
            tokenBuffer.append(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testAppend6() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            tokenBuffer._hasNativeObjectIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 5L;
            tokenBuffer1._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1601)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1514)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.nextToken(TokenBuffer.java:1213)
                com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:265) */
            tokenBuffer.append(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testAppend7() throws Exception  {
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
            tokenBuffer._hasNativeTypeIds = true;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 8L;
            tokenBuffer1._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.append] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1601)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser._currentObject(TokenBuffer.java:1514)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getNumberValue(TokenBuffer.java:1403)
                com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getNumberType(TokenBuffer.java:1389)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:917)
                com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992)
                com.fasterxml.jackson.databind.util.TokenBuffer.append(TokenBuffer.java:266) */
            tokenBuffer.append(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.version
    
    ///region Errors report for version
    
    public void testVersion_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
 * @utbot.executesCondition {@code (_objectCodec == null): True}
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
        byte[][] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:799) */
        tokenBuffer.writeObject(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (_objectCodec == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, value);
 *  */
    @Test
    public void testWriteObject_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        short[][] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:799) */
        tokenBuffer.writeObject(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeObject(java.lang.Object)}
 * @utbot.executesCondition {@code (_objectCodec == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.ObjectCodec#writeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _objectCodec.writeValue(this, value);
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:792) */
        tokenBuffer.writeObject(byteArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeObject(java.lang.Object)
    
    @Test
    public void testWriteObject1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeObject(null);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject4() throws Exception  {
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
    public void testWriteObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
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
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject7() throws Exception  {
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
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject8() throws Exception  {
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
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object object = new Object();
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeObject(object);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeObject(null);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _tokens);
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
    public void testWriteObject13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16777216;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeObject(object);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeObject(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteObject15() throws Exception  {
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
    public void testWriteObject16() throws Exception  {
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
    public void testWriteObject17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectMapper _objectCodec = ((ObjectMapper) createInstance("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ObjectMapper.writeValue(ObjectMapper.java:1897)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:801) */
        tokenBuffer.writeObject(object);
    }
    
    @Test
    public void testWriteObject18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:799) */
        tokenBuffer.writeObject(object);
    }
    
    @Test
    public void testWriteObject19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:799) */
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
 *  */
    @Test
    public void testWriteString_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(serializedString);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
 *  */
    @Test
    public void testWriteString() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:650) */
        tokenBuffer.writeString(serializedString);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
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
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:650) */
        tokenBuffer.writeString(serializedString);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:650) */
        tokenBuffer.writeString(serializedString);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteString1() throws Exception  {
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
    public void testWriteString2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(((SerializableString) null));
        
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
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
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
    public void testWriteString8() throws Exception  {
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
    public void testWriteString9() throws Exception  {
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
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString10() throws Exception  {
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
        
        tokenBuffer.writeString(((SerializableString) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteString12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
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
    public void testWriteString13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeString(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteString14() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:650) */
        tokenBuffer.writeString(serializedString);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 *  */
    @Test
    public void testWriteString_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        String string = "";
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(string);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 *  */
    @Test
    public void testWriteString15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 *  */
    @Test
    public void testWriteString_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(112L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 *  */
    @Test
    public void testWriteString_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeString(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-143L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636) */
        tokenBuffer.writeString(string);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
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
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636) */
        tokenBuffer.writeString(string);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_STRING, text);
 *  */
    @Test
    public void testWriteString_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636) */
        tokenBuffer.writeString(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString(java.lang.String)
    
    @Test
    public void testWriteString16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(((String) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeString(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString18() throws Exception  {
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
        
        tokenBuffer.writeString(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString19() throws Exception  {
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
        
        tokenBuffer.writeString(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(((String) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString21() throws Exception  {
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
    public void testWriteString22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeString(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString23() throws Exception  {
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
    public void testWriteString24() throws Exception  {
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
    public void testWriteString25() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteString26() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteString27() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeString(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString28() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteString29() throws Exception  {
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
    public void testWriteString30() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636) */
        tokenBuffer.writeString(string);
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:642) */
        tokenBuffer.writeString(charArray, 1, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeString([C, int, int)
    
    @Test
    public void testWriteString31() throws Exception  {
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
    public void testWriteString32() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        char[] charArray = new char[37];
        
        tokenBuffer.writeString(charArray, 5, 2);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString33() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        char[] charArray = new char[34];
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeString(charArray, 32, 1);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString34() throws Exception  {
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
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[38];
        
        tokenBuffer.writeString(charArray, 3, 4);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString35() throws Exception  {
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
        char[] charArray = new char[33];
        
        tokenBuffer.writeString(charArray, 1, 28);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString36() throws Exception  {
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
        char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString37() throws Exception  {
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
        char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString38() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        char[] charArray = {};
        
        tokenBuffer.writeString(charArray, 0, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(7L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString39() throws Exception  {
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
        char[] charArray = {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'};
        
        tokenBuffer.writeString(charArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteString40() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[40];
        
        tokenBuffer.writeString(charArray, 3, 6);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(30064771072L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeString([C, int, int)
    
    @Test
    public void testWriteString41() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 12;
        char[] charArray = new char[37];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:642) */
        tokenBuffer.writeString(charArray, 7, 2);
    }
    
    @Test
    public void testWriteString42() throws Exception  {
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
        char[] charArray = new char[34];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:642) */
        tokenBuffer.writeString(charArray, 1, 27);
    }
    
    @Test
    public void testWriteString43() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        char[] charArray = new char[32];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:636)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeString(TokenBuffer.java:642) */
        tokenBuffer.writeString(charArray, 1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBoolean(boolean)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBoolean(boolean)}
 * @utbot.executesCondition {@code (state): False}
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBoolean(boolean)}
 * @utbot.executesCondition {@code (state): False}
 *  */
    @Test
    public void testWriteBoolean_NotState_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBoolean(boolean)}
 * @utbot.executesCondition {@code (state): True}
 *  */
    @Test
    public void testWriteBoolean_State() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
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
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(160L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBoolean(true);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean3() throws Exception  {
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
    public void testWriteBoolean4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(160L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean5() throws Exception  {
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
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
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
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
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
    public void testWriteBoolean9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
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
    public void testWriteBoolean10() throws Exception  {
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
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(false);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(11L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeBoolean(true);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBoolean(true);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteBoolean14() throws Exception  {
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
    
    ///region OTHER: ERROR SUITE for method writeBoolean(boolean)
    
    @Test
    public void testWriteBoolean15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class [B (java.lang.Integer and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean(TokenBuffer.java:769) */
        tokenBuffer.writeBoolean(false);
    }
    
    @Test
    public void testWriteBoolean16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean(TokenBuffer.java:769) */
        tokenBuffer.writeBoolean(false);
    }
    
    @Test
    public void testWriteBoolean17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean(TokenBuffer.java:769) */
        tokenBuffer.writeBoolean(false);
    }
    
    @Test
    public void testWriteBoolean18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBoolean(TokenBuffer.java:769) */
        tokenBuffer.writeBoolean(false);
    }
    ///endregion
    
    ///region Errors report for writeBoolean
    
    public void testWriteBoolean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
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
            com.fasterxml.jackson.databind.util.TokenBuffer.isEnabled(TokenBuffer.java:500) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.enable(TokenBuffer.java:486) */
        tokenBuffer.enable(null);
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
    public void testSerialize_BooleanHasIdsInitializedByCheckIdsAndSegmentHasIds() throws Exception  {
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
            
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#serialize(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testSerialize_BooleanHasIdsInitializedByCheckIdsAndSegmentHasIds_1() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 0L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#serialize(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testSerialize_BooleanHasIdsInitializedByCheckIdsAndSegmentHasIds_2() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 0L;
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
    
    ///region OTHER: ERROR SUITE for method serialize(com.fasterxml.jackson.core.JsonGenerator)
    
    @Test
    public void testSerialize1() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object root = createInstance("java.util.TreeMap$Entry");
            Object key = createInstance("java.lang.Object");
            setField(root, "java.util.TreeMap$Entry", "key", key);
            setField(_nativeIds, "java.util.TreeMap", "root", root);
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
                java.base/java.lang.Integer.compareTo(Integer.java:71)
                java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
                java.base/java.util.TreeMap.get(TreeMap.java:279)
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1768)
                com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:301) */
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testSerialize2() throws Exception  {
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
            _first._tokenTypes = 1L;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593)
                com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:314) */
            tokenBuffer.serialize(tokenBuffer);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testSerialize3() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:314) */
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testSerialize4() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object root = createInstance("java.util.TreeMap$Entry");
            Integer key = 1;
            setField(root, "java.util.TreeMap$Entry", "key", key);
            Object value = createInstance("java.lang.Object");
            setField(root, "java.util.TreeMap$Entry", "value", value);
            setField(_nativeIds, "java.util.TreeMap", "root", root);
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            TokenBuffer tokenBuffer1 = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
                com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593)
                com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:314) */
            tokenBuffer.serialize(tokenBuffer1);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    
    @Test
    public void testSerialize5() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 8L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.serialize] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.TokenBuffer$Segment.get(TokenBuffer.java:1601)
                com.fasterxml.jackson.databind.util.TokenBuffer.serialize(TokenBuffer.java:348) */
            tokenBuffer.serialize(tokenBuffer);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method serialize(com.fasterxml.jackson.core.JsonGenerator)
    
    @Test(timeout = 1000L)
    public void testSerialize6() throws Exception  {
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
            tokenBuffer._mayHaveNativeIds = true;
            TokenBuffer.Segment _first = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
            _first._tokenTypes = 1L;
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object root = createInstance("java.util.TreeMap$Entry");
            Integer key = 2;
            setField(root, "java.util.TreeMap$Entry", "key", key);
            setField(root, "java.util.TreeMap$Entry", "left", root);
            setField(_nativeIds, "java.util.TreeMap", "root", root);
            _first._nativeIds = _nativeIds;
            tokenBuffer._first = _first;
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            tokenBuffer.serialize(null);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
    }
    ///endregion
    
    ///region Errors report for serialize
    
    public void testSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
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
            com.fasterxml.jackson.databind.util.TokenBuffer.disable(TokenBuffer.java:492) */
        tokenBuffer.disable(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeTree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.executesCondition {@code (node == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteTree_NodeEqualsNull() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.executesCondition {@code (node == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteTree_NodeEqualsNull_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-243L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.executesCondition {@code (node == null): False}
 * @utbot.executesCondition {@code (_objectCodec == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void testWriteTree__objectCodecEqualsNull() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        NullNode nullNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class nullNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", nullNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = nullNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.executesCondition {@code (node == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testWriteTree_NodeEqualsNull_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeTree(null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.executesCondition {@code (node == null): False}
 * @utbot.executesCondition {@code (_objectCodec == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.ObjectCodec#writeTree(com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _objectCodec.writeTree(this, node);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTree_ThrowUnsupportedOperationException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ObjectReader _objectCodec = ((ObjectReader) createInstance("com.fasterxml.jackson.databind.ObjectReader"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectCodec", _objectCodec);
        IntNode intNode = new IntNode(0);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class intNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", intNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = intNode;
        try {
            writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        IntNode intNode = new IntNode(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:815) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class intNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", intNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = intNode;
        try {
            writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        IntNode intNode = new IntNode(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:815) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class intNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", intNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = intNode;
        try {
            writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        IntNode intNode = new IntNode(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:815) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class intNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", intNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = intNode;
        try {
            writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeTree(com.fasterxml.jackson.core.TreeNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_EMBEDDED_OBJECT, node);
 *  */
    @Test
    public void testWriteTree_ThrowNullPointerException_1() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        IntNode intNode = new IntNode(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeTree] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeTree(TokenBuffer.java:815) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class intNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", intNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = intNode;
        try {
            writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeTree(com.fasterxml.jackson.core.TreeNode)
    
    @Test
    public void testWriteTree1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        FloatNode floatNode = new FloatNode(0.0f);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class floatNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", floatNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = floatNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteTree2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        FloatNode floatNode = new FloatNode(0.0f);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class floatNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", floatNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = floatNode;
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
        tokenBuffer._hasNativeId = true;
        NullNode nullNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class nullNodeType = Class.forName("com.fasterxml.jackson.core.TreeNode");
        Method writeTreeMethod = tokenBufferClazz.getDeclaredMethod("writeTree", nullNodeType);
        writeTreeMethod.setAccessible(true);
        java.lang.Object[] writeTreeMethodArguments = new java.lang.Object[1];
        writeTreeMethodArguments[0] = nullNode;
        writeTreeMethod.invoke(tokenBuffer, writeTreeMethodArguments);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(25769803776L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
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
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        JsonParserDelegate jsonParserDelegate4 = new JsonParserDelegate(jsonParserDelegate3);
        JsonParserDelegate jsonParserDelegate5 = new JsonParserDelegate(jsonParserDelegate4);
        JsonParserDelegate jsonParserDelegate6 = new JsonParserDelegate(jsonParserDelegate5);
        JsonParserDelegate jsonParserDelegate7 = new JsonParserDelegate(jsonParserDelegate6);
        JsonParserDelegate jsonParserDelegate8 = new JsonParserDelegate(jsonParserDelegate7);
        
        TokenBuffer.Parser actual = ((TokenBuffer.Parser) tokenBuffer.asParser(jsonParserDelegate8));
        
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
    
    @Test
    public void testAsParser3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.asParser] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:353)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221) */
        tokenBuffer.asParser(readerBasedJsonParser);
    }
    
    @Test
    public void testAsParser4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate4 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        ReaderBasedJsonParser delegate9 = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.asParser] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getTokenLocation(ParserBase.java:353)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTokenLocation(JsonParserDelegate.java:182)
            com.fasterxml.jackson.databind.util.TokenBuffer.asParser(TokenBuffer.java:221) */
        tokenBuffer.asParser(jsonParserSequence);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.deserialize
    
    ///region OTHER: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void testDeserialize1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        tokenBuffer.deserialize(jsonParserSequence, null);
    }
    
    @Test
    public void testDeserialize2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1499)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:973)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(parser, impl);
    }
    
    @Test
    public void testDeserialize5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:976)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(readerBasedJsonParser, null);
    }
    
    @Test
    public void testDeserialize6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:774)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:947)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:976)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentName(ParserBase.java:311)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize10() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(parser, impl);
    }
    
    @Test
    public void testDeserialize12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, null);
    }
    
    @Test
    public void testDeserialize13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootValue");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize16() throws Exception  {
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, null);
    }
    
    @Test
    public void testDeserialize17() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize18() throws Exception  {
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
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
    }
    
    @Test
    public void testDeserialize21() throws Exception  {
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
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(treeTraversingParser, impl);
    }
    
    @Test
    public void testDeserialize22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, impl);
    }
    
    @Test
    public void testDeserialize23() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967)
            com.fasterxml.jackson.databind.util.TokenBuffer.deserialize(TokenBuffer.java:405) */
        tokenBuffer.deserialize(jsonParserDelegate, null);
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
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class sun.security.x509.AVA (java.lang.Integer and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1768)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468) */
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
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1768)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468) */
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
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -254;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$NameComparator.compare(ProcessEnvironment.java:195)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findObjectId(TokenBuffer.java:1768)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer._appendNativeIds(TokenBuffer.java:468) */
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
            _first._tokenTypes = -243L;
            tokenBuffer._first = _first;
            
            JsonToken actual = tokenBuffer.firstToken();
            
            assertNull(actual);
        } finally {
            setStaticField(TokenBuffer.Segment.class, "TOKEN_TYPES_BY_INDEX", prevTOKEN_TYPES_BY_INDEX);
        }
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCopyCurrentEvent_ThrowClassCastException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Integer ([B and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1775)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1499)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:891) */
        tokenBuffer.copyCurrentEvent(parser);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _checkNativeIds(jp);
 *  */
    @Test
    public void testCopyCurrentEvent_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:891) */
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
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:893) */
        tokenBuffer.copyCurrentEvent(jsonParserDelegate);
    }
    
    @Test
    public void testCopyCurrentEvent2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:893) */
        tokenBuffer.copyCurrentEvent(parser);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method copyCurrentEvent(com.fasterxml.jackson.core.JsonParser)
    
    @Test(timeout = 1000L)
    public void testCopyCurrentEvent3() throws Exception  {
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
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        tokenBuffer.copyCurrentEvent(jsonParserDelegate);
    }
    ///endregion
    
    ///region Errors report for copyCurrentEvent
    
    public void testCopyCurrentEvent_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 *  */
    @Test
    public void testWriteBinary() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        byte[] byteArray = {};
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(-249L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 *  */
    @Test
    public void testWriteBinary_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        byte[] byteArray = {};
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 *  */
    @Test
    public void testWriteBinary_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        byte[] byteArray = {};
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 *  */
    @Test
    public void testWriteBinary_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        byte[] byteArray = {};
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data, offset, copy, 0, len);
 *  */
    @Test
    public void testWriteBinary_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:838) */
        tokenBuffer.writeBinary(null, byteArray, 0, 1);
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:837) */
        tokenBuffer.writeBinary(null, null, -255, -256);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: writeObject(copy);
 *  */
    @Test
    public void testWriteBinary_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:792)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:839) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:838) */
        tokenBuffer.writeBinary(null, null, -255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeObject(copy);
 *  */
    @Test
    public void testWriteBinary_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:792)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:839) */
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeBinary(com.fasterxml.jackson.core.Base64Variant,byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeObject(copy);
 *  */
    @Test
    public void testWriteBinary_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:792)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:839) */
        tokenBuffer.writeBinary(null, byteArray, 0, 0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    @Test
    public void testWriteBinary1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 3, 0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
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
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 1, 0);
        
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
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _tokens);
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(6L, finalTokenBuffer_last_tokenTypes);
        
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
        byte[] byteArray = new byte[34];
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 1, 18);
        
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
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _tokens);
        tokenBuffer._hasNativeId = true;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[32];
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeBinary(base64Variant, byteArray, 1, 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeBinary(com.fasterxml.jackson.core.Base64Variant, [B, int, int)
    
    @Test
    public void testWriteBinary6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        byte[] byteArray = new byte[34];
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeObject(TokenBuffer.java:792)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeBinary(TokenBuffer.java:839) */
        tokenBuffer.writeBinary(base64Variant, byteArray, 3, 0);
    }
    ///endregion
    
    ///region Errors report for writeBinary
    
    public void testWriteBinary_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
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
    public void testWriteRawValue_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawValue(((String) null), -255, -255);
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRawValue([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRawValue(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRawValue_ThrowUnsupportedOperationException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRawValue(((char[]) null), -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(float)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 *  */
    @Test
    public void testWriteNumber_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(-0.0f);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 *  */
    @Test
    public void testWriteNumber() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(1.4E-45f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 *  */
    @Test
    public void testWriteNumber_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(1.4E-45f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 *  */
    @Test
    public void testWriteNumber_4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(1.4E-45f);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 *  */
    @Test
    public void testWriteNumber_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(float)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:738) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        byte[] _typeId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:738) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:738) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(float)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:738) */
        tokenBuffer.writeNumber(1.4E-45f);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(float)
    
    @Test
    public void testWriteNumber1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(-0.0f);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
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
    public void testWriteNumber5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
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
    public void testWriteNumber8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-0.0f);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(float)
    
    @Test
    public void testWriteNumber9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class [B (java.lang.Integer and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1727)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:738) */
        tokenBuffer.writeNumber(-0.0f);
    }
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(short)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 *  */
    @Test
    public void testWriteNumber_31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber((short) -255);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 *  */
    @Test
    public void testWriteNumber10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber((short) -255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 *  */
    @Test
    public void testWriteNumber_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber((short) -255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 *  */
    @Test
    public void testWriteNumber_21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) -255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(short)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:718) */
        tokenBuffer.writeNumber((short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:718) */
        tokenBuffer.writeNumber((short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:718) */
        tokenBuffer.writeNumber((short) -255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(short)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:718) */
        tokenBuffer.writeNumber((short) -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(short)
    
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
    public void testWriteNumber12() throws Exception  {
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
    public void testWriteNumber13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber((short) 0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber((short) 0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
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
    public void testWriteNumber16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber18() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber19() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber((short) 0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(-255);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(-255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_41() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(-255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(-255);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-247L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 *  */
    @Test
    public void testWriteNumber_32() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-255);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-247L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:723) */
        tokenBuffer.writeNumber(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:723) */
        tokenBuffer.writeNumber(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:723) */
        tokenBuffer.writeNumber(-255);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:723) */
        tokenBuffer.writeNumber(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(int)
    
    @Test
    public void testWriteNumber21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(0);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber23() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber24() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber25() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors2()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(double)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 *  */
    @Test
    public void testWriteNumber_33() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 *  */
    @Test
    public void testWriteNumber26() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 *  */
    @Test
    public void testWriteNumber_13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 *  */
    @Test
    public void testWriteNumber_23() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(double)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:733) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        short[] _typeId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:733) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:733) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        byte[] _typeId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:733) */
        tokenBuffer.writeNumber(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(double)
    
    @Test
    public void testWriteNumber27() throws Exception  {
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
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber28() throws Exception  {
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
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber29() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber30() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
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
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber32() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber33() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber34() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber35() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(java.lang.Double.NaN);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors3()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(long)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 *  */
    @Test
    public void testWriteNumber_34() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(-255L);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 *  */
    @Test
    public void testWriteNumber36() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(-255L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 *  */
    @Test
    public void testWriteNumber_14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(-255L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 *  */
    @Test
    public void testWriteNumber_24() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(-255L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(long)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:728) */
        tokenBuffer.writeNumber(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        int[] _typeId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        short[] _objectId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_objectId", _objectId);
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:728) */
        tokenBuffer.writeNumber(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:728) */
        tokenBuffer.writeNumber(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:728) */
        tokenBuffer.writeNumber(-255L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(long)
    
    @Test
    public void testWriteNumber37() throws Exception  {
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
    public void testWriteNumber38() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(0L);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber39() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(0L);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber40() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber41() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber42() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber43() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
    public void testWriteNumber44() throws Exception  {
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
    public void testWriteNumber45() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(0L);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(long)
    
    @Test
    public void testWriteNumber46() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException] */
        tokenBuffer.writeNumber(0L);
    }
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors4()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 *  */
    @Test
    public void testWriteNumber47() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 *  */
    @Test
    public void testWriteNumber_15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 *  */
    @Test
    public void testWriteNumber_25() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, encodedValue);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(java.lang.String)
    
    @Test
    public void testWriteNumber48() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        String string = "";
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(string);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber49() throws Exception  {
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
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber50() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(((String) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber51() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber52() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        tokenBuffer.writeNumber(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber53() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber54() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(string);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber55() throws Exception  {
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
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber56() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber57() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeNumber(java.lang.String)
    
    @Test
    public void testWriteNumber58() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        RuleBasedCollator comparator = ((RuleBasedCollator) createInstance("java.text.RuleBasedCollator"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.text.Collator.compare(Collator.java:305)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1727)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(((String) null));
    }
    
    @Test
    public void testWriteNumber59() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class [B (java.lang.Integer and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
            java.base/java.util.TreeMap.put(TreeMap.java:785)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1727)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(string);
    }
    
    @Test
    public void testWriteNumber60() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class [B (java.lang.Integer and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1727)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(string);
    }
    
    @Test
    public void testWriteNumber61() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1727)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:764) */
        tokenBuffer.writeNumber(string);
    }
    
    @Test
    public void testWriteNumber62() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException] */
        tokenBuffer.writeNumber(string);
    }
    
    @Test
    public void testWriteNumber63() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException] */
        tokenBuffer.writeNumber(string);
    }
    ///endregion
    
    ///region Errors report for writeNumber
    
    public void testWriteNumber_errors5()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 *  */
    @Test
    public void testWriteNumber_16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(bigInteger);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 *  */
    @Test
    public void testWriteNumber64() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 *  */
    @Test
    public void testWriteNumber_26() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.math.BigInteger)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, v);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:755) */
        tokenBuffer.writeNumber(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_INT, v);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:755) */
        tokenBuffer.writeNumber(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, v);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:755) */
        tokenBuffer.writeNumber(bigInteger);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigInteger)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_INT, v);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:755) */
        tokenBuffer.writeNumber(bigInteger);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(java.math.BigInteger)
    
    @Test
    public void testWriteNumber65() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber66() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber67() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber68() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(128L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber69() throws Exception  {
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
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber70() throws Exception  {
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
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber71() throws Exception  {
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
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber72() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber73() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(34359738368L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber74() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigInteger);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(8L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber75() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(bigInteger);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber76() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber77() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((BigInteger) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeNumber(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 *  */
    @Test
    public void testWriteNumber_17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(bigDecimal);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 *  */
    @Test
    public void testWriteNumber78() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 *  */
    @Test
    public void testWriteNumber_27() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens1 = tokenBuffer._last._tokens[1];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens1 == finalTokenBuffer_last_tokens1);
        
        assertEquals(144L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeNumber(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, dec);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:746) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, dec);
 *  */
    @Test
    public void testWriteNumber_ThrowArrayIndexOutOfBoundsException7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:746) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, dec);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException_17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:746) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeNumber(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.VALUE_NUMBER_FLOAT, dec);
 *  */
    @Test
    public void testWriteNumber_ThrowNullPointerException7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNumber(TokenBuffer.java:746) */
        tokenBuffer.writeNumber(bigDecimal);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeNumber(java.math.BigDecimal)
    
    @Test
    public void testWriteNumber79() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber80() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber81() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber82() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber83() throws Exception  {
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
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber84() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber85() throws Exception  {
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
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber86() throws Exception  {
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
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber87() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber88() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(38654705664L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber89() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeNumber(bigDecimal);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(9L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber90() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNumber(((BigDecimal) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNumber91() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        BigDecimal bigDecimal = new BigDecimal(0);
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNumber(bigDecimal);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 *  */
    @Test
    public void testWriteEndObject_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndObject_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
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
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class sun.security.x509.AVA (java.lang.Integer and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
            java.base/java.util.TreeMap.put(TreeMap.java:785)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:601) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._objectId = key;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.ClassCastException] */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class sun.security.x509.AVA (java.lang.Integer and sun.security.x509.AVA are in module java.base of loader 'bootstrap')]
            java.base/sun.security.x509.AVAComparator.compare(RDN.java:458)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
            java.base/java.util.TreeMap.put(TreeMap.java:785)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:601) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException] */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject11() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException] */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject14() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject(TokenBuffer.java:603) */
        tokenBuffer.writeEndObject();
    }
    
    @Test
    public void testWriteEndObject15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndObject] produces [java.lang.NullPointerException] */
        tokenBuffer.writeEndObject();
    }
    ///endregion
    
    ///region Errors report for writeEndObject
    
    public void testWriteEndObject_errors()
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)}
 *  */
    @Test
    public void test_checkNativeIds_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)}
 *  */
    @Test
    public void test_checkNativeIds_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate1 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        delegate1._segment = _segment;
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserSequenceType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserSequenceType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserSequence;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        
        Object finalTokenBuffer_typeId = tokenBuffer._typeId;
        
        assertNull(finalTokenBuffer_typeId);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_checkNativeIds(com.fasterxml.jackson.core.JsonParser)}
 *  */
    @Test
    public void test_checkNativeIds() throws Exception  {
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
    ///endregion
    
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1775)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1499)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999) */
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
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.provider.certpath.PKIX$CertStoreComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        parser._segmentPtr = Integer.MAX_VALUE;
        
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
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate2 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        delegate2._segment = _segment;
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserSequenceType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserSequenceType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserSequence;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TokenBuffer.Parser delegate = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        _segment._nativeIds = _nativeIds;
        delegate._segment = _segment;
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserSequenceType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserSequenceType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserSequence;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    
    @Test
    public void test_checkNativeIds4() throws Exception  {
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
    public void test_checkNativeIds5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate3 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _segment._nativeIds = _nativeIds;
        delegate3._segment = _segment;
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
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
    public void test_checkNativeIds6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object value = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        
        Object initialTokenBuffer_typeId = tokenBuffer._typeId;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", parserType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = parser;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        
        Object finalTokenBuffer_typeId = tokenBuffer._typeId;
        boolean finalTokenBuffer_hasNativeId = tokenBuffer._hasNativeId;
        
        assertFalse(initialTokenBuffer_typeId == finalTokenBuffer_typeId);
        
        assertTrue(finalTokenBuffer_hasNativeId);
    }
    
    @Test
    public void test_checkNativeIds7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
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
    
    @Test
    public void test_checkNativeIds8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object value = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        
        Object initialTokenBuffer_typeId = tokenBuffer._typeId;
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegateType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegateType);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        
        Object finalTokenBuffer_typeId = tokenBuffer._typeId;
        boolean finalTokenBuffer_hasNativeId = tokenBuffer._hasNativeId;
        
        assertFalse(initialTokenBuffer_typeId == finalTokenBuffer_typeId);
        
        assertTrue(finalTokenBuffer_hasNativeId);
    }
    
    @Test
    public void test_checkNativeIds9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        JsonParserDelegate jsonParserDelegate3 = new JsonParserDelegate(jsonParserDelegate2);
        
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegate3Type = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegate3Type);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate3;
        _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = StackOverflowError.class)
    public void test_checkNativeIds10() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
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
    
    @Test
    public void test_checkNativeIds11() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        parser._segment = _segment;
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(parser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds] produces [java.lang.ClassCastException] */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegate2Type = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegate2Type);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate2;
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_checkNativeIds12() throws Throwable  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TokenBuffer.Parser delegate2 = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _segment._nativeIds = _nativeIds;
        delegate2._segment = _segment;
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class [B (java.lang.Integer and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.getEntryUsingComparator(TreeMap.java:374)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:344)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1775)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1499)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.util.TokenBuffer._checkNativeIds(TokenBuffer.java:999) */
        Class tokenBufferClazz = Class.forName("com.fasterxml.jackson.databind.util.TokenBuffer");
        Class jsonParserDelegate1Type = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Method _checkNativeIdsMethod = tokenBufferClazz.getDeclaredMethod("_checkNativeIds", jsonParserDelegate1Type);
        _checkNativeIdsMethod.setAccessible(true);
        java.lang.Object[] _checkNativeIdsMethodArguments = new java.lang.Object[1];
        _checkNativeIdsMethodArguments[0] = jsonParserDelegate1;
        try {
            _checkNativeIdsMethod.invoke(tokenBuffer, _checkNativeIdsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method _checkNativeIds(com.fasterxml.jackson.core.JsonParser)
    
    @Test(timeout = 1000L)
    public void test_checkNativeIds13() throws Throwable  {
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
        // 10 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _appendRaw(int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 *  */
    @Test
    public void test_appendRaw_Not_hasNativeId_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._appendRaw(-255, null);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
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
 * @utbot.executesCondition {@code (next == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#appendRaw(int,int,java.lang.Object,java.lang.Object,java.lang.Object)}
 *  */
    @Test
    public void test_appendRaw__hasNativeId() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._appendRaw(-255, null);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _appendRaw(int, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_hasNativeId): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#appendRaw(int,int,java.lang.Object,java.lang.Object,java.lang.Object)} twice
    /// execute conditions:
    ///     {@code (next == null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 *  */
    @Test
    public void test_appendRaw() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 *  */
    @Test
    public void test_appendRaw_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer._appendRaw(-255, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-4080L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 *  */
    @Test
    public void test_appendRaw_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1732)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1665)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1043) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1742)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1677)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1042) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1043) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.appendRaw(_appendAt, rawType, value)
 *  */
    @Test
    public void test_appendRaw_ThrowNullPointerException_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1732)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1665)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1043) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1042) */
        tokenBuffer._appendRaw(-255, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_appendRaw(int,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.appendRaw(_appendAt, rawType, value, _objectId, _typeId)
 *  */
    @Test
    public void test_appendRaw_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1742)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.appendRaw(TokenBuffer.java:1677)
            com.fasterxml.jackson.databind.util.TokenBuffer._appendRaw(TokenBuffer.java:1042) */
        tokenBuffer._appendRaw(-255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _appendRaw(int, java.lang.Object)
    
    @Test
    public void test_appendRaw1() throws Exception  {
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
    ///endregion
    
    ///region Errors report for _appendRaw
    
    public void test_appendRaw_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _append(com.fasterxml.jackson.core.JsonToken)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_hasNativeId): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-2147483646, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer._append(jsonToken);
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _append(com.fasterxml.jackson.core.JsonToken)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_hasNativeId): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object,java.lang.Object)} twice
    /// execute conditions:
    ///     {@code (next == null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_append_5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1690)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1619)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1690)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1623)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type)
 *  */
    @Test
    public void test_append_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1700)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1700)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1635)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016) */
        tokenBuffer._append(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016) */
        tokenBuffer._append(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _append(com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_append1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
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
    public void test_append3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
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
    public void test_append4() throws Exception  {
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
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        tokenBuffer._append(jsonToken);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(32L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void test_append5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
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
    public void test_append6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        tokenBuffer._append(jsonToken);
        
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken)
    
    @Test
    public void test_append7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("jdk.internal.jimage.ImageBufferCache$2"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.util.Map$Entry (java.lang.Integer and java.util.Map$Entry are in module java.base of loader 'bootstrap')]
            java.base/jdk.internal.jimage.ImageBufferCache$2.compare(ImageBufferCache.java:151)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016) */
        tokenBuffer._append(jsonToken);
    }
    
    @Test
    public void test_append8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException] */
        tokenBuffer._append(jsonToken);
    }
    
    @Test
    public void test_append9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException] */
        tokenBuffer._append(jsonToken);
    }
    ///endregion
    
    ///region Errors report for _append
    
    public void test_append_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer._append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_hasNativeId): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void test_append10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        
        tokenBuffer._append(jsonToken, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(-243L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void test_append_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        
        tokenBuffer._append(jsonToken, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_hasNativeId): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.util.TokenBuffer.Segment#append(int,com.fasterxml.jackson.core.JsonToken,java.lang.Object,java.lang.Object,java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void test_append_21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        
        tokenBuffer._append(jsonToken, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(16L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void test_append_31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.VALUE_TRUE;
        
        tokenBuffer._append(jsonToken, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(10L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 *  */
    @Test
    public void test_append_41() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        JsonToken jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        
        tokenBuffer._append(jsonToken, null);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(96L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _append(com.fasterxml.jackson.core.JsonToken, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1711)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1646)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_51() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1711)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_41() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        int[] _typeId = {};
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1722)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1722)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1658)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._appendAt = -255;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029) */
        tokenBuffer._append(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.executesCondition {@code (_hasNativeId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _last.append(_appendAt, type, value, _objectId, _typeId)
 *  */
    @Test
    public void test_append_ThrowNullPointerException_21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer._append] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029) */
        tokenBuffer._append(null, null);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeStartArray()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 *  */
    @Test
    public void testWriteStartArray() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeStartArray();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext1 = tokenBuffer._writeContext;
        int finalTokenBuffer_writeContext_index = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-253L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 *  */
    @Test
    public void testWriteStartArray_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 *  */
    @Test
    public void testWriteStartArray_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
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
        
        assertEquals(-253L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertEquals(1, finalTokenBuffer_writeContext_type);
        
        assertEquals(-1, finalTokenBuffer_writeContext_index);
    }
    ///endregion
    
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:574) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:574) */
        tokenBuffer.writeStartArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildArrayContext();
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 16;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:574) */
        tokenBuffer.writeStartArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildArrayContext();
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:574) */
        tokenBuffer.writeStartArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext = _writeContext.createChildArrayContext();
 *  */
    @Test
    public void testWriteStartArray_ThrowNullPointerException_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartArray(TokenBuffer.java:574) */
        tokenBuffer.writeStartArray();
    }
    ///endregion
    
    ///region Errors report for writeStartArray
    
    public void testWriteStartArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.SerializableString#getValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 *  */
    @Test
    public void testWriteFieldName_JsonWriteContextWriteFieldName() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        tokenBuffer._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _currentName);
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeFieldName(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(-251L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:621) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:621) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.writeFieldName(name.getValue());
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.writeFieldName(name.getValue());
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.SerializableString#getValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.writeFieldName(name.getValue());
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(com.fasterxml.jackson.core.SerializableString)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:621) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteFieldName1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        tokenBuffer._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeFieldName(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(5L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
    }
    
    @Test
    public void testWriteFieldName2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        tokenBuffer._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        
        tokenBuffer.writeFieldName(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens0 = tokenBuffer._last._tokens[0];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertFalse(initialTokenBuffer_last_tokens0 == finalTokenBuffer_last_tokens0);
        
        assertEquals(5L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
    }
    
    @Test
    public void testWriteFieldName3() throws Exception  {
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
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        Object initialTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        
        tokenBuffer.writeFieldName(serializedString);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        Object finalTokenBuffer_last_tokens8 = tokenBuffer._last._tokens[8];
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last_tokens8 == finalTokenBuffer_last_tokens8);
        
        assertEquals(21474836480L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(9, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    @Test
    public void testWriteFieldName4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 1]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:621) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
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
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(serializedString);
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
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
        tokenBuffer._appendAt = 8;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    
    @Test
    public void testWriteFieldName11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._hasNativeId = true;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(serializedString);
    }
    
    @Test
    public void testWriteFieldName12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:622) */
        tokenBuffer.writeFieldName(((SerializableString) null));
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method writeFieldName(com.fasterxml.jackson.core.SerializableString)
    
    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName13() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        setField(_dups, "com.fasterxml.jackson.core.json.DupDetector", "_firstName", _firstName);
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        tokenBuffer._writeContext = _writeContext;
        SerializedString serializedString = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(serializedString, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        
        tokenBuffer.writeFieldName(serializedString);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFieldName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 *  */
    @Test
    public void testWriteFieldName_JsonWriteContextWriteFieldName1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        tokenBuffer._writeContext = _writeContext;
        
        tokenBuffer.writeFieldName(((String) null));
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertEquals(-251L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeFieldName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 2]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.writeFieldName(name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        java.lang.Object[] _tokens = {null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _writeContext.writeFieldName(name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _append(JsonToken.FIELD_NAME, name);
 *  */
    @Test
    public void testWriteFieldName_ThrowNullPointerException_31() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613) */
        tokenBuffer.writeFieldName(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeFieldName(java.lang.String)
    
    @Test
    public void testWriteFieldName14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
        tokenBuffer._writeContext = _writeContext;
        String string = "";
        
        tokenBuffer.writeFieldName(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertEquals(5L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
    }
    
    @Test
    public void testWriteFieldName15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        String string = "";
        
        tokenBuffer.writeFieldName(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        JsonWriteContext jsonWriteContext = tokenBuffer._writeContext;
        boolean finalTokenBuffer_writeContext_gotName = ((Boolean) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName"));
        
        assertEquals(5L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
        
        assertTrue(finalTokenBuffer_writeContext_gotName);
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
        tokenBuffer._hasNativeId = true;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        tokenBuffer._writeContext = _writeContext;
        String string = "";
        
        tokenBuffer.writeFieldName(string);
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(5L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeFieldName(java.lang.String)
    
    @Test
    public void testWriteFieldName17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(string);
    }
    
    @Test
    public void testWriteFieldName18() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName19() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName20() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName21() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(((String) null));
    }
    
    @Test
    public void testWriteFieldName22() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614) */
        tokenBuffer.writeFieldName(string);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeStartObject()
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 *  */
    @Test
    public void testWriteStartObject() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 *  */
    @Test
    public void testWriteStartObject_1() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeStartObject()}
 *  */
    @Test
    public void testWriteStartObject_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = -255L;
        tokenBuffer._last = _last;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
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
        tokenBuffer._appendAt = 1;
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_dups", _dups);
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
    public void testWriteStartObject3() throws Exception  {
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
    public void testWriteStartObject4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method writeStartObject()
    
    @Test
    public void testWriteStartObject5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String$CaseInsensitiveComparator.compare(String.java:2047)
            java.base/java.util.TreeMap.put(TreeMap.java:795)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _last;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
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
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
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
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject12() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject13() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject16() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1760)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject17() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:593) */
        tokenBuffer.writeStartObject();
    }
    
    @Test
    public void testWriteStartObject18() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:594) */
        tokenBuffer.writeStartObject();
    }
    ///endregion
    
    ///region Errors report for writeStartObject
    
    public void testWriteStartObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
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
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 *  */
    @Test
    public void testWriteEndArray_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeEndArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonWriteContext c = _writeContext.getParent();
 *  */
    @Test
    public void testWriteEndArray_ThrowNullPointerException_2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray7() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = -2147483647;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
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
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    
    @Test
    public void testWriteEndArray11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._objectId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeEndArray(TokenBuffer.java:583) */
        tokenBuffer.writeEndArray();
    }
    ///endregion
    
    ///region Errors report for writeEndArray
    
    public void testWriteEndArray_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Failed requirement.
        
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
    public void testWriteRaw_ThrowUnsupportedOperationException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((String) null));
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method writeRaw([C, int, int)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeRaw(char[],int,int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#_reportUnsupportedOperation()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: _reportUnsupportedOperation();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWriteRaw_ThrowUnsupportedOperationException2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((char[]) null), -255, -255);
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
    public void testWriteRaw_ThrowUnsupportedOperationException3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(((String) null), -255, -255);
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
    public void testWriteRaw_ThrowUnsupportedOperationException4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        tokenBuffer.writeRaw(' ');
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
        tokenBuffer._appendAt = 1;
        tokenBuffer._hasNativeId = true;
        
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
    public void testWriteNull_3() throws Exception  {
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
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        tokenBuffer.writeNull();
        
        long finalTokenBuffer_last_tokenTypes = tokenBuffer._last._tokenTypes;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull3() throws Exception  {
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
    public void testWriteNull4() throws Exception  {
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
    public void testWriteNull5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        Object _typeId = createInstance("java.lang.Object");
        tokenBuffer._typeId = _typeId;
        tokenBuffer._hasNativeId = true;
        
        TokenBuffer.Segment initialTokenBuffer_last = tokenBuffer._last;
        
        tokenBuffer.writeNull();
        
        TokenBuffer.Segment finalTokenBuffer_last = tokenBuffer._last;
        int finalTokenBuffer_appendAt = tokenBuffer._appendAt;
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendAt);
    }
    
    @Test
    public void testWriteNull6() throws Exception  {
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
    public void testWriteNull7() throws Exception  {
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
    public void testWriteNull8() throws Exception  {
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
    
    ///region OTHER: ERROR SUITE for method writeNull()
    
    @Test
    public void testWriteNull10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNull] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:774) */
        tokenBuffer.writeNull();
    }
    
    @Test
    public void testWriteNull11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        Object _objectId = createInstance("java.lang.Object");
        tokenBuffer._objectId = _objectId;
        tokenBuffer._hasNativeId = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.writeNull] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.put(TreeMap.java:814)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.assignNativeIds(TokenBuffer.java:1757)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1705)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1631)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1016)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:774) */
        tokenBuffer.writeNull();
    }
    ///endregion
    
    ///region Errors report for writeNull
    
    public void testWriteNull_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void testCopyCurrentStructure_ThrowNullPointerException() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:960) */
        tokenBuffer.copyCurrentStructure(null);
    }
    
    /**
    @utbot.classUnderTest {@link TokenBuffer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.TokenBuffer#copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)}
 * @utbot.executesCondition {@code (t == JsonToken.FIELD_NAME): True}
 * @utbot.executesCondition {@code (_mayHaveNativeIds): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.TokenBuffer#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: writeFieldName(jp.getCurrentName());
 *  */
    @Test
    public void testCopyCurrentStructure_ThrowNullPointerException_1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 15;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method copyCurrentStructure(com.fasterxml.jackson.core.JsonParser)
    
    @Test(expected = StackOverflowError.class)
    public void testCopyCurrentStructure1() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", jsonParserSequence);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        tokenBuffer.copyCurrentStructure(jsonParserDelegate);
    }
    
    @Test
    public void testCopyCurrentStructure2() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 10;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1710)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1642)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1030)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure3() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = Integer.MIN_VALUE;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 9]
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure4() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure5() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:976) */
        tokenBuffer.copyCurrentStructure(uTF8StreamJsonParser);
    }
    
    @Test
    public void testCopyCurrentStructure6() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure7() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:774)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:947)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure8() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure9() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure10() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1253)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure11() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        tokenBuffer._mayHaveNativeIds = true;
        TokenBuffer.Parser parser = ((TokenBuffer.Parser) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser"));
        TokenBuffer.Segment _segment = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        parser._segment = _segment;
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1017)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeNull(TokenBuffer.java:774)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentEvent(TokenBuffer.java:947)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:992) */
        tokenBuffer.copyCurrentStructure(parser);
    }
    
    @Test
    public void testCopyCurrentStructure12() throws Exception  {
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
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure13() throws Exception  {
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
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.set(TokenBuffer.java:1721)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.append(TokenBuffer.java:1654)
            com.fasterxml.jackson.databind.util.TokenBuffer._append(TokenBuffer.java:1029)
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:613)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure14() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._tokenTypes = 0L;
        java.lang.Object[] _tokens = {null, null, null, null, null, null, null, null, null};
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokens", _tokens);
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        _last._nativeIds = _nativeIds;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 8;
        JsonToken _typeId = JsonToken.END_ARRAY;
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_typeId", _typeId);
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
    }
    
    @Test
    public void testCopyCurrentStructure15() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        TokenBuffer.Segment _last = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        TokenBuffer.Segment _next = ((TokenBuffer.Segment) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment"));
        _last._next = _next;
        tokenBuffer._last = _last;
        tokenBuffer._appendAt = 1073741824;
        tokenBuffer._hasNativeId = true;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeFieldName(TokenBuffer.java:614)
            com.fasterxml.jackson.databind.util.TokenBuffer.copyCurrentStructure(TokenBuffer.java:967) */
        tokenBuffer.copyCurrentStructure(treeTraversingParser);
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
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1063909309828999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063909309828999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063909309835600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063909309828999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063909309835600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1063909310428000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063909310428000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063909310429600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063909310428000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063909310429600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1063909310829900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1063909310829900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1063909310831100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063909310829900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063909310831100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1063909311197700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1063909311197700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1063909311199200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1063909311197700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1063909311199200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

