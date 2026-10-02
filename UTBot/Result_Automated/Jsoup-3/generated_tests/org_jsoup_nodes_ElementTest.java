package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.jsoup.select.Elements;
import java.util.List;
import java.lang.reflect.Method;
import org.apache.commons.lang.NotImplementedException;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.select.Selector.SelectorParseException;
import org.jsoup.select.Selector;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_ElementTest {
    ///region Test suites for executable org.jsoup.nodes.Element.appendElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendElement(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendElement(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendElement(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "A\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        element.appendElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001";
        
        element.appendElement(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nodeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodeName()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.returnsFrom {@code return tag.getName();}
 *  */
    @Test
    public void testNodeName_TagGetName() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        String actual = element.nodeName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nodeName()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tag.getName();
 *  */
    @Test
    public void testNodeName_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.nodeName] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.nodeName(Element.java:55) */
        element.nodeName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.parent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parent()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.returnsFrom {@code return (Element) super.parent();}
 *  */
    @Test
    public void testParent_NodeParent() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Element actual = element.parent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parent()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) super.parent();
 *  */
    @Test
    public void testParent_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parent] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109) */
        element.parent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(element);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Element)): False}
 * @utbot.executesCondition {@code (!super.equals(o)): True}
 * @utbot.invokes {@link org.jsoup.nodes.Node#equals(java.lang.Object)}
 *  */
    @Test
    public void testEquals_NotSuperEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        boolean actual = element.equals(document);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Element)): True}
 *  */
    @Test
    public void testEquals_NotOInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#toString()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#outerHtml()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return outerHtml();
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.outerHtml(Element.java:774)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#toString()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#outerHtml()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return outerHtml();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToString_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        element.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:781)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.html(Attributes.java:112)
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    
    @Test
    public void testToString9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.indexInList(Node.java:304)
            org.jsoup.nodes.Node.siblingIndex(Node.java:295)
            org.jsoup.nodes.Element.outerHtml(Element.java:774)
            org.jsoup.nodes.Node.outerHtml(Node.java:316)
            org.jsoup.nodes.Element.toString(Element.java:822) */
        element.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.append
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element fragment = Parser.parseBodyFragment(html, baseUri).body();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.append(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(java.lang.String)
    
    @Test
    public void testAppend1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.append] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:193)
            org.jsoup.nodes.Element.append(Element.java:273) */
        element.append(string);
    }
    
    @Test
    public void testAppend2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.append] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:193)
            org.jsoup.nodes.Element.append(Element.java:273) */
        element.append(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.executesCondition {@code (tag != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_TagEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.executesCondition {@code (tag != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_TagEqualsNull_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.executesCondition {@code (tag != null): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_TagNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.executesCondition {@code (tag != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_TagEqualsNull_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(parentNode, "org.jsoup.nodes.Node", "attributes", attributes);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(parentNode, "org.jsoup.nodes.Node", "attributes", attributes);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parentNode, "org.jsoup.nodes.Node", "attributes", attributes);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        int actual = element.hashCode();
        
        assertEquals(954305, actual);
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(30752, actual);
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(923521, actual);
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(917087105, actual);
    }
    
    @Test
    public void testHashCode11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parentNode, "org.jsoup.nodes.Node", "attributes", attributes);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(917086144, actual);
    }
    
    @Test
    public void testHashCode12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parentNode, "org.jsoup.nodes.Node", "attributes", attributes);
        element.setParentNode(parentNode);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode13() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(null, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode14() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        
        element.hashCode();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode15() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        
        element.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.className
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method className()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#className()}
 * @utbot.executesCondition {@code (attributes.hasKey("class")): False}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes.hasKey("class") ? attributes.get("class") : "";}
 *  */
    @Test
    public void testClassName_NotAttributesHasKey() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method className()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#className()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.hasKey("class")
 *  */
    @Test
    public void testClassName_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.className] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.className(Element.java:664) */
        element.className();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.wrap
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.wrap(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element wrapBody = Parser.parseBodyFragment(html, baseUri).body();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.wrap(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wrap(java.lang.String)
    
    @Test
    public void testWrap1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000\u0000\u0000\u0000";
        
        Element actual = element.wrap(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testWrap2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000";
        
        Element actual = element.wrap(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName().equals("textarea")
 *  */
    @Test
    public void testVal_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.val(Element.java:766) */
        element.val(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.executesCondition {@code (tagName().equals("textarea")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(value);
 *  */
    @Test
    public void testVal_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:84)
            org.jsoup.nodes.Element.attr(Element.java:103)
            org.jsoup.nodes.Element.val(Element.java:769) */
        element.val(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.executesCondition {@code (tagName().equals("textarea")): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attr("value", value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVal_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        element.val(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val(java.lang.String)
    
    @Test
    public void testVal1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.put(Attributes.java:50)
            org.jsoup.nodes.Attributes.put(Attributes.java:41)
            org.jsoup.nodes.Node.attr(Node.java:84)
            org.jsoup.nodes.Element.attr(Element.java:103)
            org.jsoup.nodes.Element.val(Element.java:769) */
        element.val(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName().equals("textarea")
 *  */
    @Test
    public void testVal_ThrowNullPointerException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.val(Element.java:754) */
        element.val();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val()
    
    @Test
    public void testVal2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "textar\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Element.val(Element.java:757) */
        element.val();
    }
    
    @Test
    public void testVal3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "t\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:68)
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Element.val(Element.java:757) */
        element.val();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testData_ReturnSbToString() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testData_ReturnSbToString_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node childNode: childNodes)
 *  */
    @Test
    public void testData_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.data] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.data(Element.java:645) */
        element.data();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method data()
    
    @Test
    public void testData1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method data()
    
    @Test(expected = StackOverflowError.class)
    public void testData2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.data();
    }
    
    @Test
    public void testData3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(dataNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(dataNode);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) dataNode);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        childNodes.add(objectArray);
        childNodes.add(objectArray);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.data] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Node ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.data(Element.java:645) */
        element.data();
    }
    
    @Test
    public void testData4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes1 = new ArrayList();
        childNodes1.add(null);
        childNodes1.add(null);
        childNodes1.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(document1);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.data] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.data(Element.java:645)
            org.jsoup.nodes.Element.data(Element.java:651) */
        element.data();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.empty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method empty()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#empty()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testEmpty_ListClear() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Element actual = element.empty();
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method empty()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#empty()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.clear();
 *  */
    @Test
    public void testEmpty_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.empty] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.empty(Element.java:302) */
        element.empty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.addClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#addClass(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.addClass(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addClass(java.lang.String)
    
    @Test
    public void testAddClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.addClass(Element.java:711) */
        element.addClass(string);
    }
    
    @Test
    public void testAddClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:68)
            org.jsoup.nodes.Element.className(Element.java:664)
            org.jsoup.nodes.Element.classNames(Element.java:675)
            org.jsoup.nodes.Element.addClass(Element.java:709) */
        element.addClass(string);
    }
    
    @Test
    public void testAddClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.addClass(Element.java:711) */
        element.addClass(string);
    }
    
    @Test
    public void testAddClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        String string = "";
        classNames.add(string);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.addClass(Element.java:711) */
        element.addClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.id
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method id()
    
    @Test
    public void testId1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.parents
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parents()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.returnsFrom {@code return parents;}
 *  */
    @Test
    public void testParents_ReturnParents() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Elements actual = element.parents();
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.returnsFrom {@code return parents;}
 *  */
    @Test
    public void testParents_ReturnParents_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        Elements actual = element.parents();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(parentNode);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parents()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: accumulateParents(this, parents);
 *  */
    @Test
    public void testParents_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.accumulateParents(Element.java:123)
            org.jsoup.nodes.Element.parents(Element.java:118) */
        element.parents();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accumulateParents(this, parents);
 *  */
    @Test
    public void testParents_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:124)
            org.jsoup.nodes.Element.parents(Element.java:118) */
        element.parents();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.attr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        element.attr(((String) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "";
        
        element.attr(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = " ";
        
        element.attr(string, ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "{";
        
        Element actual = element.attr(string, string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "\u0001\u0081\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.put(Attributes.java:50)
            org.jsoup.nodes.Attributes.put(Attributes.java:41)
            org.jsoup.nodes.Node.attr(Node.java:84)
            org.jsoup.nodes.Element.attr(Element.java:103) */
        element.attr(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prepend
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prepend(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prepend(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prepend(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element fragment = Parser.parseBodyFragment(html, baseUri).body();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.prepend(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prepend(java.lang.String)
    
    @Test
    public void testPrepend1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        Element actual = element.prepend(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prepend(java.lang.String)
    
    @Test
    public void testPrepend2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.prepend] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.prependChild(Element.java:207)
            org.jsoup.nodes.Element.prepend(Element.java:292) */
        element.prepend(string);
    }
    
    @Test
    public void testPrepend3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.prepend] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.prependChild(Element.java:207)
            org.jsoup.nodes.Element.prepend(Element.java:292) */
        element.prepend(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method text(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(text);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.text(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#empty()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TextNode textNode = new TextNode(text, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testText_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String string = "";
        
        element.text(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.returnsFrom {@code return sb.toString().trim();}
 *  */
    @Test
    public void testText_ReturnSbToStringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.text();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.returnsFrom {@code return sb.toString().trim();}
 *  */
    @Test
    public void testText_ReturnSbToStringTrim_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.text();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method text()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(sb);
 *  */
    @Test
    public void testText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579)
            org.jsoup.nodes.Element.text(Element.java:574) */
        element.text();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(sb);
 *  */
    @Test
    public void testText_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579)
            org.jsoup.nodes.Element.text(Element.java:595)
            org.jsoup.nodes.Element.text(Element.java:574) */
        element.text();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 *  */
    @Test
    public void testText() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = ((Object) null);
        textMethod.invoke(element, textMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 *  */
    @Test
    public void testText_NotChildNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = ((Object) null);
        textMethod.invoke(element, textMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method text(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: childNodes)
 *  */
    @Test
    public void testText_ThrowNullPointerException1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = ((Object) null);
        try {
            textMethod.invoke(element, textMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && element.isBlock() && !TextNode.lastCharIsWhitespace(accum)
 *  */
    @Test
    public void testText_ThrowNullPointerException_11() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:593) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = ((Object) null);
        try {
            textMethod.invoke(element, textMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.text(accum);
 *  */
    @Test
    public void testText_ThrowNullPointerException_3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579)
            org.jsoup.nodes.Element.text(Element.java:595) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = stringBuilder;
        try {
            textMethod.invoke(element, textMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.text(accum);
 *  */
    @Test
    public void testText_ThrowNullPointerException_2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579)
            org.jsoup.nodes.Element.text(Element.java:595) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = stringBuilder;
        try {
            textMethod.invoke(element, textMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.text(accum);
 *  */
    @Test
    public void testText_ThrowNullPointerException_4() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:579)
            org.jsoup.nodes.Element.text(Element.java:595) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method textMethod = elementClazz.getDeclaredMethod("text", stringBuilderType);
        textMethod.setAccessible(true);
        java.lang.Object[] textMethodArguments = new java.lang.Object[1];
        textMethodArguments[0] = stringBuilder;
        try {
            textMethod.invoke(element, textMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.child
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link org.jsoup.select.Elements#get(int)}
 * @utbot.returnsFrom {@code return children().get(index);}
 *  */
    @Test
    public void testChild_ElementsGet() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Element actual = element.child(0);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return children().get(index);
 *  */
    @Test
    public void testChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.select.Elements.get(Elements.java:366)
            org.jsoup.nodes.Element.child(Element.java:141) */
        element.child(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return children().get(index);
 *  */
    @Test
    public void testChild_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.select.Elements.get(Elements.java:366)
            org.jsoup.nodes.Element.child(Element.java:141) */
        element.child(-1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.classNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method classNames()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#classNames()}
 * @utbot.executesCondition {@code (classNames == null): False}
 * @utbot.returnsFrom {@code return classNames;}
 *  */
    @Test
    public void testClassNames_ClassNamesNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        LinkedHashSet actual = ((LinkedHashSet) element.classNames());
        
        assertTrue(deepEquals(classNames, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method classNames()
    
    @Test
    public void testClassNames1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        LinkedHashSet actual = ((LinkedHashSet) element.classNames());
        
        LinkedHashSet expected = new LinkedHashSet();
        String string = "";
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.classNames
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method classNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#classNames(java.util.Set)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(classNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.classNames(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method classNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#classNames(java.util.Set)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.lang.StringUtils#join(java.util.Collection,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.put("class", StringUtils.join(classNames, " "));
 *  */
    @Test
    public void testClassNames_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688) */
        element.classNames(linkedHashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.tag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tag()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#tag()}
 * @utbot.returnsFrom {@code return tag;}
 *  */
    @Test
    public void testTag_ReturnTag() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Tag actual = element.tag();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.children
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method children()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_Return() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_NotNodeNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_NodeInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method children()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testChildren_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.children] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:155) */
        element.children();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendText
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TextNode node = new TextNode(text, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendText(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPrependChild_ListAdd() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        Node initialTextNodeParentNode = textNode.parentNode;
        
        Element actual = element.prependChild(textNode);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalTextNodeParentNode = textNode.parentNode;
        
        assertFalse(initialTextNodeParentNode == finalTextNodeParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link org.apache.commons.lang.NotImplementedException} in: child.setParentNode(this);
 *  */
    @Test(expected = NotImplementedException.class)
    public void testPrependChild_ThrowNotImplementedException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        textNode.setParentNode(parentNode);
        
        element.prependChild(textNode);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(child);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependChild_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prependChild(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prependChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.util.List#add(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(0, child);
 *  */
    @Test
    public void testPrependChild_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.prependChild(Element.java:207) */
        element.prependChild(textNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependElement(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prependElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.accumulateParents
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 *  */
    @Test
    public void testAccumulateParents_ParentEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
        accumulateParentsMethodArguments[1] = ((Object) null);
        accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = el.parent();
 *  */
    @Test
    public void testAccumulateParents_ThrowClassCastException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.accumulateParents(Element.java:123) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
        accumulateParentsMethodArguments[1] = ((Object) null);
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!parent.tagName().equals("#root")): True}
 * @utbot.invokes {@link org.jsoup.select.Elements#add(org.jsoup.nodes.Element)}
 * @utbot.triggersRecursion accumulateParents, where the test invoke:
 *     org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements) once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: accumulateParents(parent, parents);
 *  */
    @Test
    public void testAccumulateParents_ThrowClassCastException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.accumulateParents(Element.java:123)
            org.jsoup.nodes.Element.accumulateParents(Element.java:126) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
        accumulateParentsMethodArguments[1] = elements;
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = el.parent();
 *  */
    @Test
    public void testAccumulateParents_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:123) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = ((Object) null);
        accumulateParentsMethodArguments[1] = ((Object) null);
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent != null && !parent.tagName().equals("#root")
 *  */
    @Test
    public void testAccumulateParents_ThrowNullPointerException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:124) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = document;
        accumulateParentsMethodArguments[1] = ((Object) null);
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!parent.tagName().equals("#root")): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAccumulateParents_ThrowNullPointerException_2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:125) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
        accumulateParentsMethodArguments[1] = ((Object) null);
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.select(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(query, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.select(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001!\u0001";
        
        element.select(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select(java.lang.String)
    
    @Test
    public void testSelect2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0101\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.select] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:64)
            org.jsoup.nodes.Evaluator$Tag.matches(Evaluator.java:26)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:424)
            org.jsoup.select.Selector.byTag(Selector.java:198)
            org.jsoup.select.Selector.findElements(Selector.java:150)
            org.jsoup.select.Selector.select(Selector.java:101)
            org.jsoup.select.Selector.select(Selector.java:74)
            org.jsoup.nodes.Element.select(Element.java:180) */
        element.select(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependText
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TextNode node = new TextNode(text, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prependText(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependText(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        element.baseUri = baseUri;
        
        element.prependText(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prependText(java.lang.String)
    
    @Test
    public void testPrependText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        element.baseUri = baseUri;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.prependText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.prependChild(Element.java:207)
            org.jsoup.nodes.Element.prependText(Element.java:257) */
        element.prependText(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: append(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHtml_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.html(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHtml_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String string = "";
        
        element.html(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method html(java.lang.String)
    
    @Test
    public void testHtml1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000\u0000";
        
        Element actual = element.html(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testHtml2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000";
        
        Element actual = element.html(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testHtml_ListIterator() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethod.invoke(element, htmlMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: node.outerHtml(accum);
 *  */
    @Test
    public void testHtml_ThrowClassCastException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        document.setParentNode(parentNode);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.outerHtml(Element.java:774)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:805) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.outerHtml(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.StringBuilder)
    
    @Test
    public void testHtml3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        DataNode parentNode2 = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        document.setParentNode(parentNode);
        childNodes.add(document);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) document);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        childNodes.add(objectArray);
        childNodes.add(objectArray);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml4() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml5() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.get(Attributes.java:30)
            org.jsoup.nodes.TextNode.getWholeText(TextNode.java:54)
            org.jsoup.nodes.TextNode.outerHtml(TextNode.java:66)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml6() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml7() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml8() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        document.setParentNode(parentNode);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.StringBuilder)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml9() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = stringBuilder;
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html()}
 * @utbot.invokes org.jsoup.nodes.Element#html(java.lang.StringBuilder)
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return accum.toString().trim();}
 *  */
    @Test
    public void testHtml_StringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.html();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: html(accum);
 *  */
    @Test
    public void testHtml_ThrowClassCastException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.outerHtml(Element.java:774)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: html(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:805)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: html(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html()
    
    @Test
    public void testHtml10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(textNode);
        childNodes.add(element);
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.get(Attributes.java:30)
            org.jsoup.nodes.TextNode.getWholeText(TextNode.java:54)
            org.jsoup.nodes.TextNode.outerHtml(TextNode.java:66)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    @Test
    public void testHtml11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(element1);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    @Test
    public void testHtml12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element1.setParentNode(parentNode);
        childNodes.add(element1);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    @Test
    public void testHtml13() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    @Test
    public void testHtml14() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    
    @Test
    public void testHtml15() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element1.setParentNode(parentNode);
        childNodes.add(element1);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779)
            org.jsoup.nodes.Element.html(Element.java:806)
            org.jsoup.nodes.Element.html(Element.java:800) */
        element.html();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html()
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml16() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.html();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getDeepChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeepChild(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return el;}
 *  */
    @Test
    public void testGetDeepChild_ReturnEl() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = element1;
        Element actual = ((Element) getDeepChildMethod.invoke(element, getDeepChildMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return el;}
 *  */
    @Test
    public void testGetDeepChild_ReturnEl_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = document;
        Document actual = ((Document) getDeepChildMethod.invoke(element, getDeepChildMethodArguments));
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List documentChildNodes = document.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(documentChildNodes, actualChildNodes));
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeepChild(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> children = el.children();
 *  */
    @Test
    public void testGetDeepChild_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.getDeepChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.getDeepChild(Element.java:336) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = ((Object) null);
        try {
            getDeepChildMethod.invoke(element, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDeepChild(org.jsoup.nodes.Element)
    
    @Test
    public void testGetDeepChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes1 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(element2);
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = element1;
        Element actual = ((Element) getDeepChildMethod.invoke(element, getDeepChildMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element2, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDeepChild(org.jsoup.nodes.Element)
    
    @Test(expected = StackOverflowError.class)
    public void testGetDeepChild2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(document);
        childNodes.add(document);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = document;
        try {
            getDeepChildMethod.invoke(element, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDeepChild3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element1);
        childNodes.add(null);
        childNodes.add(null);
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = elementClazz.getDeclaredMethod("getDeepChild", elementClazz);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = element1;
        try {
            getDeepChildMethod.invoke(element, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.isBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlock()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#isBlock()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isBlock()}
 * @utbot.returnsFrom {@code return tag.isBlock();}
 *  */
    @Test
    public void testIsBlock_TagIsBlock() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = element.isBlock();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isBlock()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#isBlock()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tag.isBlock();
 *  */
    @Test
    public void testIsBlock_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.isBlock] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.isBlock(Element.java:83) */
        element.isBlock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtml
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtml(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: isBlock() || (parent() != null && parent().tag().canContainBlock() && siblingIndex() == 0)
 *  */
    @Test
    public void testOuterHtml_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.outerHtml(Element.java:774) */
        element.outerHtml(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:777) */
        element.outerHtml(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtml(java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#canContainBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:777) */
        element.outerHtml(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlock() || (parent() != null && parent().tag().canContainBlock() && siblingIndex() == 0)
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:774) */
        element.outerHtml(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtml(java.lang.StringBuilder)
    
    @Test
    public void testOuterHtml1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.asList(Attributes.java:97)
            org.jsoup.nodes.Attributes.iterator(Attributes.java:88)
            org.jsoup.nodes.Attributes.html(Attributes.java:110)
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode2 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtml(Element.java:779) */
        element.outerHtml(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByTag
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTag_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.getElementsByTag(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByTag(java.lang.String)
    
    @Test
    public void testGetElementsByTag1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "KK";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByTag] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:64)
            org.jsoup.nodes.Evaluator$Tag.matches(Evaluator.java:26)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:424) */
        element.getElementsByTag(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#classNames()}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.returnsFrom {@code return classNames().contains(className);}
 *  */
    @Test
    public void testHasClass_SetContains() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        boolean actual = element.hasClass(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:68)
            org.jsoup.nodes.Element.className(Element.java:664)
            org.jsoup.nodes.Element.classNames(Element.java:675)
            org.jsoup.nodes.Element.hasClass(Element.java:698) */
        element.hasClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getAllElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getAllElements()}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.nodes.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.AllElements(), this);}
 *  */
    @Test
    public void testGetAllElements_CollectorCollect() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getAllElements();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.toggleClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toggleClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#toggleClass(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.toggleClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nextElementSibling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testNextElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:360) */
        element.nextElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testNextElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.nextElementSibling(Element.java:360) */
        element.nextElementSibling();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(index);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(index);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClass_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.getElementsByClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.preserveWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveWhitespace()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.returnsFrom {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_TagPreserveWhitespaceOrParentNotEqualsNullAndParentPreserveWhitespace() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = element.preserveWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.returnsFrom {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_TagPreserveWhitespaceOrParentEqualsNullAndParentPreserveWhitespace() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = element.preserveWhitespace();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.triggersRecursion preserveWhitespace, where the test return from: {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 * @utbot.returnsFrom {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_TagPreserveWhitespaceOrParentNotEqualsNullAndParentPreserveWhitespace_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        
        boolean actual = element.preserveWhitespace();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.triggersRecursion preserveWhitespace, where the test return from: {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 * @utbot.returnsFrom {@code return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_TagPreserveWhitespaceOrParentEqualsNullAndParentPreserveWhitespace_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        boolean actual = element.preserveWhitespace();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preserveWhitespace()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#preserveWhitespace()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();
 *  */
    @Test
    public void testPreserveWhitespace_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:601) */
        element.preserveWhitespace();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#preserveWhitespace()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tag.preserveWhitespace() || parent() != null && parent().preserveWhitespace();
 *  */
    @Test
    public void testPreserveWhitespace_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:601) */
        element.preserveWhitespace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.siblingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method siblingElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.returnsFrom {@code return parent().children();}
 *  */
    @Test
    public void testSiblingElements_ReturnParentChildren() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.returnsFrom {@code return parent().children();}
 *  */
    @Test
    public void testSiblingElements_ReturnParentChildren_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.returnsFrom {@code return parent().children();}
 *  */
    @Test
    public void testSiblingElements_ReturnParentChildren_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method siblingElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return parent().children();
 *  */
    @Test
    public void testSiblingElements_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.siblingElements(Element.java:348) */
        element.siblingElements();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent().children();
 *  */
    @Test
    public void testSiblingElements_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.siblingElements(Element.java:348) */
        element.siblingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.lastElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(siblings.size() - 1) : null;}
 *  */
    @Test
    public void testLastElementSibling_ReturnSiblingsSizeLessOrEqual1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(siblings.size() - 1) : null;}
 *  */
    @Test
    public void testLastElementSibling_ReturnSiblingsSizeLessOrEqual1_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(siblings.size() - 1) : null;}
 *  */
    @Test
    public void testLastElementSibling_ReturnSiblingsSizeLessOrEqual1_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testLastElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:409) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testLastElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.lastElementSibling(Element.java:409) */
        element.lastElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    @Test
    public void testLastElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(textNode);
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testLastElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method lastElementSibling()
    
    @Test
    public void testLastElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(element);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.children(Element.java:155)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:409) */
        element.lastElementSibling();
    }
    
    @Test
    public void testLastElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        childNodes.add(copyOnWriteArrayList);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class java.util.concurrent.CopyOnWriteArrayList cannot be cast to class org.jsoup.nodes.Node (java.util.concurrent.CopyOnWriteArrayList is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.children(Element.java:155)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:409) */
        element.lastElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasText()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasText_ReturnFalse() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasText()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasText_ReturnFalse_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasText()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: childNodes)
 *  */
    @Test
    public void testHasText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.hasText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasText(Element.java:624) */
        element.hasText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasText()
    
    @Test
    public void testHasText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasText()
    
    @Test(expected = StackOverflowError.class)
    public void testHasText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.hasText();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes1 = new ArrayList();
        childNodes1.add(null);
        childNodes1.add(null);
        childNodes1.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(document);
        childNodes.add(element);
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.hasText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.removeClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#removeClass(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.removeClass(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeClass(java.lang.String)
    
    @Test
    public void testRemoveClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.removeClass(Element.java:726) */
        element.removeClass(string1);
    }
    
    @Test
    public void testRemoveClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:68)
            org.jsoup.nodes.Element.className(Element.java:664)
            org.jsoup.nodes.Element.classNames(Element.java:675)
            org.jsoup.nodes.Element.removeClass(Element.java:724) */
        element.removeClass(string);
    }
    
    @Test
    public void testRemoveClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.put(Attributes.java:50)
            org.jsoup.nodes.Attributes.put(Attributes.java:41)
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.removeClass(Element.java:726) */
        element.removeClass(string);
    }
    
    @Test
    public void testRemoveClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "\u0000";
        classNames.add(string);
        String string1 = "";
        classNames.add(string1);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string2 = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.removeClass(Element.java:726) */
        element.removeClass(string2);
    }
    
    @Test
    public void testRemoveClass5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        String string = "";
        classNames.add(string);
        classNames.add(string);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:688)
            org.jsoup.nodes.Element.removeClass(Element.java:726) */
        element.removeClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueStarting
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueStarting(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueStarting(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueStarting_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeValueStarting(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueStarting(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueStarting_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValueStarting(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueStarting(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueStarting1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueStarting] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Evaluator$AttributeWithValueStarting.matches(Evaluator.java:90)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttributeValueStarting(Element.java:506) */
        element.getElementsByAttributeValueStarting(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueContaining
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueContaining(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueContaining(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueContaining_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeValueContaining(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueContaining(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueContaining_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValueContaining(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueContaining(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueContaining1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000";
        String string1 = "";
        
        element.getElementsByAttributeValueContaining(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueContaining(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueContaining2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueContaining] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Evaluator$AttributeWithValueContaining.matches(Evaluator.java:110)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttributeValueContaining(Element.java:528) */
        element.getElementsByAttributeValueContaining(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttribute
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttribute(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttribute(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttribute(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttribute(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttribute_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.getElementsByAttribute(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttribute(java.lang.String)
    
    @Test
    public void testGetElementsByAttribute1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!!\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Evaluator$Attribute.matches(Evaluator.java:60)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttribute(Element.java:473) */
        element.getElementsByAttribute(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValue(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValue(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValue_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValue(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValue_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValue(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValue(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValue1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "@\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Evaluator$AttributeWithValue.matches(Evaluator.java:70)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttributeValue(Element.java:484) */
        element.getElementsByAttributeValue(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexLessThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.nodes.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexLessThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:400)
            org.jsoup.nodes.Evaluator$IndexLessThan.matches(Evaluator.java:139)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:537) */
        element.getElementsByIndexLessThan(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexLessThan(-2147483647);
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexLessThan2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexLessThan(1);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexLessThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexLessThan(1);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Evaluator$IndexLessThan.matches(Evaluator.java:139)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:537) */
        element.getElementsByIndexLessThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.firstElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(0) : null;}
 *  */
    @Test
    public void testFirstElementSibling_ReturnSiblingsSizeLessOrEqual1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(0) : null;}
 *  */
    @Test
    public void testFirstElementSibling_ReturnSiblingsSizeLessOrEqual1_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(0) : null;}
 *  */
    @Test
    public void testFirstElementSibling_ReturnSiblingsSizeLessOrEqual1_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testFirstElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:390) */
        element.firstElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testFirstElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.firstElementSibling(Element.java:390) */
        element.firstElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        childNodes.add(dataNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testFirstElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testFirstElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(element);
        childNodes.add(childNodes);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class org.jsoup.nodes.Node (java.util.ArrayList is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.children(Element.java:155)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:390) */
        element.firstElementSibling();
    }
    
    @Test
    public void testFirstElementSibling5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        childNodes.add(copyOnWriteArrayList);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class java.util.concurrent.CopyOnWriteArrayList cannot be cast to class org.jsoup.nodes.Node (java.util.concurrent.CopyOnWriteArrayList is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.children(Element.java:155)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:390) */
        element.firstElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueNot
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueNot(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueNot(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueNot_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeValueNot(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueNot(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueNot_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValueNot(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueNot(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueNot1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000";
        String string1 = "";
        
        element.getElementsByAttributeValueNot(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueNot(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueNot2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "!\u0000\u0000!\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueNot] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Evaluator$AttributeWithValueNot.matches(Evaluator.java:80)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttributeValueNot(Element.java:495) */
        element.getElementsByAttributeValueNot(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.elementSiblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testElementSiblingIndex_IntegerValueOf() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Integer actual = element.elementSiblingIndex();
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.returnsFrom {@code return indexInList(this, parent().children());}
 *  */
    @Test
    public void testElementSiblingIndex_ReturnIndexInList() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.returnsFrom {@code return indexInList(this, parent().children());}
 *  */
    @Test
    public void testElementSiblingIndex_ReturnIndexInList_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.returnsFrom {@code return indexInList(this, parent().children());}
 *  */
    @Test
    public void testElementSiblingIndex_ReturnIndexInList_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.returnsFrom {@code return indexInList(this, parent().children());}
 *  */
    @Test
    public void testElementSiblingIndex_ReturnIndexInList_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: parent() == null
 *  */
    @Test
    public void testElementSiblingIndex_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:400) */
        element.elementSiblingIndex();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueEnding
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueEnding(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueEnding(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueEnding_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeValueEnding(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueEnding(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueEnding_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValueEnding(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueEnding(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueEnding1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000";
        String string1 = "";
        
        element.getElementsByAttributeValueEnding(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueEnding(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueEnding2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueEnding] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:95)
            org.jsoup.nodes.Node.attr(Node.java:62)
            org.jsoup.nodes.Evaluator$AttributeWithValueEnding.matches(Evaluator.java:100)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByAttributeValueEnding(Element.java:517) */
        element.getElementsByAttributeValueEnding(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.nodes.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:400)
            org.jsoup.nodes.Evaluator$IndexGreaterThan.matches(Evaluator.java:149)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:546) */
        element.getElementsByIndexGreaterThan(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexGreaterThan(int)
    
    @Test
    public void testGetElementsByIndexGreaterThan1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(0);
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(0);
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(Integer.MIN_VALUE);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(Integer.MIN_VALUE);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    @Test
    public void testGetElementsByIndexGreaterThan5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Evaluator$IndexGreaterThan.matches(Evaluator.java:149)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:546) */
        element.getElementsByIndexGreaterThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.previousElementSibling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:375) */
        element.previousElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.previousElementSibling(Element.java:375) */
        element.previousElementSibling();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(index);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(index);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method previousElementSibling()
    
    @Test
    public void testPreviousElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousElementSibling()
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexEquals(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.nodes.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexEquals_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.jsoup.nodes.Element.parent(Element.java:109)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:400)
            org.jsoup.nodes.Evaluator$IndexEquals.matches(Evaluator.java:159)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:555) */
        element.getElementsByIndexEquals(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexEquals(int)
    
    @Test
    public void testGetElementsByIndexEquals1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(1);
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexEquals2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(8388608);
        
        ArrayList arrayList = new ArrayList();
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexEquals3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(0);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetElementsByIndexEquals4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(0);
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexEquals(int)
    
    @Test
    public void testGetElementsByIndexEquals5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Evaluator$IndexEquals.matches(Evaluator.java:159)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:555) */
        element.getElementsByIndexEquals(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendChild_ListAdd() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        Node initialTextNodeParentNode = textNode.parentNode;
        
        Element actual = element.appendChild(textNode);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalTextNodeParentNode = textNode.parentNode;
        
        assertFalse(initialTextNodeParentNode == finalTextNodeParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link org.apache.commons.lang.NotImplementedException} in: child.setParentNode(this);
 *  */
    @Test(expected = NotImplementedException.class)
    public void testAppendChild_ThrowNotImplementedException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        textNode.setParentNode(parentNode);
        
        element.appendChild(textNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAppendChild_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:193) */
        element.appendChild(textNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.tagName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tagName()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.returnsFrom {@code return tag.getName();}
 *  */
    @Test
    public void testTagName_TagGetName() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        String actual = element.tagName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tagName()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tag.getName();
 *  */
    @Test
    public void testTagName_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.tagName] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:64) */
        element.tagName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementById
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementById(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementById(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(id);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementById(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementById(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(id);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementById_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.getElementById(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementById(java.lang.String)
    
    @Test
    public void testGetElementById1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:155)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:30)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementById(Element.java:439) */
        element.getElementById(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields992007978860100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields992007978860100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass992007978865900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992007978860100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992007978865900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields992007982701400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992007982701400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992007982703000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992007982701400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992007982703000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

