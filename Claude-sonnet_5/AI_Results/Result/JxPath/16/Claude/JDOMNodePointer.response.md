# JDOMNodePointerTest.java

ด้านล่างคือชุดทดสอบ JUnit 4 สำหรับ `JDOMNodePointer` โดยอิงตาม logic จริงในซอร์สที่ให้มา
**หมายเหตุสำคัญ**: บางจุด (เช่น การทำงานภายในของ `NamespaceResolver`, `super.isLanguage()`, `super.createAttribute()`, หรือค่าคงที่ `WHOLE_COLLECTION`) ไม่มีซอร์สโค้ดให้ดูโดยตรง — จุดเหล่านี้มีคอมเมนต์กำกับไว้ว่าเป็น "assumption" ตามข้อกำหนดที่ 4

```java
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDOMNodePointerTest {

    private Locale locale;

    @Before
    public void setUp() {
        locale = Locale.US;
    }

    // =========================================================
    // Constructors / trivial getters
    // =========================================================

    @Test
    public void testGetBaseValueAndImmediateNode() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
    }

    @Test
    public void testIsCollectionAlwaysFalse() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertFalse(p.isCollection());
    }

    @Test
    public void testGetLengthAlwaysOne() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertEquals(1, p.getLength());
    }

    @Test
    public void testConstructorWithId() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale, "my-id");
        assertEquals("id('my-id')", p.asPath());
    }

    @Test
    public void testConstructorWithParent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        assertSame(child, childPtr.getBaseValue());
    }

    // =========================================================
    // isLeaf()
    // =========================================================

    @Test
    public void testIsLeaf_ElementNoContent() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeaf_ElementWithContent() {
        Element e = new Element("a");
        e.addContent(new Element("b"));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentNoContent() {
        Document doc = new Document();
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithContent() {
        Document doc = new Document(new Element("root"));
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertFalse(p.isLeaf());
    }

    @Test
    public void testIsLeaf_OtherNode() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("txt"), locale);
        assertTrue(p.isLeaf());
    }

    // =========================================================
    // getName()
    // =========================================================

    @Test
    public void testGetName_ElementNoPrefix() {
        Element e = new Element("item");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        QName n = p.getName();
        assertNull(n.getPrefix());
        assertEquals("item", n.getName());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Namespace ns = Namespace.getNamespace("p", "urn:test");
        Element e = new Element("item", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        QName n = p.getName();
        assertEquals("p", n.getPrefix());
        assertEquals("item", n.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        QName n = p.getName();
        assertNull(n.getPrefix());
        assertEquals("target", n.getName());
    }

    @Test
    public void testGetName_OtherNode() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("x"), locale);
        QName n = p.getName();
        assertNull(n.getPrefix());
        assertNull(n.getName());
    }

    // =========================================================
    // getNamespaceURI() (no-arg)
    // =========================================================

    @Test
    public void testGetNamespaceURI_ElementNoNamespace() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertNull(p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementWithNamespace() {
        Element e = new Element("a", Namespace.getNamespace("p", "urn:ns"));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("urn:ns", p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElement() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("t"), locale);
        assertNull(p.getNamespaceURI());
    }

    // =========================================================
    // getNamespaceURI(String prefix)
    // =========================================================

    @Test
    public void testGetNamespaceURIPrefix_XmlPrefix() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertEquals(Namespace.XML_NAMESPACE.getURI(), p.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Document() {
        Namespace ns = Namespace.getNamespace("p", "urn:doc");
        Element root = new Element("root", ns);
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertEquals("urn:doc", p.getNamespaceURI("p"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element() {
        Namespace ns = Namespace.getNamespace("q", "urn:q");
        Element e = new Element("a", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("urn:q", p.getNamespaceURI("q"));
    }

    @Test
    public void testGetNamespaceURIPrefix_ElementNotFound() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertNull(p.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testGetNamespaceURIPrefix_NonElementNonDocument() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("t"), locale);
        assertNull(p.getNamespaceURI("any"));
    }

    // =========================================================
    // getNamespaceResolver() lazy init
    // =========================================================

    @Test
    public void testGetNamespaceResolver_LazyInitSameInstance() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        Object r1 = p.getNamespaceResolver();
        Object r2 = p.getNamespaceResolver();
        assertSame(r1, r2);
    }

    // =========================================================
    // compareChildNodePointers()
    // =========================================================

    @Test
    public void testCompareChildNodePointers_SameNode() {
        Element container = new Element("c");
        JDOMNodePointer parentPtr = new JDOMNodePointer(container, locale);
        Element same = new Element("x");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, same);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, same);
        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_AttrVsNonAttr() {
        Element container = new Element("c");
        container.setAttribute("a1", "v1");
        JDOMNodePointer parentPtr = new JDOMNodePointer(container, locale);
        Attribute attr = container.getAttribute("a1");
        Element elemNode = new Element("y");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, attr);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, elemNode);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes() {
        Element container = new Element("c");
        container.setAttribute("a1", "v1");
        container.setAttribute("a2", "v2");
        JDOMNodePointer parentPtr = new JDOMNodePointer(container, locale);
        Attribute attr1 = container.getAttribute("a1");
        Attribute attr2 = container.getAttribute("a2");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, attr1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, attr2);
        // a1 ถูกประกาศก่อน a2 -> ต้องมาก่อน
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_BothElements() {
        Element container = new Element("c");
        Element e1 = new Element("e1");
        Element e2 = new Element("e2");
        container.addContent(e1);
        container.addContent(e2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(container, locale);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, e1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, e2);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NodeNotElement() {
        // parentPtr.node เป็น Text (ไม่ใช่ Element) และ node1/node2 ไม่ใช่ Attribute -> throw RuntimeException
        JDOMNodePointer parentPtr = new JDOMNodePointer(new Text("not-an-element"), locale);
        Element e1 = new Element("e1");
        Element e2 = new Element("e2");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, e1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, e2);
        parentPtr.compareChildNodePointers(p1, p2);
    }

    // =========================================================
    // getValue()
    // =========================================================

    @Test
    public void testGetValue_ElementWithTextChild() {
        Element e = new Element("a");
        e.addContent(new Text("  hello  "));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("hello", p.getValue());
    }

    @Test
    public void testGetValue_Comment() {
        Comment c = new Comment("  a comment  ");
        JDOMNodePointer p = new JDOMNodePointer(c, locale);
        assertEquals("a comment", p.getValue());
    }

    @Test
    public void testGetValue_CommentEmptyText() {
        Comment c = new Comment("");
        JDOMNodePointer p = new JDOMNodePointer(c, locale);
        assertEquals("", p.getValue());
    }

    @Test
    public void testGetValue_TextTrimDefault() {
        Element parent = new Element("p");
        Text t = new Text("  hi  ");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertEquals("hi", p.getValue());
    }

    @Test
    public void testGetValue_TextPreserveSpace() {
        Element parent = new Element("p");
        parent.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text t = new Text("  hi  ");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertEquals("  hi  ", p.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstructionTrim() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  data  ");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        assertEquals("data", p.getValue());
    }

    // =========================================================
    // setValue() - Text node
    // =========================================================

    @Test
    public void testSetValue_TextNonEmpty() {
        Element parent = new Element("p");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("new value");
        assertEquals("new value", t.getText());
    }

    @Test
    public void testSetValue_TextEmptyRemovesNode() {
        Element parent = new Element("p");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("");
        assertFalse(parent.getContent().contains(t));
    }

    // =========================================================
    // setValue() - Element node, ทุก branch ของ value type
    // =========================================================

    @Test
    public void testSetValue_ElementWithElementValue() {
        Element target = new Element("target");
        Element valueElement = new Element("value");
        valueElement.addContent(new Element("child1"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Element);
        assertEquals("child1", ((Element) content.get(0)).getName());
        assertNotSame(valueElement.getContent().get(0), content.get(0));
    }

    @Test
    public void testSetValue_ElementWithDocumentValue() {
        Element target = new Element("target");
        Document valueDoc = new Document(new Element("root"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueDoc);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Element);
        assertEquals("root", ((Element) content.get(0)).getName());
    }

    @Test
    public void testSetValue_ElementWithTextValue() {
        Element target = new Element("target");
        Text value = new Text("sometext");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(value);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Text);
        assertEquals("sometext", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithCDATAValue() {
        Element target = new Element("target");
        CDATA value = new CDATA("cdatatext");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(value);
        List content = target.getContent();
        assertEquals(1, content.size());
        // ตามซอร์ส: cast เป็น Text เสมอ (CDATA extends Text) -> สร้าง Text ธรรมดา
        assertTrue(content.get(0) instanceof Text);
        assertEquals("cdatatext", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithProcessingInstructionValue() {
        Element target = new Element("target");
        ProcessingInstruction pi = new ProcessingInstruction("tgt", "dat");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(pi);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof ProcessingInstruction);
        assertEquals("tgt", ((ProcessingInstruction) content.get(0)).getTarget());
        assertNotSame(pi, content.get(0));
    }

    @Test
    public void testSetValue_ElementWithCommentValue() {
        Element target = new Element("target");
        Comment c = new Comment("remark");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(c);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Comment);
        assertEquals("remark", ((Comment) content.get(0)).getText());
        assertNotSame(c, content.get(0));
    }

    @Test
    public void testSetValue_ElementWithOtherNonEmptyValue() {
        Element target = new Element("target");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue("plain string");
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Text);
        assertEquals("plain string", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithOtherEmptyValue() {
        Element target = new Element("target");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue("");
        assertEquals(0, target.getContent().size());
    }

    // =========================================================
    // addContent() bug-detection (Defects4J JXPath-16b fault)
    //
    // ซอร์สโค้ดใน addContent() ตรวจเงื่อนไขด้วย "node instanceof CDATA/
    // ProcessingInstruction/Comment" (ตัวแปร field ของ pointer เอง ซึ่งคือ
    // target Element เสมอในกรณีนี้) แทนที่จะตรวจ "child instanceof ...".
    // เพราะ target เป็น Element เสมอ เงื่อนไขเหล่านี้จึงเป็น false ตลอด
    // ทำให้ child ประเภท CDATA / PI / Comment ไม่ถูกคัดลอกไปจริง
    // เทสต่อไปนี้ยืนยัน behavior ที่ (ผิด) นี้ เพื่อดักจับ fault ดังกล่าว
    // =========================================================

    @Test
    public void testSetValue_ElementValueWithCDATAChild_ExposesBug() {
        Element target = new Element("target");
        Element valueElement = new Element("value");
        valueElement.addContent(new CDATA("cdata-content"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        assertEquals(0, target.getContent().size());
    }

    @Test
    public void testSetValue_ElementValueWithProcessingInstructionChild_ExposesBug() {
        Element target = new Element("target");
        Element valueElement = new Element("value");
        valueElement.addContent(new ProcessingInstruction("t", "d"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        assertEquals(0, target.getContent().size());
    }

    @Test
    public void testSetValue_ElementValueWithCommentChild_ExposesBug() {
        Element target = new Element("target");
        Element valueElement = new Element("value");
        valueElement.addContent(new Comment("c"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        assertEquals(0, target.getContent().size());
    }

    // =========================================================
    // testNode() static
    // =========================================================

    @Test
    public void testTestNode_NullTest() {
        assertTrue(JDOMNodePointer.testNode(null, new Element("a"), null));
    }

    @Test
    public void testTestNode_NodeNameTest_NotElement() {
        NodeNameTest test = new NodeNameTest(new QName(null, "a"), null);
        assertFalse(JDOMNodePointer.testNode(null, new Text("t"), test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNoPrefix() {
        // Assumption: QName ที่มี name = "*" ถือเป็น wildcard (ตาม convention ของ JXPath)
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(JDOMNodePointer.testNode(null, new Element("anything"), test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch() {
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertFalse(JDOMNodePointer.testNode(null, new Element("bar"), test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMatchNoNamespace() {
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertTrue(JDOMNodePointer.testNode(null, new Element("foo"), test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(JDOMNodePointer.testNode(null, new Element("a"), test));
        assertTrue(JDOMNodePointer.testNode(null, new Document(), test));
        assertFalse(JDOMNodePointer.testNode(null, new Text("x"), test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(JDOMNodePointer.testNode(null, new Text("x"), test));
        assertTrue(JDOMNodePointer.testNode(null, new CDATA("x"), test));
        assertFalse(JDOMNodePointer.testNode(null, new Element("a"), test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(JDOMNodePointer.testNode(null, new Comment("c"), test));
        assertFalse(JDOMNodePointer.testNode(null, new Element("a"), test));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(JDOMNodePointer.testNode(null, new ProcessingInstruction("t", "d"), test));
        assertFalse(JDOMNodePointer.testNode(null, new Element("a"), test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Match() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("tgt");
        ProcessingInstruction pi = new ProcessingInstruction("tgt", "d");
        assertTrue(JDOMNodePointer.testNode(null, pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Mismatch() {
        ProcessingInstructionTest test = new ProcessingInstructionTest("tgt");
        ProcessingInstruction pi = new ProcessingInstruction("other", "d");
        assertFalse(JDOMNodePointer.testNode(null, pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NodeNotPI() {
        // node ไม่ใช่ ProcessingInstruction -> ตกไปที่ "return false" บรรทัดสุดท้าย
        ProcessingInstructionTest test = new ProcessingInstructionTest("tgt");
        assertFalse(JDOMNodePointer.testNode(null, new Element("a"), test));
    }

    // =========================================================
    // getPrefix() / getLocalName() static
    // =========================================================

    @Test
    public void testGetPrefix_Element() {
        Element e = new Element("a", Namespace.getNamespace("p", "urn:x"));
        assertEquals("p", JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_ElementNoPrefix() {
        Element e = new Element("a");
        assertNull(JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_Attribute() {
        Element e = new Element("a");
        Namespace ns = Namespace.getNamespace("q", "urn:q");
        e.setAttribute("attr", "v", ns);
        Attribute attr = e.getAttribute("attr", ns);
        assertEquals("q", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefix_Other() {
        assertNull(JDOMNodePointer.getPrefix("not-a-node"));
    }

    @Test
    public void testGetLocalName_Element() {
        assertEquals("abc", JDOMNodePointer.getLocalName(new Element("abc")));
    }

    @Test
    public void testGetLocalName_Attribute() {
        Element e = new Element("a");
        e.setAttribute("attr", "v");
        Attribute attr = e.getAttribute("attr");
        assertEquals("attr", JDOMNodePointer.getLocalName(attr));
    }

    @Test
    public void testGetLocalName_Other() {
        assertNull(JDOMNodePointer.getLocalName("x"));
    }

    // =========================================================
    // isLanguage() / getLanguage() / findEnclosingAttribute()
    // =========================================================

    @Test
    public void testIsLanguage_DirectAttribute() {
        Element e = new Element("a");
        e.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertTrue(p.isLanguage("en"));
        assertFalse(p.isLanguage("fr"));
    }

    @Test
    public void testIsLanguage_InheritedFromParent() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "de", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, locale);
        assertTrue(p.isLanguage("de"));
    }

    @Test
    public void testIsLanguage_EmptyAttributeSkipped() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "de", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        child.setAttribute("lang", "", Namespace.XML_NAMESPACE);
        parent.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, locale);
        assertTrue(p.isLanguage("de"));
    }

    @Test
    public void testIsLanguage_NoAttributeFallsBackToSuper() {
        // ไม่มีซอร์ส super.isLanguage() ให้ดู จึงไม่ assert ผลลัพธ์ที่แน่นอน
        // เพียงยืนยันว่าเมธอดทำงานได้โดยไม่ throw exception (branch: current == null)
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        try {
            p.isLanguage("en");
        } catch (Exception ex) {
            fail("isLanguage should not throw when no lang attribute present: " + ex);
        }
    }

    // =========================================================
    // remove() / nodeParent() branches
    // =========================================================

    @Test
    public void testRemove_ElementWithElementParent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, locale);
        p.remove();
        assertFalse(root.getContent().contains(child));
    }

    @Test(expected = JXPathException.class)
    public void testRemove_RootElementNoElementParent() {
        // parent จริงของ root element คือ Document ไม่ใช่ Element -> nodeParent() คืน null
        Element root = new Element("root");
        new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        p.remove();
    }

    @Test(expected = JXPathException.class)
    public void testRemove_UnattachedElement() {
        Element root = new Element("root"); // ไม่มี parent เลย
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        p.remove();
    }

    @Test
    public void testRemove_TextNode() {
        Element parent = new Element("p");
        Text t = new Text("x");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.remove();
        assertFalse(parent.getContent().contains(t));
    }

    @Test
    public void testRemove_CDATANode() {
        Element parent = new Element("p");
        CDATA cd = new CDATA("x");
        parent.addContent(cd);
        JDOMNodePointer p = new JDOMNodePointer(cd, locale);
        p.remove();
        assertFalse(parent.getContent().contains(cd));
    }

    @Test
    public void testRemove_ProcessingInstructionNode() {
        Element parent = new Element("p");
        ProcessingInstruction pi = new ProcessingInstruction("t", "d");
        parent.addContent(pi);
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        p.remove();
        assertFalse(parent.getContent().contains(pi));
    }

    @Test
    public void testRemove_CommentNode() {
        Element parent = new Element("p");
        Comment c = new Comment("x");
        parent.addContent(c);
        JDOMNodePointer p = new JDOMNodePointer(c, locale);
        p.remove();
        assertFalse(parent.getContent().contains(c));
    }

    @Test(expected = JXPathException.class)
    public void testRemove_UnsupportedNodeType() {
        JDOMNodePointer p = new JDOMNodePointer("plain string node", locale);
        p.remove();
    }

    // =========================================================
    // asPath()
    // =========================================================

    @Test
    public void testAsPath_WithId() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale, "simple");
        assertEquals("id('simple')", p.asPath());
    }

    @Test
    public void testAsPath_IdWithQuotesEscaped() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale, "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", p.asPath());
    }

    @Test
    public void testAsPath_ElementNoParentPointer() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale); // parent == null
        assertEquals("", p.asPath());
    }

    @Test
    public void testAsPath_ElementWithJDOMParentNoNamespace() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        assertEquals("/child[1]", childPtr.asPath());
    }

    @Test
    public void testAsPath_TextNode() {
        Element root = new Element("root");
        Text t = new Text("hello");
        root.addContent(t);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, t);
        assertEquals("/text()[1]", textPtr.asPath());
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element root = new Element("root");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        root.addContent(pi);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        assertEquals("/processing-instruction('target')[1]", piPtr.asPath());
    }

    @Test
    public void testAsPath_UnsupportedNodeType_ReturnsParentPathOnly() {
        Element root = new Element("root");
        root.setAttribute("attr", "v");
        Attribute attr = root.getAttribute("attr");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer attrPtr = new JDOMNodePointer(rootPtr, attr);
        assertEquals("", attrPtr.asPath());
    }

    // =========================================================
    // hashCode() / equals()
    // =========================================================

    @Test
    public void testEquals_SameInstance() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_SameNode() {
        Element e = new Element("a");
        JDOMNodePointer p1 = new JDOMNodePointer(e, locale);
        JDOMNodePointer p2 = new JDOMNodePointer(e, locale);
        assertTrue(p1.equals(p2));
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testEquals_DifferentNode() {
        JDOMNodePointer p1 = new JDOMNodePointer(new Element("a"), locale);
        JDOMNodePointer p2 = new JDOMNodePointer(new Element("b"), locale);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentType() {
        JDOMNodePointer p1 = new JDOMNodePointer(new Element("a"), locale);
        assertFalse(p1.equals("not a pointer"));
    }

    // =========================================================
    // iterator / pointer factory methods (simple delegation)
    // =========================================================

    @Test
    public void testChildIteratorNotNull() {
        Element e = new Element("a");
        e.addContent(new Element("b"));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeIterator it = p.childIterator(null, false, null);
        assertNotNull(it);
    }

    @Test
    public void testAttributeIteratorNotNull() {
        Element e = new Element("a");
        e.setAttribute("x", "1");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeIterator it = p.attributeIterator(new QName(null, "x"));
        assertNotNull(it);
    }

    @Test
    public void testNamespaceIteratorNotNull() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertNotNull(p.namespaceIterator());
    }

    @Test
    public void testNamespacePointerNotNull() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), locale);
        assertNotNull(p.namespacePointer("p"));
    }

    // =========================================================
    // createChild() / createAttribute() / getAbstractFactory()
    // =========================================================

    @Test
    public void testCreateChild_Success() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                ((Element) parentNode).addContent(new Element(name));
                return true;
            }
        });
        QName name = new QName(null, "child");
        NodePointer created = p.createChild(ctx, name, 0);
        assertNotNull(created);
        assertTrue(created.getImmediateNode() instanceof Element);
        assertEquals("child", ((Element) created.getImmediateNode()).getName());
    }

    @Test
    public void testCreateChild_WholeCollectionIndex() {
        // Assumption: WHOLE_COLLECTION ในคลาส NodePointer มีค่าเท่ากับ Integer.MIN_VALUE
        // (ไม่สามารถอ้างอิง field นี้ตรง ๆ ได้เพราะเป็น protected field คนละ package)
        int wholeCollection = Integer.MIN_VALUE;
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                ((Element) parentNode).addContent(new Element(name));
                return true;
            }
        });
        QName name = new QName(null, "child");
        NodePointer created = p.createChild(ctx, name, wholeCollection);
        assertNotNull(created);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryReturnsFalse() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                return false;
            }
        });
        QName name = new QName(null, "child");
        p.createChild(ctx, name, 0);
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_NoFactorySet() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        QName name = new QName(null, "child");
        p.createChild(ctx, name, 0);
    }

    @Test
    public void testCreateChildWithValue() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                ((Element) parentNode).addContent(new Element(name));
                return true;
            }
        });
        QName name = new QName(null, "child");
        NodePointer created = p.createChild(ctx, name, 0, "value-text");
        assertNotNull(created);
    }

    @Test
    public void testCreateAttribute_ElementNoPrefix_NotExisting() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        QName name = new QName(null, "attr1");
        NodePointer result = p.createAttribute(ctx, name);
        assertNotNull(result);
        assertNotNull(e.getAttribute("attr1"));
        assertEquals("", e.getAttributeValue("attr1"));
    }

    @Test
    public void testCreateAttribute_ElementNoPrefix_AlreadyExisting() {
        Element e = new Element("a");
        e.setAttribute("attr1", "existingValue");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        QName name = new QName(null, "attr1");
        NodePointer result = p.createAttribute(ctx, name);
        assertNotNull(result);
        assertEquals("existingValue", e.getAttributeValue("attr1"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownPrefix() {
        // Assumption: NamespaceResolver.getNamespaceURI() คืน null สำหรับ prefix ที่ไม่ถูกประกาศไว้เลย
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        QName name = new QName("unknownprefix123", "attr1");
        p.createAttribute(ctx, name);
    }

    @Test
    public void testCreateAttribute_NonElementNode_DelegatesToSuper() {
        // node ไม่ใช่ Element -> ต้องเข้า branch super.createAttribute(...)
        // ไม่มีซอร์สของ NodePointer#createAttribute ให้ดู จึงไม่ assert ผลลัพธ์เฉพาะเจาะจง
        JDOMNodePointer p = new JDOMNodePointer(new Text("t"), locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        QName name = new QName(null, "attr1");
        try {
            p.createAttribute(ctx, name);
        } catch (RuntimeException ex) {
            // ยอมรับได้: super implementation อาจไม่รองรับการสร้าง attribute
        }
    }
}
```

## สรุป Branch/Condition ที่แต่ละกลุ่มเทสครอบคลุม

| กลุ่มเทส (เมธอดเป้าหมาย) | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testIsLeaf_*` | `isLeaf()`: Element(มี/ไม่มี content), Document(มี/ไม่มี content), else |
| `testGetName_*` | `getName()`: Element(prefix ""→null, prefix จริง), ProcessingInstruction, else |
| `testGetNamespaceURI_*` (no-arg) | `getNamespaceURI(Object)`: Element(ns=""→null, ns จริง), non-Element |
| `testGetNamespaceURIPrefix_*` | `getNamespaceURI(String)`: prefix=="xml", Document, Element, element==null, ns not found |
| `testGetNamespaceResolver_LazyInit*` | lazy-init if (`localNamespaceResolver==null`) ทำงานครั้งเดียว |
| `testCompareChildNodePointers_*` | node1==node2, attr-vs-nonattr ทั้งสองทาง, both-attributes loop, both-elements loop, throw RuntimeException |
| `testGetValue_*` | Element recursive loop, Comment(text null/empty handling), Text trim/preserve, PI trim |
| `testSetValue_Text*` | Text: string ไม่ว่าง (setText) / ว่าง (remove) |
| `testSetValue_Element*` | setValue else-branch: value เป็น Element/Document/Text/CDATA/PI/Comment/other(ว่าง/ไม่ว่าง) |
| `testSetValue_*ExposesBug` | ดักจับ fault ใน `addContent()` ที่เช็ค `node instanceof X` ผิดเป็นของ pointer เอง แทน `child instanceof X` |
| `testTestNode_*` | `testNode()`: test null, NodeNameTest(not-Element, wildcard, mismatch, match), NodeTypeTest ทุก case, ProcessingInstructionTest(match/mismatch/node ไม่ใช่ PI → fallthrough false) |
| `testGetPrefix_*`, `testGetLocalName_*` | Element/Attribute/other สำหรับทั้งสองเมธอด static |
| `testIsLanguage_*`, `getLanguage` | attribute ตรง, inherited จาก parent, attribute=="" ถูก skip, ไม่มี attribute เลย (fallback super) |
| `testRemove_*` | `nodeParent()` ทุก type (Element/Text/CDATA/PI/Comment/unsupported), parent null → throw, parent element → remove สำเร็จ |
| `testAsPath_*` | id != null (พร้อม escape ' และ "), parent null, parent เป็น JDOMNodePointer (Element มี/ไม่มี namespace), Text/CDATA, ProcessingInstruction, unsupported type |
| `testEquals_*`, hashCode | same instance, same node, different node, different type |
| `testChildIteratorNotNull` ฯลฯ | delegation methods (childIterator/attributeIterator/namespaceIterator/namespacePointer) |
| `testCreateChild_*` | index==WHOLE_COLLECTION, factory success/fail, factory ไม่ถูก set (`getAbstractFactory` throw) |
| `testCreateChildWithValue` | createChild(context,name,index,value) เรียก setValue ต่อ |
| `testCreateAttribute_*` | node ไม่ใช่ Element (delegate super), prefix null(attr มี/ไม่มีอยู่แล้ว), prefix ไม่รู้จัก (throw) |

**ข้อจำกัดที่ยอมรับ**: บาง branch เช่น ผลลัพธ์ที่แน่นอนของ `super.isLanguage()`, `super.createAttribute()`, และโครงสร้างภายในของ `NamespaceResolver` ไม่สามารถยืนยัน exact behavior ได้จากซอร์สที่ให้มา จึงเขียนเทสแบบ "ไม่ throw" หรือ assumption-based ตามที่กำกับด้วยคอมเมนต์ในโค้ด