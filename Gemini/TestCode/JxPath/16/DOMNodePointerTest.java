package org.apache.commons.jxpath.ri.model.dom;

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
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Locale;

import static org.junit.Assert.*;

public class DOMNodePointerTest {

    private Document document;
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        locale = Locale.getDefault();
    }

    @Test
    public void testTestNodeNull() {
        Element elem = document.createElement("root");
        assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNodeNameTestWildcard() {
        Element elem = document.createElement("root");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(elem, test));

        // Non-element node with wildcard NodeNameTest should return false
        Text text = document.createTextNode("text");
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testTestNodeNameTestSpecific() {
        Element elem = document.createElementNS("http://example.com", "ns:root");
        NodeNameTest test = new NodeNameTest(new QName("ns", "root"), "http://example.com");
        assertTrue(DOMNodePointer.testNode(elem, test));

        NodeNameTest testMismatchName = new NodeNameTest(new QName("ns", "wrong"), "http://example.com");
        assertFalse(DOMNodePointer.testNode(elem, testMismatchName));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element elem = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(elem, locale);

        assertTrue(pointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertTrue(pointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)) == false);

        Comment comment = document.createComment("test");
        DOMNodePointer commentPointer = new DOMNodePointer(comment, locale);
        assertTrue(commentPointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        Text text = document.createTextNode("content");
        DOMNodePointer textPointer = new DOMNodePointer(text, locale);
        assertTrue(textPointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, locale);
        assertTrue(piPointer.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target1");
        assertTrue(DOMNodePointer.testNode(pi, piTest));

        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");
        assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));

        Element elem = document.createElement("elem");
        assertFalse(DOMNodePointer.testNode(elem, piTest));
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        Element root = document.createElementNS("http://root.com", "root");
        root.setAttribute("xmlns:xml", DOMNodePointer.XML_NAMESPACE_URI);
        root.setAttribute("xmlns:xmlns", DOMNodePointer.XMLNS_NAMESPACE_URI);
        root.setAttribute("xmlns:custom", "http://custom.com");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);

        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        assertEquals(null, pointer.getNamespaceURI("unknown"));
        assertEquals("", pointer.getNamespaceURI(""));
        assertEquals("", pointer.getNamespaceURI(null));
    }

    @Test
    public void testSetValueOnTextNode() {
        Element root = document.createElement("root");
        Text textNode = document.createTextNode("initial");
        root.appendChild(textNode);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(textNode, locale);
        pointer.setValue("updated");
        assertEquals("updated", textNode.getNodeValue());

        // Empty value should remove the node
        pointer.setValue("");
        assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementNode() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        Element replacement = document.createElement("replacement");
        replacement.appendChild(document.createTextNode("new-child-text"));

        pointer.setValue(replacement);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("new-child-text", root.getFirstChild().getTextContent());

        // Test setting string on element
        pointer.setValue("string-value");
        assertEquals("string-value", root.getFirstChild().getNodeValue());
    }

    @Test
    public void testRemoveRootNodeException() {
        DOMNodePointer pointer = new DOMNodePointer(document, locale);
        try {
            pointer.remove();
            fail("Expected JXPathException when removing root node");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Cannot remove root DOM node"));
        }
    }

    @Test
    public void testAsPathWithIdAndTypes() {
        Element root = document.createElement("root");
        root.setAttribute("id", "myId");
        document.appendChild(root);

        DOMNodePointer pointerWithId = new DOMNodePointer(root, locale, "myId");
        assertEquals("id('myId')", pointerWithId.asPath());

        Comment comment = document.createComment("c");
        root.appendChild(comment);
        DOMNodePointer commentPtr = new DOMNodePointer(pointerWithId, comment);
        // Triggers node type handling in asPath
        assertNotNull(commentPtr.asPath());
    }

    @Test
    public void testGetValueAndLanguage() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        Comment comment = document.createComment("   comment content   ");
        root.appendChild(comment);
        document.appendChild(root);

        DOMNodePointer commentPtr = new DOMNodePointer(comment, locale);
        assertEquals("comment content", commentPtr.getValue());

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale);
        assertTrue(rootPtr.isLanguage("en"));
        assertFalse(rootPtr.isLanguage("fr"));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.createElement("root");
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.appendChild(child1);
        root.appendChild(child2);
        document.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale);
        DOMNodePointer ptr1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer ptr2 = new DOMNodePointer(rootPtr, child2);

        assertEquals(0, rootPtr.compareChildNodePointers(ptr1, ptr1));
        assertEquals(-1, rootPtr.compareChildNodePointers(ptr1, ptr2));
        assertEquals(1, rootPtr.compareChildNodePointers(ptr2, ptr1));
    }

    @Test
    public void testCreateAttributeNonElement() {
        Text text = document.createTextNode("text");
        DOMNodePointer pointer = new DOMNodePointer(text, locale);
        JXPathContext context = JXPathContext.newContext(new Object());
        
        Pointer attrPtr = pointer.createAttribute(context, new QName("attr"));
        assertNotNull(attrPtr);
        assertTrue(attrPtr instanceof NullPointer);
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        root.setAttribute("id", "testId");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(document, locale);
        JXPathContext context = JXPathContext.newContext(new Object());

        Pointer found = pointer.getPointerByID(context, "testId");
        assertNotNull(found);

        Pointer notFound = pointer.getPointerByID(context, "nonExistent");
        assertTrue(notFound instanceof NullPointer);
    }
}