package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Comment;
import java.util.List;
import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.TokenType;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Element;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

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
    public void testInsert_ThrowNullPointerException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:55) */
        xmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$StartTag)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.StartTag)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name());
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Tag tag = Tag.valueOf(startTag.name());
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:70) */
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
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder(" ");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
        xmlTreeBuilder.insert(comment);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    @Test
    public void testInsert1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:85)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:80) */
            xmlTreeBuilder.insert(comment);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method insert(org.jsoup.parser.Token$Character)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 *  */
    @Test
    public void testInsert() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            setField(document, "org.jsoup.nodes.Node", "childNodes", stack);
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = new Token.Character();
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            xmlTreeBuilder.insert(character);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 *  */
    @Test
    public void testInsert_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            stack.add(document);
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
            String data = "";
            setField(character, "org.jsoup.parser.Token$Character", "data", data);
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            xmlTreeBuilder.insert(character);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Character)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node node = new TextNode(characterToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:84) */
        xmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(node);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
            String data = "";
            setField(character, "org.jsoup.parser.Token$Character", "data", data);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:85) */
            xmlTreeBuilder.insert(character);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(node);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            stack.add(null);
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
            String data = "";
            setField(character, "org.jsoup.parser.Token$Character", "data", data);
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:85) */
            xmlTreeBuilder.insert(character);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
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
    public void testInsert_ThrowNullPointerException3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:89) */
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
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder(" ");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        StringBuilder publicIdentifier = new StringBuilder("");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", publicIdentifier);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "systemIdentifier", publicIdentifier);
        
        xmlTreeBuilder.insert(doctype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.process
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.activatesSwitch {@code switch(token.type) case: EOF}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testProcess_SwitchTokenTypeCaseEOF() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.EOF;
        startTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(startTag);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testProcess_ReturnTrue() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(endTag);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testProcess_ReturnTrue_1() throws Exception  {
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
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(endTag);
        
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
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Character;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asCharacter(Token.java:335)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:37) */
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
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asEndTag(Token.java:319)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31) */
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
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asDoctype(Token.java:303)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:40) */
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
    public void testProcess_ThrowClassCastException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asComment(Token.java:327)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:34) */
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
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.StartTag;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.Token.asStartTag(Token.java:311)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:28) */
        xmlTreeBuilder.process(character);
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
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:26) */
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
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:26) */
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:103)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insert(token.asCharacter());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
            setField(character, "org.jsoup.parser.Token$Character", "data", baseUri);
            Token.TokenType type = Token.TokenType.Character;
            character.type = type;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:85)
                org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:37) */
            xmlTreeBuilder.process(character);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: popStackToClose(token.asEndTag());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_5() throws Exception  {
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
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31) */
        xmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insert(token.asCharacter());
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            stack.add(null);
            xmlTreeBuilder.stack = stack;
            String baseUri = "";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
            setField(character, "org.jsoup.parser.Token$Character", "data", baseUri);
            Token.TokenType type = Token.TokenType.Character;
            character.type = type;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:85)
                org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:37) */
            xmlTreeBuilder.process(character);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asEndTag()}
 * @utbot.invokes org.jsoup.parser.XmlTreeBuilder#popStackToClose(org.jsoup.parser.Token.EndTag)
 * @utbot.activatesSwitch {@code switch(token.type) case: EndTag}
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
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asStartTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asStartTag());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "";
        startTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.invokes {@link org.jsoup.parser.Token#asComment()}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.activatesSwitch {@code switch(token.type) case: Comment}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insert(token.asComment());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProcess_ThrowIllegalArgumentException_3() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder("");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        Token.TokenType type = Token.TokenType.Comment;
        comment.type = type;
        
        xmlTreeBuilder.process(comment);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            ArrayList emptyNodes = new ArrayList();
            setStaticField(nodeClazz, "EMPTY_NODES", emptyNodes);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            ArrayList childNodes = new ArrayList();
            setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            Token.Character character = new Token.Character();
            Token.TokenType type = Token.TokenType.Character;
            character.type = type;
            
            boolean actual = xmlTreeBuilder.process(character);
            
            assertTrue(actual);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testProcess2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        boolean actual = xmlTreeBuilder.process(endTag);
        
        assertTrue(actual);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            stack.add(element);
            xmlTreeBuilder.stack = stack;
            Token.Character character = new Token.Character();
            Token.TokenType type = Token.TokenType.Character;
            character.type = type;
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            boolean actual = xmlTreeBuilder.process(character);
            
            assertTrue(actual);
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    @Test
    public void testProcess4() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        StringBuilder publicIdentifier = new StringBuilder("\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", publicIdentifier);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.Token$Doctype.getSystemIdentifier(Token.java:61)
            org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:89)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:40) */
        xmlTreeBuilder.process(doctype);
    }
    
    @Test
    public void testProcess5() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String baseUri = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
            xmlTreeBuilder.baseUri = baseUri;
            Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
            StringBuilder data = new StringBuilder("\u0000");
            setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
            Token.TokenType type = Token.TokenType.Comment;
            comment.type = type;
            
            /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
                org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:85)
                org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51)
                org.jsoup.parser.XmlTreeBuilder.insert(XmlTreeBuilder.java:80)
                org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:34) */
            xmlTreeBuilder.process(comment);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    @Test
    public void testProcess6() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105)
            org.jsoup.parser.XmlTreeBuilder.process(XmlTreeBuilder.java:31) */
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(org.jsoup.parser.Token)
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess7() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        String tagName = "\u0000";
        startTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.StartTag;
        startTag.type = type;
        
        xmlTreeBuilder.process(startTag);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess8() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.Doctype doctype = ((Token.Doctype) createInstance("org.jsoup.parser.Token$Doctype"));
        StringBuilder name = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(doctype, "org.jsoup.parser.Token$Doctype", "name", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "publicIdentifier", name);
        setField(doctype, "org.jsoup.parser.Token$Doctype", "systemIdentifier", name);
        Token.TokenType type = Token.TokenType.Doctype;
        doctype.type = type;
        
        xmlTreeBuilder.process(doctype);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProcess9() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "";
        endTag.tagName = tagName;
        Token.TokenType type = Token.TokenType.EndTag;
        endTag.type = type;
        
        xmlTreeBuilder.process(endTag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.parseFragment
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#parseFragment(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: initialiseParse(inputFragment, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        String string = "";
        
        xmlTreeBuilder.parseFragment(string, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseFragment1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        xmlTreeBuilder.parseFragment(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testParseFragment2() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            String string = "";
            ParseErrorList parseErrorList = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
            
            xmlTreeBuilder.parseFragment(string, string, parseErrorList);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.XmlTreeBuilder.insertNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method insertNode(org.jsoup.nodes.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.parser.XmlTreeBuilder#currentElement()} twice,
    ///     {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testInsertNode() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            stack.add(formElement);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            setField(document, "org.jsoup.nodes.Node", "childNodes", stack);
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            
            Node initialFormElementParentNode = ((Node) getFieldValue(formElement, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeClazz);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = formElement;
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            
            Node finalFormElementParentNode = ((Node) getFieldValue(formElement, "org.jsoup.nodes.Node", "parentNode"));
            int finalFormElementSiblingIndex = ((Integer) getFieldValue(formElement, "org.jsoup.nodes.Node", "siblingIndex"));
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialFormElementParentNode == finalFormElementParentNode);
            
            assertEquals(2, finalFormElementSiblingIndex);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testInsertNode_1() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
            setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
            setField(element, "org.jsoup.nodes.Node", "siblingIndex", 1);
            stack.add(element);
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            setField(element1, "org.jsoup.nodes.Node", "childNodes", stack);
            stack.add(element1);
            xmlTreeBuilder.stack = stack;
            
            Node initialElementParentNode = ((Node) getFieldValue(element, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeClazz);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = element;
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            
            Node finalElementParentNode = ((Node) getFieldValue(element, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialElementParentNode == finalElementParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testInsertNode_2() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            stack.add(null);
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            stack.add(element);
            stack.add(element);
            stack.add(element);
            stack.add(null);
            stack.add(element);
            stack.add(null);
            Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
            stack.add(element1);
            FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            setField(formElement, "org.jsoup.nodes.Node", "childNodes", stack);
            stack.add(formElement);
            xmlTreeBuilder.stack = stack;
            Element element2 = ((Element) createInstance("org.jsoup.nodes.Element"));
            FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
            setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
            setField(element2, "org.jsoup.nodes.Node", "parentNode", parentNode);
            setField(element2, "org.jsoup.nodes.Node", "siblingIndex", 8);
            
            Node initialElement2ParentNode = ((Node) getFieldValue(element2, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeClazz);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = element2;
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            
            Node finalElement2ParentNode = ((Node) getFieldValue(element2, "org.jsoup.nodes.Node", "parentNode"));
            int finalElement2SiblingIndex = ((Integer) getFieldValue(element2, "org.jsoup.nodes.Node", "siblingIndex"));
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialElement2ParentNode == finalElement2ParentNode);
            
            assertEquals(9, finalElement2SiblingIndex);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.XmlTreeBuilder#currentElement()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testInsertNode_ElementAppendChild() throws Exception  {
        Class nodeClazz = Class.forName("org.jsoup.nodes.Node");
        List prevEMPTY_NODES = ((List) getStaticFieldValue(nodeClazz, "EMPTY_NODES"));
        try {
            setStaticField(nodeClazz, "EMPTY_NODES", null);
            XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
            ArrayList stack = new ArrayList();
            stack.add(null);
            Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
            stack.add(document);
            xmlTreeBuilder.stack = stack;
            Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
            
            Node initialElementParentNode = ((Node) getFieldValue(element, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object initialNodeEMPTY_NODES = object;
            
            Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
            Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", nodeClazz);
            insertNodeMethod.setAccessible(true);
            java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
            insertNodeMethodArguments[0] = element;
            insertNodeMethod.invoke(xmlTreeBuilder, insertNodeMethodArguments);
            
            Node finalElementParentNode = ((Node) getFieldValue(element, "org.jsoup.nodes.Node", "parentNode"));
            
            Object object1 = getStaticFieldValue(Node.class, "EMPTY_NODES");
            Object finalNodeEMPTY_NODES = object1;
            
            assertFalse(initialElementParentNode == finalElementParentNode);
            
            assertNull(finalNodeEMPTY_NODES);
        } finally {
            setStaticField(Node.class, "EMPTY_NODES", prevEMPTY_NODES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowIndexOutOfBoundsException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
        setField(formElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(formElement, "org.jsoup.nodes.Node", "siblingIndex", -1);
        stack.add(formElement);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 2]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:423)
            org.jsoup.nodes.Node.reparentChild(Node.java:457)
            org.jsoup.nodes.Element.appendChild(Element.java:299)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class formElementType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", formElementType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = formElement;
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
    public void testInsertNode_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        xmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51) */
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
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51) */
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
    public void testInsertNode_ThrowNullPointerException_3() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document, "org.jsoup.nodes.Node", "childNodes", stack);
        stack.add(document);
        stack.add(document);
        stack.add(document);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(element1, "org.jsoup.nodes.Node", "parentNode", document);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:301)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class element1Type = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", element1Type);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = element1;
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
    public void testInsertNode_ThrowNullPointerException_2() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
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
        xmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:463)
            org.jsoup.nodes.Node.removeChild(Node.java:424)
            org.jsoup.nodes.Node.reparentChild(Node.java:457)
            org.jsoup.nodes.Element.appendChild(Element.java:299)
            org.jsoup.parser.XmlTreeBuilder.insertNode(XmlTreeBuilder.java:51) */
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class elementType = Class.forName("org.jsoup.nodes.Node");
        Method insertNodeMethod = xmlTreeBuilderClazz.getDeclaredMethod("insertNode", elementType);
        insertNodeMethod.setAccessible(true);
        java.lang.Object[] insertNodeMethodArguments = new java.lang.Object[1];
        insertNodeMethodArguments[0] = element;
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
    public void testPopStackToClose_FirstFoundNotEqualsNull() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String elName = endTag.name();
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:100) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_1() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "\u0000";
        endTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:103) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105) */
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
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method popStackToClose(org.jsoup.parser.Token$EndTag)
    
    @Test
    public void testPopStackToClose1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(element);
        stack.add(element);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element1, "org.jsoup.nodes.Element", "tag", tag1);
        stack.add(element1);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        endTag.tagName = tagName1;
        
        Class xmlTreeBuilderClazz = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class endTagType = Class.forName("org.jsoup.parser.Token$EndTag");
        Method popStackToCloseMethod = xmlTreeBuilderClazz.getDeclaredMethod("popStackToClose", endTagType);
        popStackToCloseMethod.setAccessible(true);
        java.lang.Object[] popStackToCloseMethodArguments = new java.lang.Object[1];
        popStackToCloseMethodArguments[0] = endTag;
        popStackToCloseMethod.invoke(xmlTreeBuilder, popStackToCloseMethodArguments);
    }
    
    @Test
    public void testPopStackToClose2() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\uFFFF\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(formElement1, "org.jsoup.nodes.Element", "tag", tag1);
        stack.add(formElement1);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName2 = "\u0000\u0000";
        endTag.tagName = tagName2;
        
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
    public void testPopStackToClose3() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = objectArray;
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\uFFFF";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        objectArray[1] = ((Object) formElement);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\uFFFF";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(formElement1, "org.jsoup.nodes.Element", "tag", tag1);
        objectArray[2] = ((Object) formElement1);
        stack.add(objectArray);
        stack.add(formElement);
        stack.add(formElement1);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName2 = "\u0000\u0000";
        endTag.tagName = tagName2;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.nodes.Element ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:104) */
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
    public void testPopStackToClose4() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        stack.add(document);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName = "#do\u0000#####";
        endTag.tagName = tagName;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105) */
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
    public void testPopStackToClose5() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFFFF\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        endTag.tagName = tagName1;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105) */
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
    public void testPopStackToClose6() throws Throwable  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\uFFFF\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
        FormElement formElement1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(formElement1, "org.jsoup.nodes.Element", "tag", tag1);
        stack.add(formElement1);
        xmlTreeBuilder.stack = stack;
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        String tagName2 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        endTag.tagName = tagName2;
        
        /* This test fails because method [org.jsoup.parser.XmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.nodeName(Element.java:69)
            org.jsoup.parser.XmlTreeBuilder.popStackToClose(XmlTreeBuilder.java:105) */
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
    public void testInitialiseParse_ThrowIllegalArgumentException() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
        
        xmlTreeBuilder.initialiseParse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.XmlTreeBuilder#initialiseParse(java.lang.String,java.lang.String,org.jsoup.parser.ParseErrorList)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.initialiseParse(input, baseUri, errors);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInitialiseParse_ThrowIllegalArgumentException_1() throws Exception  {
        XmlTreeBuilder xmlTreeBuilder = ((XmlTreeBuilder) createInstance("org.jsoup.parser.XmlTreeBuilder"));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1001424803428700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1001424803428700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1001424803433100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001424803428700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001424803433100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1001424803858000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001424803858000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001424803859100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001424803858000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001424803859100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1001424804689400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001424804689400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001424804690900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001424804689400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001424804690900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1001424805544500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001424805544500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001424805546100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001424805544500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001424805546100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

