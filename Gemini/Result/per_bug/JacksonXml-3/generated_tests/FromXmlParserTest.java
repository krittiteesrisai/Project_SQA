package com.fasterxml.jackson.dataformat.xml.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FromXmlParserTest {

    private XmlMapper _xmlMapper;

    @Before
    public void setUp() {
        _xmlMapper = new XmlMapper();
    }

    @After
    public void tearDown() {
        // Cleanup if needed
    }

    private FromXmlParser createParser(String xmlContent) throws Exception {
        XMLInputFactory f = XMLInputFactory.newFactory();
        XMLStreamReader sr = f.createXMLStreamReader(new ByteArrayInputStream(xmlContent.getBytes(StandardCharsets.UTF_8)));
        IOContext ctxt = new IOContext(new BufferRecycler(), sr, false);
        return new FromXmlParser(ctxt, 0, 0, _xmlMapper, sr);
    }

    @Test
    public void testLifecycleAndClose() throws Exception {
        String xml = "<root><item>1</item></root>";
        FromXmlParser parser = createParser(xml);

        assertFalse(parser.isClosed());
        assertNotNull(parser.version());
        assertNotNull(parser.getCodec());
        parser.setCodec(_xmlMapper);
        assertTrue(parser.requiresCustomCodec());

        parser.close();
        assertTrue(parser.isClosed());
        // Double close should be safe due to guard `if (!_closed)`
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testFeatureConfiguration() throws Exception {
        String xml = "<root/>";
        FromXmlParser parser = createParser(xml);

        assertEquals(0, parser.getFormatFeatures());
        // Since FromXmlParser.Feature is empty, test override and get/set format features directly
        parser.overrideFormatFeatures(15, 15);
        assertEquals(15, parser.getFormatFeatures());
    }

    @Test
    public void testStaxReaderAndVirtualWrapping() throws Exception {
        String xml = "<root><item>A</item><item>B</item></root>";
        FromXmlParser parser = createParser(xml);
        assertNotNull(parser.getStaxReader());

        Set<String> wrapNames = new HashSet<>();
        wrapNames.add("item");
        
        // Move to start element to satisfy localName != null check
        assertNotNull(parser.nextToken()); // START_OBJECT or START_ELEMENT equivalent
        parser.addVirtualWrapping(wrapNames);
    }

    @Test
    public void testIsExpectedStartArrayToken() throws Exception {
        String xml = "<root><item>value</item></root>";
        FromXmlParser parser = createParser(xml);

        // Initially START_OBJECT
        JsonToken t = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, t);

        // Expect start array conversion
        assertTrue(parser.isExpectedStartArrayToken());
        assertEquals(JsonToken.START_ARRAY, parser.currentToken());

        // Subsequent call when already START_ARRAY
        assertTrue(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testNextTokenWithAttributesAndEmptyText() throws Exception {
        // XML with attribute and text to trigger leaf, attribute handling, and empty text branches
        String xml = "<root attr=\"val\">   </root>";
        FromXmlParser parser = createParser(xml);

        JsonToken token;
        boolean foundAttr = false;
        boolean foundString = false;
        while ((token = parser.nextToken()) != null) {
            if (token == JsonToken.FIELD_NAME && "attr".equals(parser.getCurrentName())) {
                foundAttr = true;
            }
            if (token == JsonToken.VALUE_STRING) {
                foundString = true;
            }
        }
        assertTrue(foundAttr || foundString);
    }

    @Test
    public void testNextTextValue() throws Exception {
        String xml = "<root><item>HelloXml</item></root>";
        FromXmlParser parser = createParser(xml);

        // Consume until text value
        while (parser.nextToken() != JsonToken.VALUE_STRING) {
            if (parser.isClosed()) break;
        }
        
        // Test nextTextValue behavior with nextToken states
        FromXmlParser parser2 = createParser("<root>Simple</root>");
        assertNotNull(parser2.nextToken()); // START_OBJECT
        // Directly test nextTextValue branches
        String textVal = parser2.nextTextValue();
        // May return null or text depending on stream position
        assertNull(textVal);
    }

    @Test
    public void testGetTextAndValueAsStringVariants() throws Exception {
        String xml = "<root attr=\"123\">TextContent</root>";
        FromXmlParser parser = createParser(xml);

        assertNull(parser.getText());
        assertNull(parser.getTextCharacters());
        assertEquals(0, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertFalse(parser.hasTextCharacters());
        assertNull(parser.getEmbeddedObject());

        // Drive through tokens to test getValueAsString with START_OBJECT and attributes conversion
        while (parser.nextToken() != null) {
            parser.getValueAsString("default");
            if (parser.getCurrentName() != null) {
                parser.overrideCurrentName("newName");
                assertEquals("newName", parser.getCurrentName());
            }
        }
    }

    @Test
    public void testBinaryValueDecoding() throws Exception {
        String xml = "<root>SGVsbG8gV29ybGQ=</root>"; // Base64 for "Hello World"
        FromXmlParser parser = createParser(xml);

        // Find VALUE_STRING token
        JsonToken t;
        while ((t = parser.nextToken()) != null) {
            if (t == JsonToken.VALUE_STRING) {
                byte[] binary = parser.getBinaryValue();
                assertNotNull(binary);
                assertEquals("Hello World", new String(binary, StandardCharsets.UTF_8));
                // Call twice to test caching branch (_binaryValue != null)
                byte[] binaryCached = parser.getBinaryValue();
                assertArrayEquals(binary, binaryCached);
                break;
            }
        }
    }

    @Test(expected = IOException.class)
    public void testInvalidBinaryValueTokenThrowsError() throws Exception {
        String xml = "<root><item/></root>";
        FromXmlParser parser = createParser(xml);
        parser.nextToken(); // START_OBJECT
        // Current token is START_OBJECT, not VALUE_STRING or EMBEDDED_OBJECT -> triggers error report
        parser.getBinaryValue();
    }

    @Test(expected = IOException.class)
    public void testInvalidBase64ThrowsError() throws Exception {
        String xml = "<root>INVALID_BASE64_@@@</root>";
        FromXmlParser parser = createParser(xml);
        JsonToken t;
        while ((t = parser.nextToken()) != null) {
            if (t == JsonToken.VALUE_STRING) {
                parser.getBinaryValue();
            }
        }
    }

    @Test
    public void testUnimplementedNumericAccessors() throws Exception {
        String xml = "<root>123</root>";
        FromXmlParser parser = createParser(xml);
        assertNull(parser.getBigIntegerValue());
        assertNull(parser.getDecimalValue());
        assertEquals(0.0, parser.getDoubleValue(), 0.001);
        assertEquals(0.0f, parser.getFloatValue(), 0.001);
        assertEquals(0, parser.getIntValue());
        assertEquals(0L, parser.getLongValue());
        assertNull(parser.getNumberType());
        assertNull(parser.getNumberValue());
    }

    @Test
    public void testIsEmptyInternalLogicViaParserMethods() throws Exception {
        // Indirectly exercises _isEmpty through XML parsing with whitespace and empty elements
        String xml = "<root>   </root>";
        FromXmlParser parser = createParser(xml);
        while (parser.nextToken() != null) {
            // Loop through to cover empty text checks
        }
        assertTrue(parser.isClosed());
    }
}