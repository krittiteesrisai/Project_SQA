package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Locale;

import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;

import static org.junit.Assert.*;

public class DOMNodePointerTest {

    private Document document;
    private Element rootElement;
    private DOMNodePointer rootPointer;
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        locale = Locale.getDefault();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        document = dbf.newDocumentBuilder().newDocument();
        rootElement = document.createElementNS("http://example.com/ns", "prefix:root");
        rootElement.setAttribute("xmlns:prefix", "http://example.com/ns");
        document.appendChild(rootElement);
        rootPointer = new DOMNodePointer(rootElement, locale);
    }

    @Test
    public void testTestNodeNullTest() {
        assertTrue(DOMNodePointer.testNode(rootElement, null));
    }

    @Test
    public void testTestNodeNameTestNonElement() {
        Comment comment = document.createComment("test");
        NodeNameTest nameTest = new NodeNameTest(new QName("root"));
        assertFalse(DOMNodePointer.testNode(comment, nameTest));
    }

    @Test
    public void testTestNodeNameTestWildcardAndPrefix() {
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(rootElement, wildcardTest));

        NodeNameTest specificTest = new NodeNameTest(new QName("prefix", "root"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(rootElement, specificTest));
        
        NodeNameTest mismatchTest = new NodeNameTest(new QName("prefix", "wrong"), "http://example.com/ns");
        assertFalse(DOMNodePointer.testNode(rootElement, mismatchTest));
    }

    @Test
    public void testTestNodeTypeTestVariants() {
        assertTrue(DOMNodePointer.testNode(rootElement, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        Text textNode = document.createTextNode("hello");
        assertTrue(DOMNodePointer.testNode(textNode, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        
        CDATASection cdataNode = document.createCDATASection("cdata");
        assertTrue(DOMNodePointer.testNode(cdataNode, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Comment commentNode = document.createComment("comment");
        assertTrue(DOMNodePointer.testNode(commentNode, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        ProcessingInstruction piNode = document.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(piNode, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        assertFalse(DOMNodePointer.testNode(rootElement, new NodeTypeTest(999))); // default branch
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction piNode = document.createProcessingInstruction("my-target", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("my-target");
        assertTrue(DOMNodePointer.testNode(piNode, piTest));

        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("other-target");
        assertFalse(DOMNodePointer.testNode(piNode, piTestMismatch));
    }

    @Test
    public void testEqualsAndHashCode() {
        DOMNodePointer pointer1 = new DOMNodePointer(rootElement, locale);
        DOMNodePointer pointer2 = new DOMNodePointer(rootElement, locale);
        DOMNodePointer pointer3 = new DOMNodePointer(document, locale);

        assertEquals(pointer1, pointer1);
        assertEquals(pointer1, pointer2);
        assertNotEquals(pointer1, pointer3);
        assertNotEquals(pointer1, "some string");

        assertEquals(pointer1.hashCode(), rootElement.hashCode());
    }

    @Test
    public void testSetValueTextNode() {
        Text textNode = document.createTextNode("old");
        rootElement.appendChild(textNode);
        DOMNodePointer textPointer = new DOMNodePointer(textNode, locale);

        textPointer.setValue("new");
        assertEquals("new", textNode.getNodeValue());

        // Empty string should remove the node
        textPointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueElementNodeWithElement() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(child, locale);

        Element newVal = document.createElement("newVal");
        Element subChild = document.createElement("sub");
        newVal.appendChild(subChild);

        childPtr.setValue(newVal);
        assertEquals(1, child.getChildNodes().getLength());
        assertEquals("sub", child.getFirstChild().getNodeName());
    }

    @Test
    public void testSetValueElementNodeWithString() {
        Element child = document.createElement("child");
        rootElement.appendChild(child);
        DOMNodePointer childPtr = new DOMNodePointer(child, locale);

        childPtr.setValue("text content");
        assertEquals("text content", child.getFirstChild().getNodeValue());
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        assertEquals("http://www.w3.org/XML/1998/namespace", rootPointer.getNamespaceURI("xml"));
        assertEquals("http://www.w3.org/2000/xmlns/", rootPointer.getNamespaceURI("xmlns"));
        assertEquals("http://example.com/ns", rootPointer.getNamespaceURI("prefix"));
        assertNull(rootPointer.getNamespaceURI("unknown"));
        assertNotNull(rootPointer.getNamespaceURI(""));
    }

    @Test
    public void testAsPathVariations() {
        DOMNodePointer docPtr = new DOMNodePointer(document, locale);
        assertEquals("", docPtr.asPath());

        Text text = document.createTextNode("text");
        rootElement.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(rootPointer, text);
        assertTrue(textPtr.asPath().endsWith("/text()[1]"));

        Comment comment = document.createComment("com");
        rootElement.appendChild(comment);
        DOMNodePointer commentPtr = new DOMNodePointer(rootPointer, comment);
        assertEquals("", commentPtr.asPath()); // default branch for comment under DOMNodePointer without special handling

        ProcessingInstruction pi = document.createProcessingInstruction("pi-target", "data");
        rootElement.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPointer, pi);
        assertTrue(piPtr.asPath().contains("processing-instruction('pi-target')"));
    }

    @Test
    public void testRemoveRootNodeThrowsException() {
        DOMNodePointer docPtr = new DOMNodePointer(document, locale);
        try {
            docPtr.remove();
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testGetPointerByID() {
        rootElement.setAttribute("id", "testId");
        // Note: standard DOM implementation requires Document.getElementById to be supported by a parser schema, 
        // but we can test the fallback/basic execution path.
        Pointer ptr = rootPointer.getPointerByID(JXPathContext.newContext(new Object()), "testId");
        assertNotNull(ptr);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        rootElement.appendChild(child1);
        rootElement.appendChild(child2);

        DOMNodePointer p1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer p2 = new DOMNodePointer(rootPointer, child2);

        assertEquals(0, rootPointer.compareChildNodePointers(p1, p1));
        assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));
    }
}