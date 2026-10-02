package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.Text;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link JDOMAttributeIterator}
 * (Defects4J JxPath-11b)
 *
 * หมายเหตุ: ใช้ {@link JDOMNodePointer} เป็น parent NodePointer จริง
 * (สมมติฐาน constructor ตามที่อธิบายไว้ด้านบนไฟล์)
 */
public class JDOMAttributeIteratorTest {

    // ---------- Helper ----------
    private NodePointer wrap(Object node) {
        return new JDOMNodePointer(node, Locale.getDefault());
    }

    // =====================================================================
    // Constructor branch: parent.getNode() NOT instanceof Element  (C2)
    // => attributes field stays null
    // => setPosition() -> attributes==null branch (S1)
    // => getNodePointer(): position==0(G1) -> !setPosition(1) true(G3) -> null
    // =====================================================================
    @Test
    public void testConstructor_NodeNotElement_AttributesStaysNull() {
        NodePointer parent = wrap(new Text("not-an-element"));
        QName name = new QName(null, "whatever");

        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertFalse("attributes==null -> setPosition must return false",
                iter.setPosition(1));
        assertNull("getNodePointer must be null when attributes==null",
                iter.getNodePointer());
        // ตาม source, setPosition ยัง set this.position แม้ attributes==null จะ return ก่อน
        // ดังนั้น getPosition ต้องเป็น 0 เพราะ return เกิดก่อนการ set
        assertEquals(0, iter.getPosition());
    }

    // =====================================================================
    // Constructor: prefix==null -> ns=NO_NAMESPACE (C4)
    // lname != "*" -> specific attribute branch (C9), attr found (C12)
    // getNodePointer: G1,true-> setPosition(1) success(G4)-> position reset 0
    //                 index = -1 -> index<0 true (G5) -> index=0
    // =====================================================================
    @Test
    public void testSpecificAttribute_NoNamespace_Found() {
        Element element = new Element("root");
        element.setAttribute("attr1", "value1"); // NO_NAMESPACE
        QName name = new QName(null, "attr1");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iter.getPosition());
        NodePointer np = iter.getNodePointer();
        assertNotNull(np);
        assertEquals("attr1", ((Attribute) np.getNode()).getName());
        // getNodePointer ต้อง "peek" โดยไม่เปลี่ยน position ถาวร
        assertEquals(0, iter.getPosition());
    }

    // =====================================================================
    // Constructor: lname != "*" แต่ attribute ไม่พบ (C13)
    // => attributes = empty ArrayList (ไม่ null แต่ size 0)
    // getNodePointer: setPosition(1) fail เพราะ size 0 (G3) -> null
    // setPosition: attributes!=null (S2) แต่ compound เป็น false (S4)
    // =====================================================================
    @Test
    public void testSpecificAttribute_NoNamespace_NotFound() {
        Element element = new Element("root"); // ไม่มี attribute เลย
        QName name = new QName(null, "missingAttr");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertNull(iter.getNodePointer());
        assertFalse(iter.setPosition(1));
        assertFalse(iter.setPosition(0));
    }

    // =====================================================================
    // Constructor: prefix != null, != "xml", element.getNamespace(prefix)==null (C7)
    // => early return, attributes = Collections.EMPTY_LIST
    // =====================================================================
    @Test
    public void testPrefix_UnknownNamespace_EarlyReturnEmptyList() {
        Element element = new Element("root");
        element.setAttribute("attr1", "value1");
        QName name = new QName("undeclaredPrefix", "attr1");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertNull(iter.getNodePointer());
        // attributes เป็น EMPTY_LIST (ไม่ null) ขนาด 0 -> compound false
        assertFalse(iter.setPosition(1));
    }

    // =====================================================================
    // Constructor: prefix.equals("xml") == true (C5), lname != "*" , attr found
    // =====================================================================
    @Test
    public void testPrefixXml_SpecificAttribute_Found() {
        Element element = new Element("root");
        Attribute xmlAttr = new Attribute("lang", "en", Namespace.XML_NAMESPACE);
        element.setAttribute(xmlAttr);
        QName name = new QName("xml", "lang");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        NodePointer np = iter.getNodePointer();
        assertNotNull(np);
        assertEquals("lang", ((Attribute) np.getNode()).getName());
    }

    // =====================================================================
    // Constructor: lname.equals("*") true (C10), loop หลาย iteration (C15)
    // บาง attribute match ns (C16), บาง attribute ไม่ match (C17)
    // prefix==null -> ns = NO_NAMESPACE
    // =====================================================================
    @Test
    public void testWildcard_NoNamespace_MixedAttributes() {
        Element element = new Element("root");
        Namespace customNs = Namespace.getNamespace("cust", "http://example.com/custom");
        element.addNamespaceDeclaration(customNs);

        element.setAttribute("a1", "v1"); // NO_NAMESPACE -> match
        Attribute a2 = new Attribute("a2", "v2", customNs); // custom NS -> ไม่ match
        element.setAttribute(a2);

        QName name = new QName(null, "*");
        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        // ควรเหลือ attribute เดียว (a1) เท่านั้น
        assertTrue(iter.setPosition(1));
        assertFalse(iter.setPosition(2)); // boundary: size==1
    }

    // =====================================================================
    // Constructor: prefix != null, != "xml", element.getNamespace(prefix)!=null (C8)
    // lname=="*" (C10) -> loop match เฉพาะ attribute ที่ namespace เท่ากับ ns
    // =====================================================================
    @Test
    public void testWildcard_WithPrefixNamespace_Found() {
        Element element = new Element("root");
        Namespace customNs = Namespace.getNamespace("cust", "http://example.com/custom");
        element.addNamespaceDeclaration(customNs);

        Attribute a1 = new Attribute("a1", "v1", customNs); // match
        element.setAttribute(a1);
        element.setAttribute("a2", "v2"); // NO_NAMESPACE -> ไม่ match

        QName name = new QName("cust", "*");
        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        NodePointer np = iter.getNodePointer();
        assertNotNull(np);
        assertEquals("a1", ((Attribute) np.getNode()).getName());
        assertFalse(iter.setPosition(2)); // size==1
    }

    // =====================================================================
    // Constructor: lname=="*" , allAttributes.size()==0 -> loop 0 iteration (C14)
    // =====================================================================
    @Test
    public void testWildcard_EmptyElement_ZeroIterationLoop() {
        Element element = new Element("root"); // ไม่มี attribute เลย
        QName name = new QName(null, "*");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertNull(iter.getNodePointer());
        assertFalse(iter.setPosition(1));
    }

    // =====================================================================
    // setPosition(): boundary values บน attributes ที่มี 2 ตัว
    // S3 (true), S4 (false จากทั้งสองด้านของ &&)
    // =====================================================================
    @Test
    public void testSetPosition_BoundaryValues() {
        Element element = new Element("root");
        element.setAttribute("a1", "v1");
        Attribute a2 = new Attribute("a2", "v2",
                Namespace.getNamespace("cust", "http://example.com/custom"));
        element.addNamespaceDeclaration(a2.getNamespace());
        element.setAttribute(a2);

        // ใช้ wildcard+NO_NAMESPACE เพื่อ list เฉพาะ a1 เพียงตัวเดียวไม่พอสำหรับ boundary 2 ตัว
        // จึงทำ 2 attribute ที่ NO_NAMESPACE ทั้งคู่
        Element element2 = new Element("root2");
        element2.setAttribute("x1", "v1");
        element2.setAttribute("x2", "v2");
        QName name = new QName(null, "*");

        NodePointer parent = wrap(element2);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertFalse("position 0 ต้อง fail (0>=1 false)", iter.setPosition(0));
        assertTrue("position 1 ต้อง pass", iter.setPosition(1));
        assertTrue("position 2 (==size) ต้อง pass", iter.setPosition(2));
        assertFalse("position 3 (>size) ต้อง fail", iter.setPosition(3));
        assertEquals(3, iter.getPosition()); // ยืนยันว่า position ถูก set แม้ผลลัพธ์ false
    }

    // =====================================================================
    // getNodePointer(): position != 0 ก่อนเรียก (G2) ไม่ reset, index>=0 (G6)
    // =====================================================================
    @Test
    public void testGetNodePointer_PositionAlreadySet_NoReset() {
        Element element = new Element("root");
        element.setAttribute("x1", "v1");
        element.setAttribute("x2", "v2");
        QName name = new QName(null, "*");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertTrue(iter.setPosition(2));
        NodePointer np = iter.getNodePointer();
        assertNotNull(np);
        // position ต้องไม่ถูก reset เพราะ branch G2 (position!=0) ไม่เข้า if
        assertEquals(2, iter.getPosition());
        assertEquals("x2", ((Attribute) np.getNode()).getName());
    }

    // =====================================================================
    // Corner case ที่ค้นพบจากการอ่าน source โดยตรง (ไม่ใช่การเดา):
    // setPosition(negative) คืนค่า false แต่ field position ถูก set เป็นค่าลบจริง
    // เมื่อเรียก getNodePointer() ภายหลัง -> position!=0 (G2)
    // -> index = position-1 < 0 -> index ถูก reset เป็น 0 (G5)
    // -> คืนค่า attributes.get(0) ทั้งที่ position ไม่ valid
    // เทสนี้ยืนยัน behavior ตามโค้ดจริง (อาจเป็นจุดที่ fault-prone)
    // =====================================================================
    @Test
    public void testGetNodePointer_NegativePosition_IndexClampedToZero() {
        Element element = new Element("root");
        element.setAttribute("x1", "v1");
        element.setAttribute("x2", "v2");
        QName name = new QName(null, "*");

        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertFalse(iter.setPosition(-1)); // invalid, แต่ field ถูก set เป็น -1 จริง
        assertEquals(-1, iter.getPosition());

        NodePointer np = iter.getNodePointer();
        assertNotNull(np);
        // index = -1-1 = -2 -> clamp เป็น 0 -> คืน attributes.get(0)
        assertEquals("x1", ((Attribute) np.getNode()).getName());
    }

    // =====================================================================
    // getPosition() เบื้องต้น: ค่าเริ่มต้นต้องเป็น 0 ก่อนมีการเรียก setPosition ใดๆ
    // =====================================================================
    @Test
    public void testGetPosition_InitialValueIsZero() {
        Element element = new Element("root");
        QName name = new QName(null, "*");
        NodePointer parent = wrap(element);
        JDOMAttributeIterator iter = new JDOMAttributeIterator(parent, name);

        assertEquals(0, iter.getPosition());
    }
}
