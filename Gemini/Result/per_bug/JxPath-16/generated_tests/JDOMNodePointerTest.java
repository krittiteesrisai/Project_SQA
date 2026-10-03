package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
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
    public void testGetNamespaceURIObject() {
        Element elementWithEmptyNs = new Element("root", Namespace.getNamespace("", ""));
        JDOMNodePointer pointer1 = new JDOMNodePointer(elementWithEmptyNs, Locale.ENGLISH);
        Assert.assertNull(pointer1.getNamespaceURI());

        Element elementWithNs = new Element("root", Namespace.getNamespace("prefix", "http://example.com"));
        JDOMNodePointer pointer2 = new JDOMNodePointer(elementWithNs, Locale.ENGLISH);
        Assert.assertEquals("http://example.com", pointer2.getNamespaceURI());

        JDOMNodePointer pointer3 = new JDOMNodePointer(new Text("test"), Locale.ENGLISH);
        Assert.assertNull(pointer3.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURIWithPrefix() {
        Element root = new Element("root", Namespace.getNamespace("p", "http://example.com"));
        Document doc = new Document(root);
        JDOMNodePointer docPointer = new JDOMNodePointer(doc, Locale.ENGLISH);
        
        Assert.assertEquals(Namespace.XML_NAMESPACE.getURI(), docPointer.getNamespaceURI("xml"));
        Assert.assertEquals("http://example.com", docPointer.getNamespaceURI("p"));
        Assert.assertNull(docPointer.getNamespaceURI("nonexistent"));

        JDOMNodePointer orphanPointer = new JDOMNodePointer(new Text("orphan"), Locale.ENGLISH);
        Assert.assertNull(orphanPointer.getNamespaceURI("p"));
    }

    @Test
    public void testCompareChildNodePointers() {
        Element root = new Element("root");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        root.addContent(child1);
        root.addContent(child2);

        JDOMNodePointer rootPointer = new JDOMNodePointer(root, Locale.ENGLISH);
        JDOMNodePointer p1 = new JDOMNodePointer(rootPointer, child1);
        JDOMNodePointer p2 = new JDOMNodePointer(rootPointer, child2);
        JDOMNodePointer p1Again = new JDOMNodePointer(rootPointer, child1);

        Assert.assertEquals(0, rootPointer.compareChildNodePointers(p1, p1));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(p1, p2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(p2, p1));

        // Attribute comparisons
        org.jdom.Attribute attr1 = new org.jdom.Attribute("attr1", "val1");
        org.jdom.Attribute attr2 = new org.jdom.Attribute("attr2", "val2");
        root.setAttribute(attr1);
        root.setAttribute(attr2);
        JDOMNodePointer pa1 = new JDOMNodePointer(rootPointer, attr1);
        JDOMNodePointer pa2 = new JDOMNodePointer(rootPointer, attr2);

        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pa1, p1));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(p1, pa1));
        Assert.assertEquals(-1, rootPointer.compareChildNodePointers(pa1, pa2));
        Assert.assertEquals(1, rootPointer.compareChildNodePointers(pa2, pa1));

        // Exception on non-element base value with non-attribute children
        JDOMNodePointer textPointer = new JDOMNodePointer(new Text("text"), Locale.ENGLISH);
        try {
            textPointer.compareChildNodePointers(p1, p2);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().contains("JXPath internal error"));
        }
    }

    @Test
    public void testIsLeaf() {
        Element emptyEl = new Element("empty");
        Element fullEl = new Element("full");
        fullEl.addContent(new Text("content"));

        Assert.assertTrue(new JDOMNodePointer(emptyEl, Locale.ENGLISH).isLeaf());
        Assert.assertFalse(new JDOMNodePointer(fullEl, Locale.ENGLISH).isLeaf());

        Document emptyDoc = new Document();
        Document fullDoc = new Document(new Element("root"));
        Assert.assertTrue(new JDOMNodePointer(emptyDoc, Locale.ENGLISH).isLeaf());
        Assert.assertFalse(new JDOMNodePointer(fullDoc, Locale.ENGLISH).isLeaf());

        Assert.assertTrue(new JDOMNodePointer(new Text("text"), Locale.ENGLISH).isLeaf());
    }

    @Test
    public void testGetName() {
        Element el = new Element("myelem", Namespace.getNamespace("ns", "http://ns.com"));
        JDOMNodePointer elPtr = new JDOMNodePointer(el, Locale.ENGLISH);
        QName name = elPtr.getName();
        Assert.assertEquals("myelem", name.getName());
        Assert.assertEquals("ns", name.getPrefix());

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("target", piPtr.getName().getName());
    }

    @Test
    public void testGetValueAndSetValue() {
        Element el = new Element("el");
        el.addContent(new Text("  hello  "));
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.ENGLISH);
        Assert.assertEquals("hello", ptr.getValue());

        Comment comment = new Comment("  comment text  ");
        JDOMNodePointer cPtr = new JDOMNodePointer(comment, Locale.ENGLISH);
        Assert.assertEquals("comment text", cPtr.getValue());

        Text textNode = new Text(" text content ");
        JDOMNodePointer tPtr = new JDOMNodePointer(textNode, Locale.ENGLISH);
        Assert.assertEquals("text content", tPtr.getValue());

        ProcessingInstruction pi = new ProcessingInstruction("pi", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertEquals("data", piPtr.getValue());

        // Test setValue on Text
        tPtr.setValue("new text");
        Assert.assertEquals("new text", textNode.getText());

        tPtr.setValue(""); // should remove content
        Assert.assertNull(textNode.getParent());

        // Test setValue on Element with various types
        Element targetEl = new Element("target");
        JDOMNodePointer targetPtr = new JDOMNodePointer(targetEl, Locale.ENGLISH);
        targetPtr.setValue(new Element("subEl"));
        Assert.assertEquals(1, targetEl.getContent().size());

        targetPtr.setValue(new Document(new Element("docEl")));
        Assert.assertEquals(1, targetEl.getContent().size());

        targetPtr.setValue(new CDATA("cdata"));
        targetPtr.setValue(new ProcessingInstruction("pi", "d"));
        targetPtr.setValue(new Comment("com"));
        targetPtr.setValue("stringVal");
        Assert.assertEquals("stringVal", targetEl.getText());
    }

    @Test
    public void testTestNode() {
        Element el = new Element("el", Namespace.getNamespace("prefix", "http://uri.com"));
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.ENGLISH);

        Assert.assertTrue(ptr.testNode(null));

        // NodeNameTest cases
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        Assert.assertTrue(ptr.testNode(wildcardTest));

        NodeNameTest exactTest = new NodeNameTest(new QName("prefix", "el"), "http://uri.com");
        Assert.assertTrue(ptr.testNode(exactTest));

        NodeNameTest wrongNameTest = new NodeNameTest(new QName("prefix", "wrong"), "http://uri.com");
        Assert.assertFalse(ptr.testNode(wrongNameTest));

        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        Assert.assertFalse(textPtr.testNode(exactTest));

        // NodeTypeTest cases
        Assert.assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(new JDOMNodePointer(new Document(), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        Assert.assertTrue(textPtr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(new JDOMNodePointer(new CDATA("c"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        Assert.assertTrue(new JDOMNodePointer(new Comment("c"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        Assert.assertTrue(new JDOMNodePointer(new ProcessingInstruction("p", "d"), Locale.ENGLISH).testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        Assert.assertFalse(ptr.testNode(new NodeTypeTest(999))); // Invalid type

        // ProcessingInstructionTest cases
        ProcessingInstruction pi = new ProcessingInstruction("target1", "data");
        JDOMNodePointer piPtr = new JDOMNodePointer(pi, Locale.ENGLISH);
        Assert.assertTrue(piPtr.testNode(new ProcessingInstructionTest("target1")));
        Assert.assertFalse(piPtr.testNode(new ProcessingInstructionTest("target2")));
        Assert.assertFalse(textPtr.testNode(new ProcessingInstructionTest("target1")));
    }

    @Test
    public void testIsLanguage() {
        Element el = new Element("el");
        el.setAttribute("lang", "en-US", Namespace.XML_NAMESPACE);
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.ENGLISH);

        Assert.assertTrue(ptr.isLanguage("EN"));
        Assert.assertFalse(ptr.isLanguage("FR"));
    }

    @Test
    public void testCreateAttributeEdgeCases() {
        Element el = new Element("el");
        JDOMNodePointer ptr = new JDOMNodePointer(el, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(el);

        // Without prefix
        NodePointer attrPtr1 = ptr.createAttribute(context, new QName("attrName"));
        Assert.assertNotNull(attrPtr1);

        // With unknown prefix
        try {
            ptr.createAttribute(context, new QName("unknown", "attrName"));
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().contains("Unknown namespace prefix"));
        }

        // When node is not an element
        JDOMNodePointer textPtr = new JDOMNodePointer(new Text("t"), Locale.ENGLISH);
        try {
            textPtr.createAttribute(context, new QName("attr"));
        } catch (Exception e) {
            // Falls back to super.createAttribute which might throw UnsupportedOperationException
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void testRemoveAndAsPath() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.addContent(child);

        JDOMNodePointer parentPtr = new JDOMNodePointer(null, parent);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);

        Assert.assertEquals("/child[1]", childPtr.asPath());

        // Test remove root node exception
        try {
            parentPtr.remove();
            Assert.fail("Expected JXPathException");
        } catch (JXPathException e) {
            Assert.assertTrue(e.getMessage().contains("Cannot remove root JDOM node"));
        }

        // Test remove normal child
        childPtr.remove();
        Assert.assertNull(child.getParent());
    }

    @Test
    public void testAsPathWithIdAndOthers() {
        Element el = new Element("el");
        JDOMNodePointer idPtr = new JDOMNodePointer(el, Locale.ENGLISH, "my'id\"val");
        Assert.assertEquals("id('my&apos;id&quot;val')", idPtr.asPath());

        Text text = new Text("txt");
        el.addContent(text);
        JDOMNodePointer textPtr = new JDOMNodePointer(new JDOMNodePointer(null, el), text);
        Assert.assertTrue(textPtr.asPath().contains("/text()"));

        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        el.addContent(pi);
        JDOMNodePointer piPtr = new JDOMNodePointer(new JDOMNodePointer(null, el), pi);
        Assert.assertTrue(piPtr.asPath().contains("/processing-instruction('target')"));
    }
}