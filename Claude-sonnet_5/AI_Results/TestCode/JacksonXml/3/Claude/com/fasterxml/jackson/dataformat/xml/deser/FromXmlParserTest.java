package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser; // target class (same package, import explicit per requirement)

public class FromXmlParserTest {

    // ---------- Helper ----------

    private FromXmlParser createParser(String xml) throws IOException {
        XmlFactory factory = new XmlFactory();
        JsonParser p = factory.createParser(xml);
        assertTrue("createParser should return FromXmlParser", p instanceof FromXmlParser);
        return (FromXmlParser) p;
    }

    // ---------- Basic token flow ----------

    @Test
    public void testSimpleTextElement() throws IOException {
        FromXmlParser p = createParser("<root>value</root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("", p.getCurrentName()); // DEFAULT_UNNAMED_TEXT_PROPERTY
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken()); // XML_END -> null
        p.close();
    }

    @Test
    public void testEmptyElementProducesValueNull() throws IOException {
        FromXmlParser p = createParser("<root></root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken()); // mayBeLeaf + END_ELEMENT branch
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSelfClosingElementSameAsEmpty() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNestedObjectWithLeafText() throws IOException {
        FromXmlParser p = createParser("<root><child>text</child></root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("child", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken()); // leaf text, no extra object
        assertEquals("text", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testAttributeAndTextHandling() throws IOException {
        FromXmlParser p = createParser("<root attr=\"val\">text</root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("attr", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("val", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("", p.getCurrentName()); // text pseudo-property
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSetXMLTextElementNameChangesPseudoPropertyName() throws IOException {
        FromXmlParser p = createParser("<root>text</root>");
        p.setXMLTextElementName("value");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("value", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());
        p.close();
    }

    @Test
    public void testWhitespaceOnlyTextSkippedInObjectContext() throws IOException {
        // Covers: inObject() && currToken!=FIELD_NAME && _isEmpty(text) -> loop continue
        String xml = "<root>\n  <child>text</child>\n</root>";
        FromXmlParser p = createParser(xml);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("child", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    // ---------- isExpectedStartArrayToken ----------

    @Test
    public void testIsExpectedStartArrayTokenConvertsStartObjectAndIsIdempotent() throws IOException {
        String xml = "<root><item><sub>a</sub></item></root>";
        FromXmlParser p = createParser(xml);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());  // root wrapper
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());    // "item"
        assertEquals("item", p.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());  // object for <item><sub>...

        assertTrue(p.isExpectedStartArrayToken());
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());

        // idempotent second call -> "return (t == START_ARRAY)" branch
        assertTrue(p.isExpectedStartArrayToken());
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());

        // getValueAsString default-branch while on START_ARRAY (not scalar)
        assertEquals("def", p.getValueAsString("def"));

        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("a", p.getText());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testIsExpectedStartArrayTokenFalseForScalarValue() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME ""
        p.nextToken(); // VALUE_STRING "x"
        assertFalse(p.isExpectedStartArrayToken());
    }

    // ---------- getCurrentName / overrideCurrentName ----------

    @Test
    public void testGetCurrentNameOnFieldNameState() throws IOException {
        FromXmlParser p = createParser("<root><child>x</child></root>");
        p.nextToken();
        p.nextToken();
        assertEquals("child", p.getCurrentName());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentNameThrowsWhenParentNameMissing() throws IOException {
        // Right after the very first START_OBJECT, the (virtual) root's
        // parent context has no name set -> IllegalStateException expected.
        FromXmlParser p = createParser("<root>x</root>");
        p.nextToken(); // START_OBJECT (root wrapper)
        p.getCurrentName();
    }

    @Test
    public void testOverrideCurrentNameOnFieldName() throws IOException {
        FromXmlParser p = createParser("<root><child>x</child></root>");
        p.nextToken();
        p.nextToken(); // FIELD_NAME "child"
        p.overrideCurrentName("renamed");
        assertEquals("renamed", p.getCurrentName());
    }

    @Test
    public void testOverrideCurrentNameOnStartObjectUsesParentContext() throws IOException {
        FromXmlParser p = createParser("<root><child><inner>x</inner></child></root>");
        p.nextToken(); // START_OBJECT root
        p.nextToken(); // FIELD_NAME child
        p.nextToken(); // START_OBJECT child (because nested <inner>)
        p.overrideCurrentName("renamedChild");
        assertEquals("renamedChild", p.getCurrentName());
    }

    // ---------- getText / getValueAsString ----------

    @Test
    public void testGetTextNullWhenNoCurrentToken() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        assertNull(p.getText()); // _currToken == null before first nextToken()
    }

    @Test
    public void testGetTextDefaultBranchUsesAsString() throws IOException {
        // Relies on jackson-core's known JsonToken.asString() mapping for START_OBJECT ("{")
        FromXmlParser p = createParser("<root>x</root>");
        p.nextToken(); // START_OBJECT
        assertEquals("{", p.getText());
    }

    @Test
    public void testGetValueAsStringVariants() throws IOException {
        FromXmlParser p = createParser("<root>hi</root>");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME ""
        assertEquals("", p.getValueAsString());
        assertEquals("", p.getValueAsString("def"));
        p.nextToken(); // VALUE_STRING "hi"
        assertEquals("hi", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNullTokenIgnoresDefault() throws IOException {
        // Per source: if (t == null) return null; -- defValue is NOT used in this branch
        FromXmlParser p = createParser("<root>x</root>");
        while (p.nextToken() != null) { /* drain */ }
        assertNull(p.getValueAsString());
        assertNull(p.getValueAsString("default")); // still null, confirms branch
    }

    // ---------- nextTextValue ----------

    @Test
    public void testNextTextValueOnPlainTextElement() throws IOException {
        FromXmlParser p = createParser("<root>hello</root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        String tv = p.nextTextValue(); // XML_TEXT branch, mayBeLeaf == false -> FIELD_NAME, returns null
        assertNull(tv);
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        assertEquals("", p.getCurrentName());
        tv = p.nextTextValue(); // _nextToken == VALUE_STRING branch -> returns text directly
        assertEquals("hello", tv);
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueOnChildElementLeaf() throws IOException {
        FromXmlParser p = createParser("<root><child>x</child></root>");
        p.nextToken(); // START_OBJECT
        String tv = p.nextTextValue(); // XML_START_ELEMENT branch -> FIELD_NAME, null
        assertNull(tv);
        assertEquals(JsonToken.FIELD_NAME, p.getCurrentToken());
        assertEquals("child", p.getCurrentName());
        tv = p.nextTextValue(); // mayBeLeaf == true, XML_TEXT -> returns text directly (no skip hack)
        assertEquals("x", tv);
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    @Test
    public void testNextTextValueOnEmptyChildElementReturnsEmptyString() throws IOException {
        FromXmlParser p = createParser("<root><child></child></root>");
        p.nextToken(); // START_OBJECT
        p.nextTextValue(); // FIELD_NAME "child"
        String tv = p.nextTextValue(); // XML_END_ELEMENT + mayBeLeaf -> "" (different from nextToken()'s VALUE_NULL)
        assertEquals("", tv);
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
    }

    // ---------- getBinaryValue ----------

    @Test
    public void testGetBinaryValueDecodesBase64AndCaches() throws IOException {
        FromXmlParser p = createParser("<root>aGVsbG8=</root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING "aGVsbG8="
        byte[] bytes = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("hello".getBytes(), bytes);
        byte[] again = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertSame(bytes, again); // cached, _binaryValue != null branch
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        FromXmlParser p = createParser("<root>text</root>");
        p.nextToken(); // START_OBJECT, not VALUE_STRING
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    // ---------- Numeric stubs / misc accessors ----------

    @Test
    public void testNumericAndEmbeddedStubDefaults() throws IOException {
        FromXmlParser p = createParser("<root>5</root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING "5"
        assertNull(p.getBigIntegerValue());
        assertNull(p.getDecimalValue());
        assertEquals(0.0, p.getDoubleValue(), 0.0001);
        assertEquals(0.0f, p.getFloatValue(), 0.0001f);
        assertEquals(0, p.getIntValue());
        assertEquals(0L, p.getLongValue());
        assertNull(p.getNumberType());
        assertNull(p.getNumberValue());
        assertNull(p.getEmbeddedObject());
    }

    @Test
    public void testTextCharacterAccessors() throws IOException {
        FromXmlParser p = createParser("<root>hello</root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING "hello"
        assertArrayEquals("hello".toCharArray(), p.getTextCharacters());
        assertEquals(5, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        assertFalse(p.hasTextCharacters());
    }

    @Test
    public void testTextCharacterAccessorsWhenNoToken() throws IOException {
        FromXmlParser p = createParser("<root>hello</root>");
        assertNull(p.getTextCharacters());
        assertEquals(0, p.getTextLength());
    }

    // ---------- Feature / format-features ----------

    @Test
    public void testFeatureCollectDefaultsIsZero() {
        // Feature enum currently has no constants defined
        assertEquals(0, FromXmlParser.Feature.collectDefaults());
    }

    @Test
    public void testGetAndOverrideFormatFeatures() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        assertEquals(0, p.getFormatFeatures()); // no Feature constants exist to default-enable
        p.overrideFormatFeatures(0b011, 0b011);
        assertEquals(0b011, p.getFormatFeatures());
        p.overrideFormatFeatures(0b000, 0b001);
        assertEquals(0b010, p.getFormatFeatures());
    }

    // ---------- codec / version / misc ----------

    @Test
    public void testCodecGetterSetter() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        XmlMapper mapper = new XmlMapper();
        p.setCodec(mapper);
        assertSame(mapper, p.getCodec());
    }

    @Test
    public void testVersionAndRequiresCustomCodec() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        assertNotNull(p.version());
        assertTrue(p.requiresCustomCodec());
    }

    @Test
    public void testGetStaxReaderNotNull() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        assertNotNull(p.getStaxReader());
    }

    @Test
    public void testTokenAndCurrentLocationNotNull() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        p.nextToken();
        assertNotNull(p.getTokenLocation());
        assertNotNull(p.getCurrentLocation());
    }

    // ---------- close() ----------

    @Test
    public void testCloseIsIdempotentWithDefaultFeatures() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        p.close(); // second call hits "!_closed" == false branch, no-op
        assertTrue(p.isClosed());
    }

    @Test
    public void testCloseWithAutoCloseSourceDisabled() throws IOException {
        FromXmlParser p = createParser("<root>x</root>");
        p.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        p.close();
        assertTrue(p.isClosed());
    }

    // ---------- addVirtualWrapping ----------

    @Test
    public void testAddVirtualWrappingStoresNamesAndMatchesCurrentLocalName() throws IOException {
        FromXmlParser p = createParser("<root><item>a</item></root>");
        p.nextToken(); // START_OBJECT root
        p.nextToken(); // FIELD_NAME "item" -> xmlTokens local name == "item"
        Set<String> wrap = new LinkedHashSet<String>();
        wrap.add("item");
        p.addVirtualWrapping(wrap);
        assertEquals(wrap, p.getParsingContext().getNamesToWrap());
        // Internal repeatStartElement() effect is not independently observable via public
        // API beyond continued, non-throwing token flow; not asserting internal detail.
        assertNotNull(p.nextToken());
        p.close();
    }

    @Test
    public void testAddVirtualWrappingNoMatchStillStoresNames() throws IOException {
        FromXmlParser p = createParser("<root><item>a</item></root>");
        p.nextToken();
        p.nextToken();
        Set<String> wrap = new LinkedHashSet<String>();
        wrap.add("somethingElse");
        p.addVirtualWrapping(wrap);
        assertEquals(wrap, p.getParsingContext().getNamesToWrap());
        p.close();
    }

    // ---------- Boundary / null / empty / malformed input ----------

    @Test
    public void testNullXmlContentThrows() {
        XmlFactory factory = new XmlFactory();
        try {
            factory.createParser((String) null);
            fail("Expected an exception for null XML content");
        } catch (Exception e) {
            // Exact exception type depends on JsonFactory/XmlFactory version in classpath;
            // not asserting a specific type per the "no guessing" requirement.
        }
    }

    @Test
    public void testEmptyXmlContentThrows() {
        try {
            FromXmlParser p = createParser("");
            p.nextToken();
            fail("Expected an exception for empty XML content");
        } catch (Exception e) {
            // Underlying StAX implementation is expected to reject empty/invalid XML;
            // exact exception type not specified by FromXmlParser source itself.
        }
    }

    @Test(expected = IOException.class)
    public void testMalformedXmlThrowsIOException() throws IOException {
        // Mismatched tags: <child> opened but never closed, </root> closes wrong element.
        FromXmlParser p = createParser("<root><child></root>");
        while (p.nextToken() != null) {
            // drain until underlying parser reports the structural error
        }
    }
}
