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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class DOMNodePointerTest {

    private Document document;
    private DOMNodePointer rootPointer;
    private Locale locale;

    @Before
    public void setUp() throws Exception {
        locale = Locale.getDefault();
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = document.createElementNS("http://example.com/ns", "root");
        root.setAttribute("xmlns", "http://example.com/default");
        root.setAttribute("xmlns:ns1", "http://example.com/ns1");
        root.setAttribute("xml:lang", "en-US");
        document.appendChild(root);
        
        Element child = document.createElement("child");
        root.appendChild(child);
        
        rootPointer = new DOMNodePointer(root, locale);
    }

    @Test
    public void testConstructorsAndBasics() {
        DOMNodePointer ptr1 = new DOMNodePointer(document.getDocumentElement(), locale, "myId");
        Assert.assertNotNull(ptr1);
        Assert.assertEquals(document.getDocumentElement(), ptr1.getBaseValue());
        Assert.assertEquals(document.getDocumentElement(), ptr1.getImmediateNode());
        Assert.assertTrue(ptr1.isActual());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(1, ptr1.getLength());
        Assert.assertFalse(ptr1.isLeaf());
        Assert.assertEquals(document.getDocumentElement().hashCode(), ptr1.hashCode());
        
        DOMNodePointer ptr2 = new DOMNodePointer(rootPointer, document.getDocumentElement());
        Assert.assertNotNull(ptr2);
    }

    @Test
    public void testTestNodeNull() {
        Assert.assertTrue(DOMNodePointer.testNode(document.getDocumentElement(), null));
        Assert.assertTrue(rootPointer.testNode(null));
    }

    @Test
    public void testTestNodeNameTest() {
        Element element = document.getDocumentElement();
        
        // Wildcard with null prefix
        NodeNameTest wildcardTest1 = new NodeNameTest(new QName(null, "*"), null);
        Assert.assertTrue(DOMNodePointer.testNode(element, wildcardTest1));
        
        // Non-element node with NodeNameTest should return false
        Text textNode = document.createTextNode("hello");
        Assert.assertFalse(DOMNodePointer.testNode(textNode, wildcardTest1));
        
        // Matching local name and namespace
        NodeNameTest nameTest = new NodeNameTest(new QName("http://example.com/ns", "root"), "http://example.com/ns");
        Assert.assertTrue(DOMNodePointer.testNode(element, nameTest));

        // Mismatched name
        NodeNameTest mismatchTest = new NodeNameTest(new QName("http://example.com/ns", "wrong"), "http://example.com/ns");
        Assert.assertFalse(DOMNodePointer.testNode(element, mismatchTest));
    }

    @Test
    public void testTestNodeTypeTest() {
        Element element = document.getDocumentElement();
        Text text = document.createTextNode("text");
        Comment comment = document.createComment("comment");
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        CDATASection cdata = document.createCDATASection("cdata");

        // NODE type (Element or Document)
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        Assert.assertTrue(DOMNodePointer.testNode(element, nodeTypeTest));
        Assert.assertTrue(DOMNodePointer.testNode(document, nodeTypeTest));
        Assert.assertFalse(DOMNodePointer.testNode(text, nodeTypeTest));

        // TEXT type (Text or CDATA)
        NodeTypeTest textTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Assert.assertTrue(DOMNodePointer.testNode(text, textTypeTest));
        Assert.assertTrue(DOMNodePointer.testNode(cdata, textTypeTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, textTypeTest));

        // COMMENT type
        NodeTypeTest commentTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        Assert.assertTrue(DOMNodePointer.testNode(comment, commentTypeTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, commentTypeTest));

        // PI type
        NodeTypeTest piTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE_TYPE); // invalid/other
        Assert.assertFalse(DOMNodePointer.testNode(element, piTypeTest));

        NodeTypeTest piTestType = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTypeTest));
        Assert.assertFalse(DOMNodePointer.testNode(element, piTypeTest));
    }

    @Test
    public void testTestNodeProcessingInstructionTest() {
        ProcessingInstruction pi = document.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target1");
        Assert.assertTrue(DOMNodePointer.testNode(pi, piTest));

        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");
        Assert.assertFalse(DOMNodePointer.testNode(pi, piTestMismatch));

        Element element = document.getDocumentElement();
        Assert.assertFalse(DOMNodePointer.testNode(element, piTest));
    }

    @Test
    public void testGetNamespaceURIWithPrefixes() {
        Assert.assertEquals("http://example.com/default", rootPointer.getNamespaceURI(null));
        Assert.assertEquals("http://example.com/default", rootPointer.getNamespaceURI(""));
        Assert.assertEquals(DOMNodePointer.XML_NAMESPACE_URI, rootPointer.getNamespaceURI("xml"));
        Assert.assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, rootPointer.getNamespaceURI("xmlns"));
        Assert.assertEquals("http://example.com/ns1", rootPointer.getNamespaceURI("ns1"));
        
        // Unknown namespace
        Assert.assertNull(rootPointer.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetDefaultNamespaceURI() {
        Assert.assertEquals("http://example.com/default", rootPointer.getDefaultNamespaceURI());
        
        DOMNodePointer docPtr = new DOMNodePointer(document, locale);
        Assert.assertNotNull(docPtr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetName() {
        QName name = rootPointer.getName();
        Assert.assertNotNull(name);
        
        ProcessingInstruction pi = document.createProcessingInstruction("my-target", "data");
        DOMNodePointer piPtr = new DOMNodePointer(pi, locale);
        Assert.assertEquals("my-target", piPtr.getName().getName());
    }

    @Test
    public void testIteratorsAndPointers() {
        Assert.assertNotNull(rootPointer.childIterator(null, false, null));
        Assert.assertNotNull(rootPointer.attributeIterator(new QName("attr")));
        Assert.assertNotNull(rootPointer.namespacePointer("ns1"));
        Assert.assertNotNull(rootPointer.namespaceIterator());
        Assert.assertNotNull(rootPointer.getNamespaceResolver());
    }

    @Test
    public void testIsLanguage() {
        Assert.assertTrue(rootPointer.isLanguage("en"));
        Assert.assertTrue(rootPointer.isLanguage("EN-US"));
        Assert.assertFalse(rootPointer.isLanguage("fr"));
    }

    @Test
    public void testSetValueTextNode() {
        Text text = document.createTextNode("old value");
        document.getDocumentElement().appendChild(text);
        DOMNodePointer textPtr = new DOMNodePointer(rootPointer, text);
        
        textPtr.setValue("new value");
        Assert.assertEquals("new value", text.getNodeValue());

        // Empty value should remove the node
        textPtr.setValue("");
        Assert.assertNull(text.getParentNode());
    }

    @Test
    public void testSetValueElementNode() {
        Element child = (Element) document.getDocumentElement().getFirstChild();
        DOMNodePointer childPtr = new DOMNodePointer(rootPointer, child);
        
        Element newChild = document.createElement("replacement");
        childPtr.setValue(newChild);
        Assert.assertTrue(child.hasChildNodes());
        
        childPtr.setValue("string value");
        Assert.assertTrue(child.hasChildNodes());
    }

    @Test
    public void testCreateAttribute() {
        JXPathContext context = JXPathContext.newContext(document);
        
        // Attribute with prefix
        try {
            rootPointer.createAttribute(context, new QName("ns1", "newAttr"));
        } catch (JXPathException e) {
            // Expected if context fails to resolve, but tests the branch
        }

        // Attribute without prefix
        Pointer attrPtr = rootPointer.createAttribute(context, new QName("plainAttr"));
        Assert.assertNotNull(attrPtr);

        // On non-element node
        Text text = document.createTextNode("abc");
        DOMNodePointer textPtr = new DOMNodePointer(rootPointer, text);
        Pointer superAttrPtr = textPtr.createAttribute(context, new QName("attr"));
        Assert.assertNotNull(superAttrPtr);
    }

    @Test
    public void testRemove() {
        Element tempChild = document.createElement("temp");
        document.getDocumentElement().appendChild(tempChild);
        DOMNodePointer tempPtr = new DOMNodePointer(rootPointer, tempChild);
        tempPtr.remove();
        Assert.assertNull(tempChild.getParentNode());

        // Root node removal should throw exception
        try {
            rootPointer.remove();
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            // Success
        }
    }

    @Test
    public void testAsPathWithIdAndEscaping() {
        DOMNodePointer idPtr = new DOMNodePointer(document.getDocumentElement(), locale, "id'1\"2");
        String path = idPtr.asPath();
        Assert.assertTrue(path.contains("&apos;") && path.contains("&quot;"));

        Element child = (Element) document.getDocumentElement().getFirstChild();
        DOMNodePointer childPtr = new DOMNodePointer(rootPointer, child);
        Assert.assertNotNull(childPtr.asPath());
        
        Comment comment = document.createComment("c");
        document.getDocumentElement().appendChild(comment);
        DOMNodePointer commentPtr = new DOMNodePointer(rootPointer, comment);
        Assert.assertNotNull(commentPtr.asPath());
        
        ProcessingInstruction pi = document.createProcessingInstruction("target", "data");
        document.getDocumentElement().appendChild(pi);
        DOMNodePointer piPtr = new DOMNodePointer(rootPointer, pi);
        Assert.assertNotNull(piPtr.asPath());
    }

    @Test
    public void testGetValue() {
        Comment comment = document.createComment("   comment text   ");
        DOMNodePointer commentPtr = new DOMNodePointer(rootPointer, comment);
        Assert.assertEquals("comment text", commentPtr.getValue());

        Comment emptyComment = document.createComment(null);
        DOMNodePointer emptyCommentPtr = new DOMNodePointer(rootPointer, emptyComment);
        Assert.assertEquals("", emptyCommentPtr.getValue());

        Assert.assertNotNull(rootPointer.getValue());
    }

    @Test
    public void testGetPointerById() {
        Element el = document.createElement("targetEl");
        el.setAttribute("id", "uniqueId");
        document.getDocumentElement().appendChild(el);
        
        Pointer ptr = rootPointer.getPointerByID(JXPathContext.newContext(document), "uniqueId");
        Assert.assertNotNull(ptr);

        Pointer missingPtr = rootPointer.getPointerByID(JXPathContext.newContext(document), "nonExistent");
        Assert.assertTrue(missingPtr instanceof NullPointer);
    }

    @Test
    public void testCompareChildNodePointers() {
        Element child1 = document.createElement("c1");
        Element child2 = document.createElement("c2");
        document.getDocumentElement().appendChild(child1);
        document.getDocumentElement().appendChild(child2);

        DOMNodePointer ptr1 = new DOMNodePointer(rootPointer, child1);
        DOMNodePointer ptr2 = new DOMNodePointer(rootPointer, child2);
        DOMNodePointer ptr1Dup = new DOMNodePointer(rootPointer, child1);

        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptr1, ptr1));
        Assert.assertEquals(0, rootPointer.compareChildNodePointers(ptr1, ptr1Dup));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(ptr1, ptr2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(ptr2, ptr1));
    }
}