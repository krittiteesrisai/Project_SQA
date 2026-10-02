# JUnit 4 Test Suite สำหรับ `XmlTokenStream`

## หมายเหตุสำคัญก่อนเริ่ม
- คลาส `ElementWrapper` ที่ใช้ภายใน (`_currentWrapper`) **ไม่มีซอร์สโค้ดให้มา** จึงไม่สามารถยืนยัน behavior ของ `matchesWrapper()`, `intermediateWrapper()`, `isMatching()` ฯลฯ ได้ — ทดสอบเฉพาะส่วนที่ guard clause อยู่ใน `XmlTokenStream` เอง (เช่นกรณี `_currentWrapper == null`) และคอมเมนต์กำกับไว้ชัดเจนในจุดที่เกี่ยวข้อง
- ทดสอบอยู่ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.dataformat.xml.deser`) เพื่อให้เข้าถึง field/method ที่เป็น `protected` ได้โดยตรงโดยไม่ต้องใช้ reflection (field เหล่านี้ประกาศเป็น `protected` ในซอร์สที่ให้มาจริง)
- กรณี `_skipUntilTag()` throw `IllegalStateException("Expected to find a tag...")` ไม่ได้ทดสอบ เพราะไม่สามารถจำลองสถานะ `hasNext()==false` ก่อนเจอ `END_DOCUMENT` ได้ด้วย XML ที่ well-formed ผ่าน StAX มาตรฐาน (คอมเมนต์กำกับไว้ในโค้ด)

```java
package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.junit.Test;

import com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream;

public class XmlTokenStreamTest
{
    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private XMLStreamReader readerAtStart(String xml) throws XMLStreamException {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader r = f.createXMLStreamReader(new StringReader(xml));
        while (r.getEventType() != XMLStreamConstants.START_ELEMENT) {
            r.next();
        }
        return r;
    }

    private XMLStreamReader readerAtDocumentStart(String xml) throws XMLStreamException {
        XMLInputFactory f = XMLInputFactory.newInstance();
        return f.createXMLStreamReader(new StringReader(xml));
    }

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_validStartElement() throws Exception {
        XMLStreamReader r = readerAtStart("<root attr='v'><child/></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertEquals(XmlTokenStream.XML_START_ELEMENT, xts.getCurrentToken());
        assertEquals("root", xts.getLocalName());
        assertNotNull(xts.getXmlReader());
        assertTrue(xts.hasAttributes());
    }

    @Test
    public void testConstructor_invalidEventType_throws() throws Exception {
        XMLStreamReader r = readerAtDocumentStart("<root/>"); // still at START_DOCUMENT
        try {
            new XmlTokenStream(r, "src");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid XMLStreamReader"));
        }
    }

    // ---------------------------------------------------------------
    // hasAttributes()
    // ---------------------------------------------------------------

    @Test
    public void testHasAttributes_noAttributes() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertFalse(xts.hasAttributes());
    }

    @Test
    public void testHasAttributes_falseWhenNotStartElementState() throws Exception {
        XMLStreamReader r = readerAtStart("<root attr='v'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // -> XML_ATTRIBUTE_NAME
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, xts.getCurrentToken());
        assertFalse(xts.hasAttributes());
    }

    // ---------------------------------------------------------------
    // next(): main flows
    // ---------------------------------------------------------------

    @Test
    public void testNext_emptyElement_noAttributes_noText() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.next());
        assertEquals(XmlTokenStream.XML_END, xts.next());
        // ค่าควรคงที่ที่ XML_END เมื่อเรียกซ้ำ
        assertEquals(XmlTokenStream.XML_END, xts.next());
        assertEquals(XmlTokenStream.XML_END, xts.getCurrentToken());
    }

    @Test
    public void testNext_elementWithTwoAttributes() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1' b='2'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");

        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, xts.next());
        assertEquals("a", xts.getLocalName());
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, xts.next());
        assertEquals("1", xts.getText());

        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, xts.next());
        assertEquals("b", xts.getLocalName());
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, xts.next());
        assertEquals("2", xts.getText());

        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.next());
    }

    @Test
    public void testNext_elementWithText() throws Exception {
        XMLStreamReader r = readerAtStart("<root>Hello</root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertEquals(XmlTokenStream.XML_TEXT, xts.next());
        assertEquals("Hello", xts.getText());
        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.next());
    }

    @Test
    public void testNext_textConcatenation_charactersAndCData() throws Exception {
        XMLStreamReader r = readerAtStart("<root>Hello<![CDATA[ World]]></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertEquals(XmlTokenStream.XML_TEXT, xts.next());
        assertEquals("Hello World", xts.getText());
    }

    @Test
    public void testNext_commentIgnoredBetweenTags() throws Exception {
        XMLStreamReader r = readerAtStart("<root><!-- c --><child/></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertEquals(XmlTokenStream.XML_START_ELEMENT, xts.next());
        assertEquals("child", xts.getLocalName());
    }

    @Test
    public void testNext_nestedElementsFullCycle() throws Exception {
        XMLStreamReader r = readerAtStart("<root><child>text</child></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, xts.next());
        assertEquals("child", xts.getLocalName());

        assertEquals(XmlTokenStream.XML_TEXT, xts.next());
        assertEquals("text", xts.getText());

        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.next()); // child end
        assertEquals("child", xts.getLocalName());

        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.next()); // root end
        assertEquals(XmlTokenStream.XML_END, xts.next());
    }

    @Test
    public void testNext_malformedXml_throwsIOException() throws Exception {
        // tag ไม่สมดุล: <child> ไม่ถูกปิดก่อน </root>
        XMLStreamReader r = readerAtStart("<root><child></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        try {
            for (int i = 0; i < 5; i++) {
                xts.next();
            }
            fail("Expected IOException due to malformed XML");
        } catch (IOException e) {
            // คาดหวัง: XMLStreamException ถูกห่อเป็น IOException ผ่าน StaxUtil
        }
    }

    // ---------------------------------------------------------------
    // skipEndElement()
    // ---------------------------------------------------------------

    @Test
    public void testSkipEndElement_success() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.skipEndElement(); // ไม่ควร throw
        assertEquals(XmlTokenStream.XML_END_ELEMENT, xts.getCurrentToken());
    }

    @Test
    public void testSkipEndElement_failure_throwsIOException() throws Exception {
        XMLStreamReader r = readerAtStart("<root><child/></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        try {
            xts.skipEndElement(); // next() จะได้ XML_START_ELEMENT (child) ไม่ใช่ END_ELEMENT
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Expected END_ELEMENT"));
        }
    }

    // ---------------------------------------------------------------
    // skipAttributes()
    // ---------------------------------------------------------------

    @Test
    public void testSkipAttributes_fromAttributeName() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // XML_ATTRIBUTE_NAME
        xts.skipAttributes();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, xts.getCurrentToken());
    }

    @Test
    public void testSkipAttributes_fromStartElement_noop() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.skipAttributes(); // currentState == XML_START_ELEMENT -> no-op branch
        assertEquals(XmlTokenStream.XML_START_ELEMENT, xts.getCurrentToken());
    }

    @Test
    public void testSkipAttributes_fromText_noop() throws Exception {
        XMLStreamReader r = readerAtStart("<root>Hello</root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // XML_TEXT
        xts.skipAttributes(); // no-op branch
        assertEquals(XmlTokenStream.XML_TEXT, xts.getCurrentToken());
    }

    @Test
    public void testSkipAttributes_otherState_throwsIllegalState() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // XML_END_ELEMENT
        try {
            xts.skipAttributes();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // convertToString()
    // ---------------------------------------------------------------

    @Test
    public void testConvertToString_wrongState_returnsNull() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        // currentState == XML_START_ELEMENT, ไม่ใช่ XML_ATTRIBUTE_NAME
        assertNull(xts.convertToString());
    }

    @Test
    public void testConvertToString_secondAttributeIndex_returnsNull() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1' b='2'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // ATTRIBUTE_NAME a (index 0)
        xts.next(); // ATTRIBUTE_VALUE a
        xts.next(); // ATTRIBUTE_NAME b (index 1)
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, xts.getCurrentToken());
        assertNull(xts.convertToString()); // _nextAttributeIndex != 0
    }

    @Test
    public void testConvertToString_emptyTagAfterAttribute_returnsEmptyString() throws Exception {
        // ครอบคลุม dataformat-xml#167: empty tag -> ""
        XMLStreamReader r = readerAtStart("<root a='1'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // ATTRIBUTE_NAME a, index 0
        String text = xts.convertToString();
        assertEquals("", text);
        assertEquals(XmlTokenStream.XML_TEXT, xts.getCurrentToken());
        assertEquals("", xts.getText());
    }

    @Test
    public void testConvertToString_textAfterAttribute_returnsText() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'>hello</root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // ATTRIBUTE_NAME a
        String text = xts.convertToString();
        assertEquals("hello", text);
        assertEquals(XmlTokenStream.XML_TEXT, xts.getCurrentToken());
    }

    @Test
    public void testConvertToString_childElementAfterAttribute_returnsNull() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'><child/></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // ATTRIBUTE_NAME a
        assertNull(xts.convertToString()); // eventType คือ START_ELEMENT ไม่ใช่ END_ELEMENT
    }

    // ---------------------------------------------------------------
    // repeatStartElement() guard clause
    // ---------------------------------------------------------------

    @Test
    public void testRepeatStartElement_wrongState_throwsIllegalState() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.next(); // state เปลี่ยนเป็น XML_END_ELEMENT
        try {
            xts.repeatStartElement();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // _handleRepeatElement() branches (เข้าถึง protected field ได้เพราะอยู่ package เดียวกัน)
    // ทดสอบเฉพาะกรณีที่ _currentWrapper == null ซึ่งมี/ไม่มี null-check อย่างชัดเจนในซอร์ส
    // ---------------------------------------------------------------

    @Test
    public void testHandleRepeatElement_replayEnd_withNullWrapper() throws Exception {
        XMLStreamReader r = readerAtStart("<root/>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        // _currentWrapper เป็น null ตามค่าเริ่มต้น
        xts._repeatElement = 2; // REPLAY_END
        int type = xts.next();
        assertEquals(XmlTokenStream.XML_END_ELEMENT, type);
    }

    @Test
    public void testHandleRepeatElement_replayStartDelayed_withNullWrapper() throws Exception {
        XMLStreamReader r = readerAtStart("<root/>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts._nextLocalName = "delayedName";
        xts._nextNamespaceURI = "delayedNs";
        xts._repeatElement = 3; // REPLAY_START_DELAYED
        int type = xts.next();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, type);
        assertEquals("delayedName", xts.getLocalName());
        assertEquals("delayedNs", xts.getNamespaceURI());
        assertNull(xts._nextLocalName);
        assertNull(xts._nextNamespaceURI);
    }

    @Test
    public void testHandleRepeatElement_replayStartDup_withNullWrapper_throwsNPE() throws Exception {
        // หมายเหตุ: branch REPLAY_START_DUP ในซอร์สไม่มี null-check ของ _currentWrapper
        // ก่อนเรียก .intermediateWrapper() จึงคาดหวัง NullPointerException จริง (fault-finding)
        XMLStreamReader r = readerAtStart("<root/>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts._repeatElement = 1; // REPLAY_START_DUP
        try {
            xts.next();
            fail("Expected NullPointerException because _currentWrapper is null");
        } catch (NullPointerException e) {
            // expected ตามที่วิเคราะห์จากซอร์ส
        }
    }

    @Test
    public void testHandleRepeatElement_unrecognizedType_throwsIllegalState() throws Exception {
        XMLStreamReader r = readerAtStart("<root/>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts._repeatElement = 99; // ไม่ตรงกับ REPLAY_* constant ใดเลย
        try {
            xts.next();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Unrecognized type to repeat"));
        }
    }

    // ---------------------------------------------------------------
    // close / closeCompletely
    // ---------------------------------------------------------------

    @Test
    public void testClose_noException() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.close();
    }

    @Test
    public void testCloseCompletely_noException() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        xts.closeCompletely();
    }

    // ---------------------------------------------------------------
    // Location
    // ---------------------------------------------------------------

    @Test
    public void testGetCurrentLocation_and_getTokenLocation_notNull() throws Exception {
        XMLStreamReader r = readerAtStart("<root></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        assertNotNull(xts.getCurrentLocation());
        assertNotNull(xts.getTokenLocation());
        assertEquals("src", xts.getCurrentLocation().getSourceRef());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_doesNotThrow() throws Exception {
        XMLStreamReader r = readerAtStart("<root a='1'></root>");
        XmlTokenStream xts = new XmlTokenStream(r, "src");
        String s = xts.toString();
        assertNotNull(s);
        assertTrue(s.contains("Token stream"));
    }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_validStartElement` | Constructor: `eventType == START_ELEMENT` (ผ่าน), ตั้งค่า field เริ่มต้นถูกต้อง |
| `testConstructor_invalidEventType_throws` | Constructor: `eventType != START_ELEMENT` → throw IllegalArgumentException |
| `testHasAttributes_noAttributes` | `hasAttributes()`: `_attributeCount>0` = false |
| `testHasAttributes_falseWhenNotStartElementState` | `hasAttributes()`: `_currentState != XML_START_ELEMENT` |
| `testNext_emptyElement_noAttributes_noText` | `_next()`: text=null branch → `_handleEndElement()`; `_skipUntilTag()`→END_DOCUMENT; `case XML_END` คงค่า |
| `testNext_elementWithTwoAttributes` | loop `_nextAttributeIndex < _attributeCount` (2 รอบ), `XML_ATTRIBUTE_VALUE` fallthrough เพิ่ม index |
| `testNext_elementWithText` | `_collectUntilTag()` คืน text, `eventType==END_ELEMENT` → `XML_TEXT`; `case XML_TEXT`→`_handleEndElement()` |
| `testNext_textConcatenation_charactersAndCData` | `_collectUntilTag()`: branch `text==null` ครั้งแรก vs `text+=...` ครั้งถัดไป (CHARACTERS/CDATA) |
| `testNext_commentIgnoredBetweenTags` | `_collectUntilTag()`: `default` (ignore COMMENT) ก่อนเจอ START_ELEMENT |
| `testNext_nestedElementsFullCycle` | `_initStartElement()` (wrapper==null path), วงจร START→TEXT→END→END→END ครบ |
| `testNext_malformedXml_throwsIOException` | `next()`: catch `XMLStreamException` → `StaxUtil.throwXmlAsIOException` |
| `testSkipEndElement_success` | `skipEndElement()`: `type==XML_END_ELEMENT` (ไม่ throw) |
| `testSkipEndElement_failure_throwsIOException` | `skipEndElement()`: `type!=XML_END_ELEMENT` → throw IOException |
| `testSkipAttributes_fromAttributeName` | `skipAttributes()`: branch `XML_ATTRIBUTE_NAME` |
| `testSkipAttributes_fromStartElement_noop` | `skipAttributes()`: branch `XML_START_ELEMENT` (no-op) |
| `testSkipAttributes_fromText_noop` | `skipAttributes()`: branch `XML_TEXT` (no-op) |
| `testSkipAttributes_otherState_throwsIllegalState` | `skipAttributes()`: `else` → throw IllegalStateException |
| `testConvertToString_wrongState_returnsNull` | `convertToString()`: `_currentState != XML_ATTRIBUTE_NAME` → null |
| `testConvertToString_secondAttributeIndex_returnsNull` | `convertToString()`: `_nextAttributeIndex != 0` → null |
| `testConvertToString_emptyTagAfterAttribute_returnsEmptyString` | `convertToString()`: `text==null` → `""` (เงื่อนไข #167) |
| `testConvertToString_textAfterAttribute_returnsText` | `convertToString()`: `text!=null` คืนค่าจริง |
| `testConvertToString_childElementAfterAttribute_returnsNull` | `convertToString()`: `eventType != END_ELEMENT` → ตกไป `return null` |
| `testRepeatStartElement_wrongState_throwsIllegalState` | `repeatStartElement()`: guard `_currentState != XML_START_ELEMENT` |
| `testHandleRepeatElement_replayEnd_withNullWrapper` | `_handleRepeatElement()`: `type==REPLAY_END`, `_currentWrapper==null` branch |
| `testHandleRepeatElement_replayStartDelayed_withNullWrapper` | `_handleRepeatElement()`: `type==REPLAY_START_DELAYED`, `_currentWrapper==null` branch |
| `testHandleRepeatElement_replayStartDup_withNullWrapper_throwsNPE` | `_handleRepeatElement()`: `type==REPLAY_START_DUP` ไม่มี null-check → NPE (fault-finding) |
| `testHandleRepeatElement_unrecognizedType_throwsIllegalState` | `_handleRepeatElement()`: `else` → throw IllegalStateException |
| `testClose_noException` | `close()`: happy path |
| `testCloseCompletely_noException` | `closeCompletely()`: happy path |
| `testGetCurrentLocation_and_getTokenLocation_notNull` | `_extractLocation()`: branch `location != null` |
| `testToString_doesNotThrow` | `toString()`: smoke test |

**หมายเหตุ branch ที่ไม่ได้ทดสอบ:** `_skipUntilTag()`'s `IllegalStateException("Expected to find a tag...")` (ไม่สามารถจำลองด้วย XML ที่ผ่าน StAX parser มาตรฐานได้) และ path ที่เกี่ยวกับ `ElementWrapper` ที่มี non-null wrapper จริง (เพราะไม่มีซอร์สของ `ElementWrapper` ให้ตรวจสอบ behavior ที่แท้จริง)