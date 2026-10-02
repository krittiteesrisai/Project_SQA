package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import org.apache.commons.jxpath.ri.QName;
import org.jdom.ProcessingInstruction;
import org.jdom.Element;
import org.jdom.Namespace;
import org.apache.commons.jxpath.JXPathException;
import org.jdom.Comment;
import org.jdom.CDATA;
import org.jdom.Document;
import java.util.Locale;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.jdom.Content;
import org.jdom.Attribute;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.List;
import java.util.Set;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.jdom.Text;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.jdom.Parent;
import java.util.HashMap;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.BasicVariables;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_jxpath_ri_model_jdom_JDOMNodePointerTest {
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node instanceof Element): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getName()}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_NotNodeNotInstanceOfProcessingInstruction() throws Exception  {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        QName actual = jDOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getName()}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getTarget()}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_NodeInstanceOfProcessingInstruction() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        QName actual = jDOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getName()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node instanceof Element): True}
    /// invoke:
    ///     {@link org.jdom.Element#getNamespacePrefix()} once,
    ///     {@link org.jdom.Element#getName()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getName()}
 * @utbot.executesCondition {@code (ns != null): False}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_NsEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        QName actual = jDOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getName()}
 * @utbot.executesCondition {@code (ns != null): True}
 * @utbot.executesCondition {@code (ns.equals("")): True}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_NsEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        QName actual = jDOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getName()}
 * @utbot.executesCondition {@code (ns != null): True}
 * @utbot.executesCondition {@code (ns.equals("")): False}
 * @utbot.returnsFrom {@code return new QName(ns, ln);}
 *  */
    @Test
    public void testGetName_NotNsEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        QName actual = jDOMNodePointer.getName();
        
        QName expected = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(expected, "org.apache.commons.jxpath.ri.QName", "prefix", prefix);
        String qualifiedName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000:null";
        setField(expected, "org.apache.commons.jxpath.ri.QName", "qualifiedName", qualifiedName);
        
        // org.apache.commons.jxpath.ri.QName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_2() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_3() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} when: parent == null
 *  */
    @Test(expected = JXPathException.class)
    public void testRemove_ThrowJXPathException_4() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        jDOMNodePointer.remove();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = nodeParent(node);
 *  */
    @Test
    public void testRemove_ThrowClassCastException() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:535)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:613) */
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = nodeParent(node);
 *  */
    @Test
    public void testRemove_ThrowClassCastException_1() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = nodeParent(node);
 *  */
    @Test
    public void testRemove_ThrowClassCastException_2() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(comment, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:538)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:613) */
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getContent().remove(node);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:617) */
        jDOMNodePointer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getContent().remove(node);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(comment, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.remove(JDOMNodePointer.java:617) */
        jDOMNodePointer.remove();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof JDOMNodePointer)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjectInstanceOfJDOMNodePointer() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        boolean actual = jDOMNodePointer.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Object() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        boolean actual = jDOMNodePointer.equals(jDOMNodePointer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof JDOMNodePointer)): False}
 * @utbot.returnsFrom {@code return node == other.node;}
 *  */
    @Test
    public void testEquals_NodeNotEqualsOtherNode() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(null, null, null);
        
        boolean actual = jDOMNodePointer.equals(jDOMNodePointer1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (!(object instanceof JDOMNodePointer)): False}
 * @utbot.returnsFrom {@code return node == other.node;}
 *  */
    @Test
    public void testEquals_NodeEqualsOtherNode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(null, null, null);
        
        boolean actual = jDOMNodePointer.equals(jDOMNodePointer1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.returnsFrom {@code return node.hashCode();}
 *  */
    @Test
    public void testHashCode_ObjectHashCode() {
        Integer integer = 0;
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(integer, null, null);
        
        int actual = jDOMNodePointer.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return node.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.hashCode(JDOMNodePointer.java:796) */
        jDOMNodePointer.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLength()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLength()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetLength_Return1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        int actual = jDOMNodePointer.getLength();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (text != null): False}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextEqualsNull() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        Object actual = jDOMNodePointer.getValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
 * @utbot.executesCondition {@code (text != null): True}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.returnsFrom {@code return text;}
 *  */
    @Test
    public void testGetValue_TextNotEqualsNull() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        String text = "";
        setField(comment, "org.jdom.Comment", "text", text);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
        
        String actual = ((String) jDOMNodePointer.getValue());
        
        assertEquals(text, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getValue()}
     */
    @Test
    public void testGetValue() {
        Object object = new Object();
        Locale locale = new Locale("\n\t\r", "\n\t\r");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(524288);
        
        Object actual = jDOMNodePointer.getValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (value instanceof Element): False}
 * @utbot.executesCondition {@code (value instanceof Document): False}
 * @utbot.executesCondition {@code (value instanceof Text || value instanceof CDATA): True}
 * @utbot.executesCondition {@code (value instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (value instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (value instanceof Comment): True}
 * @utbot.invokes {@link org.jdom.Element#getContent()}
 * @utbot.invokes {@link java.util.List#clear()}
 * @utbot.invokes {@link org.jdom.Comment#clone()}
 *  */
    @Test
    public void testSetValue_ValueInstanceOfComment() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNodeNodeContent = getFieldValue(jDOMNodePointerNode, "org.jdom.Element", "content");
        org.jdom.Content[] initialJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeContent, "org.jdom.ContentList", "elementData"));
        
        jDOMNodePointer.setValue(comment);
        
        Object jDOMNodePointerNode1 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode1NodeContent = getFieldValue(jDOMNodePointerNode1, "org.jdom.Element", "content");
        org.jdom.Content[] finalJDOMNodePointerNodeContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNode1NodeContent, "org.jdom.ContentList", "elementData"));
        Object jDOMNodePointerNode2 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode2NodeContent = getFieldValue(jDOMNodePointerNode2, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentSize = ((Integer) getFieldValue(jDOMNodePointerNode2NodeContent, "org.jdom.ContentList", "size"));
        Object jDOMNodePointerNode3 = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Object jDOMNodePointerNode3NodeContent = getFieldValue(jDOMNodePointerNode3, "org.jdom.Element", "content");
        int finalJDOMNodePointerNodeContentModCount = ((Integer) getFieldValue(jDOMNodePointerNode3NodeContent, "java.util.AbstractList", "modCount"));
        
        assertFalse(initialJDOMNodePointerNodeContentElementData == finalJDOMNodePointerNodeContentElementData);
        
        assertEquals(1, finalJDOMNodePointerNodeContentSize);
        
        assertEquals(2, finalJDOMNodePointerNodeContentModCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element element = (Element) node;
 *  */
    @Test
    public void testSetValue_ThrowClassCastException() {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:299) */
        jDOMNodePointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: element.getContent().clear();
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.clear(ContentList.java:312)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:300) */
        jDOMNodePointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.executesCondition {@code (value instanceof Element): False}
 * @utbot.executesCondition {@code (value instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addContent(valueDocument.getContent());
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null, null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content1 = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData1 = {};
        setField(content1, "org.jdom.ContentList", "elementData", elementData1);
        setField(content1, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content1);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.hasRootElement(Document.java:205)
            org.jdom.Document.getContent(Document.java:407)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:308) */
        jDOMNodePointer.setValue(document);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.invokes {@link org.jdom.Element#getContent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.getContent().clear();
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:300) */
        jDOMNodePointer.setValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#setValue(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: element.getContent().clear();
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.setValue(JDOMNodePointer.java:300) */
        jDOMNodePointer.setValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            short[] shortArray = {};
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(shortArray, null, null);
            
            String actual = jDOMNodePointer.getLanguage();
            
            assertNull(actual);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute_1() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
            
            String actual = jDOMNodePointer.getLanguage();
            
            assertNull(actual);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute_2() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
            
            String actual = jDOMNodePointer.getLanguage();
            
            assertNull(actual);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute_3() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            Comment comment = ((Comment) createInstance("org.jdom.Comment"));
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
            
            String actual = jDOMNodePointer.getLanguage();
            
            assertNull(actual);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);}
 *  */
    @Test
    public void testGetLanguage_ReturnFindEnclosingAttribute_4() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
            
            String actual = jDOMNodePointer.getLanguage();
            
            assertNull(actual);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLanguage()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)
 * @utbot.invokes org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return findEnclosingAttribute(node, "lang", Namespace.XML_NAMESPACE);
 *  */
    @Test
    public void testGetLanguage_ThrowClassCastException() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
            Document parent = ((Document) createInstance("org.jdom.Document"));
            setField(cdata, "org.jdom.Content", "parent", parent);
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
            jDOMNodePointer.getLanguage();
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Document): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsLeaf_NotNodeNotInstanceOfDocument() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        boolean actual = jDOMNodePointer.isLeaf();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return ((Element) node).getContent().size() == 0;}
 *  */
    @Test
    public void testIsLeaf_ElementnodeGetContentSizeEqualsZero() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        boolean actual = jDOMNodePointer.isLeaf();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.returnsFrom {@code return ((Element) node).getContent().size() == 0;}
 *  */
    @Test
    public void testIsLeaf_ElementnodeGetContentSizeNotEqualsZero() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        boolean actual = jDOMNodePointer.isLeaf();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return ((Document) node).getContent().size() == 0;}
 *  */
    @Test
    public void testIsLeaf_DocumentnodeGetContentSizeNotEqualsZero() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Element element = ((Element) createInstance("org.jdom.Element"));
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        boolean actual = jDOMNodePointer.isLeaf();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return ((Document) node).getContent().size() == 0;
 *  */
    @Test
    public void testIsLeaf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.hasRootElement(Document.java:205)
            org.jdom.Document.getContent(Document.java:407)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf(JDOMNodePointer.java:234) */
        jDOMNodePointer.isLeaf();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.invokes {@link org.jdom.Element#getContent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ((Element) node).getContent().size() == 0;
 *  */
    @Test
    public void testIsLeaf_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLeaf(JDOMNodePointer.java:231) */
        jDOMNodePointer.isLeaf();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isLeaf()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLeaf()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return ((Document) node).getContent().size() == 0;
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsLeaf_ThrowIllegalStateException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        jDOMNodePointer.isLeaf();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLanguage(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLanguage(java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLanguage()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String current = getLanguage();
 *  */
    @Test
    public void testIsLanguage_ThrowClassCastException() throws Exception  {
        Namespace prevXML_NAMESPACE = Namespace.XML_NAMESPACE;
        try {
            Namespace xmlNamespace = ((Namespace) createInstance("org.jdom.Namespace"));
            String prefix = "xml";
            setField(xmlNamespace, "org.jdom.Namespace", "prefix", prefix);
            String uri = "http://www.w3.org/XML/1998/namespace";
            setField(xmlNamespace, "org.jdom.Namespace", "uri", uri);
            Class namespaceClazz = Class.forName("org.jdom.Namespace");
            setStaticField(namespaceClazz, "XML_NAMESPACE", xmlNamespace);
            Comment comment = ((Comment) createInstance("org.jdom.Comment"));
            Document parent = ((Document) createInstance("org.jdom.Document"));
            setField(comment, "org.jdom.Content", "parent", parent);
            JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(comment, null, null);
            
            /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
                org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:538)
                org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(JDOMNodePointer.java:513)
                org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLanguage(JDOMNodePointer.java:493)
                org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isLanguage(JDOMNodePointer.java:483) */
            jDOMNodePointer.isLanguage(null);
        } finally {
            setStaticField(Namespace.class, "XML_NAMESPACE", prevXML_NAMESPACE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isLanguage(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isLanguage(java.lang.String)}
     */
    @Test
    public void testIsLanguageReturnsTrueWithEmptyString() {
        Object object = new Object();
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(1);
        
        boolean actual = jDOMNodePointer.isLanguage("");
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (!(node instanceof Element)): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: return super.createAttribute(context, name);
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateAttribute_ThrowJXPathException() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        jDOMNodePointer.createAttribute(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prefix = name.getPrefix();
 *  */
    @Test
    public void testCreateAttribute_ThrowNullPointerException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createAttribute(JDOMNodePointer.java:588) */
        jDOMNodePointer.createAttribute(null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createAttribute(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createAttribute(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName)}
     */
    @Test(expected = JXPathException.class)
    public void testCreateAttributeThrowsJXPE() {
        Object object = new Object();
        Locale locale = new Locale("\n\t\r", "#$\\\"'");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(Integer.MIN_VALUE);
        QName qName = new QName("XZ", "Unknown namespace prefix: ");
        
        jDOMNodePointer.createAttribute(null, qName);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalName(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLocalName(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Attribute): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetLocalName_NotNodeNotInstanceOfAttribute() {
        String actual = JDOMNodePointer.getLocalName(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLocalName(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.invokes {@link org.jdom.Element#getName()}
 * @utbot.returnsFrom {@code return ((Element) node).getName();}
 *  */
    @Test
    public void testGetLocalName_NodeInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        
        String actual = JDOMNodePointer.getLocalName(element);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getLocalName(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Attribute): True}
 * @utbot.invokes {@link org.jdom.Attribute#getName()}
 * @utbot.returnsFrom {@code return ((Attribute) node).getName();}
 *  */
    @Test
    public void testGetLocalName_NodeInstanceOfAttribute() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        
        String actual = JDOMNodePointer.getLocalName(attribute);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getNamespaceURI(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_NotNodeNotInstanceOfElement() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class objectType = Class.forName("java.lang.Object");
        Method getNamespaceURIMethod = jDOMNodePointerClazz.getDeclaredMethod("getNamespaceURI", objectType);
        getNamespaceURIMethod.setAccessible(true);
        java.lang.Object[] getNamespaceURIMethodArguments = new java.lang.Object[1];
        getNamespaceURIMethodArguments[0] = ((Object) null);
        String actual = ((String) getNamespaceURIMethod.invoke(null, getNamespaceURIMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getNamespaceURI(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node instanceof Element): True}
    /// invoke:
    ///     {@link org.jdom.Element#getNamespaceURI()} once
    /// return from: {@code return ns;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object)}
 * @utbot.executesCondition {@code (ns != null): False}
 * @utbot.returnsFrom {@code return ns;}
 *  */
    @Test
    public void testGetNamespaceURI_NsEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class elementType = Class.forName("java.lang.Object");
        Method getNamespaceURIMethod = jDOMNodePointerClazz.getDeclaredMethod("getNamespaceURI", elementType);
        getNamespaceURIMethod.setAccessible(true);
        java.lang.Object[] getNamespaceURIMethodArguments = new java.lang.Object[1];
        getNamespaceURIMethodArguments[0] = element;
        String actual = ((String) getNamespaceURIMethod.invoke(null, getNamespaceURIMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object)}
 * @utbot.executesCondition {@code (ns != null): True}
 * @utbot.executesCondition {@code (ns.equals("")): True}
 * @utbot.returnsFrom {@code return ns;}
 *  */
    @Test
    public void testGetNamespaceURI_NsEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class elementType = Class.forName("java.lang.Object");
        Method getNamespaceURIMethod = jDOMNodePointerClazz.getDeclaredMethod("getNamespaceURI", elementType);
        getNamespaceURIMethod.setAccessible(true);
        java.lang.Object[] getNamespaceURIMethodArguments = new java.lang.Object[1];
        getNamespaceURIMethodArguments[0] = element;
        String actual = ((String) getNamespaceURIMethod.invoke(null, getNamespaceURIMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object)}
 * @utbot.executesCondition {@code (ns != null): True}
 * @utbot.executesCondition {@code (ns.equals("")): False}
 * @utbot.returnsFrom {@code return ns;}
 *  */
    @Test
    public void testGetNamespaceURI_NotNsEquals() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "\u0000";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class elementType = Class.forName("java.lang.Object");
        Method getNamespaceURIMethod = jDOMNodePointerClazz.getDeclaredMethod("getNamespaceURI", elementType);
        getNamespaceURIMethod.setAccessible(true);
        java.lang.Object[] getNamespaceURIMethodArguments = new java.lang.Object[1];
        getNamespaceURIMethodArguments[0] = element;
        String actual = ((String) getNamespaceURIMethod.invoke(null, getNamespaceURIMethodArguments));
        
        assertEquals(uri, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI()}
 * @utbot.invokes org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object)
 * @utbot.returnsFrom {@code return getNamespaceURI(node);}
 *  */
    @Test
    public void testGetNamespaceURI_JDOMNodePointerGetNamespaceURI() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getNamespaceURI()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.Object) twice
    /// return from: {@code return getNamespaceURI(node);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI()}
 * @utbot.returnsFrom {@code return getNamespaceURI(node);}
 *  */
    @Test
    public void testGetNamespaceURI_ReturnGetNamespaceURI() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI()}
 * @utbot.returnsFrom {@code return getNamespaceURI(node);}
 *  */
    @Test
    public void testGetNamespaceURI_ReturnGetNamespaceURI_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI()}
 * @utbot.returnsFrom {@code return getNamespaceURI(node);}
 *  */
    @Test
    public void testGetNamespaceURI_ReturnGetNamespaceURI_2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "\u0000";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        setField(element, "org.jdom.Element", "namespace", namespace);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = jDOMNodePointer.getNamespaceURI();
        
        assertEquals(uri, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (prefix.equals("xml")): False}
 * @utbot.executesCondition {@code (node instanceof Document): False}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (element == null): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNamespaceURI_ElementEqualsNull() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        String string = " ";
        
        String actual = jDOMNodePointer.getNamespaceURI(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (prefix.equals("xml")): False}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jdom.Document#getRootElement()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: element = ((Document) node).getRootElement();
 *  */
    @Test
    public void testGetNamespaceURI_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = " ";
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.getRootElement(Document.java:216)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:151) */
        jDOMNodePointer.getNamespaceURI(string);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prefix.equals("xml")
 *  */
    @Test
    public void testGetNamespaceURI_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceURI(JDOMNodePointer.java:146) */
        jDOMNodePointer.getNamespaceURI(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNamespaceURI(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceURI(java.lang.String)}
 * @utbot.executesCondition {@code (prefix.equals("xml")): False}
 * @utbot.executesCondition {@code (node instanceof Document): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link org.jdom.Document#getRootElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: element = ((Document) node).getRootElement();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNamespaceURI_ThrowIllegalStateException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        String string = " ";
        
        jDOMNodePointer.getNamespaceURI(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asPath()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#asPath()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (parent instanceof JDOMNodePointer): False}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_NotParentNotInstanceOfJDOMNodePointer() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        String actual = jDOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#asPath()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text || node instanceof CDATA): True}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testAsPath_NotNodeNotInstanceOfProcessingInstruction() {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        String actual = jDOMNodePointer.asPath();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asPath()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#asPath()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: buffer.append('[').append(getRelativePositionOfTextNode()).append(']');
 *  */
    @Test
    public void testAsPath_ThrowClassCastException() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        jDOMNodePointer.asPath();
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#asPath()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buffer.append('[').append(getRelativePositionOfTextNode()).append(']');
 *  */
    @Test
    public void testAsPath_ThrowNullPointerException() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.asPath] produces [java.lang.NullPointerException] */
        jDOMNodePointer.asPath();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPrefix(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Attribute): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrefix_NotNodeNotInstanceOfAttribute() {
        String actual = JDOMNodePointer.getPrefix(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPrefix(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node instanceof Element): False},
    ///     {@code (node instanceof Attribute): True}
    /// invoke:
    ///     {@link org.jdom.Attribute#getNamespacePrefix()} once
    /// return from: {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): False}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixEqualsNullOrPrefixEquals() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(attribute, "org.jdom.Attribute", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(attribute);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixNotEqualsNullOrPrefixEquals() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(attribute, "org.jdom.Attribute", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(attribute);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): False}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixEqualsNullOrPrefixEquals_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jdom.Attribute"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "\u0000";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(attribute, "org.jdom.Attribute", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(attribute);
        
        assertEquals(prefix, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method getPrefix(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (node instanceof Element): True}
    /// invoke:
    ///     {@link org.jdom.Element#getNamespacePrefix()} once
    /// return from: {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): False}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixEqualsNullOrPrefixEquals_2() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(element);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixNotEqualsNullOrPrefixEquals_1() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(element);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getPrefix(java.lang.Object)}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): True}
 * @utbot.executesCondition {@code ((prefix == null || prefix.equals(""))): False}
 * @utbot.returnsFrom {@code return (prefix == null || prefix.equals("")) ? null : prefix;}
 *  */
    @Test
    public void testGetPrefix_PrefixEqualsNullOrPrefixEquals_3() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "\u0000";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        
        String actual = JDOMNodePointer.getPrefix(element);
        
        assertEquals(prefix, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.isCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollection()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#isCollection()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsCollection_ReturnFalse() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        boolean actual = jDOMNodePointer.isCollection();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method namespaceIterator()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#namespaceIterator()}
 * @utbot.returnsFrom {@code return new JDOMNamespaceIterator(this);}
 *  */
    @Test
    public void testNamespaceIterator_Return() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        JDOMNamespaceIterator actual = ((JDOMNamespaceIterator) jDOMNodePointer.namespaceIterator());
        
        JDOMNamespaceIterator expected = ((JDOMNamespaceIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent", parent);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "parent"));
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        assertNull(actualParentNode);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        assertNull(actualParentLocalNamespaceResolver);
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NodePointer actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Locale actualParentLocale = actualParent.getLocale();
        assertNull(actualParentLocale);
        
        List actualNamespaces = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "namespaces"));
        assertNull(actualNamespaces);
        
        Set actualPrefixes = ((Set) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator", "prefixes"));
        assertNull(actualPrefixes);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method namespaceIterator()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#namespaceIterator()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return new JDOMNamespaceIterator(this);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNamespaceIterator_ThrowIllegalStateException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        jDOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method namespaceIterator()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#namespaceIterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testNamespaceIterator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Document document = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(document, "org.jdom.Document", "content", content);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(document, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.getRootElement(Document.java:216)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator.<init>(JDOMNamespaceIterator.java:50)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespaceIterator(JDOMNodePointer.java:109) */
        jDOMNodePointer.namespaceIterator();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.childIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#childIterator(org.apache.commons.jxpath.ri.compiler.NodeTest,boolean,org.apache.commons.jxpath.ri.model.NodePointer)}
 *  */
    @Test
    public void testChildIterator() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPropertyPointer nullPropertyPointer = ((NullPropertyPointer) createInstance("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        String propertyName = "\u0000";
        nullPropertyPointer.setPropertyName(propertyName);
        
        JDOMNodeIterator actual = ((JDOMNodeIterator) jDOMNodePointer.childIterator(null, false, nullPropertyPointer));
        
        JDOMNodeIterator expected = ((JDOMNodeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent", parent);
        List children = new ArrayList();
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "children", children);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "parent"));
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        assertNull(actualParentNode);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        assertNull(actualParentLocalNamespaceResolver);
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NodePointer actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Locale actualParentLocale = actualParent.getLocale();
        assertNull(actualParentLocale);
        
        NodeTest actualNodeTest = ((NodeTest) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "nodeTest"));
        assertNull(actualNodeTest);
        
        boolean actualReverse = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "reverse"));
        assertFalse(actualReverse);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "index"));
        assertEquals(expectedIndex, actualIndex);
        
        List expectedChildren = ((List) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "children"));
        List actualChildren = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "children"));
        assertTrue(deepEquals(expectedChildren, actualChildren));
        
        Object actualChild = getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodeIterator", "child");
        assertNull(actualChild);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.namespacePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method namespacePointer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#namespacePointer(java.lang.String)}
 * @utbot.returnsFrom {@code return new JDOMNamespacePointer(this, prefix);}
 *  */
    @Test
    public void testNamespacePointer_Return() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        JDOMNamespacePointer actual = ((JDOMNamespacePointer) jDOMNodePointer.namespacePointer(null));
        
        JDOMNamespacePointer expected = ((JDOMNamespacePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        expected.setIndex(Integer.MIN_VALUE);
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.NodePointer", "parent", parent);
        
        // org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.attributeIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method attributeIterator(org.apache.commons.jxpath.ri.QName)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#attributeIterator(org.apache.commons.jxpath.ri.QName)}
 * @utbot.returnsFrom {@code return new JDOMAttributeIterator(this, name);}
 *  */
    @Test
    public void testAttributeIterator_Return() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        JDOMAttributeIterator actual = ((JDOMAttributeIterator) jDOMNodePointer.attributeIterator(null));
        
        JDOMAttributeIterator expected = ((JDOMAttributeIterator) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        JDOMNodePointer parent = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        parent.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent", parent);
        
        NodePointer expectedParent = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent"));
        NodePointer actualParent = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "parent"));
        Object actualParentNode = getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        assertNull(actualParentNode);
        
        String actualParentId = ((String) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertNull(actualParentId);
        
        NamespaceResolver actualParentLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        assertNull(actualParentLocalNamespaceResolver);
        
        int expectedParentIndex = expectedParent.getIndex();
        int actualParentIndex = actualParent.getIndex();
        assertEquals(expectedParentIndex, actualParentIndex);
        
        boolean actualParentAttribute = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualParentAttribute);
        
        NamespaceResolver actualParentNamespaceResolver = actualParent.getNamespaceResolver();
        assertNull(actualParentNamespaceResolver);
        
        Object actualParentRootNode = actualParent.getRootNode();
        assertNull(actualParentRootNode);
        
        NodePointer actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
        Locale actualParentLocale = actualParent.getLocale();
        assertNull(actualParentLocale);
        
        List actualAttributes = ((List) getFieldValue(actual, "org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator", "attributes"));
        assertNull(actualAttributes);
        
        int expectedPosition = expected.getPosition();
        int actualPosition = actual.getPosition();
        assertEquals(expectedPosition, actualPosition);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getImmediateNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImmediateNode()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getImmediateNode()}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testGetImmediateNode_ReturnNode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        Object actual = jDOMNodePointer.getImmediateNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException_1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int,java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: NodePointer ptr = createChild(context, name, index);
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException_2() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int, java.lang.Object)
    
    @Test
    public void testCreateChildByFuzzer() {
        Object object = new Object();
        Locale locale = new Locale("#$\\\"'", "\n\t\r");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(1);
        QName qName = new QName("10", "\n\t\r");
        Object object1 = new Object();
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:849)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:551)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:577) */
        jDOMNodePointer.createChild(null, qName, 3, object1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): False}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException_11() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
 * @utbot.executesCondition {@code (index == WHOLE_COLLECTION): True}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: getAbstractFactory(context).createObject(context, this, node, name.toString(), index)
 *  */
    @Test(expected = JXPathException.class)
    public void testCreateChild_ThrowJXPathException_21() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        JXPathContextReferenceImpl jXPathContextReferenceImpl = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        JXPathContextReferenceImpl parentContext = ((JXPathContextReferenceImpl) createInstance("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(jXPathContextReferenceImpl, "org.apache.commons.jxpath.JXPathContext", "parentContext", parentContext);
        
        jDOMNodePointer.createChild(jXPathContextReferenceImpl, null, Integer.MIN_VALUE);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method createChild(org.apache.commons.jxpath.JXPathContext, org.apache.commons.jxpath.ri.QName, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer}
     * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#createChild(org.apache.commons.jxpath.JXPathContext,org.apache.commons.jxpath.ri.QName,int)}
     */
    @Test
    public void testCreateChildThrowsNPEWithCornerCase() {
        Object object = new Object();
        Locale locale = new Locale("Factory could not create a child node for path: ", "");
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, locale);
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver);
        NamespaceResolver namespaceResolver2 = new NamespaceResolver(namespaceResolver1);
        jDOMNodePointer.setNamespaceResolver(namespaceResolver2);
        jDOMNodePointer.setIndex(Integer.MIN_VALUE);
        QName qName = new QName("-3", "/");
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.NodePointer.getAbstractFactory(NodePointer.java:849)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.createChild(JDOMNodePointer.java:551) */
        jDOMNodePointer.createChild(null, qName, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.apache.commons.jxpath.ri.compiler.NodeTypeTest#getNodeType()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(6);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_2() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_3() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_7() throws Exception  {
        Text text = ((Text) createInstance("org.jdom.Text"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(text, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_4() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        boolean actual = jDOMNodePointer.testNode(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_8() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = jDOMNodePointer.testNode(nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_5() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        boolean actual = jDOMNodePointer.testNode(nodeNameTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_6() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        boolean actual = jDOMNodePointer.testNode(processingInstructionTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_9() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String target = "";
        setField(processingInstruction, "org.jdom.ProcessingInstruction", "target", target);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(target);
        
        boolean actual = jDOMNodePointer.testNode(processingInstructionTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.returnsFrom {@code return testNode(this, node, test);}
 *  */
    @Test
    public void testTestNode_ReturnTestNode_10() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = jDOMNodePointer.testNode(nodeNameTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (test == null): False},
    ///     {@code (test instanceof NodeNameTest): False},
    ///     {@code (test instanceof NodeTypeTest): True}
    /// invoke:
    ///     {@link org.apache.commons.jxpath.ri.compiler.NodeTypeTest#getNodeType()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: default}
 *  */
    @Test
    public void testTestNode_ReturnFalse() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(6);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_COMMENT}
 * @utbot.returnsFrom {@code return node instanceof Comment;}
 *  */
    @Test
    public void testTestNode_ReturnNodeInstanceOfComment() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(3);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_NODE}
 *  */
    @Test
    public void testTestNode_ReturnTrue() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(1);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.activatesSwitch {@code switch(((NodeTypeTest) test).getNodeType()) case: Compiler.NODE_TYPE_PI}
 * @utbot.returnsFrom {@code return node instanceof ProcessingInstruction;}
 *  */
    @Test
    public void testTestNode_ReturnNodeInstanceOfProcessingInstruction() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(4);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.returnsFrom {@code return (node instanceof Text) || (node instanceof CDATA);}
 *  */
    @Test
    public void testTestNode_NodeNotInstanceOfTextOrNodeNotInstanceOfCDATA_1() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = JDOMNodePointer.testNode(null, cdata, nodeTypeTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): True}
 *  */
    @Test
    public void testTestNode_TestEqualsNull() {
        boolean actual = JDOMNodePointer.testNode(null, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): True}
 * @utbot.returnsFrom {@code return (node instanceof Text) || (node instanceof CDATA);}
 *  */
    @Test
    public void testTestNode_NodeNotInstanceOfTextOrNodeNotInstanceOfCDATA() {
        NodeTypeTest nodeTypeTest = new NodeTypeTest(2);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeTypeTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.executesCondition {@code (!(node instanceof Element)): True}
 *  */
    @Test
    public void testTestNode_NotNodeInstanceOfElement() {
        NodeNameTest nodeNameTest = new NodeNameTest(null);
        
        boolean actual = JDOMNodePointer.testNode(null, null, nodeNameTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest && node instanceof ProcessingInstruction): True}
 *  */
    @Test
    public void testTestNode_TestNotInstanceOfProcessingInstructionTestAndNodeNotInstanceOfProcessingInstruction() {
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        boolean actual = JDOMNodePointer.testNode(null, null, processingInstructionTest);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest && node instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest#getTarget()}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getTarget()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return testPI.equals(nodePI);}
 *  */
    @Test
    public void testTestNode_TestInstanceOfProcessingInstructionTestAndNodeInstanceOfProcessingInstruction() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String target = "";
        setField(processingInstruction, "org.jdom.ProcessingInstruction", "target", target);
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(target);
        
        boolean actual = JDOMNodePointer.testNode(null, processingInstruction, processingInstructionTest);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): True}
 * @utbot.executesCondition {@code (!(node instanceof Element)): False}
 * @utbot.executesCondition {@code (wildcard): True}
 * @utbot.executesCondition {@code (testPrefix == null): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#getNodeName()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#getNamespaceURI()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.NodeNameTest#isWildcard()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.QName#getPrefix()}
 *  */
    @Test
    public void testTestNode_TestPrefixEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        QName qName = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        String name = "";
        setField(qName, "org.apache.commons.jxpath.ri.QName", "name", name);
        NodeNameTest nodeNameTest = new NodeNameTest(qName, null);
        
        boolean actual = JDOMNodePointer.testNode(null, element, nodeNameTest);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testNode(org.apache.commons.jxpath.ri.model.NodePointer, java.lang.Object, org.apache.commons.jxpath.ri.compiler.NodeTest)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#testNode(org.apache.commons.jxpath.ri.model.NodePointer,java.lang.Object,org.apache.commons.jxpath.ri.compiler.NodeTest)}
 * @utbot.executesCondition {@code (test == null): False}
 * @utbot.executesCondition {@code (test instanceof NodeNameTest): False}
 * @utbot.executesCondition {@code (test instanceof NodeTypeTest): False}
 * @utbot.executesCondition {@code (test instanceof ProcessingInstructionTest && node instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest#getTarget()}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getTarget()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return testPI.equals(nodePI);
 *  */
    @Test
    public void testTestNode_ThrowNullPointerException() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        ProcessingInstructionTest processingInstructionTest = new ProcessingInstructionTest(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(JDOMNodePointer.java:423) */
        JDOMNodePointer.testNode(null, processingInstruction, processingInstructionTest);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.equalStrings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#equalStrings(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (s1 == s2): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualStrings_S1EqualsS2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = jDOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equalStrings(java.lang.String, java.lang.String)
    
    @Test
    public void testEqualStrings1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        String string1 = "";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = jDOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = string1;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testEqualStrings2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "\u0001!";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = jDOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = ((Object) null);
        equalStringsMethodArguments[1] = string;
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testEqualStrings3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "!";
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class stringType = Class.forName("java.lang.String");
        Method equalStringsMethod = jDOMNodePointerClazz.getDeclaredMethod("equalStrings", stringType, stringType);
        equalStringsMethod.setAccessible(true);
        java.lang.Object[] equalStringsMethodArguments = new java.lang.Object[2];
        equalStringsMethodArguments[0] = string;
        equalStringsMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) equalStringsMethod.invoke(null, equalStringsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodeParent(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (node instanceof Comment): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNodeParent_NotNodeNotInstanceOfComment() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class objectType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", objectType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = ((Object) null);
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (parent instanceof Element): False}
 * @utbot.returnsFrom {@code return parent instanceof Element ? (Element) parent : null;}
 *  */
    @Test
    public void testNodeParent_NotParentNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class elementType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", elementType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = element;
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getParent()}
 * @utbot.returnsFrom {@code return (Element) ((ProcessingInstruction) node).getParent();}
 *  */
    @Test
    public void testNodeParent_NodeInstanceOfProcessingInstruction() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class processingInstructionType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", processingInstructionType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = processingInstruction;
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (node instanceof Comment): True}
 * @utbot.invokes {@link org.jdom.Comment#getParent()}
 * @utbot.returnsFrom {@code return (Element) ((Comment) node).getParent();}
 *  */
    @Test
    public void testNodeParent_NodeInstanceOfComment() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class commentType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", commentType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = comment;
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.invokes {@link org.jdom.Text#getParent()}
 * @utbot.returnsFrom {@code return (Element) ((Text) node).getParent();}
 *  */
    @Test
    public void testNodeParent_NodeInstanceOfText() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class cdataType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", cdataType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = cdata;
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (parent instanceof Element): True}
 * @utbot.returnsFrom {@code return parent instanceof Element ? (Element) parent : null;}
 *  */
    @Test
    public void testNodeParent_ParentInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(element, "org.jdom.Content", "parent", parent);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class elementType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", elementType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = element;
        Element actual = ((Element) nodeParentMethod.invoke(null, nodeParentMethodArguments));
        
        String actualName = actual.getName();
        assertNull(actualName);
        
        Namespace actualNamespace = actual.getNamespace();
        assertNull(actualNamespace);
        
        List actualAdditionalNamespaces = actual.getAdditionalNamespaces();
        assertNull(actualAdditionalNamespaces);
        
        Object actualAttributes = getFieldValue(actual, "org.jdom.Element", "attributes");
        assertNull(actualAttributes);
        
        Object actualContent = getFieldValue(actual, "org.jdom.Element", "content");
        assertNull(actualContent);
        
        Parent actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nodeParent(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): True}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getParent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) ((ProcessingInstruction) node).getParent();
 *  */
    @Test
    public void testNodeParent_ThrowClassCastException() throws Throwable  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:535) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class processingInstructionType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", processingInstructionType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = processingInstruction;
        try {
            nodeParentMethod.invoke(null, nodeParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.executesCondition {@code (node instanceof CDATA): False}
 * @utbot.executesCondition {@code (node instanceof ProcessingInstruction): False}
 * @utbot.executesCondition {@code (node instanceof Comment): True}
 * @utbot.invokes {@link org.jdom.Comment#getParent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) ((Comment) node).getParent();
 *  */
    @Test
    public void testNodeParent_ThrowClassCastException_1() throws Throwable  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(comment, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:538) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class commentType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", commentType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = comment;
        try {
            nodeParentMethod.invoke(null, nodeParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#nodeParent(java.lang.Object)}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.invokes {@link org.jdom.Text#getParent()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Element) ((Text) node).getParent();
 *  */
    @Test
    public void testNodeParent_ThrowClassCastException_2() throws Throwable  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class cdataType = Class.forName("java.lang.Object");
        Method nodeParentMethod = jDOMNodePointerClazz.getDeclaredMethod("nodeParent", cdataType);
        nodeParentMethod.setAccessible(true);
        java.lang.Object[] nodeParentMethodArguments = new java.lang.Object[1];
        nodeParentMethodArguments[0] = cdata;
        try {
            nodeParentMethod.invoke(null, nodeParentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getBaseValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBaseValue()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getBaseValue()}
 * @utbot.returnsFrom {@code return node;}
 *  */
    @Test
    public void testGetBaseValue_ReturnNode() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        Object actual = jDOMNodePointer.getBaseValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addContent(java.util.List)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 *  */
    @Test
    public void testAddContent() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ArrayList arrayList = new ArrayList();
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class arrayListType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", arrayListType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = arrayList;
        addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 *  */
    @Test
    public void testAddContent_NotNodeNotInstanceOfComment() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class arrayListType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", arrayListType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = arrayList;
        addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 *  */
    @Test
    public void testAddContent_ChildInstanceOfText() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ArrayList arrayList = new ArrayList();
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        arrayList.add(cdata);
        arrayList.add(null);
        arrayList.add(null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class arrayListType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", arrayListType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = arrayList;
        addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addContent(java.util.List)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element element = (Element) node;
 *  */
    @Test
    public void testAddContent_ThrowClassCastException() throws Throwable  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:338) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class listType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", listType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = ((Object) null);
        try {
            addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int count = content.size();
 *  */
    @Test
    public void testAddContent_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:339) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class listType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", listType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = ((Object) null);
        try {
            addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#addContent(java.util.List)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: child = ((Element) child).clone();
 *  */
    @Test
    public void testAddContent_ThrowNullPointerException_1() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ArrayList arrayList = new ArrayList();
        Element element = ((Element) createInstance("org.jdom.Element"));
        arrayList.add(element);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.addContent(JDOMNodePointer.java:345) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class arrayListType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", arrayListType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = arrayList;
        try {
            addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addContent(java.util.List)
    
    @Test
    public void testAddContent1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        ArrayList arrayList = new ArrayList();
        Object object = new Object();
        arrayList.add(object);
        Object object1 = new Object();
        arrayList.add(object1);
        arrayList.add(object1);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class arrayListType = Class.forName("java.util.List");
        Method addContentMethod = jDOMNodePointerClazz.getDeclaredMethod("addContent", arrayListType);
        addContentMethod.setAccessible(true);
        java.lang.Object[] addContentMethodArguments = new java.lang.Object[1];
        addContentMethodArguments[0] = arrayList;
        addContentMethod.invoke(jDOMNodePointer, addContentMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfPI()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ParentEqualsNull() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_ParentNotEqualsNull() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_TargetEqualsNull() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) processingInstruction);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_TargetEquals() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String target = "";
        setField(processingInstruction, "org.jdom.ProcessingInstruction", "target", target);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) processingInstruction);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_NotTargetEquals() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        String target = "";
        setField(processingInstruction, "org.jdom.ProcessingInstruction", "target", target);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        ProcessingInstruction processingInstruction1 = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        elementData[0] = ((Content) processingInstruction1);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfPI_NotChildNotInstanceOfProcessingInstruction() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments));
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Parent jDOMNodePointerNodeNodeParent = ((Parent) getFieldValue(jDOMNodePointerNode, "org.jdom.Content", "parent"));
        Object jDOMNodePointerNodeNodeParentNodeParentContent = getFieldValue(jDOMNodePointerNodeNodeParent, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeParentNodeParentContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeParentContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeParentContentElementData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfPI()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String target = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException() throws Throwable  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.ProcessingInstruction ([B is in module java.base of loader 'bootstrap'; org.jdom.ProcessingInstruction is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:773) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Element parent = (Element) ((ProcessingInstruction) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowClassCastException_1() throws Throwable  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:774) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object child = children.get(i);
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:781) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.invokes {@link org.jdom.ProcessingInstruction#getTarget()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String target = ((ProcessingInstruction) node).getTarget();
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:773) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfPI()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.size(); i++)
 *  */
    @Test
    public void testGetRelativePositionOfPI_ThrowNullPointerException_1() throws Throwable  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(processingInstruction, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfPI(JDOMNodePointer.java:780) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfPIMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfPI");
        getRelativePositionOfPIMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfPIMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfPIMethod.invoke(jDOMNodePointer, getRelativePositionOfPIMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getNamespaceResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceResolver()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceResolver()}
 * @utbot.executesCondition {@code (localNamespaceResolver == null): False}
 * @utbot.returnsFrom {@code return localNamespaceResolver;}
 *  */
    @Test
    public void testGetNamespaceResolver_LocalNamespaceResolverNotEqualsNull() throws Exception  {
        JDOMNodePointer jDOMNodePointer = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        NamespaceResolver localNamespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver", localNamespaceResolver);
        
        NamespaceResolver actual = jDOMNodePointer.getNamespaceResolver();
        
        NamespaceResolver actualParent = ((NamespaceResolver) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        assertNull(actualParent);
        
        HashMap actualNamespaceMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertNull(actualNamespaceMap);
        
        HashMap actualReverseMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        assertNull(actualReverseMap);
        
        NodePointer actualPointer = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        assertNull(actualPointer);
        
        boolean actualSealed = ((Boolean) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        assertFalse(actualSealed);
        
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceResolver()}
 * @utbot.executesCondition {@code (localNamespaceResolver == null): True}
 * @utbot.returnsFrom {@code return localNamespaceResolver;}
 *  */
    @Test
    public void testGetNamespaceResolver_LocalNamespaceResolverEqualsNull_1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        NamespaceResolver initialJDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        
        NamespaceResolver actual = jDOMNodePointer.getNamespaceResolver();
        
        NamespaceResolver expected = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        HashMap namespaceMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        HashMap reverseMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap", reverseMap);
        JDOMNodePointer pointer = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(pointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver", expected);
        pointer.setIndex(Integer.MIN_VALUE);
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", pointer);
        
        NamespaceResolver actualParent = ((NamespaceResolver) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        assertNull(actualParent);
        
        HashMap expectedNamespaceMap = ((HashMap) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        HashMap actualNamespaceMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertTrue(deepEquals(expectedNamespaceMap, actualNamespaceMap));
        
        HashMap expectedReverseMap = ((HashMap) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        HashMap actualReverseMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        assertTrue(deepEquals(expectedReverseMap, actualReverseMap));
        
        NodePointer expectedPointer = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        NodePointer actualPointer = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        Object actualPointerNode = getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        assertNull(actualPointerNode);
        
        String actualPointerId = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertNull(actualPointerId);
        
        NamespaceResolver expectedPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(expectedPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        NamespaceResolver actualPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        boolean actualPointerLocalNamespaceResolverSealed = ((Boolean) getFieldValue(actualPointerLocalNamespaceResolver, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        assertFalse(actualPointerLocalNamespaceResolverSealed);
        
        int expectedPointerIndex = expectedPointer.getIndex();
        int actualPointerIndex = actualPointer.getIndex();
        assertEquals(expectedPointerIndex, actualPointerIndex);
        
        boolean actualPointerAttribute = ((Boolean) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualPointerAttribute);
        
        NamespaceResolver actualPointerNamespaceResolver = actualPointer.getNamespaceResolver();
        assertNull(actualPointerNamespaceResolver);
        
        Object actualPointerRootNode = actualPointer.getRootNode();
        assertNull(actualPointerRootNode);
        
        NodePointer actualPointerParent = actualPointer.getParent();
        assertNull(actualPointerParent);
        
        Locale actualPointerLocale = actualPointer.getLocale();
        assertNull(actualPointerLocale);
        
        assertTrue(deepEquals(expected, actual));
        
        NamespaceResolver finalJDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        
        assertFalse(initialJDOMNodePointerLocalNamespaceResolver == finalJDOMNodePointerLocalNamespaceResolver);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getNamespaceResolver()}
 * @utbot.executesCondition {@code (localNamespaceResolver == null): True}
 * @utbot.returnsFrom {@code return localNamespaceResolver;}
 *  */
    @Test
    public void testGetNamespaceResolver_LocalNamespaceResolverEqualsNull() throws Exception  {
        JDOMNodePointer jDOMNodePointer = ((JDOMNodePointer) createInstance("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        NamespaceResolver namespaceResolver = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        jDOMNodePointer.setNamespaceResolver(namespaceResolver);
        
        NamespaceResolver initialJDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        
        NamespaceResolver actual = jDOMNodePointer.getNamespaceResolver();
        
        NamespaceResolver expected = ((NamespaceResolver) createInstance("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent", namespaceResolver);
        HashMap namespaceMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap", namespaceMap);
        HashMap reverseMap = new HashMap();
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap", reverseMap);
        setField(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer", jDOMNodePointer);
        
        NamespaceResolver expectedParent = ((NamespaceResolver) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver actualParent = ((NamespaceResolver) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        NamespaceResolver actualParentParent = ((NamespaceResolver) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "parent"));
        assertNull(actualParentParent);
        
        HashMap actualParentNamespaceMap = ((HashMap) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertNull(actualParentNamespaceMap);
        
        HashMap actualParentReverseMap = ((HashMap) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        assertNull(actualParentReverseMap);
        
        NodePointer actualParentPointer = ((NodePointer) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        assertNull(actualParentPointer);
        
        boolean actualParentSealed = ((Boolean) getFieldValue(actualParent, "org.apache.commons.jxpath.ri.NamespaceResolver", "sealed"));
        assertFalse(actualParentSealed);
        
        HashMap expectedNamespaceMap = ((HashMap) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        HashMap actualNamespaceMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "namespaceMap"));
        assertTrue(deepEquals(expectedNamespaceMap, actualNamespaceMap));
        
        HashMap expectedReverseMap = ((HashMap) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        HashMap actualReverseMap = ((HashMap) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "reverseMap"));
        assertTrue(deepEquals(expectedReverseMap, actualReverseMap));
        
        NodePointer expectedPointer = ((NodePointer) getFieldValue(expected, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        NodePointer actualPointer = ((NodePointer) getFieldValue(actual, "org.apache.commons.jxpath.ri.NamespaceResolver", "pointer"));
        Object actualPointerNode = getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        assertNull(actualPointerNode);
        
        String actualPointerId = ((String) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "id"));
        assertNull(actualPointerId);
        
        NamespaceResolver expectedPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(expectedPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        NamespaceResolver actualPointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        assertTrue(deepEquals(expectedPointerLocalNamespaceResolver, actualPointerLocalNamespaceResolver));
        
        int expectedPointerIndex = expectedPointer.getIndex();
        int actualPointerIndex = actualPointer.getIndex();
        assertEquals(expectedPointerIndex, actualPointerIndex);
        
        boolean actualPointerAttribute = ((Boolean) getFieldValue(actualPointer, "org.apache.commons.jxpath.ri.model.NodePointer", "attribute"));
        assertFalse(actualPointerAttribute);
        
        NamespaceResolver expectedPointerNamespaceResolver = expectedPointer.getNamespaceResolver();
        NamespaceResolver actualPointerNamespaceResolver = actualPointer.getNamespaceResolver();
        assertTrue(deepEquals(expectedPointerNamespaceResolver, actualPointerNamespaceResolver));
        assertTrue(deepEquals(expectedPointerNamespaceResolver, actualPointerNamespaceResolver));
        assertTrue(deepEquals(expectedPointerNamespaceResolver, actualPointerNamespaceResolver));
        assertTrue(deepEquals(expectedPointerNamespaceResolver, actualPointerNamespaceResolver));
        assertTrue(deepEquals(expectedPointerNamespaceResolver, actualPointerNamespaceResolver));
        
        Object actualPointerRootNode = actualPointer.getRootNode();
        assertNull(actualPointerRootNode);
        
        NodePointer actualPointerParent = actualPointer.getParent();
        assertNull(actualPointerParent);
        
        Locale actualPointerLocale = actualPointer.getLocale();
        assertNull(actualPointerLocale);
        
        assertTrue(deepEquals(expected, actual));
        
        NamespaceResolver finalJDOMNodePointerLocalNamespaceResolver = ((NamespaceResolver) getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "localNamespaceResolver"));
        
        assertFalse(initialJDOMNodePointerLocalNamespaceResolver == finalJDOMNodePointerLocalNamespaceResolver);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): True}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ParentInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ParentEqualsNull() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ChildEqualsNode() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) element);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Document", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_ChildNotEqualsNode() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Element element1 = ((Element) createInstance("org.jdom.Element"));
        elementData[0] = ((Content) element1);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Document", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfElement_NotChildNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments));
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Parent jDOMNodePointerNodeNodeParent = ((Parent) getFieldValue(jDOMNodePointerNode, "org.jdom.Content", "parent"));
        Object jDOMNodePointerNodeNodeParentNodeParentContent = getFieldValue(jDOMNodePointerNodeNodeParent, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeParentNodeParentContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeParentContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeParentContentElementData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object parent = ((Element) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowClassCastException() throws Throwable  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.Element ([B is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:715) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object child = children.get(i);
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(element, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:728) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): False}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: children = ((Document) parent).getContent();
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Document", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.indexOfFirstElement(ContentList.java:412)
            org.jdom.Document.hasRootElement(Document.java:205)
            org.jdom.Document.getContent(Document.java:407)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:724) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.invokes {@link org.jdom.Element#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object parent = ((Element) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:715) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.size(); i++)
 *  */
    @Test
    public void testGetRelativePositionOfElement_ThrowNullPointerException_1() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfElement(JDOMNodePointer.java:727) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRelativePositionOfElement()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfElement()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (parent instanceof Element): False}
 * @utbot.invokes {@link org.jdom.Element#getParent()}
 * @utbot.invokes {@link org.jdom.Document#getContent()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: children = ((Document) parent).getContent();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetRelativePositionOfElement_ThrowIllegalStateException() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(parent, "org.jdom.Document", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfElementMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfElement");
        getRelativePositionOfElementMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfElementMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfElementMethod.invoke(jDOMNodePointer, getRelativePositionOfElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ParentEqualsNull() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ParentNotEqualsNull() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        setField(parent, "org.jdom.Element", "content", content);
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ChildEqualsNode() throws Exception  {
        Text text = ((Text) createInstance("org.jdom.Text"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        elementData[0] = ((Content) text);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(text, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(text, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ChildNotEqualsNode() throws Exception  {
        Text text = ((Text) createInstance("org.jdom.Text"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = new org.jdom.Content[1];
        Text text1 = ((Text) createInstance("org.jdom.Text"));
        elementData[0] = ((Content) text1);
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(text, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(text, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ChildNotInstanceOfTextOrChildNotInstanceOfCDATA() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionOfTextNode()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: parent = (Element) ((CDATA) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowClassCastException() throws Throwable  {
        byte[] byteArray = {};
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(byteArray, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.ClassCastException: class [B cannot be cast to class org.jdom.CDATA ([B is in module java.base of loader 'bootstrap'; org.jdom.CDATA is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode(JDOMNodePointer.java:749) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: parent = (Element) ((Text) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowClassCastException_1() throws Throwable  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Object child = children.get(i);
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowIndexOutOfBoundsException() throws Throwable  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (node instanceof Text): False}
 * @utbot.invokes {@link org.jdom.CDATA#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent = (Element) ((CDATA) node).getParent();
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowNullPointerException() throws Throwable  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(null, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode(JDOMNodePointer.java:749) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionOfTextNode()}
 * @utbot.executesCondition {@code (node instanceof Text): True}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.size(); i++)
 *  */
    @Test
    public void testGetRelativePositionOfTextNode_ThrowNullPointerException_1() throws Throwable  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Element parent = ((Element) createInstance("org.jdom.Element"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(cdata, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionOfTextNode] produces [java.lang.NullPointerException] */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionOfTextNodeMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionOfTextNode");
        getRelativePositionOfTextNodeMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionOfTextNodeMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionOfTextNodeMethod.invoke(jDOMNodePointer, getRelativePositionOfTextNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.executesCondition {@code (node1 == node2): True}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 *  */
    @Test
    public void testCompareChildNodePointers_Node1EqualsNode2() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        NullPointer nullPointer1 = new NullPointer(((QName) null), ((Locale) null));
        
        int actual = jDOMNodePointer.compareChildNodePointers(nullPointer, nullPointer1);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object node1 = pointer1.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:166) */
        jDOMNodePointer.compareChildNodePointers(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object node2 = pointer2.getBaseValue();
 *  */
    @Test
    public void testCompareChildNodePointers_ThrowNullPointerException_1() {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.compareChildNodePointers(JDOMNodePointer.java:167) */
        jDOMNodePointer.compareChildNodePointers(nullPointer, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: Object node1 = pointer1.getBaseValue();
 *  */
    @Test(expected = JXPathException.class)
    public void testCompareChildNodePointers_ThrowJXPathException_1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        
        jDOMNodePointer.compareChildNodePointers(variablePointer, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer,org.apache.commons.jxpath.ri.model.NodePointer)}
 * @utbot.invokes {@link org.apache.commons.jxpath.ri.model.NodePointer#getBaseValue()}
 * @utbot.throwsException {@link org.apache.commons.jxpath.JXPathException} in: Object node2 = pointer2.getBaseValue();
 *  */
    @Test(expected = JXPathException.class)
    public void testCompareChildNodePointers_ThrowJXPathException() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        
        jDOMNodePointer.compareChildNodePointers(nullPointer, variablePointer);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareChildNodePointers(org.apache.commons.jxpath.ri.model.NodePointer, org.apache.commons.jxpath.ri.model.NodePointer)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCompareChildNodePointers1() throws Exception  {
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(((Object) null), ((Locale) null));
        NullPointer nullPointer = new NullPointer(((QName) null), ((Locale) null));
        VariablePointer variablePointer = ((VariablePointer) createInstance("org.apache.commons.jxpath.ri.model.VariablePointer"));
        BasicVariables variables = ((BasicVariables) createInstance("org.apache.commons.jxpath.BasicVariables"));
        HashMap vars = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        vars.put(integer, object);
        setField(variables, "org.apache.commons.jxpath.BasicVariables", "vars", vars);
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "variables", variables);
        QName name = ((QName) createInstance("org.apache.commons.jxpath.ri.QName"));
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "name", name);
        setField(variablePointer, "org.apache.commons.jxpath.ri.model.VariablePointer", "actual", true);
        
        jDOMNodePointer.compareChildNodePointers(nullPointer, variablePointer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NotNNotInstanceOfElement() {
        byte[] byteArray = {};
        
        String actual = JDOMNodePointer.findEnclosingAttribute(byteArray, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_ReturnNull() {
        String actual = JDOMNodePointer.findEnclosingAttribute(null, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NotNNotInstanceOfElement_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        
        String actual = JDOMNodePointer.findEnclosingAttribute(comment, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NotNNotInstanceOfElement_2() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        
        String actual = JDOMNodePointer.findEnclosingAttribute(cdata, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NotNNotInstanceOfElement_3() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        
        String actual = JDOMNodePointer.findEnclosingAttribute(processingInstruction, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindEnclosingAttribute_NInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        setField(element, "org.jdom.Element", "attributes", attributes);
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        
        String actual = JDOMNodePointer.findEnclosingAttribute(element, null, namespace);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnclosingAttribute(java.lang.Object, java.lang.String, org.jdom.Namespace)
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testFindEnclosingAttribute_ThrowClassCastException() throws Exception  {
        CDATA cdata = ((CDATA) createInstance("org.jdom.CDATA"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(cdata, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute] produces [java.lang.ClassCastException: The object with type org.jdom.Parent can not be casted to org.jdom.Element] */
        JDOMNodePointer.findEnclosingAttribute(cdata, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testFindEnclosingAttribute_ThrowClassCastException_1() throws Exception  {
        Comment comment = ((Comment) createInstance("org.jdom.Comment"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(comment, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:538)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(JDOMNodePointer.java:513) */
        JDOMNodePointer.findEnclosingAttribute(comment, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n = nodeParent(n);
 *  */
    @Test
    public void testFindEnclosingAttribute_ThrowClassCastException_2() throws Exception  {
        ProcessingInstruction processingInstruction = ((ProcessingInstruction) createInstance("org.jdom.ProcessingInstruction"));
        Document parent = ((Document) createInstance("org.jdom.Document"));
        setField(processingInstruction, "org.jdom.Content", "parent", parent);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute] produces [java.lang.ClassCastException: class org.jdom.Document cannot be cast to class org.jdom.Element (org.jdom.Document and org.jdom.Element are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.nodeParent(JDOMNodePointer.java:535)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(JDOMNodePointer.java:513) */
        JDOMNodePointer.findEnclosingAttribute(processingInstruction, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#findEnclosingAttribute(java.lang.Object,java.lang.String,org.jdom.Namespace)}
 * @utbot.iterates iterate the loop {@code while(n != null)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testFindEnclosingAttribute_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Object attributes = createInstance("org.jdom.AttributeList");
        org.jdom.Attribute[] elementData = {};
        setField(attributes, "org.jdom.AttributeList", "elementData", elementData);
        setField(attributes, "org.jdom.AttributeList", "size", 1);
        setField(element, "org.jdom.Element", "attributes", attributes);
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String uri = "";
        setField(namespace, "org.jdom.Namespace", "uri", uri);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.AttributeList.indexOf(AttributeList.java:381)
            org.jdom.AttributeList.get(AttributeList.java:366)
            org.jdom.Element.getAttributeValue(Element.java:1041)
            org.jdom.Element.getAttributeValue(Element.java:1025)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.findEnclosingAttribute(JDOMNodePointer.java:508) */
        JDOMNodePointer.findEnclosingAttribute(element, null, namespace);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativePositionByQName()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.executesCondition {@code (node instanceof Element): False}
 *  */
    @Test
    public void testGetRelativePositionByQName_NotNodeNotInstanceOfElement() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Object object = new Object();
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(object, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): True}
 *  */
    @Test
    public void testGetRelativePositionByQName_NotParentInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): False}
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_ParentNotInstanceOfElement() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Object content = createInstance("org.jdom.ContentList");
        setField(element, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.executesCondition {@code (node instanceof Element): True}
 * @utbot.executesCondition {@code (!(parent instanceof Element)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.returnsFrom {@code return count;}
 *  */
    @Test
    public void testGetRelativePositionByQName_ChildNotEqualsNode() throws Exception  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {null};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments));
        
        assertEquals(0, actual);
        
        Object jDOMNodePointerNode = getFieldValue(jDOMNodePointer, "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer", "node");
        Parent jDOMNodePointerNodeNodeParent = ((Parent) getFieldValue(jDOMNodePointerNode, "org.jdom.Content", "parent"));
        Object jDOMNodePointerNodeNodeParentNodeParentContent = getFieldValue(jDOMNodePointerNodeNodeParent, "org.jdom.Element", "content");
        org.jdom.Content[] jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData = ((org.jdom.Content[]) getFieldValue(jDOMNodePointerNodeNodeParentNodeParentContent, "org.jdom.ContentList", "elementData"));
        Content finalJDOMNodePointerNodeParentContentElementData0 = ((Content) get(jDOMNodePointerNodeNodeParentNodeParentContentNodeParentContentElementData, 0));
        
        assertNull(finalJDOMNodePointerNodeParentContentElementData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRelativePositionByQName()
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < children.size(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object child = children.get(i);
 *  */
    @Test
    public void testGetRelativePositionByQName_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        Element parent = ((Element) createInstance("org.jdom.Element"));
        Object content = createInstance("org.jdom.ContentList");
        org.jdom.Content[] elementData = {};
        setField(content, "org.jdom.ContentList", "elementData", elementData);
        setField(content, "org.jdom.ContentList", "size", 1);
        setField(parent, "org.jdom.Element", "content", content);
        setField(element, "org.jdom.Content", "parent", parent);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jdom.ContentList.get(ContentList.java:389)
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName(JDOMNodePointer.java:695) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JDOMNodePointer}
 * @utbot.methodUnderTest {@link org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer#getRelativePositionByQName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < children.size(); i++)
 *  */
    @Test
    public void testGetRelativePositionByQName_ThrowNullPointerException() throws Throwable  {
        Element element = ((Element) createInstance("org.jdom.Element"));
        Namespace namespace = ((Namespace) createInstance("org.jdom.Namespace"));
        String prefix = "";
        setField(namespace, "org.jdom.Namespace", "prefix", prefix);
        setField(element, "org.jdom.Element", "namespace", namespace);
        setField(element, "org.jdom.Content", "parent", element);
        JDOMNodePointer jDOMNodePointer = new JDOMNodePointer(element, null, null);
        
        /* This test fails because method [org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName] produces [java.lang.NullPointerException]
            org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getRelativePositionByQName(JDOMNodePointer.java:694) */
        Class jDOMNodePointerClazz = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Method getRelativePositionByQNameMethod = jDOMNodePointerClazz.getDeclaredMethod("getRelativePositionByQName");
        getRelativePositionByQNameMethod.setAccessible(true);
        java.lang.Object[] getRelativePositionByQNameMethodArguments = new java.lang.Object[0];
        try {
            getRelativePositionByQNameMethod.invoke(jDOMNodePointer, getRelativePositionByQNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1047949346207500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1047949346207500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1047949346218500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047949346207500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047949346218500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047949346767100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047949346767100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047949346771600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047949346767100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047949346771600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1047949347232200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1047949347232200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1047949347235800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1047949347232200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1047949347235800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

