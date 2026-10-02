package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.CData;
import org.jsoup.parser.Token.Doctype;
import java.io.FileReader;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.EndTag;
import java.lang.reflect.Method;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.FormElement;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

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
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$StartTag)
    
    @Test
    public void testInsert1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
            String tagName = "\u0000";
            startTag.tagName = tagName;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.valueOf(Tag.java:54)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:70) */
            xmlTreeBuilder.insert(startTag);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
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
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    @Test
    public void testInsert2() throws Exception  {
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
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("!\u0000\u0000\u0000\u0000\u0001\u0080\u0200");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
                java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                java.base/java.util.Objects.checkIndex(Objects.java:359)
                java.base/java.util.ArrayList.get(ArrayList.java:427)
                org.jsoup.nodes.Element.child(Element.java:254)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:91) */
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(org.jsoup.nodes.Attributes.class, "Empty", prevEmpty);
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Comment)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert3() throws Exception  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(org.jsoup.nodes.Attributes.class, "Empty", prevEmpty);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert4() throws Exception  {
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
            StringBuilder data = new StringBuilder("!\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            comment.bogus = true;
            
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(org.jsoup.nodes.Attributes.class, "Empty", prevEmpty);
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
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
    public void testInsert5() throws Exception  {
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
    public void testInsert6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
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
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.EOF;
        cData.type = type;
        
        boolean actual = xmlTreeBuilder.process(cData);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowClassCastException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.CData cData = ((Token.CData) createInstance("org.jsoup.parser.Token$CData"));
        Token.TokenType type = Token.TokenType.Comment;
        cData.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            org.jsoup.parser.Token.asComment(Token.java:365)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:49) */
        xmlTreeBuilder.process(cData);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Character}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asCharacter());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            org.jsoup.parser.Token.asCharacter(Token.java:377)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(startTag);
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
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            org.jsoup.parser.Token.asEndTag(Token.java:357)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
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
    public void testProcess_ThrowClassCastException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            org.jsoup.parser.Token.asStartTag(Token.java:349)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:43) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asDoctype()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Doctype}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asDoctype());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @342baf27)]
            org.jsoup.parser.Token.asDoctype(Token.java:341)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(startTag);
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
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:120)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:46) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: popStackToClose(token.asEndTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: popStackToClose(token.asEndTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.activatesSwitch {@code switch(token.type) case: StartTag}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asStartTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess1() throws Exception  {
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
    public void testProcess2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!");
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
    public void testProcess3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(settings, "org.jsoup.parser.ParseSettings", "preserveTagCase", true);
        xmlTreeBuilder.settings = settings;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getSystemIdentifier(Token.java:67)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess4() throws Exception  {
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
    public void testProcess5() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:66)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:101)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:52) */
        xmlTreeBuilder.process(character);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
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
    public void testProcess7() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
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
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInsertNode_ThrowUnsupportedOperationException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[0] = objectArray;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        objectArray[1] = ((Object) document);
        stack.add(objectArray);
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        setField(document1, "org.jsoup.nodes.Node", "parentNode", parentNode);
        
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
    }
    ///endregion
    
    ///region Errors report for insertNode
    
    public void testInsertNode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.popStackToClose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.executesCondition {@code (firstFound == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPopStackToClose_FirstFoundEqualsNull() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.executesCondition {@code (firstFound == null): True}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPopStackToClose_FirstFoundEqualsNull_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.executesCondition {@code (firstFound == null): True}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testPopStackToClose_FirstFoundEqualsNull_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName1 = "\u0000\u0000";
        endTag.tagName = tagName1;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.executesCondition {@code (firstFound == null): False}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 *  */
    @Test
    public void testPopStackToClose_NextEqualsFirstFound() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.EndTag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = endTag.name();
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
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
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
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_2() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
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
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_3() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String elName = endTag.name();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPopStackToClose_ThrowIllegalArgumentException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String elName = endTag.name();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPopStackToClose_ThrowIllegalArgumentException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        
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
    
    ///region OTHER: ERROR SUITE for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    @Test
    public void testPopStackToClose1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "#docu\u0000###";
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
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1006640260764200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006640260764200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006640260772500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006640260764200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006640260772500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1006640261430100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006640261430100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006640261433600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006640261430100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006640261433600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1006640261914100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1006640261914100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1006640261916600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006640261914100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006640261916600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1006640262260400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1006640262260400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1006640262266400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1006640262260400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1006640262266400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

