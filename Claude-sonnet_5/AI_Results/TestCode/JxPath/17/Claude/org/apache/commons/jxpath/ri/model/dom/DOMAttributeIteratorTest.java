package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * JUnit 4 tests for {@link DOMAttributeIterator} (Defects4J: JXPath-17b).
 *
 * ดูหมายเหตุ/สมมติฐานด้านบนไฟล์คำตอบ (เกี่ยวกับ DOMNodePointer, QName, NamespaceResolver)
 */
public class DOMAttributeIteratorTest {

    // ---------- helpers ----------

    private Element parseElement(String xml, boolean namespaceAware) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(namespaceAware);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        return doc.getDocumentElement();
    }

    private Element parseElement(String xml) throws Exception {
        return parseElement(xml, true);
    }

    private NodePointer pointerFor(Node node) {
        // สมมติฐาน (1): DOMNodePointer(Node, Locale) เป็น public constructor ที่ใช้งานได้จริง
        return new DOMNodePointer(node, Locale.getDefault());
    }

    // ---------- Constructor: node ไม่ใช่ ELEMENT_NODE ----------

    @Test
    public void testConstructor_NonElementNode_AttributesEmpty() throws Exception {
        Element root = parseElement("<root a='1'/>");
        Node textNode = root.getOwnerDocument().createTextNode("hello");
        NodePointer parent = pointerFor(textNode);
        QName name = new QName(null, "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertFalse("node ไม่ใช่ ELEMENT_NODE จึงไม่มี attribute ใด ๆ", it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // ---------- Constructor: wildcard "*" ----------

    @Test
    public void testConstructor_WildcardName_NoAttributes() throws Exception {
        Element elem = parseElement("<root/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertFalse(it.setPosition(1)); // for-loop วนศูนย์รอบ (count = 0)
        assertNull(it.getNodePointer());
    }

    @Test
    public void testConstructor_WildcardName_SingleAttributeIncluded() throws Exception {
        Element elem = parseElement("<root a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));

        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        Object node = np.getNode();
        assertTrue(node instanceof Attr);
        assertEquals("a", ((Attr) node).getName());
    }

    @Test
    public void testConstructor_WildcardName_ExcludesXmlnsPrefixedAttr() throws Exception {
        Element elem = parseElement("<root xmlns:ns='http://ns' ns:a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        // คาดว่าเหลือเฉพาะ ns:a; xmlns:ns ถูกกรองออกตาม testAttr():
        // nodePrefix != null && nodePrefix.equals("xmlns") -> false
        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testConstructor_WildcardName_ExcludesDefaultXmlnsAttr() throws Exception {
        Element elem = parseElement("<root xmlns='http://default' a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        // คาดว่าเหลือเฉพาะ a; xmlns ถูกกรองออกตาม testAttr():
        // nodePrefix == null && nodeLocalName.equals("xmlns") -> false
        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testConstructor_WildcardName_SamePrefixMatches_NoNamespaceResolutionNeeded() throws Exception {
        // equalStrings(testPrefix, nodePrefix) == true โดยตรง (short-circuit ก่อนเรียก getNamespaceURI)
        Element elem = parseElement("<root xmlns:ns='http://ns' ns:a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName("ns", "a");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testConstructor_WildcardName_DifferentPrefixSameNamespace_Matches() throws Exception {
        // สมมติฐาน (3): parent.getNamespaceURI(prefix) resolve ผ่าน xmlns:* บน element เดียวกันได้
        Element elem = parseElement(
                "<root xmlns:ns1='http://same' xmlns:ns2='http://same' ns1:a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName("ns2", "*"); // prefix ต่างกัน (ns2 vs ns1) แต่ URI เดียวกัน

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue("ns1:a ควร match เพราะ namespace URI เดียวกันกับ ns2", it.setPosition(1));
        assertFalse(it.setPosition(2));
    }

    @Test
    public void testConstructor_WildcardName_DifferentPrefixDifferentNamespace_NoMatch() throws Exception {
        Element elem = parseElement(
                "<root xmlns:ns1='http://uri1' xmlns:ns2='http://uri2' ns1:a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName("ns2", "*");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertFalse("namespace URI ต่างกัน ไม่ควร match", it.setPosition(1));
        assertNull(it.getNodePointer());
    }

    // ---------- Constructor: specific name (ไม่ใช่ "*") -> getAttribute() ----------

    @Test
    public void testConstructor_SpecificName_Found() throws Exception {
        Element elem = parseElement("<root a='1' b='2'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "a");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue(it.setPosition(1));
        assertFalse(it.setPosition(2));

        NodePointer np = it.getNodePointer();
        Attr attr = (Attr) np.getNode();
        assertEquals("a", attr.getName());
        assertEquals("1", attr.getValue());
    }

    @Test
    public void testConstructor_SpecificName_NotFound() throws Exception {
        Element elem = parseElement("<root a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "missing");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertFalse(it.setPosition(1)); // attr == null -> ไม่ถูกเพิ่มเข้า list
        assertNull(it.getNodePointer());
    }

    @Test
    public void testGetAttribute_WithNamespace_FoundDirectlyViaNS() throws Exception {
        // testPrefix != null -> testNS != null -> getAttributeNodeNS พบ attr โดยตรง
        Element elem = parseElement("<root xmlns:ns='http://ns' ns:a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName("ns", "a");

        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue(it.setPosition(1));
        NodePointer np = it.getNodePointer();
        Attr attr = (Attr) np.getNode();
        assertEquals("a", attr.getLocalName());
    }

    // ---------- getNodePointer() ----------

    @Test
    public void testGetNodePointer_InitialPositionZero_NonEmpty_ResetsPositionToZero() throws Exception {
        Element elem = parseElement("<root a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "a");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertEquals(0, it.getPosition());
        NodePointer np = it.getNodePointer();
        assertNotNull(np);
        // ตามซอร์ส: setPosition(1) ถูกเรียกภายใน แล้ว position ถูกรีเซ็ตกลับเป็น 0
        assertEquals(0, it.getPosition());
    }

    @Test
    public void testGetNodePointer_EmptyAttributes_ReturnsNull() throws Exception {
        Element elem = parseElement("<root/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "missing");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        // position == 0 -> setPosition(1) คืน false (attributes.size() == 0) -> return null
        assertNull(it.getNodePointer());
    }

    @Test
    public void testGetNodePointer_AfterExplicitSetPosition_NoClampNeeded() throws Exception {
        Element elem = parseElement("<root a='1' b='2'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertTrue(it.setPosition(2));
        NodePointer np = it.getNodePointer(); // position != 0, index = 1 (ไม่ถูก clamp)
        assertNotNull(np);
        assertEquals(2, it.getPosition());
    }

    @Test
    public void testGetNodePointer_NegativePosition_IndexClampedToZero() throws Exception {
        Element elem = parseElement("<root a='1' b='2'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        it.setPosition(-5); // position != 0 (จึงข้าม branch position==0) แต่เป็นค่า invalid
        NodePointer np = it.getNodePointer();
        // index = position - 1 = -6 -> index < 0 -> clamp เป็น 0 -> คืน attribute แรก
        assertNotNull(np);
    }

    // ---------- setPosition()/getPosition() ----------

    @Test
    public void testSetPosition_Boundaries() throws Exception {
        Element elem = parseElement("<root a='1' b='2'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "*");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertFalse(it.setPosition(0));
        assertTrue(it.setPosition(1));
        assertTrue(it.setPosition(2));
        assertFalse(it.setPosition(3));
        assertFalse(it.setPosition(-1));
    }

    @Test
    public void testGetPosition_ReflectsLastSetPositionValue() throws Exception {
        Element elem = parseElement("<root a='1'/>");
        NodePointer parent = pointerFor(elem);
        QName name = new QName(null, "a");
        DOMAttributeIterator it = new DOMAttributeIterator(parent, name);

        assertEquals(0, it.getPosition());
        it.setPosition(1);
        assertEquals(1, it.getPosition());
        it.setPosition(99);
        // getPosition() คืนค่า field ตรง ๆ โดยไม่ตรวจสอบขอบเขตแม้ setPosition(99) จะคืน false
        assertEquals(99, it.getPosition());
    }
}
