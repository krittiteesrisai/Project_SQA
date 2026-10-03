package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        document = db.newDocument();
        locale = Locale.getDefault();
    }

    @Test
    public void testTestNodeNull() {
        Element elem = document.createElement("test");
        DOMNodePointer pointer = new DOMNodePointer(elem, locale);
        Assert.assertTrue(pointer.testNode(null));
    }

    @Test
    public void testTestNodeNameTestWildcardAndPrefix() {
        Element elem = document.createElementNS("http://example.com", "ns:elem");
        DOMNodePointer pointer = new DOMNodePointer(elem, locale);

        // Wildcard with null prefix
        NodeNameTest test1 = new NodeNameTest(new QName(null, "*"), null);
        Assert.assertTrue(DOMNodePointer.testNode(elem, test1));

        // Wildcard with matching namespace
        NodeNameTest test2 = new NodeNameTest(new QName("ns", "*"), "http://example.com");
        Assert.assertTrue(DOMNodePointer.testNode(elem, test2));

        // Matching name and namespace
        NodeNameTest test3 = new NodeNameTest(new QName("ns", "elem"), "http://example.com");
        Assert.assertTrue(DOMNodePointer.testNode(elem, test3));

        // Non-element node with NodeNameTest should return false
        Text text = document.createTextNode("hello");
        Assert.assertFalse(DOMNodePointer.testNode(text, test3));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element elem = document.createElement("elem");
        Text text = document.createTextNode("text");
        CDATASection cdata = document.createCDATASection("cdata");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");

        Assert.assertTrue(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        Assert.assertTrue(DOMNodePointer.testNode(text, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        Assert.assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        Assert.assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        // Invalid node type in NodeTypeTest
        Assert.assertFalse(DOMNodePointer.testNode(elem, new NodeTypeTest(999)));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target1");
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));

        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");
        Assert.assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));

        Element elem = document.createElement("elem");
        Assert.assertFalse(DOMNodePointer.testNode(elem, piTest));
    }

    @Test
    public void testGetName() {
        Element elem = document.createElementNS("http://example.com", "prefix:localName");
        DOMNodePointer pointer = new DOMNodePointer(elem, locale);
        QName name = pointer.getName();
        Assert.assertEquals("prefix", name.getPrefix());
        Assert.assertEquals("localName", name.getName());

        ProcessingInstruction pi = document.createProcessingInstruction("my-target", "data");
        DOMNodePointer piPointer = new DOMNodePointer(pi, locale);
        QName piName = piPointer.getName();
        Assert.assertEquals("my-target", piName.getName());
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        Element root = document.createElementNS("http://root.com", "root");
        root.setAttribute("xmlns:xml", DOMNodePointer.XML_NAMESPACE_URI);
        root.setAttribute("xmlns:xmlns", DOMNodePointer.XMLNS_NAMESPACE_URI);
        root.setAttribute("xmlns:custom", "http://custom.com");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);

        Assert.assertEquals("http://root.com", pointer.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, pointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, pointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://custom.com", pointer.getNamespaceURI("custom"));
        Assert.assertNull(pointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Element root = document.createElement("root");
        root.setAttribute("xmlns", "http://default.com");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        Assert.assertEquals("http://default.com", pointer.getDefaultNamespaceURI());

        Element child = document.createElement("child");
        root.appendChild(child);
        DOMNodePointer childPointer = new DOMNodePointer(child, locale);
        Assert.assertEquals("http://default.com", childPointer.getDefaultNamespaceURI());
    }

    @Test
    public void testBasicPropertiesAndLeaf() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);

        DOMNodePointer rootPointer = new DOMNodePointer(root, locale);
        DOMNodePointer childPointer = new DOMNodePointer(child, locale);

        Assert.assertEquals(root, rootPointer.getBaseValue());
        Assert.assertEquals(root, rootPointer.getImmediateNode());
        Assert.assertTrue(rootPointer.isActual());
        Assert.assertFalse(rootPointer.isCollection());
        Assert.assertEquals(1, rootPointer.getLength());
        Assert.assertFalse(rootPointer.isLeaf());
        Assert.assertTrue(childPointer.isLeaf());
    }

    @Test
    public void testIsLanguage() {
        Element root = document.createElement("root");
        root.setAttribute("xml:lang", "en-US");
        document.appendChild(root);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        Assert.assertTrue(pointer.isLanguage("en"));
        Assert.assertTrue(pointer.isLanguage("EN-us"));
        Assert.assertFalse(pointer.isLanguage("fr"));
    }

    @Test
    public void testSetValueTextNode() {
        Text text = document.createTextNode("initial");
        DOMNodePointer pointer = new DOMNodePointer(text, locale);
        pointer.setValue("updated");
        Assert.assertEquals("updated", text.getNodeValue());

        // Test empty value removes the node
        Element parent = document.createElement("parent");
        parent.appendChild(text);
        pointer.setValue("");
        Assert.assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueElementNode() {
        Element root = document.createElement("root");
        Element child1 = document.createElement("child1");
        root.appendChild(child1);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        
        // Setting an element value with another Element
        Element newChild = document.createElement("newChild");
        newChild.appendChild(document.createTextNode("content"));
        pointer.setValue(newChild);
        Assert.assertEquals(1, root.getChildNodes().getLength());
        Assert.assertEquals("content", root.getFirstChild().getFirstChild().getNodeValue());

        // Setting an element value with a string
        pointer.setValue("stringVal");
        Assert.assertEquals("stringVal", root.getFirstChild().getNodeValue());
    }

    @Test
    public void testCreateAttribute() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        JXPathContext context = JXPathContext.newContext(new Object());

        // Normal attribute creation
        NodePointer attrPtr = pointer.createAttribute(context, new QName("attrName"));
        Assert.assertNotNull(attrPtr);
        Assert.assertEquals("attrName", ((org.w3c.dom.Attr) attrPtr.getBaseValue()).getName());

        // Namespace attribute creation with unknown prefix should throw exception
        boolean exceptionThrown = false;
        try {
            pointer.createAttribute(context, new QName("unknownPrefix", "local"));
        } catch (JXPathException e) {
            exceptionThrown = true;
        }
        Assert.assertTrue(exceptionThrown);
    }

    @Test
    public void testRemoveRootNode() {
        Element root = document.createElement("root");
        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        boolean exceptionThrown = false;
        try {
            pointer.remove();
        } catch (JXPathException e) {
            exceptionThrown = true;
        }
        Assert.assertTrue(exceptionThrown);
    }

    @Test
    public void testAsPathVariations() {
        Element root = document.createElement("root");
        Element child = document.createElement("child");
        root.appendChild(child);
        document.appendChild(root);

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale);
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);

        Assert.assertEquals("/root[1]", childPtr.asPath());

        // Test with ID
        DOMNodePointer idPtr = new DOMNodePointer(root, locale, "myId's");
        Assert.assertEquals("id('myId&apos;s')", idPtr.asPath());

        // Test text node path
        Text text = document.createTextNode("sample");
        child.appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(childPtr, text);
        Assert.assertTrue(textPtr.asPath().contains("/text()"));

        // Test Processing Instruction path
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        child.appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(childPtr, pi);
        Assert.assertTrue(piPtr.asPath().contains("/processing-instruction('target')"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Element root = document.createElement("root");
        DOMNodePointer p1 = new DOMNodePointer(root, locale);
        DOMNodePointer p2 = new DOMNodePointer(root, locale);
        Element root2 = document.createElement("root2");
        DOMNodePointer p3 = new DOMNodePointer(root2, locale);

        Assert.assertEquals(p1, p1);
        Assert.assertEquals(p1, p2);
        Assert.assertEquals(p1.hashCode(), p2.hashCode());
        Assert.assertNotEquals(p1, p3);
        Assert.assertNotEquals(p1, "notAPointer");
    }

    @Test
    public void testGetPointerByID() {
        Element root = document.createElement("root");
        document.appendChild(root);
        Element targetElem = document.createElement("target");
        targetElement.setAttribute("id", "elemId");
        root.appendChild(targetElement);

        DOMNodePointer pointer = new DOMNodePointer(root, locale);
        JXPathContext context = JXPathContext.newContext(new Object());

        Pointer found = pointer.getPointerByID(context, "elemId");
        Assert.assertNotNull(found);
        Assert.assertFalse(found instanceof NullPointer);

        Pointer notFound = pointer.getPointerByID(context, "nonExistent");
        Assert.assertTrue(notFound instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.createElement("root");
        Element child1 = document.createElement("child1");
        Element child2 = document.createElement("child2");
        root.setAttribute("attr1", "val1");
        root.setAttribute("attr2", "val2");
        root.appendChild(child1);
        root.appendChild(child2);

        DOMNodePointer rootPtr = new DOMNodePointer(root, locale);
        DOMNodePointer p1 = new DOMNodePointer(rootPtr, child1);
        DOMNodePointer p2 = new DOMNodePointer(rootPtr, child2);
        DOMNodePointer p3 = new DOMNodePointer(rootPtr, child1);

        Assert.assertEquals(0, rootPtr.compareChildNodePointers(p1, p3));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(p1, p2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(p2, p1));

        org.w3c.dom.Attr attr1 = root.getAttributeNode("attr1");
        org.w3c.dom.Attr attr2 = root.getAttributeNode("attr2");
        DOMNodePointer attrPtr1 = new DOMNodePointer(rootPtr, attr1);
        DOMNodePointer attrPtr2 = new DOMNodePointer(rootPtr, attr2);

        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr1, p1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(p1, attrPtr1));
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr1, attrPtr2));
    }
}