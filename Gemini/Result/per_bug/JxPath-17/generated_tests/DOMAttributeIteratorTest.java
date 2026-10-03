package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMAttributeIteratorTest {

    private Document document;
    private Element element;
    private NodePointer rootPointer;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        document = dbf.newDocumentBuilder().newDocument();
        
        element = document.createElementNS("http://example.com/ns", "prefix:element");
        element.setAttribute("id", "123");
        element.setAttribute("name", "testName");
        element.setAttributeNS("http://example.com/ns", "prefix:attrNS", "nsValue");
        element.setAttribute("xmlns:prefix", "http://example.com/ns"); // xmlns should be filtered out
        element.setAttribute("xmlns", "http://default/ns"); // xmlns should be filtered out
        
        document.appendChild(element);
        rootPointer = new DOMNodePointer(element, Locale.getDefault());
    }

    @Test
    public void testNonElementNode() {
        // Trigger non-ELEMENT_NODE branch (e.g., Text node)
        org.w3c.dom.Text textNode = document.createTextNode("Some text");
        NodePointer textPointer = new DOMNodePointer(textNode, Locale.getDefault());
        DOMAttributeIterator iterator = new DOMAttributeIterator(textPointer, new QName("id"));
        
        Assert.assertFalse(iterator.setPosition(1));
        Assert.assertNull(iterator.getNodePointer());
        Assert.assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSpecificAttributeWithoutPrefix() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, new QName("id"));
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertEquals(1, iterator.getPosition());
        NodePointer attrPointer = iterator.getNodePointer();
        Assert.assertNotNull(attrPointer);
        Assert.assertEquals("id", attrPointer.getName().getName());
        
        // Test position out of bound
        Assert.assertFalse(iterator.setPosition(2));
        Assert.assertFalse(iterator.setPosition(0));
    }

    @Test
    public void testWildcardAttributes() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, new QName("*"));
        // Should find "id", "name", "prefix:attrNS" (xmlns attributes are filtered out)
        int count = 0;
        while (iterator.setPosition(count + 1)) {
            count++;
            Assert.assertNotNull(iterator.getNodePointer());
        }
        Assert.assertEquals(3, count);
    }

    @Test
    public void testAttributeWithNamespaceAndPrefix() {
        QName qName = new QName("prefix", "attrNS");
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, qName);
        
        Assert.assertTrue(iterator.setPosition(1));
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals("attrNS", ptr.getName().getName());
    }

    @Test
    public void testAttributeWithNamespaceURIFallback() {
        // Querying an attribute where testNS is resolved, triggering the fallback loop over NamedNodeMap
        QName qName = new QName("prefix", "attrNS");
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, qName);
        
        // Force evaluation via getAttribute with namespace mapping present
        Assert.assertTrue(iterator.setPosition(1));
        Assert.assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testAttributeNotFound() {
        QName qName = new QName("nonexistent");
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, qName);
        
        Assert.assertFalse(iterator.setPosition(1));
    }

    @Test
    public void testGetNodePointerWithPositionZero() {
        DOMAttributeIterator iterator = new DOMAttributeIterator(rootPointer, new QName("id"));
        // position is initially 0, calling getNodePointer() should temporarily set position to 1 and return it, resetting position back to 0
        NodePointer ptr = iterator.getNodePointer();
        Assert.assertNotNull(ptr);
        Assert.assertEquals(0, iterator.getPosition());
    }
}