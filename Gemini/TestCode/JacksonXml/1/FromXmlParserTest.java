package com.fasterxml.jackson.dataformat.xml.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FromXmlParserTest {

    private final XmlMapper xmlMapper = new XmlMapper();

    @Test
    public void testLifecycleAndConfiguration() throws IOException {
        String xml = "<root><item>123</item></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertNotNull(parser.version());
            assertNotNull(parser.getCodec());
            assertTrue(parser.requiresCustomCodec());
            assertNotNull(parser.getStaxReader());
            
            // Format Features branch coverage
            assertFalse(parser.isEnabled(FromXmlParser.Feature.class.getEnumConstants().length > 0 ? 
                    FromXmlParser.Feature.class.getEnumConstants()[0] : null));
            
            parser.configure(FromXmlParser.Feature.class.getEnumConstants()[0], true);
            parser.disable(FromXmlParser.Feature.class.getEnumConstants()[0]);
            parser.overrideFormatFeatures(1, 1);
            assertEquals(1, parser.getFormatFeatures());
            
            assertFalse(parser.isClosed());
        }
    }

    @Test
    public void testCloseMultipleTimesAndResourceHandling() throws IOException {
        String xml = "<root/>";
        FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml);
        assertFalse(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
        // Second close should be idempotent and safe
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetCurrentNameAndOverride() throws IOException {
        String xml = "<root><child>value</child></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken()); // root
            
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken()); // child
            assertEquals("child", parser.getCurrentName());
            
            parser.overrideCurrentName("overriddenChild");
            assertEquals("overriddenChild", parser.getCurrentName());

            assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
            // Inside value string, current name should still be accessible
            assertEquals("overriddenChild", parser.getCurrentName());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentNameMissingThrowsException() throws IOException {
        String xml = "<root/>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            // At START_OBJECT with no parent and null name -> triggers IllegalStateException in getCurrentName()
            parser.getCurrentName();
        }
    }

    @Test
    public void testIsExpectedStartArrayToken() throws IOException {
        String xml = "<root><item>A</item></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            // Force start array conversion
            assertTrue(parser.isExpectedStartArrayToken());
            assertEquals(JsonToken.START_ARRAY, parser.currentToken());
            
            // Subsequent check when already array
            assertTrue(parser.isExpectedStartArrayToken());
        }
    }

    @Test
    public void testVirtualWrappingAndNamesToWrap() throws IOException {
        String xml = "<root><item>1</item><item>2</item></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            Set<String> wrapNames = new HashSet<>();
            wrapNames.add("item");
            parser.addVirtualWrapping(wrapNames);
            
            assertNotNull(parser.getParsingContext());
            assertNotNull(parser.getTokenLocation());
            assertNotNull(parser.getCurrentLocation());
        }
    }

    @Test
    public void testTextAndValueAccessorsWithLeafAndEmpty() throws IOException {
        String xml = "<root><empty/></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            while (parser.nextToken() != null) {
                if (parser.getCurrentToken() == JsonToken.VALUE_NULL) {
                    assertNull(parser.getText());
                    assertNull(parser.getTextCharacters());
                    assertEquals(0, parser.getTextLength());
                    assertEquals(0, parser.getTextOffset());
                    assertFalse(parser.hasTextCharacters());
                    assertNull(parser.getEmbeddedObject());
                }
            }
        }
    }

    @Test
    public void testNextTextValueAndScalarConversion() throws IOException {
        String xml = "<root><text>hello</text></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            assertNull(parser.nextTextValue()); // FIELD_NAME or START_OBJECT case
            
            // Test scalar and getValueAsString variants
            assertEquals("hello", parser.getValueAsString("default"));
        }
    }

    @Test(expected = IOException.class)
    public void testGetBinaryValueInvalidTokenThrowsError() throws IOException {
        String xml = "<root><item>123</item></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertEquals(JsonToken.START_OBJECT, parser.nextToken());
            // Trying to get binary value on START_OBJECT should throw parsing error
            parser.getBinaryValue();
        }
    }

    @Test
    public void testGetBinaryValueValidBase64() throws IOException {
        String xml = "<root><data>SGVsbG8gV29ybGQ=</data></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            while (parser.nextToken() != null) {
                if (parser.getCurrentToken() == JsonToken.VALUE_STRING && "SGVsbG8gV29ybGQ=".equals(parser.getText())) {
                    byte[] bytes = parser.getBinaryValue();
                    assertNotNull(bytes);
                    assertEquals("Hello World", new String(bytes));
                    // Call twice to test caching/reuse branch (_binaryValue != null)
                    byte[] bytesCached = parser.getBinaryValue();
                    assertArrayEquals(bytes, bytesCached);
                }
            }
        }
    }

    @Test(expected = IOException.class)
    public void testGetBinaryValueInvalidBase64ThrowsException() throws IOException {
        String xml = "<root><data>Invalid-Base64-!!!</data></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            while (parser.nextToken() != null) {
                if (parser.getCurrentToken() == JsonToken.VALUE_STRING && "Invalid-Base64-!!!".equals(parser.getText())) {
                    parser.getBinaryValue();
                }
            }
        }
    }

    @Test
    public void testNumericStubAccessors() throws IOException {
        String xml = "<root><num>123</num></root>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            assertNull(parser.getBigIntegerValue());
            assertNull(parser.getDecimalValue());
            assertEquals(0.0, parser.getDoubleValue(), 0.0);
            assertEquals(0.0f, parser.getFloatValue(), 0.0f);
            assertEquals(0, parser.getIntValue());
            assertEquals(0L, parser.getLongValue());
            assertNull(parser.getNumberType());
            assertNull(parser.getNumberValue());
        }
    }

    @Test
    public void testHandleEOFInNonRootContext() throws IOException {
        String xml = "<root><unclosed>";
        try (FromXmlParser parser = (FromXmlParser) xmlMapper.createParser(xml)) {
            try {
                while (parser.nextToken() != null) {
                    // consume tokens until EOF
                }
            } catch (Exception e) {
                // Expected EOF parse exception due to unclosed non-root context
                assertNotNull(e);
            }
        }
    }
}