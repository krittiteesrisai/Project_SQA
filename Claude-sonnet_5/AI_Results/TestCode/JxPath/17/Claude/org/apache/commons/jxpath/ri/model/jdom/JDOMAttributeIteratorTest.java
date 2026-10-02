package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
// import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (แม้อยู่ package เดียวกัน)
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.Text;
import org.junit.Test;

/**
 * JUnit4 test suite for {@link JDOMAttributeIterator}.
 *
 * หมายเหตุ: ใช้ {@link JDOMNodePointer} (concrete class ในแพ็กเกจเดียวกันของโปรเจค JXPath จริง)
 * เป็น parent NodePointer เนื่องจากไม่มีวิธีสร้าง NodePointer stub ได้โดยไม่เดา abstract methods
 * ของ NodePointer ซึ่งไม่ได้อยู่ในซอร์สที่ให้มา
 */
public class JDOMAttributeIteratorTest {

    /** สร้าง root NodePointer จาก JDOM node ใดๆ (Element/Text/...) */
    private NodePointer newParent(Object node) {
        return new JDOMNodePointer(node, Locale.getDefault());
    }

    // =========================================================
    // Constructor: parent.getNode() ไม่ใช่ Element -> attributes เป็น null
    // =========================================================
    @Test
    public void testConstructor_ParentNotElement_AttributesNullBehavior() {
        Text textNode = new Text("plain text");
        NodePointer parent = newParent(textNode);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "any"));

        assertEquals(0, it.getPosition());
        assertFalse("setPosition ต้อง false เพราะ attributes == null", it.setPosition(1));
        assertEquals("position ไม่ถูกเปลี่ยนเพราะ return ก่อน assign", 0, it.getPosition());
        assertNull("getNodePointer ต้อง null เมื่อไม่มี attributes", it.getNodePointer());
    }

    // =========================================================
    // Constructor: prefix == null, ชื่อเฉพาะเจาะจง, พบ attribute
    // =========================================================
    @Test
    public void testConstructor_PrefixNull_SpecificName_Found() {
        Element el = new Element("root");
        Attribute attr = new Attribute("foo", "bar");
        el.setAttribute(attr);
        NodePointer parent = newParent(el);

        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "foo"));

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));

        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        assertTrue(np instanceof JDOMAttributePointer);
        // อนุมาน: getNode() ของ JDOMAttributePointer คืน Attribute ที่ wrap ไว้
        assertSame(attr, np.getNode());
    }

    // =========================================================
    // Constructor: prefix == null, ชื่อเฉพาะเจาะจง, ไม่พบ attribute
    // =========================================================
    @Test
    public void testConstructor_PrefixNull_SpecificName_NotFound() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("other", "value"));
        NodePointer parent = newParent(el);

        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "missing"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // =========================================================
    // Constructor: prefix == null, wildcard "*" กรองตาม NO_NAMESPACE
    // =========================================================
    @Test
    public void testConstructor_PrefixNull_Wildcard_FiltersNamespace() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("a1", "v1")); // NO_NAMESPACE
        el.setAttribute(new Attribute("a2", "v2")); // NO_NAMESPACE
        Namespace customNs = Namespace.getNamespace("c", "http://custom/ns");
        el.setAttribute(new Attribute("a3", "v3", customNs)); // ต้องถูกคัดออก

        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue("ต้องมี 2 attribute ที่ NO_NAMESPACE (ทดสอบ loop + if true)", it.setPosition(2));
        assertFalse("ไม่ควรมี attribute ลำดับที่ 3 (ทดสอบ loop + if false)", it.setPosition(3));
    }

    // =========================================================
    // Constructor: wildcard แต่ element ไม่มี attribute เลย
    // =========================================================
    @Test
    public void testConstructor_PrefixNull_Wildcard_NoAttributes() {
        Element el = new Element("root");
        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // =========================================================
    // Constructor: prefix == "xml" (เฉพาะเจาะจง), พบ attribute
    // =========================================================
    @Test
    public void testConstructor_PrefixXml_SpecificName_Found() {
        Element el = new Element("root");
        Attribute attr = new Attribute("lang", "en", Namespace.XML_NAMESPACE);
        el.setAttribute(attr);
        NodePointer parent = newParent(el);

        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName("xml", "lang"));

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));
        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        assertSame(attr, np.getNode());
    }

    // =========================================================
    // Constructor: prefix == "xml" (เฉพาะเจาะจง), ไม่พบ attribute
    // =========================================================
    @Test
    public void testConstructor_PrefixXml_SpecificName_NotFound() {
        Element el = new Element("root");
        NodePointer parent = newParent(el);

        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName("xml", "lang"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // =========================================================
    // Constructor: prefix == "xml", wildcard "*"
    // =========================================================
    @Test
    public void testConstructor_PrefixXml_Wildcard() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("lang", "en", Namespace.XML_NAMESPACE));
        el.setAttribute(new Attribute("space", "preserve", Namespace.XML_NAMESPACE));
        el.setAttribute(new Attribute("other", "val")); // NO_NAMESPACE ต้องถูกคัดออก

        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName("xml", "*"));

        assertTrue(it.setPosition(2));
        assertFalse(it.setPosition(3));
    }

    // =========================================================
    // Constructor: prefix != null, != "xml", resolver คืน null -> EMPTY_LIST (TBD comment ในซอร์ส)
    // =========================================================
    @Test
    public void testConstructor_UnknownPrefix_ResolverReturnsNull_EmptyAttributes() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("foo", "bar"));
        NodePointer parent = newParent(el);

        // "unknownprefix" ไม่ได้ถูกประกาศไว้ที่ใดเลยในลำดับ ancestor -> คาดว่า getNamespaceURI คืน null
        JDOMAttributeIterator it =
            new JDOMAttributeIterator(parent, new QName("unknownprefix", "foo"));

        assertFalse(it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // =========================================================
    // Constructor: prefix != null resolved URI -> ns != null (เส้นทางปกติ)
    // ** อนุมาน behavior ของ namespace resolver ดังอธิบายไว้ด้านบนไฟล์ **
    // =========================================================
    @Test
    public void testConstructor_KnownPrefix_ResolverReturnsUri_SpecificName() {
        Element el = new Element("root");
        Namespace customNs = Namespace.getNamespace("p", "http://example.com/p");
        el.addNamespaceDeclaration(customNs);
        el.setAttribute(new Attribute("foo", "bar", customNs));

        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName("p", "foo"));

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));
    }

    // =========================================================
    // getNodePointer(): position เริ่มที่ 0 -> ถูก reset กลับเป็น 0 หลังเรียก (ตามซอร์ส)
    // =========================================================
    @Test
    public void testGetNodePointer_InitialPositionZero_ResetsToZeroAfterCall() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("a1", "v1"));
        el.setAttribute(new Attribute("a2", "v2"));

        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));

        assertEquals(0, it.getPosition());
        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        // ตามซอร์ส: เมื่อ position เริ่มที่ 0 หลัง setPosition(1) สำเร็จ จะถูก set กลับเป็น 0
        assertEquals(0, it.getPosition());
    }

    // =========================================================
    // getNodePointer(): position ถูกตั้งไว้ก่อน (>0) -> ไม่ reset, index = position-1
    // =========================================================
    @Test
    public void testGetNodePointer_PositionAlreadySet_IndexNotReset() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("a1", "v1"));
        Attribute attr2 = new Attribute("a2", "v2");
        el.setAttribute(attr2);

        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));

        assertTrue(it.setPosition(2));
        assertEquals(2, it.getPosition());

        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        // position ไม่ถูกแก้ไขเพราะ position != 0 ตอนเข้าเงื่อนไข if (position == 0)
        assertEquals(2, it.getPosition());
        assertSame(attr2, np.getNode());
    }

    // =========================================================
    // setPosition: ค่าขอบเขต (boundary)
    // =========================================================
    @Test
    public void testSetPosition_Boundaries() {
        Element el = new Element("root");
        el.setAttribute(new Attribute("a1", "v1"));
        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));

        assertFalse(it.setPosition(0));
        assertEquals(0, it.getPosition());

        assertTrue("boundary บน = size()", it.setPosition(1));
        assertEquals(1, it.getPosition());

        assertFalse("เกิน size()", it.setPosition(2));
        // field position ยังถูกเซ็ตเป็นค่าที่ขอแม้ outcome เป็น false (เพราะ assign ก่อน check range)
        assertEquals(2, it.getPosition());

        assertFalse(it.setPosition(-1));
        assertEquals(-1, it.getPosition());
    }

    // =========================================================
    // setPosition: attributes == null -> ค่า position ไม่เปลี่ยน (return ก่อน assign)
    // =========================================================
    @Test
    public void testSetPosition_AttributesNull_PositionUnchanged() {
        Text textNode = new Text("x");
        NodePointer parent = newParent(textNode);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "foo"));

        assertEquals(0, it.getPosition());
        assertFalse(it.setPosition(5));
        assertEquals(0, it.getPosition());
    }

    // =========================================================
    // getPosition: ค่าเริ่มต้นต้องเป็น 0
    // =========================================================
    @Test
    public void testGetPosition_InitialValue() {
        Element el = new Element("root");
        NodePointer parent = newParent(el);
        JDOMAttributeIterator it = new JDOMAttributeIterator(parent, new QName(null, "*"));
        assertEquals(0, it.getPosition());
    }
}
