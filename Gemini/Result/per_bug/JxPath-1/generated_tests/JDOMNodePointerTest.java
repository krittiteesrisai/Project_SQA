package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.junit.Assert;
import org.junit.Test;

public class JDOMNodePointerTest {

    @Test
    public void testConstructorsAndBasicGetters() {
        Element elem = new Element("root");
        JDOMNodePointer ptr1 = new JDOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertEquals(elem, ptr1.getBaseValue());
        Assert.assertEquals(elem, ptr1.getImmediateNode());
        Assert.assertFalse(ptr1.isCollection());
        Assert.assertEquals(1, ptr1.getLength());

        JDOMNodePointer ptr2 = new JDOMNodePointer(elem, Locale.ENGLISH, "id1");
        Assert.assertEquals("id('id1')", ptr2.asPath());

        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, elem);
        Assert.assertNotNull(ptr3.childIterator(new NodeTypeTest(Compiler.NODE_TYPE_NODE), false, null));
        Assert.assertNotNull(ptr3.attributeIterator(new QName("attr")));
        Assert.assertNotNull(ptr3.namespaceIterator());
        Assert.assertNotNull(ptr3.namespacePointer("xml"));
    }

    @Test
    public void testGetNamespaceURI() {
        Element elemNoNs = new Element("elem");
        JDOMNodePointer ptrNoNs = new JDOMNodePointer(elemNoNs, Locale.ENGLISH);
        Assert.assertNull(ptrNoNs.getNamespaceURI());

        Element elemEmptyNs = new Element("elem", Namespace.getNamespace("", ""));
        JDOMNodePointer ptrEmptyNs = new JDOMNodePointer(elemEmptyNs, Locale.ENGLISH);
        Assert.assertNull(ptrEmptyNs.getNamespaceURI());

        Element elemWithNs = new Element("elem", Namespace.getNamespace("p", "http://example.com"));
        JDOMNodePointer ptrWithNs = new JDOMNodePointer(elemWithNs, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", ptrWithNs.getNamespaceURI());

        Document doc = new Document(elemWithNs);
        JDOMNodePointer ptrDoc = new JDOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", ptrDoc.getNamespaceURI("p"));
        Assert.assertNull(ptrDoc.getNamespaceURI("nonexistent"));

        Assert.assertEquals("http://example.com", ptrWithNs.getNamespaceURI("p"));
        Assert.assertNull(ptrWithNs.getNamespaceURI("nonexistent"));

        Text text = new Text("sample");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(ptrText.getNamespaceURI("p"));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = new Element("root");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        Attribute attr1 = new Attribute("a1", "val1");
        Attribute attr2 = new Attribute("a2", "val2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer c1Ptr = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer c2Ptr = new JDOMNodePointer(rootPtr, child2);
        JDOMNodePointer a1Ptr = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer a2Ptr = new JDOMNodePointer(rootPtr, attr2);

        // Same node
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(c1Ptr, c1Ptr));

        // Attribute vs Non-Attribute
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(a1Ptr, c1Ptr));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(c1Ptr, a1Ptr));

        // Attribute vs Attribute
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(a1Ptr, a2Ptr));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(a2Ptr, a1Ptr));

        // Normal children
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(c1Ptr, c2Ptr));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(c2Ptr, c1Ptr));

        // Non-element base validation error
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        try {
            textPtr.compareChildNodePointers(c1Ptr, c2Ptr);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Expected
        }
    }

    @Test
    public void testIsLeaf() {
        Element emptyElem = new Element("elem");
        JDOMNodePointer ptr1 = new JDOMNodePointer(emptyElem, Locale.ENGLISH);
        Assert.assertTrue(ptr1.isLeaf());

        emptyElem.addContent(new Text("content"));
        Assert.assertFalse(ptr1.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer ptr2 = new JDOMNodePointer(emptyDoc, Locale.ENGLISH);
        Assert.assertTrue(ptr2.isLeaf());

        emptyDoc.setRootElement(new Element("root"));
        Assert.assertFalse(ptr2.isLeaf());

        Text text = new Text("leaf");
        JDOMNodePointer ptr3 = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertTrue(ptr3.isLeaf());
    }

    @Test
    public void testGetName() {
        Element elem = new Element("elem", Namespace.getNamespace("pre", "uri"));
        JDOMNodePointer ptr1 = new JDOMNodePointer(elem, Locale.ENGLISH);
        Assert.assertEquals(new QName("pre", "elem"), ptr1.getName());

        Element elemEmptyNs = new Element("elem", Namespace.getNamespace("", "uri"));
        JDOMNodePointer ptr2 = new JDOMNodePointer(elemEmptyNs, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "elem"), ptr2.getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptr3 = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals(new QName(null, "target"), ptr3.getName());
    }

    @Test
    public void testGetValue() {
        Element elem = new Element("elem");
        elem.setText("  trim me  ");
        Assert.assertEquals("trim me", new JDOMNodePointer(elem, Locale.ENGLISH).getValue());

        Comment comment = new Comment("  comment  ");
        Assert.assertEquals("comment", new JDOMNodePointer(comment, Locale.ENGLISH).getValue());
        Comment nullComment = new Comment((String) null);
        // Note: Comment.getText() returns empty string or null depending on JDOM version, handle safely if needed.

        Text text = new Text("  text  ");
        Assert.assertEquals("text", new JDOMNodePointer(text, Locale.ENGLISH).getValue());

        CDATA cdata = new CDATA("  cdata  ");
        Assert.assertEquals("cdata", new JDOMNodePointer(cdata, Locale.ENGLISH).getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  data  ");
        Assert.assertEquals("data", new JDOMNodePointer(pi, Locale.ENGLISH).getValue());

        Assert.assertNull(new JDOMNodePointer(new Attribute("a", "v"), Locale.ENGLISH).getValue());
    }

    @Test
    public void testSetValue() {
        // Text nodesetValue
        Text text = new Text("old");
        Element parent = new Element("parent");
        parent.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(text, Locale.ENGLISH);
        textPtr.setValue("new");
        Assert.assertEquals("new", text.getText());

        // Text node setValue empty/null -> remove
        textPtr.setValue("");
        Assert.assertFalse(parent.getContent().contains(text));

        // Element setValue with Element, Document, Text, CDATA, PI, Comment, and Object
        Element elem = new Element("elem");
        JDOMNodePointer elemPtr = new JDOMNodePointer(elem, Locale.ENGLISH);

        elemPtr.setValue(new Element("sub"));
        Assert.assertEquals(1, elem.getContent().size());

        elemPtr.setValue(new Document(new Element("docElem")));
        Assert.assertEquals(1, elem.getContent().size());

        elemPtr.setValue(new Text("textVal"));
        elemPtr.setValue(new CDATA("cdataVal"));
        elemPtr.setValue(new ProcessingInstruction("pi", "data"));
        elemPtr.setValue(new Comment("comment"));
        elemPtr.setValue(123);
        elemPtr.setValue(""); // empty string conversion branch
    }

    @Test
    public void testTestNode() {
        Element elem = new Element("elem", Namespace.getNamespace("p", "uri"));
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Null test
        Assert.assertTrue(ptr.testNode(null));

        // NodeNameTest
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(ptr.testNode(wildcardTest));

        NodeNameTest exactTest = new NodeNameTest(new QName("p", "elem"), "uri");
        Assert.assertTrue(ptr.testNode(exactTest));

        NodeNameTest mismatchTest = new NodeNameTest(new QName("p", "other"), "uri");
        Assert.assertFalse(ptr.testNode(mismatchTest));

        // Non-element with NodeNameTest
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        Assert.assertFalse(textPtr.testNode(exactTest));

        // NodeTypeTest
        Assert.assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(999))); // invalid type

        JDOMNodePointer textNodePtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        Assert.assertTrue(textNodePtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        JDOMNodePointer cdataNodePtr = new JDOMNodePointer(new CDATA("c"), Locale.ENGLISH);
        Assert.assertTrue(cdataNodePtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        JDOMNodePointer commentPtr = new JDOMNodePointer(new Comment("c"), Locale.ENGLISH);
        Assert.assertTrue(commentPtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));

        JDOMNodePointer piPtr = new JDOMNodePointer(new ProcessingInstruction("t", "d"), Locale.ENGLISH);
        Assert.assertTrue(piPtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));

        // ProcessingInstructionTest
        Assert.assertTrue(piPtr.testNode(new ProcessingInstructionTest("t")));
        Assert.assertFalse(piPtr.testNode(new ProcessingInstructionTest("wrong")));
        Assert.assertFalse(ptr.testNode(new ProcessingInstructionTest("t"))); // elem is not PI
    }

    @Test
    public void testLanguageMethods() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(new JDOMNodePointer(parent, Locale.ENGLISH), child);
        Assert.assertTrue(childPtr.isLanguage("EN"));
        Assert.assertFalse(childPtr.isLanguage("FR"));

        Element noLangElem = new Element("noLang");
        JDOMNodePointer noLangPtr = new JDOMNodePointer(noLangElem, Locale.ENGLISH);
        // Calls super.isLanguage which usually relies on context/locale
        Assert.assertFalse(noLangPtr.isLanguage("FR"));
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elem = new Element("elem", Namespace.getNamespace("pre", "uri"));
        Assert.assertEquals("pre", JDOMNodePointer.getPrefix(elem));
        Assert.assertEquals("elem", JDOMNodePointer.getLocalName(elem));

        Element elemNoPrefix = new Element("elem");
        Assert.assertNull(JDOMNodePointer.getPrefix(elemNoPrefix));

        Attribute attr = new Attribute("attr", "val", Namespace.getNamespace("apre", "uri"));
        Assert.assertEquals("apre", JDOMNodePointer.getPrefix(attr));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attr));

        Assert.assertNull(JDOMNodePointer.getPrefix(new Text("txt")));
        Assert.assertNull(JDOMNodePointer.getLocalName(new Text("txt")));
    }

    @Test
    public void testCreateAttribute() {
        Element elem = new Element("elem", Namespace.getNamespace("pre", "uri"));
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        JXPathContext context = JXPathContext.newContext(new Object());
        
        // Create attribute with unknown prefix
        try {
            ptr.createAttribute(context, new QName("unknown", "attr"));
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            // Expected
        }

        // Create attribute with valid prefix
        NodePointer attrPtr1 = ptr.createAttribute(context, new QName("pre", "attr1"));
        Assert.assertNotNull(attrPtr1);

        // Create attribute without prefix
        NodePointer attrPtr2 = ptr.createAttribute(context, new QName("attr2"));
        Assert.assertNotNull(attrPtr2);

        // Create attribute on non-element
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
        } catch (Exception e) {
            // Expected fallback or exception
        }
    }

    @Test
    public void testRemoveRootNode() {
        Element elem = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);
        try {
            ptr.remove();
            Assert.fail("Expected JXPathException for removing root node");
        } catch (JXPathException e) {
            // Expected
        }
    }

    @Test
    public void testAsPathWithEscapingAndTypes() {
        JDOMNodePointer idPtr = new JDOMNodePointer(new Element("e"), Locale.ENGLISH, "id'\"test");
        Assert.assertEquals("id('id&apos;&quot;test')", idPtr.asPath());

        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        Text text = new Text("txt");
        CDATA cdata = new CDATA("cd");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");

        parent.addContent(child1);
        parent.addContent(child2);
        parent.addContent(text);
        parent.addContent(cdata);
        parent.addContent(pi);

        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        JDOMNodePointer c1Ptr = new JDOMNodePointer(parentPtr, child1);
        JDOMNodePointer textPtr = new JDOMNodePointer(parentPtr, text);
        JDOMNodePointer cdataPtr = new JDOMNodePointer(parentPtr, cdata);
        JDOMNodePointer piPtr = new JDOMNodePointer(parentPtr, pi);

        Assert.assertTrue(c1Ptr.asPath().contains("child"));
        Assert.assertTrue(textPtr.asPath().contains("text()"));
        Assert.assertTrue(cdataPtr.asPath().contains("text()"));
        Assert.assertTrue(piPtr.asPath().contains("processing-instruction"));
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildFactoryException() {
        Element elem = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        // Context has no factory set by default, should throw exception
        ptr.createChild(context, new QName("newChild"), 0);
    }

    @Test
    public void hashCodeAndEquals() {
        Element e1 = new Element("e");
        Element e2 = new Element("e");
        JDOMNodePointer p1 = new JDOMNodePointer(e1, Locale.ENGLISH);
        JDOMNodePointer p2 = new JDOMNodePointer(e1, Locale.ENGLISH);
        JDOMNodePointer p3 = new JDOMNodePointer(e2, Locale.ENGLISH);

        Assert.assertEquals(p1, p1);
        Assert.assertEquals(p1, p2);
        Assert.assertNotEquals(p1, p3);
        Assert.assertNotEquals(p1, "someString");
        Assert.assertEquals(p1.hashCode(), System.identityHashCode(e1));
    }
}