package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.lang.reflect.Method;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag tag = Tag.valueOf(startTag.name());
 *  */
    @Test
    public void testInsert_ThrowNullPointerException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:50) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.StartTag#name()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:65) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#getData()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comment comment = new Comment(commentToken.getData(), baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder(" ");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        xmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    @Test
    public void testInsert1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "";
        xmlTreeBuilder.baseUri = baseUri;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:58)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:46)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:67) */
        xmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Character)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node = new TextNode(characterToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:71) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Doctype)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Doctype)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DocumentType doctypeNode = new DocumentType(d.getName(), d.getPublicIdentifier(), d.getSystemIdentifier(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException3() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:76) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Doctype)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Doctype)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getName()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getPublicIdentifier()}
 * @utbot.invokes {@link org.jsoup.parser.Token.Doctype#getSystemIdentifier()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: DocumentType doctypeNode = new DocumentType(d.getName(), d.getPublicIdentifier(), d.getSystemIdentifier(), baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        StringBuilder publicIdentifier = new StringBuilder("\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", publicIdentifier);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "systemIdentifier", name);
        
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Doctype)
    
    @Test
    public void testInsert2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "\u0001\u0001";
        xmlTreeBuilder.baseUri = baseUri;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "systemIdentifier", name);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:58)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:46)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:77) */
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Doctype)
    
    @Test(expected = IllegalArgumentException.class)
    public void testInsert3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "";
        xmlTreeBuilder.baseUri = baseUri;
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "systemIdentifier", name);
        
        xmlTreeBuilder.insert(doctype);
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
    public void testProcess_TokenOrdinal() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag(null);
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
 * @utbot.invokes {@link org.jsoup.parser.Token#asStartTag()}
 * @utbot.activatesSwitch {@code switch(token.type) case: StartTag}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asStartTag());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        Token.TokenType type = Token.TokenType.StartTag;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.jsoup.parser.Token.asStartTag(Token.java:223)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:23) */
        xmlTreeBuilder.process(doctype);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowClassCastException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag(null);
        Token.TokenType type = Token.TokenType.Comment;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.jsoup.parser.Token.asComment(Token.java:239)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:29) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag(null);
        Token.TokenType type = Token.TokenType.Doctype;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.jsoup.parser.Token.asDoctype(Token.java:215)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:35) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asCharacter()}
 * @utbot.activatesSwitch {@code switch(token.type) case: Character}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: insert(token.asCharacter());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag(null, null);
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.jsoup.parser.Token.asCharacter(Token.java:247)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:32) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowClassCastException_3() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag(null, null);
        Token.TokenType type = Token.TokenType.EndTag;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @76774c2c)]
            org.jsoup.parser.Token.asEndTag(Token.java:231)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:26) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:21) */
        xmlTreeBuilder.process(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "\u0000";
        Token.EndTag endTag = new Token.EndTag(string);
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:90)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:26) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token.TokenType#ordinal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(token.type)
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag(null);
        endTag.type = null;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:21) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asComment()}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.activatesSwitch {@code switch(token.type) case: Comment}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asComment());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        xmlTreeBuilder.process(comment);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asEndTag()}
 * @utbot.invokes org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)
 * @utbot.activatesSwitch {@code switch(token.type) case: EndTag}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: popStackToClose(token.asEndTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "";
        Token.EndTag endTag = new Token.EndTag(string);
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
    public void testProcess_ThrowIllegalArgumentException_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "";
        Token.StartTag startTag = new Token.StartTag(string, null);
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "";
        xmlTreeBuilder.baseUri = baseUri;
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("\u0000\u0004\u0001\u0000\u0401\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:58)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:46)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:67)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:29) */
        xmlTreeBuilder.process(comment);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.popStackToClose
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)}
 * @utbot.invokes {@link org.jsoup.parser.Token.EndTag#name()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = endTag.name();
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:87) */
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
 * @utbot.invokes {@link org.jsoup.parser.Token.EndTag#name()}
 * @utbot.invokes {@link org.jsoup.helper.DescendableLinkedList#descendingIterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Element> it = stack.descendingIterator();
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "\u0000";
        Token.EndTag endTag = new Token.EndTag(string);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:90) */
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
 * @utbot.invokes {@link org.jsoup.parser.Token.EndTag#name()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String elName = endTag.name();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPopStackToClose_ThrowIllegalArgumentException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "";
        Token.EndTag endTag = new Token.EndTag(string);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        
        xmlTreeBuilder.initialiseParse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String string = "";
        
        xmlTreeBuilder.initialiseParse(string, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields997520303047400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields997520303047400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass997520303051500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields997520303047400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass997520303051500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

