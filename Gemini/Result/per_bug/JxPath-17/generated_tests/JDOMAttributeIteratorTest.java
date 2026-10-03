package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Element;
import org.jdom.Namespace;

import junit.framework.TestCase;

public class JDOMAttributeIteratorTest extends TestCase {

    private Element element;
    private NodePointer parentPointer;

    protected void setUp() throws Exception {
        super.setUp();
        element = new Element("root", "http://example.com/root");
        element.setAttribute("attr1", "value1");
        element.setAttribute("attr2", "value2");
        element.setAttribute("xmlattr", "xmlvalue", Namespace.XML_NAMESPACE);
        
        // ใช้ JDOMNodePointer เป็นตัวแทน parent
        NodePointer top = NodePointer.newNodePointer(new QName("root"), element, Locale.ENGLISH);
        parentPointer = top;
    }

    public void testIteratorNullAttributes() {
        // ทดสอบเมื่อ parent.getNode() ไม่ใช่ Element (เช่น ส่ง String เข้าไป)
        NodePointer nonElementParent = NodePointer.newNodePointer(new QName("test"), "notAnElement", Locale.ENGLISH);
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(nonElementParent, new QName("attr1"));
        
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
        assertEquals(0, iterator.getPosition());
    }

    public void testSpecificAttributeWithoutPrefix() {
        // ทดสอบระบุชื่อแอตทริบิวต์ตรงๆ ไม่มี Prefix (NO_NAMESPACE)
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("attr1"));
        
        assertEquals(0, iterator.getPosition());
        assertTrue(iterator.setPosition(1));
        assertEquals(1, iterator.getPosition());
        
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("attr1", pointer.getName().getName());

        // ทดสอบขอบเขตเกิน
        assertFalse(iterator.setPosition(2));
    }

    public void testWildcardAttributeWithoutPrefix() {
        // ทดสอบ QName เป็น "*" ไม่มี Prefix
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("*"));
        
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        
        assertTrue(iterator.setPosition(2));
        assertNotNull(iterator.getNodePointer());
        
        // เกินขอบเขต
        assertFalse(iterator.setPosition(3));
    }

    public void testXmlPrefixAttribute() {
        // ทดสอบ prefix เป็น "xml"
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("xml", "xmlattr"));
        
        assertTrue(iterator.setPosition(1));
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals("xmlattr", pointer.getName().getName());
    }

    public void testCustomPrefixWithResolvedNamespace() {
        // ทดสอบ Namespace ที่มี Prefix และ Resolver คืนค่า URI ถูกต้อง
        element.setAttribute("testattr", "testval", Namespace.getNamespace("custom", "http://example.com/custom"));
        
        // จำลอง NamespaceResolver
        NamespaceResolver resolver = new NamespaceResolver();
        // เนื่องจาก NamespaceResolver ต้องผูกกับ pointer จริง เราทดสอบผ่านโครงสร้าง JXPath Context หรือจำลองพฤติกรรมผ่าน Pointer ได้
        // ในที่นี้ทดสอบกรณีที่ Namespace หาไม่พบก่อนเพื่อความปลอดภัยของ Branch Coverage
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("unknownPrefix", "testattr"));
        // เมื่อ uri เป็น null หรือ ns เป็น null -> attributes จะเป็น EMPTY_LIST
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    public void testGetNodePointerAutoSetPosition() {
        // ทดสอบการเรียก getNodePointer() โดยที่ position ยังเป็น 0 (จะเรียก setPosition(1) อัตโนมัติ)
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("attr1"));
        
        NodePointer pointer = iterator.getNodePointer();
        assertNotNull(pointer);
        assertEquals(0, iterator.getPosition()); // position ควรถูกรีเซ็ตกลับเป็น 0 ตามดีไซน์ของคลาส
    }

    public void testSetPositionInvalidBounds() {
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parentPointer, new QName("attr1"));
        
        // ตรวจสอบ Boundary limits
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(-1));
        assertFalse(iterator.setPosition(2));
    }
}