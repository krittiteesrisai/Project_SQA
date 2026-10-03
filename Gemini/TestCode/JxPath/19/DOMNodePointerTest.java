package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;

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
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

import static org.junit.Assert.*;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private DOMNodePointer rootPointer;
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        locale = Locale.getDefault();
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        rootElement = document.createElementNS("http://example.com/ns", "ex:root");
        rootElement.setAttribute("xmlns:ex", "http://example.com/ns");
        rootElement.setAttribute("id", "root-id");
        document.appendChild(rootElement);
        rootPointer = new DOMNodePointer(rootElement, locale);
    }

    @Test
    public void testTestNodeNullTest() {
        assertTrue("Null test should always pass", DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeNameTestEdgeCases() {
        // Non-element node with NodeNameTest should return false
        Text textNode = document.createTextNode("hello");
        NodeNameTest nameTest = new NodeNameTest(new QName("root"), null);
        assertFalse(DOMNodePointer.testNode(textNode, nameTest));

        // Wildcard with prefix null
        NodeNameTest wildcardTestNullPrefix = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(rootElement, wildcardTestNullPrefix));

        // Matching local name and namespace
        NodeNameTest specificTest = new NodeNameTest(new QName("ex", "root"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(rootElement, specificTest));

        // Non-matching name
        NodeNameTest mismatchTest = new NodeNameTest(new QName("ex", "wrong"), "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(rootElement, mismatchTest));
    }

    @Test
    public void testTestNodeTypeTestVariants() {
        // NODE_TYPE_NODE
        assertTrue(DOMNodePointer.testNode(rootElement, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        // NODE_TYPE_TEXT (Text and CDATA)
        Text text = document.createTextNode("text");
        assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        org.w3c.dom.CDATASection cdata = document.createCDATASection("cdata");
        assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertFalse(DOMNodePointer.testNode(rootElement, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        // NODE_TYPE_COMMENT
        Comment comment = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        // NODE_TYPE_PI
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        // Unknown type
        assertFalse(DOMNodePointer.testNode(rootElement, new NodeTypeTest(999)));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("my-target", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("my-target");
        assertTrue(DOMNodePointer.testNode(pi, piTest));

        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("other-target");
        assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));

        // Non-PI node with PI test
        assertFalse(DOMNodePointer.testNode(rootElement, piTest));
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        DOMNodePointer dp = new DOMNodePointer(rootElement, locale);
        assertEquals("http://www.w3.org/XML/1998/namespace", dp.getNamespaceURI("xml"));
        assertEquals("http://www.w3.org/2000/xmlns/", dp.getNamespaceURI("xmlns"));
        assertEquals("http://example.com/ns", dp.getNamespaceURI("ex"));
        assertEquals(NodePointer.UNKNOWN_NAMESPACE, dp.getNamespaceURI("unknown"));
        assertNull(dp.getNamespaceURI(""));
        assertNull(dp.getNamespaceURI(null));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Element defElem = document.createElement("child");
        defElem.setAttribute("xmlns", "http://default.com");
        rootElement.appendChild(defElem);
        DOMNodePointer dp = new DOMNodePointer(defElem, locale);
        assertEquals("http://default.com", dp.getDefaultNamespaceURI());

        // Without default namespace
        DOMNodePointer rootDp = new DOMNodePointer(rootElement, locale);
        assertNull(rootDp.getDefaultNamespaceURI());
    }

    @Test
    public void testSetValueTextNode() {
        Text text = document.createTextNode("old");
        rootElement.appendChild(text);
        DOMNodePointer tp = new DOMNodePointer(text, locale);

        // Update value
        tp.setValue("new");
        assertEquals("new", text.getNodeValue());

        // Empty value should remove the node
        tp.setValue("");
        assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueElementNode() {
        DOMNodePointer ep = new DOMNodePointer(rootElement, locale);
        Element newChild = document.createElement("newChild");
        newChild.setTextContent("childText");
        
        ep.setValue(newChild);
        assertEquals(1, rootElement.getChildNodes().getLength());

        // Set string value on element
        ep.setValue("replacementString");
        assertTrue(rootElement.getTextContent().contains("replacementString"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttributeUnknownNamespacePrefix() {
        DOMNodePointer dp = new DOMNodePointer(rootElement, locale);
        JXPathContext context = JXPathContext.newContext(document);
        dp.createAttribute(context, new QName("unknownPrefix", "attr"));
    }

    @Test
    public void testRemoveRootNodeException() {
        DOMNodePointer docPointer = new DOMNodePointer(document, locale);
        try {
            docPointer.remove();
            fail("Expected JXPathException when removing root document");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testAsPathVariations() {
        // Document node path
        DOMNodePointer docPtr = new DOMNodePointer(document, locale);
        assertEquals("", docPtr.asPath());

        // ID specified path
        DOMNodePointer idPtr = new DOMNodePointer(rootElement, locale, "my-id");
        assertEquals("id('my-id')", idPtr.asPath());

        // Element with parent DOMNodePointer & namespace
        Element child = document.createElementNS("http://example.com/ns", "ex:child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(rootPointer, child);
        assertTrue(childPtr.asPath().contains("ex:child"));

        // Text node path
        Text text = document.createTextNode("sample");
        rootElement.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(rootPointer, text);
        assertTrue(textPtr.asPath().endsWith("/text()[1]"));

        // Comment & PI paths
        Comment comment = document.createComment("c");
        rootElement.appendChild(comment);
        DOMNodePointer commentPtr = new DOMNodePointer(rootPointer, comment);
        assertEquals("", commentPtr.asPath()); // Default switch case for comment under element without explicit handling

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPointer, pi);
        assertTrue(piPtr.asPath().contains("processing-instruction('target')"));
    }

    @Test
    public void testGetPointerByID() {
        DOMNodePointer docPtr = new DOMNodePointer(document, locale);
        // Assuming document.getElementById behavior or fallback to NullPointer
        Pointer ptr = docPtr.getPointerByID(null, "non-existent");
        assertNotNull(ptr);
        assertTrue(ptr instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);

        DOMNodePointer p1 = new DOMNodePointer(child1, locale);
        DOMNodePointer p2 = new DOMNodePointer(child2, locale);

        // Same node comparison
        assertEquals(0, rootPointer.compareChildNodePointers(p1, p1));

        // Order comparison
        assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testGetValuesAndLanguage() {
        Comment comment = document.createComment("  my comment  ");
        DOMNodePointer cp = new DOMNodePointer(comment, locale);
        assertEquals("my comment", cp.getValue());

        rootElement.setAttribute("xml:lang", "en-US");
        DOMNodePointer lp = new DOMNodePointer(rootElement, locale);
        assertTrue(lp.isLanguage("EN"));
        assertFalse(lp.isLanguage("FR"));
    }
}