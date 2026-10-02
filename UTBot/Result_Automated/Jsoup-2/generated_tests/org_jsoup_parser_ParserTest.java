package org.jsoup.parser;

import org.junit.Test;
import java.util.LinkedList;
import java.lang.reflect.Method;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import org.jsoup.nodes.TextNode;
import java.util.Set;
import org.jsoup.nodes.Node;
import java.util.List;
import org.jsoup.nodes.Attribute;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_parser_ParserTest {
    ///region Test suites for executable org.jsoup.parser.Parser.last
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method last()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#last()}
 * @utbot.invokes {@link java.util.LinkedList#getLast()}
 * @utbot.returnsFrom {@code return stack.getLast();}
 *  */
    @Test
    public void testLast_LinkedListGetLast() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method lastMethod = parserClazz.getDeclaredMethod("last");
        lastMethod.setAccessible(true);
        java.lang.Object[] lastMethodArguments = new java.lang.Object[0];
        Element actual = ((Element) lastMethod.invoke(parser, lastMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method last()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#last()}
 * @utbot.invokes {@link java.util.LinkedList#getLast()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return stack.getLast();
 *  */
    @Test
    public void testLast_ThrowNoSuchElementException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.last] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.getLast(LinkedList.java:261)
            org.jsoup.parser.Parser.last(Parser.java:288) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method lastMethod = parserClazz.getDeclaredMethod("last");
        lastMethod.setAccessible(true);
        java.lang.Object[] lastMethodArguments = new java.lang.Object[0];
        try {
            lastMethod.invoke(parser, lastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#last()}
 * @utbot.invokes {@link java.util.LinkedList#getLast()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack.getLast();
 *  */
    @Test
    public void testLast_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.last] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.last(Parser.java:288) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method lastMethod = parserClazz.getDeclaredMethod("last");
        lastMethod.setAccessible(true);
        java.lang.Object[] lastMethodArguments = new java.lang.Object[0];
        try {
            lastMethod.invoke(parser, lastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(html, baseUri, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() {
        Parser.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(html, baseUri, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parse(string, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseWithNonEmptyStrings() throws Exception  {
        Document actual = Parser.parse("#$\\\"'?", "#$\\\"'");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes2 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "#$\\\"'";
        element1.setBaseUri(baseUri);
        childNodes1.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
        ArrayList childNodes4 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes2);
        String baseUri1 = "";
        textNode.setBaseUri(baseUri1);
        childNodes3.add(textNode);
        TextNode textNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode1, "org.jsoup.nodes.Node", "parentNode", element2);
        ArrayList childNodes5 = new ArrayList();
        setField(textNode1, "org.jsoup.nodes.Node", "childNodes", childNodes5);
        Attributes attributes3 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode1, "org.jsoup.nodes.Node", "attributes", attributes3);
        textNode1.setBaseUri(baseUri);
        childNodes3.add(textNode1);
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes4);
        element2.setBaseUri(baseUri);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes6);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes8 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes9 = new LinkedHashMap();
        setField(attributes8, "org.jsoup.nodes.Attributes", "attributes", attributes9);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes8);
        expected.setBaseUri(baseUri);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseWithBlankStringAndNonEmptyString() throws Exception  {
        Document actual = Parser.parse("\n\t\r", "-\uFFF43");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "text";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attribute.setKey(string);
        String value = "\n\t\r";
        attribute.setValue(value);
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "-\uFFF43";
        textNode.setBaseUri(baseUri);
        childNodes.add(textNode);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes2 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes2);
        element1.setBaseUri(baseUri);
        childNodes2.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes4 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes4);
        element2.setBaseUri(baseUri);
        childNodes2.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes6);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes8 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes9 = new LinkedHashMap();
        setField(attributes8, "org.jsoup.nodes.Attributes", "attributes", attributes9);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes8);
        expected.setBaseUri(baseUri);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.lang.String)
    
    @Test
    public void testParse1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Tag prevDefaultAncestor = ((Tag) getStaticFieldValue(tagClazz, "defaultAncestor"));
        try {
            Tag defaultAncestor = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "BODY";
            setField(defaultAncestor, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "isBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainInline", true);
            setStaticField(tagClazz, "defaultAncestor", defaultAncestor);
            String string = "";
            String string1 = "";
            
            Document actual = Parser.parse(string, string1);
            
            Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName1 = "#root";
            setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
            setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors = new ArrayList();
            Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName2 = "body";
            setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName2);
            setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors1 = new ArrayList();
            Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName3 = "html";
            setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName3);
            setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors2 = new ArrayList();
            setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
            ancestors1.add(tag2);
            setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
            ancestors.add(tag1);
            setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
            setField(expected, "org.jsoup.nodes.Element", "tag", tag);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(element, "org.jsoup.nodes.Element", "tag", tag2);
            setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
            ArrayList childNodes1 = new ArrayList();
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName4 = "head";
            setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName4);
            setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors3 = new ArrayList();
            ancestors3.add(tag2);
            setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
            setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
            setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
            ArrayList childNodes2 = new ArrayList();
            setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
            Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes1 = new LinkedHashMap();
            setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
            setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
            element1.setBaseUri(string1);
            childNodes1.add(element1);
            Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
            setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
            ArrayList childNodes3 = new ArrayList();
            setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
            Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes3 = new LinkedHashMap();
            setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
            setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
            element2.setBaseUri(string1);
            childNodes1.add(element2);
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes5 = new LinkedHashMap();
            setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
            setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
            element.setBaseUri(string1);
            childNodes.add(element);
            setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
            Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes7 = new LinkedHashMap();
            setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
            setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
            expected.setBaseUri(string1);
            
            Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            // org.jsoup.parser.Tag has overridden equals method
            assertEquals(expectedTag, actualTag);
            
            Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
            assertNull(actualClassNames);
            
            Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
            assertNull(actualParentNode);
            
            List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
            List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
            assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
            
            Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expectedAttributes, actualAttributes));
            
            String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
            assertEquals(expectedBaseUri, actualBaseUri);
            
        } finally {
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
    }
    
    @Test
    public void testParse2() throws Exception  {
        String string = " ";
        
        Document actual = Parser.parse(string, string);
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string1 = "text";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attribute.setKey(string1);
        String value = " ";
        attribute.setValue(value);
        attributes1.put(string1, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "";
        textNode.setBaseUri(baseUri);
        childNodes.add(textNode);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes2 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes2);
        element1.setBaseUri(baseUri);
        childNodes2.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes4 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes4);
        element2.setBaseUri(baseUri);
        childNodes2.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes6);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes8 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes9 = new LinkedHashMap();
        setField(attributes8, "org.jsoup.nodes.Attributes", "attributes", attributes9);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes8);
        expected.setBaseUri(baseUri);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    
    @Test
    public void testParse3() throws Exception  {
        String string = "         ";
        
        Document actual = Parser.parse(string, string);
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string1 = "text";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attribute.setKey(string1);
        String value = "         ";
        attribute.setValue(value);
        attributes1.put(string1, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "";
        textNode.setBaseUri(baseUri);
        childNodes.add(textNode);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes2 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes2);
        element1.setBaseUri(baseUri);
        childNodes2.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes4 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes4);
        element2.setBaseUri(baseUri);
        childNodes2.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes6);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes8 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes9 = new LinkedHashMap();
        setField(attributes8, "org.jsoup.nodes.Attributes", "attributes", attributes9);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes8);
        expected.setBaseUri(baseUri);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tq.isEmpty())
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parse(Parser.java:67) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseMethod = parserClazz.getDeclaredMethod("parse");
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[0];
        try {
            parseMethod.invoke(parser, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse()}
 * @utbot.invokes {@link org.jsoup.nodes.Document#normalise()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doc.normalise();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parse(Parser.java:82) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseMethod = parserClazz.getDeclaredMethod("parse");
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[0];
        try {
            parseMethod.invoke(parser, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse()
    
    @Test
    public void testParse4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:64)
            org.jsoup.nodes.Evaluator$Tag.matches(Evaluator.java:26)
            org.jsoup.select.Collector.accumulateMatches(Collector.java:28)
            org.jsoup.select.Collector.collect(Collector.java:23)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:408)
            org.jsoup.select.Selector.byTag(Selector.java:195)
            org.jsoup.select.Selector.findElements(Selector.java:149)
            org.jsoup.select.Selector.select(Selector.java:100)
            org.jsoup.select.Selector.select(Selector.java:73)
            org.jsoup.nodes.Element.select(Element.java:162)
            org.jsoup.nodes.Document.normalise(Document.java:96)
            org.jsoup.parser.Parser.parse(Parser.java:82) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseMethod = parserClazz.getDeclaredMethod("parse");
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[0];
        try {
            parseMethod.invoke(parser, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParse5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.Parser.parse(Parser.java:76) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseMethod = parserClazz.getDeclaredMethod("parse");
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[0];
        try {
            parseMethod.invoke(parser, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParse6() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.Parser.parse(Parser.java:68) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseMethod = parserClazz.getDeclaredMethod("parse");
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[0];
        try {
            parseMethod.invoke(parser, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseTextNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseTextNode()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = tq.consumeTo("<");
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseTextNode(Parser.java:198) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseTextNodeMethod = parserClazz.getDeclaredMethod("parseTextNode");
        parseTextNodeMethod.setAccessible(true);
        java.lang.Object[] parseTextNodeMethodArguments = new java.lang.Object[0];
        try {
            parseTextNodeMethod.invoke(parser, parseTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseTextNode()
    
    @Test
    public void testParseTextNode1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.matchesAny(TokenQueue.java:92)
            org.jsoup.parser.TokenQueue.consumeToAny(TokenQueue.java:171)
            org.jsoup.parser.TokenQueue.consumeTo(TokenQueue.java:161)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:198) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseTextNodeMethod = parserClazz.getDeclaredMethod("parseTextNode");
        parseTextNodeMethod.setAccessible(true);
        java.lang.Object[] parseTextNodeMethodArguments = new java.lang.Object[0];
        try {
            parseTextNodeMethod.invoke(parser, parseTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseTextNode()
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseTextNode2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseTextNodeMethod = parserClazz.getDeclaredMethod("parseTextNode");
        parseTextNodeMethod.setAccessible(true);
        java.lang.Object[] parseTextNodeMethodArguments = new java.lang.Object[0];
        try {
            parseTextNodeMethod.invoke(parser, parseTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseStartTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseStartTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseStartTag_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseStartTag(Parser.java:117) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseStartTagMethod = parserClazz.getDeclaredMethod("parseStartTag");
        parseStartTagMethod.setAccessible(true);
        java.lang.Object[] parseStartTagMethodArguments = new java.lang.Object[0];
        try {
            parseStartTagMethod.invoke(parser, parseStartTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseStartTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseStartTag_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseStartTagMethod = parserClazz.getDeclaredMethod("parseStartTag");
        parseStartTagMethod.setAccessible(true);
        java.lang.Object[] parseStartTagMethodArguments = new java.lang.Object[0];
        try {
            parseStartTagMethod.invoke(parser, parseStartTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseStartTag()
    
    @Test
    public void testParseStartTag1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:145)
            org.jsoup.parser.Parser.parseStartTag(Parser.java:117) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseStartTagMethod = parserClazz.getDeclaredMethod("parseStartTag");
        parseStartTagMethod.setAccessible(true);
        java.lang.Object[] parseStartTagMethodArguments = new java.lang.Object[0];
        try {
            parseStartTagMethod.invoke(parser, parseStartTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseComment
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseComment()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<!--");
 *  */
    @Test
    public void testParseComment_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseComment(Parser.java:86) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCommentMethod = parserClazz.getDeclaredMethod("parseComment");
        parseCommentMethod.setAccessible(true);
        java.lang.Object[] parseCommentMethodArguments = new java.lang.Object[0];
        try {
            parseCommentMethod.invoke(parser, parseCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseComment()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<!--");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseComment_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCommentMethod = parserClazz.getDeclaredMethod("parseComment");
        parseCommentMethod.setAccessible(true);
        java.lang.Object[] parseCommentMethodArguments = new java.lang.Object[0];
        try {
            parseCommentMethod.invoke(parser, parseCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseComment()
    
    @Test
    public void testParseComment1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:145)
            org.jsoup.parser.Parser.parseComment(Parser.java:86) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCommentMethod = parserClazz.getDeclaredMethod("parseComment");
        parseCommentMethod.setAccessible(true);
        java.lang.Object[] parseCommentMethodArguments = new java.lang.Object[0];
        try {
            parseCommentMethod.invoke(parser, parseCommentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseXmlDecl
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseXmlDecl()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseXmlDecl_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:96) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseXmlDeclMethod = parserClazz.getDeclaredMethod("parseXmlDecl");
        parseXmlDeclMethod.setAccessible(true);
        java.lang.Object[] parseXmlDeclMethodArguments = new java.lang.Object[0];
        try {
            parseXmlDeclMethod.invoke(parser, parseXmlDeclMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseXmlDecl()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseXmlDecl_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseXmlDeclMethod = parserClazz.getDeclaredMethod("parseXmlDecl");
        parseXmlDeclMethod.setAccessible(true);
        java.lang.Object[] parseXmlDeclMethodArguments = new java.lang.Object[0];
        try {
            parseXmlDeclMethod.invoke(parser, parseXmlDeclMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseXmlDecl()
    
    @Test
    public void testParseXmlDecl1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:145)
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:96) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseXmlDeclMethod = parserClazz.getDeclaredMethod("parseXmlDecl");
        parseXmlDeclMethod.setAccessible(true);
        java.lang.Object[] parseXmlDeclMethodArguments = new java.lang.Object[0];
        try {
            parseXmlDeclMethod.invoke(parser, parseXmlDeclMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseEndTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseEndTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("</");
 *  */
    @Test
    public void testParseEndTag_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseEndTag(Parser.java:106) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseEndTagMethod = parserClazz.getDeclaredMethod("parseEndTag");
        parseEndTagMethod.setAccessible(true);
        java.lang.Object[] parseEndTagMethodArguments = new java.lang.Object[0];
        try {
            parseEndTagMethod.invoke(parser, parseEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseEndTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("</");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseEndTag_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseEndTagMethod = parserClazz.getDeclaredMethod("parseEndTag");
        parseEndTagMethod.setAccessible(true);
        java.lang.Object[] parseEndTagMethodArguments = new java.lang.Object[0];
        try {
            parseEndTagMethod.invoke(parser, parseEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseEndTag()
    
    @Test
    public void testParseEndTag1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:145)
            org.jsoup.parser.Parser.parseEndTag(Parser.java:106) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseEndTagMethod = parserClazz.getDeclaredMethod("parseEndTag");
        parseEndTagMethod.setAccessible(true);
        java.lang.Object[] parseEndTagMethodArguments = new java.lang.Object[0];
        try {
            parseEndTagMethod.invoke(parser, parseEndTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAttribute()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseAttribute()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: tq.consume();
 *  */
    @Test
    public void testParseAttribute_ThrowNoSuchElementException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:134)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:192) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        try {
            parseAttributeMethod.invoke(parser, parseAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseAttribute()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: tq.consume();
 *  */
    @Test
    public void testParseAttribute_ThrowNoSuchElementException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        Character character = '\r';
        queue.add(character);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:134)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:192) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        try {
            parseAttributeMethod.invoke(parser, parseAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseAttribute()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParseAttribute_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseAttribute(Parser.java:168) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        try {
            parseAttributeMethod.invoke(parser, parseAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseAttribute()
    
    @Test
    public void testParseAttribute1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        Character character = ' ';
        queue.add(character);
        queue.add(character);
        Character character1 = '\u0000';
        queue.add(character1);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        Attribute actual = ((Attribute) parseAttributeMethod.invoke(parser, parseAttributeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseAttribute()
    
    @Test
    public void testParseAttribute2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        Character character = '\t';
        queue.add(character);
        queue.add(character);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:196)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:168) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        try {
            parseAttributeMethod.invoke(parser, parseAttributeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseBodyFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragment(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(bodyHtml, baseUri, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_ThrowIllegalArgumentException() {
        Parser.parseBodyFragment(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(bodyHtml, baseUri, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragment_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parseBodyFragment(string, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseBodyFragment(java.lang.String, java.lang.String)
    
    @Test
    public void testParseBodyFragment1() throws Exception  {
        String string = "";
        
        Document actual = Parser.parseBodyFragment(string, string);
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes2 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        element1.setBaseUri(string);
        childNodes1.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
        element2.setBaseUri(string);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
        element.setBaseUri(string);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
        expected.setBaseUri(string);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    
    @Test
    public void testParseBodyFragment2() throws Exception  {
        String string = "         ";
        
        Document actual = Parser.parseBodyFragment(string, string);
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
        ArrayList childNodes1 = new ArrayList();
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName3 = "head";
        setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName3);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes2 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "";
        element1.setBaseUri(baseUri);
        childNodes1.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
        ArrayList childNodes4 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes2);
        textNode.setBaseUri(baseUri);
        childNodes3.add(textNode);
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes3 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes4 = new LinkedHashMap();
        setField(attributes3, "org.jsoup.nodes.Attributes", "attributes", attributes4);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes3);
        element2.setBaseUri(baseUri);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes5 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes6 = new LinkedHashMap();
        setField(attributes5, "org.jsoup.nodes.Attributes", "attributes", attributes6);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes5);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes7 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes8 = new LinkedHashMap();
        setField(attributes7, "org.jsoup.nodes.Attributes", "attributes", attributes8);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes7);
        expected.setBaseUri(baseUri);
        
        Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expectedTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
        
        Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertEquals(expectedBaseUri, actualBaseUri);
        
    }
    
    @Test
    public void testParseBodyFragment3() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Tag prevDefaultAncestor = ((Tag) getStaticFieldValue(tagClazz, "defaultAncestor"));
        try {
            Tag defaultAncestor = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "BODY";
            setField(defaultAncestor, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "isBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainInline", true);
            setStaticField(tagClazz, "defaultAncestor", defaultAncestor);
            String string = "@";
            
            Document actual = Parser.parseBodyFragment(string, string);
            
            Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName1 = "#root";
            setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
            setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors = new ArrayList();
            Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName2 = "body";
            setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName2);
            setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors1 = new ArrayList();
            Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName3 = "html";
            setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName3);
            setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors2 = new ArrayList();
            setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
            ancestors1.add(tag2);
            setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
            ancestors.add(tag1);
            setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
            setField(expected, "org.jsoup.nodes.Element", "tag", tag);
            ArrayList childNodes = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(element, "org.jsoup.nodes.Element", "tag", tag2);
            setField(element, "org.jsoup.nodes.Node", "parentNode", expected);
            ArrayList childNodes1 = new ArrayList();
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            Tag tag3 = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName4 = "head";
            setField(tag3, "org.jsoup.parser.Tag", "tagName", tagName4);
            setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
            setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
            ArrayList ancestors3 = new ArrayList();
            ancestors3.add(tag2);
            setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
            setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
            setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
            ArrayList childNodes2 = new ArrayList();
            setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
            Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes1 = new LinkedHashMap();
            setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
            setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
            element1.setBaseUri(string);
            childNodes1.add(element1);
            Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
            setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
            ArrayList childNodes3 = new ArrayList();
            TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
            setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
            ArrayList childNodes4 = new ArrayList();
            setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
            Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            setField(textNode, "org.jsoup.nodes.Node", "attributes", attributes2);
            textNode.setBaseUri(string);
            childNodes3.add(textNode);
            setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
            Attributes attributes3 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes4 = new LinkedHashMap();
            setField(attributes3, "org.jsoup.nodes.Attributes", "attributes", attributes4);
            setField(element2, "org.jsoup.nodes.Node", "attributes", attributes3);
            element2.setBaseUri(string);
            childNodes1.add(element2);
            setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
            Attributes attributes5 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes6 = new LinkedHashMap();
            setField(attributes5, "org.jsoup.nodes.Attributes", "attributes", attributes6);
            setField(element, "org.jsoup.nodes.Node", "attributes", attributes5);
            element.setBaseUri(string);
            childNodes.add(element);
            setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
            Attributes attributes7 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            LinkedHashMap attributes8 = new LinkedHashMap();
            setField(attributes7, "org.jsoup.nodes.Attributes", "attributes", attributes8);
            setField(expected, "org.jsoup.nodes.Node", "attributes", attributes7);
            expected.setBaseUri(string);
            
            Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            // org.jsoup.parser.Tag has overridden equals method
            assertEquals(expectedTag, actualTag);
            
            Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
            assertNull(actualClassNames);
            
            Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
            assertNull(actualParentNode);
            
            List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Node", "childNodes"));
            List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
            assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
            
            Attributes expectedAttributes = ((Attributes) getFieldValue(expected, "org.jsoup.nodes.Node", "attributes"));
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expectedAttributes, actualAttributes));
            
            String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Node", "baseUri"));
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
            assertEquals(expectedBaseUri, actualBaseUri);
            
        } finally {
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.addChildToParent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = popStackToSuitableContainer(child.tag());
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = ((Object) null);
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = popStackToSuitableContainer(child.tag());
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:255)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.invokes org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)
 * @utbot.invokes {@link org.jsoup.parser.Tag#getImplicitParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parentTag = childTag.getImplicitParent();
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException_3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.addChildToParent(Parser.java:217) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = popStackToSuitableContainer(child.tag());
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element implicit = new Element(parentTag, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildToParent_ThrowIllegalArgumentException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        String baseUri = "!";
        setField(parser, "org.jsoup.parser.Parser", "baseUri", baseUri);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element implicit = new Element(parentTag, baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildToParent_ThrowIllegalArgumentException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element parent = popStackToSuitableContainer(child.tag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildToParent_ThrowIllegalArgumentException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    @Test
    public void testAddChildToParent1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(parser);
        stack.add(parser);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\uFFFF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.ClassCastException: class org.jsoup.parser.Parser cannot be cast to class org.jsoup.nodes.Element (org.jsoup.parser.Parser and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            org.jsoup.parser.Parser.last(Parser.java:288)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(parser);
        stack.add(parser);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:154)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:213) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(parser);
        stack.add(parser);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:154)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:213) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class document1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", document1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = document1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent6() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:154)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:213) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class document1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", document1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = document1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent7() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "hea\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:154)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:213) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent8() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent9() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "head";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", elementType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent10() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class document1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", document1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = document1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent11() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        stack.add(document);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\uFFFF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        stack.add(document1);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.getImplicitParent(Tag.java:150)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:217) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", documentType, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = document;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent12() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:211) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class document1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", document1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = document1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseCdata
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseCdata()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<![CDATA[");
 *  */
    @Test
    public void testParseCdata_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseCdata(Parser.java:204) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCdataMethod = parserClazz.getDeclaredMethod("parseCdata");
        parseCdataMethod.setAccessible(true);
        java.lang.Object[] parseCdataMethodArguments = new java.lang.Object[0];
        try {
            parseCdataMethod.invoke(parser, parseCdataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseCdata()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<![CDATA[");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseCdata_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCdataMethod = parserClazz.getDeclaredMethod("parseCdata");
        parseCdataMethod.setAccessible(true);
        java.lang.Object[] parseCdataMethodArguments = new java.lang.Object[0];
        try {
            parseCdataMethod.invoke(parser, parseCdataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseCdata()
    
    @Test
    public void testParseCdata1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        LinkedList queue = new LinkedList();
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        queue.add(null);
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:77)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:145)
            org.jsoup.parser.Parser.parseCdata(Parser.java:204) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseCdataMethod = parserClazz.getDeclaredMethod("parseCdata");
        parseCdataMethod.setAccessible(true);
        java.lang.Object[] parseCdataMethodArguments = new java.lang.Object[0];
        try {
            parseCdataMethod.invoke(parser, parseCdataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.popStackToClose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToClose(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToClose(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (elToClose != null): False}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.returnsFrom {@code return elToClose;}
 *  */
    @Test
    public void testPopStackToClose_ElToCloseEqualsNull() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToCloseMethod = parserClazz.getDeclaredMethod("popStackToClose", tagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = ((Object) null);
        Element actual = ((Element) popStackToCloseMethod.invoke(parser, popStackToCloseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToClose(org.jsoup.parser.Tag)}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = stack.size() - 1; i > 0; i--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToClose(Parser.java:268) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToCloseMethod = parserClazz.getDeclaredMethod("popStackToClose", tagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = ((Object) null);
        try {
            popStackToCloseMethod.invoke(parser, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToClose(org.jsoup.parser.Tag)}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i > 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag elTag = el.tag();
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToClose(Parser.java:271) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToCloseMethod = parserClazz.getDeclaredMethod("popStackToClose", tagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = ((Object) null);
        try {
            popStackToCloseMethod.invoke(parser, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method popStackToClose(org.jsoup.parser.Tag)
    
    @Test
    public void testPopStackToClose1() throws Throwable  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        Tag prevDefaultAncestor = ((Tag) getStaticFieldValue(tagClazz, "defaultAncestor"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Tag defaultAncestor = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "BODY";
            setField(defaultAncestor, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "isBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainInline", true);
            setStaticField(tagClazz, "defaultAncestor", defaultAncestor);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            LinkedList stack = new LinkedList();
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            stack.add(document);
            stack.add(document);
            stack.add(document);
            setField(parser, "org.jsoup.parser.Parser", "stack", stack);
            
            /* This test fails because method [org.jsoup.parser.Parser.popStackToClose] produces [java.lang.NullPointerException]
                org.jsoup.parser.Parser.popStackToClose(Parser.java:272) */
            Class parserClazz = Class.forName("org.jsoup.parser.Parser");
            Method popStackToCloseMethod = parserClazz.getDeclaredMethod("popStackToClose", tagClazz);
            popStackToCloseMethod.setAccessible(true);
            java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
            popStackToCloseMethodArguments[0] = ((Object) null);
            try {
                popStackToCloseMethod.invoke(parser, popStackToCloseMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.popStackToSuitableContainer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToSuitableContainer(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code while(!stack.isEmpty())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testPopStackToSuitableContainer_LinkedListIsEmpty() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = ((Object) null);
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToSuitableContainer(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code while(!stack.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!stack.isEmpty())
 *  */
    @Test
    public void testPopStackToSuitableContainer_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:255) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = ((Object) null);
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code while(!stack.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: last().tag().canContain(tag)
 *  */
    @Test
    public void testPopStackToSuitableContainer_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = ((Object) null);
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code while(!stack.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: last().tag().canContain(tag)
 *  */
    @Test
    public void testPopStackToSuitableContainer_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = ((Object) null);
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method popStackToSuitableContainer(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code while(!stack.isEmpty())} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: last().tag().canContain(tag)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPopStackToSuitableContainer_ThrowIllegalArgumentException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = ((Object) null);
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method popStackToSuitableContainer(org.jsoup.parser.Tag)
    
    @Test
    public void testPopStackToSuitableContainer1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testPopStackToSuitableContainer2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer3() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testPopStackToSuitableContainer4() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "h\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer5() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testPopStackToSuitableContainer6() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer7() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer8() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer9() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "h\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer10() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testPopStackToSuitableContainer11() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer12() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    
    @Test
    public void testPopStackToSuitableContainer13() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Document actual = ((Document) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        Tag documentTag = ((Tag) getFieldValue(document, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(documentTag, actualTag);
        
        Set actualClassNames = ((Set) getFieldValue(actual, "org.jsoup.nodes.Element", "classNames"));
        assertNull(actualClassNames);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
    }
    
    @Test
    public void testPopStackToSuitableContainer14() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        Element actual = ((Element) popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments));
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method popStackToSuitableContainer(org.jsoup.parser.Tag)
    
    @Test
    public void testPopStackToSuitableContainer15() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer16() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer17() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer18() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer19() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer20() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer21() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer22() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer23() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer24() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer25() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer26() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer27() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer28() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer29() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tagType);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer30() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer31() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer32() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer33() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer34() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer35() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer36() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer37() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToSuitableContainer38() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.popStackToSuitableContainer] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:256) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method popStackToSuitableContainerMethod = parserClazz.getDeclaredMethod("popStackToSuitableContainer", tag1Type);
        popStackToSuitableContainerMethod.setAccessible(true);
        java.lang.Object[] popStackToSuitableContainerMethodArguments = new java.lang.Object[1];
        popStackToSuitableContainerMethodArguments[0] = tag1;
        try {
            popStackToSuitableContainerMethod.invoke(parser, popStackToSuitableContainerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.stackHasValidParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stackHasValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testStackHasValidParent_ReturnFalse() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testStackHasValidParent_ReturnTrue() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testStackHasValidParent_ReturnTrue_3() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag2);
        ancestors.add(tag);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testStackHasValidParent_ReturnTrue_1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testStackHasValidParent_ReturnTrue_2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag2);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stackHasValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.size() == 1 && childTag.equals(htmlTag)
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:241) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = ((Object) null);
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent2.isValidParent(childTag)
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = ((Object) null);
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:246) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:246) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:246) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:246) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = ((Object) null);
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method stackHasValidParent(org.jsoup.parser.Tag)
    
    @Test
    public void testStackHasValidParent1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\u0000\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[2] = ((Object) document);
        ancestors.add(objectArray);
        ancestors.add(objectArray);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method stackHasValidParent(org.jsoup.parser.Tag)
    
    @Test
    public void testStackHasValidParent2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        ancestors.add(document);
        ancestors.add(document);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.ClassCastException: class org.jsoup.nodes.Document cannot be cast to class org.jsoup.parser.Tag (org.jsoup.nodes.Document and org.jsoup.parser.Tag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            org.jsoup.parser.Tag.isValidParent(Tag.java:157)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testStackHasValidParent3() throws Throwable  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        Tag prevDefaultAncestor = ((Tag) getStaticFieldValue(tagClazz, "defaultAncestor"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Tag defaultAncestor = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "BODY";
            setField(defaultAncestor, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "isBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainInline", true);
            setStaticField(tagClazz, "defaultAncestor", defaultAncestor);
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            LinkedList stack = new LinkedList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            stack.add(element);
            setField(parser, "org.jsoup.parser.Parser", "stack", stack);
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            
            /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
                org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247) */
            Class parserClazz = Class.forName("org.jsoup.parser.Parser");
            Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagClazz);
            stackHasValidParentMethod.setAccessible(true);
            java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
            stackHasValidParentMethodArguments[0] = tag;
            try {
                stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
    }
    
    @Test
    public void testStackHasValidParent4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element1);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:247) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testStackHasValidParent5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag2, "org.jsoup.parser.Tag", "empty", true);
        ancestors.add(tag2);
        ancestors.add(tag1);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:246) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields991846125911800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields991846125911800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass991846125916500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields991846125911800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass991846125916500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields991846126240900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields991846126240900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass991846126242800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields991846126240900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass991846126242800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields991846130016900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields991846130016900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass991846130018800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields991846130016900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass991846130018800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields991846130589400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields991846130589400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass991846130590900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields991846130589400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass991846130590900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

