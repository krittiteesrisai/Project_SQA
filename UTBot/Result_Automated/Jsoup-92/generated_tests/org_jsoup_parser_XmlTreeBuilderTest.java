package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import java.util.ArrayList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.CData;
import org.jsoup.parser.Token.Doctype;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import jdk.internal.util.xml.impl.ReaderUTF16;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.nodes.Entities;
import sun.nio.cs.UTF_8;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Document.QuirksMode;
import java.util.List;
import java.nio.charset.Charset;
import java.io.Reader;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.EndTag;
import java.lang.ref.WeakReference;
import org.jsoup.nodes.Node;
import java.lang.reflect.Method;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.DocumentType;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:76) */
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
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$StartTag)
    
    @Test
    public void testInsert1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "\u0000";
        startTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.valueOf(Tag.java:65)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:76) */
        xmlTreeBuilder.insert(startTag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:91) */
        xmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus && comment.isXmlDeclaration()): False}
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus && comment.isXmlDeclaration()): True}
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus && comment.isXmlDeclaration()): True}
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.executesCondition {@code (commentToken.bogus && comment.isXmlDeclaration()): False}
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    @Test
    public void testInsert2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("?\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        comment.bogus = true;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:91)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
        xmlTreeBuilder.insert(comment);
    }
    
    @Test
    public void testInsert3() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("!\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:91)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100) */
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:104) */
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105) */
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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109) */
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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109) */
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Doctype)
    
    @Test
    public void testInsert4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0001");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getPublicIdentifier(Token.java:63)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109) */
        xmlTreeBuilder.insert(doctype);
    }
    
    @Test
    public void testInsert5() throws Exception  {
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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109) */
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, new Parser(this));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
            
            xmlTreeBuilder.parse(bufferedReader, null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(input, baseUri, new Parser(this));
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.io.Reader, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParse1() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            InputStreamReader inputStreamReader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
            String string = "";
            
            xmlTreeBuilder.parse(inputStreamReader, string);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parse(java.io.Reader, java.lang.String)
    
    @Test
    public void testParse2() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ReaderUTF16 readerUTF16 = ((ReaderUTF16) createInstance("jdk.internal.util.xml.impl.ReaderUTF16"));
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.parse] produces [java.lang.IllegalArgumentException: Must be true]
                org.jsoup.helper.Validate.isTrue(Validate.java:35)
                org.jsoup.parser.CharacterReader.<init>(CharacterReader.java:32)
                org.jsoup.parser.CharacterReader.<init>(CharacterReader.java:43)
                org.jsoup.parser.TreeBuilder.initialiseParse(TreeBuilder.java:38)
                org.jsoup.parser.XmlTreeBuilder.initialiseParse(XmlTreeBuilder.java:31)
                org.jsoup.parser.TreeBuilder.parse(TreeBuilder.java:46)
                org.jsoup.parser.XmlTreeBuilder.parse(XmlTreeBuilder.java:37) */
            xmlTreeBuilder.parse(readerUTF16, string);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parse(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#parse(java.io.Reader,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parse(new StringReader(input), baseUri, new Parser(this));
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
    public void testParse3() throws Exception  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
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
            Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
            setField(parser, "org.jsoup.parser.Parser", "treeBuilder", xmlTreeBuilder);
            ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
            java.lang.Object[] elementData = {};
            setField(errors, "java.util.ArrayList", "elementData", elementData);
            setField(parser, "org.jsoup.parser.Parser", "errors", errors);
            ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
            setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
            setField(settings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase", true);
            setField(parser, "org.jsoup.parser.Parser", "settings", settings);
            setField(expected, "org.jsoup.nodes.Document", "parser", parser);
            Document.QuirksMode quirksMode = Document.QuirksMode.noQuirks;
            setField(expected, "org.jsoup.nodes.Document", "quirksMode", quirksMode);
            setField(expected, "org.jsoup.nodes.Document", "location", string);
            org.jsoup.parser.Tag tag = ((org.jsoup.parser.Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "#root";
            setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(tag, "org.jsoup.parser.Tag", "normalName", tagName);
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
            
            Parser expectedParser = ((Parser) getFieldValue(expected, "org.jsoup.nodes.Document", "parser"));
            Parser actualParser = ((Parser) getFieldValue(actual, "org.jsoup.nodes.Document", "parser"));
            TreeBuilder expectedParserTreeBuilder = expectedParser.getTreeBuilder();
            TreeBuilder actualParserTreeBuilder = actualParser.getTreeBuilder();
            Parser expectedParserTreeBuilderParser = expectedParserTreeBuilder.parser;
            Parser actualParserTreeBuilderParser = actualParserTreeBuilder.parser;
            assertTrue(deepEquals(expectedParserTreeBuilderParser, actualParserTreeBuilderParser));
            ParseErrorList expectedParserTreeBuilderParserErrors = expectedParserTreeBuilderParser.getErrors();
            ParseErrorList actualParserTreeBuilderParserErrors = actualParserTreeBuilderParser.getErrors();
            int expectedParserTreeBuilderParserErrorsMaxSize = expectedParserTreeBuilderParserErrors.getMaxSize();
            int actualParserTreeBuilderParserErrorsMaxSize = actualParserTreeBuilderParserErrors.getMaxSize();
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderParserErrorsMaxSize, actualParserTreeBuilderParserErrorsMaxSize));
            
            java.lang.Object[] expectedParserTreeBuilderParserErrorsElementData = ((java.lang.Object[]) getFieldValue(expectedParserTreeBuilderParserErrors, "java.util.ArrayList", "elementData"));
            java.lang.Object[] actualParserTreeBuilderParserErrorsElementData = ((java.lang.Object[]) getFieldValue(actualParserTreeBuilderParserErrors, "java.util.ArrayList", "elementData"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderParserErrorsElementData, actualParserTreeBuilderParserErrorsElementData));
            
            int expectedParserTreeBuilderParserErrorsSize = ((Integer) getFieldValue(expectedParserTreeBuilderParserErrors, "java.util.ArrayList", "size"));
            int actualParserTreeBuilderParserErrorsSize = ((Integer) getFieldValue(actualParserTreeBuilderParserErrors, "java.util.ArrayList", "size"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderParserErrorsSize, actualParserTreeBuilderParserErrorsSize));
            
            int expectedParserTreeBuilderParserErrorsModCount = ((Integer) getFieldValue(expectedParserTreeBuilderParserErrors, "java.util.AbstractList", "modCount"));
            int actualParserTreeBuilderParserErrorsModCount = ((Integer) getFieldValue(actualParserTreeBuilderParserErrors, "java.util.AbstractList", "modCount"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderParserErrorsModCount, actualParserTreeBuilderParserErrorsModCount));
            
            ParseSettings expectedParserTreeBuilderParserSettings = ((ParseSettings) getFieldValue(expectedParserTreeBuilderParser, "org.jsoup.parser.Parser", "settings"));
            ParseSettings actualParserTreeBuilderParserSettings = ((ParseSettings) getFieldValue(actualParserTreeBuilderParser, "org.jsoup.parser.Parser", "settings"));
            boolean actualParserTreeBuilderParserSettingsPreserveTagCase = ((Boolean) getFieldValue(actualParserTreeBuilderParserSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderParserSettingsPreserveTagCase, actualParserTreeBuilderParserSettingsPreserveTagCase));
            
            boolean actualParserTreeBuilderParserSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualParserTreeBuilderParserSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderParserSettingsPreserveAttributeCase, actualParserTreeBuilderParserSettingsPreserveAttributeCase));
            
            CharacterReader expectedParserTreeBuilderReader = expectedParserTreeBuilder.reader;
            CharacterReader actualParserTreeBuilderReader = actualParserTreeBuilder.reader;
            char[] expectedParserTreeBuilderReaderCharBuf = ((char[]) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "charBuf"));
            char[] actualParserTreeBuilderReaderCharBuf = ((char[]) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "charBuf"));
            int expectedParserTreeBuilderReaderCharBufSize = expectedParserTreeBuilderReaderCharBuf.length;
            assertEquals(expectedParserTreeBuilderReaderCharBufSize, actualParserTreeBuilderReaderCharBuf.length);
            assertArrayEquals(expectedParserTreeBuilderReaderCharBuf, actualParserTreeBuilderReaderCharBuf);
            
            Reader expectedParserTreeBuilderReaderReader = ((Reader) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "reader"));
            Reader actualParserTreeBuilderReaderReader = ((Reader) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "reader"));
            
            int expectedParserTreeBuilderReaderBufLength = ((Integer) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufLength"));
            int actualParserTreeBuilderReaderBufLength = ((Integer) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufLength"));
            assertEquals(expectedParserTreeBuilderReaderBufLength, actualParserTreeBuilderReaderBufLength);
            
            int expectedParserTreeBuilderReaderBufSplitPoint = ((Integer) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint"));
            int actualParserTreeBuilderReaderBufSplitPoint = ((Integer) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufSplitPoint"));
            assertEquals(expectedParserTreeBuilderReaderBufSplitPoint, actualParserTreeBuilderReaderBufSplitPoint);
            
            int expectedParserTreeBuilderReaderBufPos = ((Integer) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufPos"));
            int actualParserTreeBuilderReaderBufPos = ((Integer) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufPos"));
            assertEquals(expectedParserTreeBuilderReaderBufPos, actualParserTreeBuilderReaderBufPos);
            
            int expectedParserTreeBuilderReaderReaderPos = ((Integer) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "readerPos"));
            int actualParserTreeBuilderReaderReaderPos = ((Integer) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "readerPos"));
            assertEquals(expectedParserTreeBuilderReaderReaderPos, actualParserTreeBuilderReaderReaderPos);
            
            int expectedParserTreeBuilderReaderBufMark = ((Integer) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufMark"));
            int actualParserTreeBuilderReaderBufMark = ((Integer) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "bufMark"));
            assertEquals(expectedParserTreeBuilderReaderBufMark, actualParserTreeBuilderReaderBufMark);
            
            java.lang.String[] expectedParserTreeBuilderReaderStringCache = ((java.lang.String[]) getFieldValue(expectedParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "stringCache"));
            java.lang.String[] actualParserTreeBuilderReaderStringCache = ((java.lang.String[]) getFieldValue(actualParserTreeBuilderReader, "org.jsoup.parser.CharacterReader", "stringCache"));
            int expectedParserTreeBuilderReaderStringCacheSize = expectedParserTreeBuilderReaderStringCache.length;
            assertEquals(expectedParserTreeBuilderReaderStringCacheSize, actualParserTreeBuilderReaderStringCache.length);
            assertTrue(deepEquals(expectedParserTreeBuilderReaderStringCache, actualParserTreeBuilderReaderStringCache));
            
            Tokeniser expectedParserTreeBuilderTokeniser = expectedParserTreeBuilder.tokeniser;
            Tokeniser actualParserTreeBuilderTokeniser = actualParserTreeBuilder.tokeniser;
            CharacterReader expectedParserTreeBuilderTokeniserReader = ((CharacterReader) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "reader"));
            CharacterReader actualParserTreeBuilderTokeniserReader = ((CharacterReader) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "reader"));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserReader, actualParserTreeBuilderTokeniserReader));
            
            ParseErrorList expectedParserTreeBuilderTokeniserErrors = ((ParseErrorList) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "errors"));
            ParseErrorList actualParserTreeBuilderTokeniserErrors = ((ParseErrorList) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "errors"));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserErrors, actualParserTreeBuilderTokeniserErrors));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserErrors, actualParserTreeBuilderTokeniserErrors));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserErrors, actualParserTreeBuilderTokeniserErrors));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserErrors, actualParserTreeBuilderTokeniserErrors));
            
            TokeniserState expectedParserTreeBuilderTokeniserState = expectedParserTreeBuilderTokeniser.getState();
            TokeniserState actualParserTreeBuilderTokeniserState = actualParserTreeBuilderTokeniser.getState();
            assertEquals(expectedParserTreeBuilderTokeniserState, actualParserTreeBuilderTokeniserState);
            
            Token expectedParserTreeBuilderTokeniserEmitPending = ((Token) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
            Token actualParserTreeBuilderTokeniserEmitPending = ((Token) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "emitPending"));
            Token.TokenType expectedParserTreeBuilderTokeniserEmitPendingType = expectedParserTreeBuilderTokeniserEmitPending.type;
            Token.TokenType actualParserTreeBuilderTokeniserEmitPendingType = actualParserTreeBuilderTokeniserEmitPending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEmitPendingType, actualParserTreeBuilderTokeniserEmitPendingType));
            
            boolean actualParserTreeBuilderTokeniserIsEmitPending = ((Boolean) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "isEmitPending"));
            assertFalse(actualParserTreeBuilderTokeniserIsEmitPending);
            
            String actualParserTreeBuilderTokeniserCharsString = ((String) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "charsString"));
            assertNull(actualParserTreeBuilderTokeniserCharsString);
            
            StringBuilder expectedParserTreeBuilderTokeniserCharsBuilder = ((StringBuilder) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder"));
            StringBuilder actualParserTreeBuilderTokeniserCharsBuilder = ((StringBuilder) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "charsBuilder"));
            
            StringBuilder expectedParserTreeBuilderTokeniserDataBuffer = expectedParserTreeBuilderTokeniser.dataBuffer;
            StringBuilder actualParserTreeBuilderTokeniserDataBuffer = actualParserTreeBuilderTokeniser.dataBuffer;
            
            Token.Tag actualParserTreeBuilderTokeniserTagPending = actualParserTreeBuilderTokeniser.tagPending;
            assertNull(actualParserTreeBuilderTokeniserTagPending);
            
            Token.StartTag expectedParserTreeBuilderTokeniserStartPending = expectedParserTreeBuilderTokeniser.startPending;
            Token.StartTag actualParserTreeBuilderTokeniserStartPending = actualParserTreeBuilderTokeniser.startPending;
            String actualParserTreeBuilderTokeniserStartPendingTagName = actualParserTreeBuilderTokeniserStartPending.tagName;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingTagName, actualParserTreeBuilderTokeniserStartPendingTagName));
            
            String actualParserTreeBuilderTokeniserStartPendingNormalName = actualParserTreeBuilderTokeniserStartPending.normalName;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingNormalName, actualParserTreeBuilderTokeniserStartPendingNormalName));
            
            String actualParserTreeBuilderTokeniserStartPendingPendingAttributeName = ((String) getFieldValue(actualParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingPendingAttributeName, actualParserTreeBuilderTokeniserStartPendingPendingAttributeName));
            
            StringBuilder expectedParserTreeBuilderTokeniserStartPendingPendingAttributeValue = ((StringBuilder) getFieldValue(expectedParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualParserTreeBuilderTokeniserStartPendingPendingAttributeValue = ((StringBuilder) getFieldValue(actualParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserStartPendingPendingAttributeValue, actualParserTreeBuilderTokeniserStartPendingPendingAttributeValue));
            
            String actualParserTreeBuilderTokeniserStartPendingPendingAttributeValueS = ((String) getFieldValue(actualParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingPendingAttributeValueS, actualParserTreeBuilderTokeniserStartPendingPendingAttributeValueS));
            
            boolean actualParserTreeBuilderTokeniserStartPendingHasEmptyAttributeValue = ((Boolean) getFieldValue(actualParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingHasEmptyAttributeValue, actualParserTreeBuilderTokeniserStartPendingHasEmptyAttributeValue));
            
            boolean actualParserTreeBuilderTokeniserStartPendingHasPendingAttributeValue = ((Boolean) getFieldValue(actualParserTreeBuilderTokeniserStartPending, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingHasPendingAttributeValue, actualParserTreeBuilderTokeniserStartPendingHasPendingAttributeValue));
            
            boolean actualParserTreeBuilderTokeniserStartPendingSelfClosing = actualParserTreeBuilderTokeniserStartPending.selfClosing;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserStartPendingSelfClosing, actualParserTreeBuilderTokeniserStartPendingSelfClosing));
            
            Attributes expectedParserTreeBuilderTokeniserStartPendingAttributes = expectedParserTreeBuilderTokeniserStartPending.attributes;
            Attributes actualParserTreeBuilderTokeniserStartPendingAttributes = actualParserTreeBuilderTokeniserStartPending.attributes;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserStartPendingAttributes, actualParserTreeBuilderTokeniserStartPendingAttributes));
            
            Token.TokenType expectedParserTreeBuilderTokeniserStartPendingType = expectedParserTreeBuilderTokeniserStartPending.type;
            Token.TokenType actualParserTreeBuilderTokeniserStartPendingType = actualParserTreeBuilderTokeniserStartPending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserStartPendingType, actualParserTreeBuilderTokeniserStartPendingType));
            
            Token.EndTag expectedParserTreeBuilderTokeniserEndPending = expectedParserTreeBuilderTokeniser.endPending;
            Token.EndTag actualParserTreeBuilderTokeniserEndPending = actualParserTreeBuilderTokeniser.endPending;
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            StringBuilder expectedParserTreeBuilderTokeniserEndPendingPendingAttributeValue = ((StringBuilder) getFieldValue(expectedParserTreeBuilderTokeniserEndPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            StringBuilder actualParserTreeBuilderTokeniserEndPendingPendingAttributeValue = ((StringBuilder) getFieldValue(actualParserTreeBuilderTokeniserEndPending, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPendingPendingAttributeValue, actualParserTreeBuilderTokeniserEndPendingPendingAttributeValue));
            
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPending, actualParserTreeBuilderTokeniserEndPending));
            Attributes actualParserTreeBuilderTokeniserEndPendingAttributes = actualParserTreeBuilderTokeniserEndPending.attributes;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserEndPendingAttributes, actualParserTreeBuilderTokeniserEndPendingAttributes));
            
            Token.TokenType expectedParserTreeBuilderTokeniserEndPendingType = expectedParserTreeBuilderTokeniserEndPending.type;
            Token.TokenType actualParserTreeBuilderTokeniserEndPendingType = actualParserTreeBuilderTokeniserEndPending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserEndPendingType, actualParserTreeBuilderTokeniserEndPendingType));
            
            Token.Character expectedParserTreeBuilderTokeniserCharPending = expectedParserTreeBuilderTokeniser.charPending;
            Token.Character actualParserTreeBuilderTokeniserCharPending = actualParserTreeBuilderTokeniser.charPending;
            String actualParserTreeBuilderTokeniserCharPendingData = actualParserTreeBuilderTokeniserCharPending.getData();
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserCharPendingData, actualParserTreeBuilderTokeniserCharPendingData));
            
            Token.TokenType expectedParserTreeBuilderTokeniserCharPendingType = expectedParserTreeBuilderTokeniserCharPending.type;
            Token.TokenType actualParserTreeBuilderTokeniserCharPendingType = actualParserTreeBuilderTokeniserCharPending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserCharPendingType, actualParserTreeBuilderTokeniserCharPendingType));
            
            Token.Doctype expectedParserTreeBuilderTokeniserDoctypePending = expectedParserTreeBuilderTokeniser.doctypePending;
            Token.Doctype actualParserTreeBuilderTokeniserDoctypePending = actualParserTreeBuilderTokeniser.doctypePending;
            StringBuilder expectedParserTreeBuilderTokeniserDoctypePendingName = expectedParserTreeBuilderTokeniserDoctypePending.name;
            StringBuilder actualParserTreeBuilderTokeniserDoctypePendingName = actualParserTreeBuilderTokeniserDoctypePending.name;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserDoctypePendingName, actualParserTreeBuilderTokeniserDoctypePendingName));
            
            String actualParserTreeBuilderTokeniserDoctypePendingPubSysKey = actualParserTreeBuilderTokeniserDoctypePending.pubSysKey;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserDoctypePendingPubSysKey, actualParserTreeBuilderTokeniserDoctypePendingPubSysKey));
            
            StringBuilder expectedParserTreeBuilderTokeniserDoctypePendingPublicIdentifier = expectedParserTreeBuilderTokeniserDoctypePending.publicIdentifier;
            StringBuilder actualParserTreeBuilderTokeniserDoctypePendingPublicIdentifier = actualParserTreeBuilderTokeniserDoctypePending.publicIdentifier;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserDoctypePendingPublicIdentifier, actualParserTreeBuilderTokeniserDoctypePendingPublicIdentifier));
            
            StringBuilder expectedParserTreeBuilderTokeniserDoctypePendingSystemIdentifier = expectedParserTreeBuilderTokeniserDoctypePending.systemIdentifier;
            StringBuilder actualParserTreeBuilderTokeniserDoctypePendingSystemIdentifier = actualParserTreeBuilderTokeniserDoctypePending.systemIdentifier;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserDoctypePendingSystemIdentifier, actualParserTreeBuilderTokeniserDoctypePendingSystemIdentifier));
            
            boolean actualParserTreeBuilderTokeniserDoctypePendingForceQuirks = actualParserTreeBuilderTokeniserDoctypePending.forceQuirks;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserDoctypePendingForceQuirks, actualParserTreeBuilderTokeniserDoctypePendingForceQuirks));
            
            Token.TokenType expectedParserTreeBuilderTokeniserDoctypePendingType = expectedParserTreeBuilderTokeniserDoctypePending.type;
            Token.TokenType actualParserTreeBuilderTokeniserDoctypePendingType = actualParserTreeBuilderTokeniserDoctypePending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserDoctypePendingType, actualParserTreeBuilderTokeniserDoctypePendingType));
            
            Token.Comment expectedParserTreeBuilderTokeniserCommentPending = expectedParserTreeBuilderTokeniser.commentPending;
            Token.Comment actualParserTreeBuilderTokeniserCommentPending = actualParserTreeBuilderTokeniser.commentPending;
            StringBuilder expectedParserTreeBuilderTokeniserCommentPendingData = expectedParserTreeBuilderTokeniserCommentPending.data;
            StringBuilder actualParserTreeBuilderTokeniserCommentPendingData = actualParserTreeBuilderTokeniserCommentPending.data;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserCommentPendingData, actualParserTreeBuilderTokeniserCommentPendingData));
            
            boolean actualParserTreeBuilderTokeniserCommentPendingBogus = actualParserTreeBuilderTokeniserCommentPending.bogus;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(actualParserTreeBuilderTokeniserCommentPendingBogus, actualParserTreeBuilderTokeniserCommentPendingBogus));
            
            Token.TokenType expectedParserTreeBuilderTokeniserCommentPendingType = expectedParserTreeBuilderTokeniserCommentPending.type;
            Token.TokenType actualParserTreeBuilderTokeniserCommentPendingType = actualParserTreeBuilderTokeniserCommentPending.type;
            // Current deep equals depth exceeds max depth 5
            assertTrue(deepEquals(expectedParserTreeBuilderTokeniserCommentPendingType, actualParserTreeBuilderTokeniserCommentPendingType));
            
            String actualParserTreeBuilderTokeniserLastStartTag = ((String) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "lastStartTag"));
            assertNull(actualParserTreeBuilderTokeniserLastStartTag);
            
            int[] expectedParserTreeBuilderTokeniserCodepointHolder = ((int[]) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "codepointHolder"));
            int[] actualParserTreeBuilderTokeniserCodepointHolder = ((int[]) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "codepointHolder"));
            int expectedParserTreeBuilderTokeniserCodepointHolderSize = expectedParserTreeBuilderTokeniserCodepointHolder.length;
            assertEquals(expectedParserTreeBuilderTokeniserCodepointHolderSize, actualParserTreeBuilderTokeniserCodepointHolder.length);
            org.junit.Assert.assertArrayEquals(expectedParserTreeBuilderTokeniserCodepointHolder, actualParserTreeBuilderTokeniserCodepointHolder);
            
            int[] expectedParserTreeBuilderTokeniserMultipointHolder = ((int[]) getFieldValue(expectedParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "multipointHolder"));
            int[] actualParserTreeBuilderTokeniserMultipointHolder = ((int[]) getFieldValue(actualParserTreeBuilderTokeniser, "org.jsoup.parser.Tokeniser", "multipointHolder"));
            int expectedParserTreeBuilderTokeniserMultipointHolderSize = expectedParserTreeBuilderTokeniserMultipointHolder.length;
            assertEquals(expectedParserTreeBuilderTokeniserMultipointHolderSize, actualParserTreeBuilderTokeniserMultipointHolder.length);
            org.junit.Assert.assertArrayEquals(expectedParserTreeBuilderTokeniserMultipointHolder, actualParserTreeBuilderTokeniserMultipointHolder);
            
            Document expectedParserTreeBuilderDoc = expectedParserTreeBuilder.doc;
            Document actualParserTreeBuilderDoc = actualParserTreeBuilder.doc;
            assertTrue(deepEquals(expectedParserTreeBuilderDoc, actualParserTreeBuilderDoc));
            assertTrue(deepEquals(expectedParserTreeBuilderDoc, actualParserTreeBuilderDoc));
            Document.QuirksMode expectedParserTreeBuilderDocQuirksMode = ((Document.QuirksMode) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Document", "quirksMode"));
            Document.QuirksMode actualParserTreeBuilderDocQuirksMode = ((Document.QuirksMode) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Document", "quirksMode"));
            assertEquals(expectedParserTreeBuilderDocQuirksMode, actualParserTreeBuilderDocQuirksMode);
            
            String expectedParserTreeBuilderDocLocation = ((String) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Document", "location"));
            String actualParserTreeBuilderDocLocation = ((String) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Document", "location"));
            assertEquals(expectedParserTreeBuilderDocLocation, actualParserTreeBuilderDocLocation);
            
            boolean actualParserTreeBuilderDocUpdateMetaCharset = ((Boolean) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Document", "updateMetaCharset"));
            assertFalse(actualParserTreeBuilderDocUpdateMetaCharset);
            
            org.jsoup.parser.Tag expectedParserTreeBuilderDocTag = ((org.jsoup.parser.Tag) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Element", "tag"));
            org.jsoup.parser.Tag actualParserTreeBuilderDocTag = ((org.jsoup.parser.Tag) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Element", "tag"));
            // org.jsoup.parser.Tag has overridden equals method
            assertEquals(expectedParserTreeBuilderDocTag, actualParserTreeBuilderDocTag);
            
            WeakReference actualParserTreeBuilderDocShadowChildrenRef = ((WeakReference) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Element", "shadowChildrenRef"));
            assertNull(actualParserTreeBuilderDocShadowChildrenRef);
            
            List expectedParserTreeBuilderDocChildNodes = ((List) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Element", "childNodes"));
            List actualParserTreeBuilderDocChildNodes = ((List) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Element", "childNodes"));
            assertTrue(deepEquals(expectedParserTreeBuilderDocChildNodes, actualParserTreeBuilderDocChildNodes));
            
            Attributes actualParserTreeBuilderDocAttributes = ((Attributes) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Element", "attributes"));
            assertNull(actualParserTreeBuilderDocAttributes);
            
            String expectedParserTreeBuilderDocBaseUri = ((String) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Element", "baseUri"));
            String actualParserTreeBuilderDocBaseUri = ((String) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Element", "baseUri"));
            assertEquals(expectedParserTreeBuilderDocBaseUri, actualParserTreeBuilderDocBaseUri);
            
            Node actualParserTreeBuilderDocParentNode = ((Node) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Node", "parentNode"));
            assertNull(actualParserTreeBuilderDocParentNode);
            
            int expectedParserTreeBuilderDocSiblingIndex = ((Integer) getFieldValue(expectedParserTreeBuilderDoc, "org.jsoup.nodes.Node", "siblingIndex"));
            int actualParserTreeBuilderDocSiblingIndex = ((Integer) getFieldValue(actualParserTreeBuilderDoc, "org.jsoup.nodes.Node", "siblingIndex"));
            assertEquals(expectedParserTreeBuilderDocSiblingIndex, actualParserTreeBuilderDocSiblingIndex);
            
            ArrayList expectedParserTreeBuilderStack = expectedParserTreeBuilder.stack;
            ArrayList actualParserTreeBuilderStack = actualParserTreeBuilder.stack;
            assertTrue(deepEquals(expectedParserTreeBuilderStack, actualParserTreeBuilderStack));
            
            String expectedParserTreeBuilderBaseUri = expectedParserTreeBuilder.baseUri;
            String actualParserTreeBuilderBaseUri = actualParserTreeBuilder.baseUri;
            assertEquals(expectedParserTreeBuilderBaseUri, actualParserTreeBuilderBaseUri);
            
            Token actualParserTreeBuilderCurrentToken = actualParserTreeBuilder.currentToken;
            assertNull(actualParserTreeBuilderCurrentToken);
            
            ParseSettings expectedParserTreeBuilderSettings = expectedParserTreeBuilder.settings;
            ParseSettings actualParserTreeBuilderSettings = actualParserTreeBuilder.settings;
            assertTrue(deepEquals(expectedParserTreeBuilderSettings, actualParserTreeBuilderSettings));
            assertTrue(deepEquals(expectedParserTreeBuilderSettings, actualParserTreeBuilderSettings));
            
            Token.StartTag actualParserTreeBuilderStart = ((Token.StartTag) getFieldValue(actualParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start"));
            assertNull(actualParserTreeBuilderStart);
            
            Token.EndTag actualParserTreeBuilderEnd = ((Token.EndTag) getFieldValue(actualParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end"));
            assertNull(actualParserTreeBuilderEnd);
            
            assertTrue(deepEquals(expectedParser, actualParser));
            assertTrue(deepEquals(expectedParser, actualParser));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
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
 *  */
    @Test
    public void testProcess_TokenOrdinal() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EOF;
        startTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(startTag);
        
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
            org.jsoup.parser.Token.asCharacter(Token.java:379)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:58) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.EndTag;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asEndTag(Token.java:359)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(cData);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asComment()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Comment}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asComment());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asComment(Token.java:367)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asDoctype()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Doctype}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asDoctype());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asDoctype(Token.java:343)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:61) */
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
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.StartTag;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            org.jsoup.parser.Token.asStartTag(Token.java:351)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:49) */
        xmlTreeBuilder.process(cData);
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
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:47) */
        xmlTreeBuilder.process(null);
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
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:47) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:121)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token.TokenType#ordinal()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: switch(token.type)
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
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:91)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:100)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(comment);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "!";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:124)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(endTag);
    }
    
    @Test
    public void testProcess4() throws Exception  {
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
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:61) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess5() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:58) */
        xmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.Character;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:58) */
        xmlTreeBuilder.process(cData);
    }
    
    @Test
    public void testProcess7() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:109)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:61) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess8() throws Exception  {
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:126)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess9() throws Exception  {
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
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#parseFragment(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return parseFragment(inputFragment, baseUri, parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = " ";
        
        xmlTreeBuilder.parseFragment(string, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testParseFragment1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.parseFragment] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.initialiseParse(TreeBuilder.java:37)
                org.jsoup.parser.XmlTreeBuilder.initialiseParse(XmlTreeBuilder.java:31)
                org.jsoup.parser.XmlTreeBuilder.parseFragment(XmlTreeBuilder.java:144)
                org.jsoup.parser.XmlTreeBuilder.parseFragment(XmlTreeBuilder.java:150) */
            xmlTreeBuilder.parseFragment(string, null, string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parseFragment(java.lang.String,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: initialiseParse(new StringReader(inputFragment), baseUri, parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = " ";
        
        xmlTreeBuilder.parseFragment(string, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testParseFragment2() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.parseFragment] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.initialiseParse(TreeBuilder.java:37)
                org.jsoup.parser.XmlTreeBuilder.initialiseParse(XmlTreeBuilder.java:31)
                org.jsoup.parser.XmlTreeBuilder.parseFragment(XmlTreeBuilder.java:144) */
            xmlTreeBuilder.parseFragment(string, string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:121) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:121) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:124) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:124) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:126) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72) */
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_2() throws Throwable  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
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
            org.jsoup.nodes.Comment parentNode = ((org.jsoup.nodes.Comment) createInstance("org.jsoup.nodes.Comment"));
            setField(pseudoTextElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
            setField(pseudoTextElement, "org.jsoup.nodes.Node", "siblingIndex", 4);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Node.reindexChildren(Node.java:475)
                org.jsoup.nodes.Node.removeChild(Node.java:441)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:415)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72) */
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
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        objectArray[1] = ((Object) document);
        stack.add(objectArray);
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
    
    ///region OTHER: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    @Test
    public void testInsertNode1() throws Throwable  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
            CDataNode parentNode = ((CDataNode) createInstance("org.jsoup.nodes.CDataNode"));
            setField(document1, "org.jsoup.nodes.Node", "parentNode", parentNode);
            setField(document1, "org.jsoup.nodes.Node", "siblingIndex", 807403520);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.IndexOutOfBoundsException: Index 807403520 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.remove(ArrayList.java:504)
                org.jsoup.nodes.Node.removeChild(Node.java:440)
                org.jsoup.nodes.Node.setParentNode(Node.java:420)
                org.jsoup.nodes.Node.reparentChild(Node.java:468)
                org.jsoup.nodes.Element.appendChild(Element.java:415)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72) */
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
    
    @Test
    public void testInsertNode2() throws Throwable  {
        Class leafNodeClazz = Class.forName("org.jsoup.nodes.LeafNode");
        List prevEmptyNodes = ((List) getStaticFieldValue(leafNodeClazz, "EmptyNodes"));
        try {
            ArrayList emptyNodes = new ArrayList();
            emptyNodes.add(null);
            CDataNode cDataNode = new CDataNode(null);
            emptyNodes.add(cDataNode);
            CDataNode cDataNode1 = new CDataNode(null);
            emptyNodes.add(cDataNode1);
            CDataNode cDataNode2 = new CDataNode(null);
            emptyNodes.add(cDataNode2);
            CDataNode cDataNode3 = new CDataNode(null);
            emptyNodes.add(cDataNode3);
            emptyNodes.add(cDataNode);
            emptyNodes.add(cDataNode3);
            emptyNodes.add(cDataNode);
            CDataNode cDataNode4 = new CDataNode(null);
            emptyNodes.add(cDataNode4);
            emptyNodes.add(cDataNode4);
            setStaticField(leafNodeClazz, "EmptyNodes", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            stack.add(formElement);
            xmlTreeBuilder.stack = stack;
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
            setField(document, "org.jsoup.nodes.Node", "parentNode", parentNode);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Element.appendChild(Element.java:417)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:72) */
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Class documentType = Class.forName("org.jsoup.nodes.Node");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", documentType);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = document;
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
    
    ///region Errors report for insertNode
    
    public void testInsertNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.initialiseParse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        BufferedReader bufferedReader = ((BufferedReader) createInstance("java.io.BufferedReader"));
        
        xmlTreeBuilder.initialiseParse(bufferedReader, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.io.Reader,java.lang.String,org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, parser);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        xmlTreeBuilder.initialiseParse(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)
    
    @Test
    public void testInitialiseParse1() throws Exception  {
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ReaderUTF16 readerUTF16 = ((ReaderUTF16) createInstance("jdk.internal.util.xml.impl.ReaderUTF16"));
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.initialiseParse] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.initialiseParse(TreeBuilder.java:37)
                org.jsoup.parser.XmlTreeBuilder.initialiseParse(XmlTreeBuilder.java:31) */
            xmlTreeBuilder.initialiseParse(readerUTF16, string, null);
        } finally {
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1009925130802200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009925130802200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009925130808900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009925130802200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009925130808900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1009925131266900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009925131266900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009925131271300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009925131266900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009925131271300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009925131969700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009925131969700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009925131973400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009925131969700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009925131973400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009925132640900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009925132640900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009925132644900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009925132640900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009925132644900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

