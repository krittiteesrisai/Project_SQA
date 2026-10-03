package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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

/**
 * Comprehensive JUnit 4 test suite for JDOMNodePointer focusing on high Branch/Condition Coverage
 * and edge cases for Defects4J JxPath-19.
 */
public class JDOMNodePointerTest extends TestCase {

    private JXPathContext context;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        context = JXPathContext.newContext(null);
    }

    public void testConstructorsAndBasicGetters() {
        Element element = new Element("root");
        Locale locale = Locale.ENGLISH;
        
        JDOMNodePointer ptr1 = new JDOMNodePointer(element, locale);
        assertSame(element, ptr1.getBaseValue());
        assertSame(element, ptr1.getImmediateNode());
        assertFalse(ptr1.isCollection());
        assertEquals(1, ptr1.getLength());
        assertEquals(locale, ptr1.getLocale());

        JDOMNodePointer ptr2 = new JDOMNodePointer(element, locale, "id123");
        assertEquals("id('id123')", ptr2.asPath());

        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, element);
        assertNotNull(ptr3.getNamespaceResolver());
    }

    public void testIsLeaf() {
        Element emptyElement = new Element("empty");
        JDOMNodePointer ptr1 = new JDOMNodePointer(emptyElement, Locale.ENGLISH);
        assertTrue(ptr1.isLeaf());

        Element parentElement = new Element("parent");
        parentElement.addContent(new Element("child"));
        JDOMNodePointer ptr2 = new JDOMNodePointer(parentElement, Locale.ENGLISH);
        assertFalse(ptr2.isLeaf());

        Document doc = new Document();
        JDOMNodePointer ptrDocEmpty = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertTrue(ptrDocEmpty.isLeaf());

        doc.setRootElement(new Element("root"));
        JDOMNodePointer ptrDocFull = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertFalse(ptrDocFull.isLeaf());

        Text textNode = new Text("text");
        JDOMNodePointer ptrText = new JDOMNodePointer(textNode, Locale.ENGLISH);
        assertTrue(ptrText.isLeaf());
    }

    public void testGetName() {
        Element elem = new Element("elem", Namespace.getNamespace("pre", "http://example.com"));
        JDOMNodePointer ptrElem = new JDOMNodePointer(elem, Locale.ENGLISH);
        QName qNameElem = ptrElem.getName();
        assertEquals("elem", qNameElem.getName());
        assertEquals("pre", qNameElem.getPrefix());

        Element elemNoNs = new Element("plain");
        JDOMNodePointer ptrPlain = new JDOMNodePointer(elemNoNs, Locale.ENGLISH);
        assertNull(ptrPlain.getName().getPrefix());
        assertEquals("plain", ptrPlain.getName().getName());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptrPi = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("target", ptrPi.getName().getName());
    }

    public void testGetNamespaceURIAndPrefix() {
        Element elem = new Element("elem", "http://example.com");
        assertEquals("http://example.com", JDOMNodePointer.getNamespaceURI(elem));
        assertEquals("http://example.com", new JDOMNodePointer(elem, Locale.ENGLISH).getNamespaceURI());

        Element elemEmptyNs = new Element("elem", Namespace.getNamespace("", ""));
        assertNull(JDOMNodePointer.getNamespaceURI(elemEmptyNs));

        Text text = new Text("abc");
        assertNull(JDOMNodePointer.getNamespaceURI(text));
        assertNull(new JDOMNodePointer(text, Locale.ENGLISH).getNamespaceURI());

        assertNull(JDOMNodePointer.getPrefix(text));
        assertNull(JDOMNodePointer.getLocalName(text));

        Attribute attr = new Attribute("attr", "val", Namespace.getNamespace("attpre", "http://attr.com"));
        assertEquals("attpre", JDOMNodePointer.getPrefix(attr));
        assertEquals("attr", JDOMNodePointer.getLocalName(attr));

        Element attrElem = new Element("elem");
        attrElem.setAttribute(attr);
        assertEquals("attpre", JDOMNodePointer.getPrefix(attr));
    }

    public void testGetNamespaceURIWithPrefix() {
        Element root = new Element("root");
        root.setNamespace(Namespace.getNamespace("p", "http://parent.com"));
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);

        assertEquals("http://www.w3.org/XML/1998/namespace", ptr.getNamespaceURI("xml"));
        assertEquals("http://parent.com", ptr.getNamespaceURI("p"));
        assertNull(ptr.getNamespaceURI("nonexistent"));

        Document doc = new Document(root);
        JDOMNodePointer ptrDoc = new JDOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("http://parent.com", ptrDoc.getNamespaceURI("p"));

        JDOMNodePointer ptrNullElem = new JDOMNodePointer(new Text("no element"), Locale.ENGLISH);
        assertNull(ptrNullElem.getNamespaceURI("p"));
    }

    public void testCompareChildNodePointers() {
        Element root = new Element("root");
        Attribute attr1 = new Attribute("a1", "v1");
        Attribute attr2 = new Attribute("a2", "v2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);

        Element child1 = new Element("c1");
        Element child2 = new Element("c2");
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer attr1Ptr = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer attr2Ptr = new JDOMNodePointer(rootPtr, attr2);
        JDOMNodePointer child1Ptr = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer child2Ptr = new JDOMNodePointer(rootPtr, child2);

        // Same node
        assertEquals(0, rootPtr.compareChildNodePointers(attr1Ptr, attr1Ptr));

        // Attribute vs non-attribute
        assertEquals(-1, rootPtr.compareChildNodePointers(attr1Ptr, child1Ptr));
        assertEquals(1, rootPtr.compareChildNodePointers(child1Ptr, attr1Ptr));

        // Attribute vs Attribute
        assertEquals(-1, rootPtr.compareChildNodePointers(attr1Ptr, attr2Ptr));
        assertEquals(1, rootPtr.compareChildNodePointers(attr2Ptr, attr1Ptr));

        // Element vs Element
        assertEquals(-1, rootPtr.compareChildNodePointers(child1Ptr, child2Ptr));
        assertEquals(1, rootPtr.compareChildNodePointers(child2Ptr, child1Ptr));

        // Exception case: base node is not an Element
        JDOMNodePointer nonElemPtr = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        try {
            nonElemPtr.compareChildNodePointers(child1Ptr, child2Ptr);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("JXPath internal error"));
        }
    }

    public void testGetValueAndSetValue() {
        // Element value
        Element parent = new Element("parent");
        parent.addContent(new Text("Hello "));
        parent.addContent(new Element("sub").addContent(new Text("World")));
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        assertEquals("Hello World", parentPtr.getValue());

        // Comment value
        Comment comment = new Comment("   some comment   ");
        JDOMNodePointer commentPtr = new JDOMNodePointer(comment, Locale.ENGLISH);
        assertEquals("some comment", commentPtr.getValue());

        // Comment null text
        Comment nullComment = new Comment("");
        // Simulate null text via subclass/mock if possible, or test directly
        JDOMNodePointer nullCommentPtr = new JDOMNodePointer(nullComment, Locale.ENGLISH);
        
        // Text value with xml:space preserve
        Element spaceElem = new Element("spaceElem");
        spaceElem.setAttribute("space", "preserve", Namespace.XML_NAMESPACE);
        Text spacedText = new Text("  preserved  ");
        spaceElem.addContent(spacedText);
        JDOMNodePointer textPtr = new JDOMNodePointer(spacedText, Locale.ENGLISH);
        assertEquals("  preserved  ", textPtr.getValue());

        // Processing instruction value
        ProcessingInstruction pi = new ProcessingInstruction("target", "data-value");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("data-value", piPtr.getValue());

        // Set value on Text
        Text mutableText = new Text("old");
        spaceElem.addContent(mutableText);
        JDOMNodePointer mutableTextPtr = new JDOMNodePointer(mutableText, Locale.ENGLISH);
        mutableTextPtr.setValue("newVal");
        assertEquals("newVal", mutableText.getText());

        // Set value on Text to empty (removes content)
        mutableTextPtr.setValue("");
        assertFalse(spaceElem.getContent().contains(mutableText));

        // Set value on Element with various types
        Element targetElem = new Element("targetElem");
        JDOMNodePointer targetElemPtr = new JDOMNodePointer(targetElem, Locale.ENGLISH);

        targetElemPtr.setValue(new Element("newElem").addContent(new Text("inner")));
        assertEquals(1, targetElem.getContent().size());

        targetElemPtr.setValue(new Document(new Element("docElem")));
        targetElemPtr.setValue(new CDATA("cdata-text"));
        targetElemPtr.setValue(new ProcessingInstruction("pi", "val"));
        targetElemPtr.setValue(new Comment("cmt"));
        targetElemPtr.setValue("string-value");
        assertEquals("string-value", targetElem.getValue());
    }

    public void testTestNode() {
        Element elem = new Element("elem", Namespace.getNamespace("ns", "http://example.com"));
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Null test
        assertTrue(JDOMNodePointer.testNode(ptr, elem, null));

        // NodeNameTest - Wildcard
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        assertTrue(JDOMNodePointer.testNode(ptr, elem, wildcardTest));

        // NodeNameTest - Matching name and namespace
        NodeNameTest exactTest = new NodeNameTest(new QName("ns", "elem"), "http://example.com");
        assertTrue(JDOMNodePointer.testNode(ptr, elem, exactTest));

        // NodeNameTest - Non-element node
        assertFalse(JDOMNodePointer.testNode(ptr, new Text("t"), exactTest));

        // NodeNameTest - Mismatch name
        NodeNameTest mismatchTest = new NodeNameTest(new QName("ns", "wrong"), "http://example.com");
        assertFalse(JDOMNodePointer.testNode(ptr, elem, mismatchTest));

        // NodeTypeTest
        assertTrue(JDOMNodePointer.testNode(ptr, elem, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertTrue(JDOMNodePointer.testNode(ptr, new Text("t"), new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(JDOMNodePointer.testNode(ptr, new CDATA("c"), new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(JDOMNodePointer.testNode(ptr, new Comment("c"), new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertTrue(JDOMNodePointer.testNode(ptr, new ProcessingInstruction("p", "d"), new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        assertFalse(JDOMNodePointer.testNode(ptr, elem, new NodeTypeTest(999))); // Default case

        // ProcessingInstructionTest
        ProcessingInstruction pi = new ProcessingInstruction("target1", "data");
        ProcessingInstructionTest piTest = new ProcessingInstructionTest("target1");
        assertTrue(JDOMNodePointer.testNode(ptr, pi, piTest));
        
        ProcessingInstructionTest piTestMismatch = new ProcessingInstructionTest("target2");
        assertFalse(JDOMNodePointer.testNode(ptr, pi, piTestMismatch));

        // Unsupported NodeTest type
        assertFalse(JDOMNodePointer.testNode(ptr, elem, new NodeTest() {
            @Override
            public int getNodeType() { return 0; }
        }));
    }

    public void testIsLanguage() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(new JDOMNodePointer(parent, Locale.ENGLISH), child);
        assertTrue(childPtr.isLanguage("en"));
        assertTrue(childPtr.isLanguage("EN-us"));
        assertFalse(childPtr.isLanguage("fr"));
    }

    public void testCreateAttribute() {
        Element elem = new Element("elem");
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Plain attribute creation
        NodePointer attrPtr = ptr.createAttribute(context, new QName("myattr"));
        assertNotNull(attrPtr);
        assertNotNull(elem.getAttribute("myattr"));

        // Namespaced attribute with unknown prefix should throw exception
        try {
            ptr.createAttribute(context, new QName("badprefix", "myattr"));
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Unknown namespace prefix"));
        }

        // Non-element node attribute creation fallback
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("abc"), Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
        } catch (Exception e) {
            // Expected UnsupportedOperationException from super
        }
    }

    public void testRemove() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer childPtr = new JDOMNodePointer(new JDOMNodePointer(parent, Locale.ENGLISH), child);
        childPtr.remove();
        assertFalse(parent.getContent().contains(child));

        // Removing root should throw exception
        JDOMNodePointer rootPtr = new JDOMNodePointer(parent, Locale.ENGLISH);
        try {
            rootPtr.remove();
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Cannot remove root JDOM node"));
        }
    }

    public void testAsPathVariations() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        Text text = new Text("textNode");
        child.addContent(text);
        ProcessingInstruction pi = new ProcessingInstruction("piTarget", "piData");
        child.addContent(pi);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        JDOMNodePointer textPtr = new JDOMNodePointer(childPtr, text);
        JDOMNodePointer piPtr = new JDOMNodePointer(childPtr, pi);

        assertEquals("/child[1]", childPtr.asPath());
        assertEquals("/child[1]/text()[1]", textPtr.asPath());
        assertEquals("/child[1]/processing-instruction('piTarget')[1]", piPtr.asPath());
    }

    public void testEqualsAndHashCode() {
        Element elem1 = new Element("elem");
        Element elem2 = new Element("elem");

        JDOMNodePointer ptr1 = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr1Duplicate = ptr1;
        JDOMNodePointer ptr2 = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr3 = new JDOMNodePointer(elem2, Locale.ENGLISH);

        assertTrue(ptr1.equals(ptr1Duplicate));
        assertTrue(ptr1.equals(ptr2));
        assertFalse(ptr1.equals(ptr3));
        assertFalse(ptr1.equals("not a pointer"));

        assertEquals(elem1.hashCode(), ptr1.hashCode());
    }
}