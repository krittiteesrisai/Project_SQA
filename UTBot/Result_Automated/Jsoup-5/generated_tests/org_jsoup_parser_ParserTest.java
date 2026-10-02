package org.jsoup.parser;

import org.junit.Test;
import java.util.LinkedList;
import java.lang.reflect.Method;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.nodes.Entities;
import sun.nio.cs.UTF_8;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Set;
import org.jsoup.nodes.Node;
import java.util.Map;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Attribute;
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
            org.jsoup.parser.Parser.last(Parser.java:314) */
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
            org.jsoup.parser.Parser.last(Parser.java:314) */
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
        String string = "";
        
        Parser.parse(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(html, baseUri, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() {
        Parser.parse(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseWithBlankStringAndNonEmptyString() throws Exception  {
        Document actual = Parser.parse("\n\t\r", "-\uFFF43");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
        Object charsetEncoder = createInstance("sun.nio.cs.UTF_8$Encoder");
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "this$0", expected);
        setField(expected, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        List ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        List excludes = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "excludes", excludes);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        List excludes1 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "excludes", excludes1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        List excludes2 = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes2);
        setField(expected, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "\n\t\r";
        setField(textNode, "org.jsoup.nodes.TextNode", "text", text);
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", expected);
        List childNodes1 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes1);
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
        setField(tag3, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        List excludes3 = new ArrayList();
        setField(tag3, "org.jsoup.parser.Tag", "excludes", excludes3);
        setField(tag3, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(tag3, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        element1.setBaseUri(baseUri);
        childNodes2.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes4 = new ArrayList();
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
        element2.setBaseUri(baseUri);
        setField(element2, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes2.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
        element.setBaseUri(baseUri);
        setField(element, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
        expected.setBaseUri(baseUri);
        
        Document.OutputSettings expectedOutputSettings = ((Document.OutputSettings) getFieldValue(expected, "org.jsoup.nodes.Document", "outputSettings"));
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        Entities.EscapeMode expectedOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        Entities.EscapeMode actualOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        assertEquals(expectedOutputSettingsEscapeMode, actualOutputSettingsEscapeMode);
        
        Charset expectedOutputSettingsCharset = ((Charset) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        Charset actualOutputSettingsCharset = ((Charset) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        // java.nio.charset.Charset has overridden equals method
        assertEquals(expectedOutputSettingsCharset, actualOutputSettingsCharset);
        
        CharsetEncoder expectedOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        CharsetEncoder actualOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        
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
        
        int expectedSiblingIndex = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(expectedSiblingIndex, actualSiblingIndex);
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseWithNonEmptyStrings() throws Exception  {
        Document actual = Parser.parse("#$\\\"'?", "#$\\\"'");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
        Object charsetEncoder = createInstance("sun.nio.cs.UTF_8$Encoder");
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "this$0", expected);
        setField(expected, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        List ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        List excludes = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "excludes", excludes);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        List excludes1 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "excludes", excludes1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        List excludes2 = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes2);
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
        setField(tag3, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        List excludes3 = new ArrayList();
        setField(tag3, "org.jsoup.parser.Tag", "excludes", excludes3);
        setField(tag3, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(tag3, "org.jsoup.parser.Tag", "limitChildren", true);
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
        String text = "#$\\\"'?";
        setField(textNode, "org.jsoup.nodes.TextNode", "text", text);
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
        List childNodes4 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        textNode.setBaseUri(baseUri);
        childNodes3.add(textNode);
        TextNode textNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text1 = " ";
        setField(textNode1, "org.jsoup.nodes.TextNode", "text", text1);
        setField(textNode1, "org.jsoup.nodes.Node", "parentNode", element2);
        List childNodes5 = new ArrayList();
        setField(textNode1, "org.jsoup.nodes.Node", "childNodes", childNodes5);
        String baseUri1 = "";
        textNode1.setBaseUri(baseUri1);
        setField(textNode1, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes3.add(textNode1);
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
        element2.setBaseUri(baseUri);
        setField(element2, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
        expected.setBaseUri(baseUri);
        
        Document.OutputSettings expectedOutputSettings = ((Document.OutputSettings) getFieldValue(expected, "org.jsoup.nodes.Document", "outputSettings"));
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        Entities.EscapeMode expectedOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        Entities.EscapeMode actualOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        assertEquals(expectedOutputSettingsEscapeMode, actualOutputSettingsEscapeMode);
        
        Charset expectedOutputSettingsCharset = ((Charset) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        Charset actualOutputSettingsCharset = ((Charset) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        // java.nio.charset.Charset has overridden equals method
        assertEquals(expectedOutputSettingsCharset, actualOutputSettingsCharset);
        
        CharsetEncoder expectedOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        CharsetEncoder actualOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        
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
        
        int expectedSiblingIndex = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(expectedSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testParse1() throws Exception  {
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
            String string = "";
            String string1 = "";
            
            Parser.parse(string, string1);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matchesStartTag()
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -2);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesStartTag(TokenQueue.java:116)
            org.jsoup.parser.Parser.parse(Parser.java:83) */
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
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesCS(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matchesCS(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#matches(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.matches("<![CDATA[")
 *  */
    @Test
    public void testParse_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -2147483612);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -2147483612]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.peek(TokenQueue.java:42)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:215)
            org.jsoup.parser.Parser.parse(Parser.java:94) */
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
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tq.isEmpty())
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tq.isEmpty())
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parse()}
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doc.normalise();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parse(Parser.java:97) */
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
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doc.normalise();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
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
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:137)
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:141)
            org.jsoup.nodes.Document.normalise(Document.java:99)
            org.jsoup.parser.Parser.parse(Parser.java:97) */
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
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doc.normalise();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:140)
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:141)
            org.jsoup.nodes.Document.normalise(Document.java:99)
            org.jsoup.parser.Parser.parse(Parser.java:97) */
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
 * @utbot.iterates iterate the loop {@code while(!tq.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return doc.normalise();
 *  */
    @Test
    public void testParse_ThrowNullPointerException_4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
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
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:137)
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:141)
            org.jsoup.nodes.Document.normalise(Document.java:99)
            org.jsoup.parser.Parser.parse(Parser.java:97) */
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
    public void testParse2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes1 = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        childNodes.add(element);
        childNodes.add(tq);
        childNodes.add(tq);
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.ClassCastException: class org.jsoup.parser.TokenQueue cannot be cast to class org.jsoup.nodes.Node (org.jsoup.parser.TokenQueue and org.jsoup.nodes.Node are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.jsoup.nodes.Document.findFirstElementByTagName(Document.java:140)
            org.jsoup.nodes.Document.normalise(Document.java:99)
            org.jsoup.parser.Parser.parse(Parser.java:97) */
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
    
    @Test(expected = StackOverflowError.class)
    public void testParse3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "h\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(null);
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
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
    public void testParse4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parse] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.last(Parser.java:314)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:222)
            org.jsoup.parser.Parser.parse(Parser.java:94) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse()
    
    @Test(expected = IllegalArgumentException.class)
    public void testParse5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(doc, "org.jsoup.nodes.Node", "childNodes", childNodes);
        setField(parser, "org.jsoup.parser.Parser", "doc", doc);
        
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
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseBodyFragmentRelaxed
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(bodyHtml, baseUri, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_ThrowIllegalArgumentException() {
        Parser.parseBodyFragmentRelaxed(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Parser parser = new Parser(bodyHtml, baseUri, true);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseBodyFragmentRelaxed_ThrowIllegalArgumentException_1() {
        String string = "";
        
        Parser.parseBodyFragmentRelaxed(string, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseBodyFragmentRelaxed(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragmentRelaxed(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseBodyFragmentRelaxedWithBlankStringAndNonEmptyString() throws Exception  {
        Document actual = Parser.parseBodyFragmentRelaxed("\n\t\r", "-\uFFF43");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
        Object charsetEncoder = createInstance("sun.nio.cs.UTF_8$Encoder");
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "this$0", expected);
        setField(expected, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        List ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        List excludes = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "excludes", excludes);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        List excludes1 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "excludes", excludes1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        List excludes2 = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes2);
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
        setField(tag3, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        List excludes3 = new ArrayList();
        setField(tag3, "org.jsoup.parser.Tag", "excludes", excludes3);
        setField(tag3, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(tag3, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes2 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "-\uFFF43";
        element1.setBaseUri(baseUri);
        childNodes1.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "\n\t\r";
        setField(textNode, "org.jsoup.nodes.TextNode", "text", text);
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
        List childNodes4 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        textNode.setBaseUri(baseUri);
        childNodes3.add(textNode);
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
        element2.setBaseUri(baseUri);
        setField(element2, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
        expected.setBaseUri(baseUri);
        
        Document.OutputSettings expectedOutputSettings = ((Document.OutputSettings) getFieldValue(expected, "org.jsoup.nodes.Document", "outputSettings"));
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        Entities.EscapeMode expectedOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        Entities.EscapeMode actualOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        assertEquals(expectedOutputSettingsEscapeMode, actualOutputSettingsEscapeMode);
        
        Charset expectedOutputSettingsCharset = ((Charset) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        Charset actualOutputSettingsCharset = ((Charset) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        // java.nio.charset.Charset has overridden equals method
        assertEquals(expectedOutputSettingsCharset, actualOutputSettingsCharset);
        
        CharsetEncoder expectedOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        CharsetEncoder actualOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        
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
        
        int expectedSiblingIndex = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(expectedSiblingIndex, actualSiblingIndex);
        
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
    public void testPopStackToSuitableContainer_NotStackIsEmpty() throws Exception  {
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
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:281) */
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
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282) */
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
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.stackHasValidParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stackHasValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testStackHasValidParent_ReturnFalse() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): False}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testStackHasValidParent_Parent2IsValidAncestor() throws Exception  {
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
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent() throws Exception  {
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
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
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
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_6() throws Exception  {
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
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_4() throws Exception  {
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
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_5() throws Exception  {
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tag1Type = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tag1Type);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag1;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_2() throws Exception  {
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
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
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
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_3() throws Exception  {
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
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName);
        ancestors.add(tag2);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag1, "org.jsoup.parser.Tag", "directDescendant", true);
        
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
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.returnsFrom {@code return stack.getLast().tag().isValidParent(childTag);}
 *  */
    @Test
    public void testStackHasValidParent_ChildTagRequiresSpecificParent_1() throws Exception  {
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
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        boolean actual = ((Boolean) stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method stackHasValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return stack.getLast().tag().isValidParent(childTag);
 *  */
    @Test
    public void testStackHasValidParent_ThrowNoSuchElementException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.getLast(LinkedList.java:261)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:267) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.size() == 1 && childTag.equals(htmlTag)
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:263) */
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
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): False}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent2.isValidAncestor(childTag)
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_5() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:273) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): False}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:272) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.invokes {@link org.jsoup.parser.Tag#requiresSpecificParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: childTag.requiresSpecificParent()
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
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:266) */
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
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): False}
 * @utbot.iterates iterate the loop {@code for(int i = stack.size() - 1; i >= 0; i--)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag parent2 = el.tag();
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_6() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
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
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:272) */
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
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack.getLast().tag().isValidParent(childTag);
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_2() throws Throwable  {
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
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:267) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#stackHasValidParent(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (stack.size() == 1): False}
 * @utbot.executesCondition {@code (childTag.requiresSpecificParent()): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return stack.getLast().tag().isValidParent(childTag);
 *  */
    @Test
    public void testStackHasValidParent_ThrowNullPointerException_3() throws Throwable  {
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
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        
        /* This test fails because method [org.jsoup.parser.Parser.stackHasValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:267) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class tagType = Class.forName("org.jsoup.parser.Tag");
        Method stackHasValidParentMethod = parserClazz.getDeclaredMethod("stackHasValidParent", tagType);
        stackHasValidParentMethod.setAccessible(true);
        java.lang.Object[] stackHasValidParentMethodArguments = new java.lang.Object[1];
        stackHasValidParentMethodArguments[0] = tag;
        try {
            stackHasValidParentMethod.invoke(parser, stackHasValidParentMethodArguments);
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseBodyFragment(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Parser}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseBodyFragment(java.lang.String,java.lang.String)}
     */
    @Test
    public void testParseBodyFragmentWithBlankStringAndNonEmptyString() throws Exception  {
        Document actual = Parser.parseBodyFragment("\n\t\r", "-\uFFF43");
        
        Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
        UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
        Object charsetEncoder = createInstance("sun.nio.cs.UTF_8$Encoder");
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder", charsetEncoder);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "this$0", expected);
        setField(expected, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag2, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "canContainInline", true);
        List ancestors2 = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        List excludes = new ArrayList();
        setField(tag2, "org.jsoup.parser.Tag", "excludes", excludes);
        ancestors1.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        List excludes1 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "excludes", excludes1);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        List excludes2 = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes2);
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
        setField(tag3, "org.jsoup.parser.Tag", "knownTag", true);
        setField(tag3, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag3, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors3 = new ArrayList();
        ancestors3.add(tag2);
        setField(tag3, "org.jsoup.parser.Tag", "ancestors", ancestors3);
        List excludes3 = new ArrayList();
        setField(tag3, "org.jsoup.parser.Tag", "excludes", excludes3);
        setField(tag3, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(tag3, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag3);
        setField(element1, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes2 = new ArrayList();
        setField(element1, "org.jsoup.nodes.Node", "childNodes", childNodes2);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element1, "org.jsoup.nodes.Node", "attributes", attributes);
        String baseUri = "-\uFFF43";
        element1.setBaseUri(baseUri);
        childNodes1.add(element1);
        Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element2, "org.jsoup.nodes.Element", "tag", tag1);
        setField(element2, "org.jsoup.nodes.Node", "parentNode", element);
        ArrayList childNodes3 = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "\n\t\r";
        setField(textNode, "org.jsoup.nodes.TextNode", "text", text);
        setField(textNode, "org.jsoup.nodes.Node", "parentNode", element2);
        List childNodes4 = new ArrayList();
        setField(textNode, "org.jsoup.nodes.Node", "childNodes", childNodes4);
        textNode.setBaseUri(baseUri);
        childNodes3.add(textNode);
        setField(element2, "org.jsoup.nodes.Node", "childNodes", childNodes3);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes3 = new LinkedHashMap();
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes3);
        setField(element2, "org.jsoup.nodes.Node", "attributes", attributes2);
        element2.setBaseUri(baseUri);
        setField(element2, "org.jsoup.nodes.Node", "siblingIndex", 1);
        childNodes1.add(element2);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        Attributes attributes4 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes5 = new LinkedHashMap();
        setField(attributes4, "org.jsoup.nodes.Attributes", "attributes", attributes5);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes4);
        element.setBaseUri(baseUri);
        childNodes.add(element);
        setField(expected, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes6 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes7 = new LinkedHashMap();
        setField(attributes6, "org.jsoup.nodes.Attributes", "attributes", attributes7);
        setField(expected, "org.jsoup.nodes.Node", "attributes", attributes6);
        expected.setBaseUri(baseUri);
        
        Document.OutputSettings expectedOutputSettings = ((Document.OutputSettings) getFieldValue(expected, "org.jsoup.nodes.Document", "outputSettings"));
        Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
        Entities.EscapeMode expectedOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        Entities.EscapeMode actualOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
        assertEquals(expectedOutputSettingsEscapeMode, actualOutputSettingsEscapeMode);
        
        Charset expectedOutputSettingsCharset = ((Charset) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        Charset actualOutputSettingsCharset = ((Charset) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
        // java.nio.charset.Charset has overridden equals method
        assertEquals(expectedOutputSettingsCharset, actualOutputSettingsCharset);
        
        CharsetEncoder expectedOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        CharsetEncoder actualOutputSettingsCharsetEncoder = ((CharsetEncoder) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charsetEncoder"));
        
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
        
        int expectedSiblingIndex = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(expectedSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseComment
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseComment()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("<!--");
 *  */
    @Test
    public void testParseComment_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -4);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseComment(Parser.java:101) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<!--");
 *  */
    @Test
    public void testParseComment_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseComment(Parser.java:101) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<!--");
 *  */
    @Test
    public void testParseComment_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseComment(Parser.java:101) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<!--");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseComment_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<!--");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseComment_ThrowIllegalStateException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseComment()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<!--");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseComment_ThrowIllegalStateException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "A-";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -2);
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
        String queue = "-\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseComment] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseComment(Parser.java:101) */
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseComment()
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseComment2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000<!--\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 2);
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseComment3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000<!--\u0000\u0000\u0000-->";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 15);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseCdata
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseCdata()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("<![CDATA[");
 *  */
    @Test
    public void testParseCdata_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -9);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseCdata(Parser.java:226) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("<![CDATA[");
 *  */
    @Test
    public void testParseCdata_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseCdata(Parser.java:226) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<![CDATA[");
 *  */
    @Test
    public void testParseCdata_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseCdata(Parser.java:226) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<![CDATA[");
 *  */
    @Test
    public void testParseCdata_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseCdata] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseCdata(Parser.java:226) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<![CDATA[");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseCdata_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseCdata()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<![CDATA[");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseCdata_ThrowIllegalStateException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "K";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -8);
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseCdata()
    
    @Test(expected = IllegalStateException.class)
    public void testParseCdata1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000[CDAta[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
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
            org.jsoup.parser.Parser.popStackToClose(Parser.java:294) */
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
            org.jsoup.parser.Parser.popStackToClose(Parser.java:297) */
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
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            
            /* This test fails because method [org.jsoup.parser.Parser.popStackToClose] produces [java.lang.NullPointerException]
                org.jsoup.parser.Parser.popStackToClose(Parser.java:298) */
            Class parserClazz = Class.forName("org.jsoup.parser.Parser");
            Method popStackToCloseMethod = parserClazz.getDeclaredMethod("popStackToClose", tagClazz);
            popStackToCloseMethod.setAccessible(true);
            java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
            popStackToCloseMethodArguments[0] = tag;
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
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseXmlDecl
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseXmlDecl()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("<");
 *  */
    @Test
    public void testParseXmlDecl_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:111) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: Character firstChar = tq.consume();
 *  */
    @Test
    public void testParseXmlDecl_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "<";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:112) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseXmlDecl_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:111) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseXmlDecl_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseXmlDecl] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseXmlDecl(Parser.java:111) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseXmlDecl_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseXmlDecl()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseXmlDecl_ThrowIllegalStateException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseXmlDecl()
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseXmlDecl1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000<\u0100";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 37);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseEndTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseEndTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consume(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeTagName()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#chompTo(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testParseEndTag_StringLength() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "</";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseEndTagMethod = parserClazz.getDeclaredMethod("parseEndTag");
        parseEndTagMethod.setAccessible(true);
        java.lang.Object[] parseEndTagMethodArguments = new java.lang.Object[0];
        parseEndTagMethod.invoke(parser, parseEndTagMethodArguments);
        
        TokenQueue parserTq = ((TokenQueue) getFieldValue(parser, "org.jsoup.parser.Parser", "tq"));
        int finalParserTqPos = ((Integer) getFieldValue(parserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(2, finalParserTqPos);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseEndTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("</");
 *  */
    @Test
    public void testParseEndTag_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -2);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseEndTag(Parser.java:121) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("</");
 *  */
    @Test
    public void testParseEndTag_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "/";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseEndTag(Parser.java:121) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("</");
 *  */
    @Test
    public void testParseEndTag_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseEndTag(Parser.java:121) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("</");
 *  */
    @Test
    public void testParseEndTag_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseEndTag(Parser.java:121) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("</");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseEndTag_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseEndTag()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("</");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseEndTag_ThrowIllegalStateException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseStartTag
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseStartTag()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consume("<");
 *  */
    @Test
    public void testParseStartTag_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseStartTag] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:74)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseStartTag(Parser.java:132) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseStartTag_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseStartTag(Parser.java:132) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tq.consume("<");
 *  */
    @Test
    public void testParseStartTag_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.matches(TokenQueue.java:70)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:175)
            org.jsoup.parser.Parser.parseStartTag(Parser.java:132) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseStartTag_ThrowIllegalStateException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tq.consume("<");
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParseStartTag_ThrowIllegalStateException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "[";
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseStartTag()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeTagName()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName, "Unexpectedly empty tagname. (This should not occur, please report!)");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseStartTag_ThrowIllegalArgumentException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "<";
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseAttribute
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAttribute()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseAttribute()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParseAttribute_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:182) */
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
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeAttributeKey()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeWhitespace()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: tq.consumeWhitespace();
 *  */
    @Test
    public void testParseAttribute_ThrowStringIndexOutOfBoundsException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:206) */
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
            org.jsoup.parser.Parser.parseAttribute(Parser.java:182) */
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
    public void testParseAttribute_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.matchesWhitespace(TokenQueue.java:139)
            org.jsoup.parser.TokenQueue.consumeWhitespace(TokenQueue.java:315)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:182) */
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
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\n\n\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 10);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        Attribute actual = ((Attribute) parseAttributeMethod.invoke(parser, parseAttributeMethodArguments));
        
        assertNull(actual);
        
        TokenQueue parserTq = ((TokenQueue) getFieldValue(parser, "org.jsoup.parser.Parser", "tq"));
        int finalParserTqPos = ((Integer) getFieldValue(parserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(13, finalParserTqPos);
    }
    
    @Test
    public void testParseAttribute2() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 39);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseAttributeMethod = parserClazz.getDeclaredMethod("parseAttribute");
        parseAttributeMethod.setAccessible(true);
        java.lang.Object[] parseAttributeMethodArguments = new java.lang.Object[0];
        Attribute actual = ((Attribute) parseAttributeMethod.invoke(parser, parseAttributeMethodArguments));
        
        assertNull(actual);
        
        TokenQueue parserTq = ((TokenQueue) getFieldValue(parser, "org.jsoup.parser.Parser", "tq"));
        int finalParserTqPos = ((Integer) getFieldValue(parserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(40, finalParserTqPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseAttribute()
    
    @Test
    public void testParseAttribute3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\r";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseAttribute] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: 1]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.consume(TokenQueue.java:162)
            org.jsoup.parser.Parser.parseAttribute(Parser.java:206) */
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
    
    ///region Test suites for executable org.jsoup.parser.Parser.parseTextNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseTextNode()
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} when: tq.peek().equals('<')
 *  */
    @Test
    public void testParseTextNode_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "  ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", -3);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.StringIndexOutOfBoundsException: String index out of range: -3]
            java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
            java.base/java.lang.String.charAt(String.java:1519)
            org.jsoup.parser.TokenQueue.peek(TokenQueue.java:42)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:215) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tq.peek().equals('<')
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseTextNode(Parser.java:215) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.TokenQueue.remainingLength(TokenQueue.java:34)
            org.jsoup.parser.TokenQueue.isEmpty(TokenQueue.java:30)
            org.jsoup.parser.TokenQueue.peek(TokenQueue.java:42)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:215) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tq.peek().equals('<')
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = " ";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseTextNode(Parser.java:215) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#consumeTo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException_4() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 16);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.last(Parser.java:314)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:222) */
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
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#parseTextNode()}
 * @utbot.invokes {@link org.jsoup.parser.TokenQueue#advance()}
 * @utbot.invokes org.jsoup.parser.Parser#last()
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: last().appendChild(textNode);
 *  */
    @Test
    public void testParseTextNode_ThrowNullPointerException_3() throws Throwable  {
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
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "<";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        String baseUri = "";
        setField(parser, "org.jsoup.parser.Parser", "baseUri", baseUri);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseTextNode(Parser.java:222) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseTextNode()
    
    @Test
    public void testParseTextNode1() throws Exception  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        childNodes.add(null);
        childNodes.add(document);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Method parseTextNodeMethod = parserClazz.getDeclaredMethod("parseTextNode");
        parseTextNodeMethod.setAccessible(true);
        java.lang.Object[] parseTextNodeMethodArguments = new java.lang.Object[0];
        parseTextNodeMethod.invoke(parser, parseTextNodeMethodArguments);
        
        TokenQueue parserTq = ((TokenQueue) getFieldValue(parser, "org.jsoup.parser.Parser", "tq"));
        int finalParserTqPos = ((Integer) getFieldValue(parserTq, "org.jsoup.parser.TokenQueue", "pos"));
        
        assertEquals(1, finalParserTqPos);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseTextNode()
    
    @Test
    public void testParseTextNode2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 1);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.getLast(LinkedList.java:261)
            org.jsoup.parser.Parser.last(Parser.java:314)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:222) */
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
    
    @Test
    public void testParseTextNode3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        TokenQueue tq = ((TokenQueue) createInstance("org.jsoup.parser.TokenQueue"));
        String queue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000<\u0000\u0000\u0000\u0000\u0000";
        setField(tq, "org.jsoup.parser.TokenQueue", "queue", queue);
        setField(tq, "org.jsoup.parser.TokenQueue", "pos", 30);
        setField(parser, "org.jsoup.parser.Parser", "tq", tq);
        
        /* This test fails because method [org.jsoup.parser.Parser.parseTextNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.last(Parser.java:314)
            org.jsoup.parser.Parser.parseTextNode(Parser.java:222) */
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
    
    ///region Test suites for executable org.jsoup.parser.Parser.addChildToParent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    /**
    @utbot.classUnderTest {@link Parser}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Parser#addChildToParent(org.jsoup.nodes.Element,boolean)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: boolean validAncestor = stackHasValidParent(childTag);
 *  */
    @Test
    public void testAddChildToParent_ThrowNoSuchElementException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.getLast(LinkedList.java:261)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:267)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:235) */
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
    public void testAddChildToParent_ThrowNullPointerException() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
 * @utbot.executesCondition {@code (!relaxed): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.appendChild(child);
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException_3() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        setField(parser, "org.jsoup.parser.Parser", "relaxed", true);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.addChildToParent(Parser.java:255) */
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
    public void testAddChildToParent_ThrowNullPointerException_1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:281)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean validAncestor = stackHasValidParent(childTag);
 *  */
    @Test
    public void testAddChildToParent_ThrowNullPointerException_2() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:266)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:235) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.invokes org.jsoup.parser.Parser#popStackToSuitableContainer(org.jsoup.parser.Tag)
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
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        
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
    
    ///region OTHER: ERROR SUITE for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    @Test
    public void testAddChildToParent1() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        objectArray[2] = ((Object) document);
        stack.add(objectArray);
        stack.add(objectArray);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        ArrayList ancestors = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.jsoup.parser.Parser.last(Parser.java:314)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        ArrayList excludes = new ArrayList();
        excludes.add(null);
        excludes.add(null);
        excludes.add(document);
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.ClassCastException: class org.jsoup.nodes.Document cannot be cast to class org.jsoup.parser.Tag (org.jsoup.nodes.Document and org.jsoup.parser.Tag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3cd787f7)]
            org.jsoup.parser.Tag.canContain(Tag.java:103)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element1, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
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
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
    public void testAddChildToParent7() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        ArrayList excludes = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidAncestor(Tag.java:189)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:273)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:235) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
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
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        ancestors.add(stack);
        ancestors.add(document);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        ancestors.add(tag1);
        Object object = createInstance("java.lang.Object");
        ancestors.add(object);
        ancestors.add(object);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
    public void testAddChildToParent12() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        ancestors.add(tag1);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag2);
        ancestors.add(element);
        ancestors.add(element);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.canContain(Tag.java:102)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
    public void testAddChildToParent13() throws Throwable  {
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
        ArrayList excludes = new ArrayList();
        excludes.add(null);
        excludes.add(null);
        excludes.add(null);
        setField(tag, "org.jsoup.parser.Tag", "excludes", excludes);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidAncestor(Tag.java:189)
            org.jsoup.parser.Parser.stackHasValidParent(Parser.java:273)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:235) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent14() throws Throwable  {
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
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.canContain(Tag.java:89)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddChildToParent15() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(document);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.canContain(Tag.java:95)
            org.jsoup.parser.Parser.popStackToSuitableContainer(Parser.java:282)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:233) */
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
    public void testAddChildToParent16() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(tag, "org.jsoup.parser.Tag", "directDescendant", true);
        setField(tag, "org.jsoup.parser.Tag", "limitChildren", true);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag2, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag2, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag2);
        
        /* This test fails because method [org.jsoup.parser.Parser.addChildToParent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:269)
            org.jsoup.nodes.Element.appendChild(Element.java:211)
            org.jsoup.parser.Parser.addChildToParent(Parser.java:255) */
        Class parserClazz = Class.forName("org.jsoup.parser.Parser");
        Class element1Type = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method addChildToParentMethod = parserClazz.getDeclaredMethod("addChildToParent", element1Type, booleanType);
        addChildToParentMethod.setAccessible(true);
        java.lang.Object[] addChildToParentMethodArguments = new java.lang.Object[2];
        addChildToParentMethodArguments[0] = element1;
        addChildToParentMethodArguments[1] = false;
        try {
            addChildToParentMethod.invoke(parser, addChildToParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addChildToParent(org.jsoup.nodes.Element, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildToParent17() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddChildToParent18() throws Throwable  {
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        LinkedList stack = new LinkedList();
        setField(parser, "org.jsoup.parser.Parser", "stack", stack);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields992724177255800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields992724177255800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass992724177260300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992724177255800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992724177260300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields992724177619900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992724177619900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992724177620700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992724177619900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992724177620700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields992724180738800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992724180738800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992724180740200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992724180738800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992724180740200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields992724181201500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992724181201500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992724181202900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992724181201500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992724181202900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

