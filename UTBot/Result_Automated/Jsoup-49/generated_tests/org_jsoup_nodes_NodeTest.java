package org.jsoup.nodes;

import org.junit.Test;
import java.util.ArrayList;
import org.jsoup.nodes.Document.OutputSettings;
import java.util.List;
import java.util.LinkedHashMap;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.lang.reflect.Method;
import org.jsoup.nodes.Document.QuirksMode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
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

public final class org_jsoup_nodes_NodeTest {
    ///region Test suites for executable org.jsoup.nodes.Node.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 *  */
    @Test
    public void testRemove() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
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
    public void testRemove_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(formElement);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        formElement.remove();
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        assertNull(finalFormElementParentNode);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.remove();
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.remove] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.remove(Node.java:266) */
        element.remove();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentNode.removeChild(this);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.remove(Node.java:266) */
        element.remove();
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
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        boolean actual = documentType.equals(documentType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        int[] intArray = {};
        
        boolean actual = document.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
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
 * @utbot.returnsFrom {@code return outerHtml();}
 *  */
    @Test
    public void testToString_ReturnOuterHtml() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = document.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#toString()}
 * @utbot.returnsFrom {@code return outerHtml();}
 *  */
    @Test
    public void testToString_ReturnOuterHtml_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
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
 * @utbot.executesCondition {@code (childNodes != null): False}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesEqualsNull() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        int actual = xmlDeclaration.hashCode();
        
        assertEquals(0, actual);
        
        List finalXmlDeclarationChildNodes = xmlDeclaration.childNodes;
        
        assertNull(finalXmlDeclarationChildNodes);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (childNodes != null): True}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.invokes {@link java.util.List#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ChildNodesNotEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = formElement.hashCode();
        
        assertEquals(961, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (childNodes != null): False}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        xmlDeclaration.attributes = attributes;
        
        int actual = xmlDeclaration.hashCode();
        
        assertEquals(0, actual);
        
        List finalXmlDeclarationChildNodes = xmlDeclaration.childNodes;
        
        assertNull(finalXmlDeclarationChildNodes);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hashCode()}
 * @utbot.executesCondition {@code (childNodes != null): False}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        formElement.attributes = attributes;
        
        int actual = formElement.hashCode();
        
        assertEquals(0, actual);
        
        List finalFormElementChildNodes = formElement.childNodes;
        
        assertNull(finalFormElementChildNodes);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(dataNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = dataNode.hashCode();
        
        assertEquals(834286178, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(dataNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = dataNode.hashCode();
        
        assertEquals(-1928102752, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(dataNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = dataNode.hashCode();
        
        assertEquals(-166960833, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(documentType, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = documentType.hashCode();
        
        assertEquals(-66507265, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode5() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        childNodes.add(formElement);
        childNodes.add(documentType);
        childNodes.add(documentType);
        setField(documentType, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        documentType.hashCode();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode6() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        childNodes.add(formElement);
        childNodes.add(documentType);
        childNodes.add(documentType);
        setField(documentType, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        documentType.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#clone()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#doClone(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisClone = doClone(null);
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        /* This test fails because method [org.jsoup.nodes.Node.clone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:653)
            org.jsoup.nodes.Node.clone(Node.java:617) */
        xmlDeclaration.clone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.wrap
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#wrap(java.lang.String)}
 * @utbot.executesCondition {@code (parent() instanceof Element): False}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> wrapChildren = Parser.parseFragment(html, context, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_2() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        String string = "@";
        
        formElement.wrap(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException() {
        TextNode textNode = new TextNode(null, null);
        
        textNode.wrap(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#wrap(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrap_ThrowIllegalArgumentException_1() {
        TextNode textNode = new TextNode(null, null);
        String string = "";
        
        textNode.wrap(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrap(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#wrap(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: parent() instanceof Element
 *  */
    @Test
    public void testWrap_ThrowClassCastException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        formElement.setParentNode(parentNode);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Node.wrap] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @466c94ae)]
            org.jsoup.nodes.Element.parent(Element.java:154)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.wrap(Node.java:336) */
        formElement.wrap(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        documentType.setParentNode(parentNode);
        String string = "\u0000";
        
        documentType.wrap(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap2() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        String string = "\u0000\u0000";
        
        comment.wrap(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrap(java.lang.String)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testWrap3() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        document.setParentNode(parentNode);
        String baseUri = "";
        document.baseUri = baseUri;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        document.wrap(string);
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
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            StringBuilder stringBuilder = new StringBuilder(" ");
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 64);
            
            formElement.indent(stringBuilder, 0, outputSettings);
        } finally {
            setStaticField(org.jsoup.helper.StringUtil.class, "padding", prevPadding);
        }
    }
    
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
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            StringBuilder stringBuilder = new StringBuilder("                 ");
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", -1);
            
            formElement.indent(stringBuilder, -11, outputSettings);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Node.indent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.indent(Node.java:573) */
        element.indent(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("\n").append(StringUtil.padding(depth * out.indentAmount()));
 *  */
    @Test
    public void testIndent_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Node.indent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.indent(Node.java:573) */
        element.indent(stringBuilder, -255, null);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 1);
        
        formElement.indent(stringBuilder, -1, outputSettings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.unwrap
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unwrap()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#unwrap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.size() > 0
 *  */
    @Test
    public void testUnwrap_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.unwrap] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.unwrap(Node.java:376) */
        element.unwrap();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#unwrap()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#childNodesAsArray()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentNode.addChildren(siblingIndex, this.childNodesAsArray());
 *  */
    @Test
    public void testUnwrap_ThrowNullPointerException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            element.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
            element.siblingIndex = -255;
            
            /* This test fails because method [org.jsoup.nodes.Node.unwrap] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:462)
                org.jsoup.nodes.Node.addChildren(Node.java:446)
                org.jsoup.nodes.Node.unwrap(Node.java:377) */
            element.unwrap();
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrap()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#unwrap()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.unwrap();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#unwrap()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parentNode.addChildren(siblingIndex, this.childNodesAsArray());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_ThrowIllegalArgumentException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        document.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        document.unwrap();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#unwrap()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parentNode.addChildren(siblingIndex, this.childNodesAsArray());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_ThrowIllegalArgumentException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        document.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        document.unwrap();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unwrap()
    
    @Test
    public void testUnwrap1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            element.setParentNode(parentNode);
            ArrayList childNodes1 = new ArrayList();
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            xmlDeclaration.setParentNode(xmlDeclaration);
            setField(xmlDeclaration, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            childNodes1.add(xmlDeclaration);
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            XmlDeclaration actual = ((XmlDeclaration) element.unwrap());
            
            boolean actualIsProcessingInstruction = ((Boolean) getFieldValue(actual, "org.jsoup.nodes.XmlDeclaration", "isProcessingInstruction"));
            assertFalse(actualIsProcessingInstruction);
            
            Node xmlDeclarationParentNode = xmlDeclaration.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(xmlDeclarationParentNode, actualParentNode);
            
            List xmlDeclarationChildNodes = xmlDeclaration.childNodes;
            List actualChildNodes = actual.childNodes;
            assertTrue(deepEquals(xmlDeclarationChildNodes, actualChildNodes));
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int xmlDeclarationSiblingIndex = xmlDeclaration.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(xmlDeclarationSiblingIndex, actualSiblingIndex);
            
            Node finalElementParentNode = element.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalElementParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            ArrayList childNodes = new ArrayList();
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            childNodes.add(xmlDeclaration);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            comment.setParentNode(parentNode);
            setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            XmlDeclaration actual = ((XmlDeclaration) comment.unwrap());
            
            boolean actualIsProcessingInstruction = ((Boolean) getFieldValue(actual, "org.jsoup.nodes.XmlDeclaration", "isProcessingInstruction"));
            assertFalse(actualIsProcessingInstruction);
            
            Node xmlDeclarationParentNode = xmlDeclaration.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(xmlDeclarationParentNode, actualParentNode);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int xmlDeclarationSiblingIndex = xmlDeclaration.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(xmlDeclarationSiblingIndex, actualSiblingIndex);
            
            Node finalCommentParentNode = comment.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalCommentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap3() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            comment.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
            element.setParentNode(parentNode1);
            childNodes.add(element);
            setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Element actual = ((Element) comment.unwrap());
            
            // org.jsoup.nodes.Element has overridden equals method
            assertEquals(element, actual);
            
            Node finalCommentParentNode = comment.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalCommentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap4() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            document.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes.add(element);
            childNodes.add(element);
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Element actual = ((Element) document.unwrap());
            
            // org.jsoup.nodes.Element has overridden equals method
            assertEquals(element, actual);
            
            Node finalDocumentParentNode = document.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalDocumentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap5() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            comment.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes.add(element);
            setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Element actual = ((Element) comment.unwrap());
            
            // org.jsoup.nodes.Element has overridden equals method
            assertEquals(element, actual);
            
            Node finalCommentParentNode = comment.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalCommentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap6() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            element.setParentNode(parentNode);
            ArrayList childNodes1 = new ArrayList();
            DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            childNodes1.add(documentType);
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes1.add(element1);
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            DocumentType actual = ((DocumentType) element.unwrap());
            
            Node documentTypeParentNode = documentType.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(documentTypeParentNode, actualParentNode);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int documentTypeSiblingIndex = documentType.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(documentTypeSiblingIndex, actualSiblingIndex);
            
            Node finalElementParentNode = element.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalElementParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap7() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
            comment.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes.add(element);
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes.add(element1);
            childNodes.add(element1);
            setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Element actual = ((Element) comment.unwrap());
            
            // org.jsoup.nodes.Element has overridden equals method
            assertEquals(element, actual);
            
            Node finalCommentParentNode = comment.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalCommentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap8() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            element.setParentNode(parentNode);
            ArrayList childNodes1 = new ArrayList();
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            childNodes1.add(comment);
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes1.add(element1);
            Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
            childNodes1.add(element2);
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Comment actual = ((Comment) element.unwrap());
            
            Node commentParentNode = comment.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(commentParentNode, actualParentNode);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int commentSiblingIndex = comment.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(commentSiblingIndex, actualSiblingIndex);
            
            Node finalElementParentNode = element.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalElementParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unwrap()
    
    @Test
    public void testUnwrap9() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
            document.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            /* This test fails because method [org.jsoup.nodes.Node.unwrap] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:423)
                org.jsoup.nodes.Node.remove(Node.java:266)
                org.jsoup.nodes.Node.unwrap(Node.java:378) */
            document.unwrap();
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap10() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            ArrayList childNodes = new ArrayList();
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            childNodes.add(xmlDeclaration);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            comment.setParentNode(parentNode);
            setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
            comment.siblingIndex = Integer.MIN_VALUE;
            
            /* This test fails because method [org.jsoup.nodes.Node.unwrap] produces [java.lang.IndexOutOfBoundsException: Index: -2147483648, Size: 1]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444)
                org.jsoup.nodes.Node.unwrap(Node.java:377) */
            comment.unwrap();
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testUnwrap11() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            xmlDeclaration.setParentNode(parentNode);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes1 = new ArrayList();
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            element.setParentNode(parentNode1);
            childNodes.add(element);
            childNodes.add(element);
            setField(xmlDeclaration, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            /* This test fails because method [org.jsoup.nodes.Node.unwrap] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:423)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443)
                org.jsoup.nodes.Node.unwrap(Node.java:377) */
            xmlDeclaration.unwrap();
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrap()
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        childNodes.add(null);
        childNodes.add(element);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.unwrap();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap13() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        comment.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element);
        childNodes.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(comment, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        comment.unwrap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.attr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String)}
 * @utbot.executesCondition {@code (attributes.hasKey(attributeKey)): False}
 * @utbot.executesCondition {@code (attributeKey.toLowerCase().startsWith("abs:")): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testAttr_NotAttributeKeyToLowerCaseStartsWith() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        String actual = element.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attributes.hasKey(attributeKey)
 *  */
    @Test
    public void testAttr_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:78) */
        element.attr(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.attr(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String)
    
    @Test
    public void testAttr1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        String string = "[\u0000";
        
        String actual = document.attr(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAttr2() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        formElement.attributes = attributes;
        
        formElement.attr(string);
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
    public void testAttr_ThrowNullPointerException1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Node.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:100) */
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
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        xmlDeclaration.attributes = attributes;
        
        xmlDeclaration.attr(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_1() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        xmlDeclaration.attributes = attributes;
        String string = "";
        
        xmlDeclaration.attr(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_2() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        xmlDeclaration.attributes = attributes;
        String string = " ";
        
        xmlDeclaration.attr(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.before
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testBefore_NodeAddChildren() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            formElement.setParentNode(parentNode);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            Node initialDocumentParentNode = document.parentNode;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            FormElement actual = ((FormElement) formElement.before(document));
            
            Elements actualElements = ((Elements) getFieldValue(actual, "org.jsoup.nodes.FormElement", "elements"));
            assertNull(actualElements);
            
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            assertNull(actualTag);
            
            Node formElementParentNode = formElement.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(formElementParentNode, actualParentNode);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int formElementSiblingIndex = formElement.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(formElementSiblingIndex, actualSiblingIndex);
            
            Node finalDocumentParentNode = document.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialDocumentParentNode == finalDocumentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_1() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        textNode.before(element);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException() {
        TextNode textNode = new TextNode(null, null);
        
        textNode.before(((Node) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex, node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            formElement.setParentNode(parentNode);
            formElement.siblingIndex = -1;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            /* This test fails because method [org.jsoup.nodes.Node.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 0]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444)
                org.jsoup.nodes.Node.before(Node.java:290) */
            formElement.before(document);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex, node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            document.setParentNode(parentNode);
            document.siblingIndex = -1;
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
            formElement.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Node.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 0]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444)
                org.jsoup.nodes.Node.before(Node.java:290) */
            document.before(formElement);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex, node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            TextNode textNode = new TextNode(null, null);
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            textNode.parentNode = parentNode;
            textNode.siblingIndex = -255;
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes1 = new ArrayList();
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            element.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Node.before] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:423)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443)
                org.jsoup.nodes.Node.before(Node.java:290) */
            textNode.before(element);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentNode.addChildren(siblingIndex, node);
 *  */
    @Test
    public void testBefore_ThrowNullPointerException() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            TextNode textNode = new TextNode(null, null);
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            textNode.parentNode = parentNode;
            textNode.siblingIndex = -255;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
            document.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Node.before] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:463)
                org.jsoup.nodes.Node.removeChild(Node.java:424)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443)
                org.jsoup.nodes.Node.before(Node.java:290) */
            textNode.before(document);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.before
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        document.setParentNode(parentNode);
        document.siblingIndex = 1;
        String string = "";
        
        document.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException1() {
        TextNode textNode = new TextNode(null, null);
        textNode.siblingIndex = -255;
        
        textNode.before(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_11() {
        TextNode textNode = new TextNode(null, null);
        textNode.siblingIndex = -255;
        String string = "";
        
        textNode.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_3() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -255;
        String string = "";
        
        textNode.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_4() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        textNode.parentNode = parentNode;
        textNode.siblingIndex = -254;
        String string = "";
        
        textNode.before(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#before(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testBefore_ThrowClassCastException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.before] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @466c94ae)]
            org.jsoup.nodes.Element.parent(Element.java:154)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:323)
            org.jsoup.nodes.Node.before(Node.java:276) */
        formElement.before(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.after
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex + 1, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_2() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = 1;
        String string = "";
        
        formElement.after(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex + 1, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException() {
        TextNode textNode = new TextNode(null, null);
        textNode.siblingIndex = -255;
        
        textNode.after(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex + 1, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_1() {
        TextNode textNode = new TextNode(null, null);
        textNode.siblingIndex = -255;
        String string = "";
        
        textNode.after(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addSiblingHtml(siblingIndex + 1, html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_3() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        textNode.parentNode = parentNode;
        textNode.siblingIndex = 1;
        String string = "";
        
        textNode.after(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testAfter_ThrowClassCastException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.after] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @466c94ae)]
            org.jsoup.nodes.Element.parent(Element.java:154)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:323)
            org.jsoup.nodes.Node.after(Node.java:301) */
        formElement.after(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.after
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAfter_NodeAddChildren() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            formElement.setParentNode(parentNode);
            formElement.siblingIndex = -1;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            Node initialDocumentParentNode = document.parentNode;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            FormElement actual = ((FormElement) formElement.after(document));
            
            Elements actualElements = ((Elements) getFieldValue(actual, "org.jsoup.nodes.FormElement", "elements"));
            assertNull(actualElements);
            
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            assertNull(actualTag);
            
            Node formElementParentNode = formElement.parentNode;
            Node actualParentNode = actual.parentNode;
            // org.jsoup.nodes.Node has overridden equals method
            assertEquals(formElementParentNode, actualParentNode);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes actualAttributes = actual.attributes;
            assertNull(actualAttributes);
            
            String actualBaseUri = actual.baseUri;
            assertNull(actualBaseUri);
            
            int formElementSiblingIndex = formElement.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(formElementSiblingIndex, actualSiblingIndex);
            
            Node finalDocumentParentNode = document.parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialDocumentParentNode == finalDocumentParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_11() throws Exception  {
        TextNode textNode = new TextNode(null, null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        textNode.after(element);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException1() {
        TextNode textNode = new TextNode(null, null);
        
        textNode.after(((Node) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex + 1, node);
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            document.setParentNode(parentNode);
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            /* This test fails because method [org.jsoup.nodes.Node.after] produces [java.lang.IndexOutOfBoundsException: Index: 1, Size: 0]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444)
                org.jsoup.nodes.Node.after(Node.java:315) */
            document.after(document1);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex + 1, node);
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            document.setParentNode(parentNode);
            document.siblingIndex = -2;
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
            formElement.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Node.after] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 0]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444)
                org.jsoup.nodes.Node.after(Node.java:315) */
            document.after(formElement);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.addChildren(siblingIndex + 1, node);
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            TextNode textNode = new TextNode(null, null);
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            textNode.parentNode = parentNode;
            textNode.siblingIndex = -255;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes1 = new ArrayList();
            childNodes1.add(null);
            childNodes1.add(null);
            childNodes1.add(null);
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            document.setParentNode(parentNode1);
            document.siblingIndex = -1;
            
            /* This test fails because method [org.jsoup.nodes.Node.after] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:423)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443)
                org.jsoup.nodes.Node.after(Node.java:315) */
            textNode.after(document);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parentNode.addChildren(siblingIndex + 1, node);
 *  */
    @Test
    public void testAfter_ThrowNullPointerException() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            formElement.setParentNode(parentNode);
            formElement.siblingIndex = -255;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
            document.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Node.after] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:463)
                org.jsoup.nodes.Node.removeChild(Node.java:424)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443)
                org.jsoup.nodes.Node.after(Node.java:315) */
            formElement.after(document);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.replaceWith
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceWith(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testReplaceWith() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Node initialElementParentNode = element.parentNode;
        
        document.replaceWith(element);
        
        Node finalDocumentParentNode = document.parentNode;
        
        Node finalElementParentNode = element.parentNode;
        
        assertNull(finalDocumentParentNode);
        
        assertFalse(initialElementParentNode == finalElementParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testReplaceWith_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode1);
        document.siblingIndex = 2;
        
        Node initialDocumentParentNode = document.parentNode;
        
        formElement.replaceWith(document);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        Node finalDocumentParentNode = document.parentNode;
        int finalDocumentSiblingIndex = document.siblingIndex;
        
        assertNull(finalFormElementParentNode);
        
        assertFalse(initialDocumentParentNode == finalDocumentParentNode);
        
        assertEquals(0, finalDocumentSiblingIndex);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.replaceWith(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.replaceWith(element1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceWith(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReplaceWith_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode1);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.replaceChild(Node.java:411)
            org.jsoup.nodes.Node.replaceWith(Node.java:398) */
        document.replaceWith(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: parentNode.replaceChild(this, in);
 *  */
    @Test
    public void testReplaceWith_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.set(ArrayList.java:441)
            org.jsoup.nodes.Node.replaceChild(Node.java:414)
            org.jsoup.nodes.Node.replaceWith(Node.java:398) */
        document.replaceWith(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceWith(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testReplaceWith_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
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
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement1.setParentNode(parentNode1);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceWith] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.replaceChild(Node.java:411)
            org.jsoup.nodes.Node.replaceWith(Node.java:398) */
        formElement.replaceWith(formElement1);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        String actual = element.baseUri();
        
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Attributes actual = element.attributes();
        
        assertNull(actual);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Node actual = element.childNode(0);
        
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.childNode(Node.java:195) */
        element.childNode(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNode(int)}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return childNodes.get(index);
 *  */
    @Test
    public void testChildNode_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Node.childNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNode(Node.java:195) */
        element.childNode(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.traverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverse(org.jsoup.select.NodeVisitor)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTraverse_Return() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        ArrayList childNodes = new ArrayList();
        setField(documentType, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Object w3CBuilder = createInstance("org.jsoup.helper.W3CDom$W3CBuilder");
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class w3CBuilderType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = nodeClazz.getDeclaredMethod("traverse", w3CBuilderType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = w3CBuilder;
        DocumentType actual = ((DocumentType) traverseMethod.invoke(documentType, traverseMethodArguments));
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List documentTypeChildNodes = documentType.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(documentTypeChildNodes, actualChildNodes));
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int documentTypeSiblingIndex = documentType.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(documentTypeSiblingIndex, actualSiblingIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTraverse_Return_1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(documentType, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Object w3CBuilder = createInstance("org.jsoup.helper.W3CDom$W3CBuilder");
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class w3CBuilderType = Class.forName("org.jsoup.select.NodeVisitor");
        Method traverseMethod = nodeClazz.getDeclaredMethod("traverse", w3CBuilderType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[1];
        traverseMethodArguments[0] = w3CBuilder;
        DocumentType actual = ((DocumentType) traverseMethod.invoke(documentType, traverseMethodArguments));
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List documentTypeChildNodes = documentType.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(documentTypeChildNodes, actualChildNodes));
        
        Attributes actualAttributes = actual.attributes;
        assertNull(actualAttributes);
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int documentTypeSiblingIndex = documentType.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(documentTypeSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverse(org.jsoup.select.NodeVisitor)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(nodeVisitor);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.traverse(null);
    }
    ///endregion
    
    ///region Errors report for traverse
    
    public void testTraverse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.removeAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemoveAttr_Return() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        String string = " ";
        
        FormElement actual = ((FormElement) formElement.removeAttr(string));
        
        Elements actualElements = ((Elements) getFieldValue(actual, "org.jsoup.nodes.FormElement", "elements"));
        assertNull(actualElements);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes formElementAttributes = formElement.attributes;
        Attributes actualAttributes = actual.attributes;
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(formElementAttributes, actualAttributes));
        
        String actualBaseUri = actual.baseUri;
        assertNull(actualBaseUri);
        
        int formElementSiblingIndex = formElement.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(formElementSiblingIndex, actualSiblingIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRemoveAttr_Return_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        String string = "@";
        
        Document actual = ((Document) document.removeAttr(string));
        
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        assertNull(actualOutputSettings);
        
        Document.QuirksMode actualQuirksMode = ((Document.QuirksMode) getFieldValue(actual, "org.jsoup.nodes.Document", "quirksMode"));
        assertNull(actualQuirksMode);
        
        String actualLocation = ((String) getFieldValue(actual, "org.jsoup.nodes.Document", "location"));
        assertNull(actualLocation);
        
        boolean actualUpdateMetaCharset = ((Boolean) getFieldValue(actual, "org.jsoup.nodes.Document", "updateMetaCharset"));
        assertFalse(actualUpdateMetaCharset);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.removeAttr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeAttr(Node.java:127) */
        formElement.removeAttr(string);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.removeAttr(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeAttr(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes.remove(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_ThrowIllegalArgumentException_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        String string = "";
        
        formElement.removeAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNodesCopy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodesCopy()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return children;}
 *  */
    @Test
    public void testChildNodesCopy_ListIterator() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        ArrayList actual = ((ArrayList) document.childNodesCopy());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method childNodesCopy()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Node> children = new ArrayList<Node>(childNodes.size());
 *  */
    @Test
    public void testChildNodesCopy_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodesCopy] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodesCopy(Node.java:213) */
        element.childNodesCopy();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: children.add(node.clone());
 *  */
    @Test
    public void testChildNodesCopy_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodesCopy] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:653)
            org.jsoup.nodes.Node.clone(Node.java:617)
            org.jsoup.nodes.Element.clone(Element.java:1221)
            org.jsoup.nodes.Document.clone(Document.java:286)
            org.jsoup.nodes.Document.clone(Document.java:17)
            org.jsoup.nodes.Node.childNodesCopy(Node.java:215) */
        document.childNodesCopy();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: children.add(node.clone());
 *  */
    @Test
    public void testChildNodesCopy_ThrowNullPointerException_3() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodesCopy] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:653)
            org.jsoup.nodes.Node.clone(Node.java:617)
            org.jsoup.nodes.Element.clone(Element.java:1221)
            org.jsoup.nodes.Element.clone(Element.java:21)
            org.jsoup.nodes.Node.childNodesCopy(Node.java:215) */
        document.childNodesCopy();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: children.add(node.clone());
 *  */
    @Test
    public void testChildNodesCopy_ThrowNullPointerException_4() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodesCopy] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:653)
            org.jsoup.nodes.Node.clone(Node.java:617)
            org.jsoup.nodes.Node.childNodesCopy(Node.java:215) */
        document.childNodesCopy();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesCopy()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: children.add(node.clone());
 *  */
    @Test
    public void testChildNodesCopy_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodesCopy] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodesCopy(Node.java:215) */
        element.childNodesCopy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.siblingNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method siblingNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testSiblingNodes_ParentNodeEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        List actual = formElement.siblingNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Node node: nodes)} once
 *  */
    @Test
    public void testSiblingNodes_ParentNodeNotEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        ArrayList actual = ((ArrayList) formElement.siblingNodes());
        
        ArrayList expected = new ArrayList();
        expected.add(document);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method siblingNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> siblings = new ArrayList<Node>(nodes.size() - 1);
 *  */
    @Test
    public void testSiblingNodes_ThrowIllegalArgumentException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.siblingNodes] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.nodes.Node.siblingNodes(Node.java:477) */
        document.siblingNodes();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#siblingNodes()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Node> siblings = new ArrayList<Node>(nodes.size() - 1);
 *  */
    @Test
    public void testSiblingNodes_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.siblingNodes] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.siblingNodes(Node.java:477) */
        formElement.siblingNodes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.reindexChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reindexChildren(int)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren(int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < childNodes.size(); i++)} twice
 *  */
    @Test
    public void testReindexChildren_NodeSetSiblingIndex() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren", intType);
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[1];
        reindexChildrenMethodArguments[0] = 0;
        reindexChildrenMethod.invoke(element, reindexChildrenMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren(int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < childNodes.size(); i++)} once
 *  */
    @Test
    public void testReindexChildren_IterateForLoop() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren", intType);
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[1];
        reindexChildrenMethodArguments[0] = 2;
        reindexChildrenMethod.invoke(formElement, reindexChildrenMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reindexChildren(int)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren(int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < childNodes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: childNodes.get(i).setSiblingIndex(i);
 *  */
    @Test
    public void testReindexChildren_ThrowIndexOutOfBoundsException() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.reindexChildren] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.reindexChildren(Node.java:463) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren", intType);
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[1];
        reindexChildrenMethodArguments[0] = -1;
        try {
            reindexChildrenMethod.invoke(formElement, reindexChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren(int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < childNodes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = start; i < childNodes.size(); i++)
 *  */
    @Test
    public void testReindexChildren_ThrowNullPointerException() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.reindexChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:462) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren", intType);
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[1];
        reindexChildrenMethodArguments[0] = -255;
        try {
            reindexChildrenMethod.invoke(formElement, reindexChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reindexChildren(int)}
 * @utbot.iterates iterate the loop {@code for(int i = start; i < childNodes.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.get(i).setSiblingIndex(i);
 *  */
    @Test
    public void testReindexChildren_ThrowNullPointerException_1() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.reindexChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Method reindexChildrenMethod = nodeClazz.getDeclaredMethod("reindexChildren", intType);
        reindexChildrenMethod.setAccessible(true);
        java.lang.Object[] reindexChildrenMethodArguments = new java.lang.Object[1];
        reindexChildrenMethodArguments[0] = 0;
        try {
            reindexChildrenMethod.invoke(formElement, reindexChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = formElement.childNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.absUrl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testAbsUrl_Return() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        String string = " ";
        
        String actual = formElement.absUrl(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testAbsUrl_Return_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "@";
        
        String actual = element.absUrl(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method absUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.absUrl(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(attributeKey);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_ThrowIllegalArgumentException_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        String string = "";
        
        formElement.absUrl(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.getDeepChild
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeepChild(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> children = el.children();
 *  */
    @Test
    public void testGetDeepChild_ThrowNullPointerException() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.getDeepChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.getDeepChild(Node.java:384) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = nodeClazz.getDeclaredMethod("getDeepChild", elementType);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = ((Object) null);
        try {
            getDeepChildMethod.invoke(formElement, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> children = el.children();
 *  */
    @Test
    public void testGetDeepChild_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.getDeepChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:201)
            org.jsoup.nodes.Node.getDeepChild(Node.java:384)
            org.jsoup.nodes.Node.getDeepChild(Node.java:386) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = nodeClazz.getDeclaredMethod("getDeepChild", documentType);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = document;
        try {
            getDeepChildMethod.invoke(element, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#getDeepChild(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> children = el.children();
 *  */
    @Test
    public void testGetDeepChild_ThrowNullPointerException_2() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(formElement1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Node.getDeepChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:201)
            org.jsoup.nodes.Node.getDeepChild(Node.java:384)
            org.jsoup.nodes.Node.getDeepChild(Node.java:386) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class formElement1Type = Class.forName("org.jsoup.nodes.Element");
        Method getDeepChildMethod = nodeClazz.getDeclaredMethod("getDeepChild", formElement1Type);
        getDeepChildMethod.setAccessible(true);
        java.lang.Object[] getDeepChildMethodArguments = new java.lang.Object[1];
        getDeepChildMethodArguments[0] = formElement1;
        try {
            getDeepChildMethod.invoke(formElement, getDeepChildMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNodeSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodeSize()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodeSize()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return childNodes.size();}
 *  */
    @Test
    public void testChildNodeSize_ListSize() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        int actual = formElement.childNodeSize();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method childNodeSize()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodeSize()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return childNodes.size();
 *  */
    @Test
    public void testChildNodeSize_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.childNodeSize] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:225) */
        formElement.childNodeSize();
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
    public void testSiblingIndex_ReturnSiblingIndex() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.siblingIndex = -255;
        
        int actual = formElement.siblingIndex();
        
        assertEquals(-255, actual);
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
    public void testAddChildren() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        org.jsoup.nodes.Node[] nodeArray = {};
        
        formElement.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 *  */
    @Test
    public void testAddChildren_IterateForEachLoop_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            nodeArray[0] = ((Node) document);
            
            Node initialNodeArray0ParentNode = nodeArray[0].parentNode;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            formElement.addChildren(nodeArray);
            
            Node finalNodeArray0ParentNode = nodeArray[0].parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialNodeArray0ParentNode == finalNodeArray0ParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 *  */
    @Test
    public void testAddChildren_IterateForEachLoop() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            nodeArray[0] = ((Node) document1);
            
            Node initialNodeArray0ParentNode = nodeArray[0].parentNode;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            document.addChildren(nodeArray);
            
            Node finalNodeArray0ParentNode = nodeArray[0].parentNode;
            int finalNodeArray0SiblingIndex = nodeArray[0].siblingIndex;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialNodeArray0ParentNode == finalNodeArray0ParentNode);
            
            assertEquals(3, finalNodeArray0SiblingIndex);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        nodeArray[0] = ((Node) formElement);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.reparentChild(Node.java:457)
            org.jsoup.nodes.Node.addChildren(Node.java:431) */
        element.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        nodeArray[0] = ((Node) formElement);
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.reparentChild(Node.java:457)
            org.jsoup.nodes.Node.addChildren(Node.java:431) */
        element.addChildren(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: children)
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:430) */
        formElement.addChildren(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            nodeArray[0] = ((Node) formElement);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.addChildren(Node.java:433) */
            document.addChildren(nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            formElement.setParentNode(parentNode);
            nodeArray[0] = ((Node) formElement);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.addChildren(Node.java:433) */
            element.addChildren(nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node child: children)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_4() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            childNodes.add(document1);
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
            document.setParentNode(parentNode);
            nodeArray[0] = ((Node) document);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.addChildren(Node.java:433) */
            element.addChildren(nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
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
    public void testAddChildren_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = {};
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            element.addChildren(0, nodeArray);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testAddChildren_ListAdd() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            nodeArray[0] = ((Node) document);
            
            Node initialNodeArray0ParentNode = nodeArray[0].parentNode;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            element.addChildren(0, nodeArray);
            
            Node finalNodeArray0ParentNode = nodeArray[0].parentNode;
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialNodeArray0ParentNode == finalNodeArray0ParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 *  */
    @Test
    public void testAddChildren_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            childNodes.add(document1);
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = {};
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            document.addChildren(0, nodeArray);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 *  */
    @Test
    public void testAddChildren1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = {};
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            document.addChildren(7, nodeArray);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        org.jsoup.nodes.Node[] nodeArray = {null};
        
        formElement.addChildren(-255, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.noNullElements(children);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildren_ThrowIllegalArgumentException_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[2];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        
        formElement.addChildren(-255, nodeArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: reindexChildren(index);
 *  */
    @Test
    public void testAddChildren_ThrowIndexOutOfBoundsException1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = {};
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.get(ArrayList.java:427)
                org.jsoup.nodes.Node.reindexChildren(Node.java:463)
                org.jsoup.nodes.Node.addChildren(Node.java:446) */
            document.addChildren(-1, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddChildren_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            ArrayList childNodes = new ArrayList();
            setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            ArrayList childNodes1 = new ArrayList();
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            formElement1.setParentNode(parentNode);
            nodeArray[0] = ((Node) formElement1);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:423)
                org.jsoup.nodes.Node.reparentChild(Node.java:457)
                org.jsoup.nodes.Node.addChildren(Node.java:443) */
            formElement.addChildren(-255, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren(index);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = {};
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:462)
                org.jsoup.nodes.Node.addChildren(Node.java:446) */
            element.addChildren(-255, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(index, in);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_11() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            nodeArray[0] = ((Node) formElement);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.addChildren(Node.java:444) */
            element.addChildren(-255, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.iterates iterate the loop {@code for(int i = children.length - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(index, in);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_31() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            formElement.setParentNode(formElement);
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
            nodeArray[0] = ((Node) formElement);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.addChildren(Node.java:444) */
            element.addChildren(-255, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren(index);
 *  */
    @Test
    public void testAddChildren_ThrowNullPointerException_21() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = {};
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:463)
                org.jsoup.nodes.Node.addChildren(Node.java:446) */
            document.addChildren(0, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addChildren(int, [Lorg.jsoup.nodes.Node;)
    
    @Test
    public void testAddChildren2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
            org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            nodeArray[0] = ((Node) document);
            
            /* This test fails because method [org.jsoup.nodes.Node.addChildren] produces [java.lang.IndexOutOfBoundsException: Index: 33293633, Size: 0]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.add(ArrayList.java:481)
                org.jsoup.nodes.Node.addChildren(Node.java:444) */
            element.addChildren(33293633, nodeArray);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.hasAttr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes.hasKey(attributeKey);}
 *  */
    @Test
    public void testHasAttr_ReturnAttributesHasKey() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        formElement.attributes = attributes;
        String string = "";
        
        boolean actual = formElement.hasAttr(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes.hasKey(attributeKey);}
 *  */
    @Test
    public void testHasAttr_ReturnAttributesHasKey_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        document.attributes = attributes;
        String string = "";
        
        boolean actual = document.hasAttr(string);
        
        assertFalse(actual);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.hasAttr(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasAttr(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#hasAttr(java.lang.String)}
 * @utbot.executesCondition {@code (attributeKey.startsWith("abs:")): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes.hasKey(attributeKey);
 *  */
    @Test
    public void testHasAttr_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.hasAttr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:117) */
        formElement.hasAttr(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.ensureChildNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureChildNodes()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#ensureChildNodes()}
 * @utbot.executesCondition {@code (childNodes == EMPTY_NODES): False}
 *  */
    @Test
    public void testEnsureChildNodes_ChildNodesNotEqualsEMPTY_NODES() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            document.ensureChildNodes();
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#ensureChildNodes()}
 * @utbot.executesCondition {@code (childNodes == EMPTY_NODES): True}
 *  */
    @Test
    public void testEnsureChildNodes_ChildNodesEqualsEMPTY_NODES() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            element.ensureChildNodes();
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.childNodesAsArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodesAsArray()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#childNodesAsArray()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#childNodeSize()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.returnsFrom {@code return childNodes.toArray(new Node[childNodeSize()]);}
 *  */
    @Test
    public void testChildNodesAsArray_ListToArray() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        org.jsoup.nodes.Node[] actual = formElement.childNodesAsArray();
        
        org.jsoup.nodes.Node[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Node initialElementParentNode = element.parentNode;
        
        formElement.reparentChild(element);
        
        Node finalElementParentNode = element.parentNode;
        
        assertFalse(initialElementParentNode == finalElementParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 *  */
    @Test
    public void testReparentChild_ChildParentNodeNotEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        Node initialDocumentParentNode = document.parentNode;
        
        formElement.reparentChild(document);
        
        Node finalDocumentParentNode = document.parentNode;
        
        assertFalse(initialDocumentParentNode == finalDocumentParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 *  */
    @Test
    public void testReparentChild_ChildParentNodeNotEqualsNull_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element1);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.reparentChild(element);
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
    public void testReparentChild_ThrowIndexOutOfBoundsException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        document.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.reparentChild(Node.java:457) */
        formElement.reparentChild(document);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: child.parentNode != null
 *  */
    @Test
    public void testReparentChild_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reparentChild(Node.java:456) */
        formElement.reparentChild(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (child.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: child.parentNode.removeChild(child);
 *  */
    @Test
    public void testReparentChild_ThrowNullPointerException_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.reparentChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.reparentChild(Node.java:457) */
        formElement.reparentChild(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.addSiblingHtml
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSiblingHtml(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSiblingHtml_ThrowIllegalArgumentException() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method addSiblingHtmlMethod = nodeClazz.getDeclaredMethod("addSiblingHtml", intType, stringType);
        addSiblingHtmlMethod.setAccessible(true);
        java.lang.Object[] addSiblingHtmlMethodArguments = new java.lang.Object[2];
        addSiblingHtmlMethodArguments[0] = -255;
        addSiblingHtmlMethodArguments[1] = ((Object) null);
        try {
            addSiblingHtmlMethod.invoke(formElement, addSiblingHtmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parentNode);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSiblingHtml_ThrowIllegalArgumentException_1() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        String string = "";
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method addSiblingHtmlMethod = nodeClazz.getDeclaredMethod("addSiblingHtml", intType, stringType);
        addSiblingHtmlMethod.setAccessible(true);
        java.lang.Object[] addSiblingHtmlMethodArguments = new java.lang.Object[2];
        addSiblingHtmlMethodArguments[0] = -255;
        addSiblingHtmlMethodArguments[1] = string;
        try {
            addSiblingHtmlMethod.invoke(formElement, addSiblingHtmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)}
 * @utbot.executesCondition {@code (parent() instanceof Element): True}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> nodes = Parser.parseFragment(html, context, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddSiblingHtml_ThrowIllegalArgumentException_2() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        formElement.setParentNode(parentNode);
        String string = "";
        
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method addSiblingHtmlMethod = nodeClazz.getDeclaredMethod("addSiblingHtml", intType, stringType);
        addSiblingHtmlMethod.setAccessible(true);
        java.lang.Object[] addSiblingHtmlMethodArguments = new java.lang.Object[2];
        addSiblingHtmlMethodArguments[0] = -255;
        addSiblingHtmlMethodArguments[1] = string;
        try {
            addSiblingHtmlMethod.invoke(formElement, addSiblingHtmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addSiblingHtml(int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#addSiblingHtml(int,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: parent() instanceof Element
 *  */
    @Test
    public void testAddSiblingHtml_ThrowClassCastException() throws Throwable  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        formElement.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.addSiblingHtml] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @466c94ae)]
            org.jsoup.nodes.Element.parent(Element.java:154)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:323) */
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method addSiblingHtmlMethod = nodeClazz.getDeclaredMethod("addSiblingHtml", intType, stringType);
        addSiblingHtmlMethod.setAccessible(true);
        java.lang.Object[] addSiblingHtmlMethodArguments = new java.lang.Object[2];
        addSiblingHtmlMethodArguments[0] = -255;
        addSiblingHtmlMethodArguments[1] = string;
        try {
            addSiblingHtmlMethod.invoke(formElement, addSiblingHtmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.setBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method setBaseUri(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 *  */
    @Test
    public void testSetBaseUri_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        formElement.baseUri = baseUri;
        formElement.siblingIndex = -1;
        String string = "";
        
        formElement.setBaseUri(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 *  */
    @Test
    public void testSetBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        element.setBaseUri(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 *  */
    @Test
    public void testSetBaseUri_2() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        ArrayList childNodes1 = new ArrayList();
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        formElement.siblingIndex = -1;
        String string = "";
        
        formElement.setBaseUri(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method setBaseUri(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.jsoup.nodes.Node#childNode(int)} twice
    /// invoke:
    ///     {@link org.jsoup.nodes.Node#childNode(int)} twice,
    ///     {@link org.jsoup.select.NodeVisitor#tail(org.jsoup.nodes.Node,int)} twice,
    ///     {@link org.jsoup.nodes.Node#parentNode()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 *  */
    @Test
    public void testSetBaseUri_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(element);
        ArrayList childNodes1 = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        element.setBaseUri(string);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 *  */
    @Test
    public void testSetBaseUri_4() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        ArrayList childNodes1 = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(element);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        formElement.baseUri = baseUri;
        String string = "";
        
        formElement.setBaseUri(string);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.setBaseUri(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setBaseUri(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setBaseUri(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#traverse(org.jsoup.select.NodeVisitor)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: traverse(new NodeVisitor() {
 * 
 *     public void head(Node node, int depth) {
 *         node.baseUri = baseUri;
 *     }
 * 
 *     public void tail(Node node, int depth) {
 *     }
 * });
 *  */
    @Test
    public void testSetBaseUri_ThrowIndexOutOfBoundsException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        setField(formElement, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        formElement.baseUri = baseUri;
        formElement.siblingIndex = -2;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Node.setBaseUri] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.nextSibling(Node.java:495)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:36)
            org.jsoup.nodes.Node.traverse(Node.java:536)
            org.jsoup.nodes.Node.setBaseUri(Node.java:146) */
        formElement.setBaseUri(string);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        formElement.setParentNode(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (this.parentNode != null): True}
 *  */
    @Test
    public void testSetParentNode_ThisParentNodeNotEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        formElement.setParentNode(null);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        assertNull(finalFormElementParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (this.parentNode != null): True}
 *  */
    @Test
    public void testSetParentNode_ThisParentNodeNotEqualsNull_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.setParentNode(null);
        
        Node finalElementParentNode = element.parentNode;
        
        assertNull(finalElementParentNode);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.setParentNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.setParentNode(Node.java:403) */
        formElement.setParentNode(null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#setParentNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.parentNode.removeChild(this);
 *  */
    @Test
    public void testSetParentNode_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.setParentNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.setParentNode(Node.java:403) */
        formElement.setParentNode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.getOutputSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOutputSettings()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#getOutputSettings()}
 * @utbot.returnsFrom {@code return ownerDocument() != null ? ownerDocument().outputSettings() : (new Document("")).outputSettings();}
 *  */
    @Test
    public void testGetOutputSettings_ReturnOwnerDocumentEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        Document.OutputSettings actual = document.getOutputSettings();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#getOutputSettings()}
 * @utbot.returnsFrom {@code return ownerDocument() != null ? ownerDocument().outputSettings() : (new Document("")).outputSettings();}
 *  */
    @Test
    public void testGetOutputSettings_ReturnOwnerDocumentEqualsNull_1() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        formElement.setParentNode(parentNode);
        
        Document.OutputSettings actual = formElement.getOutputSettings();
        
        assertNull(actual);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.siblingIndex = -255;
        
        formElement.setSiblingIndex(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.doClone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doClone(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#doClone(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clone = (Node) super.clone();
 *  */
    @Test
    public void testDoClone_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.doClone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.doClone(Node.java:653) */
        formElement.doClone(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.outerHtml
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtml(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#outerHtml(java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#getOutputSettings()}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: new NodeTraversor(new OuterHtmlVisitor(accum, getOutputSettings())).traverse(this);
 *  */
    @Test
    public void testOuterHtml_ThrowClassCastException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        document.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Node.outerHtml] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @466c94ae)]
            org.jsoup.nodes.Element.parent(Element.java:154)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1139)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:671)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Node.outerHtml(Node.java:551) */
        document.outerHtml(stringBuilder);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        
        element.removeChild(formElement);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        assertNull(finalFormElementParentNode);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testRemoveChild_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(document);
        
        document.removeChild(formElement);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        assertNull(finalFormElementParentNode);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        formElement.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423) */
        element.removeChild(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test
    public void testRemoveChild_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:421) */
        formElement.removeChild(null);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        formElement.siblingIndex = -255;
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:423) */
        element.removeChild(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#removeChild(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.invokes org.jsoup.nodes.Node#reindexChildren(int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reindexChildren(index);
 *  */
    @Test
    public void testRemoveChild_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(element);
        
        /* This test fails because method [org.jsoup.nodes.Node.removeChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424) */
        element.removeChild(document);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        formElement.removeChild(element);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.previousSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.executesCondition {@code (siblingIndex > 0): False}
 *  */
    @Test
    public void testPreviousSibling_SiblingIndexLessOrEqualZero() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        
        Node actual = formElement.previousSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 *  */
    @Test
    public void testPreviousSibling_ParentNodeEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Node actual = formElement.previousSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.executesCondition {@code (siblingIndex > 0): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return parentNode.childNodes.get(siblingIndex - 1);}
 *  */
    @Test
    public void testPreviousSibling_SiblingIndexGreaterThanZero() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = 1;
        
        Node actual = element.previousSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return parentNode.childNodes.get(siblingIndex - 1);
 *  */
    @Test
    public void testPreviousSibling_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.previousSibling] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.previousSibling(Node.java:509) */
        element.previousSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#previousSibling()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parentNode.childNodes.get(siblingIndex - 1);
 *  */
    @Test
    public void testPreviousSibling_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Node.previousSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.previousSibling(Node.java:509) */
        formElement.previousSibling();
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Node actual = formElement.nextSibling();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.executesCondition {@code (siblings.size() > index): False}
 *  */
    @Test
    public void testNextSibling_SiblingsSizeLessOrEqualIndex() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
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
 * @utbot.executesCondition {@code (siblings.size() > index): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return siblings.get(index);}
 *  */
    @Test
    public void testNextSibling_SiblingsSizeGreaterThanIndex() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -1;
        
        Node actual = element.nextSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextSibling()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.executesCondition {@code (siblings.size() > index): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return siblings.get(index);
 *  */
    @Test
    public void testNextSibling_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -2;
        
        /* This test fails because method [org.jsoup.nodes.Node.nextSibling] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Node.nextSibling(Node.java:495) */
        element.nextSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#nextSibling()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: siblings.size() > index
 *  */
    @Test
    public void testNextSibling_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = -255;
        
        /* This test fails because method [org.jsoup.nodes.Node.nextSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.nextSibling(Node.java:494) */
        formElement.nextSibling();
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
 * @utbot.invokes {@link java.util.List#set(int,java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setSiblingIndex(int)}
 *  */
    @Test
    public void testReplaceChild_InParentNodeEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Node initialFormElement1ParentNode = formElement1.parentNode;
        
        element.replaceChild(formElement, formElement1);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        Node finalFormElement1ParentNode = formElement1.parentNode;
        
        assertNull(finalFormElementParentNode);
        
        assertFalse(initialFormElement1ParentNode == finalFormElement1ParentNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: in.parentNode.removeChild(in);
 *  */
    @Test
    public void testReplaceChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(document);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        formElement.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.replaceChild(Node.java:411) */
        document.replaceChild(element, formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:408) */
        formElement.replaceChild(null, null);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(formElement);
        element.siblingIndex = -255;
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:414) */
        formElement.replaceChild(element, formElement1);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.parentNode.removeChild(in);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException_2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(document);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.replaceChild(Node.java:411) */
        document.replaceChild(element, formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): True}
 * @utbot.executesCondition {@code (in.parentNode != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.set(index, in);
 *  */
    @Test
    public void testReplaceChild_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement1.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Node.replaceChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.replaceChild(Node.java:414) */
        element.replaceChild(formElement, formElement1);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(element);
        
        element.replaceChild(formElement, null);
    }
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#replaceChild(org.jsoup.nodes.Node,org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (Validate.isTrue(out.parentNode == this);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(out.parentNode == this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_ThrowIllegalArgumentException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        formElement.replaceChild(element, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Node.parentNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parentNode()
    
    /**
    @utbot.classUnderTest {@link Node}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Node#parentNode()}
 * @utbot.returnsFrom {@code return parentNode;}
 *  */
    @Test
    public void testParentNode_ReturnParentNode() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Node actual = formElement.parentNode();
        
        assertNull(actual);
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
    public void testOwnerDocument_ReturnNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Document actual = formElement.ownerDocument();
        
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
    public void testOwnerDocument_ParentNodeNotEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formElement.setParentNode(parentNode);
        
        Document actual = formElement.ownerDocument();
        
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
        
        Document.QuirksMode actualQuirksMode = ((Document.QuirksMode) getFieldValue(actual, "org.jsoup.nodes.Document", "quirksMode"));
        assertNull(actualQuirksMode);
        
        String actualLocation = ((String) getFieldValue(actual, "org.jsoup.nodes.Document", "location"));
        assertNull(actualLocation);
        
        boolean actualUpdateMetaCharset = ((Boolean) getFieldValue(actual, "org.jsoup.nodes.Document", "updateMetaCharset"));
        assertFalse(actualUpdateMetaCharset);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1000821589405300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1000821589405300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1000821589415200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000821589405300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000821589415200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1000821589951500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1000821589951500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1000821589953100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000821589951500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000821589953100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1000821590464200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1000821590464200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1000821590465500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000821590464200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000821590465500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1000821591421000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1000821591421000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1000821591422400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1000821591421000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1000821591422400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

