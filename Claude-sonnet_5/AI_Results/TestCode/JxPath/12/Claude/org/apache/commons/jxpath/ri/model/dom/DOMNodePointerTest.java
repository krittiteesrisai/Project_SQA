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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Test;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/**
 * JUnit4 tests for {@link DOMNodePointer} (JxPath-12b).
 *
 * NOTE (ASSUMPTIONS):
 *  - NodeNameTest(QName, String), NodeTypeTest(int), ProcessingInstructionTest(String)
 *    constructors/getters are used exactly as DOMNodePointer source invokes them.
 *  - NodeTest is assumed to be an empty marker interface (no abstract methods),
 *    allowing an anonymous implementation for the "unknown NodeTest type" branch.
 *  - AbstractFactory is assumed to declare createObject(JXPathContext, Pointer,
 *    Object, String, int) and declareVariable(JXPathContext, String) based on
 *    typical commons-jxpath API; not shown in given source.
 *  - super.isLanguage(...) and super.createAttribute(...) (NodePointer) behavior
 *    is NOT verified in detail since NodePointer source was not provided.
 *  - getNode() used inside compareChildNodePointers is assumed to return the
 *    same Node as the pointer's own node field (consistent with getImmediateNode()).
 *  - Document#getElementById "found" branch depends on DOM Level 3 ID
 *    declaration support of the actual parser in the test environment; only the
 *    "not found" branch is tested to avoid guessing parser-specific behavior.
 */
public class DOMNodePointerTest {

    // ---------- helpers ----------

    private Document newDocument() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }

    private Document parse(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    /** Helper subclass to force parent.asPath() to end with '/'. */
    private static class SlashEndingPointer extends DOMNodePointer {
        SlashEndingPointer(Node node, Locale locale) {
            super(node, locale);
        }
        public String asPath() {
            return "custom/";
        }
    }

    // ================= testNode (static) =================

    @Test
    public void testTestNode_instanceMethod_nullTest() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr.testNode(null));
    }

    @Test
    public void testTestNode_staticNullTest_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        assertTrue(DOMNodePointer.testNode(el, null));
    }

    @Test
    public void testTestNode_NodeNameTest_nonElementNode_false() throws Exception {
        Document doc = newDocument();
        Text text = doc.createTextNode("x");
        NodeNameTest test = new NodeNameTest(new QName(null, "x"), null);
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testTestNode_NodeNameTest_wildcardNoPrefix_elementNode_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("anything");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_wildcardWithPrefix_namespaceMatch_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns-w", "p:anyLocal");
        NodeNameTest test = new NodeNameTest(new QName("p", "*"), "http://ns-w");
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_wildcardWithPrefix_namespaceMismatch_false() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns-w", "p:anyLocal");
        NodeNameTest test = new NodeNameTest(new QName("p", "*"), "http://other-ns");
        assertFalse(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_nameMatch_bothNamespaceNull_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_nameMatch_namespaceTrimmedEqual_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS(" http://trim-ns ", "foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), "http://trim-ns");
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_nameNoMatch_false() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "bar"), null);
        assertFalse(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_NODE_element_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_NODE_document_true() throws Exception {
        Document doc = newDocument();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(doc, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_NODE_comment_false() throws Exception {
        Document doc = newDocument();
        Comment c = doc.createComment("x");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertFalse(DOMNodePointer.testNode(c, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_TEXT_textAndCdata_true() throws Exception {
        Document doc = newDocument();
        Text t = doc.createTextNode("x");
        CDATASection cdata = doc.createCDATASection("y");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(t, test));
        assertTrue(DOMNodePointer.testNode(cdata, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_COMMENT_true() throws Exception {
        Document doc = newDocument();
        Comment c = doc.createComment("x");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(c, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI_true() throws Exception {
        Document doc = newDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("t", "d");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_unknownType_defaultFalse() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        NodeTypeTest test = new NodeTypeTest(-999); // does not match any case label
        assertFalse(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_matchingTarget_true() throws Exception {
        Document doc = newDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("target1", "d");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target1");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_mismatchTarget_false() throws Exception {
        Document doc = newDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("target1", "d");
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_wrongNodeType_false() throws Exception {
        Document doc = newDocument();
        Text text = doc.createTextNode("x");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target1");
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testTestNode_unknownNodeTestType_fallbackFalse() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        NodeTest customTest = new NodeTest() { }; // assumption: NodeTest is empty marker interface
        assertFalse(DOMNodePointer.testNode(el, customTest));
    }

    // ================= getName =================

    @Test
    public void testGetName_Element() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns", "p:foo");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        QName qn = ptr.getName();
        assertEquals("p", qn.getPrefix());
        assertEquals("foo", qn.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() throws Exception {
        Document doc = newDocument();
        ProcessingInstruction pi = doc.createProcessingInstruction("target1", "data");
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        QName qn = ptr.getName();
        assertNull(qn.getPrefix());
        assertEquals("target1", qn.getName());
    }

    @Test
    public void testGetName_OtherNodeType_bothNull() throws Exception {
        Document doc = newDocument();
        Comment c = doc.createComment("x");
        DOMNodePointer ptr = new DOMNodePointer(c, Locale.getDefault());
        QName qn = ptr.getName();
        assertNull(qn.getPrefix());
        assertNull(qn.getName());
    }

    // ================= static getPrefix / getLocalName =================

    @Test
    public void testGetPrefix_nativePrefix() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns", "p:foo");
        assertEquals("p", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_derivedFromColonInName() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("p2:foo2");
        assertNull(el.getPrefix());
        assertEquals("p2", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_noColon_returnsNull() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("foo3");
        assertNull(DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetLocalName_nativeLocalName() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns", "p:foo");
        assertEquals("foo", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_derivedFromColon() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("p2:foo2");
        assertEquals("foo2", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_noColon() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("foo3");
        assertEquals("foo3", DOMNodePointer.getLocalName(el));
    }

    // ================= static getNamespaceURI(Node) =================

    @Test
    public void testStaticGetNamespaceURI_nativeNamespace() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://ns1", "p:foo");
        assertEquals("http://ns1", DOMNodePointer.getNamespaceURI(el));
    }

    @Test
    public void testStaticGetNamespaceURI_documentNode_delegatesToDocumentElement() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElementNS("http://ns2", "root");
        doc.appendChild(root);
        assertEquals("http://ns2", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testStaticGetNamespaceURI_fallbackAttributeLookup_found() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://default-ns");
        doc.appendChild(root);
        Element child = doc.createElement("child");
        root.appendChild(child);
        assertEquals("http://default-ns", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testStaticGetNamespaceURI_fallbackAttributeLookup_withPrefix_found() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:p3", "http://p3-ns");
        doc.appendChild(root);
        Element child = doc.createElement("p3:child");
        root.appendChild(child);
        assertEquals("http://p3-ns", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testStaticGetNamespaceURI_notFound_returnsNull() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        doc.appendChild(root);
        Element child = doc.createElement("child");
        root.appendChild(child);
        assertNull(DOMNodePointer.getNamespaceURI(child));
    }

    // ================= instance getNamespaceURI(String prefix) =================

    @Test
    public void testGetNamespaceURI_emptyOrNullPrefix_delegatesToDefault() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://default-x");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        assertEquals("http://default-x", ptr.getNamespaceURI(""));
        assertEquals("http://default-x", ptr.getNamespaceURI((String) null));
    }

    @Test
    public void testGetNamespaceURI_xmlPrefix_returnsConstant() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURI_xmlnsPrefix_returnsConstant() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_customPrefix_foundOnAncestor_andCached() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:foo", "http://foo-ns");
        doc.appendChild(root);
        Element mid = doc.createElement("mid");
        root.appendChild(mid);
        Element leaf = doc.createElement("leaf");
        mid.appendChild(leaf);
        DOMNodePointer ptr = new DOMNodePointer(leaf, Locale.getDefault());
        assertEquals("http://foo-ns", ptr.getNamespaceURI("foo"));
        assertEquals("http://foo-ns", ptr.getNamespaceURI("foo")); // hits cache branch
    }

    @Test
    public void testGetNamespaceURI_customPrefix_notFound_returnsNull_andCached() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        assertNull(ptr.getNamespaceURI("unknownPrefix"));
        assertNull(ptr.getNamespaceURI("unknownPrefix")); // UNKNOWN_NAMESPACE cached
    }

    @Test
    public void testGetNamespaceURI_documentNode_usesDocumentElement() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:bar", "http://bar-ns");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://bar-ns", ptr.getNamespaceURI("bar"));
    }

    @Test
    public void testGetNamespaceURI_instance_delegatesToStatic() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElementNS("http://inst-ns", "e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("http://inst-ns", ptr.getNamespaceURI());
    }

    // ================= getDefaultNamespaceURI =================

    @Test
    public void testGetDefaultNamespaceURI_found_andCached() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://def-ns");
        doc.appendChild(root);
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("http://def-ns", ptr.getDefaultNamespaceURI());
        assertEquals("http://def-ns", ptr.getDefaultNamespaceURI()); // cache path
    }

    @Test
    public void testGetDefaultNamespaceURI_notFound_returnsNull() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_documentNode() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://doc-def-ns");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://doc-def-ns", ptr.getDefaultNamespaceURI());
    }

    // ================= simple getters =================

    @Test
    public void testSimpleGetters() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertSame(el, ptr.getBaseValue());
        assertSame(el, ptr.getImmediateNode());
        assertTrue(ptr.isActual());
        assertFalse(ptr.isCollection());
        assertEquals(1, ptr.getLength());
    }

    @Test
    public void testIsLeaf_noChildren_true() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void testIsLeaf_withChildren_false() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        el.appendChild(doc.createTextNode("x"));
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertFalse(ptr.isLeaf());
    }

    // ================= findEnclosingAttribute / getLanguage / isLanguage =================

    @Test
    public void testFindEnclosingAttribute_onNodeItself() throws Exception {
        Document doc = newDocument();
        Element el = doc.createElement("e");
        el.setAttribute("xml:lang", "en");
        assertEquals("en", DOMNodePointer.findEnclosingAttribute(el, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_onAncestor() throws Exception {
        Document doc = newDocument();
        Element root = doc.createElement("root");
        root.setAttribute("xml:lang", "fr");
        doc.app