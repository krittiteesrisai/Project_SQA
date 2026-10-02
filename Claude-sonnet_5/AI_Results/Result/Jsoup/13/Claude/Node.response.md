# NodeTest.java

ผมวางคลาสทดสอบไว้ใน **package เดียวกับคลาสเป้าหมาย** (`org.jsoup.nodes`) เพื่อให้สามารถเข้าถึง method ระดับ `protected` (เช่น `addChildren`, `replaceChild`, `removeChild`, `setParentNode`) ได้โดยตรง ซึ่งช่วยเพิ่ม branch coverage ของ logic ภายในที่ public API ไม่ได้ exercise ตรง ๆ

> **หมายเหตุสำคัญ:** `Node` เป็น abstract class จึงต้องทดสอบผ่าน concrete subclass ที่มีอยู่จริงใน jsoup (เช่น `Element`, `TextNode`, `Document`) ซึ่งถือว่าอยู่ใน classpath เดียวกัน (เป็นส่วนหนึ่งของโปรเจกต์ jsoup) ไม่ใช่การเดา behavior ของ `Node` เอง

```java
package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Node; // import ตามข้อกำหนด (ซ้ำซ้อนเพราะ package เดียวกัน แต่ใส่ไว้ให้ชัดเจน)
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NodeTest {

    // ---------- Constructor ----------

    @Test
    public void constructor_trimsBaseUri() {
        Element el = new Element(Tag.valueOf("div"), "  http://example.com  ");
        assertEquals("http://example.com", el.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullBaseUri_throws() {
        // Validate.notNull(baseUri) ควร throw เมื่อ baseUri == null
        new Element(Tag.valueOf("div"), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullAttributes_throws() {
        // Validate.notNull(attributes)
        new Element(Tag.valueOf("div"), "http://example.com", null);
    }

    // ---------- attr(get) ----------

    @Test
    public void attr_existingKey_returnsValue() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "foo.html");
        assertEquals("foo.html", el.attr("href"));
    }

    @Test
    public void attr_missingKey_returnsEmptyString() {
        Element el = new Element(Tag.valueOf("a"), "");
        assertEquals("", el.attr("nonexistent"));
    }

    @Test
    public void attr_absPrefix_delegatesToAbsUrl() {
        // key ไม่มีจริง แต่ขึ้นต้นด้วย "abs:" -> เรียก absUrl() ซึ่งจะ return "" เพราะไม่มี attribute "href"
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        assertEquals("", el.attr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void attr_get_nullKey_throws() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr((String) null);
    }

    // ---------- attr(set) ----------

    @Test
    public void attr_set_returnsThisForChaining() {
        Element el = new Element(Tag.valueOf("a"), "");
        Node returned = el.attr("class", "test");
        assertSame(el, returned);
        assertEquals("test", el.attr("class"));
    }

    // ---------- hasAttr / removeAttr ----------

    @Test
    public void hasAttr_trueAndFalse() {
        Element el = new Element(Tag.valueOf("a"), "");
        assertFalse(el.hasAttr("href"));
        el.attr("href", "x");
        assertTrue(el.hasAttr("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void hasAttr_nullKey_throws() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.hasAttr(null);
    }

    @Test
    public void removeAttr_removesExisting() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "x");
        el.removeAttr("href");
        assertFalse(el.hasAttr("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeAttr_nullKey_throws() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.removeAttr(null);
    }

    // ---------- baseUri / setBaseUri ----------

    @Test
    public void setBaseUri_updatesValue() {
        Element el = new Element(Tag.valueOf("a"), "http://a.com");
        el.setBaseUri("http://b.com");
        assertEquals("http://b.com", el.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setBaseUri_null_throws() {
        Element el = new Element(Tag.valueOf("a"), "http://a.com");
        el.setBaseUri(null);
    }

    // ---------- absUrl ----------

    @Test(expected = IllegalArgumentException.class)
    public void absUrl_emptyKey_throws() {
        Element el = new Element(Tag.valueOf("a"), "http://a.com");
        el.absUrl("");
    }

    @Test
    public void absUrl_attributeMissing_returnsEmpty() {
        Element el = new Element(Tag.valueOf("a"), "http://a.com");
        assertEquals("", el.absUrl("href"));
    }

    @Test
    public void absUrl_baseMalformed_relAbsolute_returnsRel() {
        // baseUri ไม่ใช่ URL ที่ valid -> MalformedURLException ชั้นใน
        // relUrl เป็น absolute URL อยู่แล้ว -> ใช้ relUrl ได้โดยตรง
        Element el = new Element(Tag.valueOf("a"), "not a url");
        el.attr("href", "http://foo.com/bar");
        assertEquals("http://foo.com/bar", el.absUrl("href"));
    }

    @Test
    public void absUrl_bothMalformed_returnsEmpty() {
        // base malformed และ relUrl ก็ malformed -> catch ชั้นนอก -> ""
        Element el = new Element(Tag.valueOf("a"), "not a url");
        el.attr("href", "also not a url");
        assertEquals("", el.absUrl("href"));
    }

    @Test
    public void absUrl_queryStringWorkaround() {
        // relUrl.startsWith("?") -> relUrl = base.getPath() + relUrl
        Element el = new Element(Tag.valueOf("a"), "http://example.com/dir/page.html");
        el.attr("href", "?foo=1");
        assertEquals("http://example.com/dir/?foo=1", el.absUrl("href"));
    }

    @Test
    public void absUrl_normalRelative_resolvesAgainstBase() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/dir/");
        el.attr("href", "page.html");
        assertEquals("http://example.com/dir/page.html", el.absUrl("href"));
    }

    // ---------- childNode / childNodes ----------

    @Test
    public void childNode_returnsExpectedChild() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element div = doc.select("div").first();
        assertEquals("p", div.childNode(0).nodeName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void childNode_invalidIndex_throws() {
        Document doc = Jsoup.parse("<div></div>");
        Element div = doc.select("div").first();
        div.childNode(0);
    }

    @Test
    public void childNodes_emptyWhenNoChildren() {
        Document doc = Jsoup.parse("<div></div>");
        Element div = doc.select("div").first();
        assertTrue(div.childNodes().isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void childNodes_isUnmodifiable() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        div.childNodes().add(new TextNode("x", ""));
    }

    // ---------- parent / ownerDocument ----------

    @Test
    public void parent_nullWhenNoParent() {
        TextNode t = new TextNode("hi", "");
        assertNull(t.parent());
    }

    @Test
    public void ownerDocument_returnsSelfWhenDocument() {
        Document doc = new Document("http://x.com");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void ownerDocument_nullWhenOrphanNonDocument() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.ownerDocument());
    }

    @Test
    public void ownerDocument_returnsAncestorDocument() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element p = doc.select("p").first();
        assertSame(doc, p.ownerDocument());
    }

    // ---------- remove ----------

    @Test(expected = IllegalArgumentException.class)
    public void remove_noParent_throws() {
        TextNode t = new TextNode("hi", "");
        t.remove();
    }

    @Test
    public void remove_withParent_removesFromTree() {
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        Element p1 = doc.select("p").first();
        p1.remove();
        assertEquals(1, doc.select("p").size());
        assertNull(p1.parent());
    }

    // ---------- before(String) / after(String) ----------

    @Test
    public void before_html_insertsBeforeSibling() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element p = doc.select("p").first();
        p.before("<span>Before</span>");
        Element div = doc.select("div").first();
        assertEquals("span", div.childNode(0).nodeName());
        assertEquals("p", div.childNode(1).nodeName());
    }

    @Test
    public void after_html_insertsAfterSibling() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element p = doc.select("p").first();
        p.after("<span>After</span>");
        Element div = doc.select("div").first();
        assertEquals("p", div.childNode(0).nodeName());
        assertEquals("span", div.childNode(1).nodeName());
    }

    // ---------- before(Node) / after(Node) ----------

    @Test
    public void before_node_insertsNode() {
        Document doc = Jsoup.parse("<div><p id=a>A</p></div>");
        Element p = doc.select("p").first();
        Element newEl = new Element(Tag.valueOf("span"), doc.baseUri());
        p.before(newEl);
        Element div = doc.select("div").first();
        assertSame(newEl, div.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void before_node_nullNode_throws() {
        Document doc = Jsoup.parse("<div><p>A</p></div>");
        Element p = doc.select("p").first();
        p.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void after_node_noParent_throws() {
        Element orphan = new Element(Tag.valueOf("p"), "");
        orphan.after(new Element(Tag.valueOf("span"), ""));
    }

    // ---------- wrap ----------

    @Test
    public void wrap_withElementHtml_wrapsSuccessfully() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element p = doc.select("p").first();
        p.wrap("<span class='wrap'></span>");
        Element div = doc.select("div").first();
        assertEquals("span", div.childNode(0).nodeName());
        Element span = (Element) div.childNode(0);
        assertEquals("p", span.childNode(0).nodeName());
    }

    @Test
    public void wrap_withPlainText_noElementToWrap_returnsNull() {
        // fragment parse ของ plain text จะได้ TextNode ไม่ใช่ Element -> noop, return null
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element p = doc.select("p").first();
        Node result = p.wrap("just plain text");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrap_emptyHtml_throws() {
        Document doc = Jsoup.parse("<div><p>Text</p></div>");
        Element p = doc.select("p").first();
        p.wrap("");
    }

    // ---------- replaceWith ----------

    @Test
    public void replaceWith_replacesNodeInPlace() {
        Document doc = Jsoup.parse("<div><p id=old>Old</p></div>");
        Element oldP = doc.select("p").first();
        Element newEl = new Element(Tag.valueOf("span"), doc.baseUri()).attr("id", "new");
        oldP.replaceWith(newEl);
        Element div = doc.select("div").first();
        assertSame(newEl, div.childNode(0));
        assertNull(oldP.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceWith_null_throws() {
        Document doc = Jsoup.parse("<div><p>Old</p></div>");
        Element p = doc.select("p").first();
        p.replaceWith(null);
    }

    // ---------- protected: setParentNode / replaceChild / removeChild / addChildren ----------

    @Test
    public void setParentNode_reparentsAndRemovesFromOldParent() {
        Element parentA = new Element(Tag.valueOf("div"), "");
        Element parentB = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parentA.addChildren(child);
        assertEquals(1, parentA.childNodes().size());

        child.setParentNode(parentB); // ควรลบ child ออกจาก parentA ก่อน
        assertEquals(0, parentA.childNodes().size());
        assertSame(parentB, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceChild_outNotChildOfThis_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element notChild = new Element(Tag.valueOf("p"), "");
        Element in = new Element(Tag.valueOf("span"), "");
        parent.replaceChild(notChild, in); // notChild.parentNode != parent -> Validate.isTrue fails
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeChild_outNotChildOfThis_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element notChild = new Element(Tag.valueOf("p"), "");
        parent.removeChild(notChild);
    }

    @Test
    public void addChildren_varargs_setsParentAndSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        Element c2 = new Element(Tag.valueOf("p"), "");
        parent.addChildren(c1, c2);
        assertEquals(0, c1.siblingIndex());
        assertEquals(1, c2.siblingIndex());
        assertSame(parent, c1.parent());
        assertSame(parent, c2.parent());
    }

    @Test
    public void addChildren_reparentsChildFromOtherParent() {
        Element parentA = new Element(Tag.valueOf("div"), "");
        Element parentB = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        parentA.addChildren(child);
        assertEquals(1, parentA.childNodes().size());

        parentB.addChildren(child); // reparentChild: child.parentNode != null -> remove from parentA ก่อน
        assertEquals(0, parentA.childNodes().size());
        assertEquals(1, parentB.childNodes().size());
        assertSame(parentB, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addChildren_indexed_nullElement_throws() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        parent.addChildren(0, c1, null); // Validate.noNullElements
    }

    @Test
    public void addChildren_indexed_reindexesChildren() {
        Document doc = Jsoup.parse("<div><p id=a>A</p><p id=b>B</p></div>");
        Elements ps = doc.select("p");
        assertEquals(0, ps.get(0).siblingIndex());
        assertEquals(1, ps.get(1).siblingIndex());

        Element c = new Element(Tag.valueOf("p"), doc.baseUri()).attr("id", "c");
        ps.get(1).before(c); // ใช้ addChildren(index, ...) ภายใน before(Node)

        Elements psAfter = doc.select("p");
        assertEquals("a", psAfter.get(0).attr("id"));
        assertEquals("c", psAfter.get(1).attr("id"));
        assertEquals("b", psAfter.get(2).attr("id"));
        assertEquals(0, psAfter.get(0).siblingIndex());
        assertEquals(1, psAfter.get(1).siblingIndex());
        assertEquals(2, psAfter.get(2).siblingIndex());
    }

    // ---------- siblingNodes / nextSibling / previousSibling / siblingIndex ----------

    @Test
    public void nextSibling_rootNode_returnsNull() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.nextSibling());
    }

    @Test
    public void nextSibling_lastChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p>A</p><p>B</p></div>");
        Elements ps = doc.select("p");
        assertNull(ps.get(1).nextSibling());
        assertNotNull(ps.get(0).nextSibling());
    }

    @Test
    public void previousSibling_firstChild_returnsNull() {
        Document doc = Jsoup.parse("<div><p>A</p><p>B</p></div>");
        Elements ps = doc.select("p");
        assertNull(ps.get(0).previousSibling());
        assertNotNull(ps.get(1).previousSibling());
    }

    @Test(expected = NullPointerException.class)
    public void previousSibling_rootNode_throwsNPE() {
        // ข้อสังเกตจาก source: previousSibling() ไม่มีการเช็ค parentNode == null
        // (ต่างจาก nextSibling() ที่เช็คและ return null) จึงคาดว่าจะเกิด NPE จริง
        Element el = new Element(Tag.valueOf("div"), "");
        el.previousSibling();
    }

    @Test
    public void siblingNodes_returnsParentChildNodes() {
        Document doc = Jsoup.parse("<div><p>A</p><p>B</p></div>");
        Elements ps = doc.select("p");
        List<Node> siblings = ps.get(0).siblingNodes();
        assertEquals(2, siblings.size());
    }

    // ---------- outerHtml / toString ----------

    @Test
    public void outerHtml_producesExpectedMarkup() {
        Element el = new Element(Tag.valueOf("p"), "");
        el.text("Hello");
        String html = el.outerHtml();
        assertTrue(html.contains("<p>"));
        assertTrue(html.contains("Hello"));
    }

    @Test
    public void toString_sameAsOuterHtml() {
        Element el = new Element(Tag.valueOf("p"), "");
        el.text("Hi");
        assertEquals(el.outerHtml(), el.toString());
    }

    // ---------- equals / hashCode ----------

    @Test
    public void equals_sameInstance_true() {
        Element el = new Element(Tag.valueOf("p"), "");
        assertTrue(el.equals(el));
    }

    @Test
    public void equals_differentInstanceSameContent_false() {
        // ตามคอมเมนต์ใน source: equals() เทียบ reference เท่านั้น (ยังไม่เทียบ content)
        Element el1 = new Element(Tag.valueOf("p"), "");
        Element el2 = new Element(Tag.valueOf("p"), "");
        assertFalse(el1.equals(el2));
    }

    @Test
    public void hashCode_consistentAcrossCalls() {
        Element el = new Element(Tag.valueOf("p"), "");
        int h1 = el.hashCode();
        int h2 = el.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void hashCode_changesWhenAttributesChange() {
        // สมมติฐาน: Attributes#hashCode() แปรผันตามเนื้อหา (ไม่ได้ตรวจสอบโค้ด Attributes ตรง ๆ)
        // หากไม่เป็นจริงตาม implementation ของ Attributes ให้ถือว่าเป็นข้อสังเกต ไม่ใช่ fault ของ Node
        Element el = new Element(Tag.valueOf("p"), "");
        int before = el.hashCode();
        el.attr("id", "x");
        int after = el.hashCode();
        assertNotEquals(before, after);
    }

    // ---------- clone / doClone ----------

    @Test
    public void clone_createsIndependentDeepCopy() {
        Document doc = Jsoup.parse("<div><p>One</p></div>");
        Element div = doc.select("div").first();
        Element clone = (Element) div.clone();

        assertNotSame(div, clone);
        assertEquals(div.outerHtml(), clone.outerHtml());
        assertNull(clone.parent()); // top-level clone -> parent null, siblingIndex = 0
        assertEquals(0, clone.siblingIndex());

        // แก้ clone ไม่กระทบ original
        clone.attr("id", "cloned");
        assertFalse(div.hasAttr("id"));

        // child ก็ต้องถูก clone ลึก (ไม่ใช่ reference เดียวกัน)
        Node originalChild = div.childNode(0);
        Node clonedChild = clone.childNode(0);
        assertNotSame(originalChild, clonedChild);
        assertSame(clone, clonedChild.parent()); // child clone มี parent เป็น clone (ไม่ใช่ null)
    }
}
```

---

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `constructor_trimsBaseUri` | Constructor `Node(baseUri, attributes)` — trim baseUri สำเร็จ |
| `constructor_nullBaseUri_throws` | `Validate.notNull(baseUri)` throw |
| `constructor_nullAttributes_throws` | `Validate.notNull(attributes)` throw |
| `attr_existingKey_returnsValue` | `attr(key)` — `attributes.hasKey==true` |
| `attr_missingKey_returnsEmptyString` | `attr(key)` — else `return ""` |
| `attr_absPrefix_delegatesToAbsUrl` | `attr(key)` — `startsWith("abs:")==true` → `absUrl()` |
| `attr_get_nullKey_throws` | `Validate.notNull(attributeKey)` ใน `attr(get)` |
| `attr_set_returnsThisForChaining` | `attr(key,value)` return `this` |
| `hasAttr_trueAndFalse` | `hasAttr` true/false branch |
| `hasAttr_nullKey_throws` | `Validate.notNull` ใน `hasAttr` |
| `removeAttr_removesExisting` | `removeAttr` logic |
| `removeAttr_nullKey_throws` | `Validate.notNull` ใน `removeAttr` |
| `setBaseUri_updatesValue` | `setBaseUri` ปกติ |
| `setBaseUri_null_throws` | `Validate.notNull` ใน `setBaseUri` |
| `absUrl_emptyKey_throws` | `Validate.notEmpty(attributeKey)` |
| `absUrl_attributeMissing_returnsEmpty` | `!hasAttr(attributeKey)` → `""` |
| `absUrl_baseMalformed_relAbsolute_returnsRel` | inner `catch(MalformedURLException)` → `new URL(relUrl)` สำเร็จ |
| `absUrl_bothMalformed_returnsEmpty` | inner catch throw ซ้ำ → outer `catch` → `""` |
| `absUrl_queryStringWorkaround` | `relUrl.startsWith("?")==true` |
| `absUrl_normalRelative_resolvesAgainstBase` | branch ปกติ (base valid, ไม่มี `?`) |
| `childNode_returnsExpectedChild` / `_invalidIndex_throws` | `childNode(index)` ปกติ/`IndexOutOfBoundsException` |
| `childNodes_emptyWhenNoChildren` / `_isUnmodifiable` | `childNodes()` ว่าง / unmodifiable list |
| `parent_nullWhenNoParent` | `parent()` เมื่อไม่มี parent |
| `ownerDocument_*` (4 เทส) | `this instanceof Document` / `parentNode==null` / recursive call |
| `remove_noParent_throws` / `_withParent_removesFromTree` | `Validate.notNull(parentNode)` throw / ลบสำเร็จ |
| `before_html_*` / `after_html_*` | `addSiblingHtml` กับ index ต่างกัน |
| `before_node_insertsNode` / `_nullNode_throws` | `before(Node)` ปกติ / `Validate.notNull(node)` |
| `after_node_noParent_throws` | `Validate.notNull(parentNode)` ใน `after(Node)` |
| `wrap_withElementHtml_wrapsSuccessfully` | `wrap()` — `wrapNode instanceof Element==true`, remainder loop |
| `wrap_withPlainText_noElementToWrap_returnsNull` | `!(wrapNode instanceof Element)` → `return null` |
| `wrap_emptyHtml_throws` | `Validate.notEmpty(html)` |
| `replaceWith_replacesNodeInPlace` / `_null_throws` | `replaceWith` ปกติ / `Validate.notNull(in)` |
| `setParentNode_reparentsAndRemovesFromOldParent` | `if (this.parentNode != null)` ใน `setParentNode` |
| `replaceChild_outNotChildOfThis_throws` | `Validate.isTrue` ใน `replaceChild` |
| `removeChild_outNotChildOfThis_throws` | `Validate.isTrue` ใน `removeChild` |
| `addChildren_varargs_setsParentAndSiblingIndex` | `addChildren(Node...)` ปกติ |
| `addChildren_reparentsChildFromOtherParent` | `reparentChild` — `child.parentNode != null` branch |
| `addChildren_indexed_nullElement_throws` | `Validate.noNullElements` ใน `addChildren(int,...)` |
| `addChildren_indexed_reindexesChildren` | loop `for (i=length-1;...)` + `reindexChildren` |
| `nextSibling_rootNode_returnsNull` / `_lastChild_returnsNull` | `parentNode==null` branch / `siblings.size()>index+1==false` |
| `previousSibling_firstChild_returnsNull` | `index>0==false` |
| `previousSibling_rootNode_throwsNPE` | ขาด null-check ของ `parentNode` ใน source (พบความไม่สมมาตรกับ `nextSibling`) |
| `siblingNodes_returnsParentChildNodes` | `siblingNodes()` ปกติ |
| `outerHtml_producesExpectedMarkup` / `toString_sameAsOuterHtml` | `outerHtml()`, `toString()` |
| `equals_sameInstance_true` / `_differentInstanceSameContent_false` | `if (this==o) return true;` / `return false;` |
| `hashCode_consistentAcrossCalls` / `_changesWhenAttributesChange` | ความสม่ำเสมอของ `hashCode()` / ผลจาก `attributes.hashCode()` |
| `clone_createsIndependentDeepCopy` | `clone()`/`doClone(parent)` — `parent==null` (top) และ `parent!=null` (children), deep copy attributes/children |

**ข้อจำกัด/จุดที่ไม่ได้ทดสอบเพราะไม่สามารถ trigger ได้จาก public/protected API ที่มีอยู่:**
- `wrap()` กรณี `wrapNode == null` (ต้องให้ `wrapChildren.get(0)` เป็น null ซึ่งไม่เกิดขึ้นจริงจาก parser ปัจจุบัน) — ไม่ทดสอบเพราะไม่มีทางสร้าง input ที่ทำให้เกิดได้โดยไม่เดา
- `OuterHtmlVisitor.tail()` branch `!nodeName().equals("#text")` ถูก exercise โดยอ้อมผ่าน `outerHtml()` ของ Element ที่มี TextNode ลูก แต่ไม่ได้แยกยืนยัน branch ตรง ๆ เนื่องจาก class เป็น `private`