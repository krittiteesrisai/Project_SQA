package com.fasterxml.jackson.databind.type;

import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;

import static org.junit.Assert.*;

public class TypeParserTest {

    private TypeFactory typeFactory;
    private TypeParser typeParser;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        typeParser = new TypeParser(typeFactory);
    }

    @Test
    public void testWithFactorySame() {
        TypeParser same = typeParser.withFactory(typeFactory);
        assertSame(typeParser, same);
    }

    @Test
    public void testWithFactoryDifferent() {
        TypeFactory newFactory = TypeFactory.defaultInstance();
        TypeParser diff = typeParser.withFactory(newFactory);
        assertNotSame(typeParser, diff);
    }

    @Test
    public void testParseSimpleClass() {
        JavaType type = typeParser.parse("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testParseGenericClass() {
        JavaType type = typeParser.parse("java.util.List<java.lang.String>");
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(1, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
    }

    @Test
    public void testParseNestedGenericClass() {
        JavaType type = typeParser.parse("java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>");
        assertNotNull(type);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(2, type.containedTypeCount());
        assertEquals(String.class, type.containedType(0).getRawClass());
        assertEquals(List.class, type.containedType(1).getRawClass());
        assertEquals(Integer.class, type.containedType(1).containedType(0).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseEmptyString() {
        typeParser.parse("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUnexpectedTokensAfterComplete() {
        typeParser.parse("java.lang.String extraToken");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUnexpectedEndInGenerics() {
        typeParser.parse("java.util.List<java.lang.String");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseUnexpectedTokenInGenerics() {
        typeParser.parse("java.util.List<java.lang.String;>");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNonExistentClass() {
        typeParser.parse("com.nonexistent.InvalidClassNamesssss");
    }

    @Test
    public void testTokenizerOperations() {
        TypeParser.MyTokenizer tokenizer = new TypeParser.MyTokenizer("A<B,C>");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("A", tokenizer.nextToken());
        assertEquals("<", tokenizer.nextToken());
        
        tokenizer.pushBack("<");
        assertEquals("<", tokenizer.nextToken());
        
        assertNotNull(tokenizer.getAllInput());
        assertNotNull(tokenizer.getRemainingInput());
    }
}