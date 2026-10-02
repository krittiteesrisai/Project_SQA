# คำอธิบายแนวทาง

เนื่องจาก `Node` เป็น abstract class ผมจึงสร้าง **inner concrete subclass (`TestNode`)** ไว้ภายใน `NodeTest` เพื่อ:
- เรียกใช้ constructor ที่เป็น `protected` ได้ตรง ๆ (ต้องอยู่ package เดียวกัน คือ `org.jsoup.nodes`)
- ควบคุม behavior ของ `outerHtmlHead/outerHtmlTail/nodeName` ให้ predictable สำหรับทดสอบ `outerHtml()`
- เข้าถึง method ระดับ `protected` เช่น `addChildren`, `removeChild`, `replaceChild`, `setParentNode`, `childNodesAsArray` เพื่อทดสอบ branch ภายในได้ตรงจุด

⚠️ **หมายเหตุสำคัญ (ตามข้อกำหนดห้ามเดา behavior):**
- ซอร์สที่ให้มาไม่ได้แสดง implementation ของ `Validate`, `Attributes`, `Document` แต่ class เหล่านี้ถูกเรียกใช้จริงใน `Node` ดังนั้นต้องมีอยู่จริงใน classpath ของโปรเจกต์ (Defects4J Jsoup-10b) — ผม assume ตาม public API ของ jsoup เวอร์ชันนี้เท่าที่ `Node` เรียกใช้เท่านั้น (`notNull`, `notEmpty`, `isTrue`, `noNullElements` → throw `IllegalArgumentException`) ซึ่งเป็น behavior มาตรฐานของ jsoup `Validate` — มีคอมเมนต์กำกับไว้ในโค้ด
- ไม่ได้เดา behavior อื่นที่ไม่มีในซอร์ส เช่น การ validate รูปแบบ attributeKey เป็นต้น

```java
package org.jsoup.nodes;

// import แบบ explicit ตามข้อกำหนด (แม้อยู่ package เดียวกัน Java ก็ยอมให้ import ได้)
import org.jsoup.nodes.Node;
import org.jsoup.helper.Validate;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests สำหรับ org.jsoup.nodes.Node (Defects4J Jsoup-10b)
 *
 * หมายเหตุ: Validate.notNull / notEmpty / isTrue / noNullElements ไม่มี source ให้ดู
 * จึง assume ว่า throw IllegalArgumentException ตาม jsoup convention มาตรฐาน
 */
public class NodeTest {

    /** Minimal concrete subclass เพื่อเปิดช่องทางทดสอบ Node โดยตรง (ต้องอยู่ package เดียวกัน) */
    static class TestNode extends Node {
        TestNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }
        TestNode(String baseUri) {
            super(baseUri);
        }
        TestNode() {
            super();
        }
        @Override
        public String nodeName() {
            return "#test";
        }
        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("<test>");
        }
        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</test>");
        }
    }

    // ================= Constructor =================

    @Test
    public void testConstructor_TrimsBaseUri() {
        TestNode n = new TestNode("  http://example.com  ", new Attributes());
        assertEquals("http://example.com", n.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullBaseUri_Throws() {
        new TestNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullAttributes_Throws() {
        new TestNode("http://example.com", null);
    }

    @Test
    public void testConstructor_BaseUriOnly_DefaultAttributesEmpty() {
        TestNode n = new TestNode("http://example.com");
        assertNotNull(n.attributes());
        assertFalse(n.hasAttr("anything"));
    }

    @Test
    public void testDefaultConstructor_EmptyChildNodesAndNullAttributes() {
        TestNode n = new TestNode();
        assertNull(n.baseUri());
        assertNull(n.attributes());
        assertTrue(n.childNodes().isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testDefaultConstructor_AttrCall_NPE() {
        // javadoc: "use with caution" -> attributes == null ทำให้ hasAttr -> NPE
        TestNode n = new TestNode();
        n.attr("key");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDefaultConstructor_AddChildren_Throws() {
        // childNodes = Collections.EMPTY_LIST (immutable)
        TestNode n = new TestNode();
        TestNode child = new TestNode("x");
        n.addChildren(child);
    }

    // ================= attr / hasAttr / removeAttr =================

    @Test
    public void testAttr_SetGet_ChainingReturnsSameInstance() {
        TestNode n = new TestNode("http://a.com");
        Node ret = n.attr("k", "v");
        assertSame(n, ret);
        assertEquals("v", n.attr("k"));
    }

    @Test
    public void testAttr_MissingKey_ReturnsEmptyString() {
        TestNode n = new TestNode("http://a.com");
        assertEquals("", n.attr("missing"));
    }

    @Test
    public void testAttr_AbsPrefixNoAttribute_ReturnsEmptyFromAbsUrl() {
        TestNode n = new TestNode("http://a.com");
        assertEquals("", n.attr("abs:href"));
    }

    @Test
    public void testAttr_AbsPrefixCaseInsensitive() {
        TestNode n = new TestNode("http://example.com/dir/");
        n.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", n.attr("ABS:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_NullKey_Throws() {
        TestNode n = new TestNode("http://a.com");
        n.attr((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_NullKey_Throws() {
        TestNode n = new TestNode("http://a.com");
        n.hasAttr(null);
    }

    @Test
    public void testHasAttr_TrueFalse() {
        TestNode n = new TestNode("http://a.com");
        assertFalse(n.hasAttr("k"));
        n.attr("k", "v");
        assertTrue(n.hasAttr("k"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_NullKey_Throws() {
        TestNode n = new TestNode("http://a.com");
        n.removeAttr(null);
    }

    @Test
    public void testRemoveAttr_RemovesExisting() {
        TestNode n = new TestNode("http://a.com");
        n.attr("k", "v");
        Node ret = n.removeAttr("k");
        assertSame(n, ret);
        assertFalse(n.hasAttr("k"));
    }

    @Test
    public void testAttributes_ReturnsSameReference() {
        Attributes attrs = new Attributes();
        TestNode n = new TestNode("http://a.com", attrs);
        assertSame(attrs, n.attributes());
    }

    // ================= baseUri =================

    @Test
    public void testBaseUri_SetAndGet() {
        TestNode n = new TestNode("http://a.com");
        n.setBaseUri("http://b.com");
        assertEquals("http://b.com", n.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseUri_SetNull_Throws() {
        TestNode n = new TestNode("http://a.com");
        n.setBaseUri(null);
    }

    @Test
    public void testBaseUri_EmptyAllowed() {
        TestNode n = new TestNode("http://a.com");
        n.setBaseUri("");
        assertEquals("", n.baseUri());
    }

    // ================= absUrl =================

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_EmptyKey_Throws() {
        TestNode n = new TestNode("http://a.com");
        n.absUrl("");
    }

    @Test
    public void testAbsUrl_MissingAttribute_ReturnsEmpty() {
        TestNode n = new TestNode("http://a.com");
        assertEquals("", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_RelativeResolvesAgainstValidBase() {
        TestNode n = new TestNode("http://example.com/dir/");
        n.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_AlreadyAbsolute_ReturnsAsIs() {
        TestNode n = new TestNode("http://example.com/");
        n.attr("href", "http://other.com/page?x=1");
        assertEquals("http://other.com/page?x=1", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_MalformedBase_RelAbsolute_ReturnsRelExternalForm() {
        TestNode n = new TestNode("not a valid url");
        n.attr("href", "http://valid.com/x");
        assertEquals("http://valid.com/x", n.absUrl("href"));
    }

    @Test
    public void testAbsUrl_MalformedBase_RelAlsoInvalid_ReturnsEmpty() {
        TestNode n = new TestNode("not a valid url");
        n.attr("href", "also not a url");
        assertEquals("", n.absUrl("href"));
    }

    // ================= childNode / childNodes =================

    @Test
    public void testChildNode_ValidIndex() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parent.addChildren(c0);
        assertSame(c0, parent.childNode(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_InvalidIndex_Throws() {
        TestNode parent = new TestNode("b");
        parent.childNode(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_UnmodifiableList() {
        TestNode parent = new TestNode("b");
        parent.childNodes().add(new TestNode("b"));
    }

    @Test
    public void testChildNodesAsArray() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        parent.addChildren(c0, c1);
        Node[] arr = parent.childNodesAsArray();
        assertEquals(2, arr.length);
        assertSame(c0, arr[0]);
        assertSame(c1, arr[1]);
    }

    @Test
    public void testParent_InitiallyNull() {
        TestNode n = new TestNode("b");
        assertNull(n.parent());
    }

    // ================= addChildren / reparent =================

    @Test
    public void testAddChildren_SetsParentAndSiblingIndex() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        parent.addChildren(c0, c1);
        assertSame(parent, c0.parent());
        assertEquals(Integer.valueOf(0), c0.siblingIndex());
        assertEquals(Integer.valueOf(1), c1.siblingIndex());
    }

    @Test
    public void testAddChildren_ReparentsFromOldParent() {
        TestNode oldParent = new TestNode("b");
        TestNode child = new TestNode("b");
        oldParent.addChildren(child);

        TestNode newParent = new TestNode("b");
        newParent.addChildren(child);

        assertSame(newParent, child.parent());
        assertEquals(0, oldParent.childNodes().size());
        assertEquals(1, newParent.childNodes().size());
    }

    @Test
    public void testAddChildrenAtIndex_InsertsInOrder() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        parent.addChildren(c0, c1); // [c0, c1]

        TestNode n1 = new TestNode("b");
        TestNode n2 = new TestNode("b");
        parent.addChildren(1, n1, n2); // expect [c0, n1, n2, c1]

        List<Node> children = parent.childNodes();
        assertEquals(4, children.size());
        assertSame(c0, children.get(0));
        assertSame(n1, children.get(1));
        assertSame(n2, children.get(2));
        assertSame(c1, children.get(3));
        // reindex check
        assertEquals(Integer.valueOf(3), c1.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildrenAtIndex_NullElement_Throws() {
        TestNode parent = new TestNode("b");
        parent.addChildren(0, new TestNode("b"), null);
    }

    @Test
    public void testSetParentNode_RemovesFromOldParent_ButDoesNotAddToNewParentList() {
        TestNode oldParent = new TestNode("b");
        TestNode child = new TestNode("b");
        oldParent.addChildren(child);

        TestNode newParent = new TestNode("b");
        child.setParentNode(newParent); // protected method เรียกตรง (package เดียวกัน)

        assertSame(newParent, child.parent());
        assertEquals(0, oldParent.childNodes().size());
        // setParentNode ไม่ได้เพิ่มเข้า list ของ newParent (เฉพาะ addChildren ทำ)
        assertEquals(0, newParent.childNodes().size());
    }

    // ================= removeChild / replaceChild =================

    @Test
    public void testRemoveChild_ReindexesSiblings() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        TestNode c2 = new TestNode("b");
        parent.addChildren(c0, c1, c2);

        parent.removeChild(c1);

        List<Node> remaining = parent.childNodes();
        assertEquals(2, remaining.size());
        assertSame(c0, remaining.get(0));
        assertSame(c2, remaining.get(1));
        assertEquals(Integer.valueOf(0), c0.siblingIndex());
        assertEquals(Integer.valueOf(1), c2.siblingIndex());
        assertNull(c1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChild_WrongParent_Throws() {
        TestNode parent = new TestNode("b");
        TestNode notAChild = new TestNode("b");
        parent.removeChild(notAChild);
    }

    @Test
    public void testReplaceChild_ReplacesAndUpdatesParents() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parent.addChildren(c0);

        TestNode replacement = new TestNode("b");
        parent.replaceChild(c0, replacement);

        assertSame(replacement, parent.childNode(0));
        assertSame(parent, replacement.parent());
        assertNull(c0.parent());
    }

    @Test
    public void testReplaceChild_InAlreadyHasParent_RemovedFromOldParentFirst() {
        TestNode parentA = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parentA.addChildren(c0);

        TestNode parentB = new TestNode("b");
        TestNode replacement = new TestNode("b");
        parentB.addChildren(replacement);

        parentA.replaceChild(c0, replacement);

        assertEquals(0, parentB.childNodes().size());
        assertSame(parentA, replacement.parent());
        assertSame(replacement, parentA.childNode(0));
    }

    // ================= remove / replaceWith =================

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_NullParent_Throws() {
        TestNode n = new TestNode("b");
        n.remove();
    }

    @Test
    public void testRemove_DetachesFromParent() {
        TestNode parent = new TestNode("b");
        TestNode child = new TestNode("b");
        parent.addChildren(child);

        child.remove();

        assertEquals(0, parent.childNodes().size());
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_NullArgument_Throws() {
        TestNode parent = new TestNode("b");
        TestNode child = new TestNode("b");
        parent.addChildren(child);
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_NullParent_Throws() {
        TestNode n = new TestNode("b");
        n.replaceWith(new TestNode("b"));
    }

    @Test
    public void testReplaceWith_ReplacesNodeInParent() {
        TestNode parent = new TestNode("b");
        TestNode child = new TestNode("b");
        parent.addChildren(child);

        TestNode replacement = new TestNode("b");
        child.replaceWith(replacement);

        assertSame(replacement, parent.childNode(0));
        assertNull(child.parent());
    }

    // ================= sibling related =================

    @Test
    public void testSiblingNodes_ReturnsParentChildNodes() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parent.addChildren(c0);
        assertSame(parent.childNodes().size(), c0.siblingNodes().size());
    }

    @Test(expected = NullPointerException.class)
    public void testSiblingNodes_NoParent_Throws() {
        TestNode n = new TestNode("b");
        n.siblingNodes(); // parent() null -> NPE เพราะเรียก .childNodes() ต่อ
    }

    @Test
    public void testNextSibling_HasNext() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        parent.addChildren(c0, c1);
        assertSame(c1, c0.nextSibling());
    }

    @Test
    public void testNextSibling_LastReturnsNull() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parent.addChildren(c0);
        assertNull(c0.nextSibling());
    }

    @Test
    public void testNextSibling_NoParentReturnsNull() {
        TestNode n = new TestNode("b");
        assertNull(n.nextSibling());
    }

    @Test
    public void testPreviousSibling_HasPrevious() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        parent.addChildren(c0, c1);
        assertSame(c0, c1.previousSibling());
    }

    @Test
    public void testPreviousSibling_FirstReturnsNull() {
        TestNode parent = new TestNode("b");
        TestNode c0 = new TestNode("b");
        parent.addChildren(c0);
        assertNull(c0.previousSibling());
    }

    @Test(expected = NullPointerException.class)
    public void testPreviousSibling_NoParent_Throws() {
        // ต่างจาก nextSibling ที่เช็ค parentNode==null ก่อน, previousSibling ไม่เช็ค -> NPE
        TestNode n = new TestNode("b");
        n.previousSibling();
    }

    @Test
    public void testSiblingIndex_GetSet() {
        TestNode n = new TestNode("b");
        n.setSiblingIndex(5);
        assertEquals(Integer.valueOf(5), n.siblingIndex());
    }

    // ================= ownerDocument =================

    @Test
    public void testOwnerDocument_SelfIsDocument() {
        Document doc = new Document("http://a.com");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_NoParentNotDocument_ReturnsNull() {
        TestNode n = new TestNode("b");
        assertNull(n.ownerDocument());
    }

    @Test
    public void testOwnerDocument_FindsAncestorDocument() {
        Document doc = new Document("http://a.com");
        TestNode child = new TestNode("http://a.com");
        doc.addChildren(child);
        assertSame(doc, child.ownerDocument());
    }

    // ================= outerHtml / toString =================

    @Test
    public void testOuterHtml_SingleNode() {
        TestNode n = new TestNode("http://a.com");
        assertEquals("<test></test>", n.outerHtml());
    }

    @Test
    public void testOuterHtml_WithChildren() {
        TestNode parent = new TestNode("b");
        TestNode child = new TestNode("b");
        parent.addChildren(child);
        assertEquals("<test><test></test></test>", parent.outerHtml());
    }

    @Test
    public void testToString_EqualsOuterHtml() {
        TestNode n = new TestNode("b");
        assertEquals(n.outerHtml(), n.toString());
    }

    // ================= equals / hashCode =================

    @Test
    public void testEquals_SameReferenceTrue() {
        TestNode n = new TestNode("b");
        assertTrue(n.equals(n));
    }

    @Test
    public void testEquals_DifferentReferenceFalse() {
        TestNode n1 = new TestNode("b");
        TestNode n2 = new TestNode("b");
        assertFalse(n1.equals(n2));
    }

    @Test
    public void testHashCode_Deterministic() {
        TestNode n = new TestNode("b");
        int h1 = n.hashCode();
        int h2 = n.hashCode();
        assertEquals(h1, h2);
    }

    // ================= clone / doClone =================

    @Test
    public void testClone_OrphanAndIndependentAttributes() {
        TestNode parent = new TestNode("b");
        TestNode child = new TestNode("b");
        parent.addChildren(child);
        child.attr("k", "v");

        Node clone = child.clone();

        assertNull(clone.parent());
        assertEquals(Integer.valueOf(0), clone.siblingIndex());
        assertEquals("v", clone.attr("k"));

        clone.attr("k", "changed");
        assertEquals("v", child.attr("k")); // original ไม่กระทบ
        assertNotSame(child.attributes(), clone.attributes());
    }

    @Test
    public void testClone_DeepCopiesChildrenPreservingSiblingIndex() {
        TestNode root = new TestNode("b");
        TestNode c0 = new TestNode("b");
        TestNode c1 = new TestNode("b");
        root.addChildren(c0, c1);

        Node rootClone = root.clone();
        List<Node> clonedChildren = rootClone.childNodes();

        assertEquals(2, clonedChildren.size());
        assertNotSame(c0, clonedChildren.get(0));
        assertEquals(Integer.valueOf(0), clonedChildren.get(0).siblingIndex());
        assertEquals(Integer.valueOf(1), clonedChildren.get(1).siblingIndex());
        assertSame(rootClone, clonedChildren.get(0).parent());
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructor_*` | ctor trim baseUri, `Validate.notNull` (baseUri/attributes) ทั้ง throw/ไม่ throw, 3 overload ของ constructor |
| `testDefaultConstructor_*` | default ctor: `childNodes=EMPTY_LIST`, `attributes=null`, NPE จาก `hasAttr`, `UnsupportedOperationException` จาก `addChildren` |
| `testAttr_*` | if `hasAttr` true/false, `startsWith("abs:")` true/false, case-insensitive prefix, null-key throw |
| `testHasAttr_*`, `testRemoveAttr_*` | null-check throw, true/false path |
| `testAttributes_ReturnsSameReference` | reference equality ของ field `attributes` |
| `testBaseUri_*` | set/get, null throw, empty string allowed |
| `testAbsUrl_*` | `notEmpty` throw, `!hasAttr` branch, try/catch base malformed (inner/outer), base ok + rel resolve, rel already absolute |
| `testChildNode_*`, `testChildNodes_*`, `testChildNodesAsArray` | valid/invalid index, unmodifiable list, array conversion |
| `testAddChildren_*` | parent set, siblingIndex set, reparent จาก parent เดิม, insert at index (reverse-loop), `noNullElements` throw |
| `testSetParentNode_*` | branch `this.parentNode != null` → `removeChild` เดิม |
| `testRemoveChild_*`, `testReplaceChild_*` | `Validate.isTrue` throw, reindex, replace + reparent ของ `in` ที่มี parent เดิมอยู่แล้ว |
| `testRemove_*`, `testReplaceWith_*` | `notNull` parent/in throw, การลบ/แทนที่จริงใน parent |
| `testSiblingNodes_*`, `testNextSibling_*`, `testPreviousSibling_*` | parent null → NPE (previousSibling/siblingNodes) vs return null (nextSibling), มี/ไม่มี sibling ถัดไป-ก่อนหน้า |
| `testSiblingIndex_GetSet` | getter/setter ตรงไปตรงมา |
| `testOwnerDocument_*` | `instanceof Document` true/false, `parentNode==null` true/false, recursive ค้นหา ancestor |
| `testOuterHtml_*`, `testToString_*` | traversal head/tail, nested children, tail-skip condition (`nodeName != "#text"`) |
| `testEquals_*`, `testHashCode_*` | `this==o` true/false, hashCode deterministic |
| `testClone_*` | `doClone(null)` vs `doClone(parent)` branch (`parent==null?0:siblingIndex`), deep copy children, independent `attributes.clone()` |

**ข้อจำกัดที่ประกาศไว้ (ตามข้อกำหนดห้ามเดา):** exception type ที่แม่นยำของ `Validate.*` ไม่มี source ยืนยัน จึง assume เป็น `IllegalArgumentException` ตาม jsoup convention — หากรันจริงแล้ว exception ต่างจากที่ assume ให้ปรับ `expected=` ให้ตรงกับ implementation จริงของ `Validate` ใน classpath