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
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;
    private DOMNodePointer rootPointer;
    private JXPathContext context;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        document = dbf.newDocumentBuilder().newDocument();
        
        Element root = document.createElementNS("http://example.com/root", "root:element");
        root.setAttribute("xmlns:root", "http://example.com/root");
        root.setAttribute("xml:lang", "en-US");
        document.appendChild(root);

        Element child = document.createElement("child");
        child.setAttribute("id", "testId");
        root.appendChild(child);

        Text text = document.createTextNode("Hello World");
        child.appendChild(text);

        Comment comment = document.createComment("my comment");
        root.appendChild(comment);

        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        root.appendChild(pi);

        rootPointer = new DOMNodePointer(root, Locale.ENGLISH);
        context = JXPathContext.newContext(document);
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        DOMNodePointer p1 = new DOMNodePointer(document, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(document, Locale.ENGLISH, "myId");
        DOMNodePointer p3 = new DOMNodePointer(rootPointer, document.getDocumentElement());

        Assert.assertNotNull(p1.getBaseValue());
        Assert.assertNotNull(p2.getBaseValue());
        Assert.assertNotNull(p3.getBaseValue());
        Assert.assertEquals(1, p1.getLength());
        Assert.assertFalse(p1.isCollection());
        Assert.assertTrue(p1.isActual());
        Assert.assertFalse(p1.isLeaf());
    }

    @Test
    public void testTestNodeNull() {
        Assert.assertTrue(DOMNodePointer.testNode(document.getDocumentElement(), null));
        Assert.assertTrue(rootPointer.testNode(null));
    }

    @Test
    public void testTestNodeNameTest() {
        Element rootEl = document.getDocumentElement();
        
        // Wildcard with null prefix
        NodeNameTest wildcardTest1 = new NodeNameTest(new QName(null, "*"), null);
        Assert.assertTrue(DOMNodePointer.testNode(rootEl, wildcardTest1));

        // Non-element node with NodeNameTest should return false
        Node textNode = rootEl.getElementsByTagName("child").item(0).getFirstChild();
        Assert.assertFalse(DOMNodePointer.testNode(textNode, wildcardTest1));

        // Matching name and namespace
        NodeNameTest nameTest = new NodeNameTest(new QName("root", "element"), "http://example.com/root");
        Assert.assertTrue(DOMNodePointer.testNode(rootEl, nameTest));

        // Non-matching name
        NodeNameTest mismatchTest = new NodeNameTest(new QName("root", "wrong"), "http://example.com/root");
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, mismatchTest));

        // Wildcard name with namespace
        NodeNameTest wildcardNsTest = new NodeNameTest(new QName(null, "*"), "http://example.com/root");
        Assert.assertTrue(DOMNodePointer.testNode(rootEl, wildcardNsTest));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element rootEl = document.getDocumentElement();
        Node textNode = rootEl.getElementsByTagName("child").item(0).getFirstChild();
        Node commentNode = rootEl.getElementsByTagName("child").item(0).getNextSibling();
        Node piNode = commentNode.getNextSibling();

        // NODE_TYPE_NODE (Element or Document)
        Assert.assertTrue(DOMNodePointer.testNode(rootEl, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(DOMNodePointer.testNode(document, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(DOMNodePointer.testNode(textNode, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        // NODE_TYPE_TEXT (Text or CDATA)
        Assert.assertTrue(DOMNodePointer.testNode(textNode, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        // NODE_TYPE_COMMENT
        Assert.assertTrue(DOMNodePointer.testNode(commentNode, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        // NODE_TYPE_PI
        Assert.assertTrue(DOMNodePointer.testNode(piNode, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        // Invalid NodeTypeTest
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, new NodeTypeTest(999)));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        Element rootEl = document.getDocumentElement();
        Node piNode = rootEl.getLastChild();

        ProcessingInstructionTest piTestMatch = new ProcessingInstructionTest("target");
        ProcessingInstructionTest piTestNoMatch = new ProcessingInstructionTest("wrongTarget");

        Assert.assertTrue(DOMNodePointer.testNode(piNode, piTestMatch));
        Assert.assertFalse(DOMNodePointer.testNode(piNode, piTestNoMatch));
        Assert.assertFalse(DOMNodePointer.testNode(rootEl, piTestMatch));
    }

    @Test
    public void testGetName() {
        DOMNodePointer elPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH);
        QName elName = elPtr.getName();
        Assert.assertEquals("root", elName.getPrefix());
        Assert.assertEquals("element", elName.getName());

        Node piNode = document.getDocumentElement().getLastChild();
        DOMNodePointer piPtr = new DOMNodePointer(piNode, Locale.ENGLISH);
        QName piName = piPtr.getName();
        Assert.assertEquals("target", piName.getName());
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        DOMNodePointer p = rootPointer;
        Assert.assertEquals("http://example.com/root", p.getNamespaceURI("root"));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, p.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, p.getNamespaceURI("xmlns"));
        Assert.assertEquals("", p.getNamespaceURI(""));
        Assert.assertEquals(null, p.getNamespaceURI("unknownPrefix"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        DOMNodePointer p = rootPointer;
        Assert.assertNull(p.getDefaultNamespaceURI());
        
        Element child = (Element) document.getDocumentElement().getFirstChild();
        child.setAttribute("xmlns", "http://default.com");
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);
        Assert.assertEquals("http://default.com", childPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testIteratorsAndPointers() {
        NodeIterator childIt = rootPointer.childIterator(null, false, null);
        Assert.assertNotNull(childIt);

        NodeIterator attrIt = rootPointer.attributeIterator(new QName("xmlns:root"));
        Assert.assertNotNull(attrIt);

        NodePointer nsPtr = rootPointer.namespacePointer("root");
        Assert.assertNotNull(nsPtr);

        NodeIterator nsIt = rootPointer.namespaceIterator();
        Assert.assertNotNull(nsIt);
    }

    @Test
    public void testIsLanguage() {
        Assert.assertTrue(rootPointer.isLanguage("en"));
        Assert.assertTrue(rootPointer.isLanguage("en-US"));
        Assert.assertFalse(rootPointer.isLanguage("fr"));
    }

    @Test
    public void testSetValueOnTextNode() {
        Node textNode = document.getDocumentElement().getFirstChild().getFirstChild();
        DOMNodePointer textPtr = new DOMNodePointer(textNode, Locale.ENGLISH);
        
        textPtr.setValue("New Text");
        Assert.assertEquals("New Text", textNode.getNodeValue());

        // Empty string should remove the text node
        textPtr.setValue("");
        Assert.assertNull(textNode.getParentNode());
    }

    @Test
    public void testSetValueOnElementNode() {
        Element child = (Element) document.getDocumentElement().getFirstChild();
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);

        Element newChild = document.createElement("replacement");
        childPtr.setValue(newChild);
        Assert.assertEquals(1, child.getChildNodes().getLength());
        Assert.assertEquals("replacement", child.getFirstChild().getNodeName());

        // Set string value on element
        childPtr.setValue("String Value");
        Assert.assertEquals(1, child.getChildNodes().getLength());
        Assert.assertEquals("String Value", child.getFirstChild().getNodeValue());
    }

    @Test
    public void testCreateAttribute() {
        Element child = (Element) document.getDocumentElement().getFirstChild();
        DOMNodePointer childPtr = new DOMNodePointer(child, Locale.ENGLISH);

        // Attribute without prefix
        NodePointer attrPtr1 = childPtr.createAttribute(context, new QName("newAttr"));
        Assert.assertNotNull(attrPtr1);
        Assert.assertTrue(child.hasAttribute("newAttr"));

        // Attribute with known prefix
        NodePointer attrPtr2 = childPtr.createAttribute(context, new QName("root", "attr"));
        Assert.assertNotNull(attrPtr2);

        // Attribute with unknown prefix should throw JXPathException
        try {
            childPtr.createAttribute(context, new QName("unknown", "attr"));
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            // Expected
        }

        // On non-element node should delegate to super
        DOMNodePointer textPtr = new DOMNodePointer(child.getFirstChild(), Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
        } catch (Exception e) {
            // Expected UnsupportedOperationException or similar from super
        }
    }

    @Test
    public void testRemoveRootNode() {
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);
        try {
            docPtr.remove();
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot remove root DOM node"));
        }

        DOMNodePointer childPtr = new DOMNodePointer(document.getDocumentElement().getFirstChild(), Locale.ENGLISH);
        childPtr.remove();
        Assert.assertNull(document.getDocumentElement().getFirstChild());
    }

    @Test
    public void testAsPath() {
        DOMNodePointer idPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH, "my'Id\"Quote");
        Assert.assertTrue(idPtr.asPath().contains("id("));

        DOMNodePointer elPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH);
        Assert.assertNotNull(elPtr.asPath());

        Node textNode = document.getDocumentElement().getFirstChild().getFirstChild();
        DOMNodePointer textPtr = new DOMNodePointer(elPtr, textNode);
        Assert.assertTrue(textPtr.asPath().contains("text()"));

        Node piNode = document.getDocumentElement().getLastChild();
        DOMNodePointer piPtr = new DOMNodePointer(elPtr, piNode);
        Assert.assertTrue(piPtr.asPath().contains("processing-instruction"));
    }

    @Test
    public void testGetValueAndComment() {
        Node commentNode = document.getDocumentElement().getElementsByTagName("child").item(0).getNextSibling();
        DOMNodePointer commentPtr = new DOMNodePointer(commentNode, Locale.ENGLISH);
        Assert.assertEquals("my comment", commentPtr.getValue());

        DOMNodePointer rootValPtr = new DOMNodePointer(document.getDocumentElement(), Locale.ENGLISH);
        Assert.assertNotNull(rootValPtr.getValue());
    }

    @Test
    public void testGetPointerByID() {
        DOMNodePointer docPtr = new DOMNodePointer(document, Locale.ENGLISH);
        Pointer ptr1 = docPtr.getPointerByID(context, "testId");
        Assert.assertNotNull(ptr1);

        Pointer ptr2 = docPtr.getPointerByID(context, "nonExistentId");
        Assert.assertNotNull(ptr2);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = document.getDocumentElement();
        Node child1 = root.getFirstChild();
        Node child2 = child1.getNextSibling();

        DOMNodePointer p1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer p2 = new DOMNodePointer(rootPointer, child2);
        DOMNodePointer p1Dup = new DOMNodePointer(rootPointer, child1);

        Assert.assertEquals(0, rootPointer.compareChildNodePointers(p1, p1Dup));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));

        // Attribute comparison branch
        DOMNodePointer attr1 = new DOMNodePointer(rootPointer, child1.getAttributes().item(0));
        DOMNodePointer attr2 = new DOMNodePointer(rootPointer, child1.getAttributes().item(0));
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(attr1, attr2));
    }
}