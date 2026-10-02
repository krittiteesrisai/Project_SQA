package org.jsoup.nodes;

import org.junit.Test;
import java.util.ArrayList;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Tag;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
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

public final class org_jsoup_nodes_NodeTest {
    ///region Test suites for executable org.jsoup.nodes.Node.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 *  */
    @Test
    public void testRemove_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document2);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        document.remove();
        
        Node finalDocumentParentNode = document.parentNode;
        
        assertNull(finalDocumentParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 *  */
    @Test
    public void testRemove() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        
        textNode.remove();
        
        Node finalTextNodeParentNode = textNode.parentNode;
        
        assertNull(finalTextNodeParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.remove();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.removeChild(this);
 *  */
    @Test
    public void testRemove_ThrowIndexOutOfBoundsException() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.remove(Node.java:228) */
        textNode.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentNode.removeChild(this);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        
        /* This test fails because method [org.jsoup.nodes.Node.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.remove(Node.java:228) */
        textNode.remove();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.parent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parent()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#parent()}
 * @utbot.returnsFrom {@code return parentNode;}
 *  */
    @Test
    public void testParent_ReturnParentNode() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Node actual = document.parent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        boolean actual = xmlDeclaration.equals(xmlDeclaration);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotO() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        boolean actual = document.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#outerHtml()}
 * @utbot.returnsFrom {@code return outerHtml();}
 *  */
    @Test
    public void testToString_NodeOuterHtml() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = document.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document1, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document1, "org.jsoup.nodes.Element", "tag", tag);
        Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        document1.setParentNode(parentNode);
        childNodes.add(document1);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.toString] produces [java.lang.ClassCastException: class org.jsoup.nodes.Comment cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.Comment and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)] */
        document.toString();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(parentNode1, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
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
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.toString] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)] */
        document.toString();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return outerHtml();
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.toString] produces [java.lang.NullPointerException] */
        document.toString();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return outerHtml();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
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
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.toString] produces [java.lang.NullPointerException] */
        document.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        int actual = document.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        
        int actual = document.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        
        int actual = document.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (parentNode != null): True}
 * @utbot.triggersRecursion hashCode, where the test return from: {@code return result;}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ParentNodeNotEqualsNull() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        dataNode.setParentNode(parentNode);
        
        int actual = dataNode.hashCode();
        
        assertEquals(923552, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (parentNode != null): True}
 * @utbot.triggersRecursion hashCode, where the test return from: {@code return result;}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ParentNodeNotEqualsNull_1() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        dataNode.setParentNode(parentNode);
        
        int actual = dataNode.hashCode();
        
        assertEquals(29582463, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (parentNode != null): True}
 * @utbot.triggersRecursion hashCode, where the test return from: {@code return result;}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ParentNodeNotEqualsNull_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        
        int actual = document.hashCode();
        
        assertEquals(887503681, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (parentNode != null): True}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.triggersRecursion hashCode, where the test execute conditions:
 *     {@code (attributes != null): True}
 * return from: {@code return result;}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        parentNode.attributes = attributes;
        document.setParentNode(parentNode);
        
        int actual = document.hashCode();
        
        assertEquals(916163584, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        
        int actual = document.hashCode();
        
        assertEquals(-1796951359, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        dataNode.attributes = attributes;
        
        int actual = dataNode.hashCode();
        
        assertEquals(-1807454463, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        textNode.attributes = attributes;
        
        int actual = textNode.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        parentNode.attributes = attributes;
        textNode.parentNode = parentNode;
        
        int actual = textNode.hashCode();
        
        assertEquals(29552703, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        parentNode1.attributes = attributes;
        parentNode.setParentNode(parentNode1);
        textNode.parentNode = parentNode;
        
        int actual = textNode.hashCode();
        
        assertEquals(924482, actual);
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        parentNode.attributes = attributes;
        textNode.parentNode = parentNode;
        
        int actual = textNode.hashCode();
        
        assertEquals(28659934, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.indent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testIndent_1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        java.lang.String[] prevPadding = ((java.lang.String[]) getStaticFieldValue(stringUtilClazz, "padding"));
        try {
            java.lang.String[] padding = new java.lang.String[11];
            String string = "";
            padding[0] = string;
            String string1 = " ";
            padding[1] = string1;
            String string2 = "  ";
            padding[2] = string2;
            String string3 = "   ";
            padding[3] = string3;
            String string4 = "    ";
            padding[4] = string4;
            String string5 = "     ";
            padding[5] = string5;
            String string6 = "      ";
            padding[6] = string6;
            String string7 = "       ";
            padding[7] = string7;
            String string8 = "        ";
            padding[8] = string8;
            String string9 = "         ";
            padding[9] = string9;
            String string10 = "          ";
            padding[10] = string10;
            setStaticField(stringUtilClazz, "padding", padding);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            StringBuilder stringBuilder = new StringBuilder("                      ");
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 1);
            
            element.indent(stringBuilder, 11, outputSettings);
        } finally {
            setStaticField(org.jsoup.helper.StringUtil.class, "padding", prevPadding);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testIndent() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.helper.StringUtil");
        java.lang.String[] prevPadding = ((java.lang.String[]) getStaticFieldValue(stringUtilClazz, "padding"));
        try {
            java.lang.String[] padding = new java.lang.String[11];
            String string = "";
            padding[0] = string;
            String string1 = " ";
            padding[1] = string1;
            String string2 = "  ";
            padding[2] = string2;
            String string3 = "   ";
            padding[3] = string3;
            String string4 = "    ";
            padding[4] = string4;
            String string5 = "     ";
            padding[5] = string5;
            String string6 = "      ";
            padding[6] = string6;
            String string7 = "       ";
            padding[7] = string7;
            String string8 = "        ";
            padding[8] = string8;
            String string9 = "         ";
            padding[9] = string9;
            String string10 = "          ";
            padding[10] = string10;
            setStaticField(stringUtilClazz, "padding", padding);
            TextNode textNode = new TextNode(null, null);
            StringBuilder stringBuilder = new StringBuilder(" ");
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            
            textNode.indent(stringBuilder, 5, outputSettings);
        } finally {
            setStaticField(org.jsoup.helper.StringUtil.class, "padding", prevPadding);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("\n").append(StringUtil.padding(depth * out.indentAmount()));
 *  */
    @Test
    public void testIndent_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.indent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.indent(Node.java:381) */
        document.indent(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("\n").append(StringUtil.padding(depth * out.indentAmount()));
 *  */
    @Test
    public void testIndent_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Node.indent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.indent(Node.java:381) */
        document.indent(stringBuilder, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indent(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#indentAmount()}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#padding(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: accum.append("\n").append(StringUtil.padding(depth * out.indentAmount()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndent_ThrowIllegalArgumentException() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", -1);
        
        textNode.indent(stringBuilder, 1, outputSettings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.attr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.attr(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String)
    
    @Test
    public void testAttr1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        comment.attributes = attributes;
        String string = "K";
        
        String actual = comment.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAttr2() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        xmlDeclaration.attributes = attributes;
        
        String actual = xmlDeclaration.attr(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAttr3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        element.attr(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String)
    
    @Test
    public void testAttr4() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = "\u0000[\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Node.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:70)
            org.jsoup.nodes.Node.hasAttr(Node.java:105)
            org.jsoup.nodes.Node.attr(Node.java:72) */
        document.attr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.attr
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:94) */
        document.attr(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        
        document.attr(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = "";
        
        document.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = " ";
        
        document.attr(string, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr5() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        comment.attributes = attributes;
        String string = "Z";
        
        Comment actual = ((Comment) comment.attr(string, string));
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes commentAttributes = comment.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(commentAttributes, actualAttributes));
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int commentSiblingIndex = comment.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(commentSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testAttr6() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        String string = "[";
        
        Document actual = ((Document) document.attr(string, string));
        
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        assertNull(actualOutputSettings);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes documentAttributes = document.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(documentAttributes, actualAttributes));
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int documentSiblingIndex = document.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(documentSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr7() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = "!A\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Node.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.put(Attributes.java:52)
            org.jsoup.nodes.Attributes.put(Attributes.java:43)
            org.jsoup.nodes.Node.attr(Node.java:94) */
        document.attr(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.replaceWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceWith(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testReplaceWith_NodeReplaceChild() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Node initialDocument1ParentNode = document1.parentNode;
        
        document.replaceWith(document1);
        
        Node finalDocumentParentNode = document.parentNode;
        
        Node finalDocument1ParentNode = document1.parentNode;
        
        assertNull(finalDocumentParentNode);
        
        assertFalse(initialDocument1ParentNode == finalDocument1ParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceWith(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.replaceWith(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.replaceWith(document);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceWith(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.replaceChild(this, in);
 *  */
    @Test
    public void testReplaceWith_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.jsoup.nodes.Node.replaceChild(Node.java:254)
            org.jsoup.nodes.Node.replaceWith(Node.java:238) */
        document.replaceWith(element);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.replaceChild(this, in);
 *  */
    @Test
    public void testReplaceWith_ThrowIndexOutOfBoundsException_2() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -1;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.jsoup.nodes.Node.replaceChild(Node.java:254)
            org.jsoup.nodes.Node.replaceWith(Node.java:238) */
        textNode.replaceWith(document);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReplaceWith_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(parentNode);
        document1.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.replaceChild(Node.java:251)
            org.jsoup.nodes.Node.replaceWith(Node.java:238) */
        document.replaceWith(document1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testReplaceWith_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(null);
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element1.setParentNode(parentNode1);
        element1.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.replaceChild(Node.java:251)
            org.jsoup.nodes.Node.replaceWith(Node.java:238) */
        element.replaceWith(element1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.baseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method baseUri()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#baseUri()}
 * @utbot.returnsFrom {@code return baseUri;}
 *  */
    @Test
    public void testBaseUri_ReturnBaseUri() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        String actual = document.baseUri();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.attributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attributes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attributes()}
 * @utbot.returnsFrom {@code return attributes;}
 *  */
    @Test
    public void testAttributes_ReturnAttributes() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Attributes actual = document.attributes();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.removeChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testRemoveChild() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(document);
        
        document.removeChild(document1);
        
        Node finalDocument1ParentNode = document1.parentNode;
        
        assertNull(finalDocument1ParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testRemoveChild_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document2);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document3 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document3.setParentNode(document);
        
        document.removeChild(document3);
        
        Node finalDocument3ParentNode = document3.parentNode;
        
        assertNull(finalDocument3ParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: childNodes.remove(index);
 *  */
    @Test
    public void testRemoveChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(document);
        document1.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263) */
        document.removeChild(document1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test
    public void testRemoveChild_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:261) */
        document.removeChild(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.invokes {@link java.util.List#remove(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.remove(index);
 *  */
    @Test
    public void testRemoveChild_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        textNode.parentNode = document;
        textNode.siblingIndex = -255;
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:263) */
        document.removeChild(textNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.invokes org.jsoup.nodes.Node#reindexChildren()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren();
 *  */
    @Test
    public void testRemoveChild_ThrowNullPointerException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(document);
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264) */
        document.removeChild(document1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChild_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.removeChild(document1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.previousSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (index > 0): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testPreviousSibling_IndexLessOrEqualZero() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        
        Node actual = document.previousSibling();
        
        assertNull(actual);
        
        List finalDocumentParentNodeChildNodes = document.parentNode.childNodes;
        
        assertNull(finalDocumentParentNodeChildNodes);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return siblings.get(index - 1);}
 *  */
    @Test
    public void testPreviousSibling_IndexGreaterThanZero() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = 1;
        
        Node actual = document.previousSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return siblings.get(index - 1);
 *  */
    @Test
    public void testPreviousSibling_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.previousSibling] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.previousSibling(Node.java:333) */
        document.previousSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Node> siblings = parentNode.childNodes;
 *  */
    @Test
    public void testPreviousSibling_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.previousSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.previousSibling(Node.java:329) */
        document.previousSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (index > 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return siblings.get(index - 1);
 *  */
    @Test
    public void testPreviousSibling_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        document.setParentNode(parentNode);
        document.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.previousSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.previousSibling(Node.java:333) */
        document.previousSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.nextSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 *  */
    @Test
    public void testNextSibling_ParentNodeEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Node actual = document.nextSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.executesCondition {@code (siblings.size() > index + 1): True}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return siblings.get(index + 1);}
 *  */
    @Test
    public void testNextSibling_SiblingsSizeGreaterThanIndexPlus1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        
        Node actual = document.nextSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.executesCondition {@code (siblings.size() > index + 1): False}
 *  */
    @Test
    public void testNextSibling_SiblingsSizeLessOrEqualIndexPlus1() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -1;
        
        Node actual = textNode.nextSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (siblings.size() > index + 1): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return siblings.get(index + 1);
 *  */
    @Test
    public void testNextSibling_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -2;
        
        /* This test fails because method [org.jsoup.nodes.Node.nextSibling] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.nextSibling(Node.java:319) */
        document.nextSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: siblings.size() > index + 1
 *  */
    @Test
    public void testNextSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        
        /* This test fails because method [org.jsoup.nodes.Node.nextSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.nextSibling(Node.java:318) */
        element.nextSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.replaceChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#siblingIndex()}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setSiblingIndex(int)}
 *  */
    @Test
    public void testReplaceChild_InParentNodeEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        TextNode textNode = new TextNode(null, null);
        textNode.parentNode = document;
        
        document.replaceChild(textNode, document);
        
        Node finalTextNodeParentNode = textNode.parentNode;
        
        assertNull(finalTextNodeParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): False}
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: childNodes.set(index, in);
 *  */
    @Test
    public void testReplaceChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(document);
        TextNode textNode = new TextNode(null, null);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.jsoup.nodes.Node.replaceChild(Node.java:254) */
        document.replaceChild(element, textNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: in.parentNode.removeChild(in);
 *  */
    @Test
    public void testReplaceChild_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        textNode.parentNode = document;
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document1.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.replaceChild(Node.java:251) */
        document.replaceChild(textNode, document1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:248) */
        document.replaceChild(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.set(index, in);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(document);
        document1.siblingIndex = -255;
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:254) */
        document.replaceChild(document1, document2);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.parentNode.removeChild(in);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException_3() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        textNode.parentNode = document;
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(document1);
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document2);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document1.setParentNode(parentNode);
        document1.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.replaceChild(Node.java:251) */
        document.replaceChild(textNode, document1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.set(index, in);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        textNode.parentNode = document;
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document1.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:254) */
        document.replaceChild(textNode, document1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        document1.setParentNode(document);
        
        document.replaceChild(document1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.replaceChild(document1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.ownerDocument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ownerDocument()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#ownerDocument()}
 * @utbot.executesCondition {@code (this instanceof Document): False}
 * @utbot.executesCondition {@code (parentNode == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testOwnerDocument_ReturnNull() {
        TextNode textNode = new TextNode(null, null);
        
        Document actual = textNode.ownerDocument();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#ownerDocument()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Node#ownerDocument()}
 * @utbot.triggersRecursion ownerDocument, where the test execute conditions:
 *     {@code (parentNode == null): True}
 * return from: {@code return null;}
 * @utbot.returnsFrom {@code return parentNode.ownerDocument();}
 *  */
    @Test
    public void testOwnerDocument_ParentNodeNotEqualsNull() {
        TextNode textNode = new TextNode(null, null);
        TextNode parentNode = new TextNode(null, null);
        textNode.parentNode = parentNode;
        
        Document actual = textNode.ownerDocument();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#ownerDocument()}
 * @utbot.executesCondition {@code (this instanceof Document): True}
 * @utbot.returnsFrom {@code return (Document) this;}
 *  */
    @Test
    public void testOwnerDocument_ThisInstanceOfDocument() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Document actual = document.ownerDocument();
        
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        assertNull(actualOutputSettings);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int documentSiblingIndex = document.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(documentSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNode(int)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNode(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return childNodes.get(index);}
 *  */
    @Test
    public void testChildNode_ListGet() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Node actual = document.childNode(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method childNode(int)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNode(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return childNodes.get(index);
 *  */
    @Test
    public void testChildNode_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.childNode(Node.java:186) */
        document.childNode(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNode(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return childNodes.get(index);
 *  */
    @Test
    public void testChildNode_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.childNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNode(Node.java:186) */
        document.childNode(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.siblingNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method siblingNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#childNodes()}
 * @utbot.returnsFrom {@code return parent().childNodes();}
 *  */
    @Test
    public void testSiblingNodes_NodeChildNodes() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        List actual = element.siblingNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method siblingNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return parent().childNodes();
 *  */
    @Test
    public void testSiblingNodes_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.siblingNodes] produces [java.lang.ClassCastException: class org.jsoup.nodes.DataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)]
            org.jsoup.nodes.Element.parent(Element.java:128)
            org.jsoup.nodes.Element.parent(Element.java:23)
            org.jsoup.nodes.Node.siblingNodes(Node.java:304) */
        element.siblingNodes();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent().childNodes();
 *  */
    @Test
    public void testSiblingNodes_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Node.siblingNodes] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.siblingNodes(Node.java:304) */
        element.siblingNodes();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent().childNodes();
 *  */
    @Test
    public void testSiblingNodes_ThrowNullPointerException_1() {
        TextNode textNode = new TextNode(null, null);
        
        /* This test fails because method [org.jsoup.nodes.Node.siblingNodes] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.siblingNodes(Node.java:304) */
        textNode.siblingNodes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.removeAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemoveAttr_AttributesRemove() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        String string = "K";
        
        Document actual = ((Document) document.removeAttr(string));
        
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        assertNull(actualOutputSettings);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes documentAttributes = document.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(documentAttributes, actualAttributes));
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int documentSiblingIndex = document.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(documentSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.remove(attributeKey);
 *  */
    @Test
    public void testRemoveAttr_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeAttr(Node.java:115) */
        document.removeAttr(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.removeAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.remove(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = "";
        
        document.removeAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.absUrl
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.absUrl(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String string = "";
        
        document.absUrl(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method absUrl(java.lang.String)
    
    @Test
    public void testAbsUrl1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "K[";
        
        String actual = element.absUrl(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbsUrl2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "[";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        
        String actual = document.absUrl(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method absUrl(java.lang.String)
    
    @Test
    public void testAbsUrl3() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        String string = "KKK";
        
        /* This test fails because method [org.jsoup.nodes.Node.absUrl] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:70)
            org.jsoup.nodes.Node.hasAttr(Node.java:105)
            org.jsoup.nodes.Node.attr(Node.java:72)
            org.jsoup.nodes.Node.absUrl(Node.java:159) */
        document.absUrl(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.setParentNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setParentNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (this.parentNode != null): False}
 *  */
    @Test
    public void testSetParentNode_ThisParentNodeEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.setParentNode(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (this.parentNode != null): True}
 *  */
    @Test
    public void testSetParentNode_ThisParentNodeNotEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        document.setParentNode(null);
        
        Node finalDocumentParentNode = document.parentNode;
        
        assertNull(finalDocumentParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (this.parentNode != null): True}
 *  */
    @Test
    public void testSetParentNode_ThisParentNodeNotEqualsNull_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document2);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        document.setParentNode(null);
        
        Node finalDocumentParentNode = document.parentNode;
        
        assertNull(finalDocumentParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setParentNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: this.parentNode.removeChild(this);
 *  */
    @Test
    public void testSetParentNode_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.setParentNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.setParentNode(Node.java:243) */
        document.setParentNode(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.parentNode.removeChild(this);
 *  */
    @Test
    public void testSetParentNode_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.setParentNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.setParentNode(Node.java:243) */
        document.setParentNode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.reindexChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reindexChildren()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < childNodes.size(); i++)} once
 *  */
    @Test
    public void testReindexChildren_IterateForLoop() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren");
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[0];
        reindexChildrenMethod.invoke(element, reindexChildrenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < childNodes.size(); i++)} twice
 *  */
    @Test
    public void testReindexChildren_NodeSetSiblingIndex() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren");
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[0];
        reindexChildrenMethod.invoke(document, reindexChildrenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reindexChildren()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < childNodes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < childNodes.size(); i++)
 *  */
    @Test
    public void testReindexChildren_ThrowNullPointerException() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.reindexChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:294) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren");
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[0];
        try {
            reindexChildrenMethod.invoke(document, reindexChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < childNodes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.get(i).setSiblingIndex(i);
 *  */
    @Test
    public void testReindexChildren_ThrowNullPointerException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.reindexChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren");
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[0];
        try {
            reindexChildrenMethod.invoke(document, reindexChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.siblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method siblingIndex()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingIndex()}
 * @utbot.returnsFrom {@code return siblingIndex;}
 *  */
    @Test
    public void testSiblingIndex_IntegerValueOf() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.siblingIndex = -255;
        
        Integer actual = document.siblingIndex();
        
        Integer expected = -255;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodes()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(childNodes);}
 *  */
    @Test
    public void testChildNodes_CollectionsUnmodifiableList() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = document.childNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.setSiblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSiblingIndex(int)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setSiblingIndex(int)}
 *  */
    @Test
    public void testSetSiblingIndex() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.siblingIndex = -255;
        
        document.setSiblingIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.reparentChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reparentChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): False}
 *  */
    @Test
    public void testReparentChild_ChildParentNodeEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = document;
        reparentChildMethod.invoke(document, reparentChildMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 *  */
    @Test
    public void testReparentChild_ChildParentNodeNotEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        
        Node initialTextNodeParentNode = textNode.parentNode;
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = textNode;
        reparentChildMethod.invoke(document, reparentChildMethodArguments);
        
        Node finalTextNodeParentNode = textNode.parentNode;
        
        assertFalse(initialTextNodeParentNode == finalTextNodeParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 *  */
    @Test
    public void testReparentChild_ChildParentNodeNotEqualsNull_1() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node initialElementParentNode = element.parentNode;
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = element;
        reparentChildMethod.invoke(textNode, reparentChildMethodArguments);
        
        Node finalElementParentNode = element.parentNode;
        
        assertFalse(initialElementParentNode == finalElementParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reparentChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: child.parentNode.removeChild(child);
 *  */
    @Test
    public void testReparentChild_ThrowIndexOutOfBoundsException() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.reparentChild(Node.java:289) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = textNode;
        try {
            reparentChildMethod.invoke(document, reparentChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: child.parentNode != null
 *  */
    @Test
    public void testReparentChild_ThrowNullPointerException() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reparentChild(Node.java:288) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = ((Object) null);
        try {
            reparentChildMethod.invoke(document, reparentChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: child.parentNode.removeChild(child);
 *  */
    @Test
    public void testReparentChild_ThrowNullPointerException_1() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.reparentChild(Node.java:289) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Method reparentChildMethod = nodeClazz.getDeclaredMethod("reparentChild", nodeClazz);
        reparentChildMethod.setAccessible(true);
        java.lang.Object[] reparentChildMethodArguments = new java.lang.Object[1];
        reparentChildMethodArguments[0] = textNode;
        try {
            reparentChildMethod.invoke(document, reparentChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.hasAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes.hasKey(attributeKey);}
 *  */
    @Test
    public void testHasAttr_AttributesHasKey() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "";
        
        boolean actual = element.hasAttr(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes.hasKey(attributeKey);
 *  */
    @Test
    public void testHasAttr_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.hasAttr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:105) */
        document.hasAttr(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.hasAttr(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNodesAsArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodesAsArray()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesAsArray()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#childNodes()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return childNodes.toArray(new Node[childNodes().size()]);}
 *  */
    @Test
    public void testChildNodesAsArray_ListToArray() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        org.jsoup.nodes.Node[] actual = element.childNodesAsArray();
        
        org.jsoup.nodes.Node[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.addChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addChildren([Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 *  */
    @Test
    public void testAddChildren() {
        TextNode textNode = new TextNode(null, null);
        org.jsoup.nodes.Node[] nodeArray = {};
        
        textNode.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 *  */
    @Test
    public void testAddChildren_NodeSetSiblingIndex() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        
        Node initialNodeArray0ParentNode = nodeArray[0].parentNode;
        
        element.addChildren(nodeArray);
        
        Node finalNodeArray0ParentNode = nodeArray[0].parentNode;
        int finalNodeArray0SiblingIndex = nodeArray[0].siblingIndex;
        
        assertFalse(initialNodeArray0ParentNode == finalNodeArray0ParentNode);
        
        assertEquals(3, finalNodeArray0SiblingIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChildren([Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddChildren_ThrowIndexOutOfBoundsException() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        nodeArray[0] = ((Node) document);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.reparentChild(Node.java:289)
            org.jsoup.nodes.Node.addChildren(Node.java:271) */
        textNode.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reparentChild(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = {null};
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reparentChild(Node.java:288)
            org.jsoup.nodes.Node.addChildren(Node.java:271) */
        document.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_3() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        nodeArray[0] = ((Node) element);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.removeChild(Node.java:264)
            org.jsoup.nodes.Node.reparentChild(Node.java:289)
            org.jsoup.nodes.Node.addChildren(Node.java:271) */
        document.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: children)
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:270) */
        document.addChildren(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_4() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document2);
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document1.setParentNode(parentNode);
        nodeArray[0] = ((Node) document1);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:272) */
        document.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_1() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        textNode.childNodes = null;
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:272) */
        textNode.addChildren(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.addChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 *  */
    @Test
    public void testAddChildren1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {};
        
        document.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 *  */
    @Test
    public void testAddChildren_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {};
        
        document.addChildren(-255, nodeArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.noNullElements(children);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildren_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = {null};
        
        document.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.noNullElements(children);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildren_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[2];
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        nodeArray[0] = ((Node) dataNode);
        
        document.addChildren(-255, nodeArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddChildren_ThrowIndexOutOfBoundsException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -1;
        nodeArray[0] = ((Node) textNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:263)
            org.jsoup.nodes.Node.reparentChild(Node.java:289)
            org.jsoup.nodes.Node.addChildren(Node.java:281) */
        element.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(index, in);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document1);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:282) */
        document.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren();
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_21() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        org.jsoup.nodes.Node[] nodeArray = {};
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:294)
            org.jsoup.nodes.Node.addChildren(Node.java:284) */
        document.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(index, in);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_41() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        textNode.childNodes = null;
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(document);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        nodeArray[0] = ((Node) document);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:282) */
        textNode.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren();
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_11() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document1);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.addChildren(Node.java:284) */
        document.addChildren(3, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren();
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_31() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {};
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:295)
            org.jsoup.nodes.Node.addChildren(Node.java:284) */
        document.addChildren(-255, nodeArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    @Test
    public void testAddChildren2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index: 2147483646, Size: 0]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:282) */
        element.addChildren(2147483646, nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.outerHtml
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtml()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#outerHtml()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testOuterHtml_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(parentNode1, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)]
            org.jsoup.nodes.Element.parent(Element.java:128)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:970)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        element.outerHtml();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtml()
    
    @Test
    public void testOuterHtml1() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(XmlDeclaration.java:32)
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:39)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        xmlDeclaration.outerHtml();
    }
    
    @Test
    public void testOuterHtml2() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        comment.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:33)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        comment.outerHtml();
    }
    
    @Test
    public void testOuterHtml3() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        dataNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DataNode.getWholeData(DataNode.java:29)
            org.jsoup.nodes.DataNode.outerHtmlHead(DataNode.java:43)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        dataNode.outerHtml();
    }
    
    @Test
    public void testOuterHtml4() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(XmlDeclaration.java:32)
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:39)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        xmlDeclaration.outerHtml();
    }
    
    @Test
    public void testOuterHtml5() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        comment.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:33)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        comment.outerHtml();
    }
    
    @Test
    public void testOuterHtml6() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        dataNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DataNode.getWholeData(DataNode.java:29)
            org.jsoup.nodes.DataNode.outerHtmlHead(DataNode.java:43)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        dataNode.outerHtml();
    }
    
    @Test
    public void testOuterHtml7() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Element parentNode2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode3 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        comment.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:33)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        comment.outerHtml();
    }
    
    @Test
    public void testOuterHtml8() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(XmlDeclaration.java:32)
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:39)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        xmlDeclaration.outerHtml();
    }
    
    @Test
    public void testOuterHtml9() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        comment.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:33)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        comment.outerHtml();
    }
    
    @Test
    public void testOuterHtml10() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        dataNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DataNode.getWholeData(DataNode.java:29)
            org.jsoup.nodes.DataNode.outerHtmlHead(DataNode.java:43)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        dataNode.outerHtml();
    }
    
    @Test
    public void testOuterHtml11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:970)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        element.outerHtml();
    }
    
    @Test
    public void testOuterHtml12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(parentNode, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        element.setParentNode(parentNode);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:45)
            org.jsoup.nodes.Entities.escape(Entities.java:41)
            org.jsoup.nodes.Attribute.html(Attribute.java:76)
            org.jsoup.nodes.Attributes.html(Attributes.java:129)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:975)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363)
            org.jsoup.nodes.Node.outerHtml(Node.java:358) */
        element.outerHtml();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.outerHtml
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtml(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#outerHtml(java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#outputSettings()}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testOuterHtml_ThrowClassCastException1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @70ef9c14)]
            org.jsoup.nodes.Element.parent(Element.java:128)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:970)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        document.outerHtml(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversor(new OuterHtmlVisitor(accum, ownerDocument().outputSettings())).traverse(this);
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException() {
        TextNode textNode = new TextNode(null, null);
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        textNode.outerHtml(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#outerHtml(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversor(new OuterHtmlVisitor(accum, ownerDocument().outputSettings())).traverse(this);
 *  */
    @Test
    public void testOuterHtml_ThrowNullPointerException_1() {
        TextNode textNode = new TextNode(null, null);
        TextNode parentNode = new TextNode(null, null);
        textNode.parentNode = parentNode;
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        textNode.outerHtml(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtml(java.lang.StringBuilder)
    
    @Test
    public void testOuterHtml13() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:975)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        document.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml14() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:45)
            org.jsoup.nodes.Entities.escape(Entities.java:41)
            org.jsoup.nodes.Attribute.html(Attribute.java:76)
            org.jsoup.nodes.Attributes.html(Attributes.java:129)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:975)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        document.outerHtml(stringBuilder);
    }
    
    @Test
    public void testOuterHtml15() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Entities.escape(Entities.java:45)
            org.jsoup.nodes.Entities.escape(Entities.java:41)
            org.jsoup.nodes.Attribute.html(Attribute.java:76)
            org.jsoup.nodes.Attributes.html(Attributes.java:129)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:975)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:409)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:20)
            org.jsoup.nodes.Node.outerHtml(Node.java:363) */
        document.outerHtml(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.setBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setBaseUri(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 *  */
    @Test
    public void testSetBaseUri_ValidateNotNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String string = "";
        
        document.setBaseUri(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setBaseUri(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        document.setBaseUri(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields993297391579400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields993297391579400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass993297391584700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993297391579400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993297391584700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields993297391901500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields993297391901500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass993297391903000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993297391901500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993297391903000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields993297392499100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields993297392499100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass993297392500200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993297392499100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993297392500200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
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
        
            java.lang.reflect.Method methodForGetDeclaredFields993297396415700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields993297396415700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass993297396418400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields993297396415700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass993297396418400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

