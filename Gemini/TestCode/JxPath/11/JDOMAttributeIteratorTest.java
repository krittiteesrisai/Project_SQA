package org.apache.commons.jxpath.ri.model.jdom;

import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDOMAttributeIteratorTest {

    @Test
    public void testNonElementParent() {
        // Test parent.getNode() not instance of Element
        Element element = new Element("root");
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element.setText("text"), null);
        // Using a non-element node pointer or mock-like setup via JDOM element text child
        org.jdom.Text textNode = new org.jdom.Text("some text");
        NodePointer textParent = NodePointer.newNodePointer(new QName("text"), textNode, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(textParent, new QName("attr"));
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testPrefixXml() {
        Element element = new Element("root");
        element.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("xml", "lang"));
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testPrefixNotFoundReturnsEmptyList() {
        // This targets the bug/patch area in JxPath-11 where ns == null returns EMPTY_LIST
        Element element = new Element("root");
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("unknownPrefix", "attr"));
        assertFalse(iterator.setPosition(1));
        assertNull(iterator.getNodePointer());
    }

    @Test
    public void testPrefixCustomValid() {
        Namespace customNs = Namespace.getNamespace("custom", "http://example.com");
        Element element = new Element("root", customNs);
        element.setAttribute("test", "value", customNs);
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("custom", "test"));
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
    }

    @Test
    public void testNoPrefixSpecificAttribute() {
        Element element = new Element("root");
        element.setAttribute(new Attribute("name", "value"));
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("name"));
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        assertEquals(1, iterator.getPosition());
    }

    @Test
    public void testWildcardAttributeName() {
        Element element = new Element("root");
        element.setAttribute(new Attribute("attr1", "val1"));
        element.setAttribute(new Attribute("attr2", "val2"));
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("*"));
        assertTrue(iterator.setPosition(1));
        assertNotNull(iterator.getNodePointer());
        
        // Test navigation through wildcard attributes
        assertTrue(iterator.setPosition(2));
        assertNotNull(iterator.getNodePointer());
        
        assertFalse(iterator.setPosition(3));
    }

    @Test
    public void testGetNodePointerAutoSetPosition() {
        Element element = new Element("root");
        element.setAttribute(new Attribute("attr1", "val1"));
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        // position is 0, calling getNodePointer() should trigger setPosition(1) and reset position to 0
        NodePointer ptr = iterator.getNodePointer();
        assertNotNull(ptr);
        assertEquals(0, iterator.getPosition());
    }

    @Test
    public void testSetPositionInvalidBounds() {
        Element element = new Element("root");
        element.setAttribute(new Attribute("attr1", "val1"));
        NodePointer parent = NodePointer.newNodePointer(new QName("root"), element, null);
        
        JDOMAttributeIterator iterator = new JDOMAttributeIterator(parent, new QName("attr1"));
        assertFalse(iterator.setPosition(0));
        assertFalse(iterator.setPosition(2));
    }
}