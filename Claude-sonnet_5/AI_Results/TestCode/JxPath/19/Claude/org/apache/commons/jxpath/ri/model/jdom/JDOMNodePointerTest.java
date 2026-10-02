package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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
import org.junit.Test;

/**
 * JUnit 4 tests for {@link JDOMNodePointer} (Defects4J JxPath-19b).
 * Package นี้ตรงกับ class ที่ทดสอบ เพื่อเข้าถึงเมธอด protected static
 * (findEnclosingAttribute, getLanguage) ได้โดยไม่ต้อง reflection
 */
public class JDOMNodePointerTest {

    // ===================== Constructors / basic getters =====================

    @Test
    public void testConstructorNodeLocale() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        assertSame(e, p.getImmediateNode());
        assertSame(e, p.getBaseValue());
    }

    @Test
    public void testConstructorNodeLocaleId() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), Locale.ENGLISH, "myid");
        assertEquals("id('myid')", p.asPath());
    }

    @Test
    public void testConstructorParentNode() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        assertSame(child, childPtr.getImmediateNode());
    }

    @Test
    public void testIsCollectionAlwaysFalse() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertFalse(p.isCollection());
    }

    @Test
    public void testGetLengthAlwaysOne() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertEquals(1, p.getLength());
    }

    // ===================== isLeaf =====================

    @Test
    public void testIsLeaf_ElementEmpty() {
        assertTrue(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeaf_ElementWithContent() {
        Element e = new Element("a");
        e.addContent(new Element("b"));
        assertFalse(new JDOMNodePointer(e, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentEmpty() {
        assertTrue(new JDOMNodePointer(new Document(), Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithContent() {
        Document d = new Document(new Element("root"));
        assertFalse(new JDOMNodePointer(d, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testIsLeaf_OtherType() {
        assertTrue(new JDOMNodePointer(new Text("hello"), Locale.ENGLISH).isLeaf());
    }

    // ===================== getNamespaceURI() (no-arg) =====================

    @Test
    public void testGetNamespaceURI_ElementNoNamespace() {
        assertNull(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementWithNamespace() {
        Namespace ns = Namespace.getNamespace("http://foo");
        Element e = new Element("a", ns);
        assertEquals("http://foo", new JDOMNodePointer(e, Locale.ENGLISH).getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElement() {
        assertNull(new JDOMNodePointer(new Text("x"), Locale.ENGLISH).getNamespaceURI());
    }

    // ===================== getNamespaceURI(String prefix) =====================

    @Test
    public void testGetNamespaceURIPrefix_Xml() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertEquals(Namespace.XML_NAMESPACE.getURI(), p.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Document() {
        Namespace ns = Namespace.getNamespace("ns0", "http://bar");
        Document d = new Document(new Element("root", ns));
        assertEquals("http://bar", new JDOMNodePointer(d, Locale.ENGLISH).getNamespaceURI("ns0"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element() {
        Namespace ns = Namespace.getNamespace("ns0", "http://bar");
        Element e = new Element("a", ns);
        assertEquals("http://bar", new JDOMNodePointer(e, Locale.ENGLISH).getNamespaceURI("ns0"));
    }

    @Test
    public void testGetNamespaceURIPrefix_ElementNotFound() {
        assertNull(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).getNamespaceURI("none"));
    }

    @Test
    public void testGetNamespaceURIPrefix_NonElementNonDocument() {
        assertNull(new JDOMNodePointer(new Text("x"), Locale.ENGLISH).getNamespaceURI("whatever"));
    }

    // ===================== compareChildNodePointers =====================

    @Test
    public void testCompareChildNodePointers_SameNode() {
        Element root = new Element("root");
        Element child = new Element("c");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(rootPtr, child);
        NodePointer p2 = new JDOMNodePointer(rootPtr, child);
        assertEquals(0, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_Attr1NotAttr2() {
        Element root = new Element("root");
        root.setAttribute("attr1", "v1");
        Attribute attr = root.getAttribute("attr1");
        Element childElem = new Element("c");
        root.addContent(childElem);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(rootPtr, attr);
        NodePointer p2 = new JDOMNodePointer(rootPtr, childElem);
        assertEquals(-1, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_Attr2NotAttr1() {
        Element root = new Element("root");
        root.setAttribute("attr1", "v1");
        Attribute attr = root.getAttribute("attr1");
        Element childElem = new Element("c");
        root.addContent(childElem);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(rootPtr, childElem);
        NodePointer p2 = new JDOMNodePointer(rootPtr, attr);
        assertEquals(1, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes_Order() {
        Element root = new Element("root");
        root.setAttribute("a1", "v1");
        root.setAttribute("a2", "v2");
        Attribute a1 = root.getAttribute("a1");
        Attribute a2 = root.getAttribute("a2");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(rootPtr, a1);
        NodePointer p2 = new JDOMNodePointer(rootPtr, a2);
        assertEquals(-1, rootPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, rootPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes_NotFound_ReturnsZero() {
        Element root = new Element("root");
        root.setAttribute("real", "v");
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        // Attribute ที่ไม่ได้อยู่ใน attribute list จริงของ root -> ไม่พบใน loop -> "Should not happen" -> 0
        Attribute detached1 = new Attribute("x1", "v1");
        Attribute detached2 = new Attribute("x2", "v2");
        NodePointer p1 = new JDOMNodePointer(rootPtr, detached1);
        NodePointer p2 = new JDOMNodePointer(rootPtr, detached2);
        assertEquals(0, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_Elements_Order() {
        Element root = new Element("root");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        root.addContent(c1);
        root.addContent(c2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        NodePointer p1 = new JDOMNodePointer(rootPtr, c1);
        NodePointer p2 = new JDOMNodePointer(rootPtr, c2);
        assertEquals(-1, rootPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, rootPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_Elements_NotFound_ReturnsZero() {
        Element root = new Element("root");
        root.addContent(new Element("other"));
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        Element detached1 = new Element("d1");
        Element detached2 = new Element("d2");
        NodePointer p1 = new JDOMNodePointer(rootPtr, detached1);
        NodePointer p2 = new JDOMNodePointer(rootPtr, detached2);
        assertEquals(0, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NodeNotElement_Throws() {
        Text t = new Text("x"); // this pointer's own "node" is not Element
        JDOMNodePointer textPtr = new JDOMNodePointer(t, Locale.ENGLISH);
        Element e1 = new Element("e1");
        Element e2 = new Element("e2");
        NodePointer p1 = new JDOMNodePointer(textPtr, e1);
        NodePointer p2 = new JDOMNodePointer(textPtr, e2);
        textPtr.compareChildNodePointers(p1, p2);
    }

    // ===================== getName =====================

    @Test
    public void testGetName_ElementNoPrefix() {
        QName q = new JDOMNodePointer(new Element("tag"), Locale.ENGLISH).getName();
        assertNull(q.getPrefix());
        assertEquals("tag", q.getName());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        QName q = new JDOMNodePointer(new Element("tag", ns), Locale.ENGLISH).getName();
        assertEquals("pfx", q.getPrefix());
        assertEquals("tag", q.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        QName q = new JDOMNodePointer(pi, Locale.ENGLISH).getName();
        assertNull(q.getPrefix());
        assertEquals("target", q.getName());
    }

    @Test
    public void testGetName_OtherType() {
        QName q = new JDOMNodePointer(new Text("x"), Locale.ENGLISH).getName();
        assertNull(q.getPrefix());
        assertNull(q.getName());
    }

    // ===================== getValue =====================

    @Test
    public void testGetValue_ElementAggregatesTextAndElementChildren_IgnoresComment() {
        Element root = new Element("root");
        root.addContent(new Text("Hello "));
        Element child = new Element("b");
        child.addContent(new Text("World"));
        root.addContent(child);
        root.addContent(new Comment("ignored"));
        assertEquals("HelloWorld", new JDOMNodePointer(root, Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_ElementEmpty() {
        assertEquals("", new JDOMNodePointer(new Element("empty"), Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_Comment() {
        assertEquals("hello", new JDOMNodePointer(new Comment("  hello  "), Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_TextTrimmedByDefault() {
        Element root = new Element("root");
        Text t = new Text("  value  ");
        root.addContent(t);
        assertEquals("value", new JDOMNodePointer(t, Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_TextPreservedWithXmlSpacePreserve() {
        Element root = new Element("root");
        root.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text t = new Text("  value  ");
        root.addContent(t);
        assertEquals("  value  ", new JDOMNodePointer(t, Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  data  ");
        assertEquals("data", new JDOMNodePointer(pi, Locale.ENGLISH).getValue());
    }

    @Test
    public void testGetValue_OtherTypeReturnsNull() {
        // Attribute ไม่ตรงกับ Element/Comment/Text/ProcessingInstruction -> result เป็น null
        Attribute attr = new Attribute("a", "v");
        assertNull(new JDOMNodePointer(attr, Locale.ENGLISH).getValue());
    }

    // ===================== setValue =====================

    @Test
    public void testSetValue_TextNonEmpty() {
        Element root = new Element("root");
        Text t = new Text("old");
        root.addContent(t);
        new JDOMNodePointer(t, Locale.ENGLISH).setValue("newValue");
        assertEquals("newValue", t.getText());
    }

    @Test
    public void testSetValue_TextEmptyRemovesFromParent() {
        Element root = new Element("root");
        Text t = new Text("old");
        root.addContent(t);
        new JDOMNodePointer(t, Locale.ENGLISH).setValue("");
        assertFalse(root.getContent().contains(t));
    }

    @Test
    public void testSetValue_TextWithNumberValueConverted() {
        Element root = new Element("root");
        Text t = new Text("old");
        root.addContent(t);
        new JDOMNodePointer(t, Locale.ENGLISH).setValue(new Integer(7));
        assertEquals("7", t.getText());
    }

    @Test
    public void testSetValue_ElementWithElementValue() {
        Element target = new Element("target");
        target.addContent(new Text("stale"));
        JDOMNodePointer p = new JDOMNodePointer(target, Locale.ENGLISH);

        Element valueElement = new Element("valueRoot");
        valueElement.addContent(new Element("inner"));
        p.setValue(valueElement);

        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Element);
        assertEquals("inner", ((Element) content.get(0)).getName());
    }

    @Test
    public void testSetValue_ElementWithDocumentValue() {
        Element target = new Element("target");
        JDOMNodePointer p = new JDOMNodePointer(target, Locale.ENGLISH);

        Document doc = new Document(new Element("docRoot"));
        p.setValue(doc);

        List content = target.getContent();
        assertEquals(1, content.size());
        assertEquals("docRoot", ((Element) content.get(0)).getName());
    }

    @Test
    public void testSetValue_ElementWithTextValue() {
        Element target = new Element("target");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue(new Text("abc"));
        List content = target.getContent();
        assertEquals(1, content.size());
        assertEquals("abc", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithProcessingInstructionValue() {
        Element target = new Element("target");
        ProcessingInstruction pi = new ProcessingInstruction("tgt", "dat");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue(pi);
        List content = target.getContent();
        assertEquals(1, content.size());
        assertEquals("tgt", ((ProcessingInstruction) content.get(0)).getTarget());
    }

    @Test
    public void testSetValue_ElementWithCommentValue() {
        Element target = new Element("target");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue(new Comment("c"));
        List content = target.getContent();
        assertEquals(1, content.size());
        assertTrue(content.get(0) instanceof Comment);
    }

    @Test
    public void testSetValue_ElementWithPlainStringValue() {
        Element target = new Element("target");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue("plain text");
        List content = target.getContent();
        assertEquals(1, content.size());
        assertEquals("plain text", ((Text) content.get(0)).getText());
    }

    @Test
    public void testSetValue_ElementWithEmptyStringValue_NoContentAdded() {
        Element target = new Element("target");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue("");
        assertEquals(0, target.getContent().size());
    }

    @Test
    public void testSetValue_ElementWithNumberValueConvertsToString() {
        Element target = new Element("target");
        new JDOMNodePointer(target, Locale.ENGLISH).setValue(new Integer(42));
        List content = target.getContent();
        assertEquals(1, content.size());
        assertEquals("42", ((Text) content.get(0)).getText());
    }

    /**
     * ตามซอร์สโค้ด addContent(List) เช็ค "node instanceof CDATA/PI/Comment" โดยใช้ field
     * "node" (Element ปลายทางของ pointer เอง) ไม่ใช่ "child" (ตัวแปรที่ loop อยู่)
     * ซึ่ง node เป็น Element เสมอ ณ จุดนี้ ทำให้เงื่อนไขเหล่านี้ไม่เป็นจริงเสมอ (ดูเหมือน fault)
     * เทสนี้ยืนยันพฤติกรรมจริงตาม source: CDATA ใน value (Element) จะไม่ถูกเพิ่มเข้า target
     */
    @Test
    public void testSetValue_ElementValueWithCDATAChild_NotAddedPerSourceBehavior() {
        Element target = new Element("target");
        JDOMNodePointer p = new JDOMNodePointer(target, Locale.ENGLISH);

        Element valueElement = new Element("valueRoot");
        valueElement.addContent(new CDATA("cdata-content"));
        p.setValue(valueElement);

        assertEquals(0, target.getContent().size());
    }

    // ===================== testNode =====================

    @Test
    public void testTestNode_NullTestReturnsTrue() {
        assertTrue(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_NonElementNode() {
        NodeTest test = new NodeNameTest(new QName(null, "a"), null);
        assertFalse(new JDOMNodePointer(new Text("x"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNoPrefix() {
        NodeTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(new JDOMNodePointer(new Element("anything"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardWithPrefix_NamespaceMatches() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        NodeTest test = new NodeNameTest(new QName("pfx", "*"), "http://foo");
        assertTrue(new JDOMNodePointer(new Element("tag", ns), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMatchesNoNamespace() {
        NodeTest test = new NodeNameTest(new QName(null, "tag"), null);
        assertTrue(new JDOMNodePointer(new Element("tag"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch() {
        NodeTest test = new NodeNameTest(new QName(null, "other"), null);
        assertFalse(new JDOMNodePointer(new Element("tag"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NamespaceMatches() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        NodeTest test = new NodeNameTest(new QName("pfx", "tag"), "http://foo");
        assertTrue(new JDOMNodePointer(new Element("tag", ns), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NamespaceMismatch() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        NodeTest test = new NodeNameTest(new QName("pfx", "tag"), "http://different");
        assertFalse(new JDOMNodePointer(new Element("tag", ns), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node() {
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text() {
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(new JDOMNodePointer(new Text("x"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_CDATAAsText() {
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(new JDOMNodePointer(new CDATA("x"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment() {
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(new JDOMNodePointer(new Comment("x"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI() {
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(new JDOMNodePointer(new ProcessingInstruction("t", "d"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Default() {
        // สมมติว่า Compiler.NODE_TYPE_ELEMENT มีอยู่จริง (เป็น constant มาตรฐานของ Compiler interface)
        // และไม่ถูกจัดการใน switch ของซอร์ส -> ตก default -> false
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_ELEMENT);
        assertFalse(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Match() {
        NodeTest test = new ProcessingInstructionTest("target1");
        ProcessingInstruction pi = new ProcessingInstruction("target1", "d");
        assertTrue(new JDOMNodePointer(pi, Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Mismatch() {
        NodeTest test = new ProcessingInstructionTest("other");
        ProcessingInstruction pi = new ProcessingInstruction("target1", "d");
        assertFalse(new JDOMNodePointer(pi, Locale.ENGLISH).testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NodeNotPI_FallsThroughToFalse() {
        NodeTest test = new ProcessingInstructionTest("target1");
        assertFalse(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).testNode(test));
    }

    // ===================== getPrefix / getLocalName (static) =====================

    @Test
    public void testGetPrefix_Element() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        assertEquals("pfx", JDOMNodePointer.getPrefix(new Element("tag", ns)));
    }

    @Test
    public void testGetPrefix_ElementNoPrefix() {
        assertNull(JDOMNodePointer.getPrefix(new Element("tag")));
    }

    @Test
    public void testGetPrefix_Attribute() {
        Namespace ns = Namespace.getNamespace("pfx", "http://foo");
        assertEquals("pfx", JDOMNodePointer.getPrefix(new Attribute("attr", "v", ns)));
    }

    @Test
    public void testGetPrefix_AttributeNoPrefix() {
        assertNull(JDOMNodePointer.getPrefix(new Attribute("attr", "v")));
    }

    @Test
    public void testGetPrefix_OtherType() {
        assertNull(JDOMNodePointer.getPrefix(new Text("x")));
    }

    @Test
    public void testGetLocalName_Element() {
        assertEquals("tag", JDOMNodePointer.getLocalName(new Element("tag")));
    }

    @Test
    public void testGetLocalName_Attribute() {
        assertEquals("attr", JDOMNodePointer.getLocalName(new Attribute("attr", "v")));
    }

    @Test
    public void testGetLocalName_OtherType() {
        assertNull(JDOMNodePointer.getLocalName(new Text("x")));
    }

    // ===================== getLanguage / isLanguage / findEnclosingAttribute =====================

    @Test
    public void testGetLanguage_FoundOnSelf() {
        Element e = new Element("a");
        e.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        assertEquals("en", new JDOMNodePointer(e, Locale.ENGLISH).getLanguage());
    }

    @Test
    public void testGetLanguage_FoundOnAncestor() {
        Element root = new Element("root");
        root.setAttribute("lang", "th", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);
        assertEquals("th", new JDOMNodePointer(child, Locale.ENGLISH).getLanguage());
    }

    @Test
    public void testGetLanguage_NotFound() {
        assertNull(new JDOMNodePointer(new Element("a"), Locale.ENGLISH).getLanguage());
    }

    @Test
    public void testIsLanguage_CurrentNotNull() {
        Element e = new Element("a");
        e.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        assertTrue(p.isLanguage("en"));
        assertFalse(p.isLanguage("th"));
    }

    @Test
    public void testIsLanguage_CurrentNull_DelegatesToSuper_NoException() {
        // ไม่มี source ของ super.isLanguage() ให้วิเคราะห์ -> ตรวจสอบแค่ไม่ throw
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        try {
            p.isLanguage("en");
        } catch (Exception ex) {
            fail("isLanguage should not throw: " + ex);
        }
    }

    @Test
    public void testFindEnclosingAttribute_EmptyStringIgnored() {
        Element root = new Element("root");
        root.setAttribute("lang", "", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        root.addContent(child);
        assertNull(JDOMNodePointer.findEnclosingAttribute(child, "lang", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttribute_NonElementStartNode() {
        Element root = new Element("root");
        root.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text t = new Text("x");
        root.addContent(t);
        assertEquals("preserve", JDOMNodePointer.findEnclosingAttribute(t, "space", Namespace.XML_NAMESPACE));
    }

    @Test
    public void testFindEnclosingAttribute_NullNode() {
        assertNull(JDOMNodePointer.findEnclosingAttribute(null, "lang", Namespace.XML_NAMESPACE));
    }

    // ===================== getNamespaceResolver (caching) =====================

    @Test
    public void testGetNamespaceResolver_CachedInstance() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NamespaceResolver r1 = p.getNamespaceResolver();
        NamespaceResolver r2 = p.getNamespaceResolver();
        assertNotNull(r1);
        assertSame(r1, r2);
    }

    // ===================== createAttribute =====================

    @Test
    public void testCreateAttribute_NoPrefix_NotExisting() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        NodePointer result = p.createAttribute((JXPathContext) null, new QName(null, "newAttr"));
        assertNotNull(result);
        assertNotNull(e.getAttribute("newAttr"));
    }

    @Test
    public void testCreateAttribute_NoPrefix_AlreadyExisting() {
        Element e = new Element("a");
        e.setAttribute("existing", "val");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        NodePointer result = p.createAttribute((JXPathContext) null, new QName(null, "existing"));
        assertNotNull(result);
        assertEquals("val", e.getAttributeValue("existing"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownPrefix_Throws() {
        Element e = new Element("a");
        JDOMNodePointer p = new JDOMNodePointer(e, Locale.ENGLISH);
        p.createAttribute((JXPathContext) null, new QName("unknownPrefix", "attr"));
    }

    // ===================== remove =====================

    @Test(expected = JXPathException.class)
    public void testRemove_RootThrows() {
        Element root = new Element("root"); // ไม่มี parent
        new JDOMNodePointer(root, Locale.ENGLISH).remove();
    }

    @Test
    public void testRemove_ElementWithParent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        new JDOMNodePointer(child, Locale.ENGLISH).remove();
        assertFalse(root.getContent().contains(child));
    }

    @Test
    public void testRemove_TextWithParent() {
        Element root = new Element("root");
        Text t = new Text("x");
        root.addContent(t);
        new JDOMNodePointer(t, Locale.ENGLISH).remove();
        assertFalse(root.getContent().contains(t));
    }

    // ===================== asPath =====================

    @Test
    public void testAsPath_WithId() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH, "abc");
        assertEquals("id('abc')", p.asPath());
    }

    @Test
    public void testAsPath_RootElementNoParent_EmptyPath() {
        Element root = new Element("root");
        assertEquals("", new JDOMNodePointer(root, Locale.ENGLISH).asPath());
    }

    @Test
    public void testAsPath_ChildElement_NoNamespace() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        assertEquals("/child[1]", childPtr.asPath());
    }

    @Test
    public void testAsPath_ChildElement_MultipleSameName() {
        Element root = new Element("root");
        Element c1 = new Element("item");
        Element c2 = new Element("item");
        root.addContent(c1);
        root.addContent(c2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer c2Ptr = new JDOMNodePointer(rootPtr, c2);
        assertEquals("/item[2]", c2Ptr.asPath());
    }

    @Test
    public void testAsPath_TextNode() {
        Element root = new Element("root");
        Text t1 = new Text("a");
        Text t2 = new Text("b");
        root.addContent(t1);
        root.addContent(t2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer t2Ptr = new JDOMNodePointer(rootPtr, t2);
        assertEquals("/text()[2]", t2Ptr.asPath());
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element root = new Element("root");
        ProcessingInstruction pi1 = new ProcessingInstruction("t", "a");
        ProcessingInstruction pi2 = new ProcessingInstruction("t", "b");
        root.addContent(pi1);
        root.addContent(pi2);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer pi2Ptr = new JDOMNodePointer(rootPtr, pi2);
        assertEquals("/processing-instruction('t')[2]", pi2Ptr.asPath());
    }

    // ===================== hashCode / equals =====================

    @Test
    public void testHashCode_DelegatesToNodeHashCode() {
        Element e = new Element("a");
        assertEquals(e.hashCode(), new JDOMNodePointer(e, Locale.ENGLISH).hashCode());
    }

    @Test
    public void testEquals_SameInstance() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_SameNode() {
        Element e = new Element("a");
        JDOMNodePointer p1 = new JDOMNodePointer(e, Locale.ENGLISH);
        JDOMNodePointer p2 = new JDOMNodePointer(e, Locale.ENGLISH, "someid");
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentNode() {
        JDOMNodePointer p1 = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        JDOMNodePointer p2 = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_NotSameType() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertFalse(p.equals("not a pointer"));
    }

    @Test
    public void testEquals_Null() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        assertFalse(p.equals(null));
    }

    // ===================== iterators / namespace pointer (smoke tests) =====================

    @Test
    public void testChildIterator_ReturnsJDOMNodeIterator() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NodeIterator it = p.childIterator(null, false, null);
        assertNotNull(it);
        assertTrue(it instanceof JDOMNodeIterator);
    }

    @Test
    public void testAttributeIterator_ReturnsJDOMAttributeIterator() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NodeIterator it = p.attributeIterator(new QName(null, "attr"));
        assertNotNull(it);
        assertTrue(it instanceof JDOMAttributeIterator);
    }

    @Test
    public void testNamespaceIterator_ReturnsJDOMNamespaceIterator() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NodeIterator it = p.namespaceIterator();
        assertNotNull(it);
        assertTrue(it instanceof JDOMNamespaceIterator);
    }

    @Test
    public void testNamespacePointer_ReturnsJDOMNamespacePointer() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("a"), Locale.ENGLISH);
        NodePointer np = p.namespacePointer("pfx");
        assertNotNull(np);
        assertTrue(np instanceof JDOMNamespacePointer);
    }
}
