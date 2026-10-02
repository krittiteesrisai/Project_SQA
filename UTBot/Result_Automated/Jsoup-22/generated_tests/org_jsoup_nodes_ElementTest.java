package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Tag;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.jsoup.select.Elements;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.jsoup.select.Selector.SelectorParseException;
import org.jsoup.select.Selector;
import org.jsoup.nodes.Document.OutputSettings;
import java.util.regex.Pattern;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
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
        String string = "!";
        
        element.appendElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
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
            org.jsoup.nodes.Element.nodeName(Element.java:58) */
        element.nodeName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.parent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parent()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parent()}
 * @utbot.returnsFrom {@code return (Element) parentNode;}
 *  */
    @Test
    public void testParent_ReturnParentNode() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Element actual = element.parent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parent()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) parentNode;
 *  */
    @Test
    public void testParent_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parent] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142) */
        element.parent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this == o;}
 *  */
    @Test
    public void testEquals_EqualsO() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(element);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this == o;}
 *  */
    @Test
    public void testEquals_NotEqualsO() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.toString
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode1.setParentNode(parentNode);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        element.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.nodes.Element.toString(Element.java:1088) */
        element.toString();
    }
    
    @Test
    public void testToString3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.nodes.Element.toString(Element.java:1088) */
        element.toString();
    }
    
    @Test
    public void testToString4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        DataNode parentNode2 = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        XmlDeclaration parentNode3 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.nodes.Element.toString(Element.java:1088) */
        element.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Node.outerHtml(Node.java:512)
            org.jsoup.nodes.Element.toString(Element.java:1088) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> nodes = Parser.parseFragment(html, this, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.append(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ReturnResult() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ReturnResult_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
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
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        int actual = element.hashCode();
        
        assertEquals(29791, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        int actual = element.hashCode();
        
        assertEquals(917057346, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        
        element.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#clone()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element clone = (Element) super.clone();
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.clone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:581)
            org.jsoup.nodes.Node.clone(Node.java:566)
            org.jsoup.nodes.Element.clone(Element.java:1106) */
        element.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.className
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method className()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#className()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return attr("class");}
 *  */
    @Test
    public void testClassName_ElementAttr() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method className()
    
    @Test
    public void testClassName1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.wrap
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.wrap(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.wrap(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.wrap(html);
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.wrap(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.wrap(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#wrap(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) super.wrap(html);
 *  */
    @Test
    public void testWrap_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.wrap(Node.java:316)
            org.jsoup.nodes.Element.wrap(Element.java:425) */
        element.wrap(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrap(java.lang.String)
    
    @Test
    public void testWrap1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.parser.HtmlTreeBuilder.parseFragment(HtmlTreeBuilder.java:52)
            org.jsoup.parser.Parser.parseFragment(Parser.java:105)
            org.jsoup.nodes.Node.wrap(Node.java:317)
            org.jsoup.nodes.Element.wrap(Element.java:425) */
        element.wrap(string);
    }
    
    @Test
    public void testWrap2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:83)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:48)
            org.jsoup.parser.HtmlTreeBuilder.parseFragment(HtmlTreeBuilder.java:73)
            org.jsoup.parser.Parser.parseFragment(Parser.java:105)
            org.jsoup.nodes.Node.wrap(Node.java:317)
            org.jsoup.nodes.Element.wrap(Element.java:425) */
        element.wrap(string);
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
            org.jsoup.nodes.Element.val(Element.java:1028) */
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
            org.jsoup.nodes.Node.attr(Node.java:95)
            org.jsoup.nodes.Element.attr(Element.java:119)
            org.jsoup.nodes.Element.val(Element.java:1031) */
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
        element.attributes = attributes;
        
        element.val(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method val(java.lang.String)
    
    @Test
    public void testVal1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "t\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.val(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
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
            org.jsoup.nodes.Element.val(Element.java:1016) */
        element.val();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method val()
    
    @Test
    public void testVal2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "te\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testVal3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "te\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        String actual = element.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val()
    
    @Test
    public void testVal4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "tex\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:73)
            org.jsoup.nodes.Element.val(Element.java:1019) */
        element.val();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testData_StringBuilderToString() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
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
            org.jsoup.nodes.Element.data(Element.java:902) */
        element.data();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method data()
    
    @Test
    public void testData1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testData2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testData3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes1 = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testData4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        dataNode.attributes = attributes;
        childNodes.add(dataNode);
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
    public void testData5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.empty(Element.java:413) */
        element.empty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.addClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#addClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.addClass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addClass(java.lang.String)
    
    @Test
    public void testAddClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.addClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testAddClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.addClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addClass(java.lang.String)
    
    @Test
    public void testAddClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.addClass(Element.java:973) */
        element.addClass(string);
    }
    
    @Test
    public void testAddClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.addClass(Element.java:973) */
        element.addClass(string);
    }
    
    @Test
    public void testAddClass5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.addClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.addClass(Element.java:973) */
        element.addClass(string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.id
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method id()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.executesCondition {@code (id == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attr(java.lang.String)}
 * @utbot.returnsFrom {@code return id == null ? "" : id;}
 *  */
    @Test
    public void testId_IdNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method id()
    
    @Test
    public void testId1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(null, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
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
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.accumulateParents(Element.java:156)
            org.jsoup.nodes.Element.parents(Element.java:151) */
        element.parents();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testParents_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.accumulateParents(Element.java:156)
            org.jsoup.nodes.Element.accumulateParents(Element.java:159)
            org.jsoup.nodes.Element.parents(Element.java:151) */
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
            org.jsoup.nodes.Element.accumulateParents(Element.java:157)
            org.jsoup.nodes.Element.parents(Element.java:151) */
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
        element.attributes = attributes;
        
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
        element.attributes = attributes;
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
        element.attributes = attributes;
        String string = " ";
        
        element.attr(string, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.before
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.before(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.before(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) super.before(html);
 *  */
    @Test
    public void testBefore_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:303)
            org.jsoup.nodes.Node.before(Node.java:256)
            org.jsoup.nodes.Element.before(Element.java:371) */
        element.before(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.before
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.before(((Node) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.before(((Node) element1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Element) super.before(node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -1;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:421)
            org.jsoup.nodes.Node.before(Node.java:270)
            org.jsoup.nodes.Element.before(Element.java:382) */
        element.before(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:420)
            org.jsoup.nodes.Node.before(Node.java:270)
            org.jsoup.nodes.Element.before(Element.java:382) */
        element.before(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Element) super.before(node);
 *  */
    @Test
    public void testBefore_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = 3;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:434)
            org.jsoup.nodes.Node.addChildren(Node.java:423)
            org.jsoup.nodes.Node.before(Node.java:270)
            org.jsoup.nodes.Element.before(Element.java:382) */
        element.before(((Node) document));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.after
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.after(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.after(string);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.after(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) super.after(html);
 *  */
    @Test
    public void testAfter_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.parent(Element.java:24)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:303)
            org.jsoup.nodes.Node.after(Node.java:281)
            org.jsoup.nodes.Element.after(Element.java:394) */
        element.after(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.after
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.after(((Node) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.after(((Node) element1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -2;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:421)
            org.jsoup.nodes.Node.after(Node.java:295)
            org.jsoup.nodes.Element.after(Element.java:405) */
        element.after(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:420)
            org.jsoup.nodes.Node.after(Node.java:295)
            org.jsoup.nodes.Element.after(Element.java:405) */
        element.after(((Node) document));
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> nodes = Parser.parseFragment(html, this, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.prepend(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#empty()}
 *  */
    @Test
    public void testText_ElementEmpty() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        Element actual = element.text(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method text(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(text);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.text(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method text(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendWhitespaceIfBr(this, accum);
 *  */
    @Test
    public void testText_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendWhitespaceIfBr(this, accum);
 *  */
    @Test
    public void testText_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796) */
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
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: childNodes)
 *  */
    @Test
    public void testText_ThrowNullPointerException_2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:798) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method text()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(sb);
 *  */
    @Test
    public void testText_ThrowNullPointerException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791) */
        element.text();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(sb);
 *  */
    @Test
    public void testText_ThrowNullPointerException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791) */
        element.text();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(sb);
 *  */
    @Test
    public void testText_ThrowNullPointerException_21() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.text(Element.java:798)
            org.jsoup.nodes.Element.text(Element.java:791) */
        element.text();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.child
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link org.jsoup.select.Elements#get(int)}
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
            org.jsoup.select.Elements.get(Elements.java:516)
            org.jsoup.nodes.Element.child(Element.java:174) */
        element.child(-1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method child(int)
    
    @Test
    public void testChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.select.Elements.get(Elements.java:516)
            org.jsoup.nodes.Element.child(Element.java:174) */
        element.child(0);
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
        element.attributes = attributes;
        
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
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(classNames);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testClassNames_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.classNames(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method classNames(java.util.Set)
    
    @Test
    public void testClassNames2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashSet.add(string1);
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945) */
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
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
            org.jsoup.nodes.Element.children(Element.java:188) */
        element.children();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 *  */
    @Test
    public void testAppendText_ElementBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        
        Element actual = element.appendText(null);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001";
        
        element.prependElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        element.prependElement(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependChild
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
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
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: addChildren(0, child);
 *  */
    @Test
    public void testPrependChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:420)
            org.jsoup.nodes.Element.prependChild(Element.java:280) */
        element.prependChild(textNode);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prependChild(org.jsoup.nodes.Node)
    
    @Test
    public void testPrependChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes1 = new ArrayList();
        Comment comment1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes1.add(comment1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        comment.setParentNode(parentNode);
        
        Node initialCommentParentNode = comment.parentNode;
        
        Element actual = element.prependChild(comment);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalCommentParentNode = comment.parentNode;
        
        assertFalse(initialCommentParentNode == finalCommentParentNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prependChild(org.jsoup.nodes.Node)
    
    @Test
    public void testPrependChild2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        documentType.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:434)
            org.jsoup.nodes.Node.removeChild(Node.java:403)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:420)
            org.jsoup.nodes.Element.prependChild(Element.java:280) */
        element.prependChild(documentType);
    }
    
    @Test
    public void testPrependChild3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:434)
            org.jsoup.nodes.Node.addChildren(Node.java:423)
            org.jsoup.nodes.Element.prependChild(Element.java:280) */
        element.prependChild(document);
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
            org.jsoup.nodes.Element.isBlock(Element.java:99) */
        element.isBlock();
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = document;
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.accumulateParents(Element.java:156) */
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
 * @utbot.executesCondition {@code (!parent.tagName().equals("#root")): True}
 * @utbot.invokes {@link org.jsoup.select.Elements#add(org.jsoup.nodes.Element)}
 * @utbot.triggersRecursion accumulateParents, where the test invoke:
 *     org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements) once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: accumulateParents(parent, parents);
 *  */
    @Test
    public void testAccumulateParents_ThrowClassCastException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        document.setParentNode(parentNode);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Elements elements = new Elements(((List) arrayList));
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.accumulateParents(Element.java:156)
            org.jsoup.nodes.Element.accumulateParents(Element.java:159) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = document;
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
            org.jsoup.nodes.Element.accumulateParents(Element.java:156) */
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
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:157) */
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:158) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method accumulateParents(org.jsoup.nodes.Element, org.jsoup.select.Elements)
    
    @Test
    public void testAccumulateParents1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        Elements elements = new Elements();
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = document;
        accumulateParentsMethodArguments[1] = elements;
        accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.dataNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dataNodes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataNodes()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testDataNodes_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.dataNodes] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.dataNodes(Element.java:230) */
        element.dataNodes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dataNodes()
    
    @Test
    public void testDataNodes1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = element.dataNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testDataNodes2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = element.dataNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.dataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataset()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes.dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        Map actual = element.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes.dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        Map actual = element.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dataset()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#dataset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes.dataset();
 *  */
    @Test
    public void testDataset_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.dataset] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.dataset(Element.java:137) */
        element.dataset();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.textNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method textNodes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#textNodes()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(textNodes);}
 *  */
    @Test
    public void testTextNodes_CollectionsUnmodifiableList() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = element.textNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method textNodes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#textNodes()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testTextNodes_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.textNodes] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.textNodes(Element.java:213) */
        element.textNodes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#select(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.select.Selector#select(java.lang.String,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(cssQuery, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.select(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "!";
        
        element.select(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSelect2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001";
        
        element.select(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select(java.lang.String)
    
    @Test
    public void testSelect3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0101\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.select] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.select.Evaluator$Tag.matches(Evaluator.java:38)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.select.Selector.select(Selector.java:101)
            org.jsoup.select.Selector.select(Selector.java:79)
            org.jsoup.nodes.Element.select(Element.java:255) */
        element.select(string);
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
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
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
    public void testSiblingElements_ReturnParentChildren_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
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
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.siblingElements(Element.java:435) */
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
            org.jsoup.nodes.Element.siblingElements(Element.java:435) */
        element.siblingElements();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method siblingElements()
    
    @Test
    public void testSiblingElements1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        ArrayList arrayList = new ArrayList();
        arrayList.add(element1);
        Elements expected = new Elements(((List) arrayList));
        
        // org.jsoup.select.Elements is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method siblingElements()
    
    @Test
    public void testSiblingElements2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(childNodes);
        childNodes.add(childNodes);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class org.jsoup.nodes.Node (java.util.ArrayList is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.siblingElements(Element.java:435) */
        element.siblingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.lastElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.executesCondition {@code (siblings.size() > 1): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(siblings.size() - 1) : null;}
 *  */
    @Test
    public void testLastElementSibling_SiblingsSizeLessOrEqual1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
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
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:496) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testLastElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.lastElementSibling(Element.java:496) */
        element.lastElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    @Test
    public void testLastElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testLastElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
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
    
    ///region OTHER: ERROR SUITE for method getElementsByClass(java.lang.String)
    
    @Test
    public void testGetElementsByClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jsoup.nodes.Node.childNodes(Node.java:213)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:559) */
        element.getElementsByClass(string);
    }
    
    @Test
    public void testGetElementsByClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jsoup.nodes.Node.childNodes(Node.java:213)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:559) */
        element.getElementsByClass(string);
    }
    
    @Test
    public void testGetElementsByClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jsoup.nodes.Node.childNodes(Node.java:213)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:559) */
        element.getElementsByClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.indexInList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIndexInList_ReturnNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList arrayList = new ArrayList();
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIndexInList_NotElementEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 *  */
    @Test
    public void testIndexInList_ElementEquals() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(elements);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexInList_ThrowIllegalArgumentException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class listType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, listType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = ((Object) null);
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(search);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexInList_ThrowIllegalArgumentException() throws Throwable  {
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class listType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, listType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = ((Object) null);
        indexInListMethodArguments[1] = ((Object) null);
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.equals(search)
 *  */
    @Test
    public void testIndexInList_ThrowNullPointerException() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:506) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071) */
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
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
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
            org.jsoup.nodes.Element.html(Element.java:1072) */
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
    public void testHtml1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072) */
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
    public void testHtml2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072) */
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
    public void testHtml3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072) */
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
 * @utbot.invokes org.jsoup.nodes.Element#html(java.lang.StringBuilder)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: html(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1071)
            org.jsoup.nodes.Element.html(Element.java:1066) */
        element.html();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html()
    
    @Test
    public void testHtml4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(document1);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1040)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066) */
        element.html();
    }
    
    @Test
    public void testHtml5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        textNode.setParentNode(parentNode);
        childNodes.add(textNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:66)
            org.jsoup.nodes.Entities.escape(Entities.java:62)
            org.jsoup.nodes.TextNode.outerHtmlHead(TextNode.java:93)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:598)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.nodes.Node.outerHtml(Node.java:517)
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066) */
        element.html();
    }
    
    @Test
    public void testHtml6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1072)
            org.jsoup.nodes.Element.html(Element.java:1066) */
        element.html();
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: append(html);
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
    
    ///region OTHER: ERROR SUITE for method html(java.lang.String)
    
    @Test
    public void testHtml7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.parser.HtmlTreeBuilder.parseFragment(HtmlTreeBuilder.java:52)
            org.jsoup.parser.Parser.parseFragment(Parser.java:105)
            org.jsoup.nodes.Element.append(Element.java:343)
            org.jsoup.nodes.Element.html(Element.java:1083) */
        element.html(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 *  */
    @Test
    public void testPrependText_ElementBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        
        Element actual = element.prependText(null);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
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
        String string = "[";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByTag] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.select.Evaluator$Tag.matches(Evaluator.java:38)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:523) */
        element.getElementsByTag(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getAllElements
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getAllElements()
    
    @Test
    public void testGetAllElements1() throws Exception  {
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
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:447) */
        element.nextElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testNextElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.nextElementSibling(Element.java:447) */
        element.nextElementSibling();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(index);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextElementSibling()
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.ownText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ownText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText()}
 * @utbot.invokes org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return sb.toString().trim();}
 *  */
    @Test
    public void testOwnText_StringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.ownText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ownText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText()}
 * @utbot.invokes org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ownText(sb);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:829)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ownText()
    
    @Test
    public void testOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.ownText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ownText()
    
    @Test
    public void testOwnText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    
    @Test
    public void testOwnText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        childNodes.add(textNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:842)
            org.jsoup.nodes.Element.ownText(Element.java:832)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    
    @Test
    public void testOwnText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(document1);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    
    @Test
    public void testOwnText5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(document1);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    
    @Test
    public void testOwnText6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    
    @Test
    public void testOwnText7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.normaliseWhitespace(StringUtil.java:107)
            org.jsoup.nodes.TextNode.normaliseWhitespace(TextNode.java:120)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:843)
            org.jsoup.nodes.Element.ownText(Element.java:832)
            org.jsoup.nodes.Element.ownText(Element.java:824) */
        element.ownText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.ownText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ownText(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testOwnText_ListIterator() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = ((Object) null);
        ownTextMethod.invoke(element, ownTextMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ownText(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: childNodes)
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:829) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = ((Object) null);
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendWhitespaceIfBr((Element) child, accum);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException_1() throws Throwable  {
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
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = ((Object) null);
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ownText(java.lang.StringBuilder)
    
    @Test
    public void testOwnText8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        ownTextMethod.invoke(element, ownTextMethodArguments);
    }
    
    @Test
    public void testOwnText9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        ownTextMethod.invoke(element, ownTextMethodArguments);
    }
    
    @Test
    public void testOwnText10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        ownTextMethod.invoke(element, ownTextMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ownText(java.lang.StringBuilder)
    
    @Test
    public void testOwnText11() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(element);
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOwnText12() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:847)
            org.jsoup.nodes.Element.ownText(Element.java:832) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = ((Object) null);
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOwnText13() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:842)
            org.jsoup.nodes.Element.ownText(Element.java:832) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOwnText14() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:842)
            org.jsoup.nodes.Element.ownText(Element.java:832) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOwnText15() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.ownText(Element.java:834) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method ownTextMethod = elementClazz.getDeclaredMethod("ownText", stringBuilderType);
        ownTextMethod.setAccessible(true);
        java.lang.Object[] ownTextMethodArguments = new java.lang.Object[1];
        ownTextMethodArguments[0] = stringBuilder;
        try {
            ownTextMethod.invoke(element, ownTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#classNames()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasClass_SetIterator() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        boolean actual = element.hasClass(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        boolean actual = element.hasClass(string1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        String string = "";
        classNames.add(string);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        boolean actual = element.hasClass(string1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasClass(Element.java:957) */
        element.hasClass(null);
    }
    
    @Test
    public void testHasClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasClass(Element.java:957) */
        element.hasClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.toggleClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toggleClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#toggleClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToggleClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.toggleClass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toggleClass(java.lang.String)
    
    @Test
    public void testToggleClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.toggleClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testToggleClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.toggleClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toggleClass(java.lang.String)
    
    @Test
    public void testToggleClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.toggleClass(Element.java:1006) */
        element.toggleClass(string);
    }
    
    @Test
    public void testToggleClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.toggleClass(Element.java:1006) */
        element.toggleClass(string);
    }
    
    @Test
    public void testToggleClass5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.toggleClass(Element.java:1006) */
        element.toggleClass(string1);
    }
    
    @Test
    public void testToggleClass6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        String string = "";
        classNames.add(string);
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.toggleClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.toggleClass(Element.java:1006) */
        element.toggleClass(string1);
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
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856) */
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
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856) */
        element.preserveWhitespace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasText()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasText_ListIterator() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
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
            org.jsoup.nodes.Element.hasText(Element.java:879) */
        element.hasText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasText()
    
    @Test
    public void testHasText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes1 = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(document);
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
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "";
        textNode.text = text;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasText()
    
    @Test
    public void testHasText5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) textNode);
        objectArray[1] = objectArray;
        objectArray[2] = objectArray;
        childNodes.add(objectArray);
        childNodes.add(objectArray);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasText] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Node ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.hasText(Element.java:879) */
        element.hasText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (tag.formatAsBlock()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()))
 *  */
    @Test
    public void testOuterHtmlHead_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()))
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036) */
        element.outerHtmlHead(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()))
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036) */
        element.outerHtmlHead(stringBuilder, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()))
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (tag.formatAsBlock()): True}
 * @utbot.executesCondition {@code (parent() != null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()))
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1036) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlHead1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041) */
        element.outerHtmlHead(stringBuilder, 0, outputSettings);
    }
    
    @Test
    public void testOuterHtmlHead2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041) */
        element.outerHtmlHead(stringBuilder, 0, outputSettings);
    }
    
    @Test
    public void testOuterHtmlHead3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041) */
        element.outerHtmlHead(stringBuilder, 0, null);
    }
    
    @Test
    public void testOuterHtmlHead4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1041) */
        element.outerHtmlHead(stringBuilder, 0, outputSettings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1050) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && !childNodes.isEmpty() && tag.formatAsBlock()
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1051) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1050) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("</").append(tagName()).append(">");
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_3() throws Exception  {
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
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1053) */
        element.outerHtmlTail(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && !childNodes.isEmpty() && tag.formatAsBlock()
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_2() throws Exception  {
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
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1051) */
        element.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlTail1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        element.outerHtmlTail(stringBuilder, 0, outputSettings);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlTail2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1053) */
        element.outerHtmlTail(null, 0, outputSettings);
    }
    
    @Test
    public void testOuterHtmlTail3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:67)
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1053) */
        element.outerHtmlTail(stringBuilder, 0, outputSettings);
    }
    
    @Test
    public void testOuterHtmlTail4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1051) */
        element.outerHtmlTail(stringBuilder, 0, outputSettings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.removeClass
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#removeClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(className);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveClass_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.removeClass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method removeClass(java.lang.String)
    
    @Test
    public void testRemoveClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.removeClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testRemoveClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        Element actual = element.removeClass(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method removeClass(java.lang.String)
    
    @Test
    public void testRemoveClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.removeClass(Element.java:988) */
        element.removeClass(string);
    }
    
    @Test
    public void testRemoveClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet classNames = new LinkedHashSet();
        classNames.add(null);
        setField(element, "org.jsoup.nodes.Element", "classNames", classNames);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.removeClass] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.join(StringUtil.java:33)
            org.jsoup.helper.StringUtil.join(StringUtil.java:20)
            org.jsoup.nodes.Element.classNames(Element.java:945)
            org.jsoup.nodes.Element.removeClass(Element.java:988) */
        element.removeClass(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingOwnText
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsMatchingOwnText(java.util.regex.Pattern)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsMatchingOwnText(java.util.regex.Pattern)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
 *  */
    @Test
    public void testGetElementsMatchingOwnText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:829)
            org.jsoup.nodes.Element.ownText(Element.java:824)
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:445)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:752) */
        element.getElementsMatchingOwnText(((Pattern) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingOwnText(java.util.regex.Pattern)
    
    @Test
    public void testGetElementsMatchingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:445)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:752) */
        element.getElementsMatchingOwnText(((Pattern) null));
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingOwnText
    
    public void testGetElementsMatchingOwnText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingOwnText(java.lang.String)
    
    @Test
    public void testGetElementsMatchingOwnText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD820\uDC00";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:829)
            org.jsoup.nodes.Element.ownText(Element.java:824)
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:445)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:752)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:768) */
        element.getElementsMatchingOwnText(string);
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingOwnText
    
    public void testGetElementsMatchingOwnText_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingOwnText(java.lang.String)
    
    @Test
    public void testGetElementsContainingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "K\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:829)
            org.jsoup.nodes.Element.ownText(Element.java:824)
            org.jsoup.select.Evaluator$ContainsOwnText.matches(Evaluator.java:402)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsContainingOwnText(Element.java:716) */
        element.getElementsContainingOwnText(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.elementSiblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.executesCondition {@code (parent() == null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testElementSiblingIndex_ParentEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Integer actual = element.elementSiblingIndex();
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
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
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:487) */
        element.elementSiblingIndex();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    @Test
    public void testElementSiblingIndex1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    
    @Test
    public void testElementSiblingIndex2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendWhitespaceIfBr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendWhitespaceIfBr(org.jsoup.nodes.Element, java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendWhitespaceIfBr(org.jsoup.nodes.Element,java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (element.tag.getName().equals("br")): False}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testAppendWhitespaceIfBr_NotElementTagGetNameEquals() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = document;
        appendWhitespaceIfBrMethodArguments[1] = ((Object) null);
        appendWhitespaceIfBrMethod.invoke(null, appendWhitespaceIfBrMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendWhitespaceIfBr(org.jsoup.nodes.Element, java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendWhitespaceIfBr(org.jsoup.nodes.Element,java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum)
 *  */
    @Test
    public void testAppendWhitespaceIfBr_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.appendWhitespaceIfBr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = ((Object) null);
        appendWhitespaceIfBrMethodArguments[1] = ((Object) null);
        try {
            appendWhitespaceIfBrMethod.invoke(null, appendWhitespaceIfBrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendWhitespaceIfBr(org.jsoup.nodes.Element,java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum)
 *  */
    @Test
    public void testAppendWhitespaceIfBr_ThrowNullPointerException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendWhitespaceIfBr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = document;
        appendWhitespaceIfBrMethodArguments[1] = ((Object) null);
        try {
            appendWhitespaceIfBrMethod.invoke(null, appendWhitespaceIfBrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendWhitespaceIfBr(org.jsoup.nodes.Element,java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum)
 *  */
    @Test
    public void testAppendWhitespaceIfBr_ThrowNullPointerException_2() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendWhitespaceIfBr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = document;
        appendWhitespaceIfBrMethodArguments[1] = ((Object) null);
        try {
            appendWhitespaceIfBrMethod.invoke(null, appendWhitespaceIfBrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        String string = "";
        
        element.getElementsByAttributeValueNot(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueNot(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueNot_ThrowIllegalArgumentException_2() throws Exception  {
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
        String string = "\u0001\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueNot] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:73)
            org.jsoup.select.Evaluator$AttributeWithValueNot.matches(Evaluator.java:170)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueNot(Element.java:607) */
        element.getElementsByAttributeValueNot(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeStarting
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeStarting(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeStarting(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(keyPrefix);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.getElementsByAttributeStarting(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeStarting(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(keyPrefix);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.getElementsByAttributeStarting(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeStarting(java.lang.String)
    
    @Test
    public void testGetElementsByAttributeStarting1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeStarting] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$AttributeStarting.matches(Evaluator.java:125)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeStarting(Element.java:585) */
        element.getElementsByAttributeStarting(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexEquals(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexEquals_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:487)
            org.jsoup.select.Evaluator$IndexEquals.matches(Evaluator.java:346)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:694) */
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
    public void testGetElementsByIndexEquals3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:488)
            org.jsoup.select.Evaluator$IndexEquals.matches(Evaluator.java:346)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:694) */
        element.getElementsByIndexEquals(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendNormalisedText
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !preserveWhitespace()
 *  */
    @Test
    public void testAppendNormalisedText_ThrowClassCastException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:842) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = textNode.getWholeText();
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:840) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = ((Object) null);
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(text);
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:847) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    @Test
    public void testAppendNormalisedText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "";
        textNode.text = text;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    @Test
    public void testAppendNormalisedText5() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        textNode.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:856)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:842) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText6() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:847) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText7() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.TextNode.lastCharIsWhitespace(TextNode.java:129)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:844) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText8() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.normaliseWhitespace(StringUtil.java:107)
            org.jsoup.nodes.TextNode.normaliseWhitespace(TextNode.java:120)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:843) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(element, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:462) */
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
            org.jsoup.nodes.Element.previousElementSibling(Element.java:462) */
        element.previousElementSibling();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method previousElementSibling()
    
    @Test
    public void testPreviousElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:462) */
        element.previousElementSibling();
    }
    
    @Test
    public void testPreviousElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:462) */
        element.previousElementSibling();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousElementSibling()
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
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
        String string = "{";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$Attribute.matches(Evaluator.java:103)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttribute(Element.java:572) */
        element.getElementsByAttribute(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.firstElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(0) : null;}
 *  */
    @Test
    public void testFirstElementSibling_ListSize() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
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
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:477) */
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
            org.jsoup.nodes.Element.firstElementSibling(Element.java:477) */
        element.firstElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testFirstElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:477) */
        element.firstElementSibling();
    }
    
    @Test
    public void testFirstElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:477) */
        element.firstElementSibling();
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
        String string = "";
        
        element.getElementsByAttributeValue(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValue(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValue_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValue(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValue(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValue1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000";
        String string1 = "";
        
        element.getElementsByAttributeValue(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValue(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValue2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValue.matches(Evaluator.java:150)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValue(Element.java:596) */
        element.getElementsByAttributeValue(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingText(java.lang.String)
    
    @Test
    public void testGetElementsContainingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000[";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$ContainsText.matches(Evaluator.java:381)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsContainingText(Element.java:705) */
        element.getElementsContainingText(string);
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
        String string = "";
        
        element.getElementsByAttributeValueEnding(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueEnding(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueEnding_ThrowIllegalArgumentException_2() throws Exception  {
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
        String string = "\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueEnding] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValueEnding.matches(Evaluator.java:210)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueEnding(Element.java:629) */
        element.getElementsByAttributeValueEnding(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:487)
            org.jsoup.select.Evaluator$IndexGreaterThan.matches(Evaluator.java:326)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:685) */
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
    public void testGetElementsByIndexGreaterThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:488)
            org.jsoup.select.Evaluator$IndexGreaterThan.matches(Evaluator.java:326)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:685) */
        element.getElementsByIndexGreaterThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexLessThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexLessThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3653ca29)]
            org.jsoup.nodes.Element.parent(Element.java:142)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:487)
            org.jsoup.select.Evaluator$IndexLessThan.matches(Evaluator.java:306)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:676) */
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:188)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:488)
            org.jsoup.select.Evaluator$IndexLessThan.matches(Evaluator.java:306)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:676) */
        element.getElementsByIndexLessThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingText(java.lang.String)
    
    @Test
    public void testGetElementsMatchingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD820\uDC00";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:726)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:742) */
        element.getElementsMatchingText(string);
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingText
    
    public void testGetElementsMatchingText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingText
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsMatchingText(java.util.regex.Pattern)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsMatchingText(java.util.regex.Pattern)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetElementsMatchingText_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:726) */
        element.getElementsMatchingText(((Pattern) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsMatchingText(java.util.regex.Pattern)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetElementsMatchingText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:851)
            org.jsoup.nodes.Element.text(Element.java:796)
            org.jsoup.nodes.Element.text(Element.java:791)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:726) */
        element.getElementsMatchingText(((Pattern) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingText(java.util.regex.Pattern)
    
    @Test
    public void testGetElementsMatchingText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:423)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:726) */
        element.getElementsMatchingText(((Pattern) null));
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingText
    
    public void testGetElementsMatchingText_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueMatching
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueMatching(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueMatching1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uE000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$AttributeWithValueMatching.<init>(Evaluator.java:248)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:650)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:667) */
        element.getElementsByAttributeValueMatching(((String) null), string);
    }
    ///endregion
    
    ///region Errors report for getElementsByAttributeValueMatching
    
    public void testGetElementsByAttributeValueMatching_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueMatching
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueMatching(java.lang.String, java.util.regex.Pattern)
    
    @Test
    public void testGetElementsByAttributeValueMatching2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!\u0000!\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValueMatching.matches(Evaluator.java:254)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:650) */
        element.getElementsByAttributeValueMatching(string, ((Pattern) null));
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
        String string = "";
        
        element.getElementsByAttributeValueStarting(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueStarting(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueStarting_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = " ";
        
        element.getElementsByAttributeValueStarting(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeValueStarting(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueStarting1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000";
        String string1 = "";
        
        element.getElementsByAttributeValueStarting(string, string1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueStarting(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueStarting2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "@!";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueStarting] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValueStarting.matches(Evaluator.java:190)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueStarting(Element.java:618) */
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
        String string = "";
        
        element.getElementsByAttributeValueContaining(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByAttributeValueContaining(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueContaining_ThrowIllegalArgumentException_2() throws Exception  {
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
        String string = "\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueContaining] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:112)
            org.jsoup.select.Evaluator$AttributeWithValueContaining.matches(Evaluator.java:230)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:30)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueContaining(Element.java:640) */
        element.getElementsByAttributeValueContaining(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendChild_ElementAddChildren() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Node initialDocumentParentNode = document.parentNode;
        
        Element actual = element.appendChild(document);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalDocumentParentNode = document.parentNode;
        int finalDocumentSiblingIndex = document.siblingIndex;
        
        assertFalse(initialDocumentParentNode == finalDocumentParentNode);
        
        assertEquals(3, finalDocumentSiblingIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(child);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendChild_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendChild(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: addChildren(child);
 *  */
    @Test
    public void testAppendChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:402)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:410)
            org.jsoup.nodes.Element.appendChild(Element.java:267) */
        element.appendChild(document);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendChild(org.jsoup.nodes.Node)
    
    @Test
    public void testAppendChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        documentType.setParentNode(parentNode);
        
        Node initialDocumentTypeParentNode = documentType.parentNode;
        
        Element actual = element.appendChild(documentType);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalDocumentTypeParentNode = documentType.parentNode;
        
        assertFalse(initialDocumentTypeParentNode == finalDocumentTypeParentNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendChild(org.jsoup.nodes.Node)
    
    @Test
    public void testAppendChild2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(document1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:411)
            org.jsoup.nodes.Element.appendChild(Element.java:267) */
        element.appendChild(document);
    }
    
    @Test
    public void testAppendChild3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:434)
            org.jsoup.nodes.Node.removeChild(Node.java:403)
            org.jsoup.nodes.Node.reparentChild(Node.java:428)
            org.jsoup.nodes.Node.addChildren(Node.java:410)
            org.jsoup.nodes.Element.appendChild(Element.java:267) */
        element.appendChild(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.tagName
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tagName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#tagName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName, "Tag name must not be empty.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTagName_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.tagName(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#tagName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName, "Tag name must not be empty.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTagName_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.tagName(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tagName(java.lang.String)
    
    @Test
    public void testTagName1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!";
        
        Element actual = element.tagName(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tagName(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001\u0000";
        
        element.tagName(string);
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
            org.jsoup.nodes.Element.tagName(Element.java:67) */
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
        element.attributes = attributes;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableList(Collections.java:1319)
            org.jsoup.nodes.Node.childNodes(Node.java:213)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementById(Element.java:538) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields995608433417700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields995608433417700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass995608433423500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995608433417700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995608433423500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

