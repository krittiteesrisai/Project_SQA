package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import java.util.ArrayList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.CData;
import org.jsoup.parser.Token.Doctype;
import java.io.FileReader;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.nodes.Entities;
import sun.nio.cs.UTF_8;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Document.QuirksMode;
import java.util.List;
import java.nio.charset.Charset;
import java.lang.ref.WeakReference;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.lang.reflect.InvocationTargetException;
import java.io.BufferedReader;
import java.lang.reflect.Method;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_parser_XmlTreeBuilderTest {
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:70) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        xmlTreeBuilder.insert(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name(), settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        
        xmlTreeBuilder.insert(startTag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:84) */
        xmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(insert);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:96) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus): True}
 * @utbot.executesCondition {@code (data.length() > 1): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(insert);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        comment.bogus = true;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:96) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus): True}
 * @utbot.executesCondition {@code (data.length() > 1): True}
 * @utbot.executesCondition {@code (data.startsWith("!") || data.startsWith("?")): True}
 * @utbot.executesCondition {@code (if (data.length() > 1 && (data.startsWith("!") || data.startsWith("?"))) {
 *     Document doc = Jsoup.parse("<" + data.substring(1, data.length() - 1) + ">", baseUri, Parser.xmlParser());
 *     Element el = doc.child(0);
 *     insert = new XmlDeclaration(settings.normalizeTag(el.tagName()), data.startsWith("!"));
 *     insert.attributes().addAll(el.attributes());
 * }): False}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(insert);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("  ");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        comment.bogus = true;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:96) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(insert);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:96) */
        xmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus): True}
 * @utbot.executesCondition {@code (data.length() > 1): True}
 * @utbot.executesCondition {@code (data.startsWith("!") || data.startsWith("?")): False}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#getData()}
 * @utbot.invokes {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#xmlParser()}
 * @utbot.invokes {@link org.jsoup.Jsoup#parse(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Document doc = Jsoup.parse("<" + data.substring(1, data.length() - 1) + ">", baseUri, Parser.xmlParser());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("!    @                           ");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Comment)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert1() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("?\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///region Errors report for insert
    
    public void testInsert_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Character)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String data = token.getData();
 *  */
    @Test
    public void testInsert_ThrowNullPointerException2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.executesCondition {@code (token.isCData()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(token.isCData() ? new CDataNode(data) : new TextNode(data));
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_11() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101) */
        xmlTreeBuilder.insert(character);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.executesCondition {@code (token.isCData()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(token.isCData() ? new CDataNode(data) : new TextNode(data));
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_21() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        String data = "";
        setField(cData, "org.jsoup.parser.Token$Character", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101) */
        xmlTreeBuilder.insert(cData);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.executesCondition {@code (token.isCData()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(token.isCData() ? new CDataNode(data) : new TextNode(data));
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_31() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101) */
        xmlTreeBuilder.insert(character);
    }
    ///endregion
    
    ///region Errors report for insert
    
    public void testInsert_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Doctype)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Doctype)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DocumentType doctypeNode = new DocumentType(settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
        xmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Doctype)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DocumentType doctypeNode = new DocumentType(settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_12() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder(" ");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Doctype)
    
    @Test
    public void testInsert2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0001");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getPublicIdentifier(Token.java:63)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
        xmlTreeBuilder.insert(doctype);
    }
    
    @Test
    public void testInsert3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("!");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getSystemIdentifier(Token.java:67)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, ParseErrorList.noTracking(), ParseSettings.preserveCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            FileReader fileReader = ((FileReader) createInstance("java.io.FileReader"));
            
            xmlTreeBuilder.parse(fileReader, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, ParseErrorList.noTracking(), ParseSettings.preserveCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            
            xmlTreeBuilder.parse(null, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.ParseErrorList#noTracking()}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(new StringReader(input), baseUri, ParseErrorList.noTracking(), ParseSettings.preserveCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException1() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = " ";
            
            xmlTreeBuilder.parse(string, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String, java.lang.String)
    
    @Test
    public void testParse1() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = "";
            
            Document actual = xmlTreeBuilder.parse(string, string);
            
            Document expected = ((Document) createInstance("org.jsoup.nodes.Document"));
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode", escapeMode);
            UTF_8 charset = ((UTF_8) createInstance("sun.nio.cs.UTF_8"));
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset", charset);
            ThreadLocal encoderThreadLocal = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "encoderThreadLocal", encoderThreadLocal);
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 1);
            Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
            setField(expected, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
            Document.QuirksMode quirksMode = Document.QuirksMode.noQuirks;
            setField(expected, "org.jsoup.nodes.Document", "quirksMode", quirksMode);
            setField(expected, "org.jsoup.nodes.Document", "location", string);
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "#root";
            setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
            setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
            setField(expected, "org.jsoup.nodes.Element", "tag", tag);
            List childNodes = new ArrayList();
            setField(expected, "org.jsoup.nodes.Element", "childNodes", childNodes);
            setField(expected, "org.jsoup.nodes.Element", "baseUri", string);
            
            Document.OutputSettings expectedOutputSettings = ((Document.OutputSettings) getFieldValue(expected, "org.jsoup.nodes.Document", "outputSettings"));
            Document.OutputSettings actualOutputSettings = ((Document.OutputSettings) getFieldValue(actual, "org.jsoup.nodes.Document", "outputSettings"));
            Entities.EscapeMode expectedOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
            Entities.EscapeMode actualOutputSettingsEscapeMode = ((Entities.EscapeMode) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "escapeMode"));
            assertEquals(expectedOutputSettingsEscapeMode, actualOutputSettingsEscapeMode);
            
            Charset expectedOutputSettingsCharset = ((Charset) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
            Charset actualOutputSettingsCharset = ((Charset) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "charset"));
            // java.nio.charset.Charset has overridden equals method
            assertEquals(expectedOutputSettingsCharset, actualOutputSettingsCharset);
            
            ThreadLocal expectedOutputSettingsEncoderThreadLocal = ((ThreadLocal) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "encoderThreadLocal"));
            ThreadLocal actualOutputSettingsEncoderThreadLocal = ((ThreadLocal) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "encoderThreadLocal"));
            
            Object actualOutputSettingsCoreCharset = getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "coreCharset");
            assertNull(actualOutputSettingsCoreCharset);
            
            boolean actualOutputSettingsPrettyPrint = ((Boolean) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint"));
            assertTrue(actualOutputSettingsPrettyPrint);
            
            boolean actualOutputSettingsOutline = ((Boolean) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "outline"));
            assertFalse(actualOutputSettingsOutline);
            
            int expectedOutputSettingsIndentAmount = ((Integer) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount"));
            int actualOutputSettingsIndentAmount = ((Integer) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount"));
            assertEquals(expectedOutputSettingsIndentAmount, actualOutputSettingsIndentAmount);
            
            Document.OutputSettings.Syntax expectedOutputSettingsSyntax = ((Document.OutputSettings.Syntax) getFieldValue(expectedOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax"));
            Document.OutputSettings.Syntax actualOutputSettingsSyntax = ((Document.OutputSettings.Syntax) getFieldValue(actualOutputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax"));
            assertEquals(expectedOutputSettingsSyntax, actualOutputSettingsSyntax);
            
            Document.QuirksMode expectedQuirksMode = ((Document.QuirksMode) getFieldValue(expected, "org.jsoup.nodes.Document", "quirksMode"));
            Document.QuirksMode actualQuirksMode = ((Document.QuirksMode) getFieldValue(actual, "org.jsoup.nodes.Document", "quirksMode"));
            assertEquals(expectedQuirksMode, actualQuirksMode);
            
            String expectedLocation = ((String) getFieldValue(expected, "org.jsoup.nodes.Document", "location"));
            String actualLocation = ((String) getFieldValue(actual, "org.jsoup.nodes.Document", "location"));
            assertEquals(expectedLocation, actualLocation);
            
            boolean actualUpdateMetaCharset = ((Boolean) getFieldValue(actual, "org.jsoup.nodes.Document", "updateMetaCharset"));
            assertFalse(actualUpdateMetaCharset);
            
            Tag expectedTag = ((Tag) getFieldValue(expected, "org.jsoup.nodes.Element", "tag"));
            Tag actualTag = ((Tag) getFieldValue(actual, "org.jsoup.nodes.Element", "tag"));
            // org.jsoup.parser.Tag has overridden equals method
            assertEquals(expectedTag, actualTag);
            
            WeakReference actualShadowChildrenRef = ((WeakReference) getFieldValue(actual, "org.jsoup.nodes.Element", "shadowChildrenRef"));
            assertNull(actualShadowChildrenRef);
            
            List expectedChildNodes = ((List) getFieldValue(expected, "org.jsoup.nodes.Element", "childNodes"));
            List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Element", "childNodes"));
            assertTrue(deepEquals(expectedChildNodes, actualChildNodes));
            
            Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Element", "attributes"));
            assertNull(actualAttributes);
            
            String expectedBaseUri = ((String) getFieldValue(expected, "org.jsoup.nodes.Element", "baseUri"));
            String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Element", "baseUri"));
            assertEquals(expectedBaseUri, actualBaseUri);
            
            Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
            assertNull(actualParentNode);
            
            int expectedSiblingIndex = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Node", "siblingIndex"));
            int actualSiblingIndex = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Node", "siblingIndex"));
            assertEquals(expectedSiblingIndex, actualSiblingIndex);
            
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token.TokenType#ordinal()}
 * @utbot.activatesSwitch {@code switch(token.type) case: EOF}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testProcess_TokenOrdinal() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EOF;
        endTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(endTag);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Character}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asCharacter());
 *  */
    @Test
    public void testProcess_ThrowClassCastException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asCharacter(Token.java:377)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.Doctype;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asDoctype(Token.java:341)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(cData);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asEndTag(Token.java:357)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asComment()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Comment}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asComment());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asComment(Token.java:365)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:49) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.activatesSwitch {@code switch(token.type) case: StartTag}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asStartTag());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asStartTag(Token.java:349)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:43) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:41) */
        xmlTreeBuilder.process(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.Character;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(cData);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:41) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:117)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token.TokenType#ordinal()}
 * @utbot.invokes {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.activatesSwitch {@code switch(token.type) case: StartTag}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asStartTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "!";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(endTag);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:96)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:49) */
        xmlTreeBuilder.process(comment);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getPublicIdentifier(Token.java:63)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "!";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:120)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
        xmlTreeBuilder.process(endTag);
    }
    
    @Test
    public void testProcess5() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.Character;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(cData);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess7() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:122)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess8() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.defaultSettings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaultSettings()
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#defaultSettings()}
 * @utbot.returnsFrom {@code return ParseSettings.preserveCase;}
 *  */
    @Test
    public void testDefaultSettings_ReturnParseSettingsPreserveCase() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            
            ParseSettings actual = xmlTreeBuilder.defaultSettings();
            
            boolean actualPreserveTagCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
            assertTrue(actualPreserveTagCase);
            
            boolean actualPreserveAttributeCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
            assertTrue(actualPreserveAttributeCase);
            
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method defaultSettings()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.XmlTreeBuilder}
     * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#defaultSettings()}
     */
    @Test
    public void testDefaultSettings() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        ParseSettings actual = xmlTreeBuilder.defaultSettings();
        
        ParseSettings expected = new ParseSettings(true, true);
        
        boolean actualPreserveTagCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
        assertTrue(actualPreserveTagCase);
        
        boolean actualPreserveAttributeCase = ((Boolean) getFieldValue(actual, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
        assertTrue(actualPreserveAttributeCase);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.initialiseParse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        
        xmlTreeBuilder.initialiseParse(bufferedReader, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        xmlTreeBuilder.initialiseParse(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.popStackToClose
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = settings.normalizeTag(endTag.tagName);
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:117) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = ((Object) null);
        try {
            popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.invokes {@link org.jsoup.parser.ParseSettings#normalizeTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = settings.normalizeTag(endTag.tagName);
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:117) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        try {
            popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.invokes {@link org.jsoup.parser.ParseSettings#normalizeTag(java.lang.String)}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_2() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:120) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        try {
            popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    @Test
    public void testPopStackToClose1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    @Test
    public void testPopStackToClose2() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0001";
        endTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:120) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        try {
            popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPopStackToClose3() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "!";
        endTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:122) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        try {
            popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insertNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testInsertNode_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            setField(document1, "org.jsoup.nodes.Node", "parentNode", parentNode);
            setField(document1, "org.jsoup.nodes.Node", "siblingIndex", -1);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:405)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66) */
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Class document1Type = Class.forName("org.jsoup.nodes.Node");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", document1Type);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = document1;
            try {
                insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(leafNodeClazz, "EmptyNodes", prevEmptyNodes);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_2() throws Throwable  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            DataNode dataNode = new DataNode(null, null);
            emptyNodes.add(dataNode);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            emptyNodes.add(null);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            stack.add(formElement);
            xmlTreeBuilder.stack = stack;
            PseudoTextElement pseudoTextElement = ((PseudoTextElement) createInstance("org.jsoup.nodes.PseudoTextElement"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            setField(pseudoTextElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:475)
                org.jsoup.nodes.Node.removeChild(Node.java:441)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:405)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66) */
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Class pseudoTextElementType = Class.forName("org.jsoup.nodes.Node");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", pseudoTextElementType);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = pseudoTextElement;
            try {
                insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(leafNodeClazz, "EmptyNodes", prevEmptyNodes);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#currentElement()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: currentElement().appendChild(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertNode_ThrowIllegalArgumentException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(xmlTreeBuilder);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class nodeType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = ((Object) null);
        try {
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for insertNode
    
    public void testInsertNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parseFragment(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.ParseErrorList,org.jsoup.parser.ParseSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: initialiseParse(new StringReader(inputFragment), baseUri, errors, settings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = " ";
        
        xmlTreeBuilder.parseFragment(string, null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1007151878914800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1007151878914800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1007151878927400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007151878914800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007151878927400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1007151879532100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007151879532100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007151879536000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007151879532100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007151879536000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007151880525300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007151880525300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007151880528500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007151880525300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007151880528500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1007151881570400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1007151881570400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1007151881573600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007151881570400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007151881573600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

