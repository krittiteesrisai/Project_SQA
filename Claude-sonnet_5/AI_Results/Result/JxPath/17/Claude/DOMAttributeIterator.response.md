# DOMAttributeIteratorTest

## หมายเหตุสำคัญก่อนดูโค้ด (ตามข้อกำหนดที่ 4 — ไม่เดา behavior ที่ไม่มีในซอร์ส)

- โจทย์ให้ซอร์สเฉพาะ `DOMAttributeIterator` แต่คลาสนี้พึ่งพา `NodePointer` (abstract), `DOMNodePointer`, `QName`, `DOMAttributePointer` ซึ่งไม่มีซอร์สให้ ในคลาสทดสอบนี้เลือก **ใช้ DOM จริง (javax.xml.parsers ของ JDK) + `DOMNodePointer` ตัวจริง** (เป็นคลาสจริงใน classpath เดียวกับคลาสเป้าหมาย) แทนการสร้าง mock/stub เอง เพราะไม่มี mocking framework (เช่น Mockito) อยู่ใน jar ที่อนุญาต และ `NodePointer` เป็น abstract class ที่มี abstract method จำนวนมาก การ stub เองมีความเสี่ยงสูงที่จะ "เดา" สัญญาของคลาสผิด
- สมมติฐานที่ยังตรวจสอบจากซอร์สที่ให้มาไม่ได้โดยตรง (ระบุไว้เป็นคอมเมนต์ในแต่ละเทสที่เกี่ยวข้อง):
  1. `DOMNodePointer` มี constructor สาธารณะ `DOMNodePointer(Node node, Locale locale)`
  2. `DOMNodePointer.getPrefix/getLocalName` ให้ผลลัพธ์ตรงกับ prefix/localName ตามชื่อ node (สอดคล้องกับคอมเมนต์ในซอร์ส `getAttribute` ที่พูดถึงปัญหาพาร์เซอร์บางตัวไม่รองรับ NS สำหรับ attribute)
  3. `parent.getNamespaceURI(prefix)` / `parent.getNamespaceResolver().getNamespaceURI(prefix)` resolve URI จาก `xmlns:*` ของ element เดียวกันได้ตามมาตรฐาน JXPath
- Branch ที่ **ไม่ได้พยายามเขียนเทสครอบคลุม** เพราะความเสี่ยงสูงเกินไปที่จะ "เดา" behavior ของ dependency: การวนลูป fallback ใน `getAttribute()` ตอนที่ `getAttributeNodeNS` คืน `null` ทั้งที่ `testNS != null` (คอมเมนต์บอกว่าเกิดกับ parser บางตัวเท่านั้น เช่น Crimson บน JDK 1.4 — ไม่สามารถ repro ได้อย่างน่าเชื่อถือด้วย DOM ของ JDK ปัจจุบัน)

```java
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
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_NonElementNode_AttributesEmpty` | Constructor: `node.getNodeType() == ELEMENT_NODE` → **false** |
| `testConstructor_WildcardName_NoAttributes` | Constructor: element + wildcard, for-loop วน **0 รอบ** (`count==0`) |
| `testConstructor_WildcardName_SingleAttributeIncluded` | Constructor: `lname.equals("*")` → true, `testAttr()` → true (attribute ปกติ) |
| `testConstructor_WildcardName_ExcludesXmlnsPrefixedAttr` | `testAttr()`: `nodePrefix!=null && nodePrefix.equals("xmlns")` → true (filtered) |
| `testConstructor_WildcardName_ExcludesDefaultXmlnsAttr` | `testAttr()`: `nodePrefix==null && nodeLocalName.equals("xmlns")` → true (filtered) |
| `testConstructor_WildcardName_SamePrefixMatches_...` | `testAttr()`: `equalStrings(testPrefix,nodePrefix)` → true (short-circuit, `s1.equals(s2)` ไม่ null) |
| `testConstructor_WildcardName_DifferentPrefixSameNamespace_Matches` | `testAttr()`: prefix ไม่ตรง → เข้า NS resolution → `equalStrings(testNS,nodeNS)` → true |
| `testConstructor_WildcardName_DifferentPrefixDifferentNamespace_NoMatch` | `testAttr()`: NS resolution → `equalStrings(testNS,nodeNS)` → false → `return false` |
| `testConstructor_SpecificName_Found` | Constructor: `lname.equals("*")`→false → `getAttribute()` คืน attr != null → `if (attr != null)` → true |
| `testConstructor_SpecificName_NotFound` | `getAttribute()` คืน null → `if (attr != null)` → false |
| `testGetAttribute_WithNamespace_FoundDirectlyViaNS` | `getAttribute()`: `testPrefix != null` → true, `testNS != null` → true, `getAttributeNodeNS` พบ attr ทันที |
| `testGetNodePointer_InitialPositionZero_NonEmpty_...` | `getNodePointer()`: `position==0` → true, `setPosition(1)` → true, reset `position=0`, `index<0` → true (clamp) |
| `testGetNodePointer_EmptyAttributes_ReturnsNull` | `getNodePointer()`: `position==0`→true, `setPosition(1)`→false → `return null` |
| `testGetNodePointer_AfterExplicitSetPosition_NoClampNeeded` | `getNodePointer()`: `position==0`→false (skip), `index<0`→false |
| `testGetNodePointer_NegativePosition_IndexClampedToZero` | `getNodePointer()`: `position==0`→false, `index<0`→true (position ติดลบ) |
| `testSetPosition_Boundaries` | `setPosition()`: `position>=1 && position<=size` ครบทุกสาขา (0, 1, size, size+1, ลบ) |
| `testGetPosition_ReflectsLastSetPositionValue` | `getPosition()` คืนค่า field ตรง ๆ ไม่ขึ้นกับความถูกต้องของ `setPosition()` |

**จุดที่ยังไม่ครอบคลุม (ระบุเหตุผลตามข้อกำหนดที่ 4):** branch fallback loop ใน `getAttribute()` เมื่อ `testNS != null` แต่ `getAttributeNodeNS` คืน `null` (เคสพาร์เซอร์ไม่รองรับ NS สำหรับ attribute) — ไม่สามารถ repro ได้อย่างน่าเชื่อถือด้วย DOM ของ JDK มาตรฐานโดยไม่เดา behavior ของ `NamespaceResolver`/parser เฉพาะ