package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Tag;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import org.jsoup.select.Elements;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Evaluator.AttributeWithValueMatching;
import org.jsoup.select.Evaluator.Matches;
import org.jsoup.select.Selector.SelectorParseException;
import org.jsoup.select.Selector;
import java.util.LinkedHashSet;
import org.jsoup.nodes.Document.OutputSettings;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.io.StringWriter;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import sun.nio.cs.ISO_8859_1;
import java.util.regex.Pattern;
import java.lang.reflect.Constructor;
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
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_nodes_ElementTest {
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
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parent] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227) */
        element.parent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.append
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.append(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode2 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppend8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.append(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method append(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testAppend9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(element);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.append(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.clone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clone()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#clone()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (Element) super.clone();
 *  */
    @Test
    public void testClone_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.clone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.doClone(Element.java:1476)
            org.jsoup.nodes.Element.doClone(Element.java:39)
            org.jsoup.nodes.Node.clone(Node.java:647)
            org.jsoup.nodes.Element.clone(Element.java:1462) */
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
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return attr("class").trim();}
 *  */
    @Test
    public void testClassName_StringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method className()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#className()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return attr("class").trim();
 *  */
    @Test
    public void testClassName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.className] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Node.attr(Node.java:63)
            org.jsoup.nodes.Element.className(Element.java:1239) */
        element.className();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#className()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attr("class").trim();
 *  */
    @Test
    public void testClassName_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.className] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Node.attr(Node.java:63)
            org.jsoup.nodes.Element.className(Element.java:1239) */
        element.className();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method className()
    
    @Test
    public void testClassName1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u8000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributesAttributesKeys, 1));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes1AttributesKeys, 2));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes2AttributesKeys, 3));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes3AttributesKeys, 4));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes4AttributesKeys, 5));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes5AttributesKeys, 6));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes6AttributesKeys, 7));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes7AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
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
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.parent(Element.java:39)
            org.jsoup.nodes.Node.wrap(Node.java:347)
            org.jsoup.nodes.Element.wrap(Element.java:625) */
        element.wrap(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrap(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "\u0000";
            
            element.wrap(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.wrap(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.wrap(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWrap4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.wrap(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method wrap(java.lang.String)
    
    @Test
    public void testWrap5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseFragmentInput(Parser.java:39)
            org.jsoup.nodes.Node.wrap(Node.java:348)
            org.jsoup.nodes.Element.wrap(Element.java:625) */
        element.wrap(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method wrap(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testWrap6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode1);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.wrap(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "        ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Node.attr(Node.java:63)
            org.jsoup.nodes.Element.val(Element.java:1376) */
        element.val();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName().equals("textarea")
 *  */
    @Test
    public void testVal_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.val(Element.java:1373) */
        element.val();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVal_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Node.attr(Node.java:63)
            org.jsoup.nodes.Element.val(Element.java:1376) */
        element.val();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method val()
    
    @Test
    public void testVal1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "te\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        String actual = element.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testVal2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.val();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributesAttributesKeys, 0));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes1AttributesKeys, 1));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes2AttributesKeys, 2));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes3AttributesKeys, 3));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes4AttributesKeys, 4));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes5AttributesKeys, 5));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes6AttributesKeys, 6));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes7AttributesKeys, 7));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes8AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys0);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#text(java.lang.String)}
 *  */
    @Test
    public void testVal_ElementText() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Element actual = element.val(null);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
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
            org.jsoup.nodes.Element.val(Element.java:1385) */
        element.val(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method val(java.lang.String)
    
    @Test
    public void testVal3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Element actual = element.val(null);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testVal4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        
        Element actual = element.val(null);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testVal5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        FormElement parentNode1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000\u0000\u0000";
        
        Element actual = element.val(string);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testVal6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        Element actual = element.val(null);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testVal7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        Element actual = element.val(null);
        
        Tag elementTag = ((Tag) getFieldValue(element, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(elementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method val(java.lang.String)
    
    @Test
    public void testVal8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189)
            org.jsoup.nodes.Element.val(Element.java:1388) */
        element.val(null);
    }
    
    @Test
    public void testVal9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189)
            org.jsoup.nodes.Element.val(Element.java:1388) */
        element.val(null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method val(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testVal10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.val(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.data
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method data()
    
    @Test
    public void testData1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            
            String actual = element.data();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Element actual = element.empty();
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List elementChildNodes = element.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(elementChildNodes, actualChildNodes));
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
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
            org.jsoup.nodes.Element.empty(Element.java:613) */
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
    
    ///region Errors report for addClass
    
    public void testAddClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.id
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method id()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.returnsFrom {@code return attributes().getIgnoreCase("id");}
 *  */
    @Test
    public void testId_ReturnAttributesGetIgnoreCase() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributesAttributesKeys, 0));
        
        assertNull(finalElementAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.returnsFrom {@code return attributes().getIgnoreCase("id");}
 *  */
    @Test
    public void testId_ReturnAttributesGetIgnoreCase_1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            String actual = element.id();
            
            String expected = "";
            
            assertEquals(expected, actual);
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method id()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return attributes().getIgnoreCase("id");
 *  */
    @Test
    public void testId_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.id] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179) */
        element.id();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes().getIgnoreCase("id");
 *  */
    @Test
    public void testId_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.id] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179) */
        element.id();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method id()
    
    @Test
    public void testId1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributesAttributesKeys, 0));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes1AttributesKeys, 1));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes2AttributesKeys, 2));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes3AttributesKeys, 3));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes4AttributesKeys, 4));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes5AttributesKeys, 5));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes6AttributesKeys, 6));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes7AttributesKeys, 7));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes8AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys0);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
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
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.returnsFrom {@code return parents;}
 *  */
    @Test
    public void testParents_ReturnParents_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        Elements actual = element.parents();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = new java.lang.Object[10];
        elementData[0] = ((Object) parentNode);
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        setField(expected, "java.util.ArrayList", "size", 1);
        setField(expected, "java.util.AbstractList", "modCount", 1);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.returnsFrom {@code return parents;}
 *  */
    @Test
    public void testParents_ReturnParents_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "#root";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        Elements actual = element.parents();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parents()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#parents()}
 * @utbot.invokes org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes org.jsoup.nodes.Element#accumulateParents(org.jsoup.nodes.Element,org.jsoup.select.Elements)
 * @utbot.throwsException {@link java.lang.ClassCastException} in: accumulateParents(this, parents);
 *  */
    @Test
    public void testParents_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.accumulateParents(Element.java:241)
            org.jsoup.nodes.Element.parents(Element.java:236) */
        element.parents();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendTo
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendTo(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendTo(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(parent);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendTo_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendTo(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendTo(org.jsoup.nodes.Element)
    
    @Test
    public void testAppendTo1() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
            element.setParentNode(parentNode);
            element.siblingIndex = Integer.MIN_VALUE;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            /* This test fails because method [org.jsoup.nodes.Element.appendTo] produces [java.lang.IndexOutOfBoundsException: Index -2147483648 out of bounds for length 3]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:411)
                org.jsoup.nodes.Element.appendTo(Element.java:426) */
            element.appendTo(document);
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    @Test
    public void testAppendTo2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendTo] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.setParentNode(Node.java:420)
            org.jsoup.nodes.Node.reparentChild(Node.java:468)
            org.jsoup.nodes.Element.appendChild(Element.java:411)
            org.jsoup.nodes.Element.appendTo(Element.java:426) */
        element.appendTo(element1);
    }
    
    @Test
    public void testAppendTo3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendTo] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.FormElement.removeChild(FormElement.java:51)
            org.jsoup.nodes.Node.setParentNode(Node.java:420)
            org.jsoup.nodes.Node.reparentChild(Node.java:468)
            org.jsoup.nodes.Element.appendChild(Element.java:411)
            org.jsoup.nodes.Element.appendTo(Element.java:426) */
        element.appendTo(document);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.attr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,boolean)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attributes()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attributes().put(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        element.attr(((String) null), true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attr(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: attributes().put(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:138)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: attributes().put(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:192)
            org.jsoup.nodes.Attributes.put(Attributes.java:158)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes().put(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:138)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes().put(attributeKey, attributeValue);
 *  */
    @Test
    public void testAttr_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:118)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, boolean)
    
    @Test
    public void testAttr1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            Element actual = element.attr(string, false);
            
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            assertNull(actualTag);
            
            WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
            assertNull(actualShadowChildrenRef);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(elementAttributes, actualAttributes));
            
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
            assertNull(actualBaseUri);
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int elementSiblingIndex = element.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(elementSiblingIndex, actualSiblingIndex);
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test
    public void testAttr2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        Element actual = element.attr(string, false);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributes1AttributesKeys, 0));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes2AttributesKeys, 1));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes3AttributesKeys, 2));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes4AttributesKeys, 3));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes5AttributesKeys, 4));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes6AttributesKeys, 5));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes7AttributesKeys, 6));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes8AttributesKeys, 7));
        Attributes elementAttributes9 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes9AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes9, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes9AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys0);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    
    @Test
    public void testAttr3() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            Element actual = element.attr(string, true);
            
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            assertNull(actualTag);
            
            WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
            assertNull(actualShadowChildrenRef);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(elementAttributes, actualAttributes));
            
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
            assertNull(actualBaseUri);
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int elementSiblingIndex = element.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(elementSiblingIndex, actualSiblingIndex);
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test
    public void testAttr4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = new java.lang.String[24];
        attributes.keys = keys;
        java.lang.String[] vals = {null, null, null, null, null, null, null, null, null};
        attributes.vals = vals;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        Element actual = element.attr(string, true);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        int finalElementAttributesSize = ((Integer) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "size"));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes2AttributesKeys, 1));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes3AttributesKeys, 2));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes4AttributesKeys, 3));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes5AttributesKeys, 4));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes6AttributesKeys, 5));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes7AttributesKeys, 6));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes8AttributesKeys, 7));
        Attributes elementAttributes9 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes9AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes9, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes9AttributesKeys, 8));
        Attributes elementAttributes10 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes10AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes10, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys9 = ((String) get(elementAttributes10AttributesKeys, 9));
        Attributes elementAttributes11 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes11AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes11, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys10 = ((String) get(elementAttributes11AttributesKeys, 10));
        Attributes elementAttributes12 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes12AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes12, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys11 = ((String) get(elementAttributes12AttributesKeys, 11));
        Attributes elementAttributes13 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes13AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes13, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys12 = ((String) get(elementAttributes13AttributesKeys, 12));
        Attributes elementAttributes14 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes14AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes14, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys13 = ((String) get(elementAttributes14AttributesKeys, 13));
        Attributes elementAttributes15 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes15AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes15, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys14 = ((String) get(elementAttributes15AttributesKeys, 14));
        Attributes elementAttributes16 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes16AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes16, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys15 = ((String) get(elementAttributes16AttributesKeys, 15));
        Attributes elementAttributes17 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes17AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes17, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys16 = ((String) get(elementAttributes17AttributesKeys, 16));
        Attributes elementAttributes18 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes18AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes18, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys17 = ((String) get(elementAttributes18AttributesKeys, 17));
        Attributes elementAttributes19 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes19AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes19, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys18 = ((String) get(elementAttributes19AttributesKeys, 18));
        Attributes elementAttributes20 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes20AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes20, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys19 = ((String) get(elementAttributes20AttributesKeys, 19));
        Attributes elementAttributes21 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes21AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes21, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys20 = ((String) get(elementAttributes21AttributesKeys, 20));
        Attributes elementAttributes22 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes22AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes22, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys21 = ((String) get(elementAttributes22AttributesKeys, 21));
        Attributes elementAttributes23 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes23AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes23, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys22 = ((String) get(elementAttributes23AttributesKeys, 22));
        Attributes elementAttributes24 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes24AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes24, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys23 = ((String) get(elementAttributes24AttributesKeys, 23));
        Attributes elementAttributes25 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes25AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes25, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals0 = ((String) get(elementAttributes25AttributesVals, 0));
        Attributes elementAttributes26 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes26AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes26, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals1 = ((String) get(elementAttributes26AttributesVals, 1));
        Attributes elementAttributes27 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes27AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes27, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals2 = ((String) get(elementAttributes27AttributesVals, 2));
        Attributes elementAttributes28 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes28AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes28, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals3 = ((String) get(elementAttributes28AttributesVals, 3));
        Attributes elementAttributes29 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes29AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes29, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals4 = ((String) get(elementAttributes29AttributesVals, 4));
        Attributes elementAttributes30 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes30AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes30, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals5 = ((String) get(elementAttributes30AttributesVals, 5));
        Attributes elementAttributes31 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes31AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes31, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals6 = ((String) get(elementAttributes31AttributesVals, 6));
        Attributes elementAttributes32 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes32AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes32, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals7 = ((String) get(elementAttributes32AttributesVals, 7));
        Attributes elementAttributes33 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes33AttributesVals = ((java.lang.String[]) getFieldValue(elementAttributes33, "org.jsoup.nodes.Attributes", "vals"));
        String finalElementAttributesVals8 = ((String) get(elementAttributes33AttributesVals, 8));
        
        assertEquals(1, finalElementAttributesSize);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
        
        assertNull(finalElementAttributesKeys9);
        
        assertNull(finalElementAttributesKeys10);
        
        assertNull(finalElementAttributesKeys11);
        
        assertNull(finalElementAttributesKeys12);
        
        assertNull(finalElementAttributesKeys13);
        
        assertNull(finalElementAttributesKeys14);
        
        assertNull(finalElementAttributesKeys15);
        
        assertNull(finalElementAttributesKeys16);
        
        assertNull(finalElementAttributesKeys17);
        
        assertNull(finalElementAttributesKeys18);
        
        assertNull(finalElementAttributesKeys19);
        
        assertNull(finalElementAttributesKeys20);
        
        assertNull(finalElementAttributesKeys21);
        
        assertNull(finalElementAttributesKeys22);
        
        assertNull(finalElementAttributesKeys23);
        
        assertNull(finalElementAttributesVals0);
        
        assertNull(finalElementAttributesVals1);
        
        assertNull(finalElementAttributesVals2);
        
        assertNull(finalElementAttributesVals3);
        
        assertNull(finalElementAttributesVals4);
        
        assertNull(finalElementAttributesVals5);
        
        assertNull(finalElementAttributesVals6);
        
        assertNull(finalElementAttributesVals7);
        
        assertNull(finalElementAttributesVals8);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, boolean)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAttr5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        element.attr(((String) null), false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String, boolean)
    
    @Test
    public void testAttr6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483646);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 2]
            org.jsoup.nodes.Attributes.add(Attributes.java:117)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    @Test
    public void testAttr7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = new java.lang.String[24];
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:118)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    @Test
    public void testAttr8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:116)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    @Test
    public void testAttr9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:118)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    @Test
    public void testAttr10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:140)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    
    @Test
    public void testAttr11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:184)
            org.jsoup.nodes.Attributes.remove(Attributes.java:194)
            org.jsoup.nodes.Attributes.put(Attributes.java:158)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, false);
    }
    
    @Test
    public void testAttr12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:116)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Attributes.put(Attributes.java:156)
            org.jsoup.nodes.Element.attr(Element.java:204) */
        element.attr(string, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.attr
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr13() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        PseudoTextElement parentNode1 = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        Element actual = element.attr(string, string);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testAttr14() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        Element actual = element.attr(string, ((String) null));
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    
    @Test
    public void testAttr15() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase", true);
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "!";
        
        Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        
        Element actual = element.attr(string, ((String) null));
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node elementParentNode = element.parentNode;
        Node actualParentNode = actual.parentNode;
        // org.jsoup.nodes.Node has overridden equals method
        assertEquals(elementParentNode, actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        
        assertFalse(initialElementAttributes == finalElementAttributes);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method attr(java.lang.String, java.lang.String)
    
    @Test
    public void testAttr16() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttribute(ParseSettings.java:52)
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(((String) null), ((String) null));
    }
    
    @Test
    public void testAttr17() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttribute(ParseSettings.java:52)
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(((String) null), ((String) null));
    }
    
    @Test
    public void testAttr18() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(((String) null), ((String) null));
    }
    
    @Test
    public void testAttr19() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttribute(ParseSettings.java:52)
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(((String) null), ((String) null));
    }
    
    @Test
    public void testAttr20() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.parser.ParseSettings.normalizeAttribute(ParseSettings.java:52)
            org.jsoup.nodes.Node.attr(Node.java:85)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(((String) null), ((String) null));
    }
    
    @Test
    public void testAttr21() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase", true);
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.attr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:116)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:145)
            org.jsoup.nodes.Node.attr(Node.java:86)
            org.jsoup.nodes.Element.attr(Element.java:189) */
        element.attr(string, ((String) null));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method attr(java.lang.String, java.lang.String)
    
    @Test(timeout = 1000L)
    public void testAttr22() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.attr(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.is
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method is(org.jsoup.select.Evaluator)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(org.jsoup.select.Evaluator)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return evaluator.matches((Element) this.root(), this);
 *  */
    @Test
    public void testIs_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.is] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.is(Element.java:398) */
        element.is(((Evaluator) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(org.jsoup.select.Evaluator)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return evaluator.matches((Element) this.root(), this);
 *  */
    @Test
    public void testIs_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        /* This test fails because method [org.jsoup.nodes.Element.is] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:222)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.select.Evaluator$AttributeWithValueMatching.matches(Evaluator.java:289)
            org.jsoup.nodes.Element.is(Element.java:398) */
        element.is(attributeWithValueMatching);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(org.jsoup.select.Evaluator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluator.matches((Element) this.root(), this);
 *  */
    @Test
    public void testIs_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.is] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.is(Element.java:398) */
        element.is(((Evaluator) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(org.jsoup.select.Evaluator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluator.matches((Element) this.root(), this);
 *  */
    @Test
    public void testIs_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        /* This test fails because method [org.jsoup.nodes.Element.is] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:222)
            org.jsoup.nodes.Node.hasAttr(Node.java:103)
            org.jsoup.select.Evaluator$AttributeWithValueMatching.matches(Evaluator.java:289)
            org.jsoup.nodes.Element.is(Element.java:398) */
        element.is(attributeWithValueMatching);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(org.jsoup.select.Evaluator)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(org.jsoup.select.Evaluator)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#root()}
 * @utbot.invokes {@link org.jsoup.select.Evaluator#matches(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return evaluator.matches((Element) this.root(), this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIs_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        
        element.is(attributeWithValueMatching);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method is(org.jsoup.select.Evaluator)
    
    @Test
    public void testIs1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        boolean actual = element.is(attributeWithValueMatching);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIs2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        boolean actual = element.is(attributeWithValueMatching);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIs3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        boolean actual = element.is(attributeWithValueMatching);
        
        assertFalse(actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributesAttributesKeys, 0));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes1AttributesKeys, 1));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes2AttributesKeys, 2));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes3AttributesKeys, 3));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes4AttributesKeys, 4));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes5AttributesKeys, 5));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes6AttributesKeys, 6));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes7AttributesKeys, 7));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes8AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys0);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    
    @Test
    public void testIs4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        String key = "";
        setField(attributeWithValueMatching, "org.jsoup.select.Evaluator$AttributeWithValueMatching", "key", key);
        
        boolean actual = element.is(attributeWithValueMatching);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method is(org.jsoup.select.Evaluator)
    
    @Test
    public void testIs5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        Evaluator.Matches matches = new Evaluator.Matches(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.is] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.nodes.Element.text(Element.java:1057)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:724)
            org.jsoup.nodes.Element.is(Element.java:398) */
        element.is(matches);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(org.jsoup.select.Evaluator)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIs6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Element parentNode2 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        
        element.is(attributeWithValueMatching);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method is(org.jsoup.select.Evaluator)
    
    @Test(timeout = 1000L)
    public void testIs7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        Evaluator.AttributeWithValueMatching attributeWithValueMatching = ((Evaluator.AttributeWithValueMatching) createInstance("org.jsoup.select.Evaluator$AttributeWithValueMatching"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.is(attributeWithValueMatching);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.is
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#is(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.select.QueryParser#parse(java.lang.String)}
 * @utbot.throwsException {@link org.jsoup.select.Selector$SelectorParseException} in: return is(QueryParser.parse(cssQuery));
 *  */
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs_ThrowSelectorParseException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.is(((String) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method is(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\n ";
        
        element.is(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\f";
        
        element.is(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\t\u0000";
        
        element.is(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\r\u0000";
        
        element.is(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testIs12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.is(string);
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
        element.siblingIndex = -255;
        
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
        element.siblingIndex = -255;
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
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.parent(Element.java:39)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:334)
            org.jsoup.nodes.Node.before(Node.java:287)
            org.jsoup.nodes.Element.before(Element.java:571) */
        element.before(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method before(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testBefore1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.before(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBefore2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode2 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        DocumentType parentNode3 = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.before(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBefore3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        element.before(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method before(java.lang.String)
    
    @Test
    public void testBefore4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        CDataNode parentNode2 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Document parentNode3 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode3, "org.jsoup.nodes.Document", "parser", parser);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseFragmentInput(Parser.java:39)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:335)
            org.jsoup.nodes.Node.before(Node.java:287)
            org.jsoup.nodes.Element.before(Element.java:571) */
        element.before(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method before(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testBefore5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        parentNode1.setParentNode(parentNode1);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        element.before(((Node) document));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            element.setParentNode(parentNode);
            element.siblingIndex = -1;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            
            /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.addAll(ArrayList.java:700)
                org.jsoup.nodes.Node.addChildren(Node.java:463)
                org.jsoup.nodes.Node.before(Node.java:301)
                org.jsoup.nodes.Element.before(Element.java:582) */
            element.before(((Node) document));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method before(org.jsoup.nodes.Node)
    
    @Test
    public void testBefore6() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
            element.setParentNode(parentNode);
            DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            FormElement parentNode1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            documentType.setParentNode(parentNode1);
            
            /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.FormElement.removeChild(FormElement.java:51)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Node.addChildren(Node.java:461)
                org.jsoup.nodes.Node.before(Node.java:301)
                org.jsoup.nodes.Element.before(Element.java:582) */
            element.before(((Node) documentType));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    @Test
    public void testBefore7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        CDataNode cDataNode = new CDataNode(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:463)
            org.jsoup.nodes.Node.before(Node.java:301)
            org.jsoup.nodes.Element.before(Element.java:582) */
        element.before(((Node) cDataNode));
    }
    
    @Test
    public void testBefore8() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            setStaticField(leafNodeClazz, "EmptyNodes", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            element.setParentNode(parentNode);
            CDataNode cDataNode = new CDataNode(null);
            Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            cDataNode.parentNode = parentNode1;
            
            /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Node.addChildren(Node.java:461)
                org.jsoup.nodes.Node.before(Node.java:301)
                org.jsoup.nodes.Element.before(Element.java:582) */
            element.before(((Node) cDataNode));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
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
    public void testAfter_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.after(((Node) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        element.after(((Node) document));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method after(org.jsoup.nodes.Node)
    
    @Test
    public void testAfter1() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
            element.setParentNode(parentNode);
            element.siblingIndex = -3;
            Comment comment = new Comment(null, null);
            
            /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index: -2, Size: 3]
                java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
                java.base/java.util.ArrayList.addAll(ArrayList.java:700)
                org.jsoup.nodes.Node.addChildren(Node.java:463)
                org.jsoup.nodes.Node.after(Node.java:326)
                org.jsoup.nodes.Element.after(Element.java:605) */
            element.after(((Node) comment));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    @Test
    public void testAfter2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.addChildren(Node.java:463)
            org.jsoup.nodes.Node.after(Node.java:326)
            org.jsoup.nodes.Element.after(Element.java:605) */
        element.after(((Node) element1));
    }
    
    @Test
    public void testAfter3() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            setStaticField(leafNodeClazz, "EmptyNodes", null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
            element.setParentNode(parentNode);
            CDataNode cDataNode = new CDataNode(null);
            Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            cDataNode.parentNode = parentNode1;
            
            /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Node.addChildren(Node.java:461)
                org.jsoup.nodes.Node.after(Node.java:326)
                org.jsoup.nodes.Element.after(Element.java:605) */
            element.after(((Node) cDataNode));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    @Test
    public void testAfter4() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
            element.setParentNode(parentNode);
            Comment comment = new Comment(null, null);
            
            /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:475)
                org.jsoup.nodes.Node.addChildren(Node.java:464)
                org.jsoup.nodes.Node.after(Node.java:326)
                org.jsoup.nodes.Element.after(Element.java:605) */
            element.after(((Node) comment));
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
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
    public void testAfter_ThrowIllegalArgumentException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.siblingIndex = -255;
        
        element.after(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.siblingIndex = -255;
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
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.parent(Element.java:39)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:334)
            org.jsoup.nodes.Node.after(Node.java:312)
            org.jsoup.nodes.Element.after(Element.java:594) */
        element.after(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method after(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAfter5() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            element.setParentNode(parentNode);
            String string = "";
            
            element.after(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAfter6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        element.after(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAfter7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.after(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method after(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testAfter8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        CDataNode parentNode1 = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        parentNode1.setParentNode(parentNode1);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.after(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prepend
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prepend(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prepend(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prepend(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend2() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            element.prepend(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        FormElement parentNode2 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend6() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
            element.setParentNode(parentNode);
            String string = "";
            
            element.prepend(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        DataNode parentNode1 = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prepend(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prepend(java.lang.String)
    
    @Test
    public void testPrepend10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode2, "org.jsoup.nodes.Document", "parser", parser);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.prepend] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseFragmentInput(Parser.java:39)
            org.jsoup.nodes.Element.prepend(Element.java:557) */
        element.prepend(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method prepend(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testPrepend11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(element);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.prepend(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.baseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method baseUri()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#baseUri()}
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
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
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
        
        element.text(null);
    }
    ///endregion
    
    ///region Errors report for text
    
    public void testText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region OTHER: ERROR SUITE for method text()
    
    @Test
    public void testText1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
            element.setParentNode(parentNode);
            
            /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.isBlock(Element.java:170)
                org.jsoup.nodes.Element$1.tail(Element.java:1075)
                org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:55)
                org.jsoup.nodes.Element.text(Element.java:1057) */
            element.text();
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
    }
    
    @Test
    public void testText2() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            
            /* This test fails because method [org.jsoup.nodes.Element.text] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.isBlock(Element.java:170)
                org.jsoup.nodes.Element$1.tail(Element.java:1075)
                org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:55)
                org.jsoup.nodes.Element.text(Element.java:1057) */
            element.text();
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.child
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.invokes org.jsoup.nodes.Element#childElementsList()
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return childElementsList().get(index);}
 *  */
    @Test
    public void testChild_ListGet() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        ArrayList referent = new ArrayList();
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        Element actual = element.child(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return childElementsList().get(index);
 *  */
    @Test
    public void testChild_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return childElementsList().get(index);
 *  */
    @Test
    public void testChild_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        Object object = createInstance("java.lang.Object");
        referent.add(object);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Element (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(0);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return childElementsList().get(index);
 *  */
    @Test
    public void testChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        ArrayList referent = new ArrayList();
        referent.add(null);
        referent.add(null);
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return childElementsList().get(index);
 *  */
    @Test
    public void testChild_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method child(int)
    
    @Test
    public void testChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(0);
    }
    
    @Test
    public void testChild2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:260) */
        element.child(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.attributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attributes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attributes()}
 * @utbot.executesCondition {@code (!hasAttributes()): True}
 * @utbot.returnsFrom {@code return attributes;}
 *  */
    @Test
    public void testAttributes_NotHasAttributes() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            Attributes actual = element.attributes();
            
            Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            expected.keys = empty;
            expected.vals = empty;
            
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(expected, actual));
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attributes()}
 * @utbot.executesCondition {@code (!hasAttributes()): False}
 * @utbot.returnsFrom {@code return attributes;}
 *  */
    @Test
    public void testAttributes_HasAttributes() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        Attributes actual = element.attributes();
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.classNames
    
    ///region Errors report for classNames
    
    public void testClassNames_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method classNames(java.util.Set)
    
    @Test
    public void testClassNames1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            Element actual = element.classNames(linkedHashSet);
            
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            assertNull(actualTag);
            
            WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
            assertNull(actualShadowChildrenRef);
            
            List actualChildNodes = actual.childNodes;
            assertNull(actualChildNodes);
            
            Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
            // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
            assertTrue(deepEquals(elementAttributes, actualAttributes));
            
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
            assertNull(actualBaseUri);
            
            Node actualParentNode = actual.parentNode;
            assertNull(actualParentNode);
            
            int elementSiblingIndex = element.siblingIndex;
            int actualSiblingIndex = actual.siblingIndex;
            assertEquals(elementSiblingIndex, actualSiblingIndex);
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test
    public void testClassNames2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        Element actual = element.classNames(linkedHashSet);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes1AttributesKeys, 1));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes2AttributesKeys, 2));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes3AttributesKeys, 3));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes4AttributesKeys, 4));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes5AttributesKeys, 5));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes6AttributesKeys, 6));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes7AttributesKeys, 7));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes8AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    
    @Test
    public void testClassNames3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        
        Element actual = element.classNames(linkedHashSet);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        
        assertFalse(initialElementAttributes == finalElementAttributes);
    }
    
    @Test
    public void testClassNames4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        linkedHashSet.add(null);
        
        Element actual = element.classNames(linkedHashSet);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = actual.childNodes;
        assertNull(actualChildNodes);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(elementAttributes, actualAttributes));
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method classNames(java.util.Set)
    
    @Test
    public void testClassNames5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:192)
            org.jsoup.nodes.Element.classNames(Element.java:1264) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.internal.StringUtil.join(StringUtil.java:41)
            org.jsoup.internal.StringUtil.join(StringUtil.java:28)
            org.jsoup.nodes.Element.classNames(Element.java:1266) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String string = "";
        linkedHashSet.add(string);
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:116)
            org.jsoup.nodes.Attributes.put(Attributes.java:133)
            org.jsoup.nodes.Element.classNames(Element.java:1266) */
        element.classNames(linkedHashSet);
    }
    
    @Test
    public void testClassNames8() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(null);
            
            /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
                org.jsoup.internal.StringUtil.join(StringUtil.java:41)
                org.jsoup.internal.StringUtil.join(StringUtil.java:28)
                org.jsoup.nodes.Element.classNames(Element.java:1266) */
            element.classNames(linkedHashSet);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method children()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new Elements(childElementsList());
 *  */
    @Test
    public void testChildren_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.nodes.Element.children] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.children(Element.java:272) */
        element.children();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Elements(childElementsList());
 *  */
    @Test
    public void testChildren_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.children] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.children(Element.java:272) */
        element.children();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method children()
    
    @Test
    public void testChildren1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    
    @Test
    public void testChildren2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    @Test
    public void testChildren3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    @Test
    public void testChildren4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    @Test
    public void testChildren5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendText
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(text);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendText(null);
    }
    ///endregion
    
    ///region Errors report for appendText
    
    public void testAppendText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendChild
    
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: reparentChild(child);
 *  */
    @Test
    public void testAppendChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            Comment parentNode = ((Comment) createInstance("org.jsoup.nodes.Comment"));
            document.setParentNode(parentNode);
            
            /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:411) */
            element.appendChild(document);
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendChild(org.jsoup.nodes.Node)
    
    @Test
    public void testAppendChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        Node initialDocumentTypeParentNode = documentType.parentNode;
        
        Element actual = element.appendChild(documentType);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List elementChildNodes = element.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(elementChildNodes, actualChildNodes));
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
        Node finalDocumentTypeParentNode = documentType.parentNode;
        
        assertFalse(initialDocumentTypeParentNode == finalDocumentTypeParentNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendChild(org.jsoup.nodes.Node)
    
    @Test
    public void testAppendChild2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        pseudoTextElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.setParentNode(Node.java:420)
            org.jsoup.nodes.Node.reparentChild(Node.java:468)
            org.jsoup.nodes.Element.appendChild(Element.java:411) */
        element.appendChild(pseudoTextElement);
    }
    
    @Test
    public void testAppendChild3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        pseudoTextElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.FormElement.removeChild(FormElement.java:51)
            org.jsoup.nodes.Node.setParentNode(Node.java:420)
            org.jsoup.nodes.Node.reparentChild(Node.java:468)
            org.jsoup.nodes.Element.appendChild(Element.java:411) */
        element.appendChild(pseudoTextElement);
    }
    
    @Test
    public void testAppendChild4() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            Comment comment = new Comment(null);
            emptyNodes.add(comment);
            DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            emptyNodes.add(documentType);
            emptyNodes.add(documentType);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            formElement.setParentNode(parentNode);
            
            /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.appendChild(Element.java:413) */
            element.appendChild(formElement);
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttributes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasAttributes()}
 * @utbot.returnsFrom {@code return attributes != null;}
 *  */
    @Test
    public void testHasAttributes_AttributesNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        boolean actual = element.hasAttributes();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasAttributes()}
 * @utbot.returnsFrom {@code return attributes != null;}
 *  */
    @Test
    public void testHasAttributes_AttributesEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.hasAttributes();
        
        assertFalse(actual);
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tagName(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.tagName(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.tagName(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.tagName(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTagName4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        element.tagName(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tagName(java.lang.String)
    
    @Test
    public void testTagName5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode2, "org.jsoup.nodes.Document", "parser", parser);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.tagName] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.valueOf(Tag.java:59)
            org.jsoup.nodes.Element.tagName(Element.java:150) */
        element.tagName(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tagName(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testTagName6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode1);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "\u0000";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
            org.jsoup.nodes.Element.tagName(Element.java:132) */
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementById(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementById(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.select.NodeVisitor,org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetElementById_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179)
            org.jsoup.select.Evaluator$Id.matches(Evaluator.java:93)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementById(Element.java:803) */
        element.getElementById(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementById(java.lang.String)
    
    @Test
    public void testGetElementById1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179)
            org.jsoup.select.Evaluator$Id.matches(Evaluator.java:93)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementById(Element.java:803) */
        element.getElementById(string);
    }
    
    @Test
    public void testGetElementById2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483647);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementById(Element.java:803) */
        element.getElementById(string);
    }
    
    @Test
    public void testGetElementById3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementById(Element.java:803) */
        element.getElementById(string1);
    }
    
    @Test
    public void testGetElementById4() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "\u0000";
            
            /* This test fails because method [org.jsoup.nodes.Element.getElementById] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.childNodeSize(Element.java:117)
                org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
                org.jsoup.select.Collector.collect(Collector.java:27)
                org.jsoup.nodes.Element.getElementById(Element.java:803) */
            element.getElementById(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendElement(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.NodeUtils#parser(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#settings()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        
        element.appendElement(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendElement(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            element.appendElement(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        
        element.appendElement(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.appendElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        element.appendElement(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.appendElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.appendElement(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method appendElement(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testAppendElement7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
            org.jsoup.nodes.Element.nodeName(Element.java:122) */
        element.nodeName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attributes()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testHasClass_StringLength() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = " ";
        
        boolean actual = element.hasClass(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final String classAttr = attributes().getIgnoreCase("class");
 *  */
    @Test
    public void testHasClass_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.hasClass(Element.java:1278) */
        element.hasClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final String classAttr = attributes().getIgnoreCase("class");
 *  */
    @Test
    public void testHasClass_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.hasClass(Element.java:1278) */
        element.hasClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int wantLen = className.length();
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasClass(Element.java:1280) */
        element.hasClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String classAttr = attributes().getIgnoreCase("class");
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.hasClass(Element.java:1278) */
        element.hasClass(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int wantLen = className.length();
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException_2() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.hasClass(Element.java:1280) */
            element.hasClass(null);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "[\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string1 = "\u0000\u0000\u0000";
        
        boolean actual = element.hasClass(string1);
        
        assertFalse(actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributesAttributesKeys, 1));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes1AttributesKeys, 2));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes2AttributesKeys, 3));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes3AttributesKeys, 4));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes4AttributesKeys, 5));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes5AttributesKeys, 6));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes6AttributesKeys, 7));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes7AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    
    @Test
    public void testHasClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string1 = "\u0000\u0000\u0000";
        
        boolean actual = element.hasClass(string1);
        
        assertFalse(actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributesAttributesKeys, 1));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes1AttributesKeys, 2));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes2AttributesKeys, 3));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes3AttributesKeys, 4));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes4AttributesKeys, 5));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes5AttributesKeys, 6));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes6AttributesKeys, 7));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes7AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    
    @Test
    public void testHasClass3() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            boolean actual = element.hasClass(string);
            
            assertFalse(actual);
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        keys[1] = string;
        keys[2] = string;
        keys[3] = string;
        keys[4] = string;
        keys[5] = string;
        keys[6] = string;
        keys[7] = string;
        keys[8] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasClass(Element.java:1280) */
        element.hasClass(null);
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.hasText(Element.java:1186) */
        element.hasText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasText()
    
    @Test
    public void testHasText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(cDataNode, "org.jsoup.nodes.LeafNode", "value", value);
        childNodes.add(cDataNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(textNode, "org.jsoup.nodes.LeafNode", "value", value);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        boolean actual = element.hasText();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasText()
    
    @Test
    public void testHasText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        setField(cDataNode, "org.jsoup.nodes.LeafNode", "value", childNodes);
        childNodes.add(cDataNode);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasText] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.TextNode.attr(TextNode.java:12)
            org.jsoup.nodes.LeafNode.coreValue(LeafNode.java:34)
            org.jsoup.nodes.TextNode.isBlank(TextNode.java:72)
            org.jsoup.nodes.Element.hasText(Element.java:1189) */
        element.hasText();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testHasText5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Element", "childNodes", childNodes);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        element.hasText();
    }
    
    @Test
    public void testHasText6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(textNode, "org.jsoup.nodes.LeafNode", "value", childNodes);
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.hasText] produces [java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.lang.String (java.util.ArrayList and java.lang.String are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.TextNode.attr(TextNode.java:12)
            org.jsoup.nodes.LeafNode.coreValue(LeafNode.java:34)
            org.jsoup.nodes.TextNode.isBlank(TextNode.java:72)
            org.jsoup.nodes.Element.hasText(Element.java:1189) */
        element.hasText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.preserveWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveWhitespace(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPreserveWhitespace_NotNodeNotInstanceOfElement() {
        boolean actual = Element.preserveWhitespace(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (el.tag.preserveWhitespace()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testPreserveWhitespace_ElTagPreserveWhitespace() throws Exception  {
        PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(pseudoTextElement, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = Element.preserveWhitespace(pseudoTextElement);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (el.tag.preserveWhitespace()): False}
 * @utbot.executesCondition {@code (i < 6 && el != null): True}
 * @utbot.executesCondition {@code (i < 6 && el != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPreserveWhitespace_ILessThan6AndElEqualsNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = Element.preserveWhitespace(formElement);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (i < 6 && el != null): False}
 * @utbot.executesCondition {@code (i < 6 && el != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPreserveWhitespace_IGreaterOrEqual6AndElEqualsNull() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        PseudoTextElement parentNode1 = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode1, "org.jsoup.nodes.Element", "tag", tag2);
        FormElement parentNode2 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        setField(parentNode2, "org.jsoup.nodes.Element", "tag", tag2);
        FormElement parentNode3 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        setField(parentNode3, "org.jsoup.nodes.Element", "tag", tag2);
        FormElement parentNode4 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        setField(parentNode4, "org.jsoup.nodes.Element", "tag", tag2);
        parentNode3.setParentNode(parentNode4);
        parentNode2.setParentNode(parentNode3);
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        document.setParentNode(parentNode);
        
        boolean actual = Element.preserveWhitespace(document);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preserveWhitespace(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (el.tag.preserveWhitespace()): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: el = el.parent();
 *  */
    @Test
    public void testPreserveWhitespace_ThrowClassCastException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        formElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:1159) */
        Element.preserveWhitespace(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: el.tag.preserveWhitespace()
 *  */
    @Test
    public void testPreserveWhitespace_ThrowNullPointerException() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:1157) */
        Element.preserveWhitespace(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (el.tag.preserveWhitespace()): False}
 * @utbot.executesCondition {@code (i < 6 && el != null): True}
 * @utbot.executesCondition {@code (i < 6 && el != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: el.tag.preserveWhitespace()
 *  */
    @Test
    public void testPreserveWhitespace_ThrowNullPointerException_1() throws Exception  {
        PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(pseudoTextElement, "org.jsoup.nodes.Element", "tag", tag);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        pseudoTextElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:1157) */
        Element.preserveWhitespace(pseudoTextElement);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.shallowClone
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shallowClone()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#shallowClone()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Element(tag, baseUri, attributes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testShallowClone_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        element.shallowClone();
    }
    ///endregion
    
    ///region Errors report for shallowClone
    
    public void testShallowClone_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1393) */
        element.outerHtmlHead(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append('<').append(tagName());
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1401) */
        element.outerHtmlHead(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1393) */
        element.outerHtmlHead(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1393) */
        element.outerHtmlHead(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#outline()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append('<').append(tagName());
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1401) */
        element.outerHtmlHead(null, 0, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1393) */
        element.outerHtmlHead(null, -255, outputSettings);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum instanceof StringBuilder): False}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#indent(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: indent(accum, depth, out);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOuterHtmlHead_ThrowIllegalArgumentException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 1);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlHead1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1405) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", stringBuilderType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = stringBuilder;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1405) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", stringBuilderType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = stringBuilder;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1401) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead4() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1405) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", stringBuilderType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = stringBuilder;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead5() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1405) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", stringBuilderType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = stringBuilder;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead6() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Node.indent(Node.java:608)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1398) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead7() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1401) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead8() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        StringWriter out = ((StringWriter) createInstance("java.io.StringWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            java.base/java.io.StringWriter.write(StringWriter.java:77)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Node.indent(Node.java:608)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1398) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead9() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1405) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlHead10() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.write(PrintWriter.java:480)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Node.indent(Node.java:608)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1398) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = elementClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(element, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for outerHtmlHead
    
    public void testOuterHtmlHead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
    
    ///region Errors report for removeClass
    
    public void testRemoveClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
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
    
    ///region Errors report for toggleClass
    
    public void testToggleClass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.doClone
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doClone(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#doClone(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.nodes.Node#doClone(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element clone = (Element) super.doClone(parent);
 *  */
    @Test
    public void testDoClone_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.doClone] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.doClone(Element.java:1476) */
        element.doClone(((Node) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1416) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.executesCondition {@code (if (!(childNodes.isEmpty() && tag.isSelfClosing())) {
 *     if (out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode)))))))
 *         indent(accum, depth, out);
 *     accum.append("</").append(tagName()).append('>');
 * }): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (!childNodes.isEmpty()): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("</").append(tagName()).append('>');
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1421) */
        element.outerHtmlTail(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.executesCondition {@code (if (!(childNodes.isEmpty() && tag.isSelfClosing())) {
 *     if (out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode)))))))
 *         indent(accum, depth, out);
 *     accum.append("</").append(tagName()).append('>');
 * }): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode))))))
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1417) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1416) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): False}
 * @utbot.executesCondition {@code (out.prettyPrint()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("</").append(tagName()).append('>');
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1421) */
        element.outerHtmlTail(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode))))))
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1417) */
        element.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlTail1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1421) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlTailMethod = elementClazz.getDeclaredMethod("outerHtmlTail", printWriterType, intType, outputSettingsType);
        outerHtmlTailMethod.setAccessible(true);
        java.lang.Object[] outerHtmlTailMethodArguments = new java.lang.Object[3];
        outerHtmlTailMethodArguments[0] = printWriter;
        outerHtmlTailMethodArguments[1] = 0;
        outerHtmlTailMethodArguments[2] = outputSettings;
        try {
            outerHtmlTailMethod.invoke(element, outerHtmlTailMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOuterHtmlTail2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1418) */
        element.outerHtmlTail(null, 0, outputSettings);
    }
    
    @Test
    public void testOuterHtmlTail3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1421) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlTailMethod = elementClazz.getDeclaredMethod("outerHtmlTail", printWriterType, intType, outputSettingsType);
        outerHtmlTailMethod.setAccessible(true);
        java.lang.Object[] outerHtmlTailMethodArguments = new java.lang.Object[3];
        outerHtmlTailMethodArguments[0] = printWriter;
        outerHtmlTailMethodArguments[1] = 0;
        outerHtmlTailMethodArguments[2] = outputSettings;
        try {
            outerHtmlTailMethod.invoke(element, outerHtmlTailMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for outerHtmlTail
    
    public void testOuterHtmlTail_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Concrete execution failed
        
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
            org.jsoup.nodes.Element.isBlock(Element.java:170) */
        element.isBlock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.ensureChildNodes
    
    ///region Errors report for ensureChildNodes
    
    public void testEnsureChildNodes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.doSetBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doSetBaseUri(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#doSetBaseUri(java.lang.String)}
 *  */
    @Test
    public void testDoSetBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.doSetBaseUri(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.childNodeSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childNodeSize()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childNodeSize()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return childNodes.size();}
 *  */
    @Test
    public void testChildNodeSize_ListSize() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        int actual = element.childNodeSize();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method childNodeSize()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childNodeSize()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return childNodes.size();
 *  */
    @Test
    public void testChildNodeSize_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.childNodeSize] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117) */
        element.childNodeSize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.select
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method select(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(cssQuery, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelect_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.select(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#select(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.select(cssQuery, this);
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
        String string = "\r";
        
        element.select(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\t\n";
        
        element.select(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\f\u0000";
        
        element.select(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelect4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\t ";
        
        element.select(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.childElementsList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childElementsList()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): False}
 * @utbot.executesCondition {@code (children): False}
 * @utbot.returnsFrom {@code return children;}
 *  */
    @Test
    public void testChildElementsList_NotChildren() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        assertTrue(deepEquals(referent, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): True}
 * @utbot.returnsFrom {@code return children;}
 *  */
    @Test
    public void testChildElementsList_ShadowChildrenRefEqualsNull_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): False}
 * @utbot.executesCondition {@code (children): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testChildElementsList_Children() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(document);
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testChildElementsList_ShadowChildrenRefEqualsNull() throws Exception  {
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        expected.add(document);
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method childElementsList()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): False}
 * @utbot.invokes {@link java.lang.ref.WeakReference#get()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: shadowChildrenRef == null || (children = shadowChildrenRef.get()) == null
 *  */
    @Test
    public void testChildElementsList_ThrowClassCastException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        int[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.nodes.Element.childElementsList] produces [java.lang.ClassCastException: class [I cannot be cast to class java.util.List ([I and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        try {
            childElementsListMethod.invoke(element, childElementsListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#childElementsList()}
 * @utbot.executesCondition {@code (shadowChildrenRef == null): True}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int size = childNodes.size();
 *  */
    @Test
    public void testChildElementsList_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.childElementsList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        try {
            childElementsListMethod.invoke(element, childElementsListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method childElementsList()
    
    @Test
    public void testChildElementsList1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    @Test
    public void testChildElementsList2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
    }
    
    @Test
    public void testChildElementsList3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.Thread$WeakClassKey");
        setField(element, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        WeakReference initialElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Method childElementsListMethod = elementClazz.getDeclaredMethod("childElementsList");
        childElementsListMethod.setAccessible(true);
        java.lang.Object[] childElementsListMethodArguments = new java.lang.Object[0];
        ArrayList actual = ((ArrayList) childElementsListMethod.invoke(element, childElementsListMethodArguments));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        WeakReference finalElementShadowChildrenRef = ((WeakReference) getFieldValue(element, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementShadowChildrenRef == finalElementShadowChildrenRef);
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
    
    ///region Errors report for prependChild
    
    public void testPrependChild_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nodelistChanged
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodelistChanged()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nodelistChanged()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#nodelistChanged()}
 *  */
    @Test
    public void testNodelistChanged_NodeNodelistChanged() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.nodelistChanged();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.dataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataset()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes().dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        Map actual = element.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes().dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset_1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            Attributes initialElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            Map actual = element.dataset();
            
            Map expected = new LinkedHashMap();
            
            assertTrue(deepEquals(expected, actual));
            
            Attributes finalElementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialElementAttributes == finalElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
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
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.accumulateParents(Element.java:241) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Element parent = el.parent();
 *  */
    @Test
    public void testAccumulateParents_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:241) */
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
        PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        pseudoTextElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:242) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = pseudoTextElement;
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
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
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
            org.jsoup.nodes.Element.accumulateParents(Element.java:243) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.selectFirst
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method selectFirst(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#selectFirst(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.selectFirst(cssQuery, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelectFirst_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.selectFirst(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#selectFirst(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Selector.selectFirst(cssQuery, this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSelectFirst_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.selectFirst(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method selectFirst(java.lang.String)
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectFirst1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\t\u0000";
        
        element.selectFirst(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectFirst2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\t ";
        
        element.selectFirst(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectFirst3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\f\u0000";
        
        element.selectFirst(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectFirst4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\r";
        
        element.selectFirst(string);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testSelectFirst5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\n";
        
        element.selectFirst(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.insertChildren
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertChildren(int, java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(children, "Children collection to be inserted must not be null.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.insertChildren(-255, ((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,java.util.Collection)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#childNodeSize()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        ArrayList arrayList = new ArrayList();
        
        element.insertChildren(-6, arrayList);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertChildren(int, java.util.Collection)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Object unmodifiableCollection = createInstance("java.util.Collections$UnmodifiableCollection");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class intType = int.class;
        Class unmodifiableCollectionType = Class.forName("java.util.Collection");
        Method insertChildrenMethod = elementClazz.getDeclaredMethod("insertChildren", intType, unmodifiableCollectionType);
        insertChildrenMethod.setAccessible(true);
        java.lang.Object[] insertChildrenMethodArguments = new java.lang.Object[2];
        insertChildrenMethodArguments[0] = 6;
        insertChildrenMethodArguments[1] = unmodifiableCollection;
        try {
            insertChildrenMethod.invoke(element, insertChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertChildren(int, java.util.Collection)
    
    @Test
    public void testInsertChildren2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Object unmodifiableCollection = createInstance("java.util.Collections$UnmodifiableCollection");
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            java.base/java.util.Collections$UnmodifiableCollection.toArray(Collections.java:1044)
            java.base/java.util.ArrayList.<init>(ArrayList.java:181)
            org.jsoup.nodes.Element.insertChildren(Element.java:459) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class intType = int.class;
        Class unmodifiableCollectionType = Class.forName("java.util.Collection");
        Method insertChildrenMethod = elementClazz.getDeclaredMethod("insertChildren", intType, unmodifiableCollectionType);
        insertChildrenMethod.setAccessible(true);
        java.lang.Object[] insertChildrenMethodArguments = new java.lang.Object[2];
        insertChildrenMethodArguments[0] = 2;
        insertChildrenMethodArguments[1] = unmodifiableCollection;
        try {
            insertChildrenMethod.invoke(element, insertChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for insertChildren
    
    public void testInsertChildren_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.insertChildren
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertChildren(int, [Lorg.jsoup.nodes.Node;)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(children, "Children collection to be inserted must not be null.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.insertChildren(-255, ((org.jsoup.nodes.Node[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): True}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addChildren(index, children);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[2];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        
        element.insertChildren(-1, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {null};
        
        element.insertChildren(-6, nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#insertChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): True}
 * @utbot.executesCondition {@code (Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {null};
        
        element.insertChildren(6, nodeArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insertChildren(int, [Lorg.jsoup.nodes.Node;)
    
    @Test
    public void testInsertChildren3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = {};
        
        Element actual = element.insertChildren(-1, nodeArray);
        
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        assertNull(actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List elementChildNodes = element.childNodes;
        List actualChildNodes = actual.childNodes;
        assertTrue(deepEquals(elementChildNodes, actualChildNodes));
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = actual.parentNode;
        assertNull(actualParentNode);
        
        int elementSiblingIndex = element.siblingIndex;
        int actualSiblingIndex = actual.siblingIndex;
        assertEquals(elementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertChildren(int, [Lorg.jsoup.nodes.Node;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildren4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[5];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        childNodes.add(objectArray);
        childNodes.add(objectArray);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[10];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        Comment comment = new Comment(null);
        nodeArray[1] = ((Node) comment);
        
        element.insertChildren(2, nodeArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertChildren(int, [Lorg.jsoup.nodes.Node;)
    
    @Test
    public void testInsertChildren5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[5];
        objectArray[0] = objectArray;
        objectArray[1] = objectArray;
        childNodes.add(objectArray);
        childNodes.add(objectArray);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[2];
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document);
        Comment comment = new Comment(null);
        nodeArray[1] = ((Node) comment);
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:475)
            org.jsoup.nodes.Node.addChildren(Node.java:464)
            org.jsoup.nodes.Element.insertChildren(Element.java:480) */
        element.insertChildren(2, nodeArray);
    }
    
    @Test
    public void testInsertChildren6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[2];
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document1);
        Comment comment = new Comment(null);
        nodeArray[1] = ((Node) comment);
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:475)
            org.jsoup.nodes.Node.addChildren(Node.java:464)
            org.jsoup.nodes.Element.insertChildren(Element.java:480) */
        element.insertChildren(-2, nodeArray);
    }
    
    @Test
    public void testInsertChildren7() throws Exception  {
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        org.jsoup.nodes.Node[] nodeArray = new org.jsoup.nodes.Node[1];
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        nodeArray[0] = ((Node) document1);
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:475)
            org.jsoup.nodes.Node.addChildren(Node.java:464)
            org.jsoup.nodes.Element.insertChildren(Element.java:480) */
        element.insertChildren(-2, nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependText
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(text);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependText_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prependText(null);
    }
    ///endregion
    
    ///region Errors report for prependText
    
    public void testPrependText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependElement(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.NodeUtils#parser(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.Parser#settings()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        
        element.prependElement(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "";
            
            element.prependElement(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prependElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        XmlDeclaration parentNode2 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prependElement(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.prependElement(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method prependElement(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testPrependElement5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.prependElement(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.dataNodes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataNodes()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataNodes()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(dataNodes);}
 *  */
    @Test
    public void testDataNodes_CollectionsUnmodifiableList() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        List actual = element.dataNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
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
            org.jsoup.nodes.Element.dataNodes(Element.java:341) */
        element.dataNodes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dataNodes()
    
    @Test
    public void testDataNodes1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        List actual = element.dataNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.textNodes(Element.java:323) */
        element.textNodes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method textNodes()
    
    @Test
    public void testTextNodes1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        List actual = element.textNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method html()
    
    @Test
    public void testHtml1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            
            String actual = element.html();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.Appendable)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return appendable;}
 *  */
    @Test
    public void testHtml_ListSize() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Appendable actual = element.html(((Appendable) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.Appendable)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.Appendable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int size = childNodes.size();
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1441) */
        element.html(((Appendable) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.Appendable)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.get(i).outerHtml(appendable);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1443) */
        element.html(((Appendable) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.Appendable)
    
    @Test
    public void testHtml2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:76)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:709)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.nodes.Node.outerHtml(Node.java:575)
            org.jsoup.nodes.Element.html(Element.java:1443) */
        element.html(((Appendable) null));
    }
    
    @Test
    public void testHtml3() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Comment parentNode1 = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1443) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.Appendable");
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
    public void testHtml4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        ISO_8859_1 charset = ((ISO_8859_1) createInstance("sun.nio.cs.ISO_8859_1"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
        setField(document, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.prepareEncoder(Document.java:447)
            org.jsoup.nodes.Node$OuterHtmlVisitor.<init>(Node.java:704)
            org.jsoup.nodes.Node.outerHtml(Node.java:575)
            org.jsoup.nodes.Element.html(Element.java:1443) */
        element.html(((Appendable) null));
    }
    
    @Test
    public void testHtml5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PseudoTextElement parentNode1 = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        Document parentNode2 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node$OuterHtmlVisitor.<init>(Node.java:704)
            org.jsoup.nodes.Node.outerHtml(Node.java:575)
            org.jsoup.nodes.Element.html(Element.java:1443) */
        element.html(((Appendable) null));
    }
    
    @Test
    public void testHtml6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        XmlDeclaration parentNode1 = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PseudoTextElement parentNode2 = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:76)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:709)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.nodes.Node.outerHtml(Node.java:575)
            org.jsoup.nodes.Element.html(Element.java:1443) */
        element.html(((Appendable) null));
    }
    ///endregion
    
    ///region Errors report for html
    
    public void testHtml_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#empty()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: append(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHtml_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        element.html(((String) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml7() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        String string = "";
        
        element.html(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml8() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.html(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml9() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.html(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml10() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        String string = "";
        
        element.html(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        element.html(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml12() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        XmlTreeBuilder treeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        setField(parentNode, "org.jsoup.nodes.Document", "parser", parser);
        element.setParentNode(parentNode);
        String string = "";
        
        element.html(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.String)
    
    @Test
    public void testHtml13() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        setField(parentNode1, "org.jsoup.nodes.Document", "parser", parser);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.parser.Parser.parseFragmentInput(Parser.java:39)
            org.jsoup.nodes.Element.append(Element.java:544)
            org.jsoup.nodes.Element.html(Element.java:1456) */
        element.html(string);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method html(java.lang.String)
    
    @Test(timeout = 1000L)
    public void testHtml14() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        parentNode.setParentNode(parentNode);
        element.setParentNode(parentNode);
        String string = "";
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        element.html(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.cssSelector
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cssSelector()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#cssSelector()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: id().length() > 0
 *  */
    @Test
    public void testCssSelector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179)
            org.jsoup.nodes.Element.cssSelector(Element.java:639) */
        element.cssSelector();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#cssSelector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: id().length() > 0
 *  */
    @Test
    public void testCssSelector_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179)
            org.jsoup.nodes.Element.cssSelector(Element.java:639) */
        element.cssSelector();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#cssSelector()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link java.lang.String#replace(char,char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = tagName().replace(':', '|');
 *  */
    @Test
    public void testCssSelector_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.cssSelector(Element.java:643) */
        element.cssSelector();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cssSelector()
    
    @Test
    public void testCssSelector1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483647);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.cssSelector();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCssSelector2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = ":\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        String actual = element.cssSelector();
        
        String expected = "|\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        assertEquals(expected, actual);
        
        Attributes elementAttributes = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys0 = ((String) get(elementAttributesAttributesKeys, 0));
        Attributes elementAttributes1 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys1 = ((String) get(elementAttributes1AttributesKeys, 1));
        Attributes elementAttributes2 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys2 = ((String) get(elementAttributes2AttributesKeys, 2));
        Attributes elementAttributes3 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys3 = ((String) get(elementAttributes3AttributesKeys, 3));
        Attributes elementAttributes4 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys4 = ((String) get(elementAttributes4AttributesKeys, 4));
        Attributes elementAttributes5 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys5 = ((String) get(elementAttributes5AttributesKeys, 5));
        Attributes elementAttributes6 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys6 = ((String) get(elementAttributes6AttributesKeys, 6));
        Attributes elementAttributes7 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys7 = ((String) get(elementAttributes7AttributesKeys, 7));
        Attributes elementAttributes8 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes8AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes8, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys8 = ((String) get(elementAttributes8AttributesKeys, 8));
        
        assertNull(finalElementAttributesKeys0);
        
        assertNull(finalElementAttributesKeys1);
        
        assertNull(finalElementAttributesKeys2);
        
        assertNull(finalElementAttributesKeys3);
        
        assertNull(finalElementAttributesKeys4);
        
        assertNull(finalElementAttributesKeys5);
        
        assertNull(finalElementAttributesKeys6);
        
        assertNull(finalElementAttributesKeys7);
        
        assertNull(finalElementAttributesKeys8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method cssSelector()
    
    @Test
    public void testCssSelector3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.id(Element.java:179)
            org.jsoup.nodes.Element.cssSelector(Element.java:639) */
        element.cssSelector();
    }
    
    @Test
    public void testCssSelector4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:132)
            org.jsoup.nodes.Element.cssSelector(Element.java:643) */
        element.cssSelector();
    }
    
    @Test
    public void testCssSelector5() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            setField(element, "org.jsoup.nodes.Element", "tag", tag);
            
            /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.cssSelector(Element.java:643) */
            element.cssSelector();
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.siblingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method siblingElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 * @utbot.returnsFrom {@code return new Elements(0);}
 *  */
    @Test
    public void testSiblingElements_ParentNodeEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Elements actual = element.siblingElements();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method siblingElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> elements = parent().childElementsList();
 *  */
    @Test
    public void testSiblingElements_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.siblingElements(Element.java:669) */
        element.siblingElements();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> elements = parent().childElementsList();
 *  */
    @Test
    public void testSiblingElements_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.siblingElements(Element.java:669) */
        element.siblingElements();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> elements = parent().childElementsList();
 *  */
    @Test
    public void testSiblingElements_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.siblingElements(Element.java:669) */
        element.siblingElements();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method siblingElements()
    
    @Test
    public void testSiblingElements1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.util.WeakHashMap$Entry");
        ArrayList referent = new ArrayList();
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {null};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        setField(expected, "java.util.ArrayList", "size", 1);
        setField(expected, "java.util.AbstractList", "modCount", 1);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method siblingElements()
    
    @Test
    public void testSiblingElements2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak$1");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.select.Elements.<init>(Elements.java:28)
            org.jsoup.nodes.Element.siblingElements(Element.java:670) */
        element.siblingElements();
    }
    
    @Test
    public void testSiblingElements3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.select.Elements.<init>(Elements.java:28)
            org.jsoup.nodes.Element.siblingElements(Element.java:670) */
        element.siblingElements();
    }
    
    @Test
    public void testSiblingElements4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.select.Elements.<init>(Elements.java:28)
            org.jsoup.nodes.Element.siblingElements(Element.java:670) */
        element.siblingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.wholeText
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method wholeText()
    
    @Test
    public void testWholeText1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            
            String actual = element.wholeText();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByTag] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:132)
            org.jsoup.select.Evaluator$Tag.matches(Evaluator.java:50)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:788) */
        element.getElementsByTag(string);
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
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
    public void testOwnText_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:1127) */
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:1147)
            org.jsoup.nodes.Element.ownText(Element.java:1132) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendWhitespaceIfBr((Element) child, accum);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException_2() throws Throwable  {
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:1147)
            org.jsoup.nodes.Element.ownText(Element.java:1132) */
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
    public void testOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
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
    public void testOwnText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Attributes value = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(cDataNode, "org.jsoup.nodes.LeafNode", "value", value);
        childNodes.add(cDataNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
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
    public void testOwnText3() throws Exception  {
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
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
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
    public void testOwnText4() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        CDataNode cDataNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        Object value = createInstance("java.lang.Object");
        cDataNode.value = value;
        childNodes.add(cDataNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.LeafNode.attr(LeafNode.java:45)
            org.jsoup.nodes.TextNode.attr(TextNode.java:12)
            org.jsoup.nodes.LeafNode.coreValue(LeafNode.java:34)
            org.jsoup.nodes.TextNode.getWholeText(TextNode.java:64)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:1138)
            org.jsoup.nodes.Element.ownText(Element.java:1130) */
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
    public void testOwnText5() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        childNodes.add(document);
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(textNode);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(StringUtil.java:161)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:1143)
            org.jsoup.nodes.Element.ownText(Element.java:1130) */
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
    public void testOwnText6() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(StringUtil.java:161)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:1143)
            org.jsoup.nodes.Element.ownText(Element.java:1130) */
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
    
    ///region Test suites for executable org.jsoup.nodes.Element.ownText
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ownText()
    
    @Test
    public void testOwnText7() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            childNodes.add(null);
            childNodes.add(null);
            childNodes.add(null);
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            
            String actual = element.ownText();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.indexInList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testIndexInList_ReturnZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = ((Object) null);
        indexInListMethodArguments[1] = arrayList;
        int actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testIndexInList_ElementsGetNotEqualsSearch() throws Exception  {
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        arrayList.add(document);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = ((Object) null);
        indexInListMethodArguments[1] = arrayList;
        int actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testIndexInList_ElementsGetEqualsSearch() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = ((Object) null);
        indexInListMethodArguments[1] = arrayList;
        int actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int size = elements.size();
 *  */
    @Test
    public void testIndexInList_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:769) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.lastElementSibling
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testLastElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:764) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testLastElementSibling_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:764) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testLastElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.lastElementSibling(Element.java:764) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testLastElementSibling_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:764) */
        element.lastElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    @Test
    public void testLastElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.util.WeakHashMap$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testLastElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    
    @Test
    public void testLastElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.Thread$WeakClassKey");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    ///endregion
    
    ///region Errors report for lastElementSibling
    
    public void testLastElementSibling_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nextElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 *  */
    @Test
    public void testNextElementSibling_ParentNodeEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Element actual = element.nextElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testNextElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:688) */
        element.nextElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testNextElementSibling_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:688) */
        element.nextElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testNextElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:688) */
        element.nextElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextElementSibling()
    
    @Test
    public void testNextElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.util.WeakHashMap$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Element actual = element.nextElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testNextElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        referent.add(null);
        referent.add(null);
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Element actual = element.nextElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testNextElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.nextElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
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
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110)
            org.jsoup.nodes.Element.hasClass(Element.java:1278)
            org.jsoup.select.Evaluator$Class.matches(Evaluator.java:115)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:824) */
        element.getElementsByClass(string);
    }
    
    @Test
    public void testGetElementsByClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483647);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:824) */
        element.getElementsByClass(string);
    }
    
    @Test
    public void testGetElementsByClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:824) */
        element.getElementsByClass(string);
    }
    
    @Test
    public void testGetElementsByClass4() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            String string = "\u0000";
            
            /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.childNodeSize(Element.java:117)
                org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
                org.jsoup.select.Collector.collect(Collector.java:27)
                org.jsoup.nodes.Element.getElementsByClass(Element.java:824) */
            element.getElementsByClass(string);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueStarting] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueStarting(Element.java:883) */
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueContaining] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueContaining(Element.java:905) */
        element.getElementsByAttributeValueContaining(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueMatching
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueMatching(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueMatching1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD800\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:915)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:932) */
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
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:915) */
        element.getElementsByAttributeValueMatching(((String) null), ((Pattern) null));
    }
    
    @Test
    public void testGetElementsByAttributeValueMatching3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:915) */
        element.getElementsByAttributeValueMatching(string, ((Pattern) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendNormalisedText
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.invokes {@link org.jsoup.nodes.TextNode#getWholeText()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String text = textNode.getWholeText();
 *  */
    @Test
    public void testAppendNormalisedText_ThrowIndexOutOfBoundsException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class cDataNodeClazz = Class.forName("org.jsoup.nodes.CDataNode");
        Class attributesType = Class.forName("java.lang.String");
        Constructor cDataNodeConstructor = cDataNodeClazz.getDeclaredConstructor(attributesType);
        cDataNodeConstructor.setAccessible(true);
        java.lang.Object[] cDataNodeConstructorArguments = new java.lang.Object[1];
        cDataNodeConstructorArguments[0] = attributes;
        CDataNode cDataNode = ((CDataNode) cDataNodeConstructor.newInstance(cDataNodeConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class cDataNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, cDataNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = cDataNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.invokes {@link org.jsoup.nodes.TextNode#getWholeText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = textNode.getWholeText();
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:1138) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = ((Object) null);
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:1147) */
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
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:1147) */
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
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:1147) */
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
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingOwnText
    
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
    public void testGetElementsMatchingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD800\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:1127)
            org.jsoup.nodes.Element.ownText(Element.java:1122)
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:746)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:1017)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:1033) */
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttribute(Element.java:837) */
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
 * @utbot.invokes org.jsoup.nodes.Element#childElementsList()
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return siblings.size() > 1 ? siblings.get(0) : null;}
 *  */
    @Test
    public void testFirstElementSibling_ListSize() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testFirstElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:745) */
        element.firstElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testFirstElementSibling_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:745) */
        element.firstElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testFirstElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.firstElementSibling(Element.java:745) */
        element.firstElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testFirstElementSibling_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:745) */
        element.firstElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    
    @Test
    public void testFirstElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.Thread$WeakClassKey");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    ///endregion
    
    ///region Errors report for firstElementSibling
    
    public void testFirstElementSibling_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueNot] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueNot(Element.java:872) */
        element.getElementsByAttributeValueNot(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexGreaterThan
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.select.NodeVisitor,org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collector.collect(new Evaluator.IndexGreaterThan(index), this);
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:755)
            org.jsoup.select.Evaluator$IndexGreaterThan.matches(Evaluator.java:365)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:950) */
        element.getElementsByIndexGreaterThan(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexGreaterThan(int)
    
    @Test
    public void testGetElementsByIndexGreaterThan1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(0);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexGreaterThan(0);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    @Test
    public void testGetElementsByIndexGreaterThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        Object referent = createInstance("java.lang.Object");
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.List (java.lang.Object and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:756)
            org.jsoup.select.Evaluator$IndexGreaterThan.matches(Evaluator.java:365)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:950) */
        element.getElementsByIndexGreaterThan(0);
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:950) */
        element.getElementsByIndexGreaterThan(0);
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:950) */
        element.getElementsByIndexGreaterThan(0);
    }
    
    @Test
    public void testGetElementsByIndexGreaterThan6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:950) */
        element.getElementsByIndexGreaterThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.previousElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.executesCondition {@code (parentNode == null): True}
 *  */
    @Test
    public void testPreviousElementSibling_ParentNodeEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method previousElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:713) */
        element.previousElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:713) */
        element.previousElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().childElementsList();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:713) */
        element.previousElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method previousElementSibling()
    
    @Test
    public void testPreviousElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.util.WeakHashMap$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testPreviousElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    
    @Test
    public void testPreviousElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    ///endregion
    
    ///region Errors report for previousElementSibling
    
    public void testPreviousElementSibling_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.elementSiblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testElementSiblingIndex_ElementParent() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        int actual = element.elementSiblingIndex();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: parent() == null
 *  */
    @Test
    public void testElementSiblingIndex_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.ClassCastException: class org.jsoup.nodes.XmlDeclaration cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.XmlDeclaration and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:755) */
        element.elementSiblingIndex();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return indexInList(this, parent().childElementsList());
 *  */
    @Test
    public void testElementSiblingIndex_ThrowClassCastException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:756) */
        element.elementSiblingIndex();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return indexInList(this, parent().childElementsList());
 *  */
    @Test
    public void testElementSiblingIndex_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:283)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:756) */
        element.elementSiblingIndex();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    @Test
    public void testElementSiblingIndex1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Object shadowChildrenRef = createInstance("java.io.ObjectStreamClass$WeakClassKey");
        ArrayList referent = new ArrayList();
        referent.add(null);
        referent.add(null);
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        int actual = element.elementSiblingIndex();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testElementSiblingIndex2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.Thread$WeakClassKey");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Node node = element.parentNode;
        WeakReference initialElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        int actual = element.elementSiblingIndex();
        
        assertEquals(0, actual);
        
        Node node1 = element.parentNode;
        WeakReference finalElementParentNodeShadowChildrenRef = ((WeakReference) getFieldValue(node1, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        
        assertFalse(initialElementParentNodeShadowChildrenRef == finalElementParentNodeShadowChildrenRef);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nextElementSiblings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextElementSiblings()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSiblings()}
 * @utbot.invokes org.jsoup.nodes.Element#nextElementSiblings(boolean)
 * @utbot.returnsFrom {@code return nextElementSiblings(true);}
 *  */
    @Test
    public void testNextElementSiblings_ElementNextElementSiblings() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Elements actual = element.nextElementSiblings();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.nextElementSiblings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextElementSiblings(boolean)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSiblings(boolean)}
 * @utbot.executesCondition {@code (parentNode == null): True}
 * @utbot.returnsFrom {@code return els;}
 *  */
    @Test
    public void testNextElementSiblings_ParentNodeEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class booleanType = boolean.class;
        Method nextElementSiblingsMethod = elementClazz.getDeclaredMethod("nextElementSiblings", booleanType);
        nextElementSiblingsMethod.setAccessible(true);
        java.lang.Object[] nextElementSiblingsMethodArguments = new java.lang.Object[1];
        nextElementSiblingsMethodArguments[0] = false;
        Elements actual = ((Elements) nextElementSiblingsMethod.invoke(element, nextElementSiblingsMethodArguments));
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.previousElementSiblings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method previousElementSiblings()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSiblings()}
 * @utbot.invokes org.jsoup.nodes.Element#nextElementSiblings(boolean)
 * @utbot.returnsFrom {@code return nextElementSiblings(false);}
 *  */
    @Test
    public void testPreviousElementSiblings_ElementNextElementSiblings() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Elements actual = element.previousElementSiblings();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueEnding] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValueEnding(Element.java:894) */
        element.getElementsByAttributeValueEnding(string, string);
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getElementsByAttributeStarting(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeStarting1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001\u0001";
        
        element.getElementsByAttributeStarting(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeStarting(java.lang.String)
    
    @Test
    public void testGetElementsByAttributeStarting2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeStarting] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeStarting(Element.java:850) */
        element.getElementsByAttributeStarting(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexLessThan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getElementsByIndexLessThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.select.NodeVisitor,org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexLessThan(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexLessThan_CollectorCollect() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexLessThan(-255);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan1() throws Exception  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            ArrayList childNodes = new ArrayList();
            setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
            TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
            element.setParentNode(parentNode);
            
            Elements actual = element.getElementsByIndexLessThan(0);
            
            Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
            java.lang.Object[] elementData = {};
            setField(expected, "java.util.ArrayList", "elementData", elementData);
            
            java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
            java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
            int expectedElementDataSize = expectedElementData.length;
            assertEquals(expectedElementDataSize, actualElementData.length);
            assertTrue(deepEquals(expectedElementData, actualElementData));
            
            int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
            int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
            assertEquals(expectedSize, actualSize);
            
            int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
            int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
            assertEquals(expectedModCount, actualModCount);
            
        } finally {
            setStaticField(LeafNode.class, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    @Test
    public void testGetElementsByIndexLessThan2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexLessThan(0);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        PseudoTextElement parentNode = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.nextSibling(Node.java:506)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:50)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:941) */
        element.getElementsByIndexLessThan(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexEquals
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexEquals(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.select.NodeVisitor,org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collector.collect(new Evaluator.IndexEquals(index), this);
 *  */
    @Test
    public void testGetElementsByIndexEquals_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.ClassCastException: class org.jsoup.nodes.CDataNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.CDataNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @17b165cc)]
            org.jsoup.nodes.Element.parent(Element.java:227)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:755)
            org.jsoup.select.Evaluator$IndexEquals.matches(Evaluator.java:385)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:959) */
        element.getElementsByIndexEquals(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByIndexEquals(int)
    
    @Test
    public void testGetElementsByIndexEquals1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(1);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    
    @Test
    public void testGetElementsByIndexEquals2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(1);
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = {};
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        
        java.lang.Object[] expectedElementData = ((java.lang.Object[]) getFieldValue(expected, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualElementData = ((java.lang.Object[]) getFieldValue(actual, "java.util.ArrayList", "elementData"));
        int expectedElementDataSize = expectedElementData.length;
        assertEquals(expectedElementDataSize, actualElementData.length);
        assertTrue(deepEquals(expectedElementData, actualElementData));
        
        int expectedSize = ((Integer) getFieldValue(expected, "java.util.ArrayList", "size"));
        int actualSize = ((Integer) getFieldValue(actual, "java.util.ArrayList", "size"));
        assertEquals(expectedSize, actualSize);
        
        int expectedModCount = ((Integer) getFieldValue(expected, "java.util.AbstractList", "modCount"));
        int actualModCount = ((Integer) getFieldValue(actual, "java.util.AbstractList", "modCount"));
        assertEquals(expectedModCount, actualModCount);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexEquals(int)
    
    @Test
    public void testGetElementsByIndexEquals3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        Object referent = createInstance("java.lang.Object");
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.util.List (java.lang.Object and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:282)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:756)
            org.jsoup.select.Evaluator$IndexEquals.matches(Evaluator.java:385)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:959) */
        element.getElementsByIndexEquals(0);
    }
    
    @Test
    public void testGetElementsByIndexEquals4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:959) */
        element.getElementsByIndexEquals(0);
    }
    
    @Test
    public void testGetElementsByIndexEquals5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Object shadowChildrenRef = createInstance("java.lang.ClassValue$Entry");
        setField(parentNode, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Element", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:959) */
        element.getElementsByIndexEquals(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingOwnText(java.lang.String)
    
    @Test
    public void testGetElementsContainingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:1127)
            org.jsoup.nodes.Element.ownText(Element.java:1122)
            org.jsoup.select.Evaluator$ContainsOwnText.matches(Evaluator.java:703)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsContainingOwnText(Element.java:981) */
        element.getElementsContainingOwnText(string);
    }
    
    @Test
    public void testGetElementsContainingOwnText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:1127)
            org.jsoup.nodes.Element.ownText(Element.java:1122)
            org.jsoup.select.Evaluator$ContainsOwnText.matches(Evaluator.java:703)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsContainingOwnText(Element.java:981) */
        element.getElementsContainingOwnText(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingText(java.lang.String)
    
    @Test
    public void testGetElementsMatchingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD800\uE000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.nodes.Element.text(Element.java:1057)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:724)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:991)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:1007) */
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
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsByAttributeValue(Element.java:861) */
        element.getElementsByAttributeValue(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingText(java.lang.String)
    
    @Test
    public void testGetElementsContainingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.nodes.Element.text(Element.java:1057)
            org.jsoup.select.Evaluator$ContainsText.matches(Evaluator.java:661)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsContainingText(Element.java:970) */
        element.getElementsContainingText(string);
    }
    
    @Test
    public void testGetElementsContainingText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childNodeSize(Element.java:117)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:46)
            org.jsoup.nodes.Element.text(Element.java:1057)
            org.jsoup.select.Evaluator$ContainsText.matches(Evaluator.java:661)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:45)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.select.Collector.collect(Collector.java:27)
            org.jsoup.nodes.Element.getElementsContainingText(Element.java:970) */
        element.getElementsContainingText(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1008361846435500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1008361846435500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1008361846441100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008361846435500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008361846441100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1008361846701400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008361846701400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008361846703100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008361846701400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008361846703100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1008361847046200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008361847046200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008361847047300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008361847046200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008361847047300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1008361847509800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008361847509800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008361847511300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008361847509800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008361847511300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

