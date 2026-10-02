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
