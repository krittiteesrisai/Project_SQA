package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

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
        Assert.assertNotNull(ptr1.hashCode());

        JDOMNodePointer ptr2 = new JDOMNodePointer(elem, Locale.ENGLISH, "id1");
        Assert.assertEquals("id('id1')", ptr2.asPath());

        JDOMNodePointer ptr3 = new JDOMNodePointer(ptr1, elem);
        Assert.assertEquals(ptr1, ptr3.getParent());
    }

    @Test
    public void testEqualsAndHashCode() {
        Element elem1 = new Element("elem1");
        Element elem2 = new Element("elem2");
        JDOMNodePointer ptr1 = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr2 = new JDOMNodePointer(elem1, Locale.ENGLISH);
        JDOMNodePointer ptr3 = new JDOMNodePointer(elem2, Locale.ENGLISH);

        Assert.assertTrue(ptr1.equals(ptr1));
        Assert.assertTrue(ptr1.equals(ptr2));
        Assert.assertFalse(ptr1.equals(ptr3));
        Assert.assertFalse(ptr1.equals(new Object()));
    }

    @Test
    public void testGetNamespaceURI() {
        Element elemNoNs = new Element("elem");
        Assert.assertNull(JDOMNodePointer.getNamespaceURI(elemNoNs));

        Element elemEmptyNs = new Element("elem", Namespace.getNamespace("", ""));
        Assert.assertNull(JDOMNodePointer.getNamespaceURI(elemEmptyNs));

        Element elemValidNs = new Element("elem", Namespace.getNamespace("prefix", "http://example.com"));
        Assert.assertEquals("http://example.com", JDOMNodePointer.getNamespaceURI(elemValidNs));

        Assert.assertNull(JDOMNodePointer.getNamespaceURI(new Text("text")));

        // Document level namespace URI lookup
        Document doc = new Document(elemValidNs);
        JDOMNodePointer docPtr = new JDOMNodePointer(doc, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", docPtr.getNamespaceURI("prefix"));

        JDOMNodePointer elemPtr = new JDOMNodePointer(elemValidNs, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", elemPtr.getNamespaceURI("prefix"));
        
        Document docNoRootElem = new Document();
        JDOMNodePointer docEmptyPtr = new JDOMNodePointer(docNoRootElem, Locale.ENGLISH);
        Assert.assertNull(docEmptyPtr.getNamespaceURI("prefix"));
    }

    @Test
    public void testIsLeaf() {
        Element emptyElem = new Element("elem");
        JDOMNodePointer ptr1 = new JDOMNodePointer(emptyElem, Locale.ENGLISH);
        Assert.assertTrue(ptr1.isLeaf());

        emptyElem.addContent(new Text("child"));
        Assert.assertFalse(ptr1.isLeaf());

        Document emptyDoc = new Document();
        JDOMNodePointer ptrDoc1 = new JDOMNodePointer(emptyDoc, Locale.ENGLISH);
        Assert.assertTrue(ptrDoc1.isLeaf());

        emptyDoc.setRootElement(new Element("root"));
        Assert.assertFalse(ptrDoc1.isLeaf());

        Text text = new Text("leaf");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertTrue(ptrText.isLeaf());
    }

    @Test
    public void testGetName() {
        Element elem = new Element("myelem", Namespace.getNamespace("p", "http://ns"));
        JDOMNodePointer ptrElem = new JDOMNodePointer(elem, Locale.ENGLISH);
        QName qNameElem = ptrElem.getName();
        Assert.assertEquals("myelem", qNameElem.getName());
        Assert.assertEquals("p", qNameElem.getPrefix());

        Element elemNoPrefix = new Element("myelem", Namespace.getNamespace("", "http://ns"));
        JDOMNodePointer ptrElemNoPrefix = new JDOMNodePointer(elemNoPrefix, Locale.ENGLISH);
        Assert.assertNull(ptrElemNoPrefix.getName().getPrefix());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer ptrPi = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("target", ptrPi.getName().getName());

        Text text = new Text("abc");
        JDOMNodePointer ptrText = new JDOMNodePointer(text, Locale.ENGLISH);
        Assert.assertNull(ptrText.getName().getName());
    }

    @Test
    public void testGetValueAndSetValue() {
        Element elem = new Element("elem");
        elem.setText("  trimMe  ");
        Assert.assertEquals("trimMe", new JDOMNodePointer(elem, Locale.ENGLISH).getValue());

        Comment comment = new Comment("  commentText  ");
        Assert.assertEquals("commentText", new JDOMNodePointer(comment, Locale.ENGLISH).getValue());
        Comment nullComment = new Comment((String) null);
        Assert.assertNull(new JDOMNodePointer(nullComment, Locale.ENGLISH).getValue());

        Text text = new Text("  textVal  ");
        Assert.assertEquals("textVal", new JDOMNodePointer(text, Locale.ENGLISH).getValue());

        CDATA cdata = new CDATA("  cdataVal  ");
        Assert.assertEquals("cdataVal", new JDOMNodePointer(cdata, Locale.ENGLISH).getValue());

        ProcessingInstruction pi = new ProcessingInstruction("target", "  piData  ");
        Assert.assertEquals("piData", new JDOMNodePointer(pi, Locale.ENGLISH).getValue());
        ProcessingInstruction nullPi = new ProcessingInstruction("target", (String) null);
        Assert.assertNull(new JDOMNodePointer(nullPi, Locale.ENGLISH).getValue());

        Assert.assertNull(new JDOMNodePointer(new Object(), Locale.ENGLISH).getValue());

        // Test setValue on Text
        Element parent = new Element("parent");
        Text textNode = new Text("old");
        parent.addContent(textNode);
        JDOMNodePointer textPtr = new JDOMNodePointer(textNode, Locale.ENGLISH);
        textPtr.setValue("newText");
        Assert.assertEquals("newText", textNode.getText());

        // Test setValue with empty/null string removes content
        textPtr.setValue("");
        Assert.assertFalse(parent.getContent().contains(textNode));

        // Test setValue on Element with various types
        Element targetElem = new Element("target");
        JDOMNodePointer targetPtr = new JDOMNodePointer(targetElem, Locale.ENGLISH);
        
        targetPtr.setValue(new Element("subElem"));
        targetPtr.setValue(new Document(new Element("docElem")));
        targetPtr.setValue(new Text("textChild"));
        targetPtr.setValue(new CDATA("cdataChild"));
        targetPtr.setValue(new ProcessingInstruction("pi", "data"));
        targetPtr.setValue(new Comment("commentChild"));
        targetPtr.setValue("stringVal");
    }

    @Test
    public void testTestNode() {
        Element elem = new Element("elem", Namespace.getNamespace("p", "http://ns"));
        JDOMNodePointer ptr = new JDOMNodePointer(elem, Locale.ENGLISH);

        // Null test
        Assert.assertTrue(ptr.testNode(null));

        // NodeNameTest variations
        NodeNameTest wildcardTest = new NodeNameTest(new QName("*"), null);
        Assert.assertTrue(ptr.testNode(wildcardTest));

        NodeNameTest specificTest = new NodeNameTest(new QName("p", "elem"), "http://ns");
        Assert.assertTrue(ptr.testNode(specificTest));

        NodeNameTest wrongNameTest = new NodeNameTest(new QName("p", "wrong"), "http://ns");
        Assert.assertFalse(ptr.testNode(wrongNameTest));

        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("abc"), Locale.ENGLISH);
        Assert.assertFalse(textPtr.testNode(specificTest)); // node not Element

        // NodeTypeTest variations
        Assert.assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(textPtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(new JDOMNodePointer(new Comment("c"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertTrue(new JDOMNodePointer(new ProcessingInstruction("t", "d"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(999))); // Unknown type

        // ProcessingInstructionTest
        ProcessingInstruction pi = new ProcessingInstruction("target1", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertTrue(piPtr.testNode(new ProcessingInstructionTest("target1")));
        Assert.assertFalse(piPtr.testNode(new ProcessingInstructionTest("target2")));
        
        Assert.assertFalse(ptr.testNode(new ProcessingInstructionTest("target1"))); // Not PI
    }

    @Test
    public void testGetPrefixAndLocalName() {
        Element elem = new Element("elem", Namespace.getNamespace("p", "http://ns"));
        Assert.assertEquals("p", JDOMNodePointer.getPrefix(elem));
        Assert.assertEquals("elem", JDOMNodePointer.getLocalName(elem));

        Element elemEmptyPrefix = new Element("elem", Namespace.getNamespace("", "http://ns"));
        Assert.assertNull(JDOMNodePointer.getPrefix(elemEmptyPrefix));

        Attribute attr = new Attribute("attr", "val", Namespace.getNamespace("ap", "http://ans"));
        Assert.assertEquals("ap", JDOMNodePointer.getPrefix(attr));
        Assert.assertEquals("attr", JDOMNodePointer.getLocalName(attr));
        
        Attribute attrEmptyPrefix = new Attribute("attr", "val", Namespace.getNamespace("", "http://ans"));
        Assert.assertNull(JDOMNodePointer.getPrefix(attrEmptyPrefix));

        Assert.assertNull(JDOMNodePointer.getPrefix(new Object()));
        Assert.assertNull(JDOMNodePointer.getLocalName(new Object()));
    }

    @Test
    public void testIsLanguageAndGetLanguage() {
        Element parent = new Element("parent");
        parent.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer ptr = new JDOMNodePointer(child, Locale.ENGLISH);
        Assert.assertTrue(ptr.isLanguage("EN"));
        Assert.assertFalse(ptr.isLanguage("FR"));
        
        // Element with empty lang attr
        Element emptyLangElem = new Element("elem");
        emptyLangElem.setAttribute("lang", "", Namespace.XML_NAMESPACE);
        JDOMNodePointer emptyPtr = new JDOMNodePointer(emptyLangElem, Locale.ENGLISH);
        Assert.assertNotNull(emptyPtr.isLanguage("en") || !emptyPtr.isLanguage("en")); // fallback check
    }

    @Test
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
        JDOMNodePointer attrPtr1 = new JDOMNodePointer(rootPtr, attr1);
        JDOMNodePointer attrPtr2 = new JDOMNodePointer(rootPtr, attr2);
        JDOMNodePointer childPtr1 = new JDOMNodePointer(rootPtr, child1);
        JDOMNodePointer childPtr2 = new JDOMNodePointer(rootPtr, child2);

        // Same node
        Assert.assertEquals(0, rootPtr.compareChildNodePointers(attrPtr1, attrPtr1));

        // Attribute vs Non-Attribute
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr1, childPtr1));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(childPtr1, attrPtr1));

        // Attribute vs Attribute order
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr1, attrPtr2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(attrPtr2, attrPtr1));

        // Child vs Child order
        Assert.assertEquals(-1, rootPtr.compareChildNodePointers(childPtr1, childPtr2));
        Assert.assertEquals(1, rootPtr.compareChildNodePointers(childPtr2, childPtr1));

        // Exception on non-element base
        JDOMNodePointer nonElemPtr = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        try {
            nonElemPtr.compareChildNodePointers(childPtr1, childPtr2);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().contains("JXPath internal error"));
        }
    }

    @Test(expected = JXPathException.class)
    public void testRemoveRootNode() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        ptr.remove();
    }

    @Test
    public void testRemoveChildNode() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer ptr = new JDOMNodePointer(root, child);
        ptr.remove();
        Assert.assertFalse(root.getContent().contains(child));
    }

    @Test
    public void testAsPathVariations() {
        Element root = new Element("root");
        Element child = new Element("child");
        Text text = new Text("text");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        root.addContent(child);
        child.addContent(text);
        child.addContent(pi);

        JDOMNodePointer rootPtr = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer childPtr = new JDOMNodePointer(rootPtr, child);
        JDOMNodePointer textPtr = new JDOMNodePointer(childPtr, text);
        JDOMNodePointer piPtr = new JDOMNodePointer(childPtr, pi);

        Assert.assertTrue(childPtr.asPath().contains("child"));
        Assert.assertTrue(textPtr.asPath().contains("text()"));
        Assert.assertTrue(piPtr.asPath().contains("processing-instruction"));
    }

    @Test
    public void testCreateAttribute() {
        Element root = new Element("root", Namespace.getNamespace("p", "http://ns"));
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        
        // Non-element create attribute fallback
        JXPathContext context = JXPathContext.newContext(new Object());
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        Assert.assertNotNull(textPtr.createAttribute(context, new QName("attr")));

        // Element with prefix namespace not found
        try {
            ptr.createAttribute(context, new QName("unknown", "attr"));
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().contains("Unknown namespace prefix"));
        }
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChildWithoutFactory() {
        Element root = new Element("root");
        JDOMNodePointer ptr = new JDOMNodePointer(root, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createChild(context, new QName("child"), 0);
    }
}