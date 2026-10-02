# FromXmlParserTest.java

ด้านล่างคือชุดทดสอบ JUnit 4 สำหรับคลาส `FromXmlParser` โดยใช้ทั้งการทดสอบระดับ unit (เรียก method ตรง ๆ ผ่าน `XmlFactory.createParser`) และการทดสอบระดับ integration ผ่าน `XmlMapper` เพื่อตรวจสอบ branch ที่ตรวจสอบยากด้วย mock (เช่น state ของ `XmlReadContext`/`XmlTokenStream` ภายใน)

**หมายเหตุสำคัญ**: เนื่องจาก source ของ `XmlTokenStream` และ `XmlReadContext` ไม่ได้ให้มา การทดสอบที่พึ่งพาลำดับ token จริงจาก XML (เช่น empty element → `VALUE_NULL`, whitespace-only text → skip เป็น `END_OBJECT`, mixed attribute+text → ใช้ `DEFAULT_UNNAMED_TEXT_PROPERTY`) อ้างอิงจาก **comment ในซอร์สโค้ดที่ให้มาโดยตรง** (เช่น `[dataformat-xml#180]`, `[dataformat-xml#177]`) ไม่ใช่การเดา behavior ลอย ๆ

```java
package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class FromXmlParserTest {

    private final XmlFactory xmlFactory = new XmlFactory();
    private final XmlMapper xmlMapper = new XmlMapper();

    private FromXmlParser createParser(String xml) throws IOException {
        return (FromXmlParser) xmlFactory.createParser(new StringReader(xml));
    }

    // ---------------------------------------------------------------
    // Feature enum (placeholder, ไม่มี constant ใด ๆ)
    // ---------------------------------------------------------------

    @Test
    public void testFeatureCollectDefaultsIsZero() {
        // enum ว่าง -> values() ว่าง -> collectDefaults() ต้องเป็น 0
        assertEquals(0, FromXmlParser.Feature.collectDefaults());
    }

    @Test
    public void testFeatureValuesIsEmpty() {
        assertEquals(0, FromXmlParser.Feature.values().length);
    }

    // ---------------------------------------------------------------
    // Format features bitmask
    // ---------------------------------------------------------------

    @Test
    public void testOverrideFormatFeaturesAndGet() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertEquals(0, p.getFormatFeatures());
        p.overrideFormatFeatures(1, 1); // set bit0
        assertEquals(1, p.getFormatFeatures());
        p.overrideFormatFeatures(0, 1); // clear bit0
        assertEquals(0, p.getFormatFeatures());
        p.close();
    }

    // ---------------------------------------------------------------
    // Metadata / simple accessors
    // ---------------------------------------------------------------

    @Test
    public void testRequiresCustomCodecTrue() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertTrue(p.requiresCustomCodec());
        p.close();
    }

    @Test
    public void testVersionNotNull() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNotNull(p.version());
        p.close();
    }

    @Test
    public void testSetGetCodec() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNull(p.getCodec());
        p.setCodec(xmlMapper);
        assertSame(xmlMapper, p.getCodec());
        p.close();
    }

    // ---------------------------------------------------------------
    // close()
    // ---------------------------------------------------------------

    @Test
    public void testCloseIdempotent() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertFalse(p.isClosed());
        p.close();
        assertTrue(p.isClosed());
        // เรียกซ้ำ: branch _closed==true -> ข้าม body ทั้งหมด ไม่ควร throw
        p.close();
        assertTrue(p.isClosed());
    }

    // ---------------------------------------------------------------
    // getCurrentName()
    // ---------------------------------------------------------------

    @Test(expected = IllegalStateException.class)
    public void testGetCurrentNameThrowsWhenNameMissing() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        JsonToken t = p.nextToken(); // START_OBJECT (root) จาก _nextToken เริ่มต้นใน constructor
        assertEquals(JsonToken.START_OBJECT, t);
        // parent ของ root object context คือ ROOT context ซึ่งไม่มีชื่อ -> IllegalStateException
        p.getCurrentName();
    }

    @Test
    public void testGetCurrentNameOnFieldName() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken(); // START_OBJECT
        JsonToken t = p.nextToken(); // FIELD_NAME "a"
        assertEquals(JsonToken.FIELD_NAME, t);
        assertEquals("a", p.getCurrentName());
        p.close();
    }

    // ---------------------------------------------------------------
    // overrideCurrentName()
    // ---------------------------------------------------------------

    @Test
    public void testOverrideCurrentNameOnFieldName() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME "a"
        p.overrideCurrentName("zzz");
        assertEquals("zzz", p.getCurrentName());
        p.close();
    }

    // ---------------------------------------------------------------
    // isExpectedStartArrayToken()
    // ---------------------------------------------------------------

    @Test
    public void testIsExpectedStartArrayTokenConvertsStartObject() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        JsonToken t = p.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, t);
        boolean isArray = p.isExpectedStartArrayToken();
        assertTrue(isArray);
        assertEquals(JsonToken.START_ARRAY, p.getCurrentToken());
        p.close();
    }

    @Test
    public void testIsExpectedStartArrayTokenFalseForFieldName() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken(); // START_OBJECT
        JsonToken t = p.nextToken(); // FIELD_NAME
        assertEquals(JsonToken.FIELD_NAME, t);
        assertFalse(p.isExpectedStartArrayToken());
        p.close();
    }

    // ---------------------------------------------------------------
    // getText()
    // ---------------------------------------------------------------

    @Test
    public void testGetTextNullBeforeAnyToken() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNull(p.getText()); // _currToken == null
        p.close();
    }

    @Test
    public void testGetTextOnFieldName() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken();
        p.nextToken(); // FIELD_NAME "a"
        assertEquals("a", p.getText());
        p.close();
    }

    @Test
    public void testGetTextOnValueString() throws IOException {
        FromXmlParser p = createParser("<root><a>hello</a></root>");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME a
        JsonToken t = p.nextToken(); // VALUE_STRING "hello"
        assertEquals(JsonToken.VALUE_STRING, t);
        assertEquals("hello", p.getText());
        p.close();
    }

    // ---------------------------------------------------------------
    // getValueAsString()
    // ---------------------------------------------------------------

    @Test
    public void testGetValueAsStringNullToken() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNull(p.getValueAsString());
        assertEquals("def", p.getValueAsString("def"));
        p.close();
    }

    @Test
    public void testGetValueAsStringFieldName() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken();
        p.nextToken(); // FIELD_NAME a
        assertEquals("a", p.getValueAsString());
        p.close();
    }

    @Test
    public void testGetValueAsStringValueString() throws IOException {
        FromXmlParser p = createParser("<root><a>hi</a></root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING
        assertEquals("hi", p.getValueAsString("def"));
        p.close();
    }

    @Test
    public void testGetValueAsStringDefaultForNonScalarEndObject() throws IOException {
        FromXmlParser p = createParser("<root></root>");
        JsonToken t = p.nextToken(); // START_OBJECT
        assertEquals(JsonToken.START_OBJECT, t);
        while ((t = p.nextToken()) != null && t != JsonToken.END_OBJECT) {
            // advance จนกว่าจะถึง END_OBJECT
        }
        assertEquals(JsonToken.END_OBJECT, t);
        // END_OBJECT ไม่ใช่ scalar -> default branch คืน defValue
        assertEquals("DEF", p.getValueAsString("DEF"));
        p.close();
    }

    // ---------------------------------------------------------------
    // VALUE_NULL สำหรับ empty element (ตาม comment dataformat-xml#180)
    // ---------------------------------------------------------------

    @Test
    public void testEmptyElementProducesValueNull() throws IOException {
        FromXmlParser p = createParser("<root><a></a></root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken()); // EOF -> null
        p.close();
    }

    // ---------------------------------------------------------------
    // whitespace-only text (_isEmpty==true) -> skip to END_OBJECT
    // (comment dataformat-xml#177)
    // ---------------------------------------------------------------

    @Test
    public void testWhitespaceOnlyTextSkipsToEndObject() throws IOException {
        FromXmlParser p = createParser("<root>   </root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    // ---------------------------------------------------------------
    // non-whitespace text -> pseudo "" property (_cfgNameForTextElement)
    // ---------------------------------------------------------------

    @Test
    public void testNonEmptyRootTextBecomesUnnamedProperty() throws IOException {
        FromXmlParser p = createParser("<root>hello</root>");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        JsonToken t = p.nextToken(); // FIELD_NAME ""
        assertEquals(JsonToken.FIELD_NAME, t);
        assertEquals(FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY, p.getCurrentName());
        t = p.nextToken();
        assertEquals(JsonToken.VALUE_STRING, t);
        assertEquals("hello", p.getText());
        p.close();
    }

    // ---------------------------------------------------------------
    // getBinaryValue()
    // ---------------------------------------------------------------

    @Test
    public void testGetBinaryValueValidBase64() throws IOException {
        // base64("Hello") == "SGVsbG8="
        FromXmlParser p = createParser("<root>SGVsbG8=</root>");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME ""
        p.nextToken(); // VALUE_STRING "SGVsbG8="
        byte[] decoded = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("Hello".getBytes(), decoded);
        p.close();
    }

    @Test
    public void testGetBinaryValueInvalidBase64Throws() throws IOException {
        FromXmlParser p = createParser("<root>!!!not-base64!!!</root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected JsonParseException due to invalid base64");
        } catch (JsonParseException expected) {
            // ok
        } finally {
            p.close();
        }
    }

    @Test
    public void testGetBinaryValueWrongTokenThrows() throws IOException {
        FromXmlParser p = createParser("<root><a>1</a></root>");
        p.nextToken(); // START_OBJECT -> ไม่ใช่ VALUE_STRING/VALUE_EMBEDDED_OBJECT
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected JsonParseException for wrong token type");
        } catch (JsonParseException expected) {
            // ok
        } finally {
            p.close();
        }
    }

    // ---------------------------------------------------------------
    // Numeric stub methods (ยังไม่ implement จริง - คืนค่า default เสมอ)
    // ---------------------------------------------------------------

    @Test
    public void testNumericStubMethods() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNull(p.getBigIntegerValue());
        assertNull(p.getDecimalValue());
        assertEquals(0d, p.getDoubleValue(), 0.0001);
        assertEquals(0f, p.getFloatValue(), 0.0001);
        assertEquals(0, p.getIntValue());
        assertEquals(0L, p.getLongValue());
        assertNull(p.getNumberType());
        assertNull(p.getNumberValue());
        p.close();
    }

    // ---------------------------------------------------------------
    // misc accessor stubs
    // ---------------------------------------------------------------

    @Test
    public void testHasTextCharactersAlwaysFalse() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertFalse(p.hasTextCharacters());
        p.close();
    }

    @Test
    public void testGetEmbeddedObjectAlwaysNull() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertNull(p.getEmbeddedObject());
        p.close();
    }

    @Test
    public void testGetTextOffsetAlwaysZero() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertEquals(0, p.getTextOffset());
        p.close();
    }

    @Test
    public void testGetTextLengthAndCharacters() throws IOException {
        FromXmlParser p = createParser("<root><a>hi</a></root>");
        p.nextToken();
        p.nextToken();
        p.nextToken(); // VALUE_STRING "hi"
        assertEquals(2, p.getTextLength());
        assertArrayEquals("hi".toCharArray(), p.getTextCharacters());
        p.close();
    }

    @Test
    public void testGetTextLengthZeroWhenNull() throws IOException {
        FromXmlParser p = createParser("<root/>");
        assertEquals(0, p.getTextLength());
        assertNull(p.getTextCharacters());
        p.close();
    }

    // ---------------------------------------------------------------
    // Integration style: ผ่าน XmlMapper -> Map
    // (ตรวจพฤติกรรมระดับสูงของ nextToken() loop ทั้งหมด)
    // ---------------------------------------------------------------

    @Test
    public void testXmlMapperSimpleObjectToMap() throws IOException {
        String xml = "<root><a>1</a><b>2</b></root>";
        @SuppressWarnings("unchecked")
        Map<String, Object> result = xmlMapper.readValue(xml, LinkedHashMap.class);
        assertEquals("1", result.get("a"));
        assertEquals("2", result.get("b"));
    }

    @Test
    public void testXmlMapperMixedAttributeAndTextToMap() throws IOException {
        String xml = "<root attr=\"x\">text</root>";
        @SuppressWarnings("unchecked")
        Map<String, Object> result = xmlMapper.readValue(xml, LinkedHashMap.class);
        assertEquals("x", result.get("attr"));
        assertEquals("text", result.get(FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY));
    }

    @Test
    public void testXmlMapperEmptyElementToMap() throws IOException {
        String xml = "<root><a/></root>";
        @SuppressWarnings("unchecked")
        Map<String, Object> result = xmlMapper.readValue(xml, LinkedHashMap.class);
        assertTrue(result.containsKey("a"));
        assertNull(result.get("a"));
    }

    @Test
    public void testXmlMapperEmptyRootToEmptyMap() throws IOException {
        String xml = "<root></root>";
        @SuppressWarnings("unchecked")
        Map<String, Object> result = xmlMapper.readValue(xml, LinkedHashMap.class);
        assertTrue(result.isEmpty());
    }
}
```

## สรุปตาราง Test coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testFeatureCollectDefaultsIsZero` | `Feature.collectDefaults()` loop ไม่มี element (enum ว่าง) |
| `testFeatureValuesIsEmpty` | ยืนยัน `values().length == 0` |
| `testOverrideFormatFeaturesAndGet` | `overrideFormatFeatures()` ทั้ง set/clear bit, `getFormatFeatures()` |
| `testRequiresCustomCodecTrue` | `requiresCustomCodec()` คืน true |
| `testVersionNotNull` | `version()` |
| `testSetGetCodec` | `setCodec()/getCodec()` |
| `testCloseIdempotent` | `close()` ทั้ง branch `_closed==false` (ทำงาน) และ `_closed==true` (ข้าม) |
| `testGetCurrentNameThrowsWhenNameMissing` | `getCurrentName()` branch START_OBJECT + name==null → throw |
| `testGetCurrentNameOnFieldName` | `getCurrentName()` branch else (ไม่ใช่ START_OBJECT/ARRAY) |
| `testOverrideCurrentNameOnFieldName` | `overrideCurrentName()` branch currToken≠START_OBJECT/ARRAY |
| `testIsExpectedStartArrayTokenConvertsStartObject` | `isExpectedStartArrayToken()` branch `t==START_OBJECT` → convert |
| `testIsExpectedStartArrayTokenFalseForFieldName` | `isExpectedStartArrayToken()` branch `t!=START_ARRAY` → false |
| `testGetTextNullBeforeAnyToken` | `getText()` branch `_currToken==null` |
| `testGetTextOnFieldName` | `getText()` case FIELD_NAME |
| `testGetTextOnValueString` | `getText()` case VALUE_STRING |
| `testGetValueAsStringNullToken` | `getValueAsString()` branch `t==null` |
| `testGetValueAsStringFieldName` | `getValueAsString()` case FIELD_NAME |
| `testGetValueAsStringValueString` | `getValueAsString()` case VALUE_STRING |
| `testGetValueAsStringDefaultForNonScalarEndObject` | `getValueAsString()` default branch, `isScalarValue()==false` → defValue |
| `testEmptyElementProducesValueNull` | `nextToken()` XML_END_ELEMENT + `_mayBeLeaf==true` → VALUE_NULL |
| `testWhitespaceOnlyTextSkipsToEndObject` | `nextToken()` XML_TEXT, `_mayBeLeaf==false`, `_isEmpty==true`, inObject → END_OBJECT |
| `testNonEmptyRootTextBecomesUnnamedProperty` | `nextToken()` XML_TEXT, `_isEmpty==false` → FIELD_NAME "" + VALUE_STRING |
| `testGetBinaryValueValidBase64` | `getBinaryValue()` decode สำเร็จ, `_binaryValue==null` branch |
| `testGetBinaryValueInvalidBase64Throws` | `getBinaryValue()` catch `IllegalArgumentException` → JsonParseException |
| `testGetBinaryValueWrongTokenThrows` | `getBinaryValue()` branch token ผิดชนิด → `_reportError` |
| `testNumericStubMethods` | numeric getter ทั้งหมด (stub, ไม่มี branch แต่ fault-detect ได้ถ้าเปลี่ยน default) |
| `testHasTextCharactersAlwaysFalse` | `hasTextCharacters()` |
| `testGetEmbeddedObjectAlwaysNull` | `getEmbeddedObject()` |
| `testGetTextOffsetAlwaysZero` | `getTextOffset()` |
| `testGetTextLengthAndCharacters` | `getTextLength()/getTextCharacters()` branch `text!=null` |
| `testGetTextLengthZeroWhenNull` | `getTextLength()/getTextCharacters()` branch `text==null` |
| `testXmlMapperSimpleObjectToMap` | `nextToken()` full object parsing loop (FIELD_NAME/VALUE_STRING/END_OBJECT) |
| `testXmlMapperMixedAttributeAndTextToMap` | `nextToken()` XML_ATTRIBUTE_NAME/VALUE branch + text-as-pseudo-property |
| `testXmlMapperEmptyElementToMap` | integration check ของ VALUE_NULL branch ผ่าน databind |
| `testXmlMapperEmptyRootToEmptyMap` | integration check ของ empty-text-skip branch ผ่าน databind |

**ข้อจำกัดที่ระบุไว้**: ไม่ได้เขียนทดสอบสำหรับ `addVirtualWrapping()`, array-context branch ของ `_parsingContext.inArray()` ใน loop ของ `nextToken()`/`nextTextValue()` แบบ exact และ branch `START_OBJECT`→`convertToString()` ใน `getValueAsString()` เนื่องจากต้องพึ่งพา behavior ภายในของ `XmlTokenStream`/`XmlReadContext` ที่ไม่มี source ให้มา จึงไม่สามารถยืนยัน exact behavior ได้โดยไม่เดา (ตามข้อกำหนดที่ 4)