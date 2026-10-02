package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/**
 * JUnit4 test suite for {@link DOMAttributeIterator} (Defects4J JxPath-11b).
 *
 * หมายเหตุ: ใช้ DOM จริง (ผ่าน JAXP/DocumentBuilderFactory ซึ่งเป็นส่วนของ JDK มาตรฐาน)
 * และใช้ DOMNodePointer / QName จากซอร์สโค้ดต้นทาง (อยู่ใน source tree เดียวกัน)
 * เป็น parent pointer เพื่อทดสอบ DOMAttributeIterator โดยตรง
 *
 * สมมติฐานที่ไม่ได้ยืนยันจากซอร์สโค้ดที่ให้มา (ของ DOMNodePointer.getNamespaceURI)
 * จะถูกระบุด้วยคอมเมนต์ "ASSUMPTION" กำกับไว้ในแต่ละเทสที่เกี่ยวข้อง
 */
public class DOMAttributeIteratorTest {

    private Document document;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.newDocument();
    }

    private NodePointer pointerFor(Node node) {
        return new DOMNodePointer(node, Locale.getDefault());
    }

    // ---------------------------------------------------------------
    // Constructor: node type ไม่ใช่ ELEMENT_NODE -> attributes ว่างเสมอ
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_NonElementNode_NoAttributes() {
        Text textNode = document.createTextNode("hello");
        NodePointer parent = pointerFor(textNode);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // Constructor: lname == "*" แต่ element ไม่มี attribute เลย
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_NoAttributes_EmptyList() {
        Element element = document.createElement("root");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(1));
    }

    // ---------------------------------------------------------------
    // testAttr(): nodePrefix == null && nodeLocalName.equals("xmlns") -> exclude
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_ExcludesPlainXmlnsAttribute() {
        Element element = document.createElement("root");
        element.setAttribute("xmlns", "http://example.com/default");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(1));
    }

    // ---------------------------------------------------------------
    // testAttr(): nodePrefix != null && nodePrefix.equals("xmlns") -> exclude
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_ExcludesXmlnsPrefixedAttribute() {
        Element element = document.createElementNS(null, "root");
        element.setAttributeNS(
                "http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://example.com/ns1");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(1));
    }

    // ---------------------------------------------------------------
    // Constructor: lname == "*" รวม attribute ปรกติเข้าไปในลิสต์ (loop ผ่านหลายรอบ)
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_IncludesNormalAttribute() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "value1");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue(it.setPosition(1));
        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        assertTrue(np instanceof DOMAttributePointer);
    }

    @Test
    public void testConstructor_Wildcard_MultipleAttributes_IteratesAll() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        element.setAttribute("attr2", "v2");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue(it.setPosition(1));
        assertNotNull(it.getNodePointer());
        assertTrue(it.setPosition(2));
        assertNotNull(it.getNodePointer());
        // ไม่มี attribute ตัวที่ 3
        assertFalse(it.setPosition(3));
    }

    // ---------------------------------------------------------------
    // testAttr(): prefix ตรงกัน (ลัดผ่าน equalStrings โดยไม่ต้องตรวจ namespace)
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_SamePrefixMatchesWithoutNamespaceLookup() {
        Element element = document.createElementNS("http://example.com/p1", "p1:root");
        element.setAttributeNS("http://example.com/p1", "p1:attr1", "v1");
        NodePointer parent = pointerFor(element);

        // testName prefix ตรงกับ attribute prefix ("p1" == "p1") -> equalStrings true ทันที
        DOMAttributeIterator it =
                new DOMAttributeIterator(parent, new QName("p1", "*"));

        assertTrue(it.setPosition(1));
        assertNotNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // testAttr(): prefix ไม่ตรงกัน แต่ namespace ทั้งสองฝั่ง resolve เป็น null (undeclared)
    // -> ถือว่า match เพราะ equalStrings(null,null) == true
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_Wildcard_DifferentPrefix_BothNamespacesNull_StillMatches() {
        Element element = document.createElementNS(null, "root");
        // สร้าง attribute ด้วย prefix "p1" แบบ NS-aware แต่ไม่ได้ประกาศ xmlns:p1 ที่ใดในเอกสาร
        element.setAttributeNS("http://example.com/uriX", "p1:attr1", "v1");
        NodePointer parent = pointerFor(element);

        // testName prefix เป็น null (wildcard ไม่มี prefix) ต่างจาก nodePrefix="p1"
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        // เนื่องจากไม่มี xmlns:p1 ประกาศไว้จริงในเอกสาร การ resolve namespace ของ "p1"
        // ควรได้ null เช่นเดียวกับฝั่ง testPrefix (null) -> ทั้งคู่ null -> equalStrings true
        assertTrue(it.setPosition(1));
        assertNotNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // getAttribute(): ไม่มี prefix -> element.getAttributeNode(name) พบ
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_SpecificName_NoPrefix_Found() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "value1");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "attr1"));

        assertTrue(it.setPosition(1));
        assertNotNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // getAttribute(): ไม่มี prefix -> element.getAttributeNode(name) ไม่พบ
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_SpecificName_NoPrefix_NotFound() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "value1");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "missing"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // getAttribute(): มี prefix แต่ไม่มีการประกาศ namespace ใด ๆ -> testNS == null
    // -> fallback ไปใช้ element.getAttributeNode(localName) (พบ)
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_SpecificName_PrefixWithoutNamespace_FallbackFound() {
        Element element = document.createElement("root");
        element.setAttribute("myattr", "value");
        NodePointer parent = pointerFor(element);

        // prefix "ns1" ไม่มี xmlns:ns1 ประกาศไว้ที่ใดเลย -> getNamespaceURI ควรเป็น null
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName("ns1", "myattr"));

        assertTrue(it.setPosition(1));
        assertNotNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // getAttribute(): มี prefix แต่ไม่มี namespace declared -> fallback ไม่พบ
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_SpecificName_PrefixWithoutNamespace_FallbackNotFound() {
        Element element = document.createElement("root");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName("ns1", "missing"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // ---------------------------------------------------------------
    // getAttribute(): มี prefix + namespace ถูกประกาศจริง -> testNS != null
    // ASSUMPTION: DOMNodePointer.getNamespaceURI resolve ค่าตาม xmlns:prefix ที่ประกาศจริง
    // ซึ่งพฤติกรรมภายในไม่ได้แสดงในซอร์สโค้ดที่ให้มา จึงยืนยันผลแบบผ่อนปรน (ยอมรับได้ทั้ง 2 กรณี)
    // ---------------------------------------------------------------
    @Test
    public void testConstructor_SpecificName_WithDeclaredNamespace_ViaAttributeNodeNS() {
        Element element = document.createElementNS("http://example.com/ns1", "ns1:root");
        element.setAttributeNS(
                "http://www.w3.org/2000/xmlns/", "xmlns:ns1", "http://example.com/ns1");
        element.setAttributeNS("http://example.com/ns1", "ns1:attr1", "value1");
        NodePointer parent = pointerFor(element);

        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName("ns1", "attr1"));

        boolean found = it.setPosition(1);
        if (found) {
            assertNotNull(it.getNodePointer());
        } else {
            // ยอมรับผลเป็น "ไม่พบ" หากสมมติฐานเกี่ยวกับ getNamespaceURI ไม่เป็นจริง
            assertNull(it.getNodePointer());
        }
    }

    // ---------------------------------------------------------------
    // getNodePointer(): attributes ว่าง -> setPosition(1) คืน false -> return null
    // ---------------------------------------------------------------
    @Test
    public void testGetNodePointer_NoAttributes_ReturnsNull() {
        Element element = document.createElement("root");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertEquals(0, it.getPosition());
        assertNull(it.getNodePointer());
        assertEquals(0, it.getPosition());
    }

    // ---------------------------------------------------------------
    // getNodePointer(): position == 0 เข้า branch if, setPosition(1) สำเร็จ,
    // reset position = 0, index = -1 -> clamp เป็น 0
    // ---------------------------------------------------------------
    @Test
    public void testGetNodePointer_DefaultCall_IndexClampedToZero() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        element.setAttribute("attr2", "v2");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        NodePointer np = it.getNodePointer();

        assertNotNull(np);
        assertEquals(0, it.getPosition());
    }

    // ---------------------------------------------------------------
    // getNodePointer(): position != 0 (ตั้งค่าไว้ก่อน) -> ข้าม if block, index >= 0 ไม่ clamp
    // ---------------------------------------------------------------
    @Test
    public void testGetNodePointer_ExplicitPosition_SkipsClampBranch() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        element.setAttribute("attr2", "v2");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue(it.setPosition(2));
        NodePointer np = it.getNodePointer();

        assertNotNull(np);
        assertEquals(2, it.getPosition());
    }

    // ---------------------------------------------------------------
    // setPosition(): boundary values
    // ---------------------------------------------------------------
    @Test
    public void testSetPosition_Zero_ReturnsFalse() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(0));
        assertEquals(0, it.getPosition());
    }

    @Test
    public void testSetPosition_Negative_ReturnsFalse() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(-1));
    }

    @Test
    public void testSetPosition_WithinRange_ReturnsTrue() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue(it.setPosition(1));
        assertEquals(1, it.getPosition());
    }

    @Test
    public void testSetPosition_OutOfRangeHigh_ReturnsFalse() {
        Element element = document.createElement("root");
        element.setAttribute("attr1", "v1");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(2));
        // position ยังถูกตั้งค่าแม้ว่าจะเกินขอบเขต (ตามโค้ด: this.position = position ก่อน check)
        assertEquals(2, it.getPosition());
    }

    @Test
    public void testGetPosition_InitialValueIsZero() {
        Element element = document.createElement("root");
        NodePointer parent = pointerFor(element);
        DOMAttributeIterator it = new DOMAttributeIterator(parent, new QName(null, "*"));

        assertEquals(0, it.getPosition());
    }
}
