package org.jsoup.nodes;

import org.junit.Test;
import java.util.ArrayList;
import org.jsoup.parser.Tag;
import java.util.List;
import java.util.LinkedHashMap;
import org.jsoup.select.Elements;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.LinkedList;
import java.util.Stack;
import org.jsoup.select.Selector.SelectorParseException;
import org.jsoup.select.Selector;
import org.jsoup.nodes.Document.OutputSettings;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_nodes_ElementTest {
    ///region Test suites for executable org.jsoup.nodes.Element.appendChild
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#reparentChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.util.List#add(java.lang.Object)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link org.jsoup.nodes.Node#setSiblingIndex(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAppendChild_NodeSetSiblingIndex() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Node initialElement1ParentNode = element1.parentNode;
        
        Element actual = element.appendChild(element1);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalElement1ParentNode = element1.parentNode;
        int finalElement1SiblingIndex = element1.siblingIndex;
        
        assertFalse(initialElement1ParentNode == finalElement1ParentNode);
        
        assertEquals(3, finalElement1SiblingIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: reparentChild(child);
 *  */
    @Test
    public void testAppendChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element1.setParentNode(parentNode);
        element1.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:439)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Element.appendChild(Element.java:271) */
        element.appendChild(element1);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAppendChild_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:272) */
        element.appendChild(element1);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAppendChild_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element1.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:272) */
        element.appendChild(element1);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childNodes.add(child);
 *  */
    @Test
    public void testAppendChild_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendChild(Element.java:272) */
        element.appendChild(formElement);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendChild(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reparentChild(child);
 *  */
    @Test
    public void testAppendChild_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element1.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Element.appendChild(Element.java:271) */
        element.appendChild(element1);
    }
    ///endregion
    
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
            org.jsoup.nodes.Element.tagName(Element.java:65) */
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
    
    ///endregion
    
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
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parent] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139) */
        element.parent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(element);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        short[] shortArray = {};
        
        boolean actual = element.equals(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        boolean actual = element.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.append
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.append(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#append(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> nodes = Parser.parseFragment(html, this, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.append(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ReturnResult() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
        
        List finalElementChildNodes = element.childNodes;
        
        assertNull(finalElementChildNodes);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ReturnResult_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        int actual = element.hashCode();
        
        assertEquals(0, actual);
        
        List finalElementChildNodes = element.childNodes;
        
        assertNull(finalElementChildNodes);
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
            org.jsoup.nodes.Node.doClone(Node.java:661)
            org.jsoup.nodes.Node.clone(Node.java:625)
            org.jsoup.nodes.Element.clone(Element.java:1203) */
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
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.className();
        
        String expected = "";
        
        assertEquals(expected, actual);
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
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Element.wrap] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.wrap(Node.java:352)
            org.jsoup.nodes.Element.wrap(Element.java:453) */
        element.wrap(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName().equals("textarea")
 *  */
    @Test
    public void testVal_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.val(Element.java:1113) */
        element.val(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.executesCondition {@code (tagName().equals("textarea")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: text(value);
 *  */
    @Test
    public void testVal_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:99)
            org.jsoup.nodes.Element.attr(Element.java:116)
            org.jsoup.nodes.Element.val(Element.java:1116) */
        element.val(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method val(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val(java.lang.String)}
 * @utbot.executesCondition {@code (tagName().equals("textarea")): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: attr("value", value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVal_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        element.val(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.val
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method val()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#val()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tagName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tagName().equals("textarea")
 *  */
    @Test
    public void testVal_ThrowNullPointerException1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.val] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.val(Element.java:1101) */
        element.val();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testData_ReturnSbToString() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.iterates iterate the loop {@code for(Node childNode: childNodes)} once
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testData_NotChildNodeNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.data();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#data()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node childNode: childNodes)
 *  */
    @Test
    public void testData_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.data] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.data(Element.java:974) */
        element.data();
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Element actual = element.empty();
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
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
            org.jsoup.nodes.Element.empty(Element.java:441) */
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
 * @utbot.returnsFrom {@code return attributes.get("id");}
 *  */
    @Test
    public void testId_ReturnAttributesGet() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.returnsFrom {@code return attributes.get("id");}
 *  */
    @Test
    public void testId_ReturnAttributesGet_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        String actual = element.id();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method id()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#id()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes.get("id");
 *  */
    @Test
    public void testId_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.id] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.id(Element.java:106) */
        element.id();
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
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
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
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
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
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.parents] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.accumulateParents(Element.java:153)
            org.jsoup.nodes.Element.parents(Element.java:148) */
        element.parents();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.attr
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method attr(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        element.attr(((String) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "";
        
        element.attr(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#attr(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: super.attr(attributeKey, attributeValue);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAttr_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = " ";
        
        element.attr(string, ((String) null));
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
    public void testBefore_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.before(((Node) null));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(node);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.before(((Node) element1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method before(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode1);
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:439)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Node.before(Node.java:306)
            org.jsoup.nodes.Element.before(Element.java:410) */
        element.before(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Element) super.before(node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -1;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode1);
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 0]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:458)
            org.jsoup.nodes.Node.before(Node.java:306)
            org.jsoup.nodes.Element.before(Element.java:410) */
        element.before(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Element) super.before(node);
 *  */
    @Test
    public void testBefore_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -1;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.IndexOutOfBoundsException: Index: -1, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:458)
            org.jsoup.nodes.Node.before(Node.java:306)
            org.jsoup.nodes.Element.before(Element.java:410) */
        element.before(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testBefore_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Node.before(Node.java:306)
            org.jsoup.nodes.Element.before(Element.java:410) */
        element.before(((Node) document));
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
    public void testBefore_ThrowIllegalArgumentException1() throws Exception  {
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
    public void testBefore_ThrowIllegalArgumentException_11() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.siblingIndex = -255;
        String string = "";
        
        element.before(string);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#before(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.before(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBefore_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        element.siblingIndex = -252;
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
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.before] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:339)
            org.jsoup.nodes.Node.before(Node.java:292)
            org.jsoup.nodes.Element.before(Element.java:399) */
        element.before(string);
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
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.after(((Node) element1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method after(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Element) super.after(node);
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = 2;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode1);
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index: 3, Size: 0]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:458)
            org.jsoup.nodes.Node.after(Node.java:331)
            org.jsoup.nodes.Element.after(Element.java:433) */
        element.after(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        document.setParentNode(parentNode1);
        document.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:439)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Node.after(Node.java:331)
            org.jsoup.nodes.Element.after(Element.java:433) */
        element.after(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return (Element) super.after(node);
 *  */
    @Test
    public void testAfter_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = 3;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.IndexOutOfBoundsException: Index: 4, Size: 3]
            java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
            java.base/java.util.ArrayList.add(ArrayList.java:481)
            org.jsoup.nodes.Node.addChildren(Node.java:458)
            org.jsoup.nodes.Node.after(Node.java:331)
            org.jsoup.nodes.Element.after(Element.java:433) */
        element.after(((Node) document));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAfter_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Node.after(Node.java:331)
            org.jsoup.nodes.Element.after(Element.java:433) */
        element.after(((Node) document));
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#after(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return (Element) super.after(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAfter_ThrowIllegalArgumentException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        element.setParentNode(parentNode);
        element.siblingIndex = -252;
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
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        element.siblingIndex = -255;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Element.after] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.parent(Element.java:21)
            org.jsoup.nodes.Node.addSiblingHtml(Node.java:339)
            org.jsoup.nodes.Node.after(Node.java:317)
            org.jsoup.nodes.Element.after(Element.java:422) */
        element.after(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prepend
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prepend(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prepend(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(html);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prepend(null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prepend(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 * @utbot.invokes {@link org.jsoup.parser.Parser#parseFragment(java.lang.String,org.jsoup.nodes.Element,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Node> nodes = Parser.parseFragment(html, this, baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrepend_ThrowIllegalArgumentException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.prepend(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#empty()}
 *  */
    @Test
    public void testText_ElementEmpty() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        String string = "";
        
        Element actual = element.text(string);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.text
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method text()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#text()}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return accum.toString().trim();}
 *  */
    @Test
    public void testText_StringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.text();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.child
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method child(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return children().get(index);
 *  */
    @Test
    public void testChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index -255 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:172) */
        element.child(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#child(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return children().get(index);
 *  */
    @Test
    public void testChild_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.child] produces [java.lang.IndexOutOfBoundsException: Index -255 out of bounds for length 1]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:172) */
        element.child(-255);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method classNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#classNames(java.util.Set)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#join(java.util.Collection,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: attributes.put("class", StringUtil.join(classNames, " "));
 *  */
    @Test
    public void testClassNames_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [org.jsoup.nodes.Element.classNames] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.classNames(Element.java:1017) */
        element.classNames(linkedHashSet);
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method children()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_Return() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_NodeInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        elementData[0] = ((Object) formElement);
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        setField(expected, "java.util.ArrayList", "size", 1);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.returnsFrom {@code return new Elements(elements);}
 *  */
    @Test
    public void testChildren_NotNodeNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 *  */
    @Test
    public void testChildren_IterateForEachLoop() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.children();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        elementData[0] = ((Object) document);
        setField(expected, "java.util.ArrayList", "elementData", elementData);
        setField(expected, "java.util.ArrayList", "size", 1);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method children()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#children()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> elements = new ArrayList<Element>(childNodes.size());
 *  */
    @Test
    public void testChildren_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.children] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:186) */
        element.children();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 *  */
    @Test
    public void testAppendText_ElementBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        
        Element actual = element.appendText(null);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method appendElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendElement(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAppendElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.appendElement(null);
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
            org.jsoup.nodes.Element.nodeName(Element.java:56) */
        element.nodeName();
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByAttributeValueMatching
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueMatching(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueMatching1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0000\uE000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$AttributeWithValueMatching.<init>(Evaluator.java:255)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:718)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:735) */
        element.getElementsByAttributeValueMatching(((String) null), string);
    }
    ///endregion
    
    ///region Errors report for getElementsByAttributeValueMatching
    
    public void testGetElementsByAttributeValueMatching_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
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
        String string = "\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueMatching] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:116)
            org.jsoup.select.Evaluator$AttributeWithValueMatching.matches(Evaluator.java:261)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueMatching(Element.java:718) */
        element.getElementsByAttributeValueMatching(string, ((Pattern) null));
    }
    ///endregion
    
    ///region Errors report for getElementsByAttributeValueMatching
    
    public void testGetElementsByAttributeValueMatching_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
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
        String string = "[!";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:116)
            org.jsoup.select.Evaluator$Attribute.matches(Evaluator.java:110)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttribute(Element.java:640) */
        element.getElementsByAttribute(string);
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
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:116)
            org.jsoup.select.Evaluator$AttributeWithValue.matches(Evaluator.java:157)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValue(Element.java:664) */
        element.getElementsByAttributeValue(string, string);
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
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueEnding] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.hasAttr(Node.java:116)
            org.jsoup.select.Evaluator$AttributeWithValueEnding.matches(Evaluator.java:217)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueEnding(Element.java:697) */
        element.getElementsByAttributeValueEnding(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexLessThan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getElementsByIndexLessThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexLessThan(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexLessThan_ReturnCollectorCollect() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexLessThan(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexLessThan_ReturnCollectorCollect_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexLessThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetElementsByIndexLessThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:555)
            org.jsoup.select.Evaluator$IndexLessThan.matches(Evaluator.java:316)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:744) */
        element.getElementsByIndexLessThan(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexLessThan(int)
    
    @Test
    public void testGetElementsByIndexLessThan1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$IndexLessThan.matches(Evaluator.java:316)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:744) */
        element.getElementsByIndexLessThan(0);
    }
    
    @Test
    public void testGetElementsByIndexLessThan2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexLessThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexLessThan(Element.java:744) */
        element.getElementsByIndexLessThan(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.firstElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 *  */
    @Test
    public void testFirstElementSibling_ElementChildren() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method firstElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testFirstElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.firstElementSibling(Element.java:545) */
        element.firstElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#firstElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testFirstElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.firstElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.firstElementSibling(Element.java:545) */
        element.firstElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method firstElementSibling()
    
    @Test
    public void testFirstElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testFirstElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.firstElementSibling();
        
        assertNull(actual);
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
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeStarting(java.lang.String)
    
    @Test
    public void testGetElementsByAttributeStarting1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeStarting] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$AttributeStarting.matches(Evaluator.java:132)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeStarting(Element.java:653) */
        element.getElementsByAttributeStarting(string);
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
    
    ///region OTHER: ERROR SUITE for method getElementsByAttributeValueNot(java.lang.String, java.lang.String)
    
    @Test
    public void testGetElementsByAttributeValueNot1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByAttributeValueNot] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:77)
            org.jsoup.select.Evaluator$AttributeWithValueNot.matches(Evaluator.java:177)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByAttributeValueNot(Element.java:675) */
        element.getElementsByAttributeValueNot(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexGreaterThan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getElementsByIndexGreaterThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexGreaterThan(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ReturnCollectorCollect() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexGreaterThan(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ReturnCollectorCollect_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexGreaterThan(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collector.collect(new Evaluator.IndexGreaterThan(index), this);
 *  */
    @Test
    public void testGetElementsByIndexGreaterThan_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:555)
            org.jsoup.select.Evaluator$IndexGreaterThan.matches(Evaluator.java:336)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:753) */
        element.getElementsByIndexGreaterThan(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexGreaterThan(int)
    
    @Test
    public void testGetElementsByIndexGreaterThan1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexGreaterThan] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexGreaterThan(Element.java:753) */
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
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testPreviousElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.previousElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.previousElementSibling(Element.java:530) */
        element.previousElementSibling();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#previousElementSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Element> siblings = parent().children();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method previousElementSibling()
    
    @Test
    public void testPreviousElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.previousElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method previousElementSibling()
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPreviousElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        childNodes.add(parentNode);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.previousElementSibling();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.elementSiblingIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.executesCondition {@code (parent() == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testElementSiblingIndex_ParentEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Integer actual = element.elementSiblingIndex();
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.executesCondition {@code (parent() == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 *  */
    @Test
    public void testElementSiblingIndex_ParentNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method elementSiblingIndex()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#elementSiblingIndex()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: parent() == null
 *  */
    @Test
    public void testElementSiblingIndex_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.elementSiblingIndex] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:555) */
        element.elementSiblingIndex();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method elementSiblingIndex()
    
    @Test
    public void testElementSiblingIndex1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Integer actual = element.elementSiblingIndex();
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingText(java.util.regex.Pattern)
    
    @Test
    public void testGetElementsMatchingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794) */
        element.getElementsMatchingText(((Pattern) null));
    }
    
    @Test
    public void testGetElementsMatchingText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        ArrayList childNodes1 = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794) */
        element.getElementsMatchingText(((Pattern) null));
    }
    
    @Test
    public void testGetElementsMatchingText3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Element.text(Element.java:875)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794) */
        element.getElementsMatchingText(((Pattern) null));
    }
    
    @Test
    public void testGetElementsMatchingText4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Element.text(Element.java:875)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794) */
        element.getElementsMatchingText(((Pattern) null));
    }
    
    @Test
    public void testGetElementsMatchingText5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:128)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:913)
            org.jsoup.nodes.Element.access$000(Element.java:21)
            org.jsoup.nodes.Element$1.head(Element.java:863)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Element.text(Element.java:875)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794) */
        element.getElementsMatchingText(((Pattern) null));
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingText
    
    public void testGetElementsMatchingText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingText(java.lang.String)
    
    @Test
    public void testGetElementsMatchingText6() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uDC00";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Element.text(Element.java:875)
            org.jsoup.select.Evaluator$Matches.matches(Evaluator.java:675)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:794)
            org.jsoup.nodes.Element.getElementsMatchingText(Element.java:810) */
        element.getElementsMatchingText(string);
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingText
    
    public void testGetElementsMatchingText_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingText(java.lang.String)
    
    @Test
    public void testGetElementsContainingText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "K[";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Element.text(Element.java:875)
            org.jsoup.select.Evaluator$ContainsText.matches(Evaluator.java:633)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsContainingText(Element.java:773) */
        element.getElementsContainingText(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsByIndexEquals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getElementsByIndexEquals(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexEquals(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexEquals_ReturnCollectorCollect() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(-255);
        
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
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.returnsFrom {@code return Collector.collect(new Evaluator.IndexEquals(index), this);}
 *  */
    @Test
    public void testGetElementsByIndexEquals_ReturnCollectorCollect_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Elements actual = element.getElementsByIndexEquals(-255);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getElementsByIndexEquals(int)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#getElementsByIndexEquals(int)}
 * @utbot.invokes {@link org.jsoup.select.Collector#collect(org.jsoup.select.Evaluator,org.jsoup.nodes.Element)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return Collector.collect(new Evaluator.IndexEquals(index), this);
 *  */
    @Test
    public void testGetElementsByIndexEquals_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.elementSiblingIndex(Element.java:555)
            org.jsoup.select.Evaluator$IndexEquals.matches(Evaluator.java:356)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:762) */
        element.getElementsByIndexEquals(-255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getElementsByIndexEquals(int)
    
    @Test
    public void testGetElementsByIndexEquals1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByIndexEquals] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByIndexEquals(Element.java:762) */
        element.getElementsByIndexEquals(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsContainingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsContainingOwnText(java.lang.String)
    
    @Test
    public void testGetElementsContainingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "K\u0000\u1000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsContainingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:897)
            org.jsoup.nodes.Element.ownText(Element.java:892)
            org.jsoup.select.Evaluator$ContainsOwnText.matches(Evaluator.java:654)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsContainingOwnText(Element.java:784) */
        element.getElementsContainingOwnText(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingOwnText(java.lang.String)
    
    @Test
    public void testGetElementsMatchingOwnText1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\uD800";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:897)
            org.jsoup.nodes.Element.ownText(Element.java:892)
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:697)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:820)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:836) */
        element.getElementsMatchingOwnText(string);
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingOwnText
    
    public void testGetElementsMatchingOwnText_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.getElementsMatchingOwnText
    
    ///region OTHER: ERROR SUITE for method getElementsMatchingOwnText(java.util.regex.Pattern)
    
    @Test
    public void testGetElementsMatchingOwnText2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsMatchingOwnText] produces [java.lang.NullPointerException]
            org.jsoup.select.Evaluator$MatchesOwn.matches(Evaluator.java:697)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsMatchingOwnText(Element.java:820) */
        element.getElementsMatchingOwnText(((Pattern) null));
    }
    ///endregion
    
    ///region Errors report for getElementsMatchingOwnText
    
    public void testGetElementsMatchingOwnText_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.appendNormalisedText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.invokes {@link org.jsoup.nodes.TextNode#getWholeText()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.nodes.TextNode#lastCharIsWhitespace(java.lang.StringBuilder)}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#appendNormalisedWhitespace(java.lang.StringBuilder,java.lang.String,boolean)}
 *  */
    @Test
    public void testAppendNormalisedText_StringUtilAppendNormalisedWhitespace() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "";
        textNode.text = text;
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        textNode.setParentNode(parentNode);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: preserveWhitespace(textNode.parentNode)
 *  */
    @Test
    public void testAppendNormalisedText_ThrowClassCastException() throws Throwable  {
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "";
        textNode.text = text;
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode1 = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        parentNode.setParentNode(parentNode1);
        textNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:926)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:910) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = textNode.getWholeText();
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:908) */
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(text);
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException_2() throws Throwable  {
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:911) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#appendNormalisedText(java.lang.StringBuilder,org.jsoup.nodes.TextNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(text);
 *  */
    @Test
    public void testAppendNormalisedText_ThrowNullPointerException_1() throws Throwable  {
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:911) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    @Test
    public void testAppendNormalisedText1() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText2() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText3() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText4() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "\u0000";
        textNode.text = text;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText5() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText6() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        textNode.attributes = attributes;
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    
    @Test
    public void testAppendNormalisedText7() throws Exception  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        String text = "";
        textNode.text = text;
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        textNode.setParentNode(parentNode);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendNormalisedText(java.lang.StringBuilder, org.jsoup.nodes.TextNode)
    
    @Test
    public void testAppendNormalisedText8() throws Throwable  {
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        textNode.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.TextNode.lastCharIsWhitespace(TextNode.java:129)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:913) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = ((Object) null);
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText9() throws Throwable  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        textNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:128)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:913) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText10() throws Throwable  {
        StringBuilder stringBuilder = new StringBuilder("");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        parentNode.setParentNode(parentNode);
        textNode.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:128)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:913) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
        try {
            appendNormalisedTextMethod.invoke(null, appendNormalisedTextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAppendNormalisedText11() throws Throwable  {
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendNormalisedText] produces [java.lang.NullPointerException]
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(StringUtil.java:128)
            org.jsoup.nodes.Element.appendNormalisedText(Element.java:913) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class textNodeType = Class.forName("org.jsoup.nodes.TextNode");
        Method appendNormalisedTextMethod = elementClazz.getDeclaredMethod("appendNormalisedText", stringBuilderType, textNodeType);
        appendNormalisedTextMethod.setAccessible(true);
        java.lang.Object[] appendNormalisedTextMethodArguments = new java.lang.Object[2];
        appendNormalisedTextMethodArguments[0] = stringBuilder;
        appendNormalisedTextMethodArguments[1] = textNode;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = element;
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
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917) */
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.appendWhitespaceIfBr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = element;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        /* This test fails because method [org.jsoup.nodes.Element.appendWhitespaceIfBr] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method appendWhitespaceIfBrMethod = elementClazz.getDeclaredMethod("appendWhitespaceIfBr", elementClazz, stringBuilderType);
        appendWhitespaceIfBrMethod.setAccessible(true);
        java.lang.Object[] appendWhitespaceIfBrMethodArguments = new java.lang.Object[2];
        appendWhitespaceIfBrMethodArguments[0] = element;
        appendWhitespaceIfBrMethodArguments[1] = ((Object) null);
        try {
            appendWhitespaceIfBrMethod.invoke(null, appendWhitespaceIfBrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            org.jsoup.nodes.Element.isBlock(Element.java:97) */
        element.isBlock();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.dataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataset()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes.dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        Map actual = element.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.returnsFrom {@code return attributes.dataset();}
 *  */
    @Test
    public void testDataset_ReturnAttributesDataset_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        Map actual = element.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dataset()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#dataset()}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#dataset()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return attributes.dataset();
 *  */
    @Test
    public void testDataset_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.dataset] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.dataset(Element.java:134) */
        element.dataset();
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
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
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.accumulateParents(Element.java:153) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
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
            org.jsoup.nodes.Element.accumulateParents(Element.java:153) */
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
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:154) */
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
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (!parent.tagName().equals("#root")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAccumulateParents_ThrowNullPointerException_2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.accumulateParents] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.accumulateParents(Element.java:155) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class elementsType = Class.forName("org.jsoup.select.Elements");
        Method accumulateParentsMethod = elementClazz.getDeclaredMethod("accumulateParents", elementClazz, elementsType);
        accumulateParentsMethod.setAccessible(true);
        java.lang.Object[] accumulateParentsMethodArguments = new java.lang.Object[2];
        accumulateParentsMethodArguments[0] = element;
        accumulateParentsMethodArguments[1] = ((Object) null);
        try {
            accumulateParentsMethod.invoke(null, accumulateParentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.textNodes(Element.java:212) */
        element.textNodes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method textNodes()
    
    @Test
    public void testTextNodes1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = element.textNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
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
        
        element.insertChildren(-255, null);
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        LinkedList linkedList = new LinkedList();
        
        element.insertChildren(-131, linkedList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method insertChildren(int, java.util.Collection)
    
    @Test
    public void testInsertChildren1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Stack stack = new Stack();
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.addChildren(Node.java:460)
            org.jsoup.nodes.Element.insertChildren(Element.java:308) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class intType = int.class;
        Class stackType = Class.forName("java.util.Collection");
        Method insertChildrenMethod = elementClazz.getDeclaredMethod("insertChildren", intType, stackType);
        insertChildrenMethod.setAccessible(true);
        java.lang.Object[] insertChildrenMethodArguments = new java.lang.Object[2];
        insertChildrenMethodArguments[0] = -2;
        insertChildrenMethodArguments[1] = stack;
        try {
            insertChildrenMethod.invoke(element, insertChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInsertChildren2() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Stack stack = new Stack();
        
        /* This test fails because method [org.jsoup.nodes.Element.insertChildren] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.addChildren(Node.java:460)
            org.jsoup.nodes.Element.insertChildren(Element.java:308) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class intType = int.class;
        Class stackType = Class.forName("java.util.Collection");
        Method insertChildrenMethod = elementClazz.getDeclaredMethod("insertChildren", intType, stackType);
        insertChildrenMethod.setAccessible(true);
        java.lang.Object[] insertChildrenMethodArguments = new java.lang.Object[2];
        insertChildrenMethodArguments[0] = 2;
        insertChildrenMethodArguments[1] = stack;
        try {
            insertChildrenMethod.invoke(element, insertChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method prependText(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependText(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#baseUri()}
 *  */
    @Test
    public void testPrependText_ElementBaseUri() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String baseUri = "";
        element.baseUri = baseUri;
        
        Element actual = element.prependText(null);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
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
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 *  */
    @Test
    public void testSiblingElements_ParentNodeNotEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        elementData[0] = ((Object) document);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method siblingElements()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#siblingElements()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> elements = parent().children();
 *  */
    @Test
    public void testSiblingElements_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.siblingElements(Element.java:495) */
        element.siblingElements();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method siblingElements()
    
    @Test
    public void testSiblingElements1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Elements actual = element.siblingElements();
        
        Elements expected = ((Elements) createInstance("org.jsoup.select.Elements"));
        java.lang.Object[] elementData = new java.lang.Object[1];
        elementData[0] = ((Object) formElement);
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
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        childNodes.add(documentType);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.siblingElements] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.select.Elements.<init>(Elements.java:22)
            org.jsoup.nodes.Element.siblingElements(Element.java:496) */
        element.siblingElements();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.indexInList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIndexInList_ReturnNull() throws Exception  {
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList arrayList = new ArrayList();
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = formElement;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 *  */
    @Test
    public void testIndexInList_IntegerValueOf() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(elements);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexInList_ThrowIllegalArgumentException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class listType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, listType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = ((Object) null);
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(search);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexInList_ThrowIllegalArgumentException() throws Throwable  {
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#indexInList(org.jsoup.nodes.Element,java.util.List)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < elements.size(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: element.equals(search)
 *  */
    @Test
    public void testIndexInList_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    @Test
    public void testIndexInList1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document1, "org.jsoup.nodes.Element", "tag", tag);
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
        
        List finalDocumentChildNodes = document.childNodes;
        
        assertNull(finalDocumentChildNodes);
    }
    
    @Test
    public void testIndexInList2() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document1, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document1.attributes = attributes1;
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        Integer actual = ((Integer) indexInListMethod.invoke(null, indexInListMethodArguments));
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
        
        List finalDocumentChildNodes = document.childNodes;
        
        assertNull(finalDocumentChildNodes);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method indexInList(org.jsoup.nodes.Element, java.util.List)
    
    @Test
    public void testIndexInList3() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIndexInList4() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        ArrayList arrayList = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes1 = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes1);
        arrayList.add(document);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = element;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIndexInList5() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document1, "org.jsoup.nodes.Element", "tag", tag);
        document1.attributes = attributes;
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIndexInList6() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document.attributes = attributes;
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        setField(document1, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        document1.attributes = attributes1;
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.equals(Element.java:1191)
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIndexInList7() throws Throwable  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList arrayList = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(document1, "org.jsoup.nodes.Element", "tag", tag1);
        arrayList.add(document1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.jsoup.nodes.Element.indexInList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.indexInList(Element.java:574) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class arrayListType = Class.forName("java.util.List");
        Method indexInListMethod = elementClazz.getDeclaredMethod("indexInList", elementClazz, arrayListType);
        indexInListMethod.setAccessible(true);
        java.lang.Object[] indexInListMethodArguments = new java.lang.Object[2];
        indexInListMethodArguments[0] = document;
        indexInListMethodArguments[1] = arrayList;
        try {
            indexInListMethod.invoke(null, indexInListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.html(((String) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHtml1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        String string = "";
        
        element.html(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html()}
 * @utbot.invokes org.jsoup.nodes.Element#html(java.lang.StringBuilder)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: html(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1163)
            org.jsoup.nodes.Element.html(Element.java:1158) */
        element.html();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html()
    
    @Test(expected = ExceptionInInitializerError.class)
    public void testHtml2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode2 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        parentNode1.setParentNode(parentNode2);
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.html();
    }
    
    @Test
    public void testHtml3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        parentNode.setParentNode(parentNode1);
        element.setParentNode(parentNode);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1159) */
        element.html();
    }
    
    @Test
    public void testHtml4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:65)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1125)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:679)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Node.outerHtml(Node.java:559)
            org.jsoup.nodes.Element.html(Element.java:1164)
            org.jsoup.nodes.Element.html(Element.java:1158) */
        element.html();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testHtml_ListIterator() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethod.invoke(element, htmlMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: childNodes)
 *  */
    @Test
    public void testHtml_ThrowNullPointerException1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1163) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#html(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(Node node: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: node.outerHtml(accum);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() throws Throwable  {
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.html(Element.java:1164) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Method htmlMethod = elementClazz.getDeclaredMethod("html", stringBuilderType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[1];
        htmlMethodArguments[0] = ((Object) null);
        try {
            htmlMethod.invoke(element, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.StringBuilder)
    
    @Test(expected = NoClassDefFoundError.class)
    public void testHtml5() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode1 = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        parentNode.setParentNode(parentNode1);
        formElement.setParentNode(parentNode);
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
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
    public void testHtml6() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        dataNode.setParentNode(parentNode);
        childNodes.add(dataNode);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DataNode.getWholeData(DataNode.java:29)
            org.jsoup.nodes.DataNode.outerHtmlHead(DataNode.java:43)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:679)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Node.outerHtml(Node.java:559)
            org.jsoup.nodes.Element.html(Element.java:1164) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
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
    public void testHtml7() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [org.jsoup.nodes.Element.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:65)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1125)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:679)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Node.outerHtml(Node.java:559)
            org.jsoup.nodes.Element.html(Element.java:1164) */
        Class elementClazz = Class.forName("org.jsoup.nodes.Element");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.lastElementSibling
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 *  */
    @Test
    public void testLastElementSibling_ElementChildren() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lastElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testLastElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.lastElementSibling(Element.java:564) */
        element.lastElementSibling();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#lastElementSibling()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testLastElementSibling_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.lastElementSibling] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.lastElementSibling(Element.java:564) */
        element.lastElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lastElementSibling()
    
    @Test
    public void testLastElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        childNodes.add(comment);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    
    @Test
    public void testLastElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.lastElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.cssSelector
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cssSelector()
    
    @Test
    public void testCssSelector1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        String actual = element.cssSelector();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method cssSelector()
    
    @Test
    public void testCssSelector2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.Element.cssSelector] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:65)
            org.jsoup.nodes.Element.cssSelector(Element.java:470) */
        element.cssSelector();
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
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: List<Element> siblings = parent().children();
 *  */
    @Test
    public void testNextElementSibling_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        element.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.nextElementSibling] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.nextElementSibling(Element.java:514) */
        element.nextElementSibling();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextElementSibling()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#nextElementSibling()}
 * @utbot.executesCondition {@code (parentNode == null): False}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#children()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: List<Element> siblings = parent().children();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        FormElement parentNode = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextElementSibling()
    
    @Test
    public void testNextElementSibling1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(element);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        Element actual = element.nextElementSibling();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextElementSibling()
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        childNodes.add(xmlDeclaration);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNextElementSibling4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        
        element.nextElementSibling();
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getElementsByClass(java.lang.String)
    
    @Test
    public void testGetElementsByClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element.setParentNode(parentNode);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Elements actual = element.getElementsByClass(string);
        
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
    public void testGetElementsByClass2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "\u0000";
        
        Elements actual = element.getElementsByClass(string);
        
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
    public void testGetElementsByClass3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        String string = "\u0000";
        
        Elements actual = element.getElementsByClass(string);
        
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
    
    ///region OTHER: ERROR SUITE for method getElementsByClass(java.lang.String)
    
    @Test
    public void testGetElementsByClass4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:241)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByClass(Element.java:627) */
        element.getElementsByClass(string);
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.dataNodes(Element.java:230) */
        element.dataNodes();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dataNodes()
    
    @Test
    public void testDataNodes1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        childNodes.add(formElement);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        List actual = element.dataNodes();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dataNodes()
    
    @Test
    public void testDataNodes2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        childNodes.add(object);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.dataNodes] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.dataNodes(Element.java:230) */
        element.dataNodes();
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
        String string = "\"[";
        
        /* This test fails because method [org.jsoup.nodes.Element.getElementsByTag] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:65)
            org.jsoup.select.Evaluator$Tag.matches(Evaluator.java:45)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.nodes.Element.getElementsByTag(Element.java:591) */
        element.getElementsByTag(string);
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prependChild(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependChild(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.nodes.Element#addChildren(int,org.jsoup.nodes.Node[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: addChildren(0, child);
 *  */
    @Test
    public void testPrependChild_ThrowIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element element1 = ((Element) createInstance("org.jsoup.nodes.Element"));
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        childNodes.add(null);
        childNodes.add(null);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        element1.setParentNode(parentNode);
        element1.siblingIndex = -1;
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.remove(ArrayList.java:504)
            org.jsoup.nodes.Node.removeChild(Node.java:439)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Element.prependChild(Element.java:286) */
        element.prependChild(element1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method prependChild(org.jsoup.nodes.Node)
    
    @Test
    public void testPrependChild1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        FormElement formElement = ((FormElement) createInstance("org.jsoup.nodes.FormElement"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        formElement.setParentNode(parentNode);
        
        Node initialFormElementParentNode = formElement.parentNode;
        
        Element actual = element.prependChild(formElement);
        
        // org.jsoup.nodes.Element has overridden equals method
        assertEquals(element, actual);
        
        Node finalFormElementParentNode = formElement.parentNode;
        
        assertFalse(initialFormElementParentNode == finalFormElementParentNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prependChild(org.jsoup.nodes.Node)
    
    @Test
    public void testPrependChild2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        ArrayList childNodes = new ArrayList();
        Object object = createInstance("java.lang.Object");
        childNodes.add(object);
        DataNode dataNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        childNodes.add(dataNode);
        childNodes.add(null);
        setField(parentNode, "org.jsoup.nodes.Node", "childNodes", childNodes);
        comment.setParentNode(parentNode);
        comment.siblingIndex = 1;
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.removeChild(Node.java:440)
            org.jsoup.nodes.Node.reparentChild(Node.java:465)
            org.jsoup.nodes.Node.addChildren(Node.java:457)
            org.jsoup.nodes.Element.prependChild(Element.java:286) */
        element.prependChild(comment);
    }
    
    @Test
    public void testPrependChild3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document);
        childNodes.add(null);
        childNodes.add(null);
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        /* This test fails because method [org.jsoup.nodes.Element.prependChild] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.reindexChildren(Node.java:471)
            org.jsoup.nodes.Node.addChildren(Node.java:460)
            org.jsoup.nodes.Element.prependChild(Element.java:286) */
        element.prependChild(documentType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.prependElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#prependElement(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Element child = new Element(Tag.valueOf(tagName), baseUri());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        element.prependElement(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prependElement(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrependElement1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "";
        
        element.prependElement(string);
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
        String string = "\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!";
        
        element.select(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method select(java.lang.String)
    
    @Test
    public void testSelect2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        String string = "\u0001A\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001";
        
        /* This test fails because method [org.jsoup.nodes.Element.select] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:65)
            org.jsoup.select.Evaluator$Tag.matches(Evaluator.java:45)
            org.jsoup.select.Collector$Accumulator.head(Collector.java:42)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.select.Collector.collect(Collector.java:24)
            org.jsoup.select.Selector.select(Selector.java:139)
            org.jsoup.select.Selector.select(Selector.java:105)
            org.jsoup.nodes.Element.select(Element.java:258) */
        element.select(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.executesCondition {@code (classAttr.equals("")): False}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testHasClass_NotClassAttrEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        element.attributes = attributes;
        
        boolean actual = element.hasClass(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasClass(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#hasClass(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String classAttr = attributes.get("class");
 *  */
    @Test
    public void testHasClass_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.hasClass] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.hasClass(Element.java:1035) */
        element.hasClass(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.String)
    
    @Test
    public void testHasClass1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(null, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        element.attributes = attributes;
        String string = "";
        
        boolean actual = element.hasClass(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.preserveWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveWhitespace(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): True}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPreserveWhitespace_NotNodeNotInstanceOfElement() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jsoup.nodes.Comment"));
        
        boolean actual = Element.preserveWhitespace(comment);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPreserveWhitespace_NodeEqualsNull() {
        boolean actual = Element.preserveWhitespace(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): True}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return element.tag.preserveWhitespace() || element.parent() != null && element.parent().tag.preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_ElementTagPreserveWhitespaceOrElementParentNotEqualsNullAndElementParentTagPreserveWhitespace() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = Element.preserveWhitespace(element);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): True}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): False}
 * @utbot.returnsFrom {@code return element.tag.preserveWhitespace() || element.parent() != null && element.parent().tag.preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_ElementParentEqualsNullAndElementParentTagPreserveWhitespace() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        
        boolean actual = Element.preserveWhitespace(element);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): True}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): True}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): False}
 * @utbot.returnsFrom {@code return element.tag.preserveWhitespace() || element.parent() != null && element.parent().tag.preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_ElementParentEqualsNullAndElementParentTagPreserveWhitespace_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        document.setParentNode(parentNode);
        
        boolean actual = Element.preserveWhitespace(document);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (node != null): True}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): True}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): True}
 * @utbot.returnsFrom {@code return element.tag.preserveWhitespace() || element.parent() != null && element.parent().tag.preserveWhitespace();}
 *  */
    @Test
    public void testPreserveWhitespace_ElementParentNotEqualsNullAndElementParentTagPreserveWhitespace() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(parentNode, "org.jsoup.nodes.Element", "tag", tag1);
        document.setParentNode(parentNode);
        
        boolean actual = Element.preserveWhitespace(document);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preserveWhitespace(org.jsoup.nodes.Node)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: element.parent() != null && element.parent().tag.preserveWhitespace()
 *  */
    @Test
    public void testPreserveWhitespace_ThrowClassCastException() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        DocumentType parentNode = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:926) */
        Element.preserveWhitespace(document);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#preserveWhitespace()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return element.tag.preserveWhitespace() || element.parent() != null && element.parent().tag.preserveWhitespace();
 *  */
    @Test
    public void testPreserveWhitespace_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:925) */
        Element.preserveWhitespace(element);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#preserveWhitespace(org.jsoup.nodes.Node)}
 * @utbot.executesCondition {@code (element.parent() != null && element.parent().tag.preserveWhitespace()): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#preserveWhitespace()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.parent() != null && element.parent().tag.preserveWhitespace()
 *  */
    @Test
    public void testPreserveWhitespace_ThrowNullPointerException_1() throws Exception  {
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(document, "org.jsoup.nodes.Element", "tag", tag);
        Element parentNode = ((Element) createInstance("org.jsoup.nodes.Element"));
        document.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.Element.preserveWhitespace] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.preserveWhitespace(Element.java:926) */
        Element.preserveWhitespace(document);
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
            org.jsoup.nodes.Element.hasText(Element.java:951) */
        element.hasText();
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
    
    ///region Test suites for executable org.jsoup.nodes.Element.ownText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ownText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText()}
 * @utbot.invokes org.jsoup.nodes.Element#ownText(java.lang.StringBuilder)
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return sb.toString().trim();}
 *  */
    @Test
    public void testOwnText_StringTrim() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        String actual = element.ownText();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ownText()
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ownText(sb);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:897)
            org.jsoup.nodes.Element.ownText(Element.java:892) */
        element.ownText();
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#ownText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ownText(sb);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException_1() throws Exception  {
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917)
            org.jsoup.nodes.Element.ownText(Element.java:902)
            org.jsoup.nodes.Element.ownText(Element.java:892) */
        element.ownText();
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
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
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node child: childNodes)
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException1() throws Throwable  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.ownText(Element.java:897) */
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
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: appendWhitespaceIfBr((Element) child, accum);
 *  */
    @Test
    public void testOwnText_ThrowNullPointerException_11() throws Throwable  {
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917)
            org.jsoup.nodes.Element.ownText(Element.java:902) */
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
 * @utbot.iterates iterate the loop {@code for(Node child: childNodes)} once
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.ownText] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.appendWhitespaceIfBr(Element.java:917)
            org.jsoup.nodes.Element.ownText(Element.java:902) */
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
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (tag.formatAsBlock()): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowClassCastException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        TextNode parentNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.ClassCastException: class org.jsoup.nodes.TextNode cannot be cast to class org.jsoup.nodes.Element (org.jsoup.nodes.TextNode and org.jsoup.nodes.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            org.jsoup.nodes.Element.parent(Element.java:139)
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1121) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1121) */
        element.outerHtmlHead(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1121) */
        element.outerHtmlHead(stringBuilder, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_2() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1121) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (tag.formatAsBlock()): True}
 * @utbot.executesCondition {@code (parent() != null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Element#parent()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#tag()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: accum.length() > 0 && out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline())
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_3() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        element.setParentNode(parentNode);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlHead(Element.java:1121) */
        element.outerHtmlHead(stringBuilder, -255, outputSettings);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (accum.length() > 0): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (tag.formatAsBlock()): False}
 * @utbot.invokes {@link java.lang.StringBuilder#length()}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.invokes {@link org.jsoup.nodes.Element#indent(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: indent(accum, depth, out);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOuterHtmlHead_ThrowIllegalArgumentException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        StringBuilder stringBuilder = new StringBuilder(" ");
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", 1);
        
        element.outerHtmlHead(stringBuilder, -1, outputSettings);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Element.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        element.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1140) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.executesCondition {@code (if (!(childNodes.isEmpty() && tag.isSelfClosing())) {
 *     if (out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode)))))))
 *         indent(accum, depth, out);
 *     accum.append("</").append(tagName()).append(">");
 * }): True}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (!childNodes.isEmpty()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("</").append(tagName()).append(">");
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_5() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1145) */
        element.outerHtmlTail(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.executesCondition {@code (if (!(childNodes.isEmpty() && tag.isSelfClosing())) {
 *     if (out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode)))))))
 *         indent(accum, depth, out);
 *     accum.append("</").append(tagName()).append(">");
 * }): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint() && (!childNodes.isEmpty() && (tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode))))))
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_4() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(element, "org.jsoup.nodes.Element", "tag", tag);
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1141) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(childNodes.isEmpty() && tag.isSelfClosing())
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        ArrayList childNodes = new ArrayList();
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1140) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): False}
 * @utbot.executesCondition {@code (out.prettyPrint()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("</").append(tagName()).append(">");
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1145) */
        element.outerHtmlTail(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1141) */
        element.outerHtmlTail(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link Element}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Element#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (!(childNodes.isEmpty() && tag.isSelfClosing())): False}
 * @utbot.executesCondition {@code (out.prettyPrint()): True}
 * @utbot.executesCondition {@code (!childNodes.isEmpty()): True}
 * @utbot.invokes {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tag.formatAsBlock() || (out.outline() && (childNodes.size() > 1 || (childNodes.size() == 1 && !(childNodes.get(0) instanceof TextNode))))
 *  */
    @Test
    public void testOuterHtmlTail_ThrowNullPointerException_6() throws Exception  {
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
        setField(element, "org.jsoup.nodes.Node", "childNodes", childNodes);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        /* This test fails because method [org.jsoup.nodes.Element.outerHtmlTail] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.outerHtmlTail(Element.java:1142) */
        element.outerHtmlTail(null, -255, outputSettings);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields999475579752800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields999475579752800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass999475579758400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999475579752800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999475579758400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields999475580160700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields999475580160700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass999475580162200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields999475580160700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass999475580162200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

