package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.Comment;
import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.nodes.DataNode;
import java.util.List;
import org.jsoup.select.Elements;
import java.lang.ref.WeakReference;
import org.jsoup.nodes.Node;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.BufferedReader;
import org.jsoup.nodes.DocumentType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_parser_HtmlTreeBuilderTest {
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getDocument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDocument()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getDocument()}
 * @utbot.returnsFrom {@code return doc;}
 *  */
    @Test
    public void testGetDocument_ReturnDoc() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        Document actual = htmlTreeBuilder.getDocument();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.toString
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.EOF currentToken = ((Token.EOF) createInstance("org.jsoup.parser.Token$EOF"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.toString] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.HtmlTreeBuilder.toString(HtmlTreeBuilder.java:722) */
        htmlTreeBuilder.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character currentToken = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.toString] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.HtmlTreeBuilder.toString(HtmlTreeBuilder.java:722) */
        htmlTreeBuilder.toString();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    @Test(expected = IllegalArgumentException.class)
    public void testToString3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483647);
        currentToken.attributes = attributes;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        
        htmlTreeBuilder.toString();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testToString4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        currentToken.attributes = attributes;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        
        htmlTreeBuilder.toString();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testToString5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        
        htmlTreeBuilder.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:247) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(comment);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(comment);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    @Test
    public void testInsert1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    
    @Test
    public void testInsert2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:269)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    
    @Test
    public void testInsert3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:269)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    
    @Test
    public void testInsert4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:267)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Character)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = currentElement().tagName();
 *  */
    @Test
    public void testInsert_ThrowNullPointerException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:254) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName.equals("script") || tagName.equals("style")
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:255) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node = new DataNode(characterToken.getData());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:258) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String tagName = currentElement().tagName();
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:254) */
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method insert(org.jsoup.parser.Token$Character)
    
    @Test
    public void testInsert5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Element", "childNodes", childNodes);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        Token.Character character = new Token.Character();
        
        htmlTreeBuilder.insert(character);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Character)
    
    @Test
    public void testInsert6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        Token.Character character = new Token.Character();
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:259) */
        htmlTreeBuilder.insert(character);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#isSelfClosing()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startTag.isSelfClosing()
 *  */
    @Test
    public void testInsert_ThrowNullPointerException2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:197) */
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.executesCondition {@code (startTag.isSelfClosing()): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#insertEmpty(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element el = insertEmpty(startTag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        startTag.selfClosing = true;
        
        htmlTreeBuilder.insert(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.executesCondition {@code (startTag.isSelfClosing()): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element el = new Element(Tag.valueOf(startTag.name(), settings), baseUri, settings.normalizeAttributes(startTag.attributes));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        htmlTreeBuilder.insert(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.executesCondition {@code (startTag.isSelfClosing()): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element el = new Element(Tag.valueOf(startTag.name(), settings), baseUri, settings.normalizeAttributes(startTag.attributes));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        
        htmlTreeBuilder.insert(startTag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_12() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_22() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(formElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:267)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_31() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:269)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertNode(el);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertNode(el);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(htmlTreeBuilder);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.nodes.Element)
    
    @Test
    public void testInsert7() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        stack.add(htmlTreeBuilder);
        stack.add(htmlTreeBuilder);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.ClassCastException: class org.jsoup.parser.HtmlTreeBuilder cannot be cast to class org.jsoup.nodes.Element (org.jsoup.parser.HtmlTreeBuilder and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:307)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:267)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    @Test
    public void testInsert8() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(formElement);
    }
    
    @Test
    public void testInsert9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:269)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(element);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.nodes.Element)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert10() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insert(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.state
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method state()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#state()}
 * @utbot.returnsFrom {@code return state;}
 *  */
    @Test
    public void testState_ReturnState() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        HtmlTreeBuilderState actual = htmlTreeBuilder.state();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStack()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getStack()}
 * @utbot.returnsFrom {@code return stack;}
 *  */
    @Test
    public void testGetStack_ReturnStack() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        ArrayList actual = htmlTreeBuilder.getStack();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.error
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(org.jsoup.parser.HtmlTreeBuilderState)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#error(org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#canAddError()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: errors.canAddError()
 *  */
    @Test
    public void testError_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.error] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190) */
        htmlTreeBuilder.error(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#push(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 *  */
    @Test
    public void testPush_ArrayListAdd() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.push(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#push(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stack.add(element);
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.push] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.push(HtmlTreeBuilder.java:284) */
        htmlTreeBuilder.push(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.pop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pop()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pop()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.util.ArrayList#remove(int)}
 * @utbot.returnsFrom {@code return stack.remove(size - 1);}
 *  */
    @Test
    public void testPop_ArrayListRemove() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        Element actual = htmlTreeBuilder.pop();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pop()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pop()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.util.ArrayList#remove(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return stack.remove(size - 1);
 *  */
    @Test
    public void testPop_ThrowIndexOutOfBoundsException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pop] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.parser.HtmlTreeBuilder.pop(HtmlTreeBuilder.java:280) */
        htmlTreeBuilder.pop();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pop()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = stack.size();
 *  */
    @Test
    public void testPop_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pop] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.pop(HtmlTreeBuilder.java:279) */
        htmlTreeBuilder.pop();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.onStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method onStack(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(stack, el);}
 *  */
    @Test
    public void testOnStack_ReturnIsElementInQueue() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.onStack(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(stack, el);}
 *  */
    @Test
    public void testOnStack_ReturnIsElementInQueue_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.onStack(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(stack, el);}
 *  */
    @Test
    public void testOnStack_ReturnIsElementInQueue_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.onStack(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method onStack(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isElementInQueue(stack, el);
 *  */
    @Test
    public void testOnStack_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.onStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:296)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:292) */
        htmlTreeBuilder.onStack(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilderState#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilder)}
 * @utbot.returnsFrom {@code return state.process(token, this);}
 *  */
    @Test
    public void testProcess_HtmlTreeBuilderStateProcess() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asDoctype(Token.java:328)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:21)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(startTag, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
        endTag.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asComment(Token.java:352)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:17)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(endTag, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Character;
        endTag.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asCharacter(Token.java:360)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1466)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(endTag, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1465)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(null, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1474)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1467)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(character, htmlTreeBuilderState);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)
    
    @Test
    public void testProcess1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\n";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    
    @Test
    public void testProcess2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\f";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    
    @Test
    public void testProcess3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\r";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    
    @Test
    public void testProcess4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = " ";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    
    @Test
    public void testProcess5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\t";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character, htmlTreeBuilderState);
        
        assertTrue(actual);
        
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = htmlTreeBuilderState;
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)
    
    @Test
    public void testProcess6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:17)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(comment, htmlTreeBuilderState);
    }
    
    @Test
    public void testProcess7() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getPublicIdentifier(Token.java:63)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:23)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(doctype, htmlTreeBuilderState);
    }
    
    @Test
    public void testProcess8() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:23)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(doctype, htmlTreeBuilderState);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilderState)
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\u0000";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        htmlTreeBuilder.process(character, htmlTreeBuilderState);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Character;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asCharacter(Token.java:360)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1466)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:175)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Comment;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asComment(Token.java:352)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:266)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTableText;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Comment currentToken = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:916)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1465)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:907)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:808)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess10() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(startTag);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    
    @Test
    public void testProcess11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\n";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.process(character);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess12() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        Token.TokenType type = Token.TokenType.StartTag;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.Token.asStartTag(Token.java:336)
            org.jsoup.parser.HtmlTreeBuilderState$3.process(HtmlTreeBuilderState.java:75)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(comment);
    }
    
    @Test
    public void testProcess13() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$5.anythingElse(HtmlTreeBuilderState.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:184)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(endTag);
    }
    
    @Test
    public void testProcess14() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:810)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(comment);
    }
    
    @Test
    public void testProcess15() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\t";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:578)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:617)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:259)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$21.process(HtmlTreeBuilderState.java:1425)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess16() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InRow;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag currentToken = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:813)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$14.anythingElse(HtmlTreeBuilderState.java:1140)
            org.jsoup.parser.HtmlTreeBuilderState$14.process(HtmlTreeBuilderState.java:1134)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess17() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:270)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess18() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Comment currentToken = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$20.process(HtmlTreeBuilderState.java:1403)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess19() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\u0000";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:66)
            org.jsoup.parser.HtmlTreeBuilderState$3.process(HtmlTreeBuilderState.java:88)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess20() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character currentToken = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1224)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = " ";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:254)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1217)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess22() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCell;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\r";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:578)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:617)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:259)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$15.anythingElse(HtmlTreeBuilderState.java:1198)
            org.jsoup.parser.HtmlTreeBuilderState$15.process(HtmlTreeBuilderState.java:1192)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess23() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCaption;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\f";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:578)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:617)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:259)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$11.process(HtmlTreeBuilderState.java:969)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess24() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelectInTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag currentToken = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1224)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$17.process(HtmlTreeBuilderState.java:1316)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess25() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag currentToken = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248)
            org.jsoup.parser.HtmlTreeBuilderState$21.process(HtmlTreeBuilderState.java:1423)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(comment);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.transition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transition(org.jsoup.parser.HtmlTreeBuilderState)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#transition(org.jsoup.parser.HtmlTreeBuilderState)}
 *  */
    @Test
    public void testTransition() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.transition(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStackToTableRowContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 *  */
    @Test
    public void testClearStackToTableRowContext() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 *  */
    @Test
    public void testClearStackToTableRowContext_4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 *  */
    @Test
    public void testClearStackToTableRowContext_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 *  */
    @Test
    public void testClearStackToTableRowContext_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "tr";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 *  */
    @Test
    public void testClearStackToTableRowContext_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStackToTableRowContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tr");
 *  */
    @Test
    public void testClearStackToTableRowContext_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:368)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:364) */
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tr");
 *  */
    @Test
    public void testClearStackToTableRowContext_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:364) */
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableRowContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tr");
 *  */
    @Test
    public void testClearStackToTableRowContext_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:364) */
        htmlTreeBuilder.clearStackToTableRowContext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.newPendingTableCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newPendingTableCharacters()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#newPendingTableCharacters()}
 *  */
    @Test
    public void testNewPendingTableCharacters() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.newPendingTableCharacters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method generateImpliedEndTags(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 *  */
    @Test
    public void testGenerateImpliedEndTags() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.generateImpliedEndTags(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))} once
 *  */
    @Test
    public void testGenerateImpliedEndTags_StringEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.generateImpliedEndTags(tagName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method generateImpliedEndTags(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))
 *  */
    @Test
    public void testGenerateImpliedEndTags_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:561) */
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))
 *  */
    @Test
    public void testGenerateImpliedEndTags_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:561) */
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 * @utbot.iterates iterate the loop {@code while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while((excludeTag != null && !currentElement().nodeName().equals(excludeTag)) && StringUtil.in(currentElement().nodeName(), TagSearchEndTags))
 *  */
    @Test
    public void testGenerateImpliedEndTags_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:561) */
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method generateImpliedEndTags(java.lang.String)
    
    @Test
    public void testGenerateImpliedEndTags1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        String string = "#do\u0000\u0000\u0000\u0000\u0000\u0000";
        
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    
    @Test
    public void testGenerateImpliedEndTags2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\uFFFF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method generateImpliedEndTags()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
 *  */
    @Test
    public void testGenerateImpliedEndTags_HtmlTreeBuilderGenerateImpliedEndTags() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.generateImpliedEndTags();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertInFosterParent(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (lastTable != null): False}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: fosterParent = stack.get(0);
 *  */
    @Test
    public void testInsertInFosterParent_ThrowIndexOutOfBoundsException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:706) */
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertInFosterParent(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (lastTable != null): False}
 * @utbot.executesCondition {@code (isLastTableParent): False}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: fosterParent.appendChild(in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertInFosterParent_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertInFosterParent(org.jsoup.nodes.Node)
    
    @Test
    public void testInsertInFosterParent1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        org.jsoup.nodes.Comment comment = new org.jsoup.nodes.Comment(null, null);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:714) */
        htmlTreeBuilder.insertInFosterParent(comment);
    }
    
    @Test
    public void testInsertInFosterParent2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        TextNode textNode = new TextNode(null);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:714) */
        htmlTreeBuilder.insertInFosterParent(textNode);
    }
    
    @Test
    public void testInsertInFosterParent3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697) */
        htmlTreeBuilder.insertInFosterParent(null);
    }
    
    @Test
    public void testInsertInFosterParent4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "ta\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697) */
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertInFosterParent(org.jsoup.nodes.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testInsertInFosterParent5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        
        htmlTreeBuilder.insertInFosterParent(element);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsertInFosterParent6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getPendingTableCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPendingTableCharacters()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getPendingTableCharacters()}
 * @utbot.returnsFrom {@code return pendingTableCharacters;}
 *  */
    @Test
    public void testGetPendingTableCharacters_ReturnPendingTableCharacters() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        List actual = htmlTreeBuilder.getPendingTableCharacters();
        
        assertNull(actual);
        
        List finalHtmlTreeBuilderPendingTableCharacters = ((List) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "pendingTableCharacters"));
        
        assertNull(finalHtmlTreeBuilderPendingTableCharacters);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeLastFormattingElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeLastFormattingElement()}
 * @utbot.executesCondition {@code (size > 0): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testRemoveLastFormattingElement_SizeLessOrEqualZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.removeLastFormattingElement();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeLastFormattingElement()}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.invokes {@link java.util.ArrayList#remove(int)}
 * @utbot.returnsFrom {@code return formattingElements.remove(size - 1);}
 *  */
    @Test
    public void testRemoveLastFormattingElement_SizeGreaterThanZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.removeLastFormattingElement();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeLastFormattingElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeLastFormattingElement()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = formattingElements.size();
 *  */
    @Test
    public void testRemoveLastFormattingElement_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement(HtmlTreeBuilder.java:582) */
        htmlTreeBuilder.removeLastFormattingElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isInActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(formattingElements, el);}
 *  */
    @Test
    public void testIsInActiveFormattingElements_ReturnIsElementInQueue() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        boolean actual = htmlTreeBuilder.isInActiveFormattingElements(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isInActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(formattingElements, el);}
 *  */
    @Test
    public void testIsInActiveFormattingElements_ReturnIsElementInQueue_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        formattingElements.add(element);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        boolean actual = htmlTreeBuilder.isInActiveFormattingElements(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isInActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return isElementInQueue(formattingElements, el);}
 *  */
    @Test
    public void testIsInActiveFormattingElements_ReturnIsElementInQueue_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        boolean actual = htmlTreeBuilder.isInActiveFormattingElements(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isInActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isElementInQueue(formattingElements, el);
 *  */
    @Test
    public void testIsInActiveFormattingElements_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:296)
            org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(HtmlTreeBuilder.java:673) */
        htmlTreeBuilder.isInActiveFormattingElements(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStackToTableBodyContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableBodyContext()}
 *  */
    @Test
    public void testClearStackToTableBodyContext() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableBodyContext()}
 *  */
    @Test
    public void testClearStackToTableBodyContext_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStackToTableBodyContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableBodyContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tbody", "tfoot", "thead");
 *  */
    @Test
    public void testClearStackToTableBodyContext_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:368)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:360) */
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableBodyContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tbody", "tfoot", "thead");
 *  */
    @Test
    public void testClearStackToTableBodyContext_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:360) */
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableBodyContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("tbody", "tfoot", "thead");
 *  */
    @Test
    public void testClearStackToTableBodyContext_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:360) */
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearStackToTableBodyContext()
    
    @Test
    public void testClearStackToTableBodyContext1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(document);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method clearStackToTableBodyContext()
    
    @Test
    public void testClearStackToTableBodyContext2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "tbo\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:360) */
        htmlTreeBuilder.clearStackToTableBodyContext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStackToTableContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 *  */
    @Test
    public void testClearStackToTableContext() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 *  */
    @Test
    public void testClearStackToTableContext_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 *  */
    @Test
    public void testClearStackToTableContext_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.clearStackToTableContext();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStackToTableContext()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("table");
 *  */
    @Test
    public void testClearStackToTableContext_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:368)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:356) */
        htmlTreeBuilder.clearStackToTableContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("table");
 *  */
    @Test
    public void testClearStackToTableContext_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:356) */
        htmlTreeBuilder.clearStackToTableContext();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToTableContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: clearStackToContext("table");
 *  */
    @Test
    public void testClearStackToTableContext_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:356) */
        htmlTreeBuilder.clearStackToTableContext();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pushActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testPushActiveFormattingElements() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.pushActiveFormattingElements(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPushActiveFormattingElements_ElEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.pushActiveFormattingElements(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPushActiveFormattingElements_NumSeenNotEquals3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        htmlTreeBuilder.pushActiveFormattingElements(document);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPushActiveFormattingElements_NumSeenNotEquals3_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pushActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = formattingElements.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPushActiveFormattingElements_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:592) */
        htmlTreeBuilder.pushActiveFormattingElements(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isSameFormattingElement(in, el)
 *  */
    @Test
    public void testPushActiveFormattingElements_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:597) */
        htmlTreeBuilder.pushActiveFormattingElements(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isSameFormattingElement(in, el)
 *  */
    @Test
    public void testPushActiveFormattingElements_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:597) */
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#pushActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isSameFormattingElement(in, el)
 *  */
    @Test
    public void testPushActiveFormattingElements_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:597) */
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pushActiveFormattingElements(org.jsoup.nodes.Element)
    
    @Test
    public void testPushActiveFormattingElements1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.pushActiveFormattingElements(document);
    }
    
    @Test
    public void testPushActiveFormattingElements2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", -1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes1);
        
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    
    @Test
    public void testPushActiveFormattingElements3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(element, "org.jsoup.nodes.Element", "tag", tag1);
        
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    
    @Test
    public void testPushActiveFormattingElements4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes);
        
        htmlTreeBuilder.pushActiveFormattingElements(element);
    }
    
    @Test
    public void testPushActiveFormattingElements5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = new java.lang.String[13];
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys1 = new java.lang.String[17];
        setField(attributes1, "org.jsoup.nodes.Attributes", "keys", keys1);
        setField(element, "org.jsoup.nodes.Element", "attributes", attributes1);
        
        htmlTreeBuilder.pushActiveFormattingElements(element);
        
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
        Attributes elementAttributes9 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes9AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes9, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys9 = ((String) get(elementAttributes9AttributesKeys, 9));
        Attributes elementAttributes10 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes10AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes10, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys10 = ((String) get(elementAttributes10AttributesKeys, 10));
        Attributes elementAttributes11 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes11AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes11, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys11 = ((String) get(elementAttributes11AttributesKeys, 11));
        Attributes elementAttributes12 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes12AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes12, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys12 = ((String) get(elementAttributes12AttributesKeys, 12));
        Attributes elementAttributes13 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes13AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes13, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys13 = ((String) get(elementAttributes13AttributesKeys, 13));
        Attributes elementAttributes14 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes14AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes14, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys14 = ((String) get(elementAttributes14AttributesKeys, 14));
        Attributes elementAttributes15 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes15AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes15, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys15 = ((String) get(elementAttributes15AttributesKeys, 15));
        Attributes elementAttributes16 = ((Attributes) getFieldValue(element, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] elementAttributes16AttributesKeys = ((java.lang.String[]) getFieldValue(elementAttributes16, "org.jsoup.nodes.Attributes", "keys"));
        String finalElementAttributesKeys16 = ((String) get(elementAttributes16AttributesKeys, 16));
        
        assertNull(finalElementAttributesKeys0);
        
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
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeFromActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromActiveFormattingElements(org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testRemoveFromActiveFormattingElements() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.removeFromActiveFormattingElements(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testRemoveFromActiveFormattingElements_NextNotEqualsEl() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        htmlTreeBuilder.removeFromActiveFormattingElements(element);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testRemoveFromActiveFormattingElements_NextEqualsEl() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.removeFromActiveFormattingElements(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeFromActiveFormattingElements(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromActiveFormattingElements(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = formattingElements.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testRemoveFromActiveFormattingElements_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(HtmlTreeBuilder.java:663) */
        htmlTreeBuilder.removeFromActiveFormattingElements(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insertMarkerToFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertMarkerToFormattingElements()}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 *  */
    @Test
    public void testInsertMarkerToFormattingElements_ArrayListAdd() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.insertMarkerToFormattingElements();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertMarkerToFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertMarkerToFormattingElements()}
 * @utbot.invokes {@link java.util.ArrayList#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formattingElements.add(null);
 *  */
    @Test
    public void testInsertMarkerToFormattingElements_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements(HtmlTreeBuilder.java:692) */
        htmlTreeBuilder.insertMarkerToFormattingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getActiveFormattingElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetActiveFormattingElement_ReturnNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.getActiveFormattingElement(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetActiveFormattingElement_NotNextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.getActiveFormattingElement(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetActiveFormattingElement_NextEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.getActiveFormattingElement(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testGetActiveFormattingElement_NextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        FormElement actual = ((FormElement) htmlTreeBuilder.getActiveFormattingElement(tagName));
        
        Elements actualElements = ((Elements) getFieldValue(actual, "org.jsoup.nodes.FormElement", "elements"));
        assertNull(actualElements);
        
        Tag formElementTag = ((Tag) getFieldValue(formElement, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(formElementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Element", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        int formElementSiblingIndex = ((Integer) getFieldValue(formElement, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(formElementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getActiveFormattingElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = formattingElements.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testGetActiveFormattingElement_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(HtmlTreeBuilder.java:677) */
        htmlTreeBuilder.getActiveFormattingElement(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getActiveFormattingElement(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.iterates iterate the loop {@code for(int pos = formattingElements.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(nodeName)
 *  */
    @Test
    public void testGetActiveFormattingElement_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(HtmlTreeBuilder.java:681) */
        htmlTreeBuilder.getActiveFormattingElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reconstructFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_Return() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.reconstructFormattingElements();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_HtmlTreeBuilderOnStack() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        htmlTreeBuilder.stack = formattingElements;
        
        htmlTreeBuilder.reconstructFormattingElements();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_Return_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.reconstructFormattingElements();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reconstructFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#lastFormattingElement()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: last == null || onStack(last)
 *  */
    @Test
    public void testReconstructFormattingElements_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:296)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:292)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:618) */
        htmlTreeBuilder.reconstructFormattingElements();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reconstructFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.executesCondition {@code (pos == 0): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#lastFormattingElement()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element newEl = insertStartTag(entry.nodeName());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReconstructFormattingElements_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        htmlTreeBuilder.settings = settings;
        
        htmlTreeBuilder.reconstructFormattingElements();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method reconstructFormattingElements()
    
    @Test
    public void testReconstructFormattingElements1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.valueOf(Tag.java:54)
            org.jsoup.parser.HtmlTreeBuilder.insertStartTag(HtmlTreeBuilder.java:211)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:641) */
        htmlTreeBuilder.reconstructFormattingElements();
    }
    
    @Test
    public void testReconstructFormattingElements2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.valueOf(Tag.java:54)
            org.jsoup.parser.HtmlTreeBuilder.insertStartTag(HtmlTreeBuilder.java:211)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:641) */
        htmlTreeBuilder.reconstructFormattingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceActiveFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceActiveFormattingElement_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        objectArray[1] = ((Object) element);
        formattingElements.add(objectArray);
        formattingElements.add(element);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.replaceActiveFormattingElement(element, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceActiveFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceActiveFormattingElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.replaceActiveFormattingElement(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceActiveFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: replaceInQueue(formattingElements, out, in);
 *  */
    @Test
    public void testReplaceActiveFormattingElement_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:399)
            org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(HtmlTreeBuilder.java:688) */
        htmlTreeBuilder.replaceActiveFormattingElement(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceActiveFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceActiveFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: replaceInQueue(formattingElements, out, in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceActiveFormattingElement_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.replaceActiveFormattingElement(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceActiveFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: replaceInQueue(formattingElements, out, in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceActiveFormattingElement_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        htmlTreeBuilder.replaceActiveFormattingElement(formElement, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.clearStackToContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearStackToContext([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 *  */
    @Test
    public void testClearStackToContext() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) null);
        clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testClearStackToContext_StringUtilInOrNextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testClearStackToContext_StringUtilInOrNextNodeNameEquals_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testClearStackToContext_StringUtilInOrNextNodeNameEquals_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = tagName;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testClearStackToContext_StringUtilInOrNextNodeNameEquals_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearStackToContext([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testClearStackToContext_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:368) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) null);
        try {
            clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: StringUtil.in(next.nodeName(), nodeNames) || next.nodeName().equals("html")
 *  */
    @Test
    public void testClearStackToContext_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) null);
        try {
            clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: StringUtil.in(next.nodeName(), nodeNames) || next.nodeName().equals("html")
 *  */
    @Test
    public void testClearStackToContext_ThrowNullPointerException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        try {
            clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearStackToContext(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: StringUtil.in(next.nodeName(), nodeNames) || next.nodeName().equals("html")
 *  */
    @Test
    public void testClearStackToContext_ThrowNullPointerException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearStackToContext] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:370) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method clearStackToContextMethod = htmlTreeBuilderClazz.getDeclaredMethod("clearStackToContext", stringArrayType);
        clearStackToContextMethod.setAccessible(true);
        java.lang.Object[] clearStackToContextMethodArguments = new java.lang.Object[1];
        clearStackToContextMethodArguments[0] = ((Object) stringArray);
        try {
            clearStackToContextMethod.invoke(htmlTreeBuilder, clearStackToContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastFormattingElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#lastFormattingElement()}
 * @utbot.executesCondition {@code (formattingElements.size() > 0): False}
 * @utbot.returnsFrom {@code return formattingElements.size() > 0 ? formattingElements.get(formattingElements.size() - 1) : null;}
 *  */
    @Test
    public void testLastFormattingElement_FormattingElementsSizeLessOrEqualZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.lastFormattingElement();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#lastFormattingElement()}
 * @utbot.executesCondition {@code (formattingElements.size() > 0): True}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.returnsFrom {@code return formattingElements.size() > 0 ? formattingElements.get(formattingElements.size() - 1) : null;}
 *  */
    @Test
    public void testLastFormattingElement_FormattingElementsSizeGreaterThanZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        Element actual = htmlTreeBuilder.lastFormattingElement();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastFormattingElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#lastFormattingElement()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: formattingElements.size() > 0
 *  */
    @Test
    public void testLastFormattingElement_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:578) */
        htmlTreeBuilder.lastFormattingElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.setPendingTableCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPendingTableCharacters(java.util.List)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#setPendingTableCharacters(java.util.List)}
 *  */
    @Test
    public void testSetPendingTableCharacters() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList pendingTableCharacters = new ArrayList();
        htmlTreeBuilder.setPendingTableCharacters(pendingTableCharacters);
        
        htmlTreeBuilder.setPendingTableCharacters(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());}
 *  */
    @Test
    public void testIsSameFormattingElement_StringEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", documentType, documentType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = document;
        isSameFormattingElementMethodArguments[1] = element;
        boolean actual = ((Boolean) isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSameFormattingElement(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", documentType, documentType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = document;
        isSameFormattingElementMethodArguments[1] = ((Object) null);
        try {
            isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", elementType, elementType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = ((Object) null);
        isSameFormattingElementMethodArguments[1] = ((Object) null);
        try {
            isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException_4() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", elementType, elementType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = element;
        isSameFormattingElementMethodArguments[1] = document;
        try {
            isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", elementType, elementType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = element;
        isSameFormattingElementMethodArguments[1] = ((Object) null);
        try {
            isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSameFormattingElement(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:610) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isSameFormattingElementMethod = htmlTreeBuilderClazz.getDeclaredMethod("isSameFormattingElement", elementType, elementType);
        isSameFormattingElementMethod.setAccessible(true);
        java.lang.Object[] isSameFormattingElementMethodArguments = new java.lang.Object[2];
        isSameFormattingElementMethodArguments[0] = element;
        isSameFormattingElementMethodArguments[1] = element;
        try {
            isSameFormattingElementMethod.invoke(htmlTreeBuilder, isSameFormattingElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.originalState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method originalState()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#originalState()}
 * @utbot.returnsFrom {@code return originalState;}
 *  */
    @Test
    public void testOriginalState_ReturnOriginalState() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        HtmlTreeBuilderState actual = htmlTreeBuilder.originalState();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isFragmentParsing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFragmentParsing()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isFragmentParsing()}
 * @utbot.returnsFrom {@code return fragmentParsing;}
 *  */
    @Test
    public void testIsFragmentParsing_ReturnFragmentParsing() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        boolean actual = htmlTreeBuilder.isFragmentParsing();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeSetBaseUri(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.executesCondition {@code (baseUriSetFromDoc): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testMaybeSetBaseUri_BaseUriSetFromDoc() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "baseUriSetFromDoc", true);
        
        htmlTreeBuilder.maybeSetBaseUri(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.executesCondition {@code (baseUriSetFromDoc): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#absUrl(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testMaybeSetBaseUri_NotBaseUriSetFromDoc() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            
            Attributes initialFormElementAttributes = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
            
            htmlTreeBuilder.maybeSetBaseUri(formElement);
            
            Attributes finalFormElementAttributes = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
            
            assertFalse(initialFormElementAttributes == finalFormElementAttributes);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSetBaseUri(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String href = base.absUrl("href");
 *  */
    @Test
    public void testMaybeSetBaseUri_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:73)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:213)
            org.jsoup.nodes.Node.hasAttr(Node.java:102)
            org.jsoup.nodes.Node.absUrl(Node.java:184)
            org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(HtmlTreeBuilder.java:177) */
        htmlTreeBuilder.maybeSetBaseUri(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String href = base.absUrl("href");
 *  */
    @Test
    public void testMaybeSetBaseUri_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:73)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:213)
            org.jsoup.nodes.Node.hasAttr(Node.java:102)
            org.jsoup.nodes.Node.absUrl(Node.java:184)
            org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(HtmlTreeBuilder.java:177) */
        htmlTreeBuilder.maybeSetBaseUri(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#absUrl(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String href = base.absUrl("href");
 *  */
    @Test
    public void testMaybeSetBaseUri_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(HtmlTreeBuilder.java:177) */
        htmlTreeBuilder.maybeSetBaseUri(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String href = base.absUrl("href");
 *  */
    @Test
    public void testMaybeSetBaseUri_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:73)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:213)
            org.jsoup.nodes.Node.hasAttr(Node.java:102)
            org.jsoup.nodes.Node.absUrl(Node.java:184)
            org.jsoup.parser.HtmlTreeBuilder.maybeSetBaseUri(HtmlTreeBuilder.java:177) */
        htmlTreeBuilder.maybeSetBaseUri(formElement);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maybeSetBaseUri(org.jsoup.nodes.Element)
    
    @Test
    public void testMaybeSetBaseUri1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "h[\u0000\u0000";
        keys[0] = string;
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(formElement, "org.jsoup.nodes.Element", "attributes", attributes);
        
        htmlTreeBuilder.maybeSetBaseUri(formElement);
        
        Attributes formElementAttributes = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributesAttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys1 = ((String) get(formElementAttributesAttributesKeys, 1));
        Attributes formElementAttributes1 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes1AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes1, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys2 = ((String) get(formElementAttributes1AttributesKeys, 2));
        Attributes formElementAttributes2 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes2AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes2, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys3 = ((String) get(formElementAttributes2AttributesKeys, 3));
        Attributes formElementAttributes3 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes3AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes3, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys4 = ((String) get(formElementAttributes3AttributesKeys, 4));
        Attributes formElementAttributes4 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes4AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes4, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys5 = ((String) get(formElementAttributes4AttributesKeys, 5));
        Attributes formElementAttributes5 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes5AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes5, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys6 = ((String) get(formElementAttributes5AttributesKeys, 6));
        Attributes formElementAttributes6 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes6AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes6, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys7 = ((String) get(formElementAttributes6AttributesKeys, 7));
        Attributes formElementAttributes7 = ((Attributes) getFieldValue(formElement, "org.jsoup.nodes.Element", "attributes"));
        java.lang.String[] formElementAttributes7AttributesKeys = ((java.lang.String[]) getFieldValue(formElementAttributes7, "org.jsoup.nodes.Attributes", "keys"));
        String finalFormElementAttributesKeys8 = ((String) get(formElementAttributes7AttributesKeys, 8));
        
        assertNull(finalFormElementAttributesKeys1);
        
        assertNull(finalFormElementAttributesKeys2);
        
        assertNull(finalFormElementAttributesKeys3);
        
        assertNull(finalFormElementAttributesKeys4);
        
        assertNull(finalFormElementAttributesKeys5);
        
        assertNull(finalFormElementAttributesKeys6);
        
        assertNull(finalFormElementAttributesKeys7);
        
        assertNull(finalFormElementAttributesKeys8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertStartTag
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertStartTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element el = new Element(Tag.valueOf(startTagName, settings), baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertStartTag_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.insertStartTag(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertStartTag(java.lang.String)
    
    @Test
    public void testInsertStartTag1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertStartTag] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.valueOf(Tag.java:54)
                org.jsoup.parser.HtmlTreeBuilder.insertStartTag(HtmlTreeBuilder.java:211) */
            htmlTreeBuilder.insertStartTag(string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.defaultSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaultSettings()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#defaultSettings()}
 * @utbot.returnsFrom {@code return ParseSettings.htmlDefault;}
 *  */
    @Test
    public void testDefaultSettings_ReturnParseSettingsHtmlDefault() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            ParseSettings actual = htmlTreeBuilder.defaultSettings();
            
            boolean actualPreserveTagCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
            assertFalse(actualPreserveTagCase);
            
            boolean actualPreserveAttributeCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
            assertFalse(actualPreserveAttributeCase);
            
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: initialiseParse(new StringReader(inputFragment), baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        String string = " ";
        
        htmlTreeBuilder.parseFragment(string, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testParseFragment1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            String string = "";
            String string1 = "";
            
            htmlTreeBuilder.parseFragment(string, null, string1, null, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.framesetOk
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method framesetOk()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#framesetOk()}
 * @utbot.returnsFrom {@code return framesetOk;}
 *  */
    @Test
    public void testFramesetOk_ReturnFramesetOk() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        boolean actual = htmlTreeBuilder.framesetOk();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.framesetOk
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method framesetOk(boolean)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#framesetOk(boolean)}
 *  */
    @Test
    public void testFramesetOk() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.framesetOk(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.initialiseParse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        
        htmlTreeBuilder.initialiseParse(bufferedReader, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.initialiseParse(null, null, null, null);
    }
    ///endregion
    
    ///region Errors report for initialiseParse
    
    public void testInitialiseParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.markInsertionMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method markInsertionMode()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#markInsertionMode()}
 *  */
    @Test
    public void testMarkInsertionMode() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.markInsertionMode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getBaseUri
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseUri()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getBaseUri()}
 * @utbot.returnsFrom {@code return baseUri;}
 *  */
    @Test
    public void testGetBaseUri_ReturnBaseUri() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        String actual = htmlTreeBuilder.getBaseUri();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertEmpty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertEmpty(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertEmpty(org.jsoup.parser.Token.StartTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test
    public void testInsertEmpty_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertEmpty] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertEmpty(HtmlTreeBuilder.java:222) */
        htmlTreeBuilder.insertEmpty(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertEmpty(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertEmpty(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertEmpty_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        htmlTreeBuilder.insertEmpty(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertEmpty(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertEmpty_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        
        htmlTreeBuilder.insertEmpty(startTag);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertEmpty(org.jsoup.parser.Token$StartTag)
    
    @Test
    public void testInsertEmpty1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            String tagName = "\u0000";
            startTag.tagName = tagName;
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertEmpty] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.valueOf(Tag.java:54)
                org.jsoup.parser.HtmlTreeBuilder.insertEmpty(HtmlTreeBuilder.java:222) */
            htmlTreeBuilder.insertEmpty(startTag);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.replaceOnStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceOnStack(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceOnStack_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        objectArray[1] = ((Object) element);
        stack.add(objectArray);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.replaceOnStack(element, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceOnStack(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceOnStack() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.replaceOnStack(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceOnStack(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: replaceInQueue(stack, out, in);
 *  */
    @Test
    public void testReplaceOnStack_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.replaceOnStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:399)
            org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(HtmlTreeBuilder.java:395) */
        htmlTreeBuilder.replaceOnStack(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceOnStack(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceOnStack(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: replaceInQueue(stack, out, in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.replaceOnStack(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceOnStack(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: replaceInQueue(stack, out, in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceOnStack_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        htmlTreeBuilder.replaceOnStack(formElement, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resetInsertionMode()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#resetInsertionMode()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 *  */
    @Test
    public void testResetInsertionMode() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.resetInsertionMode();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resetInsertionMode()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#resetInsertionMode()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testResetInsertionMode_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:406) */
        htmlTreeBuilder.resetInsertionMode();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#resetInsertionMode()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = node.nodeName();
 *  */
    @Test
    public void testResetInsertionMode_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:412) */
        htmlTreeBuilder.resetInsertionMode();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#resetInsertionMode()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = node.nodeName();
 *  */
    @Test
    public void testResetInsertionMode_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:412) */
        htmlTreeBuilder.resetInsertionMode();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#resetInsertionMode()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testResetInsertionMode_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InColumnGroup;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:412) */
        htmlTreeBuilder.resetInsertionMode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resetInsertionMode()
    
    @Test
    public void testResetInsertionMode1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document contextElement = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement", contextElement);
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.resetInsertionMode();
    }
    
    @Test
    public void testResetInsertionMode2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element contextElement = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "sel\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(contextElement, "org.jsoup.nodes.Element", "tag", tag);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement", contextElement);
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.resetInsertionMode();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resetInsertionMode()
    
    @Test
    public void testResetInsertionMode3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:412) */
        htmlTreeBuilder.resetInsertionMode();
    }
    
    @Test
    public void testResetInsertionMode4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "s\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:412) */
        htmlTreeBuilder.resetInsertionMode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.size() == 0
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:264) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doc.appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#currentElement()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:269) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertInFosterParent(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        setField(formElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:267) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: doc.appendChild(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertNode_ThrowIllegalArgumentException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInsertNode_ThrowUnsupportedOperationException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "siblingIndex", -255);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", elementType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = element;
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#isFosterInserts()}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#currentElement()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: currentElement().appendChild(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertNode_ThrowIllegalArgumentException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(htmlTreeBuilder);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    @Test
    public void testInsertNode1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(dataNode, "org.jsoup.nodes.Node", "parentNode", parentNode);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.removeChild(Node.java:439)
            org.jsoup.nodes.Node.setParentNode(Node.java:419)
            org.jsoup.nodes.Node.reparentChild(Node.java:467)
            org.jsoup.nodes.Element.appendChild(Element.java:394)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class dataNodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", dataNodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = dataNode;
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertNode2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:396)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class documentTypeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", documentTypeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = documentType;
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertNode3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:697)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:267) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertNode(org.jsoup.nodes.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsertNode4() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsertNode5() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        htmlTreeBuilder.setFosterInserts(true);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = htmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(htmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.popStackToClose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToClose(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 *  */
    @Test
    public void testPopStackToClose() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotNextNodeNameEquals_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToClose(tagName);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotNextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToClose(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:327) */
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:330) */
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:330) */
        htmlTreeBuilder.popStackToClose(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.popStackToClose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToClose([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 *  */
    @Test
    public void testPopStackToClose1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotStringUtilIn_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        htmlTreeBuilder.popStackToClose(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotStringUtilIn_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        htmlTreeBuilder.popStackToClose(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotStringUtilIn() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        htmlTreeBuilder.popStackToClose(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_StringUtilIn() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = tagName;
        
        htmlTreeBuilder.popStackToClose(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NotStringUtilIn_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        htmlTreeBuilder.popStackToClose(stringArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:336) */
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String[])}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: StringUtil.in(next.nodeName(), elNames)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:339) */
        htmlTreeBuilder.popStackToClose(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertOnStackAfter(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testInsertOnStackAfter_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertOnStackAfter(formElement, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertOnStackAfter(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testInsertOnStackAfter() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertOnStackAfter(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertOnStackAfter(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#lastIndexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = stack.lastIndexOf(after);
 *  */
    @Test
    public void testInsertOnStackAfter_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(HtmlTreeBuilder.java:389) */
        htmlTreeBuilder.insertOnStackAfter(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertOnStackAfter(org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertOnStackAfter(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(i != -1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        htmlTreeBuilder.insertOnStackAfter(formElement, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertOnStackAfter(org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(i != -1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertOnStackAfter_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        htmlTreeBuilder.insertOnStackAfter(formElement, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getFromStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFromStack(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFromStack_ReturnNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Element actual = htmlTreeBuilder.getFromStack(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFromStack_NotNextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        Element actual = htmlTreeBuilder.getFromStack(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testGetFromStack_NextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        FormElement actual = ((FormElement) htmlTreeBuilder.getFromStack(tagName));
        
        Elements actualElements = ((Elements) getFieldValue(actual, "org.jsoup.nodes.FormElement", "elements"));
        assertNull(actualElements);
        
        Tag formElementTag = ((Tag) getFieldValue(formElement, "org.jsoup.nodes.Element", "tag"));
        Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(formElementTag, actualTag);
        
        WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
        assertNull(actualShadowChildrenRef);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Element", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
        assertNull(actualBaseUri);
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        int formElementSiblingIndex = ((Integer) getFieldValue(formElement, "org.jsoup.nodes.Node", "siblingIndex"));
        int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
        assertEquals(formElementSiblingIndex, actualSiblingIndex);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFromStack(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testGetFromStack_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.getFromStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:306) */
        htmlTreeBuilder.getFromStack(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testGetFromStack_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.getFromStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308) */
        htmlTreeBuilder.getFromStack(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testGetFromStack_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.getFromStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:308) */
        htmlTreeBuilder.getFromStack(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isElementInQueue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isElementInQueue(java.util.ArrayList, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsElementInQueue_ReturnFalse() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isElementInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("isElementInQueue", arrayListType, elementType);
        isElementInQueueMethod.setAccessible(true);
        java.lang.Object[] isElementInQueueMethodArguments = new java.lang.Object[2];
        isElementInQueueMethodArguments[0] = arrayList;
        isElementInQueueMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isElementInQueueMethod.invoke(htmlTreeBuilder, isElementInQueueMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = queue.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsElementInQueue_NextNotEqualsElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class formElementType = Class.forName("org.jsoup.nodes.Element");
        Method isElementInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("isElementInQueue", arrayListType, formElementType);
        isElementInQueueMethod.setAccessible(true);
        java.lang.Object[] isElementInQueueMethodArguments = new java.lang.Object[2];
        isElementInQueueMethodArguments[0] = arrayList;
        isElementInQueueMethodArguments[1] = formElement;
        boolean actual = ((Boolean) isElementInQueueMethod.invoke(htmlTreeBuilder, isElementInQueueMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = queue.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testIsElementInQueue_NextEqualsElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isElementInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("isElementInQueue", arrayListType, elementType);
        isElementInQueueMethod.setAccessible(true);
        java.lang.Object[] isElementInQueueMethodArguments = new java.lang.Object[2];
        isElementInQueueMethodArguments[0] = arrayList;
        isElementInQueueMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isElementInQueueMethod.invoke(htmlTreeBuilder, isElementInQueueMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isElementInQueue(java.util.ArrayList, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isElementInQueue(java.util.ArrayList,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = queue.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testIsElementInQueue_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isElementInQueue] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:296) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isElementInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("isElementInQueue", arrayListType, elementType);
        isElementInQueueMethod.setAccessible(true);
        java.lang.Object[] isElementInQueueMethodArguments = new java.lang.Object[2];
        isElementInQueueMethodArguments[0] = ((Object) null);
        isElementInQueueMethodArguments[1] = ((Object) null);
        try {
            isElementInQueueMethod.invoke(htmlTreeBuilder, isElementInQueueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.replaceInQueue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method replaceInQueue(java.util.ArrayList, org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceInQueue_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        objectArray[1] = ((Object) element);
        arrayList.add(objectArray);
        arrayList.add(element);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, elementType, elementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = element;
        replaceInQueueMethodArguments[2] = ((Object) null);
        replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testReplaceInQueue() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, elementType, elementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = ((Object) null);
        replaceInQueueMethodArguments[2] = ((Object) null);
        replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceInQueue(java.util.ArrayList, org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#lastIndexOf(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = queue.lastIndexOf(out);
 *  */
    @Test
    public void testReplaceInQueue_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.replaceInQueue] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:399) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, elementType, elementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = ((Object) null);
        replaceInQueueMethodArguments[1] = ((Object) null);
        replaceInQueueMethodArguments[2] = ((Object) null);
        try {
            replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceInQueue(java.util.ArrayList, org.jsoup.nodes.Element, org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(i != -1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceInQueue_ThrowIllegalArgumentException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class formElementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, formElementType, formElementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = formElement;
        replaceInQueueMethodArguments[2] = ((Object) null);
        try {
            replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#replaceInQueue(java.util.ArrayList,org.jsoup.nodes.Element,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(i != -1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReplaceInQueue_ThrowIllegalArgumentException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class formElementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, formElementType, formElementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = formElement;
        replaceInQueueMethodArguments[2] = ((Object) null);
        try {
            replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.popStackToBefore
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToBefore(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 *  */
    @Test
    public void testPopStackToBefore() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToBefore_NotNextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToBefore_NextNodeNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.popStackToBefore(tagName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToBefore(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToBefore_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToBefore] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:345) */
        htmlTreeBuilder.popStackToBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToBefore_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToBefore] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:347) */
        htmlTreeBuilder.popStackToBefore(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToBefore(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToBefore_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToBefore] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:347) */
        htmlTreeBuilder.popStackToBefore(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inSpecificScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inSpecificScope([Ljava.lang.String;, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testInSpecificScope_ExtraTypesNotEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        java.lang.String[] stringArray2 = new java.lang.String[1];
        stringArray2[0] = tagName;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        boolean actual = ((Boolean) inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testInSpecificScope_ReturnFalse() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[1];
        stringArray1[0] = tagName;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testInSpecificScope_ReturnTrue() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = tagName;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inSpecificScope([Ljava.lang.String;, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:162)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = el.nodeName();
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inSpecificScope([Ljava.lang.String;, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray1);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        java.lang.String[] stringArray1 = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_4() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[1];
        String string = "";
        stringArray1[0] = string;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inSpecificScope([Ljava.lang.String;, [Ljava.lang.String;, [Ljava.lang.String;)
    
    @Test
    public void testInSpecificScope1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(htmlTreeBuilder);
        stack.add(htmlTreeBuilder);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        java.lang.String[] stringArray2 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:469) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(null);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        java.lang.String[] stringArray1 = {};
        java.lang.String[] stringArray2 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:469) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(null);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[9];
        String string = "";
        stringArray1[0] = string;
        java.lang.String[] stringArray2 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope4() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(null);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        java.lang.String[] stringArray1 = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope5() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope6() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[1];
        String string = "";
        stringArray1[0] = string;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope7() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[17];
        String string = "";
        stringArray1[0] = string;
        stringArray1[1] = string;
        java.lang.String[] stringArray2 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope8() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        java.lang.String[] stringArray1 = {null};
        java.lang.String[] stringArray2 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray2);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope9() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        java.lang.String[] stringArray1 = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray1);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope10() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = new java.lang.String[1];
        String string = "";
        stringArray1[0] = string;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope11() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        stringArray[0] = string;
        java.lang.String[] stringArray1 = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringArrayType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) stringArray);
        inSpecificScopeMethodArguments[1] = ((Object) stringArray1);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inSpecificScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inSpecificScope(java.lang.String, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.returnsFrom {@code return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);}
 *  */
    @Test
    public void testInSpecificScope_HtmlTreeBuilderInSpecificScope() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class tagNameType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", tagNameType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = tagName;
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inSpecificScope(java.lang.String, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: specificScopeTarget[0] = targetName;
 *  */
    @Test
    public void testInSpecificScope_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: specificScopeTarget[0] = targetName;
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException_11() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException_21() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inSpecificScope(java.lang.String, [Ljava.lang.String;, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = ((Object) null);
        inSpecificScopeMethodArguments[1] = ((Object) null);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_21() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "";
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray1);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String,java.lang.String[],java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException_11() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "";
        java.lang.String[] stringArray = {};
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inSpecificScope(java.lang.String, [Ljava.lang.String;, [Ljava.lang.String;)
    
    @Test
    public void testInSpecificScope12() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[1] = objectArray;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        objectArray[2] = ((Object) formElement);
        stack.add(objectArray);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope13() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = new java.lang.String[2];
        String string = "";
        specificScopeTarget[1] = string;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(document);
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        String string1 = "";
        java.lang.String[] stringArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class string1Type = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", string1Type, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string1;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope14() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        String string = "";
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope15() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[1] = objectArray;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        objectArray[2] = ((Object) formElement);
        stack.add(objectArray);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        java.lang.String[] stringArray = new java.lang.String[9];
        String string1 = "";
        stringArray[0] = string1;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:163)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:467)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) null);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInSpecificScope16() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:464)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458) */
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class stringType = Class.forName("java.lang.String");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method inSpecificScopeMethod = htmlTreeBuilderClazz.getDeclaredMethod("inSpecificScope", stringType, stringArrayType, stringArrayType);
        inSpecificScopeMethod.setAccessible(true);
        java.lang.Object[] inSpecificScopeMethodArguments = new java.lang.Object[3];
        inSpecificScopeMethodArguments[0] = string;
        inSpecificScopeMethodArguments[1] = ((Object) stringArray);
        inSpecificScopeMethodArguments[2] = ((Object) stringArray1);
        try {
            inSpecificScopeMethod.invoke(htmlTreeBuilder, inSpecificScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertForm
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertForm(org.jsoup.parser.Token$StartTag, boolean)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertForm(org.jsoup.parser.Token.StartTag,boolean)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test
    public void testInsertForm_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertForm] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertForm(HtmlTreeBuilder.java:237) */
        htmlTreeBuilder.insertForm(null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertForm(org.jsoup.parser.Token$StartTag, boolean)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertForm(org.jsoup.parser.Token.StartTag,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertForm_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        htmlTreeBuilder.insertForm(startTag, false);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertForm(org.jsoup.parser.Token.StartTag,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertForm_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        
        htmlTreeBuilder.insertForm(startTag, false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertForm(org.jsoup.parser.Token$StartTag, boolean)
    
    @Test
    public void testInsertForm1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            String tagName = "\u0000";
            startTag.tagName = tagName;
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertForm] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.valueOf(Tag.java:54)
                org.jsoup.parser.HtmlTreeBuilder.insertForm(HtmlTreeBuilder.java:237) */
            htmlTreeBuilder.insertForm(startTag, false);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.removeFromStack
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeFromStack(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRemoveFromStack_ReturnFalse() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.removeFromStack(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromStack(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRemoveFromStack_NextNotEqualsEl() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = htmlTreeBuilder.removeFromStack(element);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromStack(org.jsoup.nodes.Element)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testRemoveFromStack_NextEqualsEl() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.removeFromStack(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeFromStack(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#removeFromStack(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testRemoveFromStack_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.removeFromStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.removeFromStack(HtmlTreeBuilder.java:316) */
        htmlTreeBuilder.removeFromStack(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.aboveOnStack
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method aboveOnStack(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#aboveOnStack(org.jsoup.nodes.Element)}
 * @utbot.executesCondition {@code (assert onStack(el);): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assert onStack(el);
 *  */
    @Test
    public void testAboveOnStack_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.aboveOnStack] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:296)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:292)
            org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(HtmlTreeBuilder.java:378) */
        htmlTreeBuilder.aboveOnStack(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inScope(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = {};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485) */
            htmlTreeBuilder.inScope(null, null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInScope_ThrowNullPointerException() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485) */
            htmlTreeBuilder.inScope(null, null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String,java.lang.String[])}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInScope_ThrowNullPointerException_1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = {null};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485) */
            htmlTreeBuilder.inScope(null, null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inScope([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String[])}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inSpecificScope(targetNames, TagsSearchInScope, null);
 *  */
    @Test
    public void testInScope_ThrowNullPointerException1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:477) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inScope
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inScope(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInScope1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = new java.lang.String[16];
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            ArrayList stack = new ArrayList();
            htmlTreeBuilder.stack = stack;
            
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inScope(java.lang.String)
    
    @Test
    public void testInScope2() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:481) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    
    @Test
    public void testInScope3() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = new java.lang.String[16];
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:481) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inSelectScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inSelectScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSelectScope(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testInSelectScope_ElNameEquals() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        boolean actual = htmlTreeBuilder.inSelectScope(tagName);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inSelectScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSelectScope(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testInSelectScope_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSelectScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:503) */
        htmlTreeBuilder.inSelectScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSelectScope(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = el.nodeName();
 *  */
    @Test
    public void testInSelectScope_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSelectScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:505) */
        htmlTreeBuilder.inSelectScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSelectScope(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: elName.equals(targetName)
 *  */
    @Test
    public void testInSelectScope_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSelectScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:506) */
        htmlTreeBuilder.inSelectScope(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inSelectScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inSelectScope(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#fail(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.fail("Should not be reachable");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSelectScope_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.inSelectScope(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inSelectScope(java.lang.String)
    
    @Test
    public void testInSelectScope1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        String string = "";
        
        boolean actual = htmlTreeBuilder.inSelectScope(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inTableScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inTableScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inTableScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return inSpecificScope(targetName, TagSearchTableScope, null);
 *  */
    @Test
    public void testInTableScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagSearchTableScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchTableScope"));
        try {
            java.lang.String[] tagSearchTableScope = new java.lang.String[2];
            String string = "html";
            tagSearchTableScope[0] = string;
            String string1 = "table";
            tagSearchTableScope[1] = string1;
            setStaticField(htmlTreeBuilderClazz, "TagSearchTableScope", tagSearchTableScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = {};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inTableScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:499) */
            htmlTreeBuilder.inTableScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchTableScope", prevTagSearchTableScope);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inTableScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inSpecificScope(targetName, TagSearchTableScope, null);
 *  */
    @Test
    public void testInTableScope_ThrowNullPointerException() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagSearchTableScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchTableScope"));
        try {
            java.lang.String[] tagSearchTableScope = new java.lang.String[2];
            String string = "html";
            tagSearchTableScope[0] = string;
            String string1 = "table";
            tagSearchTableScope[1] = string1;
            setStaticField(htmlTreeBuilderClazz, "TagSearchTableScope", tagSearchTableScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inTableScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:499) */
            htmlTreeBuilder.inTableScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchTableScope", prevTagSearchTableScope);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inTableScope(java.lang.String)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inSpecificScope(targetName, TagSearchTableScope, null);
 *  */
    @Test
    public void testInTableScope_ThrowNullPointerException_1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagSearchTableScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchTableScope"));
        try {
            java.lang.String[] tagSearchTableScope = new java.lang.String[2];
            String string = "html";
            tagSearchTableScope[0] = string;
            String string1 = "table";
            tagSearchTableScope[1] = string1;
            setStaticField(htmlTreeBuilderClazz, "TagSearchTableScope", tagSearchTableScope);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = {null};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inTableScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:499) */
            htmlTreeBuilder.inTableScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchTableScope", prevTagSearchTableScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getFormElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getFormElement()}
 * @utbot.returnsFrom {@code return formElement;}
 *  */
    @Test
    public void testGetFormElement_ReturnFormElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        FormElement actual = htmlTreeBuilder.getFormElement();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isSpecial
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSpecial(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSpecial(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#in(java.lang.String,java.lang.String[])}
 * @utbot.returnsFrom {@code return StringUtil.in(name, TagSearchSpecial);}
 *  */
    @Test
    public void testIsSpecial_ElementNodeName() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagSearchSpecial = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchSpecial"));
        try {
            java.lang.String[] tagSearchSpecial = new java.lang.String[40];
            String string = "address";
            tagSearchSpecial[0] = string;
            String string1 = "applet";
            tagSearchSpecial[1] = string1;
            String string2 = "area";
            tagSearchSpecial[2] = string2;
            String string3 = "article";
            tagSearchSpecial[3] = string3;
            String string4 = "aside";
            tagSearchSpecial[4] = string4;
            String string5 = "base";
            tagSearchSpecial[5] = string5;
            String string6 = "basefont";
            tagSearchSpecial[6] = string6;
            String string7 = "bgsound";
            tagSearchSpecial[7] = string7;
            String string8 = "blockquote";
            tagSearchSpecial[8] = string8;
            String string9 = "body";
            tagSearchSpecial[9] = string9;
            String string10 = "br";
            tagSearchSpecial[10] = string10;
            String string11 = "button";
            tagSearchSpecial[11] = string11;
            String string12 = "caption";
            tagSearchSpecial[12] = string12;
            String string13 = "center";
            tagSearchSpecial[13] = string13;
            String string14 = "col";
            tagSearchSpecial[14] = string14;
            String string15 = "colgroup";
            tagSearchSpecial[15] = string15;
            String string16 = "command";
            tagSearchSpecial[16] = string16;
            String string17 = "dd";
            tagSearchSpecial[17] = string17;
            String string18 = "details";
            tagSearchSpecial[18] = string18;
            String string19 = "dir";
            tagSearchSpecial[19] = string19;
            String string20 = "div";
            tagSearchSpecial[20] = string20;
            String string21 = "dl";
            tagSearchSpecial[21] = string21;
            String string22 = "dt";
            tagSearchSpecial[22] = string22;
            String string23 = "embed";
            tagSearchSpecial[23] = string23;
            String string24 = "fieldset";
            tagSearchSpecial[24] = string24;
            String string25 = "figcaption";
            tagSearchSpecial[25] = string25;
            String string26 = "figure";
            tagSearchSpecial[26] = string26;
            String string27 = "footer";
            tagSearchSpecial[27] = string27;
            String string28 = "form";
            tagSearchSpecial[28] = string28;
            String string29 = "frame";
            tagSearchSpecial[29] = string29;
            String string30 = "frameset";
            tagSearchSpecial[30] = string30;
            String string31 = "h1";
            tagSearchSpecial[31] = string31;
            String string32 = "h2";
            tagSearchSpecial[32] = string32;
            String string33 = "h3";
            tagSearchSpecial[33] = string33;
            String string34 = "h4";
            tagSearchSpecial[34] = string34;
            String string35 = "h5";
            tagSearchSpecial[35] = string35;
            String string36 = "h6";
            tagSearchSpecial[36] = string36;
            String string37 = "head";
            tagSearchSpecial[37] = string37;
            String string38 = "header";
            tagSearchSpecial[38] = string38;
            String string39 = "hgroup";
            tagSearchSpecial[39] = string39;
            setStaticField(htmlTreeBuilderClazz, "TagSearchSpecial", tagSearchSpecial);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            setField(tag, "org.jsoup.parser.Tag", "tagName", string);
            setField(element, "org.jsoup.nodes.Element", "tag", tag);
            
            boolean actual = htmlTreeBuilder.isSpecial(element);
            
            assertTrue(actual);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchSpecial", prevTagSearchSpecial);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSpecial(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isSpecial(org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = el.nodeName();
 *  */
    @Test
    public void testIsSpecial_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSpecial] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSpecial(HtmlTreeBuilder.java:573) */
        htmlTreeBuilder.isSpecial(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSpecial(org.jsoup.nodes.Element)
    
    @Test
    public void testIsSpecial1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagSearchSpecial = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchSpecial"));
        try {
            java.lang.String[] tagSearchSpecial = new java.lang.String[40];
            String string = "address";
            tagSearchSpecial[0] = string;
            String string1 = "applet";
            tagSearchSpecial[1] = string1;
            String string2 = "area";
            tagSearchSpecial[2] = string2;
            String string3 = "article";
            tagSearchSpecial[3] = string3;
            String string4 = "aside";
            tagSearchSpecial[4] = string4;
            String string5 = "base";
            tagSearchSpecial[5] = string5;
            String string6 = "basefont";
            tagSearchSpecial[6] = string6;
            String string7 = "bgsound";
            tagSearchSpecial[7] = string7;
            String string8 = "blockquote";
            tagSearchSpecial[8] = string8;
            String string9 = "body";
            tagSearchSpecial[9] = string9;
            String string10 = "br";
            tagSearchSpecial[10] = string10;
            String string11 = "button";
            tagSearchSpecial[11] = string11;
            String string12 = "caption";
            tagSearchSpecial[12] = string12;
            String string13 = "center";
            tagSearchSpecial[13] = string13;
            String string14 = "col";
            tagSearchSpecial[14] = string14;
            String string15 = "colgroup";
            tagSearchSpecial[15] = string15;
            String string16 = "command";
            tagSearchSpecial[16] = string16;
            String string17 = "dd";
            tagSearchSpecial[17] = string17;
            String string18 = "details";
            tagSearchSpecial[18] = string18;
            String string19 = "dir";
            tagSearchSpecial[19] = string19;
            String string20 = "div";
            tagSearchSpecial[20] = string20;
            String string21 = "dl";
            tagSearchSpecial[21] = string21;
            String string22 = "dt";
            tagSearchSpecial[22] = string22;
            String string23 = "embed";
            tagSearchSpecial[23] = string23;
            String string24 = "fieldset";
            tagSearchSpecial[24] = string24;
            String string25 = "figcaption";
            tagSearchSpecial[25] = string25;
            String string26 = "figure";
            tagSearchSpecial[26] = string26;
            String string27 = "footer";
            tagSearchSpecial[27] = string27;
            String string28 = "form";
            tagSearchSpecial[28] = string28;
            String string29 = "frame";
            tagSearchSpecial[29] = string29;
            String string30 = "frameset";
            tagSearchSpecial[30] = string30;
            String string31 = "h1";
            tagSearchSpecial[31] = string31;
            String string32 = "h2";
            tagSearchSpecial[32] = string32;
            String string33 = "h3";
            tagSearchSpecial[33] = string33;
            String string34 = "h4";
            tagSearchSpecial[34] = string34;
            String string35 = "h5";
            tagSearchSpecial[35] = string35;
            String string36 = "h6";
            tagSearchSpecial[36] = string36;
            String string37 = "head";
            tagSearchSpecial[37] = string37;
            String string38 = "header";
            tagSearchSpecial[38] = string38;
            String string39 = "hgroup";
            tagSearchSpecial[39] = string39;
            setStaticField(htmlTreeBuilderClazz, "TagSearchSpecial", tagSearchSpecial);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            setField(element, "org.jsoup.nodes.Element", "tag", tag);
            
            boolean actual = htmlTreeBuilder.isSpecial(element);
            
            assertFalse(actual);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchSpecial", prevTagSearchSpecial);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.setFormElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFormElement(org.jsoup.nodes.FormElement)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#setFormElement(org.jsoup.nodes.FormElement)}
 *  */
    @Test
    public void testSetFormElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.setFormElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inListItemScope
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inListItemScope(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInListItemScope1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        java.lang.String[] prevTagSearchList = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchList"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            java.lang.String[] tagSearchList = new java.lang.String[2];
            String string8 = "ol";
            tagSearchList[0] = string8;
            String string9 = "ul";
            tagSearchList[1] = string9;
            setStaticField(htmlTreeBuilderClazz, "TagSearchList", tagSearchList);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = new java.lang.String[16];
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            ArrayList stack = new ArrayList();
            htmlTreeBuilder.stack = stack;
            
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inListItemScope(java.lang.String)
    
    @Test
    public void testInListItemScope2() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        java.lang.String[] prevTagSearchList = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchList"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            java.lang.String[] tagSearchList = new java.lang.String[2];
            String string8 = "ol";
            tagSearchList[0] = string8;
            String string9 = "ul";
            tagSearchList[1] = string9;
            setStaticField(htmlTreeBuilderClazz, "TagSearchList", tagSearchList);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inListItemScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inListItemScope(HtmlTreeBuilder.java:491) */
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
        }
    }
    
    @Test
    public void testInListItemScope3() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        java.lang.String[] prevTagSearchList = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchList"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            java.lang.String[] tagSearchList = new java.lang.String[2];
            String string8 = "ol";
            tagSearchList[0] = string8;
            String string9 = "ul";
            tagSearchList[1] = string9;
            setStaticField(htmlTreeBuilderClazz, "TagSearchList", tagSearchList);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = new java.lang.String[16];
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inListItemScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inListItemScope(HtmlTreeBuilder.java:491) */
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.getHeadElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeadElement()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#getHeadElement()}
 * @utbot.returnsFrom {@code return headElement;}
 *  */
    @Test
    public void testGetHeadElement_ReturnHeadElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        Element actual = htmlTreeBuilder.getHeadElement();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.setFosterInserts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFosterInserts(boolean)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#setFosterInserts(boolean)}
 *  */
    @Test
    public void testSetFosterInserts() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.setFosterInserts(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inButtonScope
    
    ///region OTHER: ERROR SUITE for method inButtonScope(java.lang.String)
    
    @Test
    public void testInButtonScope1() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        java.lang.String[] prevTagSearchButton = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchButton"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            java.lang.String[] tagSearchButton = new java.lang.String[1];
            String string8 = "button";
            tagSearchButton[0] = string8;
            setStaticField(htmlTreeBuilderClazz, "TagSearchButton", tagSearchButton);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inButtonScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:457)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inButtonScope(HtmlTreeBuilder.java:495) */
            htmlTreeBuilder.inButtonScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchButton", prevTagSearchButton);
        }
    }
    
    @Test
    public void testInButtonScope2() throws Exception  {
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        java.lang.String[] prevTagsSearchInScope = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagsSearchInScope"));
        java.lang.String[] prevTagSearchButton = ((java.lang.String[]) getStaticFieldValue(htmlTreeBuilderClazz, "TagSearchButton"));
        try {
            java.lang.String[] tagsSearchInScope = new java.lang.String[8];
            String string = "applet";
            tagsSearchInScope[0] = string;
            String string1 = "caption";
            tagsSearchInScope[1] = string1;
            String string2 = "html";
            tagsSearchInScope[2] = string2;
            String string3 = "table";
            tagsSearchInScope[3] = string3;
            String string4 = "td";
            tagsSearchInScope[4] = string4;
            String string5 = "th";
            tagsSearchInScope[5] = string5;
            String string6 = "marquee";
            tagsSearchInScope[6] = string6;
            String string7 = "object";
            tagsSearchInScope[7] = string7;
            setStaticField(htmlTreeBuilderClazz, "TagsSearchInScope", tagsSearchInScope);
            java.lang.String[] tagSearchButton = new java.lang.String[1];
            String string8 = "button";
            tagSearchButton[0] = string8;
            setStaticField(htmlTreeBuilderClazz, "TagSearchButton", tagSearchButton);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            java.lang.String[] specificScopeTarget = new java.lang.String[16];
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inButtonScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:462)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:485)
                org.jsoup.parser.HtmlTreeBuilder.inButtonScope(HtmlTreeBuilder.java:495) */
            htmlTreeBuilder.inButtonScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchButton", prevTagSearchButton);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.setHeadElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setHeadElement(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#setHeadElement(org.jsoup.nodes.Element)}
 *  */
    @Test
    public void testSetHeadElement() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.setHeadElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.isFosterInserts
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFosterInserts()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#isFosterInserts()}
 * @utbot.returnsFrom {@code return fosterInserts;}
 *  */
    @Test
    public void testIsFosterInserts_ReturnFosterInserts() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        boolean actual = htmlTreeBuilder.isFosterInserts();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearFormattingElementsToLastMarker()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearFormattingElementsToLastMarker()}
 * @utbot.iterates iterate the loop {@code while(!formattingElements.isEmpty())} once
 *  */
    @Test
    public void testClearFormattingElementsToLastMarker_NotFormattingElementsIsEmpty() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.clearFormattingElementsToLastMarker();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearFormattingElementsToLastMarker()}
 * @utbot.iterates iterate the loop {@code while(!formattingElements.isEmpty())} twice
 *  */
    @Test
    public void testClearFormattingElementsToLastMarker_ElNotEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        formattingElements.add(document);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.clearFormattingElementsToLastMarker();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearFormattingElementsToLastMarker()}
 * @utbot.iterates iterate the loop {@code while(!formattingElements.isEmpty())} once
 *  */
    @Test
    public void testClearFormattingElementsToLastMarker_ElEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        formattingElements.add(null);
        formattingElements.add(null);
        formattingElements.add(null);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.clearFormattingElementsToLastMarker();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearFormattingElementsToLastMarker()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#clearFormattingElementsToLastMarker()}
 * @utbot.iterates iterate the loop {@code while(!formattingElements.isEmpty())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!formattingElements.isEmpty())
 *  */
    @Test
    public void testClearFormattingElementsToLastMarker_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker(HtmlTreeBuilder.java:655) */
        htmlTreeBuilder.clearFormattingElementsToLastMarker();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1004679817652200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1004679817652200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1004679817657200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004679817652200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004679817657200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1004679818002800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004679818002800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004679818004900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004679818002800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004679818004900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1004679818342100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004679818342100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004679818344800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004679818342100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004679818344800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1004679819131600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004679819131600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004679819132900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004679819131600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004679819132900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

