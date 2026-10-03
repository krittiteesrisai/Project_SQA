package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.Pointer;
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
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        document = dbf.newDocumentBuilder().newDocument();
        locale = Locale.ENGLISH;
    }

    @Test
    public void testTestNodeNull() {
        Element elem = document.createElement("test");
        assertTrue(DOMNodePointer.testNode(elem, null));
    }

    @Test
    public void testTestNodeNameTestEdgeCases() {
        Element elem = document.createElementNS("http://example.com", "ns:myelem");
        document.appendChild(elem);

        // Not an element node test
        Text text = document.createTextNode("hello");
        NodeNameTest nameTestWildcard = new NodeNameTest(new QName(null, "*"));
        assertFalse(DOMNodePointer.testNode(text, nameTestWildcard));

        // Wildcard with null prefix -> true for element
        assertTrue(DOMNodePointer.testNode(elem, nameTestWildcard));

        // Wildcard with namespace URI match
        NodeNameTest nsWildcard = new NodeNameTest(new QName("ns", "*"), "http://example.com");
        assertTrue(DOMNodePointer.testNode(elem, nsWildcard));

        // Specific local name and matching namespace
        NodeNameTest specificTest = new NodeNameTest(new QName("ns", "myelem"), "http://example.com");
        assertTrue(DOMNodePointer.testNode(elem, specificTest));

        // Mismatched local name
        NodeNameTest mismatchTest = new NodeNameTest(new QName("ns", "other"), "http://example.com");
        assertFalse(DOMNodePointer.testNode(elem, mismatchTest));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element elem = document.createElement("elem");
        Comment comment = document.createComment("comment");
        Text text = document.createTextNode("text");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        DOMNodePointer pointer = new DOMNodePointer(elem, locale);

        // NODE_TYPE_NODE (Element or Document)
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(elem, nodeTypeTest));
        assertTrue(DOMNodePointer.testNode(document, nodeTypeTest));
        assertFalse(DOMNodePointer.testNode(text, nodeTypeTest));

        // NODE_TYPE_TEXT (Text or CDATA)
        NodeTypeTest textTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(text, textTypeTest));
        assertFalse(DOMNodePointer.testNode(elem, textTypeTest));

        // NODE_TYPE_COMMENT
        NodeTypeTest commentTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, commentTypeTest));
        assertFalse(DOMNodePointer.testNode(elem, commentTypeTest));

        // NODE_TYPE_PI
        NodeTypeTest piTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, piTypeTest));
        assertFalse(DOMNodePointer.testNode(elem, piTypeTest));

        // Invalid node type test
        NodeTypeTest invalidTest = new NodeTypeTest(999);
        assertFalse(DOMNodePointer.testNode(elem, invalidTest));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi1 = document.createProcessingInstruction("target1", "data1");
        ProcessingInstruction pi2 = document.createProcessingInstruction("target2", "data2");
        Element elem = document.createElement("elem");

        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target1");
        assertTrue(DOMNodePointer.testNode(pi1, piTest));
        assertFalse(DOMNodePointer.testNode(pi2, piTest));
        assertFalse(DOMNodePointer.testNode(elem, piTest));
    }

    @Test
    public void testNamespacesAndPrefixes() {
        Element root = document.createElementNS("http://root.com", "root");
        root.setAttribute("xmlns", "http://default.com");
        root.setAttribute("xmlns:custom", "http://custom.com");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);

        assertEquals("http://root.com", pointer.getNamespaceURI());
        assertEquals("http://default.com", pointer.getDefaultNamespaceURI());
        assertEquals("http://www.w3.org/XML/1998/namespace", pointer.getNamespaceURI("xml"));
        assertEquals("http://www.w3.org/2000/xmlns/", pointer.getNamespaceURI("xmlns"));
        assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        assertNull(pointer.getNamespaceURI("unknown"));
        assertNull(pointer.getNamespaceURI(""));
        assertNull(pointer.getNamespaceURI(null));

        // Test Document node namespace handling
        DOMNodePointer docPointer = new DOMNodePointer(document, locale);
        assertEquals("http://default.com", docPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testSetValueTextNode() {
        Text text = document.createTextNode("initial");
        Element root = document.createElement("root");
        root.appendChild(text);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(text, locale);

        // Update with valid string
        pointer.setValue("updated");
        assertEquals("updated", text.getNodeValue());

        // Update with empty/null string -> should remove node
        pointer.setValue("");
        assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueElementNode() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);

        // Set value with a new Element
        Element newChild = document.createElement("newChild");
        newChild.appendChild(document.createTextNode("content"));
        pointer.setValue(newChild);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("newChild", root.getFirstChild().getNodeName());

        // Set value with a primitive/string object
        pointer.setValue("text content");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, root.getFirstChild().getNodeType());
        assertEquals("text content", root.getFirstChild().getNodeValue());
    }

    @Test
    public void testCreateAttribute() {
        Element root = document.createElement("root");
        document.appendChild(root);
        DOMNodePointer pointer = new DOMNodePointer(root, locale);

        // Attribute without prefix
        NodePointer attrPtr1 = pointer.createAttribute(JXPathContext.newContext(null), new QName("att1"));
        assertNotNull(attrPtr1);
        assertEquals("att1", ((org.w3c.dom.Attr) attrPtr1.getBaseValue()).getName());

        // Attribute with known namespace prefix
        root.setAttribute("xmlns:ns", "http://example.com");
        NodePointer attrPtr2 = pointer.createAttribute(JXPathContext.newContext(null), new QName("ns", "att2"));
        assertNotNull(attrPtr2);

        // Attribute with unknown namespace prefix -> Exception
        boolean exceptionThrown = false;
        try {
            pointer.createAttribute(JXPathContext.newContext(null), new QName("unknownNs", "att3"));
        } catch (JXPathException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);

        // Create attribute on non-element node (e.g., Text node)
        Text text = document.createTextNode("abc");
        DOMNodePointer textPtr = new DOMNodePointer(text, locale);
        NodePointer superAttr = textPtr.createAttribute(JXPathContext.newContext(null), new QName("attr"));
        assertNotNull(superAttr);
    }

    @Test
    public void testRemoveRootNode() {
        DOMNodePointer pointer = new DOMNodePointer(document, locale);
        boolean exceptionThrown = false;
        try {
            pointer.remove();
        } catch (JXPathException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);

        Element root = document.createElement("root");
        document.appendChild(root);
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer childPtr = new DOMNodePointer(child, locale);
        childPtr.remove();
        assertNull(child.getParentNode());
    }

    @Test
    public void testAsPathAndEscaping() {
        Element root = document.createElement("root");
        document.appendChild(root);
        Element child1 = document.createElement("child");
        Element child2 = document.createElement("child");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale, "id'with\"quotes");
        assertEquals("id('id&apos;with&quot;quotes')", rootPtr.asPath());

        DOMNodePointer child1Ptr = new DOMNodePointer(rootPtr, child1);
        assertTrue(child1Ptr.asPath().contains("child[1]"));

        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);
        assertTrue(child2Ptr.asPath().contains("child[2]"));

        // Text node path
        Text text = document.createTextNode("sample");
        child1.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(child1Ptr, text);
        assertTrue(textPtr.asPath().endsWith("/text()[1]"));

        // PI node path
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        child1.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(child1Ptr, pi);
        assertTrue(piPtr.asPath().contains("processing-instruction('target')[1]"));
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        child.setAttribute("id", "myId");
        root.appendChild(child);
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(document, locale);
        Pointer found = pointer.getPointerByID(JXPathContext.newContext(null), "myId");
        assertNotNull(found);

        Pointer notFound = pointer.getPointerByID(JXPathContext.newContext(null), "nonExistent");
        assertNotNull(notFound);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.createElement("root");
        Element c1 = document.createElement("c1");
        Element c2 = document.createElement("c2");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        root.appendChild(c1);
        root.appendChild(c2);
        document.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale);
        DOMNodePointer ptrC1 = new DOMNodePointer(rootPtr, c1);
        DOMNodePointer ptrC2 = new DOMNodePointer(rootPtr, c2);

        assertEquals(0, rootPtr.compareChildNodePointers(ptrC1, ptrC1));
        assertEquals(-1, rootPtr.compareChildNodePointers(ptrC1, ptrC2));
        assertEquals(1, rootPtr.compareChildNodePointers(ptrC2, ptrC1));

        // Attribute comparisons
        Node attr1Node = root.getAttributeNode("attr1");
        Node attr2Node = root.getAttributeNode("attr2");
        DOMNodePointer ptrAttr1 = new DOMNodePointer(rootPtr, attr1Node);
        DOMNodePointer ptrAttr2 = new DOMNodePointer(rootPtr, attr2Node);

        assertEquals(-1, rootPtr.compareChildNodePointers(ptrAttr1, ptrC1));
        assertEquals(1, rootPtr.compareChildNodePointers(ptrC1, ptrAttr1));
        assertEquals(-1, rootPtr.compareChildNodePointers(ptrAttr1, ptrAttr2));
    }

    @Test
    public void testLanguageAndLeafMethods() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        assertTrue(pointer.isLanguage("en"));
        assertFalse(pointer.isLanguage("fr"));
        assertFalse(pointer.isLeaf());

        Element leaf = document.createElement("leaf");
        root.appendChild(leaf);
        DOMNodePointer leafPointer = new DOMNodePointer(leaf, locale);
        assertTrue(leafPointer.isLeaf());
    }

    @Test
    public void testHashCodeAndEquals() {
        Element elem = document.createElement("elem");
        DOMNodePointer p1 = new DOMNodePointer(elem, locale);
        DOMNodePointer p2 = new DOMNodePointer(elem, locale);
        DOMNodePointer p3 = new DOMNodePointer(document.createElement("other"), locale);

        assertEquals(p1, p1);
        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotEquals(p1, p3);
        assertNotEquals(p1, "not a pointer");
    }

    @Test
    public void testValueRetrievalForDifferentNodeTypes() {
        Comment comment = document.createComment("  comment text  ");
        assertEquals("comment text", new DOMNodePointer(comment, locale).getValue());

        ProcessingInstruction pi = document.createProcessingInstruction("target", "  pi data  ");
        assertEquals("pi data", new DOMNodePointer(pi, locale).getValue());
    }
}