package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.TokenType;
import java.io.BufferedReader;
import org.jsoup.nodes.Attributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.lang.reflect.Method;
import org.jsoup.nodes.DocumentType;
import org.jsoup.select.Elements;
import java.lang.ref.WeakReference;
import org.jsoup.nodes.Node;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyList;
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
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testInsert_ThrowIndexOutOfBoundsException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "siblingIndex", -1);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:455)
            org.jsoup.nodes.Node.reparentChild(Node.java:489)
            org.jsoup.nodes.Element.appendChild(Element.java:354)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:266)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(element);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:265)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:266)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertNode(el);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:270)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_3() throws Exception  {
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
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:309)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:698)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:268)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:217) */
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.nodes.Element)}
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: insertNode(el);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insert(null);
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
    public void testInsert_ThrowNullPointerException1() throws Exception  {
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
    public void testInsert_ThrowIllegalArgumentException1() throws Exception  {
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Comment comment = new Comment(commentToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:248) */
        htmlTreeBuilder.insert(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insert(org.jsoup.parser.Token$Comment)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Comment)}
 * @utbot.invokes {@link org.jsoup.parser.Token.Comment#getData()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Comment comment = new Comment(commentToken.getData(), baseUri);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsert_ThrowIllegalArgumentException2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Comment comment = ((Token.Comment) createInstance("org.jsoup.parser.Token$Comment"));
        StringBuilder data = new StringBuilder(" ");
        setField(comment, "org.jsoup.parser.Token$Comment", "data", data);
        
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
    public void testInsert_ThrowNullPointerException3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:255) */
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
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:256) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.executesCondition {@code (tagName.equals("script") || tagName.equals("style")): False}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node = new DataNode(characterToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_31() throws Exception  {
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
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:259) */
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
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:255) */
        htmlTreeBuilder.insert(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insert(org.jsoup.parser.Token.Character)}
 * @utbot.executesCondition {@code (tagName.equals("script") || tagName.equals("style")): False}
 * @utbot.invokes {@link org.jsoup.parser.Token.Character#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node = new DataNode(characterToken.getData(), baseUri);
 *  */
    @Test
    public void testInsert_ThrowNullPointerException_4() throws Exception  {
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
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:356)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:260) */
        htmlTreeBuilder.insert(character);
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
            org.jsoup.parser.HtmlTreeBuilder.push(HtmlTreeBuilder.java:285) */
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
            org.jsoup.parser.HtmlTreeBuilder.pop(HtmlTreeBuilder.java:281) */
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
            org.jsoup.parser.HtmlTreeBuilder.pop(HtmlTreeBuilder.java:280) */
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        stack.add(formElement);
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
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:297)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:293) */
        htmlTreeBuilder.onStack(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(org.jsoup.parser.Token)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcess_ThrowClassCastException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTable;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Character;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asCharacter(Token.java:363)
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:905)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:807)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterHead;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asComment(Token.java:355)
            org.jsoup.parser.HtmlTreeBuilderState$6.process(HtmlTreeBuilderState.java:199)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.AfterAfterFrameset;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Comment;
        endTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asComment(Token.java:355)
            org.jsoup.parser.HtmlTreeBuilderState$22.process(HtmlTreeBuilderState.java:1438)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(endTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1464)
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
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InRow;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Doctype;
        startTag.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.error(HtmlTreeBuilder.java:190)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:812)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$14.anythingElse(HtmlTreeBuilderState.java:1139)
            org.jsoup.parser.HtmlTreeBuilderState$14.process(HtmlTreeBuilderState.java:1133)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(startTag);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.returnsFrom {@code return this.state.process(token, this);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Text;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = ((Token.Character) createInstance("org.jsoup.parser.Token$Character"));
        String data = "";
        setField(character, "org.jsoup.parser.Token$Character", "data", data);
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.HtmlTreeBuilder.insert(HtmlTreeBuilder.java:255)
            org.jsoup.parser.HtmlTreeBuilderState$8.process(HtmlTreeBuilderState.java:786)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState state = HtmlTreeBuilderState.InTableBody;
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state", state);
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState$10.process(HtmlTreeBuilderState.java:906)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133)
            org.jsoup.parser.HtmlTreeBuilderState$9.process(HtmlTreeBuilderState.java:807)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138)
            org.jsoup.parser.HtmlTreeBuilderState$13.anythingElse(HtmlTreeBuilderState.java:1086)
            org.jsoup.parser.HtmlTreeBuilderState$13.process(HtmlTreeBuilderState.java:1069)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:133) */
        htmlTreeBuilder.process(character);
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
    public void testProcess_ThrowClassCastException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.StartTag startTag = ((Token.StartTag) createInstance("org.jsoup.parser.Token$StartTag"));
        Token.TokenType type = Token.TokenType.Comment;
        startTag.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asComment(Token.java:355)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:17)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(startTag, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProcess_ThrowClassCastException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.EndTag endTag = ((Token.EndTag) createInstance("org.jsoup.parser.Token$EndTag"));
        Token.TokenType type = Token.TokenType.Character;
        endTag.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asCharacter(Token.java:363)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1465)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(endTag, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return state.process(token, this);
 *  */
    @Test
    public void testProcess_ThrowClassCastException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Doctype;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.ClassCastException: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @512255ff)]
            org.jsoup.parser.Token.asDoctype(Token.java:331)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:21)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(character, htmlTreeBuilderState);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1464)
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
    public void testProcess_ThrowNullPointerException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#process(org.jsoup.parser.Token,org.jsoup.parser.HtmlTreeBuilderState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_21() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Token.Character character = new Token.Character();
        Token.TokenType type = Token.TokenType.Character;
        character.type = type;
        HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Initial;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.process] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1473)
            org.jsoup.parser.HtmlTreeBuilderState.isWhitespace(HtmlTreeBuilderState.java:1466)
            org.jsoup.parser.HtmlTreeBuilderState.access$100(HtmlTreeBuilderState.java:11)
            org.jsoup.parser.HtmlTreeBuilderState$1.process(HtmlTreeBuilderState.java:14)
            org.jsoup.parser.HtmlTreeBuilder.process(HtmlTreeBuilder.java:138) */
        htmlTreeBuilder.process(character, htmlTreeBuilderState);
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
 * @utbot.executesCondition {@code (href.length() != 0): False}
 *  */
    @Test
    public void testMaybeSetBaseUri_HrefLengthEqualsZero() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        htmlTreeBuilder.maybeSetBaseUri(element);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.executesCondition {@code (baseUriSetFromDoc): False}
 * @utbot.executesCondition {@code (href.length() != 0): False}
 *  */
    @Test
    public void testMaybeSetBaseUri_HrefLengthEqualsZero_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        setField(element, "org.jsoup.nodes.Node", "attributes", attributes);
        
        htmlTreeBuilder.maybeSetBaseUri(element);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSetBaseUri(org.jsoup.nodes.Element)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#maybeSetBaseUri(org.jsoup.nodes.Element)}
 * @utbot.executesCondition {@code (baseUriSetFromDoc): False}
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
    
    ///region FUZZER: ERROR SUITE for method insertStartTag(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilder}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertStartTag(java.lang.String)}
     */
    @Test
    public void testInsertStartTagThrowsNPEWithNonEmptyString() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = new Element("XZ");
        htmlTreeBuilder.setHeadElement(element);
        List list = emptyList();
        htmlTreeBuilder.setPendingTableCharacters(list);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertStartTag] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.valueOf(Tag.java:54)
            org.jsoup.parser.HtmlTreeBuilder.insertStartTag(HtmlTreeBuilder.java:211) */
        htmlTreeBuilder.insertStartTag("abc");
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
    public void testPopStackToClose() throws Exception  {
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
    public void testPopStackToClose_ThrowNullPointerException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:337) */
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
    public void testPopStackToClose_ThrowNullPointerException_1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:340) */
        htmlTreeBuilder.popStackToClose(null);
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
    public void testPopStackToClose1() throws Exception  {
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
    public void testPopStackToClose_ThrowNullPointerException1() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:328) */
        htmlTreeBuilder.popStackToClose(null);
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#popStackToClose(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int pos = stack.size() - 1; pos >= 0; pos--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: next.nodeName().equals(elName)
 *  */
    @Test
    public void testPopStackToClose_ThrowNullPointerException_11() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.popStackToClose] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:331) */
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
            org.jsoup.parser.HtmlTreeBuilder.popStackToClose(HtmlTreeBuilder.java:331) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        stack.add(element);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertOnStackAfter(element, null);
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
            org.jsoup.parser.HtmlTreeBuilder.insertOnStackAfter(HtmlTreeBuilder.java:390) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        htmlTreeBuilder.insertOnStackAfter(element, null);
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        htmlTreeBuilder.insertOnStackAfter(element, null);
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
            org.jsoup.parser.HtmlTreeBuilder.insertForm(HtmlTreeBuilder.java:238) */
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
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:346) */
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
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:348) */
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
            org.jsoup.parser.HtmlTreeBuilder.popStackToBefore(HtmlTreeBuilder.java:348) */
        htmlTreeBuilder.popStackToBefore(null);
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
            org.jsoup.parser.HtmlTreeBuilder.removeFromStack(HtmlTreeBuilder.java:317) */
        htmlTreeBuilder.removeFromStack(null);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        objectArray[1] = ((Object) formElement);
        stack.add(objectArray);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.replaceOnStack(formElement, null);
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
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:400)
            org.jsoup.parser.HtmlTreeBuilder.replaceOnStack(HtmlTreeBuilder.java:396) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        htmlTreeBuilder.replaceOnStack(element, null);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        objectArray[1] = ((Object) formElement);
        arrayList.add(objectArray);
        arrayList.add(formElement);
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class formElementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, formElementType, formElementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = formElement;
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
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:400) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, elementType, elementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = element;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method replaceInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("replaceInQueue", arrayListType, elementType, elementType);
        replaceInQueueMethod.setAccessible(true);
        java.lang.Object[] replaceInQueueMethodArguments = new java.lang.Object[3];
        replaceInQueueMethodArguments[0] = arrayList;
        replaceInQueueMethodArguments[1] = element;
        replaceInQueueMethodArguments[2] = ((Object) null);
        try {
            replaceInQueueMethod.invoke(htmlTreeBuilder, replaceInQueueMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class htmlTreeBuilderClazz = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class arrayListType = Class.forName("java.util.ArrayList");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Method isElementInQueueMethod = htmlTreeBuilderClazz.getDeclaredMethod("isElementInQueue", arrayListType, elementType);
        isElementInQueueMethod.setAccessible(true);
        java.lang.Object[] isElementInQueueMethodArguments = new java.lang.Object[2];
        isElementInQueueMethodArguments[0] = arrayList;
        isElementInQueueMethodArguments[1] = element;
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
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:297) */
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
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.insertNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method insertNode(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertNode(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (stack.size() == 0): True}
 * @utbot.invokes {@link org.jsoup.nodes.Document#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: doc.appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowIndexOutOfBoundsException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Document doc = ((Document) createInstance("org.jsoup.nodes.Document"));
        htmlTreeBuilder.doc = doc;
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", stack);
        setField(element, "org.jsoup.nodes.Node", "parentNode", parentNode);
        setField(element, "org.jsoup.nodes.Node", "siblingIndex", -1);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:455)
            org.jsoup.nodes.Node.reparentChild(Node.java:489)
            org.jsoup.nodes.Element.appendChild(Element.java:354)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:266) */
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
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: stack.size() == 0
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
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
 * @utbot.executesCondition {@code (stack.size() == 0): True}
 * @utbot.invokes {@link org.jsoup.nodes.Document#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: doc.appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:266) */
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
 * @utbot.executesCondition {@code (stack.size() == 0): False}
 * @utbot.executesCondition {@code (isFosterInserts()): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: insertInFosterParent(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_2() throws Throwable  {
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
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:309)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:698)
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:268) */
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
 * @utbot.executesCondition {@code (stack.size() == 0): False}
 * @utbot.executesCondition {@code (isFosterInserts()): False}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#currentElement()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentElement().appendChild(node);
 *  */
    @Test
    public void testInsertNode_ThrowNullPointerException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        stack.add(null);
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertNode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.insertNode(HtmlTreeBuilder.java:270) */
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
 * @utbot.executesCondition {@code (stack.size() == 0): True}
 * @utbot.invokes {@link org.jsoup.nodes.Document#appendChild(org.jsoup.nodes.Node)}
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
 * @utbot.executesCondition {@code (stack.size() == 0): False}
 * @utbot.executesCondition {@code (isFosterInserts()): False}
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
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:297)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:293)
            org.jsoup.parser.HtmlTreeBuilder.aboveOnStack(HtmlTreeBuilder.java:379) */
        htmlTreeBuilder.aboveOnStack(null);
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
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
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
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:307) */
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
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:309) */
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
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:309) */
        htmlTreeBuilder.getFromStack(null);
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
            org.jsoup.parser.HtmlTreeBuilder.isSpecial(HtmlTreeBuilder.java:574) */
        htmlTreeBuilder.isSpecial(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inListItemScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inListItemScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inListItemScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return inScope(targetName, TagSearchList);
 *  */
    @Test
    public void testInListItemScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
            java.lang.String[] specificScopeTarget = {};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inListItemScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inListItemScope(HtmlTreeBuilder.java:492) */
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inListItemScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inScope(targetName, TagSearchList);
 *  */
    @Test
    public void testInListItemScope_ThrowNullPointerException_1() throws Exception  {
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inListItemScope(HtmlTreeBuilder.java:492) */
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inListItemScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inScope(targetName, TagSearchList);
 *  */
    @Test
    public void testInListItemScope_ThrowNullPointerException() throws Exception  {
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
            java.lang.String[] specificScopeTarget = {null};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inListItemScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inListItemScope(HtmlTreeBuilder.java:492) */
            htmlTreeBuilder.inListItemScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchList", prevTagSearchList);
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
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:407) */
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
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:413) */
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
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:413) */
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
        HtmlTreeBuilderState state = HtmlTreeBuilderState.Initial;
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
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.resetInsertionMode(HtmlTreeBuilder.java:413) */
        htmlTreeBuilder.resetInsertionMode();
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
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:504) */
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
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:506) */
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
            org.jsoup.parser.HtmlTreeBuilder.inSelectScope(HtmlTreeBuilder.java:507) */
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:500) */
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
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inTableScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:500) */
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
            java.lang.String[] specificScopeTarget = {null};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inTableScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459)
                org.jsoup.parser.HtmlTreeBuilder.inTableScope(HtmlTreeBuilder.java:500) */
            htmlTreeBuilder.inTableScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagSearchTableScope", prevTagSearchTableScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inButtonScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inButtonScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inButtonScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return inScope(targetName, TagSearchButton);
 *  */
    @Test
    public void testInButtonScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
            java.lang.String[] specificScopeTarget = {};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inButtonScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inButtonScope(HtmlTreeBuilder.java:496) */
            htmlTreeBuilder.inButtonScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchButton", prevTagSearchButton);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inButtonScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inScope(targetName, TagSearchButton);
 *  */
    @Test
    public void testInButtonScope_ThrowNullPointerException_1() throws Exception  {
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inButtonScope(HtmlTreeBuilder.java:496) */
            htmlTreeBuilder.inButtonScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchButton", prevTagSearchButton);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inButtonScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inScope(targetName, TagSearchButton);
 *  */
    @Test
    public void testInButtonScope_ThrowNullPointerException() throws Exception  {
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
            java.lang.String[] specificScopeTarget = {null};
            setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
            
            /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inButtonScope] produces [java.lang.NullPointerException]
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inButtonScope(HtmlTreeBuilder.java:496) */
            htmlTreeBuilder.inButtonScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
            setStaticField(HtmlTreeBuilder.class, "TagSearchButton", prevTagSearchButton);
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: specificScopeTarget[0] = targetName;
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
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
    public void testInSpecificScope_ThrowNullPointerException_1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459) */
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
    public void testInSpecificScope_ThrowNullPointerException_2() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:465)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459) */
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
 * @utbot.invokes org.jsoup.parser.HtmlTreeBuilder#inSpecificScope(java.lang.String[],java.lang.String[],java.lang.String[])
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInSpecificScope_ThrowIllegalArgumentException() throws Throwable  {
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
    public void testInSpecificScope_StringUtilIn_2() throws Exception  {
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
    public void testInSpecificScope_StringUtilIn_1() throws Exception  {
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
    public void testInSpecificScope_StringUtilIn() throws Exception  {
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
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int pos = stack.size() - 1; pos >= 0; pos--)
 *  */
    @Test
    public void testInSpecificScope_ThrowNullPointerException1() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463) */
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
    public void testInSpecificScope_ThrowNullPointerException_21() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        stack.add(document);
        htmlTreeBuilder.stack = stack;
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.in(StringUtil.java:150)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:468) */
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
    public void testInSpecificScope_ThrowNullPointerException_11() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        stack.add(null);
        htmlTreeBuilder.stack = stack;
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inSpecificScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:465) */
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
    public void testInSpecificScope_ThrowIllegalArgumentException1() throws Throwable  {
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        stack.add(formElement);
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:478) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.inScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inScope(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return inScope(targetName, null);
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:482) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return inScope(targetName, null);
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
                org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:458)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
                org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:482) */
            htmlTreeBuilder.inScope(null);
        } finally {
            setStaticField(HtmlTreeBuilder.class, "TagsSearchInScope", prevTagsSearchInScope);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method inScope(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilder}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#inScope(java.lang.String)}
     */
    @Test
    public void testInScopeThrowsNPEWithNonEmptyString() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = new Element("XZ");
        htmlTreeBuilder.setHeadElement(element);
        List list = emptyList();
        htmlTreeBuilder.setPendingTableCharacters(list);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.inScope] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:463)
            org.jsoup.parser.HtmlTreeBuilder.inSpecificScope(HtmlTreeBuilder.java:459)
            org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:486)
            org.jsoup.parser.HtmlTreeBuilder.inScope(HtmlTreeBuilder.java:482) */
        htmlTreeBuilder.inScope("abc");
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
            org.jsoup.parser.HtmlTreeBuilder.clearFormattingElementsToLastMarker(HtmlTreeBuilder.java:656) */
        htmlTreeBuilder.clearFormattingElementsToLastMarker();
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
            org.jsoup.parser.HtmlTreeBuilder.removeFromActiveFormattingElements(HtmlTreeBuilder.java:664) */
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
            org.jsoup.parser.HtmlTreeBuilder.insertMarkerToFormattingElements(HtmlTreeBuilder.java:693) */
        htmlTreeBuilder.insertMarkerToFormattingElements();
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
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:707) */
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method insertInFosterParent(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (lastTable != null): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#getFromStack(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: lastTable.parent() != null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInsertInFosterParent_ThrowIllegalArgumentException() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList stack = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(formElement, "org.jsoup.nodes.Element", "tag", tag);
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        setField(formElement, "org.jsoup.nodes.Node", "parentNode", parentNode);
        stack.add(formElement);
        htmlTreeBuilder.stack = stack;
        
        htmlTreeBuilder.insertInFosterParent(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method insertInFosterParent(org.jsoup.nodes.Node)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilder}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#insertInFosterParent(org.jsoup.nodes.Node)}
     */
    @Test
    public void testInsertInFosterParentThrowsNPE() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        List list = emptyList();
        htmlTreeBuilder.setPendingTableCharacters(list);
        Element element = new Element("abc");
        htmlTreeBuilder.setHeadElement(element);
        htmlTreeBuilder.setFormElement(null);
        TextNode textNode = new TextNode("XZ", "XZ");
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.getFromStack(HtmlTreeBuilder.java:307)
            org.jsoup.parser.HtmlTreeBuilder.insertInFosterParent(HtmlTreeBuilder.java:698) */
        htmlTreeBuilder.insertInFosterParent(textNode);
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:369)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:357) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:357) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableContext(HtmlTreeBuilder.java:357) */
        htmlTreeBuilder.clearStackToTableContext();
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
        
        Node actualParentNode = ((Node) getFieldValue(actual, "org.jsoup.nodes.Node", "parentNode"));
        assertNull(actualParentNode);
        
        List actualChildNodes = ((List) getFieldValue(actual, "org.jsoup.nodes.Node", "childNodes"));
        assertNull(actualChildNodes);
        
        Attributes actualAttributes = ((Attributes) getFieldValue(actual, "org.jsoup.nodes.Node", "attributes"));
        assertNull(actualAttributes);
        
        String actualBaseUri = ((String) getFieldValue(actual, "org.jsoup.nodes.Node", "baseUri"));
        assertNull(actualBaseUri);
        
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
            org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(HtmlTreeBuilder.java:678) */
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
            org.jsoup.parser.HtmlTreeBuilder.getActiveFormattingElement(HtmlTreeBuilder.java:682) */
        htmlTreeBuilder.getActiveFormattingElement(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reconstructFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.executesCondition {@code (last == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_LastEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.reconstructFormattingElements();
    }
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.executesCondition {@code (last == null): False}
 * @utbot.executesCondition {@code (onStack(last)): True}
 * @utbot.invokes {@link org.jsoup.parser.HtmlTreeBuilder#onStack(org.jsoup.nodes.Element)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_OnStack() throws Exception  {
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
 * @utbot.executesCondition {@code (last == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testReconstructFormattingElements_LastEqualsNull_1() throws Exception  {
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
 * @utbot.executesCondition {@code (last == null): False}
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
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:297)
            org.jsoup.parser.HtmlTreeBuilder.onStack(HtmlTreeBuilder.java:293)
            org.jsoup.parser.HtmlTreeBuilder.reconstructFormattingElements(HtmlTreeBuilder.java:619) */
        htmlTreeBuilder.reconstructFormattingElements();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reconstructFormattingElements()
    
    /**
    @utbot.classUnderTest {@link HtmlTreeBuilder}
 * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#reconstructFormattingElements()}
 * @utbot.executesCondition {@code (last == null): False}
 * @utbot.executesCondition {@code (onStack(last)): False}
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
    public void testClearStackToTableRowContext_3() throws Exception  {
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:369)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:365) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:365) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableRowContext(HtmlTreeBuilder.java:365) */
        htmlTreeBuilder.clearStackToTableRowContext();
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        formattingElements.add(formElement);
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
            org.jsoup.parser.HtmlTreeBuilder.isElementInQueue(HtmlTreeBuilder.java:297)
            org.jsoup.parser.HtmlTreeBuilder.isInActiveFormattingElements(HtmlTreeBuilder.java:674) */
        htmlTreeBuilder.isInActiveFormattingElements(null);
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
    public void testIsSameFormattingElement_ANodeNameEqualsAndAAttributesEquals() throws Exception  {
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
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611) */
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
 * @utbot.invokes {@link org.jsoup.nodes.Element#nodeName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return a.nodeName().equals(b.nodeName()) && a.attributes().equals(b.attributes());
 *  */
    @Test
    public void testIsSameFormattingElement_ThrowNullPointerException_3() throws Throwable  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611) */
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
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement] produces [java.lang.NullPointerException]
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611) */
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
    public void testPushActiveFormattingElements_ElNotEqualsNull() throws Exception  {
        HtmlTreeBuilder htmlTreeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        ArrayList formattingElements = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(document, "org.jsoup.nodes.Node", "attributes", attributes);
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
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:593) */
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
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:598) */
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
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:598) */
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
            org.jsoup.parser.HtmlTreeBuilder.isSameFormattingElement(HtmlTreeBuilder.java:611)
            org.jsoup.parser.HtmlTreeBuilder.pushActiveFormattingElements(HtmlTreeBuilder.java:598) */
        htmlTreeBuilder.pushActiveFormattingElements(element);
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
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        objectArray[1] = ((Object) formElement);
        formattingElements.add(objectArray);
        formattingElements.add(formElement);
        setField(htmlTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements", formattingElements);
        
        htmlTreeBuilder.replaceActiveFormattingElement(formElement, null);
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
            org.jsoup.parser.HtmlTreeBuilder.replaceInQueue(HtmlTreeBuilder.java:400)
            org.jsoup.parser.HtmlTreeBuilder.replaceActiveFormattingElement(HtmlTreeBuilder.java:689) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        htmlTreeBuilder.replaceActiveFormattingElement(element, null);
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:369)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:361) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:361) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371)
            org.jsoup.parser.HtmlTreeBuilder.clearStackToTableBodyContext(HtmlTreeBuilder.java:361) */
        htmlTreeBuilder.clearStackToTableBodyContext();
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
    public void testGenerateImpliedEndTags_ExcludeTagNotEqualsNullAndNotCurrentElementNodeNameEqualsAndStringUtilIn() throws Exception  {
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
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:562) */
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
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:562) */
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
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:562) */
        htmlTreeBuilder.generateImpliedEndTags(string);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method generateImpliedEndTags(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.HtmlTreeBuilder}
     * @utbot.methodUnderTest {@link org.jsoup.parser.HtmlTreeBuilder#generateImpliedEndTags(java.lang.String)}
     */
    @Test
    public void testGenerateImpliedEndTagsThrowsNPEWithNonEmptyString() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        Element element = new Element("XZ");
        htmlTreeBuilder.setHeadElement(element);
        List list = emptyList();
        htmlTreeBuilder.setPendingTableCharacters(list);
        
        /* This test fails because method [org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags] produces [java.lang.NullPointerException]
            org.jsoup.parser.TreeBuilder.currentElement(TreeBuilder.java:87)
            org.jsoup.parser.HtmlTreeBuilder.generateImpliedEndTags(HtmlTreeBuilder.java:562) */
        htmlTreeBuilder.generateImpliedEndTags("abc");
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
            org.jsoup.parser.HtmlTreeBuilder.lastFormattingElement(HtmlTreeBuilder.java:579) */
        htmlTreeBuilder.lastFormattingElement();
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:369) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371) */
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
            org.jsoup.parser.HtmlTreeBuilder.clearStackToContext(HtmlTreeBuilder.java:371) */
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
            org.jsoup.parser.HtmlTreeBuilder.removeLastFormattingElement(HtmlTreeBuilder.java:583) */
        htmlTreeBuilder.removeLastFormattingElement();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1004234175936800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1004234175936800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1004234175946200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004234175936800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004234175946200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1004234176572900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004234176572900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004234176575800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004234176572900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004234176575800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1004234177394700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004234177394700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004234177397300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004234177394700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004234177397300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1004234178735200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1004234178735200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1004234178737800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1004234178735200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1004234178737800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

