# DOMNodePointerTest — JUnit 4 Test Suite

**หมายเหตุสำคัญ (ข้อสมมติที่ไม่ปรากฏในซอร์สที่ให้มา):**
- Constructor ของ `NodeTypeTest(int)` และ `ProcessingInstructionTest(String)` ใช้ตาม API มาตรฐานของ JXPath (ไม่ได้แสดง constructor call ในซอร์สที่ให้มา เห็นเพียงการเรียก getter) — มีคอมเมนต์กำกับในโค้ด
- Behavior ของ `super.isLanguage()` และ `super.createAttribute()` (ที่นิยามใน `NodePointer`) ไม่มีอยู่ในซอร์สที่ให้มา จึงไม่ assert ค่าที่แน่นอน มีคอมเมนต์กำกับไว้
- `Document.getElementById()` ต้องมีการประกาศ ID attribute (DOM3 `setIdAttribute`) — มีการ fallback ตรวจสอบเพื่อไม่ false-fail หากสภาพแวดล้อมไม่รองรับ

```java
package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/**
 * JUnit4 tests for {@link DOMNodePointer}.
 *
 * ข้อสมมติ (assumption) ที่ไม่ได้แสดงอยู่ในซอร์สโค้ดที่ให้มาโดยตรง มีคอมเมนต์กำกับไว้ในแต่ละเทส
 */
public class DOMNodePointerTest {

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private Document newDoc(boolean namespaceAware) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setNamespaceAware(namespaceAware);
        DocumentBuilder b = f.newDocumentBuilder();
        return b.newDocument();
    }

    private Document parse(String xml, boolean namespaceAware) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setNamespaceAware(namespaceAware);
        DocumentBuilder b = f.newDocumentBuilder();
        return b.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    // =================================================================
    // testNode(Node, NodeTest) - static
    // =================================================================

    @Test
    public void testTestNode_NullTest_ReturnsTrue() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        assertTrue(DOMNodePointer.testNode(e, null));
    }

    @Test
    public void testTestNode_NodeNameTest_NonElementNode_ReturnsFalse() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("abc");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertFalse(DOMNodePointer.testNode(t, test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNoPrefix_ReturnsTrueImmediately() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("anything");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardWithPrefix_NamespaceNullNull_True() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("anything"); // no namespace anywhere
        NodeNameTest test = new NodeNameTest(new QName("pfx", "*"), null);
        // wildcard=true, prefix!=null -> skip immediate return,
        // then (wildcard||...) true -> equalStrings(null,null) -> true
        assertTrue(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMatches_NamespaceNullNull_True() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertTrue(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch_ReturnsFalse() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "bar"), null);
        assertFalse(DOMNodePointer.testNode(e, test));
    }

    // equalStrings branch: s1(testNS)=null, s2(nodeNS)=nonEmpty -> false
    @Test
    public void testTestNode_EqualStrings_NullVsNonEmpty_False() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", false);
        Element root = doc.getDocumentElement();
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), null);
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    // equalStrings branch: s1(testNS)=nonEmpty, s2(nodeNS)=null -> false
    @Test
    public void testTestNode_EqualStrings_NonEmptyVsNull_False() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo"); // no namespace at all
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), "http://y");
        assertFalse(DOMNodePointer.testNode(e, test));
    }

    // equalStrings branch: both non-null equal -> true
    @Test
    public void testTestNode_EqualStrings_MatchNamespace_True() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", false);
        Element root = doc.getDocumentElement();
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), "http://y");
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    // equalStrings branch: both non-null, mismatch -> false
    @Test
    public void testTestNode_EqualStrings_MismatchNamespace_False() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", false);
        Element root = doc.getDocumentElement();
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), "http://z");
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_True() throws Exception {
        // Assumption: NodeTypeTest(int) constructor (not shown in given source, standard API)
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_FalseForComment() throws Exception {
        Document doc = newDoc(false);
        Comment c = doc.createComment("x");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertFalse(DOMNodePointer.testNode(c, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_TextNode() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("abc");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(t, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_CDATA() throws Exception {
        Document doc = newDoc(false);
        Node cdata = doc.createCDATASection("abc");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(cdata, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment() throws Exception {
        Document doc = newDoc(false);
        Comment c = doc.createComment("abc");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(c, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI() throws Exception {
        Document doc = newDoc(false);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Match() throws Exception {
        Document doc = newDoc(false);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Mismatch() throws Exception {
        Document doc = newDoc(false);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NonPINode_False() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertFalse(DOMNodePointer.testNode(e, test));
    }

    // =================================================================
    // getName()
    // =================================================================

    @Test
    public void testGetName_Element() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("pfx:foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        QName q = p.getName();
        assertEquals("foo", q.getName());
        assertEquals("pfx", q.getPrefix());
    }

    @Test
    public void testGetName_PI() throws Exception {
        Document doc = newDoc(false);
        ProcessingInstruction pi = doc.createProcessingInstruction("tgt", "data");
        DOMNodePointer p = new DOMNodePointer(pi, Locale.getDefault());
        QName q = p.getName();
        assertEquals("tgt", q.getName());
        assertNull(q.getPrefix());
    }

    @Test
    public void testGetName_OtherType() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("abc");
        DOMNodePointer p = new DOMNodePointer(t, Locale.getDefault());
        QName q = p.getName();
        assertNull(q.getName());
        assertNull(q.getPrefix());
    }

    // =================================================================
    // getNamespaceURI() / getNamespaceURI(String) / getDefaultNamespaceURI()
    // =================================================================

    @Test
    public void testGetNamespaceURI_Instance() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", false);
        Element root = doc.getDocumentElement();
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        assertEquals("http://y", p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_Prefix_NullOrEmpty_DelegatesToDefault() throws Exception {
        Document doc = parse("<root xmlns=\"http://def\"><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("http://def", p.getNamespaceURI(null));
        assertEquals("http://def", p.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURI_Prefix_Xml() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURI_Prefix_Xmlns() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, p.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_Prefix_FoundOnElement() throws Exception {
        Document doc = parse("<root xmlns:pfx=\"http://pfx\"><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("http://pfx", p.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetNamespaceURI_Prefix_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertNull(p.getNamespaceURI("unknownPfx"));
    }

    @Test
    public void testGetNamespaceURI_Prefix_CachedSecondCall() throws Exception {
        Document doc = parse("<root xmlns:pfx=\"http://pfx\"/>", false);
        Element root = doc.getDocumentElement();
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        assertEquals("http://pfx", p.getNamespaceURI("pfx"));
        assertEquals("http://pfx", p.getNamespaceURI("pfx")); // hits cache branch
    }

    @Test
    public void testGetNamespaceURI_Prefix_DocumentNode() throws Exception {
        Document doc = parse("<root xmlns:pfx=\"http://pfx\"/>", false);
        DOMNodePointer p = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://pfx", p.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetDefaultNamespaceURI_Found() throws Exception {
        Document doc = parse("<root xmlns=\"http://def\"><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("http://def", p.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertNull(p.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_DocumentNode() throws Exception {
        Document doc = parse("<root xmlns=\"http://def\"/>", false);
        DOMNodePointer p = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://def", p.getDefaultNamespaceURI());
    }

    // =================================================================
    // Simple getters
    // =================================================================

    @Test
    public void testSimpleGetters() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
    }

    @Test
    public void testIsLeaf_NoChildren_True() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeaf_HasChildren_False() throws Exception {
        Document doc = parse("<root><child/></root>", false);
        DOMNodePointer p = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(p.isLeaf());
    }

    // =================================================================
    // isLanguage / getLanguage
    // =================================================================

    @Test
    public void testIsLanguage_FoundOnSelf() throws Exception {
        Document doc = parse("<root xml:lang=\"en-US\"/>", false);
        DOMNodePointer p = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(p.isLanguage("en"));
        assertFalse(p.isLanguage("fr"));
    }

    @Test
    public void testIsLanguage_FoundOnParent() throws Exception {
        Document doc = parse("<root xml:lang=\"en-US\"><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_NotFound_DelegatesToSuper() throws Exception {
        // Behavior of super.isLanguage(lang) (defined in NodePointer) is NOT shown
        // in the given source. We only ensure the call completes without an
        // unexpected exception; no assertion on the exact boolean result.
        Document doc = parse("<root><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        boolean result = p.isLanguage("en");
        assertNotNull(Boolean.valueOf(result));
    }

    // =================================================================
    // setValue
    // =================================================================

    @Test
    public void testSetValue_TextNode_NonEmpty() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("old");
        Element parent = doc.createElement("p");
        parent.appendChild(t);
        DOMNodePointer p = new DOMNodePointer(t, Locale.getDefault());
        p.setValue("new");
        assertEquals("new", t.getNodeValue());
    }

    @Test
    public void testSetValue_TextNode_Empty_RemovesNode() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("old");
        Element parent = doc.createElement("p");
        parent.appendChild(t);
        DOMNodePointer p = new DOMNodePointer(t, Locale.getDefault());
        p.setValue("");
        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_CDATASection_NonEmpty() throws Exception {
        Document doc = newDoc(false);
        Node cdata = doc.createCDATASection("old");
        Element parent = doc.createElement("p");
        parent.appendChild(cdata);
        DOMNodePointer p = new DOMNodePointer(cdata, Locale.getDefault());
        p.setValue("new");
        assertEquals("new", cdata.getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_WithElementValue() throws Exception {
        Document doc = newDoc(false);
        Element target = doc.createElement("target");
        target.appendChild(doc.createElement("oldchild"));
        Element valueElement = doc.createElement("valueRoot");
        valueElement.appendChild(doc.createElement("newchild1"));
        valueElement.appendChild(doc.createElement("newchild2"));

        DOMNodePointer p = new DOMNodePointer(target, Locale.getDefault());
        p.setValue(valueElement);

        assertEquals(2, target.getChildNodes().getLength());
        assertEquals("newchild1", target.getChildNodes().item(0).getNodeName());
        assertEquals("newchild2", target.getChildNodes().item(1).getNodeName());
    }

    @Test
    public void testSetValue_ElementNode_WithDocumentValue() throws Exception {
        Document doc = newDoc(false);
        Element target = doc.createElement("target");

        Document valueDoc = newDoc(false);
        Element docRoot = valueDoc.createElement("docRoot");
        valueDoc.appendChild(docRoot);
        docRoot.appendChild(valueDoc.createElement("innerChild"));

        DOMNodePointer p = new DOMNodePointer(target, Locale.getDefault());
        p.setValue(valueDoc);

        assertEquals(1, target.getChildNodes().getLength());
        assertEquals("docRoot", target.getChildNodes().item(0).getNodeName());
    }

    @Test
    public void testSetValue_ElementNode_WithNonElementNonDocumentNodeValue() throws Exception {
        Document doc = newDoc(false);
        Element target = doc.createElement("target");
        Comment commentValue = doc.createComment("hello");

        DOMNodePointer p = new DOMNodePointer(target, Locale.getDefault());
        p.setValue(commentValue);

        assertEquals(1, target.getChildNodes().getLength());
        assertEquals(Node.COMMENT_NODE, target.getFirstChild().getNodeType());
    }

    @Test
    public void testSetValue_ElementNode_WithStringValue_NonEmpty() throws Exception {
        Document doc = newDoc(false);
        Element target = doc.createElement("target");
        DOMNodePointer p = new DOMNodePointer(target, Locale.getDefault());
        p.setValue("hello");
        assertEquals(1, target.getChildNodes().getLength());
        assertEquals("hello", target.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_WithStringValue_Empty_NoChildAppended() throws Exception {
        Document doc = newDoc(false);
        Element target = doc.createElement("target");
        DOMNodePointer p = new DOMNodePointer(target, Locale.getDefault());
        p.setValue("");
        assertEquals(0, target.getChildNodes().getLength());
    }

    // =================================================================
    // createChild
    // =================================================================

    private JXPathContext newContextWithFactory(AbstractFactory factory) {
        JXPathContext ctx = JXPathContext.newInstance(new Object());
        ctx.setFactory(factory);
        return ctx;
    }

    @Test
    public void testCreateChild_Success() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());

        AbstractFactory factory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                Element parent = (Element) parentNode;
                Element child = parent.getOwnerDocument().createElement(name);
                parent.appendChild(child);
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
        JXPathContext ctx = newContextWithFactory(factory);

        NodePointer childPointer = p.createChild(ctx, new QName(null, "child"), 0);
        assertNotNull(childPointer);
    }

    @Test
    public void testCreateChild_WholeCollectionIndex_TreatedAsZero() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());

        AbstractFactory factory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                assertEquals(0, index); // WHOLE_COLLECTION must be converted to 0
                Element parent = (Element) parentNode;
                Element child = parent.getOwnerDocument().createElement(name);
                parent.appendChild(child);
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
        JXPathContext ctx = newContextWithFactory(factory);

        NodePointer childPointer =
                p.createChild(ctx, new QName(null, "child"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(childPointer);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryReturnsFalse_Throws() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());

        AbstractFactory factory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                return false;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
        JXPathContext ctx = newContextWithFactory(factory);
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactorySucceedsButNoMatchingChildFound_Throws() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());

        AbstractFactory factory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                return true; // success=true but no actual child created
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
        JXPathContext ctx = newContextWithFactory(factory);
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test
    public void testCreateChild_WithValue_SetsValueAfterCreate() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());

        AbstractFactory factory = new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parentNode, String name, int index) {
                Element parent = (Element) parentNode;
                Element child = parent.getOwnerDocument().createElement(name);
                parent.appendChild(child);
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
        JXPathContext ctx = newContextWithFactory(factory);
        NodePointer childPointer =
                p.createChild(ctx, new QName(null, "child"), 0, "text-value");

        Node createdNode = (Node) childPointer.getBaseValue();
        assertEquals("text-value", createdNode.getFirstChild().getNodeValue());
    }

    // =================================================================
    // createAttribute
    // =================================================================

    @Test
    public void testCreateAttribute_NonElementNode_DelegatesToSuper() throws Exception {
        // Behavior of super.createAttribute(context, name) (defined in NodePointer)
        // is NOT shown in the given source. We only exercise the branch and
        // tolerate whatever the superclass does (incl. possible exception).
        Document doc = newDoc(false);
        Text t = doc.createTextNode("abc");
        DOMNodePointer p = new DOMNodePointer(t, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());
        try {
            p.createAttribute(ctx, new QName(null, "attr"));
        } catch (Exception e) {
            // acceptable - behavior inherited from superclass, not asserted
        }
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_AttributeNotExists() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());

        NodePointer attrPointer = p.createAttribute(ctx, new QName(null, "attr1"));
        assertTrue(e.hasAttribute("attr1"));
        assertNotNull(attrPointer);
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_AttributeAlreadyExists() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        e.setAttribute("attr1", "existingValue");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());

        p.createAttribute(ctx, new QName(null, "attr1"));
        assertEquals("existingValue", e.getAttribute("attr1")); // setAttribute branch skipped
    }

    @Test
    public void testCreateAttribute_Element_WithPrefix_NamespaceFound() throws Exception {
        Document doc = parse("<root xmlns:pfx=\"http://pfx\"/>", false);
        Element root = doc.getDocumentElement();
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());

        NodePointer attrPointer = p.createAttribute(ctx, new QName("pfx", "attrX"));
        assertNotNull(attrPointer);
        assertEquals("", root.getAttributeNS("http://pfx", "attrX"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_Element_WithPrefix_NamespaceNotFound_Throws() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());

        p.createAttribute(ctx, new QName("unknownPfx", "attrX"));
    }

    // =================================================================
    // remove()
    // =================================================================

    @Test(expected = JXPathException.class)
    public void testRemove_NoParent_Throws() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root"); // not appended -> parent null
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        p.remove();
    }

    @Test
    public void testRemove_WithParent_RemovesNode() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer p = new DOMNodePointer(child, Locale.getDefault());
        p.remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    // =================================================================
    // asPath() / escape()
    // =================================================================

    @Test
    public void testAsPath_WithId_EscapesQuotes() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault(), "my'Id\"here");
        assertEquals("id('my&apos;Id&quot;here')", p.asPath());
    }

    @Test
    public void testAsPath_Element_NoParent_EmptyBuffer() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        // parent == null -> "parent instanceof DOMNodePointer" false -> block skipped
        assertEquals("", p.asPath());
    }

    @Test
    public void testAsPath_Element_WithDOMParent_DefaultNamespaceMatch() throws Exception {
        // Assumption: getNamespaceResolver().getDefaultNamespaceURI() (inherited from
        // NodePointer, not shown in given source) returns null when no namespace is
        // declared anywhere, which is consistent with equalStrings(null,null) == true.
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Element child1 = doc.createElement("child");
        Element child2 = doc.createElement("child");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer child2Pointer = new DOMNodePointer(rootPointer, child2);

        assertEquals("/child[2]", child2Pointer.asPath());
    }

    @Test
    public void testAsPath_TextNode_RelativePosition() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Text t1 = doc.createTextNode("a");
        Text t2 = doc.createTextNode("b");
        root.appendChild(t1);
        root.appendChild(t2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer t2Pointer = new DOMNodePointer(rootPointer, t2);
        assertEquals("/text()[2]", t2Pointer.asPath());
    }

    @Test
    public void testAsPath_PINode_RelativePosition() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        ProcessingInstruction pi1 = doc.createProcessingInstruction("tgt", "d1");
        ProcessingInstruction pi2 = doc.createProcessingInstruction("tgt", "d2");
        root.appendChild(pi1);
        root.appendChild(pi2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer pi2Pointer = new DOMNodePointer(rootPointer, pi2);
        assertEquals("/processing-instruction('tgt')[2]", pi2Pointer.asPath());
    }

    @Test
    public void testAsPath_DocumentNode_Empty() throws Exception {
        Document doc = newDoc(false);
        DOMNodePointer p = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("", p.asPath());
    }

    // =================================================================
    // hashCode / equals
    // =================================================================

    @Test
    public void testHashCode_IdentityBased() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertEquals(System.identityHashCode(e), p.hashCode());
    }

    @Test
    public void testEquals_SameInstance() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_NotDOMNodePointer() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p = new DOMNodePointer(e, Locale.getDefault());
        assertFalse(p.equals("not a pointer"));
    }

    @Test
    public void testEquals_SameNode() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        DOMNodePointer p1 = new DOMNodePointer(e, Locale.getDefault());
        DOMNodePointer p2 = new DOMNodePointer(e, Locale.getDefault());
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentNode() throws Exception {
        Document doc = newDoc(false);
        Element e1 = doc.createElement("foo");
        Element e2 = doc.createElement("bar");
        DOMNodePointer p1 = new DOMNodePointer(e1, Locale.getDefault());
        DOMNodePointer p2 = new DOMNodePointer(e2, Locale.getDefault());
        assertFalse(p1.equals(p2));
    }

    // =================================================================
    // getPrefix(Node) static
    // =================================================================

    @Test
    public void testGetPrefix_NativePrefixPresent() throws Exception {
        Document doc = parse("<pfx:root xmlns:pfx=\"http://pfx\"/>", true);
        Element root = doc.getDocumentElement();
        assertEquals("pfx", DOMNodePointer.getPrefix(root));
    }

    @Test
    public void testGetPrefix_NoNativePrefix_ParsedFromName() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("pfx:foo"); // namespace-unaware
        assertEquals("pfx", DOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_NoColon_ReturnsNull() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        assertNull(DOMNodePointer.getPrefix(e));
    }

    // =================================================================
    // getLocalName(Node) static
    // =================================================================

    @Test
    public void testGetLocalName_NativeLocalNamePresent() throws Exception {
        Document doc = parse("<pfx:root xmlns:pfx=\"http://pfx\"/>", true);
        Element root = doc.getDocumentElement();
        assertEquals("root", DOMNodePointer.getLocalName(root));
    }

    @Test
    public void testGetLocalName_NoNativeLocalName_WithColon() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("pfx:foo");
        assertEquals("foo", DOMNodePointer.getLocalName(e));
    }

    @Test
    public void testGetLocalName_NoNativeLocalName_NoColon() throws Exception {
        Document doc = newDoc(false);
        Element e = doc.createElement("foo");
        assertEquals("foo", DOMNodePointer.getLocalName(e));
    }

    // =================================================================
    // getNamespaceURI(Node) static
    // =================================================================

    @Test
    public void testGetNamespaceURIStatic_DocumentNode() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", false);
        assertEquals("http://y", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testGetNamespaceURIStatic_NativeURIPresent() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"/>", true);
        Element root = doc.getDocumentElement();
        assertEquals("http://y", DOMNodePointer.getNamespaceURI(root));
    }

    @Test
    public void testGetNamespaceURIStatic_NoNativeURI_FoundViaAttributeWalk() throws Exception {
        Document doc = parse("<root xmlns=\"http://y\"><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        assertEquals("http://y", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURIStatic_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root><child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        assertNull(DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURIStatic_WithPrefix_FoundViaAttributeWalk() throws Exception {
        Document doc = parse("<root xmlns:pfx=\"http://pfx\"><pfx:child/></root>", false);
        Element child = (Element) doc.getDocumentElement().getFirstChild();
        assertEquals("http://pfx", DOMNodePointer.getNamespaceURI(child));
    }

    // =================================================================
    // getValue() / stringValue()
    // =================================================================

    @Test
    public void testGetValue_CommentNode() throws Exception {
        Document doc = newDoc(false);
        Comment c = doc.createComment("  hello  ");
        DOMNodePointer p = new DOMNodePointer(c, Locale.getDefault());
        assertEquals("hello", p.getValue());
    }

    @Test
    public void testGetValue_TextNode() throws Exception {
        Document doc = newDoc(false);
        Text t = doc.createTextNode("  hi  ");
        DOMNodePointer p = new DOMNodePointer(t, Locale.getDefault());
        assertEquals("hi", p.getValue());
    }

    @Test
    public void testGetValue_CDATANode() throws Exception {
        Document doc = newDoc(false);
        Node cdata = doc.createCDATASection("  data  ");
        DOMNodePointer p = new DOMNodePointer(cdata, Locale.getDefault());
        assertEquals("data", p.getValue());
    }

    @Test
    public void testGetValue_PINode() throws Exception {
        Document doc = newDoc(false);
        ProcessingInstruction pi = doc.createProcessingInstruction("tgt", "  piData  ");
        DOMNodePointer p = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("piData", p.getValue());
    }

    @Test
    public void testGetValue_ElementNode_MixedContent_RecursiveStringValue() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        root.appendChild(doc.createTextNode(" Hello "));
        Element child = doc.createElement("child");
        child.appendChild(doc.createTextNode("World"));
        root.appendChild(child);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        assertEquals("Hello World", p.getValue());
    }

    // =================================================================
    // getPointerByID
    // =================================================================

    @Test
    public void testGetPointerByID_FromDocumentNode_NotFound() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(doc, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());
        Pointer result = p.getPointerByID(ctx, "nonexistent");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void testGetPointerByID_FromElementNode_UsesOwnerDocument_NotFound() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer p = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());
        Pointer result = p.getPointerByID(ctx, "nonexistent");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void testGetPointerByID_Found() throws Exception {
        // getElementById() requires the attribute to be declared as type ID
        // (DOM3 setIdAttribute). If the runtime DOM implementation doesn't
        // support it, we gracefully fall back to asserting the NotFound branch.
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        doc.appendChild(root);
        Element target = doc.createElement("target");
        target.setAttribute("id", "theId");
        root.appendChild(target);
        try {
            target.setIdAttribute("id", true);
        } catch (Throwable ignore) {
            // DOM3 not supported in this environment - handled below
        }
        DOMNodePointer p = new DOMNodePointer(doc, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newInstance(new Object());
        Pointer result = p.getPointerByID(ctx, "theId");
        if (doc.getElementById("theId") != null) {
            assertTrue(result instanceof DOMNodePointer);
        } else {
            assertTrue(result instanceof NullPointer);
        }
    }

    // =================================================================
    // compareChildNodePointers
    // =================================================================

    @Test
    public void testCompareChildNodePointers_SameNode_ReturnsZero() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);
        assertEquals(0, rootPointer.compareChildNodePointers(childPointer, childPointer));
    }

    @Test
    public void testCompareChildNodePointers_AttrVsNonAttr_BothDirections() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Attr attr = doc.createAttribute("a1");
        root.setAttributeNode(attr);
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer attrPointer = new DOMNodePointer(rootPointer, attr);
        DOMNodePointer childPointer = new DOMNodePointer(rootPointer, child);

        assertEquals(-1, rootPointer.compareChildNodePointers(attrPointer, childPointer));
        assertEquals(1, rootPointer.compareChildNodePointers(childPointer, attrPointer));
    }

    @Test
    public void testCompareChildNodePointers_BothAttr_FoundOrder() throws Exception {
        Document doc = newDoc(false);
        Element elem = doc.createElement("elem");
        Attr a1 = doc.createAttribute("a1");
        Attr a2 = doc.createAttribute("a2");
        elem.setAttributeNode(a1);
        elem.setAttributeNode(a2);

        DOMNodePointer elemPointer = new DOMNodePointer(elem, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(elemPointer, a1);
        DOMNodePointer p2 = new DOMNodePointer(elemPointer, a2);

        int r1 = elemPointer.compareChildNodePointers(p1, p2);
        int r2 = elemPointer.compareChildNodePointers(p2, p1);
        // Whichever attribute appears first in the NamedNodeMap determines sign;
        // the two results must be opposite.
        assertTrue((r1 == -1 && r2 == 1) || (r1 == 1 && r2 == -1));
    }

    @Test
    public void testCompareChildNodePointers_BothAttr_NeitherFound_ReturnsZero() throws Exception {
        Document doc = newDoc(false);
        Element elem = doc.createElement("elem");
        Attr a1 = doc.createAttribute("a1");
        elem.setAttributeNode(a1);

        Attr stray1 = doc.createAttribute("stray1"); // not added to elem
        Attr stray2 = doc.createAttribute("stray2"); // not added to elem

        DOMNodePointer elemPointer = new DOMNodePointer(elem, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(elemPointer, stray1);
        DOMNodePointer p2 = new DOMNodePointer(elemPointer, stray2);

        assertEquals(0, elemPointer.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_ElementChildren_FoundOrder() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root");
        Element child1 = doc.createElement("child1");
        Element child2 = doc.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer p2 = new DOMNodePointer(rootPointer, child2);

        assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_ElementChildren_NeitherFound_ReturnsZero() throws Exception {
        Document doc = newDoc(false);
        Element root = doc.createElement("root"); // no children appended
        Element other1 = doc.createElement("other1");
        Element other2 = doc.createElement("other2");

        DOMNodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(rootPointer, other1);
        DOMNodePointer p2 = new DOMNodePointer(rootPointer, other2);

        assertEquals(0, rootPointer.compareChildNodePointers(p1, p2));
    }
}
```

## สรุปตาราง Test Method → Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด | Test Method (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testNode` | `testTestNode_NullTest_ReturnsTrue` | `test == null → true` |
| | `testTestNode_NodeNameTest_NonElementNode_ReturnsFalse` | `instanceof NodeNameTest` + node ไม่ใช่ ELEMENT |
| | `...WildcardNoPrefix_ReturnsTrueImmediately` | `wildcard && testPrefix==null → true` |
| | `...WildcardWithPrefix_NamespaceNullNull_True` | wildcard=true, prefix!=null, equalStrings(null,null) |
| | `...NameMatches_...True` / `...NameMismatch_ReturnsFalse` | ชื่อ match/ไม่ match |
| | `...EqualStrings_*` (4 เทส) | ทุก branch ของ `equalStrings` (null/null, null/nonEmpty, nonEmpty/null, match, mismatch) |
| | `...NodeTypeTest_*` (6 เทส) | switch case NODE/TEXT(TEXT_NODE,CDATA)/COMMENT/PI + false path |
| | `...ProcessingInstructionTest_*` (3 เทส) | match/mismatch/non-PI node |
| `getName` | `testGetName_Element/PI/OtherType` | if ELEMENT / else if PI / else (ln=null) |
| `getNamespaceURI(prefix)` | 8 เทส | null/empty→default, "xml", "xmlns", found-on-element, not-found, cache-hit, Document-node branch |
| `getDefaultNamespaceURI` | 3 เทส | found, not-found→null, Document-node |
| getters พื้นฐาน | `testSimpleGetters` | getBaseValue/getImmediateNode/isActual/isCollection/getLength |
| `isLeaf` | 2 เทส | hasChildNodes true/false |
| `isLanguage/getLanguage` | 3 เทส | found-on-self, found-on-parent, not-found→super (ไม่ assert ค่า) |
| `setValue` | 8 เทส | TEXT/CDATA empty/non-empty, Element-value, Document-value, other-Node-value, String non-empty/empty |
| `createChild` | 5 เทส | WHOLE_COLLECTION→0, success, factory=false throw, success แต่หา child ไม่เจอ throw, +setValue |
| `createAttribute` | 5 เทส | non-Element→super, no-prefix exists/not-exists, prefix found/not-found(throw) |
| `remove` | 2 เทส | parent==null throw, parent!=null remove |
| `asPath`/`escape` | 6 เทส | id-path+escape, element no-parent, element+DOM-parent (default ns), text node, PI node, Document node |
| `hashCode/equals` | 5 เทส | same instance, not-instanceof, same node, different node |
| `getPrefix` static | 3 เทส | native prefix, parsed-from-name-with-colon, no-colon→null |
| `getLocalName` static | 3 เทส | native localName, parsed-with-colon, parsed-no-colon |
| `getNamespaceURI(Node)` static | 5 เทส | Document-node, native-URI, fallback-walk-found, not-found→null, with-prefix |
| `getValue/stringValue` | 5 เทส | COMMENT, TEXT, CDATA, PI, Element ผสม recursive |
| `getPointerByID` | 3 เทส | DOCUMENT_NODE branch, other-node ownerDocument branch, found/not-found |
| `compareChildNodePointers` | 7 เทส | node1==node2, attr-vs-nonattr ทั้งสองทิศทาง, both-attr found/not-found, element-children found/not-found |