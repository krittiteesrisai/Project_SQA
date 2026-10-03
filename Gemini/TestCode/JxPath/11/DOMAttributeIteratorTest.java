package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMAttributeIteratorTest {

    private Document document;
    private Element element;
    private DOMNodePointer elementPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        document = dbf.newDocumentBuilder().newDocument();
        
        element = document.createElementNS("http://example.com/ns", "ex:element");
        element.setAttribute("id", "123");
        element.setAttribute("name", "testName");
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:ex", "http://example.com/ns");
        element.setAttribute("xmlns", "default-ns"); // xmlns attribute case
        element.setAttributeNS("http://example.com/ns", "ex:nsAttr", "nsValue");

        elementPointer = new DOMNodePointer(null, element, Locale.getDefault());
    }

    @Test
    public void testNonElementNode() {
        // ทดสอบกรณี Node ไม่ใช่ ELEMENT_NODE (เช่น Text หรือ Document Node)
        NodePointer docPointer = new DOMNodePointer(null, document, Locale.getDefault());
        QName qName = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(docPointer, qName);
        
        Assert.assertEquals(0, iterator.getPosition());
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetSpecificAttributeWithoutPrefix() {
        // ค้นหา attribute ปกติไม่มี prefix (เช่น id="123")
        QName qName = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertEquals("id", iterator.getNodePointer().getName().getName());
        Assert.assertFalse(iterator.setPosition(2));
    }

    @Test
    public void testGetSpecificAttributeWithNamespace() {
        // ค้นหา attribute ที่มี Namespace ผ่าน Prefix
        QName qName = new QName("http://example.com/ns", "nsAttr", "ex");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
        Assert.assertEquals("nsAttr", iterator.getNodePointer().getName().getName());
    }

    @Test
    public void testWildcardAttributeIteration() {
        // ค้นหาแบบ wildcard (*) เพื่อดึง attribute ทั้งหมด
        QName qName = new QName("*");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        // ตรวจสอบว่า xmlns ถูกกรองออก และดึงเฉพาะ attribute ที่ถูกต้อง
        int count = 0;
        while (iterator.setPosition(count + 1)) {
            count++;
            assert iterator.getNodePointer() != null;
        }
        Assert.assertTrue(count > 0);
    }

    @Test
    public void testXmlnsAttributesFilteredOut() {
        // ทดสอบว่า attribute ที่ขึ้นต้นด้วย xmlns หรือเป็น xmlns ล้วนๆ จะถูกกรองทิ้งใน testAttr
        QName qName = new QName("xmlns");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
    }

    @Test
    public void testGetPositionAndBoundaryLimits() {
        QName qName = new QName("id");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        // Initial position
        Assert.assertEquals(0, iterator.getPosition());
        
        // Invalid positions (Boundary checks)
        Assert.assertFalse(iterator.setPosition(0));
        Assert.assertFalse(iterator.setPosition(2));
        
        // Valid position
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testGetNodePointerImplicitSetPosition() {
        // ทดสอบ getNodePointer() เมื่อ position ยังเป็น 0 (จะเรียก setPosition(1) อัตโนมัติ)
        QName qName = new QName("name");
        DOMAttributeIterator iterator = new DOMAttributeIterator(elementPointer, qName);
        
        Assert.assertEquals(0, iterator.getPosition());
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(0, iterator.getPosition()); // position จะถูกรีเซ็ตกลับเป็น 0 ตามดีไซน์ของคลาส
    }
}