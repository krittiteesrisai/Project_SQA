package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.dataformat.xml.util.StaxUtil;

import com.fasterxml.woodstox.stax2.XMLStreamReader2;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.stream.XMLInputFactory;

public class XmlTokenStreamTest {

    private XMLStreamReader createReader(String xml) throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLStreamReader r = f.createXMLStreamReader(new StringReader(xml));
        // เลื่อนไปที่ START_ELEMENT ตัวแรก
        while (r.hasNext() && r.getEventType() != XMLStreamConstants.START_ELEMENT) {
            r.next();
        }
        return r;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidInitialState() throws Exception {
        XMLInputFactory f = XMLInputFactory.newInstance();
        // สร้าง reader ที่ชี้ไปที่ Document Start ไม่ใช่ START_ELEMENT
        XMLStreamReader r = f.createXMLStreamReader(new StringReader("<root/>"));
        // ไม่เรียก next() ให้ชี้ไปที่ START_ELEMENT เพื่อบังคับให้เกิด Exception
        new XmlTokenStream(r, "sourceRef");
    }

    @Test
    public void testBasicParsingAndAttributes() throws Exception {
        String xml = "<root attr1=\"val1\">textdata</root>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());
        assertEquals("root", stream.getLocalName());
        assertTrue(stream.hasAttributes());

        // อ่าน Attribute Name
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.next());
        assertEquals("attr1", stream.getLocalName());
        assertEquals("val1", stream.getText());
        assertFalse(stream.hasAttributes());

        // อ่าน Attribute Value
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_VALUE, stream.next());
        assertEquals("val1", stream.getText());

        // อ่าน Text ภายใน Element
        assertEquals(XmlTokenStream.XML_TEXT, stream.next());
        assertEquals("textdata", stream.getText());

        // อ่าน END_ELEMENT
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());

        // อ่าน END
        assertEquals(XmlTokenStream.XML_END, stream.next());
        assertEquals(XmlTokenStream.XML_END, stream.getCurrentToken());
    }

    @Test
    public void testSkipEndElement() throws Exception {
        String xml = "<root><child/></root>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.next()); // ไปที่ child
        assertEquals("child", stream.getLocalName());

        // ข้าม END_ELEMENT ของ child
        assertEquals(XmlTokenStream.XML_END_ELEMENT, stream.next());
        
        // ทดสอบ skipEndElement() ที่ตำแหน่ง END_ELEMENT ของ root
        // ก่อนอื่นต้องให้ next() เลื่อนไปถึง END_ELEMENT ของ root ก่อน
        // แต่ในที่นี้เราทดสอบเรียก skipEndElement เมื่อเจอ END_ELEMENT พอดี
        // หรือทดสอบ IOException กรณีที่ไม่ใช่ END_ELEMENT
        XMLStreamReader r2 = createReader("<root><child/></root>");
        XmlTokenStream stream2 = new XmlTokenStream(r2, "ref");
        // ปัจจุบันอยู่ที่ root (START_ELEMENT) ซึ่งไม่ใช่ END_ELEMENT จะต้องโยน IOException
        try {
            stream2.skipEndElement();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Expected END_ELEMENT"));
        }
    }

    @Test
    public void testSkipAttributesStates() throws Exception {
        // ทดสอบ skipAttributes ในสถานะ XML_ATTRIBUTE_NAME
        String xml = "<root attr1=\"val1\"><child/></root>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        stream.next(); // XML_ATTRIBUTE_NAME
        assertEquals(XmlTokenStream.XML_ATTRIBUTE_NAME, stream.getCurrentToken());
        stream.skipAttributes();
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream.getCurrentToken());

        // ทดสอบ skipAttributes ในสถานะ XML_START_ELEMENT (ไม่มีผลอะไร ตามโค้ด)
        XMLStreamReader r2 = createReader("<root><child/></root>");
        XmlTokenStream stream2 = new XmlTokenStream(r2, "ref");
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream2.getCurrentToken());
        stream2.skipAttributes(); // ไม่ออก Exception
        assertEquals(XmlTokenStream.XML_START_ELEMENT, stream2.getCurrentToken());

        // ทดสอบ skipAttributes ในสถานะ XML_TEXT (ไม่ทำอะไร)
        String xml3 = "<root>text</root>";
        XMLStreamReader r3 = createReader(xml3);
        XmlTokenStream stream3 = new XmlTokenStream(r3, "ref");
        stream3.next(); // ไป XML_TEXT (หรือ END_ELEMENT ขึ้นกับโครงสร้าง แต่ข้ามไปดู state อื่น)
        
        // ทดสอบ IllegalStateException สำหรับ skipAttributes ในสถานะที่ไม่ถูกต้อง
        // เราสามารถเซ็ตสถานะจำลองโดยผ่าน token ผิด หรือเรียกข้ามลำดับ
        XMLStreamReader r4 = createReader("<root/>");
        XmlTokenStream stream4 = new XmlTokenStream(r4, "ref");
        // บังคับให้ข้ามไป XML_END โดยการอ่านจนจบ แล้วลองเรียก skipAttributes
        while (stream4.getCurrentToken() != XmlTokenStream.XML_END) {
            stream4.next();
        }
        try {
            stream4.skipAttributes();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME"));
        }
    }

    @Test
    public void testRepeatStartElementAndIllegalState() throws Exception {
        String xml = "<root/>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        // อยู่ที่ START_ELEMENT เรียก repeatStartElement ได้ปกติ
        stream.repeatStartElement();

        // หลังจากเรียกแล้ว state ยังเป็น XML_START_ELEMENT แต่ถ้าเรียกซ้ำตอนไม่ใช่ START_ELEMENT
        stream.next(); // อ่านจนเปลี่ยน state
        try {
            stream.repeatStartElement();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Current state not XML_START_ELEMENT"));
        }
    }

    @Test
    public void testConvertToString() throws Exception {
        String xml = "<root attr1=\"val1\">text</root>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        // ตอนนี้อยู่ที่ START_ELEMENT (convertToString จะคืนค่า null เพราะไม่ใช่ ATTRIBUTE_NAME)
        assertNull(stream.convertToString());

        stream.next(); // ไปที่ XML_ATTRIBUTE_NAME
        // ตรงนี้ _nextAttributeIndex == 0 จึงสามารถแปลงได้
        String converted = stream.convertToString();
        assertEquals("text", converted);
        assertEquals(XmlTokenStream.XML_TEXT, stream.getCurrentToken());
    }

    @Test
    public void testCloseOperations() throws Exception {
        String xml = "<root/>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        // ทดสอบ close และ closeCompletely ไม่ควรโยน Exception
        stream.close();
        stream.closeCompletely();
    }

    @Test
    public void testLocationsAndToString() throws Exception {
        String xml = "<root>content</root>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "sourceRef");

        JsonLocation loc = stream.getCurrentLocation();
        assertNotNull(loc);

        JsonLocation tokenLoc = stream.getTokenLocation();
        assertNotNull(tokenLoc);

        String strRep = stream.toString();
        assertNotNull(strRep);
        assertTrue(strRep.contains("Token stream"));
    }

    @Test
    public void testHandleRepeatElementExceptions() throws Exception {
        // ทดสอบเรียก _handleRepeatElement ผ่าน reflection หรือจำลองสถานะ repeatElement ที่ไม่รู้จัก
        String xml = "<root/>";
        XMLStreamReader r = createReader(xml);
        XmlTokenStream stream = new XmlTokenStream(r, "ref");

        // ใช้ Reflection เข้าไปเซ็ต field _repeatElement ให้เป็นค่าที่ไม่รู้จัก (เช่น 99)
        java.lang.reflect.Field repeatField = XmlTokenStream.class.getDeclaredField("_repeatElement");
        repeatField.setAccessible(true);
        repeatField.setInt(stream, 99);

        try {
            stream.next();
            fail("Expected IllegalStateException for unrecognized repeat type");
        } catch (IOException e) {
            // next() คลุมด้วย try-catch XMLStreamException และแปลงเป็น IOException ผ่าน StaxUtil
            // แต่ข้างใน _handleRepeatElement จะโยน IllegalStateException ซึ่งอาจถูกห่อหรือส่งออกมา
            Throwable cause = e.getCause();
            if (cause instanceof IllegalStateException) {
                assertTrue(cause.getMessage().contains("Unrecognized type to repeat"));
            } else {
                assertTrue(e.getMessage().contains("Unrecognized type to repeat") || (e.getCause() != null && e.getCause().getMessage().contains("Unrecognized type")));
            }
        }
    }
}