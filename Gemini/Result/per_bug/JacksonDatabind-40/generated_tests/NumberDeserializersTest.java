package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumberDeserializersTest {

    private final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    public void testFindPrimitiveTypes() {
        assertNotNull(NumberDeserializers.find(int.class, "int"));
        assertNotNull(NumberDeserializers.find(boolean.class, "boolean"));
        assertNotNull(NumberDeserializers.find(long.class, "long"));
        assertNotNull(NumberDeserializers.find(double.class, "double"));
        assertNotNull(NumberDeserializers.find(char.class, "char"));
        assertNotNull(NumberDeserializers.find(byte.class, "byte"));
        assertNotNull(NumberDeserializers.find(short.class, "short"));
        assertNotNull(NumberDeserializers.find(float.class, "float"));
    }

    @Test
    public void testFindWrapperAndStandardTypes() {
        assertNotNull(NumberDeserializers.find(Integer.class, Integer.class.getName()));
        assertNotNull(NumberDeserializers.find(Boolean.class, Boolean.class.getName()));
        assertNotNull(NumberDeserializers.find(Long.class, Long.class.getName()));
        assertNotNull(NumberDeserializers.find(Double.class, Double.class.getName()));
        assertNotNull(NumberDeserializers.find(Character.class, Character.class.getName()));
        assertNotNull(NumberDeserializers.find(Byte.class, Byte.class.getName()));
        assertNotNull(NumberDeserializers.find(Short.class, Short.class.getName()));
        assertNotNull(NumberDeserializers.find(Float.class, Float.class.getName()));
        assertNotNull(NumberDeserializers.find(Number.class, Number.class.getName()));
        assertNotNull(NumberDeserializers.find(BigDecimal.class, BigDecimal.class.getName()));
        assertNotNull(NumberDeserializers.find(BigInteger.class, BigInteger.class.getName()));
    }

    @Test
    public void testFindInvalidClassNamesOrTypes() {
        assertNull(NumberDeserializers.find(Object.class, "java.lang.Object"));
    }

    @Test
    public void testBooleanDeserializerNullHandling() throws Exception {
        NumberDeserializers.BooleanDeserializer deser = NumberDeserializers.BooleanDeserializer.wrapperInstance;
        DeserializationContext ctxt = MAPPER.getDeserializationContext();
        
        // Null value with fail on null disabled
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        assertNull(deser.getNullValue(m.getDeserializationContext()));
        
        // Deprecated getNullValue()
        assertNull(deser.getNullValue());
    }

    @Test(expected = JsonMappingException.class)
    public void testBooleanDeserializerFailOnNullForPrimitives() throws Exception {
        NumberDeserializers.BooleanDeserializer deser = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
        deser.getNullValue(m.getDeserializationContext());
    }

    @Test
    public void testCharacterDeserializerEdges() throws Exception {
        // Test Integer ascii
        JsonParser p = MAPPER.getFactory().createParser("65");
        p.nextToken();
        CharacterDeserializer charDeser = CharacterDeserializer.primitiveInstance;
        DeserializationContext ctxt = MAPPER.getDeserializationContext();
        assertEquals(Character.valueOf('A'), charDeser.deserialize(p, ctxt));

        // Test String length 1
        p = MAPPER.getFactory().createParser("\"B\"");
        p.nextToken();
        assertEquals(Character.valueOf('B'), charDeser.deserialize(p, ctxt));

        // Test String empty length 0
        p = MAPPER.getFactory().createParser("\"\"");
        p.nextToken();
        assertNull(charDeser.deserialize(p, ctxt));

        // Test Single Value Array Unwrapping
        ObjectMapper m = new ObjectMapper();
        m.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        p = m.getFactory().createParser("[\"C\"]");
        p.nextToken();
        assertEquals(Character.valueOf('C'), charDeser.deserialize(p, m.getDeserializationContext()));
    }

    @Test(expected = JsonMappingException.class)
    public void testCharacterDeserializerInvalidLengthString() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("\"AB\"");
        p.nextToken();
        CharacterDeserializer.primitiveInstance.deserialize(p, MAPPER.getDeserializationContext());
    }

    @Test
    public void testIntegerDeserializerCachableAndDeserialize() throws Exception {
        NumberDeserializers.IntegerDeserializer deser = NumberDeserializers.IntegerDeserializer.wrapperInstance;
        assertTrue(deser.isCachable());

        JsonParser p = MAPPER.getFactory().createParser("123");
        p.nextToken();
        assertEquals(Integer.valueOf(123), deser.deserialize(p, MAPPER.getDeserializationContext()));
        assertEquals(Integer.valueOf(123), deser.deserializeWithType(p, MAPPER.getDeserializationContext(), null));
    }

    @Test
    public void testLongDeserializerCachable() {
        NumberDeserializers.LongDeserializer deser = NumberDeserializers.LongDeserializer.wrapperInstance;
        assertTrue(deser.isCachable());
    }

    @Test
    public void testNumberDeserializerStringEdges() throws Exception {
        NumberDeserializers.NumberDeserializer deser = NumberDeserializers.NumberDeserializer.instance;
        DeserializationContext ctxt = MAPPER.getDeserializationContext();

        // Empty string
        JsonParser p = MAPPER.getFactory().createParser("\" \"");
        p.nextToken();
        assertNull(deser.deserialize(p, ctxt));

        // Textual Null
        p = MAPPER.getFactory().createParser("\"null\"");
        p.nextToken();
        assertNull(deser.deserialize(p, ctxt));

        // Infinity & NaN
        p = MAPPER.getFactory().createParser("\"Infinity\"");
        p.nextToken();
        assertEquals(Double.POSITIVE_INFINITY, deser.deserialize(p, ctxt));

        p = MAPPER.getFactory().createParser("\"-Infinity\"");
        p.nextToken();
        assertEquals(Double.NEGATIVE_INFINITY, deser.deserialize(p, ctxt));

        p = MAPPER.getFactory().createParser("\"NaN\"");
        p.nextToken();
        assertEquals(Double.NaN, deser.deserialize(p, ctxt));

        // Float / Double string parsing
        p = MAPPER.getFactory().createParser("\"123.45\"");
        p.nextToken();
        ObjectMapper mDecimal = new ObjectMapper();
        mDecimal.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
        assertEquals(new BigDecimal("123.45"), deser.deserialize(p, mDecimal.getDeserializationContext()));

        // BigInteger string parsing
        p = MAPPER.getFactory().createParser("\"999999999999\"");
        p.nextToken();
        ObjectMapper mBigInt = new ObjectMapper();
        mBigInt.enable(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        assertEquals(new BigInteger("999999999999"), deser.deserialize(p, mBigInt.getDeserializationContext()));
    }

    @Test
    public void testBigIntegerDeserializerFloatCoercion() throws Exception {
        NumberDeserializers.BigIntegerDeserializer deser = NumberDeserializers.BigIntegerDeserializer.instance;
        ObjectMapper m = new ObjectMapper();
        m.enable(DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        JsonParser p = m.getFactory().createParser("123.45");
        p.nextToken();
        assertEquals(BigInteger.valueOf(123), deser.deserialize(p, m.getDeserializationContext()));
    }

    @Test
    public void testBigDecimalDeserializerEmptyString() throws Exception {
        NumberDeserializers.BigDecimalDeserializer deser = NumberDeserializers.BigDecimalDeserializer.instance;
        JsonParser p = MAPPER.getFactory().createParser("\"\"");
        p.nextToken();
        assertNull(deser.deserialize(p, MAPPER.getDeserializationContext()));
    }
}