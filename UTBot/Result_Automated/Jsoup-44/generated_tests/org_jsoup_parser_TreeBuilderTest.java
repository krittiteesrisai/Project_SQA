package org.jsoup.parser;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.StartTag;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_parser_TreeBuilderTest {
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#parse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: initialiseParse(input, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = "";
        
        xmlTreeBuilder.parse(string, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        xmlTreeBuilder.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        
        htmlTreeBuilder.parse(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#parse(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, ParseErrorList.noTracking());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        String string = "";
        
        htmlTreeBuilder.parse(string, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParse1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = "";
        
        xmlTreeBuilder.parse(string, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.lang.String, java.lang.String)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testParse2() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = "";
            String string1 = "";
            
            xmlTreeBuilder.parse(string, string1);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testParse3() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
            String string = "";
            
            htmlTreeBuilder.parse(string, string);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.processEndTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processEndTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(end.reset().name(name));}
 *  */
    @Test
    public void testProcessEndTag_ReturnProcess() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.EOF;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        boolean actual = xmlTreeBuilder.processEndTag(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(end.reset().name(name));}
 *  */
    @Test
    public void testProcessEndTag_ReturnProcess_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "\u0000";
        
        boolean actual = xmlTreeBuilder.processEndTag(string);
        
        assertTrue(actual);
        
        Token.EndTag xmlTreeBuilderEnd = ((Token.EndTag) getFieldValue(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
        Attributes finalXmlTreeBuilderEndAttributes = ((Attributes) getFieldValue(xmlTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "attributes"));
        
        assertNull(finalXmlTreeBuilderEndAttributes);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(end.reset().name(name));}
 *  */
    @Test
    public void testProcessEndTag_ReturnProcess_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        xmlTreeBuilder.stack = stack;
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        boolean actual = xmlTreeBuilder.processEndTag(tagName);
        
        assertTrue(actual);
        
        Token.EndTag xmlTreeBuilderEnd = ((Token.EndTag) getFieldValue(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
        Attributes finalXmlTreeBuilderEndAttributes = ((Attributes) getFieldValue(xmlTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "attributes"));
        
        assertNull(finalXmlTreeBuilderEndAttributes);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processEndTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:279)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:40)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_5() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:34)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.StartTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asStartTag(Token.java:287)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:28)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_7() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.Character;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:37)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTableText;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.Character;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:898)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.Character;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$2.process(HtmlTreeBuilderState.java:42)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCaption;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:264)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$11.process(HtmlTreeBuilderState.java:961)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.StartTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asStartTag(Token.java:287)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:272)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_8() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InRow;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.Character;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:898)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:800)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$14.anythingElse(HtmlTreeBuilderState.java:1131)
            org.jsoup.parser.HtmlTreeBuilderState$14.process(HtmlTreeBuilderState.java:1125)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.Comment;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$18.process(HtmlTreeBuilderState.java:1310)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowClassCastException_10() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.StartTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asStartTag(Token.java:287)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:272)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(end.reset().name(name));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag currentToken = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "html";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$16.anythingElse(HtmlTreeBuilderState.java:1283)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1270)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(string);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.Doctype;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$3.process(HtmlTreeBuilderState.java:71)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(end.reset().name(name));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InColumnGroup;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:76)
            org.jsoup.parser.HtmlTreeBuilderState$12.process(HtmlTreeBuilderState.java:1004)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:102)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(string);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.Doctype;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$19.process(HtmlTreeBuilderState.java:1340)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(end.reset().name(name));
 *  */
    @Test
    public void testProcessEndTag_ThrowNullPointerException_5() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:104)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processEndTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(end.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag_ThrowIllegalArgumentException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        xmlTreeBuilder.processEndTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(end.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTableBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "";
        
        htmlTreeBuilder.processEndTag(string);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processEndTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(end.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        htmlTreeBuilder.processEndTag(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method processEndTag(java.lang.String)
    
    @Test
    public void testProcessEndTag1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "\u0000";
        
        boolean actual = xmlTreeBuilder.processEndTag(string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testProcessEndTag2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.ForeignContent;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Character;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.processEndTag(null);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processEndTag(java.lang.String)
    
    @Test
    public void testProcessEndTag3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EOF currentToken = ((Token.EOF) createInstance("org.jsoup.parser.Token$EOF"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.Comment;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:17)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(string);
    }
    
    @Test
    public void testProcessEndTag4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:264)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    @Test
    public void testProcessEndTag5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000\u0000\u0000\u0000\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Doctype;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:279)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:21)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(null);
    }
    
    @Test
    public void testProcessEndTag6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "html";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$22.process(HtmlTreeBuilderState.java:1430)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(string);
    }
    
    @Test
    public void testProcessEndTag7() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$19.process(HtmlTreeBuilderState.java:1373)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        htmlTreeBuilder.processEndTag(string);
    }
    
    @Test
    public void testProcessEndTag8() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "#docu\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processEndTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:104)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31)
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71) */
        xmlTreeBuilder.processEndTag(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processEndTag(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String pendingAttributeName = "";
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        end.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        
        htmlTreeBuilder.processEndTag(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag10() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "";
        
        htmlTreeBuilder.processEndTag(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcessEndTag11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag end = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        end.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("\u0000");
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EndTag;
        end.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        String string = "";
        
        htmlTreeBuilder.processEndTag(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.runParser
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method runParser()
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", -1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.current(CharacterReader.java:36)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:12)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:161)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:27)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        java.lang.String[] stringCache = {};
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 0]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:363)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:167)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:27)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: process(token);
 *  */
    @Test
    public void testRunParser_ThrowClassCastException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag emitPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$2.process(HtmlTreeBuilderState.java:41)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testRunParser_ThrowClassCastException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag emitPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$18.process(HtmlTreeBuilderState.java:1307)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        xmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:246)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:45)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Token token = tokeniser.read();
 *  */
    @Test
    public void testRunParser_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {' '};
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:362)
            org.jsoup.parser.CharacterReader.consumeData(CharacterReader.java:167)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:27)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: process(token);
 *  */
    @Test
    public void testRunParser_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1448)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#runParser()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: process(token);
 *  */
    @Test
    public void testRunParser_ThrowNullPointerException_4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelectInTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag emitPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1215)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$17.process(HtmlTreeBuilderState.java:1301)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method runParser()
    
    @Test
    public void testRunParser1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InRow;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EOF emitPending = ((Token.EOF) createInstance("org.jsoup.parser.Token$EOF"));
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EOF cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EOF and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:898)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:800)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$14.anythingElse(HtmlTreeBuilderState.java:1131)
            org.jsoup.parser.HtmlTreeBuilderState$14.process(HtmlTreeBuilderState.java:1125)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        Token.TokenType type = Token.TokenType.Comment;
        charPending.type = type;
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$6.process(HtmlTreeBuilderState.java:198)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[1] = '\'';
        input[2] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "";
        stringCache[38] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:93)
            org.jsoup.parser.Tokeniser.emit(Tokeniser.java:105)
            org.jsoup.parser.TokeniserState$2.read(TokeniserState.java:38)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[39];
        input[37] = '\'';
        input[38] = '<';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 39);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 37);
        java.lang.String[] stringCache = new java.lang.String[39];
        String string = "\u0000";
        stringCache[38] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:231)
            org.jsoup.parser.TokeniserState$8.read(TokeniserState.java:157)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[1] = '\'';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        java.lang.String[] stringCache = new java.lang.String[39];
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.error(Tokeniser.java:231)
            org.jsoup.parser.TokeniserState$1.read(TokeniserState.java:20)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[40];
        input[31] = '\u0001';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 32);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 31);
        java.lang.String[] stringCache = new java.lang.String[1];
        String string = "\u0001";
        stringCache[0] = string;
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:53)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser7() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = new char[33];
        input[1] = '\'';
        input[2] = '&';
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 3);
        setField(reader, "org.jsoup.parser.CharacterReader", "pos", 1);
        java.lang.String[] stringCache = new java.lang.String[39];
        setField(reader, "org.jsoup.parser.CharacterReader", "stringCache", stringCache);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:57)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser8() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Doctype emitPending = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(emitPending, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", name);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:268)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$21.process(HtmlTreeBuilderState.java:1408)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTableBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.EndTag emitPending = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$13.process(HtmlTreeBuilderState.java:1023)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser10() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelectInTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "\u0000";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        Token.TokenType type = Token.TokenType.Character;
        charPending.type = type;
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1205)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$17.process(HtmlTreeBuilderState.java:1301)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCell;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        Token.TokenType type = Token.TokenType.Character;
        charPending.type = type;
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:556)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:595)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:257)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$15.anythingElse(HtmlTreeBuilderState.java:1189)
            org.jsoup.parser.HtmlTreeBuilderState$15.process(HtmlTreeBuilderState.java:1183)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser12() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        Token.TokenType type = Token.TokenType.Doctype;
        charPending.type = type;
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:167)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser13() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCaption;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:249)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$11.process(HtmlTreeBuilderState.java:961)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser14() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\u0000";
        setField(emitPending, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61)
            org.jsoup.parser.HtmlTreeBuilderState$6.anythingElse(HtmlTreeBuilderState.java:239)
            org.jsoup.parser.HtmlTreeBuilderState$6.process(HtmlTreeBuilderState.java:233)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser15() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelectInTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "\t";
        setField(emitPending, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:76)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:232)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1208)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$17.process(HtmlTreeBuilderState.java:1301)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser16() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = " ";
        setField(emitPending, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:556)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:595)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:257)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser17() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Character emitPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(emitPending, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:76)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:232)
            org.jsoup.parser.HtmlTreeBuilderState$4.process(HtmlTreeBuilderState.java:95)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:175)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        htmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser18() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CharacterReferenceInRcdata;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        xmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:26)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:50) */
        xmlTreeBuilder.runParser();
    }
    
    @Test
    public void testRunParser19() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\uFFFF', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state = TokeniserState.CharacterReferenceInRcdata;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        xmlTreeBuilder.tokeniser = tokeniser;
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.runParser] produces [java.lang.NullPointerException]
            org.jsoup.parser.CharacterReader.cacheString(CharacterReader.java:362)
            org.jsoup.parser.CharacterReader.consumeLetterThenDigitSequence(CharacterReader.java:222)
            org.jsoup.parser.Tokeniser.consumeCharacterReference(Tokeniser.java:167)
            org.jsoup.parser.TokeniserState$4.read(TokeniserState.java:71)
            org.jsoup.parser.Tokeniser.read(Tokeniser.java:50)
            org.jsoup.parser.TreeBuilder.runParser(TreeBuilder.java:49) */
        xmlTreeBuilder.runParser();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method runParser()
    
    @Test(expected = IllegalArgumentException.class)
    public void testRunParser20() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment emitPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(emitPending, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", data);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        htmlTreeBuilder.runParser();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRunParser21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        setField(reader, "org.jsoup.parser.CharacterReader", "length", -2147483647);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state1 = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state1);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        htmlTreeBuilder.runParser();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRunParser22() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelectInTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        Token.Comment emitPending = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(emitPending, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        emitPending.type = type;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "emitPending", emitPending);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        htmlTreeBuilder.runParser();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRunParser23() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending", true);
        String charsString = "";
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsString", charsString);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        Token.Character charPending = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(charPending, "org.jsoup.parser.Token$Character", "data", data);
        tokeniser.charPending = charPending;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        htmlTreeBuilder.runParser();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRunParser24() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Tokeniser tokeniser = ((Tokeniser) createInstance("org.jsoup.parser.Tokeniser"));
        CharacterReader reader = ((CharacterReader) createInstance("org.jsoup.parser.CharacterReader"));
        char[] input = {
            '\uFFFF', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(reader, "org.jsoup.parser.CharacterReader", "input", input);
        setField(reader, "org.jsoup.parser.CharacterReader", "length", 1);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "reader", reader);
        TokeniserState state1 = TokeniserState.Data;
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "state", state1);
        StringBuilder charsBuilder = new StringBuilder("");
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder", charsBuilder);
        setField(tokeniser, "org.jsoup.parser.Tokeniser", "selfClosingFlagAcknowledged", true);
        htmlTreeBuilder.tokeniser = tokeniser;
        
        htmlTreeBuilder.runParser();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.processStartTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processStartTag(java.lang.String, org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#reset()}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#nameAttr(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.invokes {@link org.jsoup.parser.TreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return process(start);}
 *  */
    @Test
    public void testProcessStartTag_TreeBuilderProcess() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName1 = "";
        start.tagName = tagName1;
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.processStartTag(null, null);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processStartTag(java.lang.String, org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Comment currentToken = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.Doctype;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:279)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:21)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$19.process(HtmlTreeBuilderState.java:1338)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1212)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_5() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InCaption;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("  ");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:295)
            org.jsoup.parser.HtmlTreeBuilderState$11.process(HtmlTreeBuilderState.java:933)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_8() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:295)
            org.jsoup.parser.HtmlTreeBuilderState$16.process(HtmlTreeBuilderState.java:1247)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:898)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:800)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$2.process(HtmlTreeBuilderState.java:42)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_6() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHtml;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$2.process(HtmlTreeBuilderState.java:42)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_7() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$4.process(HtmlTreeBuilderState.java:100)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:175)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: start.reset();
 *  */
    @Test
    public void testProcessStartTag_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:65) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.returnsFrom {@code return process(start);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71)
            org.jsoup.parser.HtmlTreeBuilderState$4.anythingElse(HtmlTreeBuilderState.java:160)
            org.jsoup.parser.HtmlTreeBuilderState$4.process(HtmlTreeBuilderState.java:154)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.returnsFrom {@code return process(start);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(start);
 *  */
    @Test
    public void testProcessStartTag_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "html";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        Token.EndTag currentToken = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        start.tagName = tagName1;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:167)
            org.jsoup.parser.HtmlTreeBuilderState$8.process(HtmlTreeBuilderState.java:781)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:67) */
        htmlTreeBuilder.processStartTag(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processStartTag(java.lang.String, org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("  ");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        htmlTreeBuilder.processStartTag(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("  ");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        String string = "";
        
        htmlTreeBuilder.processStartTag(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String,org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        htmlTreeBuilder.processStartTag(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.processStartTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processStartTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(start.reset().name(name));}
 *  */
    @Test
    public void testProcessStartTag_ReturnProcess_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        Token.StartTag xmlTreeBuilderStart = ((Token.StartTag) getFieldValue(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
        Attributes initialXmlTreeBuilderStartAttributes = ((Attributes) getFieldValue(xmlTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        
        boolean actual = xmlTreeBuilder.processStartTag(null);
        
        assertTrue(actual);
        
        Token.StartTag xmlTreeBuilderStart1 = ((Token.StartTag) getFieldValue(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
        Attributes finalXmlTreeBuilderStartAttributes = ((Attributes) getFieldValue(xmlTreeBuilderStart1, "org.jsoup.parser.Token$Tag", "attributes"));
        
        assertFalse(initialXmlTreeBuilderStartAttributes == finalXmlTreeBuilderStartAttributes);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(start.reset().name(name));}
 *  */
    @Test
    public void testProcessStartTag_ReturnProcess() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.processStartTag(null);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(start.reset().name(name));}
 *  */
    @Test
    public void testProcessStartTag_ReturnProcess_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        Token.Character currentToken = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName1 = "";
        start.tagName = tagName1;
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        HtmlTreeBuilderState initialHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token initialHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        boolean actual = htmlTreeBuilder.processStartTag(null);
        
        assertTrue(actual);
        
        HtmlTreeBuilderState finalHtmlTreeBuilderState = ((HtmlTreeBuilderState) getFieldValue(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state"));
        Token finalHtmlTreeBuilderCurrentToken = htmlTreeBuilder.currentToken;
        
        assertFalse(initialHtmlTreeBuilderState == finalHtmlTreeBuilderState);
        
        assertFalse(initialHtmlTreeBuilderCurrentToken == finalHtmlTreeBuilderCurrentToken);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processStartTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_10() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EndTag;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:295)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_11() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Doctype;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:279)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:40)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_12() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:34)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_13() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:37)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_41() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InRow;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:898)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:800)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:115)
            org.jsoup.parser.HtmlTreeBuilderState$14.anythingElse(HtmlTreeBuilderState.java:1131)
            org.jsoup.parser.HtmlTreeBuilderState$14.process(HtmlTreeBuilderState.java:1125)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_9() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.BeforeHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EndTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:295)
            org.jsoup.parser.HtmlTreeBuilderState$3.process(HtmlTreeBuilderState.java:79)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$8.process(HtmlTreeBuilderState.java:779)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_14() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:17)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Doctype;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:279)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:21)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_31() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState$8.process(HtmlTreeBuilderState.java:779)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_51() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHeadNoscript;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.EndTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:295)
            org.jsoup.parser.HtmlTreeBuilderState$5.process(HtmlTreeBuilderState.java:170)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_61() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$6.process(HtmlTreeBuilderState.java:198)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_71() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        start.tagName = tagName;
        Token.TokenType type = Token.TokenType.Comment;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:303)
            org.jsoup.parser.HtmlTreeBuilderState$7.process(HtmlTreeBuilderState.java:264)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcessStartTag_ThrowClassCastException_81() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InColumnGroup;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:311)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1449)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$12.process(HtmlTreeBuilderState.java:968)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowNullPointerException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.returnsFrom {@code return process(start.reset().name(name));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return process(start.reset().name(name));
 *  */
    @Test
    public void testProcessStartTag_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        ArrayList stack = new ArrayList();
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "html";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        Token.Comment currentToken = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken", currentToken);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        start.tagName = tagName1;
        String pendingAttributeName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.EOF;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.processStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.processEndTag(TreeBuilder.java:71)
            org.jsoup.parser.HtmlTreeBuilderState$4.anythingElse(HtmlTreeBuilderState.java:160)
            org.jsoup.parser.HtmlTreeBuilderState$4.process(HtmlTreeBuilderState.java:154)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:110)
            org.jsoup.parser.TreeBuilder.processStartTag(TreeBuilder.java:61) */
        htmlTreeBuilder.processStartTag(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processStartTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(xmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        xmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InSelect;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String pendingAttributeName = "";
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeName", pendingAttributeName);
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        start.attributes = attributes;
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        String string = "";
        
        htmlTreeBuilder.processStartTag(string);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        StringBuilder pendingAttributeValue = new StringBuilder("");
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        
        htmlTreeBuilder.processStartTag(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#processStartTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return process(start.reset().name(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcessStartTag_ThrowIllegalArgumentException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InColumnGroup;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag start = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        start.type = type;
        setField(htmlTreeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        String string = "";
        
        htmlTreeBuilder.processStartTag(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.currentElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentElement()
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#currentElement()}
 * @utbot.executesCondition {@code (size > 0): False}
 * @utbot.returnsFrom {@code return size > 0 ? stack.get(size - 1) : null;}
 *  */
    @Test
    public void testCurrentElement_SizeLessOrEqualZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        Element actual = htmlTreeBuilder.currentElement();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#currentElement()}
 * @utbot.executesCondition {@code (size > 0): True}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.returnsFrom {@code return size > 0 ? stack.get(size - 1) : null;}
 *  */
    @Test
    public void testCurrentElement_SizeGreaterThanZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        Element actual = htmlTreeBuilder.currentElement();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method currentElement()
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#currentElement()}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = stack.size();
 *  */
    @Test
    public void testCurrentElement_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.TreeBuilder.currentElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:76) */
        xmlTreeBuilder.currentElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.TreeBuilder.initialiseParse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(input, "String input must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        htmlTreeBuilder.initialiseParse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.TreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(baseUri, "BaseURI must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        String string = "";
        
        htmlTreeBuilder.initialiseParse(string, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields999641569162400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields999641569162400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass999641569176700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999641569162400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999641569176700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields999641570232700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields999641570232700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass999641570237000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999641570232700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999641570237000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields999641571467000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields999641571467000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass999641571470300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999641571467000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999641571470300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields999641571998000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields999641571998000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass999641572000700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999641571998000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999641572000700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

